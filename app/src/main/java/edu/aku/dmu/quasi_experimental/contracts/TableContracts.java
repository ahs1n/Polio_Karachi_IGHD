package edu.aku.dmu.quasi_experimental.contracts;

import android.provider.BaseColumns;

/**
 * Created by hussain.siddiqui on 22/11/2022.
 */

public class TableContracts {

    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "Forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_EB_CODE = "ebCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_GPSLAT = "xlt";
        public static final String COLUMN_GPSLNG = "xlg";
        public static final String COLUMN_GPSDATE = "xdt";
        public static final String COLUMN_GPSACC = "xac";

        public static final String COLUMN_SHH = "sHH";
        public static final String COLUMN_SSS = "sSS";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        //  public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class PDTable implements BaseColumns {
        public static final String TABLE_NAME = "patientdetailsV2";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_FACILITY = "facility";
        public static final String COLUMN_FACILITY_CODE = "facilityCode";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SPD = "sPD";
        public static final String COLUMN_SHIS = "sHIS";
        public static final String COLUMN_SEXM = "sEXM";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }

    public static abstract class VACCINATIONTable implements BaseColumns {
        public static final String TABLE_NAME = "vaccination";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PRNO = "prno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_FACILITY = "facility";
        public static final String COLUMN_FACILITY_CODE = "facilityCode";
        public static final String COLUMN_VDATE = "vdate";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SVAC = "sVAC";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }

    public static abstract class DIAGNOSISTable implements BaseColumns {
        public static final String TABLE_NAME = "diagnosis";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PRNO = "prno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_FACILITY = "facility";
        public static final String COLUMN_FACILITY_CODE = "facilityCode";
        public static final String COLUMN_VDATE = "vdate";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SDIAG = "sDIAG";
        public static final String COLUMN_DIAG_CODE = "diagnosis";
        public static final String COLUMN_DIAG_OTHER = "other";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }

    public static abstract class COMPLAINTSTable implements BaseColumns {
        public static final String TABLE_NAME = "complaints";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PRNO = "prno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_FACILITY = "facility";
        public static final String COLUMN_FACILITY_CODE = "facilityCode";
        public static final String COLUMN_VDATE = "vdate";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SCOMP = "sCOMP";
        public static final String COLUMN_COMP_CODE = "complaints";
        public static final String COLUMN_COMP_OTHER = "other";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
    }

    public static abstract class PRESCRIPTIONTable implements BaseColumns {
        public static final String TABLE_NAME = "prescription";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PRNO = "prno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_FACILITY = "facility";
        public static final String COLUMN_FACILITY_CODE = "facilityCode";
        public static final String COLUMN_VDATE = "vdate";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_PRES = "sPRES";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_MED_CODE = "medCode";
        public static final String COLUMN_DOSE = "dose";
        public static final String COLUMN_FREQUENCY = "frequency";
        public static final String COLUMN_DURATION = "duration";
    }

    public static abstract class EntryLogTable implements BaseColumns {
        public static final String TABLE_NAME = "EntryLog";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_ENTRY_DATE = "entryDate";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }

    public static abstract class ClusterTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "Clusters";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DIST_ID = "dist_id";
        public static final String COLUMN_GEOAREA = "geoarea";
        public static final String COLUMN_EB_CODE = "ebcode";

    }

    public static abstract class RandomHHTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "Randomised";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_RANDOMDT = "randDT";
        public static final String COLUMN_LUID = "UID";
        public static final String COLUMN_EB_CODE = "hh02";
        public static final String COLUMN_STRUCTURE_NO = "hh03";
        public static final String COLUMN_FAMILY_EXT_CODE = "hh07";
        public static final String COLUMN_HH_NO = "hh";
        public static final String COLUMN_HH_HEAD = "hh08";
        public static final String COLUMN_CONTACT = "hh09";
        public static final String COLUMN_HH_SELECTED_STRUCT = "hhss";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_TAB_NO = "tabNo";
        public static String COLUMN_DIST_CODE = "dist_id";
    }
}
