package edu.aku.dmu.quasi_experimental.models

import android.database.Cursor
import android.os.Parcel
import android.os.Parcelable
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class Camps() : Parcelable {
    var idCamp: String = StringUtils.EMPTY
    var facilityName: String = StringUtils.EMPTY
    var dist_id: String = StringUtils.EMPTY
    var facilityCode: String = StringUtils.EMPTY
    var ucCode: String = StringUtils.EMPTY
    var ucName: String = StringUtils.EMPTY
    var area_name: String = StringUtils.EMPTY
    var plan_date: String = StringUtils.EMPTY

    constructor(parcel: Parcel) : this() {
        idCamp = parcel.readString().toString()
        facilityName = parcel.readString().toString()
        dist_id = parcel.readString().toString()
        facilityCode = parcel.readString().toString()
        ucCode = parcel.readString().toString()
        ucName = parcel.readString().toString()
        area_name = parcel.readString().toString()
        plan_date = parcel.readString().toString()
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Camps {
        idCamp = jsonObject.getString(TableCamp.COLUMN_ID_CAMP)
        facilityName = jsonObject.getString(TableCamp.COLUMN_FACILITY_NAME)
        dist_id = jsonObject.getString(TableCamp.COLUMN_DIST_ID)
        facilityCode = jsonObject.getString(TableCamp.COLUMN_FACILITY_CODE)
        ucCode = jsonObject.getString(TableCamp.COLUMN_UC_CODE)
        ucName = jsonObject.getString(TableCamp.COLUMN_UC_NAME)
        area_name = jsonObject.getString(TableCamp.COLUMN_AREA_NAME)
        plan_date = jsonObject.getString(TableCamp.COLUMN_PLAN_DATE)
        return this
    }

    fun hydrate(cursor: Cursor): Camps {
        idCamp = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_ID_CAMP))
        facilityName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_FACILITY_NAME))
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_DIST_ID))
        facilityCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_FACILITY_CODE))
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_UC_CODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_UC_NAME))
        area_name = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_AREA_NAME))
        plan_date = cursor.getString(cursor.getColumnIndexOrThrow(TableCamp.COLUMN_PLAN_DATE))
        return this
    }

    object TableCamp : BaseColumns {
        const val TABLE_NAME = "Camps"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_ID_CAMP = "idCamp"
        const val COLUMN_FACILITY_NAME = "facilityName"
        const val COLUMN_DIST_ID = "dist_id"
        const val COLUMN_FACILITY_CODE = "facilityCode"
        const val COLUMN_UC_CODE = "ucCode"
        const val COLUMN_UC_NAME = "ucName"
        const val COLUMN_AREA_NAME = "area_name"
        const val COLUMN_PLAN_DATE = "plan_date"
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idCamp)
        parcel.writeString(facilityName)
        parcel.writeString(dist_id)
        parcel.writeString(facilityCode)
        parcel.writeString(ucCode)
        parcel.writeString(ucName)
        parcel.writeString(area_name)
        parcel.writeString(plan_date)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Camps> {
        override fun createFromParcel(parcel: Parcel): Camps {
            return Camps(parcel)
        }

        override fun newArray(size: Int): Array<Camps?> {
            return arrayOfNulls(size)
        }
    }
}