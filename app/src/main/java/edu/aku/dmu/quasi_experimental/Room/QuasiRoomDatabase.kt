package edu.aku.dmu.quasi_experimental.Room

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import edu.aku.dmu.quasi_experimental.Room.QuasiRoomDatabase.Companion.DATABASE_VERSION
import edu.aku.dmu.quasi_experimental.Room.QuasiRoomDatabase.Companion.dbInstance
import edu.aku.dmu.quasi_experimental.core.MainApp
import edu.aku.dmu.quasi_experimental.models.Form
import net.sqlcipher.database.SQLiteDatabase.getBytes
import net.sqlcipher.database.SupportFactory
import org.apache.commons.lang3.StringUtils.getBytes

//
// Created by gul.sanober on 11/23/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Database(
        version = QuasiRoomDatabase.DATABASE_VERSION,
        entities = [
            // add your models here to create tables in db
            // Mwra :: class,
        ]
)



abstract class QuasiRoomDatabase : RoomDatabase() {

    // Add Dao class here
    abstract fun formsDao(): FormsDao


    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = MainApp.PROJECT_NAME + ".db"

        @Volatile
        @JvmStatic
        var dbInstance: QuasiRoomDatabase? = null

        @JvmStatic
        fun init(context: Context, password: String): QuasiRoomDatabase {
            if (dbInstance != null)
                return dbInstance!!

            synchronized(this) {
                val passphrase: ByteArray = SQLiteDatabase.getBytes(password.toCharArray())
                val factory = SupportFactory(passphrase)

                dbInstance = Room.databaseBuilder(context, QuasiRoomDatabase::class.java, DATABASE_NAME)
                        .openHelperFactory(factory)
                        .addMigrations()        // call migration inside addMigrations function in case of any change in DB.
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
                return dbInstance!!
            }
        }

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Since we didn’t alter the table, there’s nothing else
                // to do here.
            }
        }
    }
}