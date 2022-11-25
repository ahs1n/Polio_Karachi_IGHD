package edu.aku.dmu.polio_karachi_ighd.models

import android.database.Cursor
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts
import edu.aku.dmu.polio_karachi_ighd.core.MainApp._EMPTY_
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.binary.StringUtils
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts.UsersTable
import edu.aku.dmu.polio_karachi_ighd.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
@Entity(tableName = UsersTable.TABLE_NAME)
class Users {
    @ColumnInfo(
        name = UsersTable.COLUMN_ISNEW_USER,
        defaultValue = _EMPTY_
    )
    var newUser: String = _EMPTY_
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(
        name = UsersTable.COLUMN_ID,
        defaultValue = "0"
    )
    var userID: Long = 0
    @ColumnInfo(
        name = UsersTable.COLUMN_USERNAME,
        defaultValue = _EMPTY_
    )
    var userName: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_PASSWORD,
        defaultValue = _EMPTY_
    )
    var password: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_FULLNAME,
        defaultValue = _EMPTY_
    )
    var fullname: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_DESIGNATION,
        defaultValue = _EMPTY_
    )
    var designation: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_ENABLED,
        defaultValue = _EMPTY_
    )
    var enabled: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_PWD_EXPIRY,
        defaultValue = _EMPTY_
    )
    var pwdExpiry: String = _EMPTY_
    @ColumnInfo(
        name = UsersTable.COLUMN_DIST_ID,
        defaultValue = _EMPTY_
    )
    var dist_id: String = _EMPTY_

    constructor() {
        // Default Constructor
    }

    constructor(username: String, fullname: String) {
        userName = username
        this.fullname = fullname
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Users {
        userName = jsonObject.getString(UsersTable.COLUMN_USERNAME)
        password = jsonObject.getString(UsersTable.COLUMN_PASSWORD)
        fullname = jsonObject.getString(UsersTable.COLUMN_FULLNAME)
        designation = jsonObject.getString(UsersTable.COLUMN_DESIGNATION)
        newUser = jsonObject.getString(UsersTable.COLUMN_ISNEW_USER)
        pwdExpiry = jsonObject.getString(UsersTable.COLUMN_PWD_EXPIRY)
        enabled = jsonObject.getString(UsersTable.COLUMN_ENABLED)
        dist_id = jsonObject.getString(UsersTable.COLUMN_DIST_ID)
        return this
    }

    fun hydrate(cursor: Cursor): Users {
        userID = cursor.getLong(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ID))
        userName = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_USERNAME))
        password = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_PASSWORD))
        fullname = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_FULLNAME))
        designation = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_DESIGNATION))
        enabled = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ENABLED))
        pwdExpiry = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_PWD_EXPIRY))
        newUser = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ISNEW_USER))
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_DIST_ID))
        return this
    }


}