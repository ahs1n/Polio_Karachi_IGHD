package edu.aku.dmu.quasi_experimental.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import com.validatorcrawler.aliazaz.Validator
import edu.aku.dmu.quasi_experimental.R
import edu.aku.dmu.quasi_experimental.base.repository.GeneralRepository
import edu.aku.dmu.quasi_experimental.base.repository.ResponseStatus
import edu.aku.dmu.quasi_experimental.base.viewmodel.MainViewModel
import edu.aku.dmu.quasi_experimental.core.MainApp
import edu.aku.dmu.quasi_experimental.database.AndroidManager
import edu.aku.dmu.quasi_experimental.database.DatabaseHelper
import edu.aku.dmu.quasi_experimental.databinding.ActivityMainBinding
import edu.aku.dmu.quasi_experimental.models.Camps
import edu.aku.dmu.quasi_experimental.models.HealthFacilities
import edu.aku.dmu.quasi_experimental.models.PatientDetails
import edu.aku.dmu.quasi_experimental.models.Vaccination
import edu.aku.dmu.quasi_experimental.ui.list_activity.FormsReportCluster
import edu.aku.dmu.quasi_experimental.ui.list_activity.FormsReportDate
import edu.aku.dmu.quasi_experimental.ui.sections.SectionScreeningActivity
import edu.aku.dmu.quasi_experimental.utils.extension.gotoActivity
import edu.aku.dmu.quasi_experimental.utils.extension.gotoActivityWithNoHistory
import edu.aku.dmu.quasi_experimental.utils.extension.obtainViewModel
import edu.aku.dmu.quasi_experimental.utils.isNetworkConnected
import edu.aku.dmu.quasi_experimental.utils.shared.SharedStorage
import kotlinx.android.synthetic.main.statistic_layout.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var bi: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    private var exit = false
    private var sysdateToday = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(Date())
    private lateinit var camp: Camps
    private lateinit var facility: HealthFacilities
    private var facilityNames = mutableListOf("....")
    private var facilityCodes = mutableListOf("....")
    private var ucNames = mutableListOf("....")
    private var ucCodes = mutableListOf("....")
    private lateinit var facilityAdapter: ArrayAdapter<String>
    lateinit var db: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bi = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bi.callback = this
        setSupportActionBar(bi.toolbar)
        if (MainApp.admin) bi.adminSection.visibility = View.VISIBLE
        viewModel =
            obtainViewModel(MainViewModel::class.java, GeneralRepository(DatabaseHelper(this)))

        db = MainApp.appInfo.dbHelper

        /*
        * Setting Adapters
        * */
        facilityAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, facilityNames)
        bi.facility.adapter = facilityAdapter
        bi.facility.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View,
                position: Int,
                id: Long
            ) {
                bi.cam.campno.text = null
                bi.cam.uc2.text = null
                bi.cam.uc4.text = null
                bi.cam.area2.text = null
                bi.btnSection.visibility = View.GONE
                bi.cam.root.visibility = View.GONE
                if (position == 0) return
                bi.btnSection.visibility = View.VISIBLE
                bi.cam.root.visibility = View.VISIBLE
                bi.cam.campno.text = facilityNames[position]
                bi.cam.uc2.text = ucNames[position]
                bi.cam.uc4.text = ucCodes[position]
                bi.cam.area2.text = facilityCodes[position]
                facilityAdapter.notifyDataSetChanged()

                populateCampDetails()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        /*
        * Calling viewmodel facility data function
        * Fetch facility result response
        * */

        viewModel.healthFacilitiesResponse.observe(this) {
            it?.let {
                when (it.status) {
                    ResponseStatus.SUCCESS -> {
                        lifecycleScope.launch {
                            facilityNames.clear()
                            facilityCodes.clear()
                            ucNames.clear()
                            ucCodes.clear()
                            facilityNames.add("....")
                            facilityCodes.add("....")
                            ucNames.add("....")
                            ucCodes.add("....")
                            it.data?.forEach { item ->
                                facilityNames.add(item.facilityName)
                                facilityCodes.add(item.facilityCode)
                                ucNames.add(item.ucName)
                                ucCodes.add(item.ucCode)

                                facility = item
                                bi.cam.campno.text = facility.facilityName
                                bi.cam.uc2.text = facility.ucName
                                bi.cam.uc4.text = facility.ucCode
                                bi.cam.area2.text = facility.facilityCode
                            }
                            facilityAdapter.notifyDataSetChanged()
                        }
                    }
                    ResponseStatus.ERROR -> {
                    }
                    ResponseStatus.LOADING -> {
                    }

                }
            }
        }


        /*
        * Calling viewmodel district data function
        * Fetch district result response
        * */
        viewModel.campsResponse.observe(this) {
            it?.let {
                when (it.status) {
                    ResponseStatus.SUCCESS -> {
                        lifecycleScope.launch {
                            it.data?.let { item ->
                                bi.btnSection.visibility = View.VISIBLE
                                bi.cam.root.visibility = View.VISIBLE
                                camp = item

                                //TODO: CardToPopulate
                                //openWarningDialog(item.camp_no, item.district, item.ucName)
                                bi.cam.campno.text = camp.facilityName
                                bi.cam.uc2.text = camp.ucName
                                bi.cam.area2.text = camp.area_name
                            }
                            bi.btnCheckCamp.visibility = View.VISIBLE
                            bi.btnSearchCampProgress.visibility = View.GONE
                        }
                    }
                    ResponseStatus.ERROR -> {
                        bi.btnCheckCamp.visibility = View.VISIBLE
                        bi.btnSearchCampProgress.visibility = View.GONE
                        Validator.emptyCustomTextBox(this, bi.camps, "CAMP NOT FOUND", false)
                    }
                    ResponseStatus.LOADING -> {
                        lifecycleScope.launch {
                            bi.btnSearchCampProgress.visibility = View.VISIBLE
                            bi.btnCheckCamp.visibility = View.GONE
                            bi.btnSection.visibility = View.GONE
                            bi.cam.root.visibility = View.GONE
                            delay(2000)
                        }
                    }
                }
            }
        }

        viewModel.getFacilitiesByUCFromDB(MainApp.user.ucCode)

        /*
        * Get Today's form from DB
        * If it's null then return 0 otherwise return count
        * Show loading while data is fetching
        * */
        viewModel.todayForms.observe(this) {
            when (it.status) {
                ResponseStatus.SUCCESS -> {
                    Log.d("Today's form count:", it.data.toString())
                    bi.statisticLayout.tf.text = it.data.toString()
                }
                ResponseStatus.ERROR -> {
                }
                ResponseStatus.LOADING -> {
                    lifecycleScope.launch { delay(1000) }
                }
            }
        }

//        /*
//        * Get Form status from DB
//        * If it's null then return 0 otherwise return count
//        * Show loading while data is fetching
//        * */
//        viewModel.formsStatus.observe(this) {
//            when (it.status) {
//                ResponseStatus.SUCCESS -> {
//                    it.data?.let { item ->
//                        Log.d("Complete count:", item.closedForms.toString())
//                        Log.d("In-complete count:", item.openedForms.toString())
//                        bi.statisticLayout.cf.text = String.format("%02d", item.closedForms)
//                        bi.statisticLayout.icf.text = String.format("%02d", item.openedForms)
//                    }
//
//                }
//                ResponseStatus.ERROR -> {
//                    animateFadeOut()
//                    Log.d("Status", "error")
//                }
//                ResponseStatus.LOADING -> {
//                    lifecycleScope.launch { delay(1000) }
//                }
//            }
//        }

//        /*
//        * Get Upload & Download status of form from DB
//        * If it's null then return 0 otherwise return count
//        * Show loading while data is fetching
//        * */
//        viewModel.uploadForms.observe(this) {
//            when (it.status) {
//                ResponseStatus.SUCCESS -> {
//                    it.data?.let { item ->
//                        Log.d("Synced count:", item.closedForms.toString())
//                        Log.d("Un-Synced count:", item.openedForms.toString())
//                        bi.statisticLayout.sf.text = item.closedForms.toString()
//                        bi.statisticLayout.usf.text = item.openedForms.toString()
//                    }
//                    animateFadeOut()
//                }
//                ResponseStatus.ERROR -> {
//                    animateFadeOut()
//                    Log.d("Sync", "error")
//                }
//                ResponseStatus.LOADING -> {
//                    lifecycleScope.launch { delay(2000) }
//                }
//            }
//        }

        bi.camps.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                if (s.toString().isEmpty()) return
                bi.cam.root.visibility = View.GONE
                bi.btnSection.visibility = View.GONE
            }
        })

        bi.camps.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                populateCampDetails()
            }
            true
        }

    }

    private fun initSummary() {
        // Get All Patient Details
        val todayForms: ArrayList<PatientDetails> =
            db.getTodayForms(sysdateToday) as ArrayList<PatientDetails>
        if (todayForms.isNotEmpty()) {
            val totalTodayForms: Int = todayForms.count()
            val _unSyncedForms: ArrayList<PatientDetails> = ArrayList()
            val _syncedForms: ArrayList<PatientDetails> = ArrayList()
            todayForms.forEach {
                if (it.synced.isEmpty())
                    _unSyncedForms.add(it)
                else
                    _syncedForms.add(it)
            }
            bi.statisticLayout.tf.text = totalTodayForms.toString()
            tfUnSynced.text = _unSyncedForms.count().toString()
            tfSynced.text = _syncedForms.count().toString()
        }

        // Get All Vaccination
        val todayVacc: ArrayList<Vaccination> =
            db.getTodayVacc(sysdateToday) as ArrayList<Vaccination>
        if (todayVacc.isNotEmpty()) {
            val totalTodayVacc: Int = todayVacc.count()
            val _unSyncedVacc: ArrayList<Vaccination> = ArrayList()
            val _syncedVacc: ArrayList<Vaccination> = ArrayList()
            todayVacc.forEach {
                if (it.synced.isEmpty())
                    _unSyncedVacc.add(it)
                else
                    _syncedVacc.add(it)
            }
            bi.statisticLayout.tv.text = totalTodayVacc.toString()
            tvUnSynced.text = _unSyncedVacc.count().toString()
            tvSynced.text = _syncedVacc.count().toString()
        }

        // Get Total Forms
        val totalFormsList: ArrayList<PatientDetails> =
            db.getTodayForms(null) as ArrayList<PatientDetails>
        if (totalFormsList.isNotEmpty()) {
            val totalForms: Int = totalFormsList.count()
            val _unSyncedTotal: ArrayList<PatientDetails> = ArrayList()
            val _syncedTotal: ArrayList<PatientDetails> = ArrayList()
            totalFormsList.forEach {
                if (it.synced.isEmpty())
                    _unSyncedTotal.add(it)
                else
                    _syncedTotal.add(it)
            }
            bi.statisticLayout.totalF.text = totalForms.toString()
            totalFUnSynced.text = _unSyncedTotal.count().toString()
            totalFSynced.text = _syncedTotal.count().toString()
        }
    }

    /*
    * Back press button that will route to login activity after pressing -
    * back button two times
    * */
    override fun onBackPressed() {
        if (exit) {
            gotoActivityWithNoHistory(LoginActivity::class.java)
        } else {
            Toast.makeText(
                this, "Press back again to exit",
                Toast.LENGTH_SHORT
            ).show()
            exit = true
            Handler(Looper.getMainLooper()).postDelayed({ exit = false }, 3000)
        }
    }

    /*
    * Inflate menu on current activity
    * */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        val action_database = menu.findItem(R.id.action_database)
        action_database.isVisible = MainApp.admin

        return true
    }

    /*
    * Menu items selection
    * */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_data_sync -> {
                if (isNetworkConnected(this)) {
                    gotoActivity(SyncActivity::class.java)

                } else
                    Toast.makeText(
                        this,
                        "Network connection not available!",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                return true
            }
            R.id.changePassword -> {
                gotoActivity(ChangePasswordActivity::class.java)
                return true
            }
            R.id.formsReportDate -> {
                gotoActivity(FormsReportDate::class.java)
                return true
            }

            R.id.formsReportCluster -> {
                gotoActivity(FormsReportCluster::class.java)
                return true
            }
            R.id.action_database -> {
                gotoActivity(AndroidManager::class.java)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onResume() {
        super.onResume()

//        animateFadeIn()
        viewModel.getFacilitiesByUCFromDB(MainApp.user.ucCode)
        viewModel.getFormsStatusUploadStatus(sysdateToday)
        initSummary()
    }


    /*
    * Route to specific activity according to selection
    * For uploading/downloading data, the network needs to work
    * */
    fun openSpecificActivity(v: View) {
        when (v.id) {
            R.id.formA -> {
                SharedStorage.setSelectedFacilityData(this, Gson().toJson(facility))
                MainApp.patientDetails = PatientDetails()
                gotoActivity(SectionScreeningActivity::class.java)
//                MainApp.prescription = Prescription()
//                gotoActivity(SectionPrescriptionActivity::class.java)
            }
            R.id.databaseBtn -> startActivity(Intent(this, AndroidManager::class.java))
            R.id.btn_check_camp -> {
                populateCampDetails()
            }
        }
    }


    fun populateCampDetails() {
//        if (!Validator.emptyTextBox(this, bi.camps)) return
//        viewModel.getCampFromDB(bi.camps.text.toString(), MainApp.user.dist_id)
        if (!Validator.emptySpinner(this, bi.facility)) return
        viewModel.getFacilitiesByUCFromDB(MainApp.user.ucCode)
    }

    /*
//    * Stop animation on statistic Layout
//    * */
//    private fun animateFadeOut() {
//        val shortAnimationDuration = 2000
//        /*
//        * Animate the content view to 100% opacity, and clear any animation
//        * listener set on the view.
//        * */
//        bi.statisticLayout.syncLinearLayout.animate()
//            .alpha(1f)
//            .setDuration(shortAnimationDuration.toLong())
//            .setListener(null)
//        bi.statisticLayout.statusLinearLayout.animate()
//            .alpha(1f)
//            .setDuration(shortAnimationDuration.toLong())
//            .setListener(null)
//
//        /*
//        * Animate the loading view to 0% opacity. After the animation ends,
//        * set its visibility to GONE as an optimization step (it won't participate
//        * in layout passes, etc.)
//        * */
//        bi.statisticLayout.loading.animate()
//            .alpha(0f)
//            .setDuration(shortAnimationDuration.toLong())
//            .setListener(object : AnimatorListenerAdapter() {
//                override fun onAnimationEnd(animation: Animator) {
//                    bi.statisticLayout.loading.visibility = View.GONE
//                }
//            })
//    }

//    /*
//    * Start animation on statistic Layout
//    * */
//    private fun animateFadeIn() {
//        bi.statisticLayout.syncLinearLayout.alpha = 0f
//        bi.statisticLayout.statusLinearLayout.alpha = 0f
//        bi.statisticLayout.loading.alpha = 1f
//        bi.statisticLayout.loading.visibility = View.VISIBLE
//    }


}