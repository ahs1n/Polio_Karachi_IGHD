package edu.aku.dmu.quasi_experimental.database

import edu.aku.dmu.quasi_experimental.contracts.TableContract
import edu.aku.dmu.quasi_experimental.contracts.TableContract.EntryLogTable
import edu.aku.dmu.quasi_experimental.core.MainApp.PROJECT_NAME
import edu.aku.dmu.quasi_experimental.models.*

object CreateTable {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"

    const val SQL_CREATE_PATIENT_DETAILS = ("CREATE TABLE "
            + TableContract.PDTable.TABLE_NAME + "("
            + TableContract.PDTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContract.PDTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContract.PDTable.COLUMN_UID + " TEXT,"
            + TableContract.PDTable.COLUMN_USERNAME + " TEXT,"
            + TableContract.PDTable.COLUMN_FACILITY + " TEXT,"
            + TableContract.PDTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContract.PDTable.COLUMN_SYSDATE + " TEXT,"
            + TableContract.PDTable.COLUMN_ISTATUS + " TEXT,"
            + TableContract.PDTable.COLUMN_ISTATUS96x + " TEXT,"
            + TableContract.PDTable.COLUMN_DEVICEID + " TEXT,"
            + TableContract.PDTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContract.PDTable.COLUMN_SYNCED + " TEXT,"
            + TableContract.PDTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContract.PDTable.COLUMN_APPVERSION + " TEXT,"
            + TableContract.PDTable.COLUMN_SPD + " TEXT,"
            + TableContract.PDTable.COLUMN_SHIS + " TEXT,"
            + TableContract.PDTable.COLUMN_SEXM + " TEXT"
            + " );")

    const val SQL_CREATE_VACCINATION = ("CREATE TABLE "
            + TableContract.VACCINATIONTable.TABLE_NAME + "("
            + TableContract.VACCINATIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContract.VACCINATIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_UID + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_UUID + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_PRNO + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_USERNAME + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_FACILITY + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_VDATE + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_SYSDATE + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_DEVICEID + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_SYNCED + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_APPVERSION + " TEXT,"
            + TableContract.VACCINATIONTable.COLUMN_SVAC + " TEXT"
            + " );")

    const val SQL_CREATE_DIAGNOSIS = ("CREATE TABLE "
            + TableContract.DIAGNOSISTable.TABLE_NAME + "("
            + TableContract.DIAGNOSISTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContract.DIAGNOSISTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_UID + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_UUID + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_PRNO + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_USERNAME + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_FACILITY + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_VDATE + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_SYSDATE + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_DEVICEID + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_SYNCED + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_APPVERSION + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_SDIAG + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_DIAG_CODE + " TEXT,"
            + TableContract.DIAGNOSISTable.COLUMN_DIAG_OTHER + " TEXT"
            + " );")

    const val SQL_CREATE_COMPLAINTS = ("CREATE TABLE "
            + TableContract.COMPLAINTSTable.TABLE_NAME + "("
            + TableContract.COMPLAINTSTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContract.COMPLAINTSTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_UID + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_UUID + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_PRNO + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_USERNAME + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_FACILITY + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_VDATE + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_SYSDATE + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_DEVICEID + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_SYNCED + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_APPVERSION + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_SCOMP + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_COMP_CODE + " TEXT,"
            + TableContract.COMPLAINTSTable.COLUMN_COMP_OTHER + " TEXT"
            + " );")

    const val SQL_CREATE_PRESCRIPTION = ("CREATE TABLE "
            + TableContract.PRESCRIPTIONTable.TABLE_NAME + "("
            + TableContract.PRESCRIPTIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_UID + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_UUID + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_PRNO + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_USERNAME + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_FACILITY + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_VDATE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_SYSDATE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_DEVICEID + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_SYNCED + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_APPVERSION + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_MED_CODE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_DOSE + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_FREQUENCY + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_DURATION + " TEXT,"
            + TableContract.PRESCRIPTIONTable.COLUMN_PRES + " TEXT"
            + " );")

    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT,"
            + Users.UsersTable.COLUMN_ENABLED + " TEXT,"
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + Users.UsersTable.COLUMN_UC_CODE + " TEXT,"
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + Users.UsersTable.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_ALTER_USERS_ENABLED = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ENABLED + " TEXT"
            + " ;"
            )

    const val SQL_ALTER_USERS_ISNEW_USER = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT"
            + " ;"
            )
    const val SQL_ALTER_USERS_PWD_EXPIRY = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT"
            + " ;"
            )

    const val SQL_CREATE_FACILITIES =
        ("CREATE TABLE " + HealthFacilities.TableHealthFacilities.TABLE_NAME + "("
                + HealthFacilities.TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_CODE + " TEXT"
                + " );")

    const val SQL_CREATE_UCS = ("CREATE TABLE " + UCs.TableUCs.TABLE_NAME + "("
            + UCs.TableUCs.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCs.TableUCs.COLUMN_UC_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_UC_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_VERSIONAPP =
        "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
                VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
                ");"

    const val SQL_CREATE_DOCTOR = ("CREATE TABLE " + Doctor.TableDoctor.TABLE_NAME + "("
            + Doctor.TableDoctor.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Doctor.TableDoctor.COLUMN_UC_CODE + " TEXT,"
            + Doctor.TableDoctor.COLUMN_ID_DOCTOR + " TEXT,"
            + Doctor.TableDoctor.COLUMN_STAFF_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )
}