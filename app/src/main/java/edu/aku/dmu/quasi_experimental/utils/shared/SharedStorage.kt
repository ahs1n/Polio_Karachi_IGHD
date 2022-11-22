package edu.aku.dmu.quasi_experimental.utils.shared

import android.content.Context
import edu.aku.dmu.quasi_experimental.CONSTANTS.Companion.SELECTED_FACILITY_DATA
import org.apache.commons.lang3.StringUtils

/*
* @author Ali.Azaz
* updated muhammad.hussain
* */
object SharedStorage : SharedStorageBase() {

    fun setSelectedFacilityData(context: Context, refID: String) {
        put(context, SELECTED_FACILITY_DATA, refID)
    }

    fun getSelectedFacilityData(context: Context): String {
        return get(context, SELECTED_FACILITY_DATA, StringUtils.EMPTY) as String
    }

}