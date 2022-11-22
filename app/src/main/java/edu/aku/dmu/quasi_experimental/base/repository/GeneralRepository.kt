package edu.aku.dmu.quasi_experimental.base.repository

import edu.aku.dmu.quasi_experimental.database.DatabaseHelper
import edu.aku.dmu.quasi_experimental.models.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

open class GeneralRepository(private val db: DatabaseHelper) : GeneralDataSource {

    override suspend fun getCampsFromDB(campNo: String, distCode: String): Camps =
        withContext(Dispatchers.IO) {
            db.getSpecificCamp(campNo, distCode)
        }

    override suspend fun getUcsByDistrictsFromDB(dCode: String): ArrayList<UCs> =
        withContext(Dispatchers.IO) {
            db.getUCsByDistricts(dCode)
        }

    override suspend fun getFacilitiesByUCFromDB(ucCode: String): ArrayList<HealthFacilities> =
        withContext(Dispatchers.IO) {
            db.getAllFacilitiesByUC(ucCode)
        }

    override suspend fun getFacilitiesFromDB(): ArrayList<HealthFacilities> =
        withContext(Dispatchers.IO) {
            db.allFacilities
        }


    override suspend fun getFormByDistrictsFromDB(
        distCode: String,
        cluster: String,
        hhno: String
    ): Form = withContext(Dispatchers.IO) {
        db.getFormByClusterHH(distCode, cluster, hhno)
    }

    override suspend fun getLoginInformation(username: String, password: String): Users? =
        withContext(Dispatchers.IO) {
            db.getLoginUser(username, password)
        }

    override suspend fun getFormsByDate(date: String): Flow<ArrayList<Form>> {
        return flow {
            val item = db.getFormsByDate(date)
            emit(item)
        }
    }

    override suspend fun getUploadStatus(): Flow<FormIndicatorsModel> {
        return flow {
            emit(db.uploadStatusCount)
        }
    }

    override suspend fun getFormStatus(date: String): Flow<FormIndicatorsModel> {
        return flow {
            emit(db.getFormStatusCount(date))
        }
    }
}