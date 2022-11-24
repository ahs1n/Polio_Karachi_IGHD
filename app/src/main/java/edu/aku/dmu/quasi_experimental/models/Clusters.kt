package edu.aku.dmu.quasi_experimental.models

import android.database.Cursor
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.aku.dmu.quasi_experimental.contracts.TableContracts
import edu.aku.dmu.quasi_experimental.contracts.TableContracts.ClusterTable
import edu.aku.dmu.quasi_experimental.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

@Entity(tableName = ClusterTable.TABLE_NAME)
class Clusters {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(
        name = ClusterTable.COLUMN_ID,
        defaultValue = "0"
    )
    var ID: Long = 0
    @ColumnInfo(
        name = ClusterTable.COLUMN_GEOAREA,
        defaultValue = _EMPTY_
    )
    var geoarea: String = _EMPTY_
    @ColumnInfo(
        name = ClusterTable.COLUMN_DIST_ID,
        defaultValue = _EMPTY_
    )
    var distId: String = _EMPTY_
    @ColumnInfo(
        name = ClusterTable.COLUMN_EB_CODE,
        defaultValue = _EMPTY_
    )
    var ebcode: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        geoarea = jsonObject.getString(ClusterTable.COLUMN_GEOAREA)
        distId = jsonObject.getString(ClusterTable.COLUMN_DIST_ID)
        ebcode = jsonObject.getString(ClusterTable.COLUMN_EB_CODE)


        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_ID))

        geoarea = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_GEOAREA))
        distId = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_DIST_ID))
        ebcode = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_EB_CODE))


        return this
    }


}