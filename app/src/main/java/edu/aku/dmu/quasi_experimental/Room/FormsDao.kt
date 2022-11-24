package edu.aku.dmu.quasi_experimental.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import edu.aku.dmu.quasi_experimental.models.Child
import edu.aku.dmu.quasi_experimental.models.Form
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