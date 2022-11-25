package edu.aku.dmu.polio_karachi_ighd.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import edu.aku.dmu.polio_karachi_ighd.models.Child
import org.json.JSONException

@Dao
interface ChildDao {
    @kotlin.jvm.Throws(JSONException::class)
    @Insert
    fun addChild(child: Child): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateChild(child: Child): Int

}