package edu.aku.dmu.quasi_experimental.database

import edu.aku.dmu.quasi_experimental.contracts.TableContracts
import edu.aku.dmu.quasi_experimental.contracts.TableContracts.ClusterTable
import edu.aku.dmu.quasi_experimental.contracts.TableContracts.EntryLogTable
import edu.aku.dmu.quasi_experimental.contracts.TableContracts.RandomHHTable
import edu.aku.dmu.quasi_experimental.core.MainApp.PROJECT_NAME
import edu.aku.dmu.quasi_experimental.models.*

object CreateTable {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_EB_CODE + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_GPSLAT + " TEXT,"
            + FormsTable.COLUMN_GPSLNG + " TEXT,"
            + FormsTable.COLUMN_GPSDATE + " TEXT,"
            + FormsTable.COLUMN_GPSACC + " TEXT,"
/*
            + FormsTable.COLUMN_ENTRY_TYPE + " TEXT,"
*/
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNC_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SHH + " TEXT,"
            + FormsTable.COLUMN_SSS + " TEXT"
            + " );"
            )

    const val SQL_CREATE_PATIENT_DETAILS = ("CREATE TABLE "
            + TableContracts.PDTable.TABLE_NAME + "("
            + TableContracts.PDTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContracts.PDTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContracts.PDTable.COLUMN_UID + " TEXT,"
            + TableContracts.PDTable.COLUMN_USERNAME + " TEXT,"
            + TableContracts.PDTable.COLUMN_FACILITY + " TEXT,"
            + TableContracts.PDTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContracts.PDTable.COLUMN_SYSDATE + " TEXT,"
            + TableContracts.PDTable.COLUMN_ISTATUS + " TEXT,"
            + TableContracts.PDTable.COLUMN_ISTATUS96x + " TEXT,"
            + TableContracts.PDTable.COLUMN_DEVICEID + " TEXT,"
            + TableContracts.PDTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContracts.PDTable.COLUMN_SYNCED + " TEXT,"
            + TableContracts.PDTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContracts.PDTable.COLUMN_APPVERSION + " TEXT,"
            + TableContracts.PDTable.COLUMN_SPD + " TEXT,"
            + TableContracts.PDTable.COLUMN_SHIS + " TEXT,"
            + TableContracts.PDTable.COLUMN_SEXM + " TEXT"
            + " );")

    const val SQL_CREATE_VACCINATION = ("CREATE TABLE "
            + TableContracts.VACCINATIONTable.TABLE_NAME + "("
            + TableContracts.VACCINATIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContracts.VACCINATIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_UID + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_UUID + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_PRNO + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_USERNAME + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_FACILITY + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_VDATE + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_SYSDATE + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_DEVICEID + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_SYNCED + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_APPVERSION + " TEXT,"
            + TableContracts.VACCINATIONTable.COLUMN_SVAC + " TEXT"
            + " );")

    const val SQL_CREATE_DIAGNOSIS = ("CREATE TABLE "
            + TableContracts.DIAGNOSISTable.TABLE_NAME + "("
            + TableContracts.DIAGNOSISTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContracts.DIAGNOSISTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_UID + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_UUID + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_PRNO + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_USERNAME + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_FACILITY + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_VDATE + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_SYSDATE + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_DEVICEID + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_SYNCED + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_APPVERSION + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_SDIAG + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_DIAG_CODE + " TEXT,"
            + TableContracts.DIAGNOSISTable.COLUMN_DIAG_OTHER + " TEXT"
            + " );")

    const val SQL_CREATE_COMPLAINTS = ("CREATE TABLE "
            + TableContracts.COMPLAINTSTable.TABLE_NAME + "("
            + TableContracts.COMPLAINTSTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContracts.COMPLAINTSTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_UID + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_UUID + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_PRNO + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_USERNAME + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_FACILITY + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_VDATE + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_SYSDATE + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_DEVICEID + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_SYNCED + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_APPVERSION + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_SCOMP + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_COMP_CODE + " TEXT,"
            + TableContracts.COMPLAINTSTable.COLUMN_COMP_OTHER + " TEXT"
            + " );")

    const val SQL_CREATE_PRESCRIPTION = ("CREATE TABLE "
            + TableContracts.PRESCRIPTIONTable.TABLE_NAME + "("
            + TableContracts.PRESCRIPTIONTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_PROJECT_NAME + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_UID + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_UUID + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_PRNO + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_USERNAME + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_FACILITY + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_FACILITY_CODE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_VDATE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_SYSDATE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_DEVICEID + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_DEVICETAGID + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_SYNCED + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_SYNCED_DATE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_APPVERSION + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_MED_CODE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_DOSE + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_FREQUENCY + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_DURATION + " TEXT,"
            + TableContracts.PRESCRIPTIONTable.COLUMN_PRES + " TEXT"
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


    const val SQL_CREATE_CLUSTERS =
        ("CREATE TABLE "
                + ClusterTable.TABLE_NAME + "("
                + ClusterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + ClusterTable.COLUMN_GEOAREA + " TEXT,"
                + ClusterTable.COLUMN_DIST_ID + " TEXT,"
                + ClusterTable.COLUMN_EB_CODE + " TEXT"
                + " );"
                )

    const val SQL_CREATE_RANDOM_HH = ("CREATE TABLE " + RandomHHTable.TABLE_NAME + "("
            + RandomHHTable.COLUMN_ID + " TEXT,"
            + RandomHHTable.COLUMN_EB_CODE + " TEXT,"
            + RandomHHTable.COLUMN_LUID + " TEXT,"
            + RandomHHTable.COLUMN_HH_NO + " TEXT,"
            + RandomHHTable.COLUMN_STRUCTURE_NO + " TEXT,"
            + RandomHHTable.COLUMN_FAMILY_EXT_CODE + " TEXT,"
            + RandomHHTable.COLUMN_HH_HEAD + " TEXT,"
            + RandomHHTable.COLUMN_CONTACT + " TEXT,"
            + RandomHHTable.COLUMN_HH_SELECTED_STRUCT + " TEXT,"
            + RandomHHTable.COLUMN_RANDOMDT + " TEXT,"
            + RandomHHTable.COLUMN_SNO + " TEXT );"
            )
}