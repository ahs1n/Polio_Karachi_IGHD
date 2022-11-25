package edu.aku.dmu.polio_karachi_ighd.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import edu.aku.dmu.polio_karachi_ighd.models.Form
import org.json.JSONException

//
// Created by gul.sanober on 11/23/2022.
// Copyright (c) 2022 COE. All rights reserved.
//

@Dao
interface FormsDao {

    @Throws(JSONException::class)
    @Insert
    fun addForm(forms: Form)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateForm(forms: Form): Int
}