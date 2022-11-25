package edu.aku.dmu.polio_karachi_ighd.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts
import edu.aku.dmu.polio_karachi_ighd.models.Clusters
import org.json.JSONArray
import org.json.JSONException

@Dao
interface ClustersDao {
    @Throws(JSONException::class)
    fun syncClusters(clustersList: JSONArray): Int {
        var insertCount = 0
        deleteClustersTable()
        for (i in 0 until clustersList.length()) {
            val jsonObjectUser = clustersList.optJSONObject(i)
            val cluster = Clusters()
            cluster.sync(jsonObjectUser)

            val rowId = insertCluster(cluster)
            if (rowId != -1L)
                insertCount++
        }
        return insertCount
    }

    @Insert
    fun insertCluster(cluster: Clusters): Long

    @Query("DELETE FROM " + TableContracts.ClusterTable.TABLE_NAME)
    fun deleteClustersTable()
}
