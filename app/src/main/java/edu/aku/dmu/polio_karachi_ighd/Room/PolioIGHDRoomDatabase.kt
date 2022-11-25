package edu.aku.dmu.polio_karachi_ighd.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import edu.aku.dmu.polio_karachi_ighd.core.MainApp
import edu.aku.dmu.polio_karachi_ighd.models.Child
import edu.aku.dmu.polio_karachi_ighd.models.Clusters
import edu.aku.dmu.polio_karachi_ighd.models.Form
import edu.aku.dmu.polio_karachi_ighd.models.Users
import net.sqlcipher.database.SQLiteDatabase.getBytes
import net.sqlcipher.database.SupportFactory


//
// Created by gul.sanober on 11/23/2022.
// Copyright (c) 2022 COE. All rights reserved.
//
@Database(
    version = PolioIGHDRoomDatabase.DATABASE_VERSION,
    entities = [
        // add your models here to create tables in db
        Form::class,
        Users::class,
        Child::class,
        Clusters::class
    ]
)


abstract class PolioIGHDRoomDatabase : RoomDatabase() {

    // Add Dao class here
    abstract fun formsDao(): FormsDao
    abstract fun usersDao(): UsersDao
    abstract fun childDao(): ChildDao
    abstract fun clustersDao(): ClustersDao


    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = MainApp.PROJECT_NAME + ".1db"

        @Volatile
        @JvmStatic
        var dbInstance: PolioIGHDRoomDatabase? = null

        @JvmStatic
        fun init(context: Context, password: String): PolioIGHDRoomDatabase {
            if (dbInstance != null)
                return dbInstance!!

            synchronized(this) {
                val passphrase: ByteArray = getBytes(password.toCharArray())
                val factory = SupportFactory(passphrase)

                dbInstance =
                    Room.databaseBuilder(context, PolioIGHDRoomDatabase::class.java, DATABASE_NAME)
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