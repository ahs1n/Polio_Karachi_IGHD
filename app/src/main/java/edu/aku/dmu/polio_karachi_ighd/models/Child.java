package edu.aku.dmu.polio_karachi_ighd.models;

import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.PROJECT_NAME;
import static edu.aku.dmu.polio_karachi_ighd.core.MainApp._EMPTY_;
import static edu.aku.dmu.polio_karachi_ighd.core.MainApp.form;

import android.database.Cursor;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.dmu.polio_karachi_ighd.BR;
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts;
import edu.aku.dmu.polio_karachi_ighd.contracts.TableContracts.ChildTable;
import edu.aku.dmu.polio_karachi_ighd.core.MainApp;

@Entity(tableName = ChildTable.TABLE_NAME)
public class Child extends BaseObservable implements Observable {

    @Ignore
    private final String TAG = "Form";
    @Ignore
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    @ColumnInfo(name = ChildTable.COLUMN_PROJECT_NAME)
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = ChildTable.COLUMN_ID)
    private long id = 0;
    @ColumnInfo(name = ChildTable.COLUMN_UID)
    private String uid = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_UUID)
    private String uuid = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_USERNAME)
    private String userName = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_SYSDATE)
    private String sysDate = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_CSTATUS)
    private String cstatus = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_EB_CODE)
    private String ebCode = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_HHID)
    private String hhid = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_SNO)
    private String sno = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_DEVICEID)
    private String deviceId = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_DEVICETAGID)
    private String deviceTag = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_APPVERSION)
    private String appver = _EMPTY_;
    @Ignore
    private String endTime = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_SYNCED)
    private String synced = _EMPTY_;
    @ColumnInfo(name = ChildTable.COLUMN_SYNC_DATE)
    private String syncDate = _EMPTY_;

    // Field Variables
    // CH
    @Ignore
    private String ec13 = _EMPTY_;
    @Ignore
    private String ec14 = _EMPTY_;
    @Ignore
    private String ec15 = _EMPTY_;
    @Ignore
    private String ec16 = _EMPTY_;
    @Ignore
    private String ec17 = _EMPTY_;
    @Ignore
    private String cb03dd = _EMPTY_;
    @Ignore
    private String cb03mm = _EMPTY_;
    @Ignore
    private String cb03yy = _EMPTY_;
    @Ignore
    private String cb03dk = _EMPTY_;
    @Ignore
    private String cb04mm = _EMPTY_;
    @Ignore
    private String cb04yy = _EMPTY_;

    // CB
    @Ignore
    private String ec01 = _EMPTY_;
    @Ignore
    private String ec02 = _EMPTY_;
    @Ignore
    private String ec03 = _EMPTY_;
    @Ignore
    private String ec04 = _EMPTY_;
    @Ignore
    private String ec04a = _EMPTY_;
    @Ignore
    private String ec05 = _EMPTY_;
    @Ignore
    private String ec06 = _EMPTY_;
    @Ignore
    private String ec07 = _EMPTY_;
    @Ignore
    private String ec09 = _EMPTY_;
    @Ignore
    private String ec11 = _EMPTY_;
    @Ignore
    private String ec12 = _EMPTY_;
    @Ignore
    private String ec13cline = _EMPTY_;
    @Ignore
    private String ec14cname = _EMPTY_;
    @Ignore
    private String ec18 = _EMPTY_;
    @Ignore
    private String ec19 = _EMPTY_;
    @Ignore
    private String ec21 = _EMPTY_;
    @Ignore
    private String ec22 = _EMPTY_;
    @Ignore
    private String ec2206x = _EMPTY_;
    @Ignore
    private String ec2296x = _EMPTY_;
    @Ignore
    private String cb01a = _EMPTY_;
    @Ignore
    private String cb01b = _EMPTY_;
    @Ignore
    private String cb02a = _EMPTY_;
    @Ignore
    private String cb02b = _EMPTY_;

    // IM
    @Ignore
    private String im01 = _EMPTY_;
    @Ignore
    private String im02 = _EMPTY_;
    @Ignore
    private String im02a = _EMPTY_;
    @Ignore
    private String im02a96x = _EMPTY_;
    @Ignore
    private String im03 = _EMPTY_;
    @Ignore
    private String im0396x = _EMPTY_;
    @Ignore
    private String im04dd = _EMPTY_;
    @Ignore
    private String im04mm = _EMPTY_;
    @Ignore
    private String im04yy = _EMPTY_;
    @Ignore
    private String im0497 = _EMPTY_;
    @Ignore
    private String backfilename = _EMPTY_;
    @Ignore
    private String frontfilename = _EMPTY_;
    @Ignore
    private String im0501dd = _EMPTY_;
    @Ignore
    private String im0501mm = _EMPTY_;
    @Ignore
    private String im0501yy = _EMPTY_;
    @Ignore
    private String im0502dd = _EMPTY_;
    @Ignore
    private String im0502mm = _EMPTY_;
    @Ignore
    private String im0502yy = _EMPTY_;
    @Ignore
    private String im0503dd = _EMPTY_;
    @Ignore
    private String im0503mm = _EMPTY_;
    @Ignore
    private String im0503yy = _EMPTY_;
    @Ignore
    private String im0504dd = _EMPTY_;
    @Ignore
    private String im0504mm = _EMPTY_;
    @Ignore
    private String im0504yy = _EMPTY_;
    @Ignore
    private String im0505dd = _EMPTY_;
    @Ignore
    private String im0505mm = _EMPTY_;
    @Ignore
    private String im0505yy = _EMPTY_;
    @Ignore
    private String im0506dd = _EMPTY_;
    @Ignore
    private String im0506mm = _EMPTY_;
    @Ignore
    private String im0506yy = _EMPTY_;
    @Ignore
    private String im0507dd = _EMPTY_;
    @Ignore
    private String im0507mm = _EMPTY_;
    @Ignore
    private String im0507yy = _EMPTY_;
    @Ignore
    private String im0508dd = _EMPTY_;
    @Ignore
    private String im0508mm = _EMPTY_;
    @Ignore
    private String im0508yy = _EMPTY_;
    @Ignore
    private String im0509dd = _EMPTY_;
    @Ignore
    private String im0509mm = _EMPTY_;
    @Ignore
    private String im0509yy = _EMPTY_;
    @Ignore
    private String im0510dd = _EMPTY_;
    @Ignore
    private String im0510mm = _EMPTY_;
    @Ignore
    private String im0510yy = _EMPTY_;
    @Ignore
    private String im0510add = _EMPTY_;
    @Ignore
    private String im0510amm = _EMPTY_;
    @Ignore
    private String im0510ayy = _EMPTY_;
    @Ignore
    private String im0511dd = _EMPTY_;
    @Ignore
    private String im0511mm = _EMPTY_;
    @Ignore
    private String im0511yy = _EMPTY_;
    @Ignore
    private String im0512dd = _EMPTY_;
    @Ignore
    private String im0512mm = _EMPTY_;
    @Ignore
    private String im0512yy = _EMPTY_;
    @Ignore
    private String im0513dd = _EMPTY_;
    @Ignore
    private String im0513mm = _EMPTY_;
    @Ignore
    private String im0513yy = _EMPTY_;
    @Ignore
    private String im0514dd = _EMPTY_;
    @Ignore
    private String im0514mm = _EMPTY_;
    @Ignore
    private String im0514yy = _EMPTY_;
    @Ignore
    private String im0515dd = _EMPTY_;
    @Ignore
    private String im0515mm = _EMPTY_;
    @Ignore
    private String im0515yy = _EMPTY_;
    @Ignore
    private String im0515bdd = _EMPTY_;
    @Ignore
    private String im0515bmm = _EMPTY_;
    @Ignore
    private String im0515byy = _EMPTY_;
    @Ignore
    private String im0516dd = _EMPTY_;
    @Ignore
    private String im0516mm = _EMPTY_;
    @Ignore
    private String im0516yy = _EMPTY_;
    @Ignore
    private String im0517dd = _EMPTY_;
    @Ignore
    private String im0517mm = _EMPTY_;
    @Ignore
    private String im0517yy = _EMPTY_;
    //private String im07 = _EMPTY_;
    @Ignore
    private String im08 = _EMPTY_;
    @Ignore
    private String im09 = _EMPTY_;
    @Ignore
    private String im10 = _EMPTY_;
    @Ignore
    private String im10a = _EMPTY_;
    @Ignore
    private String im11 = _EMPTY_;
    @Ignore
    private String im12 = _EMPTY_;
    @Ignore
    private String im12a = _EMPTY_;
    @Ignore
    private String im12a98 = _EMPTY_;
    @Ignore
    private String im14 = _EMPTY_;
    @Ignore
    private String im15 = _EMPTY_;
    @Ignore
    private String im16 = _EMPTY_;
    @Ignore
    private String im17 = _EMPTY_;
    @Ignore
    private String im18 = _EMPTY_;
    @Ignore
    private String im19 = _EMPTY_;
    @Ignore
    private String im20 = _EMPTY_;
    @Ignore
    private String im20a = _EMPTY_;
    @Ignore
    private String im21 = _EMPTY_;
    @Ignore
    private String im22 = _EMPTY_;
    @Ignore
    private String im22a = _EMPTY_;
    @Ignore
    private String im23 = _EMPTY_;
    @Ignore
    private String im236x = _EMPTY_;
    @Ignore
    private String im23a = _EMPTY_;
    @Ignore
    private String im2401 = _EMPTY_;
    @Ignore
    private String im2402 = _EMPTY_;
    @Ignore
    private String im2403 = _EMPTY_;
    @Ignore
    private String im2404 = _EMPTY_;
    @Ignore
    private String im2405 = _EMPTY_;
    @Ignore
    private String im2406 = _EMPTY_;
    @Ignore
    private String im2407 = _EMPTY_;
    @Ignore
    private String im2408 = _EMPTY_;
    @Ignore
    private String im2409 = _EMPTY_;
    @Ignore
    private String im2410 = _EMPTY_;
    @Ignore
    private String im2411 = _EMPTY_;
    @Ignore
    private String im2412 = _EMPTY_;
    @Ignore
    private String im2413 = _EMPTY_;
    @Ignore
    private String im2414 = _EMPTY_;
    @Ignore
    private String im2415 = _EMPTY_;
    @Ignore
    private String im2416 = _EMPTY_;
    @Ignore
    private String im2498 = _EMPTY_;
    @Ignore
    private String im2496 = _EMPTY_;
    @Ignore
    private String im2496x = _EMPTY_;
    @Ignore
    private String im24a = _EMPTY_;
    @Ignore
    private String im24b = _EMPTY_;
    @Ignore
    private String im24b98 = _EMPTY_;
    @Ignore
    private String im24c = _EMPTY_;
    // private String im24d = _EMPTY_;
    @Ignore
    private String im25 = _EMPTY_;
    @Ignore
    private String im26 = _EMPTY_;
    @Ignore
    private String im050198 = _EMPTY_;
    @Ignore
    private String im050298 = _EMPTY_;
    @Ignore
    private String im050398 = _EMPTY_;
    @Ignore
    private String im050498 = _EMPTY_;
    @Ignore
    private String im050598 = _EMPTY_;
    @Ignore
    private String im050698 = _EMPTY_;
    @Ignore
    private String im050798 = _EMPTY_;
    @Ignore
    private String im050898 = _EMPTY_;
    @Ignore
    private String im050998 = _EMPTY_;
    @Ignore
    private String im051098 = _EMPTY_;
    @Ignore
    private String im0510a98 = _EMPTY_;
    @Ignore
    private String im051198 = _EMPTY_;
    @Ignore
    private String im051298 = _EMPTY_;
    @Ignore
    private String im051398 = _EMPTY_;
    @Ignore
    private String im051498 = _EMPTY_;
    @Ignore
    private String im051598 = _EMPTY_;
    @Ignore
    private String im0515b98 = _EMPTY_;
    @Ignore
    private String im051698 = _EMPTY_;
    @Ignore
    private String im051798 = _EMPTY_;
    @Ignore
    private String im050295 = _EMPTY_;
    @Ignore
    private String im050495 = _EMPTY_;
    @Ignore
    private String im050595 = _EMPTY_;
    @Ignore
    private String im050695 = _EMPTY_;
    @Ignore
    private String im050895 = _EMPTY_;
    @Ignore
    private String im050995 = _EMPTY_;
    @Ignore
    private String im051095 = _EMPTY_;
    @Ignore
    private String im0510a95 = _EMPTY_;
    @Ignore
    private String im051295 = _EMPTY_;
    @Ignore
    private String im051395 = _EMPTY_;
    @Ignore
    private String im051495 = _EMPTY_;
    @Ignore
    private String im0515b95 = _EMPTY_;
    @Ignore
    private String im051795 = _EMPTY_;
    @Ignore
    private long ageInMonths = -1;
    @Ignore
    private long trueAgeInMonths = -1;
    @Ignore
    private boolean ageCheck;

    private String b107 = _EMPTY_;
    private String b108 = _EMPTY_;
    private String b10801 = _EMPTY_;
    private String b10802 = _EMPTY_;
    private String b10803 = _EMPTY_;
    private String b10804 = _EMPTY_;
    private String b10805 = _EMPTY_;
    private String b10898 = _EMPTY_;
    private String b110 = _EMPTY_;
    private String b114 = _EMPTY_;
    private String b112 = _EMPTY_;
    private String b11201 = _EMPTY_;
    private String b11202 = _EMPTY_;
    private String b11203 = _EMPTY_;
    private String b11204 = _EMPTY_;
    private String b11205 = _EMPTY_;
    private String b11206 = _EMPTY_;
    private String b11207 = _EMPTY_;
    private String b11208 = _EMPTY_;
    private String b11209 = _EMPTY_;
    private String b11210 = _EMPTY_;
    private String b11296 = _EMPTY_;
    private String b11296x = _EMPTY_;
    private String b105 = _EMPTY_;
    private String b106 = _EMPTY_;
    private String b10601 = _EMPTY_;
    private String b10601x = _EMPTY_;
    private String b10602 = _EMPTY_;
    private String b10602x = _EMPTY_;
    private String b115 = _EMPTY_;
    private String b116 = _EMPTY_;
    private String b117 = _EMPTY_;
    private String b118 = _EMPTY_;
    private String b11896x = _EMPTY_;
    private String b11901 = _EMPTY_;
    private String b11902 = _EMPTY_;
    private String b11903 = _EMPTY_;
    private String b11904 = _EMPTY_;
    private String b11905 = _EMPTY_;
    private String b11906 = _EMPTY_;
    private String b11996 = _EMPTY_;
    private String b11998 = _EMPTY_;
    private String b11996x = _EMPTY_;
    private String b120 = _EMPTY_;
    private String b121 = _EMPTY_;
    private String b12101 = _EMPTY_;
    private String b12102 = _EMPTY_;
    private String b12103 = _EMPTY_;
    private String b12104 = _EMPTY_;
    private String b12105 = _EMPTY_;
    private String b12196 = _EMPTY_;
    private String b12198 = _EMPTY_;
    private String b12196x = _EMPTY_;


    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEbCode(MainApp.selectedHousehold.getEbCode());
        setHhid(MainApp.selectedHousehold.getHhid());
        setEc12(MainApp.selectedHousehold.getHhid());
        setEc05(MainApp.selectedHousehold.getEbCode());

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }



    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cStatus) {
        this.cstatus = cStatus;
    }


    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getEc01() {
        return ec01;
    }

    public void setEc01(String ec01) {
        this.ec01 = ec01;
        notifyPropertyChanged(BR.ec01);
    }

    @Bindable
    public String getEc02() {
        return ec02;
    }

    public void setEc02(String ec02) {
        this.ec02 = ec02;
        notifyPropertyChanged(BR.ec02);
    }

    @Bindable
    public String getEc03() {
        return ec03;
    }

    public void setEc03(String ec03) {
        this.ec03 = ec03;
        notifyPropertyChanged(BR.ec03);
    }

    @Bindable
    public String getEc04() {
        return ec04;
    }

    public void setEc04(String ec04) {
        this.ec04 = ec04;
        notifyPropertyChanged(BR.ec04);
    }

    @Bindable
    public String getEc04a() {
        return ec04a;
    }

    public void setEc04a(String ec04a) {
        this.ec04a = ec04a;
        notifyPropertyChanged(BR.ec04a);
    }

    @Bindable
    public String getEc05() {
        return ec05;
    }

    public void setEc05(String ec05) {
        this.ec05 = ec05;
        notifyPropertyChanged(BR.ec05);
    }

    @Bindable
    public String getEc06() {
        return ec06;
    }

    public void setEc06(String ec06) {
        this.ec06 = ec06;
        notifyPropertyChanged(BR.ec06);
    }

    @Bindable
    public String getEc07() {
        return ec07;
    }

    public void setEc07(String ec07) {
        this.ec07 = ec07;
        notifyPropertyChanged(BR.ec07);
    }

    @Bindable
    public String getEc09() {
        return ec09;
    }

    public void setEc09(String ec09) {
        this.ec09 = ec09;
        notifyPropertyChanged(BR.ec09);
    }

    @Bindable
    public String getEc11() {
        return ec11;
    }

    public void setEc11(String ec11) {
        this.ec11 = ec11;
        notifyPropertyChanged(BR.ec11);
    }

    @Bindable
    public String getEc12() {
        return ec12;
    }

    public void setEc12(String ec12) {
        this.ec12 = ec12;
        notifyPropertyChanged(BR.ec12);
    }

    @Bindable
    public String getEc13cline() {
        return ec13cline;
    }

    public void setEc13cline(String ec13cline) {
        this.ec13cline = ec13cline;
        notifyPropertyChanged(BR.ec13cline);
    }

    @Bindable
    public String getEc14cname() {
        return ec14cname;
    }

    public void setEc14cname(String ec14cname) {
        this.ec14cname = ec14cname;
        notifyPropertyChanged(BR.ec14cname);
    }

    @Bindable
    public String getEc18() {
        return ec18;
    }

    public void setEc18(String ec18) {
        this.ec18 = ec18;
        setEc19(ec18.equals("4") || ec18.equals("96") ? "" : this.ec19);
        setEc21(ec18.equals("4") || ec18.equals("96") ? "" : this.ec19);

        notifyPropertyChanged(BR.ec18);
    }

    @Bindable
    public String getEc19() {
        return ec19;
    }

    public void setEc19(String ec19) {
        this.ec19 = ec19;
        notifyPropertyChanged(BR.ec19);
    }

    @Bindable
    public String getEc21() {
        return ec21;
    }

    public void setEc21(String ec21) {
        this.ec21 = ec21;
        setCb01a(ec21.equals("1") ? this.cb01a : "");
        setCb01b(ec21.equals("1") ? this.cb01b : "");
        setCb02a(ec21.equals("1") ? this.cb02a : "");
        setCb02b(ec21.equals("1") ? this.cb02b : "");


        notifyPropertyChanged(BR.ec21);
    }

    @Bindable
    public String getEc22() {
        return ec22;
    }

    public void setEc22(String ec22) {
        this.ec22 = ec22;
        setEc2206x(ec22.equals("6") ? this.ec2206x : ""); // for all skips, mention all skipped questions
        setEc2296x(ec22.equals("96") ? this.ec2296x : ""); // for all skips, mention all skipped questions
        setCstatus(ec22);
        notifyPropertyChanged(BR.ec22);
    }

    @Bindable
    public String getEc2206x() {
        return ec2206x;
    }

    public void setEc2206x(String ec2206x) {
        this.ec2206x = ec2206x;
        notifyPropertyChanged(BR.ec2206x);
    }

    @Bindable
    public String getEc2296x() {
        return ec2296x;
    }

    public void setEc2296x(String ec2296x) {
        this.ec2296x = ec2296x;
        notifyPropertyChanged(BR.ec2296x);
    }

    @Bindable
    public String getCb01a() {
        return cb01a;
    }

    public void setCb01a(String cb01a) {
        this.cb01a = cb01a;
        notifyPropertyChanged(BR.cb01a);
    }

    @Bindable
    public String getCb01b() {
        return cb01b;
    }

    public void setCb01b(String cb01b) {
        this.cb01b = cb01b;
        notifyPropertyChanged(BR.cb01b);
    }

    @Bindable
    public String getCb02a() {
        return cb02a;
    }

    public void setCb02a(String cb02a) {
        this.cb02a = cb02a;
        notifyPropertyChanged(BR.cb02a);
    }

    @Bindable
    public String getCb02b() {
        return cb02b;
    }

    public void setCb02b(String cb02b) {
        this.cb02b = cb02b;
        notifyPropertyChanged(BR.cb02b);
    }

    @Bindable
    public String getEc13() {
        return ec13;
    }

    public void setEc13(String ec13) {
        this.ec13 = ec13;
        this.sno = ec13;
        this.ec13cline = ec13;
        notifyPropertyChanged(BR.ec13);
    }

    @Bindable
    public String getEc14() {
        return ec14;
    }

    public void setEc14(String ec14) {
        this.ec14 = ec14;
        this.ec14cname = ec14;
        notifyPropertyChanged(BR.ec14);
    }

    @Bindable
    public String getEc15() {
        return ec15;
    }

    public void setEc15(String ec15) {
        this.ec15 = ec15;
        notifyPropertyChanged(BR.ec15);
    }

    @Bindable
    public String getEc16() {
        return ec16;
    }

    public void setEc16(String ec16) {
        this.ec16 = ec16;
        notifyPropertyChanged(BR.ec16);
    }

    @Bindable
    public String getEc17() {
        return ec17;
    }

    public void setEc17(String ec17) {
        this.ec17 = ec17;
        notifyPropertyChanged(BR.ec17);
    }

    @Bindable
    public String getCb03dd() {
        return cb03dd;
    }

    public void setCb03dd(String cb03dd) {
        this.cb03dd = cb03dd;
        CaluculateAge(this.cb03dd, this.cb03mm, this.cb03yy, false);
        notifyPropertyChanged(BR.cb03dd);
    }

    @Bindable
    public String getCb03mm() {
        return cb03mm;
    }

    public void setCb03mm(String cb03mm) {
        this.cb03mm = cb03mm;
        CaluculateAge(this.cb03dd, this.cb03mm, this.cb03yy, false);
        notifyPropertyChanged(BR.cb03mm);
    }

    @Bindable
    public String getCb03yy() {
        return cb03yy;
    }

    public void setCb03yy(String cb03yy) {
        this.cb03yy = cb03yy;
        CaluculateAge(this.cb03dd, this.cb03mm, this.cb03yy, false);
        notifyPropertyChanged(BR.cb03yy);
    }

    @Bindable
    public String getCb03dk() {
        return cb03dk;
    }

    public void setCb03dk(String cb03dk) {
        this.cb03dk = cb03dk;
        setCb03dd(cb03dk.equals("98") ? "" : this.cb03dd);
        setCb03mm(cb03dk.equals("98") ? "" : this.cb03mm);
        setCb03yy(cb03dk.equals("98") ? "" : this.cb03yy);
        notifyPropertyChanged(BR.cb03dk);
    }

    @Bindable
    public String getCb04mm() {
        return cb04mm;
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        if (!cb04mm.equals("") && !this.cb04yy.equals(""))
            setAgeInMonths((Integer.parseInt(cb04yy) * 12L) + Integer.parseInt(this.cb04mm));
        notifyPropertyChanged(BR.cb04mm);
    }

    @Bindable
    public String getCb04yy() {
        return cb04yy;
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        if (!cb04mm.equals("") && !this.cb04yy.equals(""))
            setAgeInMonths((Integer.parseInt(this.cb04yy) * 12L) + Integer.parseInt(cb04mm));
        notifyPropertyChanged(BR.cb04yy);
    }

    @Bindable
    public long getAgeInMonths() {
        return ageInMonths;
    }


    public void setAgeInMonths(long ageInMonths) {
        this.ageInMonths = ageInMonths;
        setAgeCheck(ageInMonths > 0 && ageInMonths < 59);
        notifyPropertyChanged(BR.ageInMonths);

    }

    @Bindable
    public long getTrueAgeInMonths() {
        return trueAgeInMonths;
    }


    public void setTrueAgeInMonths(long trueAgeInMonths) {
        this.trueAgeInMonths = trueAgeInMonths;
        setAgeCheck(trueAgeInMonths > 0 && trueAgeInMonths < 59);
        notifyPropertyChanged(BR.trueAgeInMonths);
    }

    @Bindable
    public boolean getAgeCheck() {
        return ageCheck;
    }

    private void setAgeCheck(boolean ageCheck) {
        this.ageCheck = ageCheck;
        notifyPropertyChanged(BR.ageCheck);

    }

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;

        //Card Present
        setIm02(im01.equals("1") ? this.im02 : "");

        setIm04dd(im01.equals("1") ? this.im04dd : "");
        setIm04mm(im01.equals("1") ? this.im04mm : "");
        setIm04yy(im01.equals("1") ? this.im04yy : "");


        // At birth
        setIm0501dd(im01.equals("1") ? this.im0501dd : "");
        setIm0501mm(im01.equals("1") ? this.im0501mm : "");
        setIm0501yy(im01.equals("1") ? this.im0501yy : "");
        setIm050198(im01.equals("1") ? this.im050198 : "");
        setIm050295(im01.equals("1") ? this.im050295 : "");


        setIm0502dd(im01.equals("1") ? this.im0502dd : "");
        setIm0502mm(im01.equals("1") ? this.im0502mm : "");
        setIm0502yy(im01.equals("1") ? this.im0502yy : "");
        setIm050298(im01.equals("1") ? this.im050298 : "");
        setIm0510a95(im01.equals("1") ? this.im0510a95 : "");

        setIm0510add(im01.equals("1") ? this.im0510add : "");
        setIm0510amm(im01.equals("1") ? this.im0510amm : "");
        setIm0510ayy(im01.equals("1") ? this.im0510ayy : "");
        setIm0510a98(im01.equals("1") ? this.im0510a98 : "");


        // At six weeks
        setIm0503dd(im01.equals("1") ? this.im0503dd : "");
        setIm0503mm(im01.equals("1") ? this.im0503mm : "");
        setIm0503yy(im01.equals("1") ? this.im0503yy : "");
        setIm050398(im01.equals("1") ? this.im050398 : "");
        setIm050495(im01.equals("1") ? this.im050495 : "");

        setIm0504dd(im01.equals("1") ? this.im0504dd : "");
        setIm0504mm(im01.equals("1") ? this.im0504mm : "");
        setIm0504yy(im01.equals("1") ? this.im0504yy : "");
        setIm050498(im01.equals("1") ? this.im050498 : "");
        setIm050595(im01.equals("1") ? this.im050595 : "");

        setIm0505dd(im01.equals("1") ? this.im0505dd : "");
        setIm0505mm(im01.equals("1") ? this.im0505mm : "");
        setIm0505yy(im01.equals("1") ? this.im0505yy : "");
        setIm050598(im01.equals("1") ? this.im050598 : "");
        setIm050695(im01.equals("1") ? this.im050695 : "");

        setIm0506dd(im01.equals("1") ? this.im0506dd : "");
        setIm0506mm(im01.equals("1") ? this.im0506mm : "");
        setIm0506yy(im01.equals("1") ? this.im0506yy : "");
        setIm050698(im01.equals("1") ? this.im050698 : "");


        // at 10 weeks
        setIm0507dd(im01.equals("1") ? this.im0507dd : "");
        setIm0507mm(im01.equals("1") ? this.im0507mm : "");
        setIm0507yy(im01.equals("1") ? this.im0507yy : "");
        setIm050798(im01.equals("1") ? this.im050798 : "");
        setIm050895(im01.equals("1") ? this.im050895 : "");

        setIm0508dd(im01.equals("1") ? this.im0508dd : "");
        setIm0508mm(im01.equals("1") ? this.im0508mm : "");
        setIm0508yy(im01.equals("1") ? this.im0508yy : "");
        setIm050898(im01.equals("1") ? this.im050898 : "");
        setIm050995(im01.equals("1") ? this.im050995 : "");

        setIm0509dd(im01.equals("1") ? this.im0509dd : "");
        setIm0509mm(im01.equals("1") ? this.im0509mm : "");
        setIm0509yy(im01.equals("1") ? this.im0509yy : "");
        setIm050998(im01.equals("1") ? this.im050998 : "");
        setIm051095(im01.equals("1") ? this.im051095 : "");

        setIm0510dd(im01.equals("1") ? this.im0510dd : "");
        setIm0510mm(im01.equals("1") ? this.im0510mm : "");
        setIm0510yy(im01.equals("1") ? this.im0510yy : "");
        setIm051098(im01.equals("1") ? this.im051098 : "");


        // at 14 weeks
        setIm0511dd(im01.equals("1") ? this.im0511dd : "");
        setIm0511mm(im01.equals("1") ? this.im0511mm : "");
        setIm0511yy(im01.equals("1") ? this.im0511yy : "");
        setIm051198(im01.equals("1") ? this.im051198 : "");
        setIm051295(im01.equals("1") ? this.im051295 : "");

        setIm0512dd(im01.equals("1") ? this.im0512dd : "");
        setIm0512mm(im01.equals("1") ? this.im0512mm : "");
        setIm0512yy(im01.equals("1") ? this.im0512yy : "");
        setIm051298(im01.equals("1") ? this.im051298 : "");
        setIm051395(im01.equals("1") ? this.im051395 : "");

        setIm0513dd(im01.equals("1") ? this.im0513dd : "");
        setIm0513mm(im01.equals("1") ? this.im0513mm : "");
        setIm0513yy(im01.equals("1") ? this.im0513yy : "");
        setIm051398(im01.equals("1") ? this.im051398 : "");
        setIm051495(im01.equals("1") ? this.im051495 : "");

        setIm0514dd(im01.equals("1") ? this.im0514dd : "");
        setIm0514mm(im01.equals("1") ? this.im0514mm : "");
        setIm0514yy(im01.equals("1") ? this.im0514yy : "");
        setIm051498(im01.equals("1") ? this.im051498 : "");


        // at 9 months
        setIm0515dd(im01.equals("1") ? this.im0515dd : "");
        setIm0515mm(im01.equals("1") ? this.im0515mm : "");
        setIm0515yy(im01.equals("1") ? this.im0515yy : "");
        setIm051598(im01.equals("1") ? this.im051598 : "");
        setIm0515b95(im01.equals("1") ? this.im0515b95 : "");

        setIm0515bdd(im01.equals("1") ? this.im0515bdd : "");
        setIm0515bmm(im01.equals("1") ? this.im0515bmm : "");
        setIm0515byy(im01.equals("1") ? this.im0515byy : "");
        setIm0515b98(im01.equals("1") ? this.im0515b98 : "");

        setIm0516dd(im01.equals("1") ? this.im0516dd : "");
        setIm0516mm(im01.equals("1") ? this.im0516mm : "");
        setIm0516yy(im01.equals("1") ? this.im0516yy : "");
        setIm051698(im01.equals("1") ? this.im051698 : "");


        // at 15 months
        setIm0517dd(im01.equals("1") ? this.im0517dd : "");
        setIm0517mm(im01.equals("1") ? this.im0517mm : "");
        setIm0517yy(im01.equals("1") ? this.im0517yy : "");
        setIm051798(im01.equals("1") ? this.im051798 : "");
        setIm051795(im01.equals("1") ? this.im051795 : "");


        // card not present
        setIm03(im01.equals("2") ? this.im03 : "");
        setIm08(im01.equals("2") ? this.im08 : "");


        //setIm07(im01.equals("1") ? this.im07 : "");


        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;

        setTrueAgeInMonths(this.ageInMonths);
        setIm0497(im02.equals("1") ? this.im0497 : "");

        // SEEN
        setIm04dd(im02.equals("1") ? this.im04dd : "");
        setIm04mm(im02.equals("1") ? this.im04mm : "");
        setIm04yy(im02.equals("1") ? this.im04yy : "");

        // NOT SEEN
        setIm02a(im02.equals("3") ? this.im02a : "");
        setIm08(im02.equals("3") ? this.im08 : "");


        // at birth
        setIm0501dd(im02.equals("1") ? this.im0501dd : "");
        setIm0501mm(im02.equals("1") ? this.im0501mm : "");
        setIm0501yy(im02.equals("1") ? this.im0501yy : "");
        setIm050198(im02.equals("1") ? this.im050198 : "");
        setIm050295(im02.equals("1") ? this.im050295 : "");

        setIm0502dd(im02.equals("1") ? this.im0502dd : "");
        setIm0502mm(im02.equals("1") ? this.im0502mm : "");
        setIm0502yy(im02.equals("1") ? this.im0502yy : "");
        setIm050298(im02.equals("1") ? this.im050298 : "");
        setIm0510a95(im02.equals("1") ? this.im0510a95 : "");

        setIm0510add(im02.equals("1") ? this.im0510add : "");
        setIm0510amm(im02.equals("1") ? this.im0510amm : "");
        setIm0510ayy(im02.equals("1") ? this.im0510ayy : "");
        setIm0510a98(im02.equals("1") ? this.im0510a98 : "");


        // at 6 weeks
        setIm0503dd(im02.equals("1") ? this.im0503dd : "");
        setIm0503mm(im02.equals("1") ? this.im0503mm : "");
        setIm0503yy(im02.equals("1") ? this.im0503yy : "");
        setIm050398(im02.equals("1") ? this.im050398 : "");
        setIm050495(im02.equals("1") ? this.im050495 : "");

        setIm0504dd(im02.equals("1") ? this.im0504dd : "");
        setIm0504mm(im02.equals("1") ? this.im0504mm : "");
        setIm0504yy(im02.equals("1") ? this.im0504yy : "");
        setIm050498(im02.equals("1") ? this.im050498 : "");
        setIm050595(im02.equals("1") ? this.im050595 : "");

        setIm0505dd(im02.equals("1") ? this.im0505dd : "");
        setIm0505mm(im02.equals("1") ? this.im0505mm : "");
        setIm0505yy(im02.equals("1") ? this.im0505yy : "");
        setIm050598(im02.equals("1") ? this.im050598 : "");
        setIm050695(im02.equals("1") ? this.im050695 : "");

        setIm0506dd(im02.equals("1") ? this.im0506dd : "");
        setIm0506mm(im02.equals("1") ? this.im0506mm : "");
        setIm0506yy(im02.equals("1") ? this.im0506yy : "");
        setIm050698(im02.equals("1") ? this.im050698 : "");


        // at 10 weeks
        setIm0507dd(im02.equals("1") ? this.im0507dd : "");
        setIm0507mm(im02.equals("1") ? this.im0507mm : "");
        setIm0507yy(im02.equals("1") ? this.im0507yy : "");
        setIm050798(im02.equals("1") ? this.im050798 : "");
        setIm050895(im02.equals("1") ? this.im050895 : "");

        setIm0508dd(im02.equals("1") ? this.im0508dd : "");
        setIm0508mm(im02.equals("1") ? this.im0508mm : "");
        setIm0508yy(im02.equals("1") ? this.im0508yy : "");
        setIm050898(im02.equals("1") ? this.im050898 : "");
        setIm050995(im02.equals("1") ? this.im050995 : "");

        setIm0509dd(im02.equals("1") ? this.im0509dd : "");
        setIm0509mm(im02.equals("1") ? this.im0509mm : "");
        setIm0509yy(im02.equals("1") ? this.im0509yy : "");
        setIm050998(im02.equals("1") ? this.im050998 : "");
        setIm051095(im02.equals("1") ? this.im051095 : "");

        setIm0510dd(im02.equals("1") ? this.im0510dd : "");
        setIm0510mm(im02.equals("1") ? this.im0510mm : "");
        setIm0510yy(im02.equals("1") ? this.im0510yy : "");
        setIm051098(im02.equals("1") ? this.im051098 : "");


        // at 14 weeks
        setIm0511dd(im02.equals("1") ? this.im0511dd : "");
        setIm0511mm(im02.equals("1") ? this.im0511mm : "");
        setIm0511yy(im02.equals("1") ? this.im0511yy : "");
        setIm051198(im02.equals("1") ? this.im051198 : "");
        setIm051295(im02.equals("1") ? this.im051295 : "");

        setIm0512dd(im02.equals("1") ? this.im0512dd : "");
        setIm0512mm(im02.equals("1") ? this.im0512mm : "");
        setIm0512yy(im02.equals("1") ? this.im0512yy : "");
        setIm051298(im02.equals("1") ? this.im051298 : "");
        setIm051395(im02.equals("1") ? this.im051395 : "");

        setIm0513dd(im02.equals("1") ? this.im0513dd : "");
        setIm0513mm(im02.equals("1") ? this.im0513mm : "");
        setIm0513yy(im02.equals("1") ? this.im0513yy : "");
        setIm051398(im02.equals("1") ? this.im051398 : "");
        setIm051495(im02.equals("1") ? this.im051495 : "");

        setIm0514dd(im02.equals("1") ? this.im0514dd : "");
        setIm0514mm(im02.equals("1") ? this.im0514mm : "");
        setIm0514yy(im02.equals("1") ? this.im0514yy : "");
        setIm051498(im02.equals("1") ? this.im051498 : "");


        // at 9 months
        setIm0515dd(im02.equals("1") ? this.im0515dd : "");
        setIm0515mm(im02.equals("1") ? this.im0515mm : "");
        setIm0515yy(im02.equals("1") ? this.im0515yy : "");
        setIm051598(im02.equals("1") ? this.im051598 : "");
        setIm0515b95(im02.equals("1") ? this.im0515b95 : "");

        setIm0515bdd(im02.equals("1") ? this.im0515bdd : "");
        setIm0515bmm(im02.equals("1") ? this.im0515bmm : "");
        setIm0515byy(im02.equals("1") ? this.im0515byy : "");
        setIm0515b98(im02.equals("1") ? this.im0515b98 : "");

        setIm0516dd(im02.equals("1") ? this.im0516dd : "");
        setIm0516mm(im02.equals("1") ? this.im0516mm : "");
        setIm0516yy(im02.equals("1") ? this.im0516yy : "");
        setIm051698(im02.equals("1") ? this.im051698 : "");

        // at 15 months
        setIm0517dd(im02.equals("1") ? this.im0517dd : "");
        setIm0517mm(im02.equals("1") ? this.im0517mm : "");
        setIm0517yy(im02.equals("1") ? this.im0517yy : "");
        setIm051798(im02.equals("1") ? this.im051798 : "");
        setIm051795(im02.equals("1") ? this.im051795 : "");

        setIm08(im02.equals("1") ? "" : this.im08);
        setIm09(im02.equals("1") ? "" : this.im09);
        setIm10(im02.equals("1") ? "" : this.im10);
        setIm10a(im02.equals("1") ? "" : this.im10a);
        setIm11(im02.equals("1") ? "" : this.im11);
        setIm12(im02.equals("1") ? "" : this.im12);
        setIm12a(im02.equals("1") ? "" : this.im12a);
        setIm14(im02.equals("1") ? "" : this.im14);
        setIm15(im02.equals("1") ? "" : this.im15);
        setIm16(im02.equals("1") ? "" : this.im16);
        setIm17(im02.equals("1") ? "" : this.im17);
        setIm18(im02.equals("1") ? "" : this.im18);
        setIm19(im02.equals("1") ? "" : this.im19);
        setIm20(im02.equals("1") ? "" : this.im20);
        //setIm20a(im02.equals("1") ? "" : this.im20a);

        setIm21(im02.equals("1") ? "" : this.im21);
        setIm22(im02.equals("1") ? "" : this.im22);
        setIm22a(im02.equals("1") ? "" : this.im22a);
        setIm23(im02.equals("1") || this.im08.equals("1") ? this.im23 : "");
        setIm23a(im02.equals("1") || this.im08.equals("1") ? this.im23a : "");
        setIm2401(im02.equals("1") ? "" : this.im2401);
        setIm2402(im02.equals("1") ? "" : this.im2402);
        setIm2403(im02.equals("1") ? "" : this.im2403);
        setIm2404(im02.equals("1") ? "" : this.im2404);
        setIm2405(im02.equals("1") ? "" : this.im2405);
        setIm2406(im02.equals("1") ? "" : this.im2406);
        setIm2407(im02.equals("1") ? "" : this.im2407);
        setIm2408(im02.equals("1") ? "" : this.im2408);
        setIm2409(im02.equals("1") ? "" : this.im2409);
        setIm2410(im02.equals("1") ? "" : this.im2410);
        setIm2411(im02.equals("1") ? "" : this.im2411);
        setIm2412(im02.equals("1") ? "" : this.im2412);
        setIm2413(im02.equals("1") ? "" : this.im2413);
        setIm2414(im02.equals("1") ? "" : this.im2414);
        setIm2415(im02.equals("1") ? "" : this.im2415);
        setIm2416(im02.equals("1") ? "" : this.im2416);
        setIm2496(im02.equals("1") ? "" : this.im2496);
        setIm2498(im02.equals("1") ? "" : this.im2498);


        //setIm07(im02.equals("1") ? this.im07 : "");

        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm02a() {
        return im02a;
    }

    public void setIm02a(String im02a) {
        this.im02a = im02a;
        setIm02a96x(im02a.equals("96") ? this.im02a96x : "");

        /*final boolean b = im02a.equals("1") || im02a.equals("2") || im02a.equals("3") || im02a.equals("96");

        setIm03(b ? "" : this.im03);
        setIm04dd(b ? "" : this.im04dd);
        setIm04mm(b ? "" : this.im04mm);
        setIm04yy(b ? "" : this.im04yy);
        setIm07(b ? "" : this.im07);
*/
        notifyPropertyChanged(BR.im02a);
    }

    @Bindable
    public String getIm02a96x() {
        return im02a96x;
    }

    public void setIm02a96x(String im02a96x) {
        this.im02a96x = im02a96x;
        notifyPropertyChanged(BR.im02a96x);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        setIm0396x(im03.equals("96") ? this.im0396x : "");
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
        notifyPropertyChanged(BR.im0396x);
    }

    @Bindable
    public String getIm04dd() {
        return im04dd;
    }

    public void setIm04dd(String im04dd) {
        this.im04dd = im04dd;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04dd);
    }

    @Bindable
    public String getIm04mm() {
        return im04mm;
    }

    public void setIm04mm(String im04mm) {
        this.im04mm = im04mm;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04mm);
    }

    @Bindable
    public String getIm04yy() {
        return im04yy;
    }

    public void setIm04yy(String im04yy) {
        this.im04yy = im04yy;
        setTrueAgeInMonths(-1);

        CaluculateAge(this.im04dd, this.im04mm, this.im04yy, true);

        notifyPropertyChanged(BR.im04yy);
    }

    @Bindable
    public String getIm0497() {
        return im0497;
    }

    public void setIm0497(String im0497) {
        if (this.im0497.equals(im0497)) return;
        this.im0497 = im0497;
        setTrueAgeInMonths(im0497.equals("97") ? this.ageInMonths : -1);
        setIm04dd(im0497.equals("97") ? "" : this.im04dd);
        setIm04mm(im0497.equals("97") ? "" : this.im04mm);
        setIm04yy(im0497.equals("97") ? "" : this.im04yy);
        notifyPropertyChanged(BR.im0497);
    }

    @Bindable
    public String getBackfilename() {
        return backfilename;
    }

    public void setBackfilename(String backfilename) {
        if (this.backfilename.equals(backfilename)) return;
        this.backfilename = backfilename;

        notifyPropertyChanged(BR.backfilename);
    }

    @Bindable
    public String getFrontfilename() {
        return frontfilename;
    }

    public void setFrontfilename(String frontfilename) {
        if (this.frontfilename.equals(frontfilename)) return;
        this.frontfilename = frontfilename;

        notifyPropertyChanged(BR.frontfilename);
    }

    @Bindable
    public String getIm0501dd() {
        return im0501dd;
    }

    public void setIm0501dd(String im0501dd) {
        this.im0501dd = im0501dd;
        boolean b = im0501dd.length() > 0 && Integer.parseInt(im0501dd) > 31;
        setIm0501mm(b ? "" : this.im0501mm);
        setIm0501yy(b ? "" : this.im0501yy);
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501dd);
    }

    @Bindable
    public String getIm0501mm() {
        return im0501mm;
    }

    public void setIm0501mm(String im0501mm) {
        this.im0501mm = im0501mm;
        boolean b = im0501mm.length() > 0 && Integer.parseInt(im0501mm) > 12;
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501mm);
    }

    @Bindable
    public String getIm0501yy() {
        return im0501yy;
    }

    public void setIm0501yy(String im0501yy) {
        this.im0501yy = im0501yy;
        boolean b = im0501yy.length() > 0;
        setIm050295(b ? "" : this.im050295);
        notifyPropertyChanged(BR.im0501yy);
    }

    @Bindable
    public String getIm0502dd() {
        return im0502dd;
    }

    public void setIm0502dd(String im0502dd) {
        this.im0502dd = im0502dd;
        boolean b = im0502dd.length() > 0 && Integer.parseInt(im0502dd) > 31;
        setIm0502mm(b ? "" : this.im0502mm);
        setIm0502yy(b ? "" : this.im0502yy);
        notifyPropertyChanged(BR.im0502dd);
    }

    @Bindable
    public String getIm0502mm() {
        return im0502mm;
    }

    public void setIm0502mm(String im0502mm) {
        this.im0502mm = im0502mm;
        notifyPropertyChanged(BR.im0502mm);
    }

    @Bindable
    public String getIm0502yy() {
        return im0502yy;
    }

    public void setIm0502yy(String im0502yy) {
        this.im0502yy = im0502yy;
        notifyPropertyChanged(BR.im0502yy);
    }

    @Bindable
    public String getIm0503dd() {
        return im0503dd;
    }

    public void setIm0503dd(String im0503dd) {
        this.im0503dd = im0503dd;
        boolean b = im0503dd.length() > 0 && Integer.parseInt(im0503dd) > 31;
        setIm0503mm(b ? "" : this.im0503mm);
        setIm0503yy(b ? "" : this.im0503yy);
        setIm050495(b ? "" : this.im050495);
        notifyPropertyChanged(BR.im0503dd);
    }

    @Bindable
    public String getIm0503mm() {
        return im0503mm;
    }

    public void setIm0503mm(String im0503mm) {
        this.im0503mm = im0503mm;
        notifyPropertyChanged(BR.im0503mm);
    }

    @Bindable
    public String getIm0503yy() {
        return im0503yy;
    }

    public void setIm0503yy(String im0503yy) {
        this.im0503yy = im0503yy;
        notifyPropertyChanged(BR.im0503yy);
    }

    @Bindable
    public String getIm0504dd() {
        return im0504dd;
    }

    public void setIm0504dd(String im0504dd) {
        this.im0504dd = im0504dd;
        boolean b = im0504dd.length() > 0 && Integer.parseInt(im0504dd) > 31;
        setIm0504mm(b ? "" : this.im0504mm);
        setIm0504yy(b ? "" : this.im0504yy);
        notifyPropertyChanged(BR.im0504dd);
    }

    @Bindable
    public String getIm0504mm() {
        return im0504mm;
    }

    public void setIm0504mm(String im0504mm) {
        this.im0504mm = im0504mm;
        notifyPropertyChanged(BR.im0504mm);
    }

    @Bindable
    public String getIm0504yy() {
        return im0504yy;
    }

    public void setIm0504yy(String im0504yy) {
        this.im0504yy = im0504yy;
        notifyPropertyChanged(BR.im0504yy);
    }

    @Bindable
    public String getIm0505dd() {
        return im0505dd;
    }

    public void setIm0505dd(String im0505dd) {
        this.im0505dd = im0505dd;
        boolean b = im0505dd.length() > 0 && Integer.parseInt(im0505dd) > 31;
        setIm0505mm(b ? "" : this.im0505mm);
        setIm0505yy(b ? "" : this.im0505yy);
        notifyPropertyChanged(BR.im0505dd);
    }

    @Bindable
    public String getIm0505mm() {
        return im0505mm;
    }

    public void setIm0505mm(String im0505mm) {
        this.im0505mm = im0505mm;
        notifyPropertyChanged(BR.im0505mm);
    }

    @Bindable
    public String getIm0505yy() {
        return im0505yy;
    }

    public void setIm0505yy(String im0505yy) {
        this.im0505yy = im0505yy;
        notifyPropertyChanged(BR.im0505yy);
    }

    @Bindable
    public String getIm0506dd() {
        return im0506dd;
    }

    public void setIm0506dd(String im0506dd) {
        this.im0506dd = im0506dd;
        boolean b = im0506dd.length() > 0 && Integer.parseInt(im0506dd) > 31;
        setIm0506mm(b ? "" : this.im0506mm);
        setIm0506yy(b ? "" : this.im0506yy);
        notifyPropertyChanged(BR.im0506dd);
    }

    @Bindable
    public String getIm0506mm() {
        return im0506mm;
    }

    public void setIm0506mm(String im0506mm) {
        this.im0506mm = im0506mm;
        notifyPropertyChanged(BR.im0506mm);
    }

    @Bindable
    public String getIm0506yy() {
        return im0506yy;
    }

    public void setIm0506yy(String im0506yy) {
        this.im0506yy = im0506yy;
        notifyPropertyChanged(BR.im0506yy);
    }

    @Bindable
    public String getIm0507dd() {
        return im0507dd;
    }

    public void setIm0507dd(String im0507dd) {
        this.im0507dd = im0507dd;
        boolean b = im0507dd.length() > 0 && Integer.parseInt(im0507dd) > 31;
        setIm0507mm(b ? "" : this.im0507mm);
        setIm0507yy(b ? "" : this.im0507yy);
        notifyPropertyChanged(BR.im0507dd);
    }

    @Bindable
    public String getIm0507mm() {
        return im0507mm;
    }

    public void setIm0507mm(String im0507mm) {
        this.im0507mm = im0507mm;
        notifyPropertyChanged(BR.im0507mm);
    }

    @Bindable
    public String getIm0507yy() {
        return im0507yy;
    }

    public void setIm0507yy(String im0507yy) {
        this.im0507yy = im0507yy;
        notifyPropertyChanged(BR.im0507yy);
    }

    @Bindable
    public String getIm0508dd() {
        return im0508dd;
    }

    public void setIm0508dd(String im0508dd) {
        this.im0508dd = im0508dd;
        boolean b = im0508dd.length() > 0 && Integer.parseInt(im0508dd) > 31;
        setIm0508mm(b ? "" : this.im0508mm);
        setIm0508yy(b ? "" : this.im0508yy);
        notifyPropertyChanged(BR.im0508dd);
    }

    @Bindable
    public String getIm0508mm() {
        return im0508mm;
    }

    public void setIm0508mm(String im0508mm) {
        this.im0508mm = im0508mm;
        notifyPropertyChanged(BR.im0508mm);
    }

    @Bindable
    public String getIm0508yy() {
        return im0508yy;
    }

    public void setIm0508yy(String im0508yy) {
        this.im0508yy = im0508yy;
        notifyPropertyChanged(BR.im0508yy);
    }

    @Bindable
    public String getIm0509dd() {
        return im0509dd;
    }

    public void setIm0509dd(String im0509dd) {
        this.im0509dd = im0509dd;
        boolean b = im0509dd.length() > 0 && Integer.parseInt(im0509dd) > 31;
        setIm0509mm(b ? "" : this.im0509mm);
        setIm0509yy(b ? "" : this.im0509yy);
        notifyPropertyChanged(BR.im0509dd);
    }

    @Bindable
    public String getIm0509mm() {
        return im0509mm;
    }

    public void setIm0509mm(String im0509mm) {
        this.im0509mm = im0509mm;
        notifyPropertyChanged(BR.im0509mm);
    }

    @Bindable
    public String getIm0509yy() {
        return im0509yy;
    }

    public void setIm0509yy(String im0509yy) {
        this.im0509yy = im0509yy;
        notifyPropertyChanged(BR.im0509yy);
    }

    @Bindable
    public String getIm0510dd() {
        return im0510dd;
    }

    public void setIm0510dd(String im0510dd) {
        this.im0510dd = im0510dd;
        boolean b = im0510dd.length() > 0 && Integer.parseInt(im0510dd) > 31;
        setIm0510mm(b ? "" : this.im0510mm);
        setIm0510yy(b ? "" : this.im0510yy);
        notifyPropertyChanged(BR.im0510dd);
    }

    @Bindable
    public String getIm0510mm() {
        return im0510mm;
    }

    public void setIm0510mm(String im0510mm) {
        this.im0510mm = im0510mm;
        notifyPropertyChanged(BR.im0510mm);
    }

    @Bindable
    public String getIm0510yy() {
        return im0510yy;
    }

    public void setIm0510yy(String im0510yy) {
        this.im0510yy = im0510yy;
        notifyPropertyChanged(BR.im0510yy);
    }

    @Bindable
    public String getIm0510add() {
        return im0510add;
    }

    public void setIm0510add(String im0510add) {
        this.im0510add = im0510add;
        boolean b = im0510add.length() > 0 && Integer.parseInt(im0510add) > 31;
        setIm0510amm(b ? "" : this.im0510amm);
        setIm0510ayy(b ? "" : this.im0510ayy);
        notifyPropertyChanged(BR.im0510add);
    }

    @Bindable
    public String getIm0510amm() {
        return im0510amm;
    }

    public void setIm0510amm(String im0510amm) {
        this.im0510amm = im0510amm;
        notifyPropertyChanged(BR.im0510amm);
    }

    @Bindable
    public String getIm0510ayy() {
        return im0510ayy;
    }

    public void setIm0510ayy(String im0510ayy) {
        this.im0510ayy = im0510ayy;
        notifyPropertyChanged(BR.im0510ayy);
    }

    @Bindable
    public String getIm0511dd() {
        return im0511dd;
    }

    public void setIm0511dd(String im0511dd) {
        this.im0511dd = im0511dd;
        boolean b = im0511dd.length() > 0 && Integer.parseInt(im0511dd) > 31;
        setIm0511mm(b ? "" : this.im0511mm);
        setIm0511yy(b ? "" : this.im0511yy);
        notifyPropertyChanged(BR.im0511dd);
    }

    @Bindable
    public String getIm0511mm() {
        return im0511mm;
    }

    public void setIm0511mm(String im0511mm) {
        this.im0511mm = im0511mm;
        notifyPropertyChanged(BR.im0511mm);
    }

    @Bindable
    public String getIm0511yy() {
        return im0511yy;
    }

    public void setIm0511yy(String im0511yy) {
        this.im0511yy = im0511yy;
        notifyPropertyChanged(BR.im0511yy);
    }

    @Bindable
    public String getIm0512dd() {
        return im0512dd;
    }

    public void setIm0512dd(String im0512dd) {
        this.im0512dd = im0512dd;
        boolean b = im0512dd.length() > 0 && Integer.parseInt(im0512dd) > 31;
        setIm0512mm(b ? "" : this.im0512mm);
        setIm0512yy(b ? "" : this.im0512yy);
        notifyPropertyChanged(BR.im0512dd);
    }

    @Bindable
    public String getIm0512mm() {
        return im0512mm;
    }

    public void setIm0512mm(String im0512mm) {
        this.im0512mm = im0512mm;
        notifyPropertyChanged(BR.im0512mm);
    }

    @Bindable
    public String getIm0512yy() {
        return im0512yy;
    }

    public void setIm0512yy(String im0512yy) {
        this.im0512yy = im0512yy;
        notifyPropertyChanged(BR.im0512yy);
    }

    @Bindable
    public String getIm0513dd() {
        return im0513dd;
    }

    public void setIm0513dd(String im0513dd) {
        this.im0513dd = im0513dd;
        boolean b = im0513dd.length() > 0 && Integer.parseInt(im0513dd) > 31;
        setIm0513mm(b ? "" : this.im0513mm);
        setIm0513yy(b ? "" : this.im0513yy);
        notifyPropertyChanged(BR.im0513dd);
    }

    @Bindable
    public String getIm0513mm() {
        return im0513mm;
    }

    public void setIm0513mm(String im0513mm) {
        this.im0513mm = im0513mm;
        notifyPropertyChanged(BR.im0513mm);
    }

    @Bindable
    public String getIm0513yy() {
        return im0513yy;
    }

    public void setIm0513yy(String im0513yy) {
        this.im0513yy = im0513yy;
        notifyPropertyChanged(BR.im0513yy);
    }

    @Bindable
    public String getIm0514dd() {
        return im0514dd;
    }

    public void setIm0514dd(String im0514dd) {
        this.im0514dd = im0514dd;
        boolean b = im0514dd.length() > 0 && Integer.parseInt(im0514dd) > 31;
        setIm0514mm(b ? "" : this.im0514mm);
        setIm0514yy(b ? "" : this.im0514yy);
        notifyPropertyChanged(BR.im0514dd);
    }

    @Bindable
    public String getIm0514mm() {
        return im0514mm;
    }

    public void setIm0514mm(String im0514mm) {
        this.im0514mm = im0514mm;
        notifyPropertyChanged(BR.im0514mm);
    }

    @Bindable
    public String getIm0514yy() {
        return im0514yy;
    }

    public void setIm0514yy(String im0514yy) {
        this.im0514yy = im0514yy;
        notifyPropertyChanged(BR.im0514yy);
    }

    @Bindable
    public String getIm0515dd() {
        return im0515dd;
    }

    public void setIm0515dd(String im0515dd) {
        this.im0515dd = im0515dd;
        boolean b = im0515dd.length() > 0 && Integer.parseInt(im0515dd) > 31;
        setIm0515mm(b ? "" : this.im0515mm);
        setIm0515yy(b ? "" : this.im0515yy);
        notifyPropertyChanged(BR.im0515dd);
    }

    @Bindable
    public String getIm0515mm() {
        return im0515mm;
    }

    public void setIm0515mm(String im0515mm) {
        this.im0515mm = im0515mm;
        notifyPropertyChanged(BR.im0515mm);
    }

    @Bindable
    public String getIm0515yy() {
        return im0515yy;
    }

    public void setIm0515yy(String im0515yy) {
        this.im0515yy = im0515yy;
        notifyPropertyChanged(BR.im0515yy);
    }

    @Bindable
    public String getIm0515bdd() {
        return im0515bdd;
    }

    public void setIm0515bdd(String im0515bdd) {
        this.im0515bdd = im0515bdd;
        boolean b = im0515bdd.length() > 0 && Integer.parseInt(im0515bdd) > 31;
        setIm0515bmm(b ? "" : this.im0515bmm);
        setIm0515byy(b ? "" : this.im0515byy);
        notifyPropertyChanged(BR.im0515bdd);
    }

    @Bindable
    public String getIm0515bmm() {
        return im0515bmm;
    }

    public void setIm0515bmm(String im0515bmm) {
        this.im0515bmm = im0515bmm;
        notifyPropertyChanged(BR.im0515bmm);
    }

    @Bindable
    public String getIm0515byy() {
        return im0515byy;
    }

    public void setIm0515byy(String im0515byy) {
        this.im0515byy = im0515byy;
        notifyPropertyChanged(BR.im0515byy);
    }

    @Bindable
    public String getIm0516dd() {
        return im0516dd;
    }

    public void setIm0516dd(String im0516dd) {
        this.im0516dd = im0516dd;
        boolean b = im0516dd.length() > 0 && Integer.parseInt(im0516dd) > 31;
        setIm0516mm(b ? "" : this.im0516mm);
        setIm0516yy(b ? "" : this.im0516yy);
        notifyPropertyChanged(BR.im0516dd);
    }

    @Bindable
    public String getIm0516mm() {
        return im0516mm;
    }

    public void setIm0516mm(String im0516mm) {
        this.im0516mm = im0516mm;
        notifyPropertyChanged(BR.im0516mm);
    }

    @Bindable
    public String getIm0516yy() {
        return im0516yy;
    }

    public void setIm0516yy(String im0516yy) {
        this.im0516yy = im0516yy;
        notifyPropertyChanged(BR.im0516yy);
    }

    @Bindable
    public String getIm0517dd() {
        return im0517dd;
    }

    public void setIm0517dd(String im0517dd) {
        this.im0517dd = im0517dd;
        boolean b = im0517dd.length() > 0 && Integer.parseInt(im0517dd) > 31;
        setIm0517mm(b ? "" : this.im0517mm);
        setIm0517yy(b ? "" : this.im0517yy);
        notifyPropertyChanged(BR.im0517dd);
    }

    @Bindable
    public String getIm0517mm() {
        return im0517mm;
    }

    public void setIm0517mm(String im0517mm) {
        this.im0517mm = im0517mm;
        notifyPropertyChanged(BR.im0517mm);
    }

    @Bindable
    public String getIm0517yy() {
        return im0517yy;
    }

    public void setIm0517yy(String im0517yy) {
        this.im0517yy = im0517yy;
        notifyPropertyChanged(BR.im0517yy);
    }

    /*@Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }*/

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;

        setIm09(im08.equals("1") ? this.im09 : "");
        setIm10(im08.equals("1") ? this.im10 : "");
        setIm2401(im08.equals("2") || im08.equals("98") ? this.im2401 : "");
        setIm2401(im08.equals("2") || im08.equals("98") ? this.im2401 : "");
        setIm2402(im08.equals("2") || im08.equals("98") ? this.im2402 : "");
        setIm2403(im08.equals("2") || im08.equals("98") ? this.im2403 : "");
        setIm2404(im08.equals("2") || im08.equals("98") ? this.im2404 : "");
        setIm2405(im08.equals("2") || im08.equals("98") ? this.im2405 : "");
        setIm2406(im08.equals("2") || im08.equals("98") ? this.im2406 : "");
        setIm2407(im08.equals("2") || im08.equals("98") ? this.im2407 : "");
        setIm2408(im08.equals("2") || im08.equals("98") ? this.im2408 : "");
        setIm2409(im08.equals("2") || im08.equals("98") ? this.im2409 : "");
        setIm2410(im08.equals("2") || im08.equals("98") ? this.im2410 : "");
        setIm2411(im08.equals("2") || im08.equals("98") ? this.im2411 : "");
        setIm2412(im08.equals("2") || im08.equals("98") ? this.im2412 : "");
        setIm2413(im08.equals("2") || im08.equals("98") ? this.im2413 : "");
        setIm2414(im08.equals("2") || im08.equals("98") ? this.im2414 : "");
        setIm2415(im08.equals("2") || im08.equals("98") ? this.im2415 : "");
        setIm2416(im08.equals("2") || im08.equals("98") ? this.im2416 : "");
        setIm2496(im08.equals("2") || im08.equals("98") ? this.im2496 : "");
        setIm2498(im08.equals("2") || im08.equals("98") ? this.im2498 : "");
        setIm24a(im08.equals("2") || im08.equals("98") ? this.im24a : "");
        setIm10a(im08.equals("1") ? this.im10a : "");
        setIm11(im08.equals("1") ? this.im11 : "");
        setIm12(im08.equals("1") ? this.im12 : "");
        setIm12a(im08.equals("1") ? this.im12a : "");
        setIm14(im08.equals("1") ? this.im14 : "");
        setIm15(im08.equals("1") ? this.im15 : "");
        setIm16(im08.equals("1") ? this.im16 : "");
        setIm17(im08.equals("1") ? this.im17 : "");
        setIm18(im08.equals("1") ? this.im18 : "");
        setIm19(im08.equals("1") ? this.im19 : "");
        setIm20(im08.equals("1") ? this.im20 : "");
        //setIm20a(im08.equals("1") ? this.im20a : "");

        setIm21(im08.equals("1") ? this.im21 : "");
        setIm22(im08.equals("1") ? this.im22 : "");
        setIm22a(im08.equals("1") ? this.im22a : "");
        setIm23(im08.equals("1") || this.im02.equals("1") ? this.im23 : "");
        setIm23a(im08.equals("1") || this.im02.equals("1") ? this.im23a : "");

        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        setIm11(im10.equals("1") ? this.im11 : "");
        setIm12(im10.equals("1") ? this.im12 : "");
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm10a() {
        return im10a;
    }

    public void setIm10a(String im10a) {
        this.im10a = im10a;
        notifyPropertyChanged(BR.im10a);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        setIm12(im11.equals("1") ? this.im12 : "");
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm12a() {
        return im12a;
    }

    public void setIm12a(String im12a) {
        this.im12a = im12a;
        notifyPropertyChanged(BR.im12a);
    }

    @Bindable
    public String getIm12a98() {
        return im12a98;
    }

    public void setIm12a98(String im12a98) {
        if (this.im12a98.equals(im12a98)) return;
        this.im12a98 = im12a98;
        setIm12a(im12a98.equals("98") ? "" : this.im12a);
        notifyPropertyChanged(BR.im12a98);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        setIm15(im14.equals("1") ? this.im15 : "");
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        setIm17(im16.equals("1") ? this.im17 : "");
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        setIm19(im18.equals("1") ? this.im19 : "");
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        setIm20a(im20.equals("1") ? this.im20a : "");
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm20a() {
        return im20a;
    }

    public void setIm20a(String im20a) {
        this.im20a = im20a;
        notifyPropertyChanged(BR.im20a);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        setIm22(im21.equals("1") ? this.im22 : "");

        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm22a() {
        return im22a;
    }

    public void setIm22a(String im22a) {
        this.im22a = im22a;
        notifyPropertyChanged(BR.im22a);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm236x() {
        return im236x;
    }

    public void setIm236x(String im236x) {
        this.im236x = im236x;
        notifyPropertyChanged(BR.im236x);
    }

    @Bindable
    public String getIm23a() {
        return im23a;
    }

    public void setIm23a(String im23a) {
        this.im23a = im23a;
        notifyPropertyChanged(BR.im23a);
    }


    @Bindable
    public String getIm2401() {
        return im2401;
    }

    public void setIm2401(String im2401) {
        if (this.im2401.equals(im2401)) return;
        this.im2401 = im2401;
        notifyPropertyChanged(BR.im2401);
    }


    @Bindable
    public String getIm2402() {
        return im2402;
    }

    public void setIm2402(String im2402) {
        if (this.im2402.equals(im2402)) return;
        this.im2402 = im2402;
        notifyPropertyChanged(BR.im2402);
    }


    @Bindable
    public String getIm2403() {
        return im2403;
    }

    public void setIm2403(String im2403) {
        if (this.im2403.equals(im2403)) return;
        this.im2403 = im2403;
        notifyPropertyChanged(BR.im2403);
    }


    @Bindable
    public String getIm2404() {
        return im2404;
    }

    public void setIm2404(String im2404) {
        if (this.im2404.equals(im2404)) return;
        this.im2404 = im2404;
        notifyPropertyChanged(BR.im2404);
    }


    @Bindable
    public String getIm2405() {
        return im2405;
    }

    public void setIm2405(String im2405) {
        if (this.im2405.equals(im2405)) return;
        this.im2405 = im2405;
        notifyPropertyChanged(BR.im2405);
    }


    @Bindable
    public String getIm2406() {
        return im2406;
    }

    public void setIm2406(String im2406) {
        if (this.im2406.equals(im2406)) return;
        this.im2406 = im2406;
        notifyPropertyChanged(BR.im2406);
    }


    @Bindable
    public String getIm2407() {
        return im2407;
    }

    public void setIm2407(String im2407) {
        if (this.im2407.equals(im2407)) return;
        this.im2407 = im2407;
        notifyPropertyChanged(BR.im2407);
    }


    @Bindable
    public String getIm2408() {
        return im2408;
    }

    public void setIm2408(String im2408) {
        if (this.im2408.equals(im2408)) return;
        this.im2408 = im2408;
        notifyPropertyChanged(BR.im2408);
    }


    @Bindable
    public String getIm2409() {
        return im2409;
    }

    public void setIm2409(String im2409) {
        if (this.im2409.equals(im2409)) return;
        this.im2409 = im2409;
        notifyPropertyChanged(BR.im2409);
    }


    @Bindable
    public String getIm2410() {
        return im2410;
    }

    public void setIm2410(String im2410) {
        if (this.im2410.equals(im2410)) return;
        this.im2410 = im2410;
        notifyPropertyChanged(BR.im2410);
    }


    @Bindable
    public String getIm2411() {
        return im2411;
    }

    public void setIm2411(String im2411) {
        if (this.im2411.equals(im2411)) return;
        this.im2411 = im2411;
        notifyPropertyChanged(BR.im2411);
    }


    @Bindable
    public String getIm2412() {
        return im2412;
    }

    public void setIm2412(String im2412) {
        if (this.im2412.equals(im2412)) return;
        this.im2412 = im2412;
        notifyPropertyChanged(BR.im2412);
    }


    @Bindable
    public String getIm2413() {
        return im2413;
    }

    public void setIm2413(String im2413) {
        if (this.im2413.equals(im2413)) return;
        this.im2413 = im2413;
        notifyPropertyChanged(BR.im2413);
    }


    @Bindable
    public String getIm2414() {
        return im2414;
    }

    public void setIm2414(String im2414) {
        if (this.im2414.equals(im2414)) return;
        this.im2414 = im2414;
        notifyPropertyChanged(BR.im2414);
    }


    @Bindable
    public String getIm2415() {
        return im2415;
    }

    public void setIm2415(String im2415) {
        if (this.im2415.equals(im2415)) return;
        this.im2415 = im2415;
        notifyPropertyChanged(BR.im2415);
    }


    @Bindable
    public String getIm2416() {
        return im2416;
    }

    public void setIm2416(String im2416) {
        if (this.im2416.equals(im2416)) return;
        this.im2416 = im2416;
        notifyPropertyChanged(BR.im2416);
    }


    @Bindable
    public String getIm2498() {
        return im2498;
    }

    public void setIm2498(String im2498) {
        if (this.im2498.equals(im2498)) return;
        this.im2498 = im2498;
        setIm2401(im2498.equals("98") ? "" : this.im2401);
        setIm2402(im2498.equals("98") ? "" : this.im2402);
        setIm2403(im2498.equals("98") ? "" : this.im2403);
        setIm2404(im2498.equals("98") ? "" : this.im2404);
        setIm2405(im2498.equals("98") ? "" : this.im2405);
        setIm2406(im2498.equals("98") ? "" : this.im2406);
        setIm2407(im2498.equals("98") ? "" : this.im2407);
        setIm2408(im2498.equals("98") ? "" : this.im2408);
        setIm2409(im2498.equals("98") ? "" : this.im2409);
        setIm2410(im2498.equals("98") ? "" : this.im2410);
        setIm2411(im2498.equals("98") ? "" : this.im2411);
        setIm2412(im2498.equals("98") ? "" : this.im2412);
        setIm2413(im2498.equals("98") ? "" : this.im2413);
        setIm2414(im2498.equals("98") ? "" : this.im2414);
        setIm2415(im2498.equals("98") ? "" : this.im2415);
        setIm2416(im2498.equals("98") ? "" : this.im2416);
        setIm2496(im2498.equals("98") ? "" : this.im2496);
        notifyPropertyChanged(BR.im2498);
    }


    @Bindable
    public String getIm2496() {
        return im2496;
    }

    public void setIm2496(String im2496) {
        if (this.im2496.equals(im2496)) return;
        this.im2496 = im2496;
        setIm2496x(im2496.equals("96") ? this.im2496x : "");
        notifyPropertyChanged(BR.im2496);
    }


    @Bindable
    public String getIm2496x() {
        return im2496x;
    }

    public void setIm2496x(String im2496x) {
        this.im2496x = im2496x;
        notifyPropertyChanged(BR.im2496x);
    }

    @Bindable
    public String getIm24a() {
        return im24a;
    }

    public void setIm24a(String im24a) {
        this.im24a = im24a;
        setIm24b98(im24b.equals("1") ? this.im24b98 : "");
        setIm24c(im24a.equals("1") ? this.im24c : "");
        setIm25(im24a.equals("2") ? this.im25 : "");
        setIm26(im24a.equals("2") ? this.im26 : "");
        setB110(im24a.equals("1") ? this.b110 : "");
        setB114(im24a.equals("1") ? this.b114 : "");
        /* setIm24d(im24a.equals("1") ? this.im24d : "");*/
        notifyPropertyChanged(BR.im24a);
    }

    @Bindable
    public String getIm24b() {
        return im24b;
    }

    public void setIm24b(String im24b) {
        this.im24b = im24b;
        notifyPropertyChanged(BR.im24b);
    }

    @Bindable
    public String getIm24b98() {
        return im24b98;
    }

    public void setIm24b98(String im24b98) {
        if (this.im24b98.equals(im24b98)) return;
        this.im24b98 = im24b98;
        setIm24b(im24b98.equals("98") ? "" : this.im24b);
        notifyPropertyChanged(BR.im24b98);
    }

    @Bindable
    public String getIm24c() {
        return im24c;
    }

    public void setIm24c(String im24c) {
        this.im24c = im24c;
        setB110(im24c.equals("1") ? this.b110 : "");
        setB114(im24c.equals("1") ? this.b114 : "");
        setB11201(im24c.equals("1") ? "" : this.b11201);
        setB11202(im24c.equals("1") ? "" : this.b11202);
        setB11203(im24c.equals("1") ? "" : this.b11203);
        setB11204(im24c.equals("1") ? "" : this.b11204);
        setB11205(im24c.equals("1") ? "" : this.b11205);
        setB11206(im24c.equals("1") ? "" : this.b11206);
        setB11207(im24c.equals("1") ? "" : this.b11207);
        setB11208(im24c.equals("1") ? "" : this.b11208);
        setB11209(im24c.equals("1") ? "" : this.b11209);
        setB11210(im24c.equals("1") ? "" : this.b11210);
        setB11296(im24c.equals("1") ? "" : this.b11296);
        notifyPropertyChanged(BR.im24c);
    }

    /* @Bindable
     public String getIm24d() {
         return im24d;
     }

     public void setIm24d(String im24d) {
         this.im24d = im24d;
         notifyPropertyChanged(BR.im24d);
     }
 */
    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }

    @Bindable
    public String getIm050198() {
        return im050198;
    }

    public void setIm050198(String im050198) {
        this.im050198 = im050198;
        /*setIm0501dd(im050198.equals("98") ? "" : this.im0501dd);
        setIm0501mm(im050198.equals("98") ? "" : this.im0501mm);
        setIm0501yy(im050198.equals("98") ? "" : this.im0501yy);*/
        notifyPropertyChanged(BR.im050198);
    }

    @Bindable
    public String getIm050298() {
        return im050298;
    }

    public void setIm050298(String im050298) {
        this.im050298 = im050298;
        /*setIm0502dd(im050298.equals("98") ? "" : this.im0502dd);
        setIm0502mm(im050298.equals("98") ? "" : this.im0502mm);
        setIm0502yy(im050298.equals("98") ? "" : this.im0502yy);*/
        notifyPropertyChanged(BR.im050298);
    }

    @Bindable
    public String getIm050398() {
        return im050398;
    }

    public void setIm050398(String im050398) {
        this.im050398 = im050398;
        /*setIm0503dd(im050398.equals("98") ? "" : this.im0503dd);
        setIm0503mm(im050398.equals("98") ? "" : this.im0503mm);
        setIm0503yy(im050398.equals("98") ? "" : this.im0503yy);*/
        notifyPropertyChanged(BR.im050398);
    }

    @Bindable
    public String getIm050498() {
        return im050498;
    }

    public void setIm050498(String im050498) {
        this.im050498 = im050498;
        /*setIm0504dd(im050498.equals("98") ? "" : this.im0504dd);
        setIm0504mm(im050498.equals("98") ? "" : this.im0504mm);
        setIm0504yy(im050498.equals("98") ? "" : this.im0504yy);*/
        notifyPropertyChanged(BR.im050498);
    }

    @Bindable
    public String getIm050598() {
        return im050598;
    }

    public void setIm050598(String im050598) {
        this.im050598 = im050598;
        /*setIm0505dd(im050598.equals("98") ? "" : this.im0505dd);
        setIm0505mm(im050598.equals("98") ? "" : this.im0505mm);
        setIm0505yy(im050598.equals("98") ? "" : this.im0505yy);*/
        notifyPropertyChanged(BR.im050598);
    }

    @Bindable
    public String getIm050698() {
        return im050698;
    }

    public void setIm050698(String im050698) {
        this.im050698 = im050698;
        /*setIm0506dd(im050698.equals("98") ? "" : this.im0506dd);
        setIm0506mm(im050698.equals("98") ? "" : this.im0506mm);
        setIm0506yy(im050698.equals("98") ? "" : this.im0506yy);*/
        notifyPropertyChanged(BR.im050698);
    }

    @Bindable
    public String getIm050798() {
        return im050798;
    }

    public void setIm050798(String im050798) {
        this.im050798 = im050798;
        /*setIm0507dd(im050798.equals("98") ? "" : this.im0507dd);
        setIm0507mm(im050798.equals("98") ? "" : this.im0507mm);
        setIm0507yy(im050798.equals("98") ? "" : this.im0507yy);*/
        notifyPropertyChanged(BR.im050798);
    }

    @Bindable
    public String getIm050898() {
        return im050898;
    }

    public void setIm050898(String im050898) {
        this.im050898 = im050898;
        /*setIm0508dd(im050898.equals("98") ? "" : this.im0508dd);
        setIm0508mm(im050898.equals("98") ? "" : this.im0508mm);
        setIm0508yy(im050898.equals("98") ? "" : this.im0508yy);*/
        notifyPropertyChanged(BR.im050898);
    }

    @Bindable
    public String getIm050998() {
        return im050998;
    }

    public void setIm050998(String im050998) {
        this.im050998 = im050998;
        /*setIm0509dd(im050998.equals("98") ? "" : this.im0509dd);
        setIm0509mm(im050998.equals("98") ? "" : this.im0509mm);
        setIm0509yy(im050998.equals("98") ? "" : this.im0509yy);*/
        notifyPropertyChanged(BR.im050998);
    }

    @Bindable
    public String getIm051098() {
        return im051098;
    }

    public void setIm051098(String im051098) {
        this.im051098 = im051098;
        /*setIm0510dd(im051098.equals("98") ? "" : this.im0510dd);
        setIm0510mm(im051098.equals("98") ? "" : this.im0510mm);
        setIm0510yy(im051098.equals("98") ? "" : this.im0510yy);*/
        notifyPropertyChanged(BR.im051098);
    }

    @Bindable
    public String getIm0510a98() {
        return im0510a98;
    }

    public void setIm0510a98(String im0510a98) {
        this.im0510a98 = im0510a98;
        /*setIm0510add(im0510a98.equals("98") ? "" : this.im0510add);
        setIm0510amm(im0510a98.equals("98") ? "" : this.im0510amm);
        setIm0510ayy(im0510a98.equals("98") ? "" : this.im0510ayy);*/
        notifyPropertyChanged(BR.im0510a98);
    }

    @Bindable
    public String getIm051198() {
        return im051198;
    }

    public void setIm051198(String im051198) {
        this.im051198 = im051198;
        /*setIm0511dd(im051198.equals("98") ? "" : this.im0511dd);
        setIm0511mm(im051198.equals("98") ? "" : this.im0511mm);
        setIm0511yy(im051198.equals("98") ? "" : this.im0511yy);*/
        notifyPropertyChanged(BR.im051198);
    }

    @Bindable
    public String getIm051298() {
        return im051298;
    }

    public void setIm051298(String im051298) {
        this.im051298 = im051298;
        /*setIm0512dd(im051298.equals("98") ? "" : this.im0512dd);
        setIm0512mm(im051298.equals("98") ? "" : this.im0512mm);
        setIm0512yy(im051298.equals("98") ? "" : this.im0512yy);*/
        notifyPropertyChanged(BR.im051298);
    }

    @Bindable
    public String getIm051398() {
        return im051398;
    }

    public void setIm051398(String im051398) {
        this.im051398 = im051398;
        /*setIm0513dd(im051398.equals("98") ? "" : this.im0513dd);
        setIm0513mm(im051398.equals("98") ? "" : this.im0513mm);
        setIm0513yy(im051398.equals("98") ? "" : this.im0513yy);*/
        notifyPropertyChanged(BR.im051398);
    }

    @Bindable
    public String getIm051498() {
        return im051498;
    }

    public void setIm051498(String im051498) {
        this.im051498 = im051498;
        /*setIm0514dd(im051498.equals("98") ? "" : this.im0514dd);
        setIm0514mm(im051498.equals("98") ? "" : this.im0514mm);
        setIm0514yy(im051498.equals("98") ? "" : this.im0514yy);*/
        notifyPropertyChanged(BR.im051498);
    }

    @Bindable
    public String getIm051598() {
        return im051598;
    }

    public void setIm051598(String im051598) {
        this.im051598 = im051598;
        /*setIm0515dd(im051598.equals("98") ? "" : this.im0515dd);
        setIm0515mm(im051598.equals("98") ? "" : this.im0515mm);
        setIm0515yy(im051598.equals("98") ? "" : this.im0515yy);*/
        notifyPropertyChanged(BR.im051598);
    }

    @Bindable
    public String getIm0515b98() {
        return im0515b98;
    }

    public void setIm0515b98(String im0515b98) {
        this.im0515b98 = im0515b98;
        /*setIm0515bdd(im0515b98.equals("98") ? "" : this.im0515bdd);
        setIm0515bmm(im0515b98.equals("98") ? "" : this.im0515bmm);
        setIm0515byy(im0515b98.equals("98") ? "" : this.im0515byy);*/
        notifyPropertyChanged(BR.im0515b98);
    }

    @Bindable
    public String getIm051698() {
        return im051698;
    }

    public void setIm051698(String im051698) {
        this.im051698 = im051698;
        /*setIm0516dd(im051698.equals("98") ? "" : this.im0516dd);
        setIm0516mm(im051698.equals("98") ? "" : this.im0516mm);
        setIm0516yy(im051698.equals("98") ? "" : this.im0516yy);*/
        notifyPropertyChanged(BR.im051698);
    }

    @Bindable
    public String getIm051798() {
        return im051798;
    }

    public void setIm051798(String im051798) {
        this.im051798 = im051798;
        /*setIm0517dd(im051798.equals("98") ? "" : this.im0517dd);
        setIm0517mm(im051798.equals("98") ? "" : this.im0517mm);
        setIm0517yy(im051798.equals("98") ? "" : this.im0517yy);*/
        notifyPropertyChanged(BR.im051798);
    }


    @Bindable
    public String getIm050295() {
        return im050295;
    }

    public void setIm050295(String im050295) {
        if (this.im050295.equals(im050295)) return; // for all checkboxes
        this.im050295 = im050295;
        setIm0502dd(im050295.equals("95") ? this.im0501dd : "");
        setIm0502mm(im050295.equals("95") ? this.im0501mm : "");
        setIm0502yy(im050295.equals("95") ? this.im0501yy : "");
        notifyPropertyChanged(BR.im050295);
    }

    @Bindable
    public String getIm050495() {
        return im050495;
    }

    public void setIm050495(String im050495) {
        if (this.im050495.equals(im050495)) return; // for all checkboxes
        this.im050495 = im050495;
        setIm0504dd(im050495.equals("95") ? this.im0503dd : "");
        setIm0504mm(im050495.equals("95") ? this.im0503mm : "");
        setIm0504yy(im050495.equals("95") ? this.im0503yy : "");

        setIm050595(im050495.equals("95") ? this.im050595 : "");
        notifyPropertyChanged(BR.im050495);
    }

    @Bindable
    public String getIm050595() {
        return im050595;
    }

    public void setIm050595(String im050595) {
        if (this.im050595.equals(im050595)) return; // for all checkboxes
        this.im050595 = im050595;
        setIm0505dd(im050595.equals("95") ? this.im0504dd : "");
        setIm0505mm(im050595.equals("95") ? this.im0504mm : "");
        setIm0505yy(im050595.equals("95") ? this.im0504yy : "");

        setIm050695(im050595.equals("95") ? this.im050695 : "");
        notifyPropertyChanged(BR.im050595);
    }

    @Bindable
    public String getIm050695() {
        return im050695;
    }

    public void setIm050695(String im050695) {
        if (this.im050695.equals(im050695)) return; // for all checkboxes
        this.im050695 = im050695;
        setIm0506dd(im050695.equals("95") ? this.im0505dd : "");
        setIm0506mm(im050695.equals("95") ? this.im0505mm : "");
        setIm0506yy(im050695.equals("95") ? this.im0505yy : "");
        notifyPropertyChanged(BR.im050695);
    }

    @Bindable
    public String getIm050895() {
        return im050895;
    }

    public void setIm050895(String im050895) {
        if (this.im050895.equals(im050895)) return; // for all checkboxes
        this.im050895 = im050895;
        setIm0508dd(im050895.equals("95") ? this.im0507dd : "");
        setIm0508mm(im050895.equals("95") ? this.im0507mm : "");
        setIm0508yy(im050895.equals("95") ? this.im0507yy : "");

        setIm050995(im050895.equals("95") ? this.im050995 : "");
        notifyPropertyChanged(BR.im050895);
    }

    @Bindable
    public String getIm050995() {
        return im050995;
    }

    public void setIm050995(String im050995) {
        if (this.im050995.equals(im050995)) return; // for all checkboxes
        this.im050995 = im050995;
        setIm0509dd(im050995.equals("95") ? this.im0508dd : "");
        setIm0509mm(im050995.equals("95") ? this.im0508mm : "");
        setIm0509yy(im050995.equals("95") ? this.im0508yy : "");

        setIm051095(im050995.equals("95") ? this.im051095 : "");
        notifyPropertyChanged(BR.im050995);
    }

    @Bindable
    public String getIm051095() {
        return im051095;
    }

    public void setIm051095(String im051095) {
        if (this.im051095.equals(im051095)) return; // for all checkboxes
        this.im051095 = im051095;
        setIm0510dd(im051095.equals("95") ? this.im0509dd : "");
        setIm0510mm(im051095.equals("95") ? this.im0509mm : "");
        setIm0510yy(im051095.equals("95") ? this.im0509yy : "");

        setIm0510a95(im051095.equals("95") ? this.im0510a95 : "");
        notifyPropertyChanged(BR.im051095);
    }

    @Bindable
    public String getIm0510a95() {
        return im0510a95;
    }

    public void setIm0510a95(String im0510a95) {
        if (this.im0510a95.equals(im0510a95)) return; // for all checkboxes
        this.im0510a95 = im0510a95;
        setIm0510add(im0510a95.equals("95") ? this.im0502dd : "");
        setIm0510amm(im0510a95.equals("95") ? this.im0502mm : "");
        setIm0510ayy(im0510a95.equals("95") ? this.im0502yy : "");
        notifyPropertyChanged(BR.im0510a95);
    }

    @Bindable
    public String getIm051295() {
        return im051295;
    }

    public void setIm051295(String im051295) {
        if (this.im051295.equals(im051295)) return; // for all checkboxes
        this.im051295 = im051295;
        setIm0512dd(im051295.equals("95") ? this.im0511dd : "");
        setIm0512mm(im051295.equals("95") ? this.im0511mm : "");
        setIm0512yy(im051295.equals("95") ? this.im0511yy : "");

        setIm051395(im051295.equals("95") ? this.im051395 : "");
        notifyPropertyChanged(BR.im051295);
    }

    @Bindable
    public String getIm051395() {
        return im051395;
    }

    public void setIm051395(String im051395) {
        if (this.im051395.equals(im051395)) return; // for all checkboxes
        this.im051395 = im051395;
        setIm0513dd(im051395.equals("95") ? this.im0512dd : "");
        setIm0513mm(im051395.equals("95") ? this.im0512mm : "");
        setIm0513yy(im051395.equals("95") ? this.im0512yy : "");

        setIm051495(im051395.equals("95") ? this.im051495 : "");
        notifyPropertyChanged(BR.im051395);
    }

    @Bindable
    public String getIm051495() {
        return im051495;
    }

    public void setIm051495(String im051495) {
        if (this.im051495.equals(im051495)) return; // for all checkboxes
        this.im051495 = im051495;
        setIm0514dd(im051495.equals("95") ? this.im0513dd : "");
        setIm0514mm(im051495.equals("95") ? this.im0513mm : "");
        setIm0514yy(im051495.equals("95") ? this.im0513yy : "");
        notifyPropertyChanged(BR.im051495);
    }

    @Bindable
    public String getIm0515b95() {
        return im0515b95;
    }

    public void setIm0515b95(String im0515b95) {
        if (this.im0515b95.equals(im0515b95)) return; // for all checkboxes
        this.im0515b95 = im0515b95;
        setIm0515bdd(im0515b95.equals("95") ? this.im0515dd : "");
        setIm0515bmm(im0515b95.equals("95") ? this.im0515mm : "");
        setIm0515byy(im0515b95.equals("95") ? this.im0515yy : "");
        notifyPropertyChanged(BR.im0515b95);
    }

    @Bindable
    public String getIm051795() {
        return im051795;
    }

    public void setIm051795(String im051795) {
        if (this.im051795.equals(im051795)) return; // for all checkboxes
        this.im051795 = im051795;
        setIm0517dd(im051795.equals("95") ? this.im0515bdd : "");
        setIm0517mm(im051795.equals("95") ? this.im0515bmm : "");
        setIm0517yy(im051795.equals("95") ? this.im0515byy : "");
        notifyPropertyChanged(BR.im051795);
    }

    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        setB10801(b107.equals("1") ? this.b10801 : "");
        setB10802(b107.equals("1") ? this.b10802 : "");
        setB10803(b107.equals("1") ? this.b10803 : "");
        setB10804(b107.equals("1") ? this.b10804 : "");
        setB10805(b107.equals("1") ? this.b10805 : "");
        setB10898(b107.equals("1") ? this.b10898 : "");
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB108() {
        return b108;
    }

    public void setB108(String b108) {
        this.b108 = b108;
        notifyPropertyChanged(BR.b108);
    }

    @Bindable
    public String getB10801() {
        return b10801;
    }

    public void setB10801(String b10801) {
        if (this.b10801.equals(b10801)) return; // for all checkboxes
        this.b10801 = b10801;
        notifyPropertyChanged(BR.b10801);
    }

    @Bindable
    public String getB10802() {
        return b10802;
    }

    public void setB10802(String b10802) {
        if (this.b10802.equals(b10802)) return; // for all checkboxes
        this.b10802 = b10802;
        notifyPropertyChanged(BR.b10802);
    }

    @Bindable
    public String getB10803() {
        return b10803;
    }

    public void setB10803(String b10803) {
        if (this.b10803.equals(b10803)) return; // for all checkboxes
        this.b10803 = b10803;
        notifyPropertyChanged(BR.b10803);
    }

    @Bindable
    public String getB10804() {
        return b10804;
    }

    public void setB10804(String b10804) {
        if (this.b10804.equals(b10804)) return; // for all checkboxes
        this.b10804 = b10804;
        notifyPropertyChanged(BR.b10804);
    }

    @Bindable
    public String getB10805() {
        return b10805;
    }

    public void setB10805(String b10805) {
        if (this.b10805.equals(b10805)) return; // for all checkboxes
        this.b10805 = b10805;
        notifyPropertyChanged(BR.b10805);
    }

    @Bindable
    public String getB10898() {
        return b10898;
    }

    public void setB10898(String b10898) {
        if (this.b10898.equals(b10898)) return; // for all checkboxes
        this.b10898 = b10898;
        setB10801(b10898.equals("98") ? "" : this.b10801);
        setB10802(b10898.equals("98") ? "" : this.b10802);
        setB10803(b10898.equals("98") ? "" : this.b10803);
        setB10804(b10898.equals("98") ? "" : this.b10804);
        setB10805(b10898.equals("98") ? "" : this.b10805);
        notifyPropertyChanged(BR.b10898);
    }

    @Bindable
    public String getB110() {
        return b110;
    }

    public void setB110(String b110) {
        this.b110 = b110;
        notifyPropertyChanged(BR.b110);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB112() {
        return b112;
    }

    public void setB112(String b112) {
        this.b112 = b112;
        notifyPropertyChanged(BR.b112);
    }

    @Bindable
    public String getB11201() {
        return b11201;
    }

    public void setB11201(String b11201) {
        if (this.b11201.equals(b11201)) return; // for all checkboxes
        this.b11201 = b11201;
        notifyPropertyChanged(BR.b11201);
    }

    @Bindable
    public String getB11202() {
        return b11202;
    }

    public void setB11202(String b11202) {
        if (this.b11202.equals(b11202)) return; // for all checkboxes
        this.b11202 = b11202;
        notifyPropertyChanged(BR.b11202);
    }

    @Bindable
    public String getB11203() {
        return b11203;
    }

    public void setB11203(String b11203) {
        if (this.b11203.equals(b11203)) return; // for all checkboxes
        this.b11203 = b11203;
        notifyPropertyChanged(BR.b11203);
    }

    @Bindable
    public String getB11204() {
        return b11204;
    }

    public void setB11204(String b11204) {
        if (this.b11204.equals(b11204)) return; // for all checkboxes
        this.b11204 = b11204;
        notifyPropertyChanged(BR.b11204);
    }

    @Bindable
    public String getB11205() {
        return b11205;
    }

    public void setB11205(String b11205) {
        if (this.b11205.equals(b11205)) return; // for all checkboxes
        this.b11205 = b11205;
        notifyPropertyChanged(BR.b11205);
    }

    @Bindable
    public String getB11206() {
        return b11206;
    }

    public void setB11206(String b11206) {
        if (this.b11206.equals(b11206)) return; // for all checkboxes
        this.b11206 = b11206;
        notifyPropertyChanged(BR.b11206);
    }

    @Bindable
    public String getB11207() {
        return b11207;
    }

    public void setB11207(String b11207) {
        if (this.b11207.equals(b11207)) return; // for all checkboxes
        this.b11207 = b11207;
        notifyPropertyChanged(BR.b11207);
    }

    @Bindable
    public String getB11208() {
        return b11208;
    }

    public void setB11208(String b11208) {
        if (this.b11208.equals(b11208)) return; // for all checkboxes
        this.b11208 = b11208;
        notifyPropertyChanged(BR.b11208);
    }

    @Bindable
    public String getB11209() {
        return b11209;
    }

    public void setB11209(String b11209) {
        if (this.b11209.equals(b11209)) return; // for all checkboxes
        this.b11209 = b11209;
        notifyPropertyChanged(BR.b11209);
    }

    @Bindable
    public String getB11210() {
        return b11210;
    }

    public void setB11210(String b11210) {
        if (this.b11210.equals(b11210)) return; // for all checkboxes
        this.b11210 = b11210;
        notifyPropertyChanged(BR.b11210);
    }

    @Bindable
    public String getB11296() {
        return b11296;
    }

    public void setB11296(String b11296) {
        if (this.b11296.equals(b11296)) return; // for all checkboxes
        this.b11296 = b11296;
        setB11296x(b11296.equals("96") ? this.b11296x : "");
        notifyPropertyChanged(BR.b11296);
    }

    @Bindable
    public String getB11296x() {
        return b11296x;
    }

    public void setB11296x(String b11296x) {
        this.b11296x = b11296x;
        notifyPropertyChanged(BR.b11296x);
    }

    @Bindable
    public String getB105() {
        return b105;
    }

    public void setB105(String b105) {
        this.b105 = b105;
        setB10601(b105.equals(1) ? this.b10601 : "");
        setB10601x(b105.equals(1) ? this.b10601x : "");
        setB10602(b105.equals(1) ? this.b10602 : "");
        setB10602x(b105.equals(1) ? this.b10602x : "");
        notifyPropertyChanged(BR.b105);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB10601() {
        return b10601;
    }

    public void setB10601(String b10601) {
        if (this.b10601.equals(b10601)) return; // for all checkboxes
        this.b10601 = b10601;
        setB10601x(b10601.equals("1") ? this.b10601x : "");
        notifyPropertyChanged(BR.b10601);
    }

    @Bindable
    public String getB10601x() {
        return b10601x;
    }

    public void setB10601x(String b10601x) {
        this.b10601x = b10601x;
        notifyPropertyChanged(BR.b10601x);
    }

    @Bindable
    public String getB10602() {
        return b10602;
    }

    public void setB10602(String b10602) {
        if (this.b10602.equals(b10602)) return; // for all checkboxes
        this.b10602 = b10602;
        setB10602x(b10602.equals("2") ? this.b10602x : "");
        notifyPropertyChanged(BR.b10602);
    }

    @Bindable
    public String getB10602x() {
        return b10602x;
    }

    public void setB10602x(String b10602x) {
        this.b10602x = b10602x;
        notifyPropertyChanged(BR.b10602x);
    }

    @Bindable
    public String getB115() {
        return b115;
    }

    public void setB115(String b115) {
        this.b115 = b115;
        setB116(b115.equals("1") ? this.b116 : "");
        notifyPropertyChanged(BR.b115);
    }

    @Bindable
    public String getB116() {
        return b116;
    }

    public void setB116(String b116) {
        this.b116 = b116;
        notifyPropertyChanged(BR.b116);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        setB118(b117.equals("1") ? this.b118 : "");
        setB11901(b117.equals("1") ? this.b11901 : "");
        setB11902(b117.equals("1") ? this.b11902 : "");
        setB11903(b117.equals("1") ? this.b11903 : "");
        setB11904(b117.equals("1") ? this.b11904 : "");
        setB11905(b117.equals("1") ? this.b11905 : "");
        setB11906(b117.equals("1") ? this.b11906 : "");
        setB11996(b117.equals("1") ? this.b11996 : "");
        setB11998(b117.equals("1") ? this.b11998 : "");
        notifyPropertyChanged(BR.b117);
    }

    @Bindable
    public String getB118() {
        return b118;
    }

    public void setB118(String b118) {
        this.b118 = b118;
        setB11896x(b118.equals("96") ? this.b11896x : "");
        notifyPropertyChanged(BR.b118);
    }

    @Bindable
    public String getB11896x() {
        return b11896x;
    }

    public void setB11896x(String b11896x) {
        this.b11896x = b11896x;
        notifyPropertyChanged(BR.b11896x);
    }

    @Bindable
    public String getB11901() {
        return b11901;
    }

    public void setB11901(String b11901) {
        if (this.b11901.equals(b11901)) return; // for all checkboxes
        this.b11901 = b11901;
        notifyPropertyChanged(BR.b11901);
    }

    @Bindable
    public String getB11902() {
        return b11902;
    }

    public void setB11902(String b11902) {
        if (this.b11902.equals(b11902)) return; // for all checkboxes
        this.b11902 = b11902;
        notifyPropertyChanged(BR.b11902);
    }

    @Bindable
    public String getB11903() {
        return b11903;
    }

    public void setB11903(String b11903) {
        if (this.b11903.equals(b11903)) return; // for all checkboxes
        this.b11903 = b11903;
        notifyPropertyChanged(BR.b11903);
    }

    @Bindable
    public String getB11904() {
        return b11904;
    }

    public void setB11904(String b11904) {
        if (this.b11904.equals(b11904)) return; // for all checkboxes
        this.b11904 = b11904;
        notifyPropertyChanged(BR.b11904);
    }

    @Bindable
    public String getB11905() {
        return b11905;
    }

    public void setB11905(String b11905) {
        if (this.b11905.equals(b11905)) return; // for all checkboxes
        this.b11905 = b11905;
        notifyPropertyChanged(BR.b11905);
    }

    @Bindable
    public String getB11906() {
        return b11906;
    }

    public void setB11906(String b11906) {
        if (this.b11906.equals(b11906)) return; // for all checkboxes
        this.b11906 = b11906;
        notifyPropertyChanged(BR.b11906);
    }

    @Bindable
    public String getB11996() {
        return b11996;
    }

    public void setB11996(String b11996) {
        if (this.b11996.equals(b11996)) return; // for all checkboxes
        this.b11996 = b11996;
        setB11996x(b11996.equals("96") ? this.b11996x : "");
        notifyPropertyChanged(BR.b11996);
    }

    @Bindable
    public String getB11998() {
        return b11998;
    }

    public void setB11998(String b11998) {
        if (this.b11998.equals(b11998)) return; // for all checkboxes
        this.b11998 = b11998;
        setB11901(b11998.equals("98") ? "" : this.b11901);
        setB11902(b11998.equals("98") ? "" : this.b11902);
        setB11903(b11998.equals("98") ? "" : this.b11903);
        setB11904(b11998.equals("98") ? "" : this.b11904);
        setB11905(b11998.equals("98") ? "" : this.b11905);
        setB11906(b11998.equals("98") ? "" : this.b11906);
        setB11996(b11998.equals("98") ? "" : this.b11996);
        notifyPropertyChanged(BR.b11998);
    }

    @Bindable
    public String getB11996x() {
        return b11996x;
    }

    public void setB11996x(String b11996x) {
        this.b11996x = b11996x;
        notifyPropertyChanged(BR.b11996x);
    }

    @Bindable
    public String getB120() {
        return b120;
    }

    public void setB120(String b120) {
        this.b120 = b120;
        setB12101(b120.equals("1") ? this.b12101 : "");
        setB12102(b120.equals("1") ? this.b12102 : "");
        setB12103(b120.equals("1") ? this.b12103 : "");
        setB12104(b120.equals("1") ? this.b12104 : "");
        setB12105(b120.equals("1") ? this.b12105 : "");
        setB12196(b120.equals("1") ? this.b12196 : "");
        setB12198(b120.equals("1") ? this.b12198 : "");
        notifyPropertyChanged(BR.b120);
    }

    @Bindable
    public String getB121() {
        return b121;
    }

    public void setB121(String b121) {
        this.b121 = b121;
        notifyPropertyChanged(BR.b121);
    }

    @Bindable
    public String getB12101() {
        return b12101;
    }

    public void setB12101(String b12101) {
        if (this.b12101.equals(b12101)) return; // for all checkboxes
        this.b12101 = b12101;
        notifyPropertyChanged(BR.b12101);
    }

    @Bindable
    public String getB12102() {
        return b12102;
    }

    public void setB12102(String b12102) {
        if (this.b12102.equals(b12102)) return; // for all checkboxes
        this.b12102 = b12102;
        notifyPropertyChanged(BR.b12102);
    }

    @Bindable
    public String getB12103() {
        return b12103;
    }

    public void setB12103(String b12103) {
        if (this.b12103.equals(b12103)) return; // for all checkboxes
        this.b12103 = b12103;
        notifyPropertyChanged(BR.b12103);
    }

    @Bindable
    public String getB12104() {
        return b12104;
    }

    public void setB12104(String b12104) {
        if (this.b12104.equals(b12104)) return; // for all checkboxes
        this.b12104 = b12104;
        notifyPropertyChanged(BR.b12104);
    }

    @Bindable
    public String getB12105() {
        return b12105;
    }

    public void setB12105(String b12105) {
        if (this.b12105.equals(b12105)) return; // for all checkboxes
        this.b12105 = b12105;
        notifyPropertyChanged(BR.b12105);
    }

    @Bindable
    public String getB12196() {
        return b12196;
    }

    public void setB12196(String b12196) {
        if (this.b12196.equals(b12196)) return; // for all checkboxes
        this.b12196 = b12196;
        setB12196x(b12196.equals("96") ? this.b12196x : "");
        notifyPropertyChanged(BR.b12196);
    }

    @Bindable
    public String getB12198() {
        return b12198;
    }

    public void setB12198(String b12198) {
        if (this.b12198.equals(b12198)) return; // for all checkboxes
        this.b12198 = b12198;
        setB12101(b12198.equals("98") ? "" : this.b12101);
        setB12102(b12198.equals("98") ? "" : this.b12102);
        setB12103(b12198.equals("98") ? "" : this.b12103);
        setB12104(b12198.equals("98") ? "" : this.b12104);
        setB12105(b12198.equals("98") ? "" : this.b12105);
        setB12196(b12198.equals("98") ? "" : this.b12196);
        notifyPropertyChanged(BR.b12198);
    }

    @Bindable
    public String getB12196x() {
        return b12196x;
    }

    public void setB12196x(String b12196x) {
        this.b12196x = b12196x;
        notifyPropertyChanged(BR.b12196x);
    }


    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getLong(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
/*
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
*/
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_EB_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.cstatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_CSTATUS));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNC_DATE));

        sCHHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCH)));
        sCBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCB)));
        sIMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SIM)));
        //CaluculateAge();

        return this;
    }


    public void sCHHydrate(String string) throws JSONException {
        Log.d(TAG, "sCHHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            //this.ec12 = json.getString("ec12");
            this.ec13 = json.getString("ec13");
            this.ec14 = json.getString("ec14");
            this.ec15 = json.getString("ec15");
            this.ec16 = json.getString("ec16");
            this.ec17 = json.getString("ec17");
            this.cb03dd = json.getString("cb03dd");
            this.cb03mm = json.getString("cb03mm");
            this.cb03yy = json.getString("cb03yy");
            this.cb04mm = json.getString("cb04mm");
            this.cb04yy = json.getString("cb04yy");
            this.ageInMonths = json.getLong("ageInMonths");

        }

    }


    public void sCBHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ec01 = json.getString("ec01");
            this.ec02 = json.getString("ec02");
            this.ec03 = json.getString("ec03");
            this.ec04 = json.getString("ec04");
            this.ec04a = json.getString("ec04a");
            this.ec05 = json.getString("ec05");
            this.ec06 = json.getString("ec06");
            this.ec07 = json.getString("ec07");
            this.ec09 = json.getString("ec09");
            this.ec11 = json.getString("ec11");
            this.ec12 = json.getString("ec12");
            this.ec13cline = json.getString("ec13cline");
            this.ec14cname = json.getString("ec14cname");
            this.ec18 = json.getString("ec18");
            this.ec19 = json.getString("ec19");
            this.ec21 = json.getString("ec21");
            this.ec22 = json.getString("ec22");
            this.ec2206x = json.getString("ec2206x");
            this.ec2296x = json.getString("ec2296x");
            this.cb01a = json.getString("cb01a");
            this.cb01b = json.getString("cb01b");
            this.cb02a = json.getString("cb02a");
            this.cb02b = json.getString("cb02b");
        }
    }


    public void sIMHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im02a = json.getString("im02a");
            this.im02a96x = json.getString("im02a96x");
            this.im03 = json.getString("im03");
            this.im0396x = json.getString("im0396x");
            this.im04dd = json.getString("im04dd");
            this.trueAgeInMonths = json.has("trueAgeInMonths") ? Long.parseLong(json.getString("trueAgeInMonths")) : 0;
            this.im04mm = json.getString("im04mm");
            this.im04yy = json.getString("im04yy");
            this.im0497 = json.getString("im0497");
            this.backfilename = json.getString("backfilename");
            this.frontfilename = json.getString("frontfilename");
            this.im0501dd = json.getString("im0501dd");
            this.im0501mm = json.getString("im0501mm");
            this.im0501yy = json.getString("im0501yy");
            this.im0502dd = json.getString("im0502dd");
            this.im0502mm = json.getString("im0502mm");
            this.im0502yy = json.getString("im0502yy");
            this.im0503dd = json.getString("im0503dd");
            this.im0503mm = json.getString("im0503mm");
            this.im0503yy = json.getString("im0503yy");
            this.im0504dd = json.getString("im0504dd");
            this.im0504mm = json.getString("im0504mm");
            this.im0504yy = json.getString("im0504yy");
            this.im0505dd = json.getString("im0505dd");
            this.im0505mm = json.getString("im0505mm");
            this.im0505yy = json.getString("im0505yy");
            this.im0506dd = json.getString("im0506dd");
            this.im0506mm = json.getString("im0506mm");
            this.im0506yy = json.getString("im0506yy");
            this.im0507dd = json.getString("im0507dd");
            this.im0507mm = json.getString("im0507mm");
            this.im0507yy = json.getString("im0507yy");
            this.im0508dd = json.getString("im0508dd");
            this.im0508mm = json.getString("im0508mm");
            this.im0508yy = json.getString("im0508yy");
            this.im0509dd = json.getString("im0509dd");
            this.im0509mm = json.getString("im0509mm");
            this.im0509yy = json.getString("im0509yy");
            this.im0510dd = json.getString("im0510dd");
            this.im0510mm = json.getString("im0510mm");
            this.im0510yy = json.getString("im0510yy");
            this.im0510add = json.getString("im0510add");
            this.im0510amm = json.getString("im0510amm");
            this.im0510ayy = json.getString("im0510ayy");
            this.im0511dd = json.getString("im0511dd");
            this.im0511mm = json.getString("im0511mm");
            this.im0511yy = json.getString("im0511yy");
            this.im0512dd = json.getString("im0512dd");
            this.im0512mm = json.getString("im0512mm");
            this.im0512yy = json.getString("im0512yy");
            this.im0513dd = json.getString("im0513dd");
            this.im0513mm = json.getString("im0513mm");
            this.im0513yy = json.getString("im0513yy");
            this.im0514dd = json.getString("im0514dd");
            this.im0514mm = json.getString("im0514mm");
            this.im0514yy = json.getString("im0514yy");
            this.im0515dd = json.getString("im0515dd");
            this.im0515mm = json.getString("im0515mm");
            this.im0515yy = json.getString("im0515yy");
            this.im0515bdd = json.getString("im0515bdd");
            this.im0515bmm = json.getString("im0515bmm");
            this.im0515byy = json.getString("im0515byy");
            this.im0516dd = json.getString("im0516dd");
            this.im0516mm = json.getString("im0516mm");
            this.im0516yy = json.getString("im0516yy");
            this.im0517dd = json.getString("im0517dd");
            this.im0517mm = json.getString("im0517mm");
            this.im0517yy = json.getString("im0517yy");
            //this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im10a = json.getString("im10a");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im12a = json.getString("im12a");
            this.im12a98 = json.getString("im12a98");
            this.im14 = json.getString("im14");
            this.im15 = json.getString("im15");
            this.im16 = json.getString("im16");
            this.im17 = json.getString("im17");
            this.im18 = json.getString("im18");
            this.im19 = json.getString("im19");
            this.im20 = json.getString("im20");
            this.im20a = json.getString("im20a");
            this.im21 = json.getString("im21");
            this.im22 = json.getString("im22");
            this.im22a = json.getString("im22a");
            this.im23 = json.getString("im23");
            this.im236x = json.getString("im236x");
            this.im23a = json.getString("im23a");
            this.im2401 = json.getString("im2401");
            this.im2402 = json.getString("im2402");
            this.im2403 = json.getString("im2403");
            this.im2404 = json.getString("im2404");
            this.im2405 = json.getString("im2405");
            this.im2406 = json.getString("im2406");
            this.im2407 = json.getString("im2407");
            this.im2408 = json.getString("im2408");
            this.im2409 = json.getString("im2409");
            this.im2410 = json.getString("im2410");
            this.im2411 = json.getString("im2411");
            this.im2412 = json.getString("im2412");
            this.im2413 = json.getString("im2413");
            this.im2414 = json.getString("im2414");
            this.im2415 = json.getString("im2415");
            this.im2416 = json.getString("im2416");
            this.im2498 = json.getString("im2498");
            this.im2496 = json.getString("im2496");
            this.im2496x = json.getString("im2496x");
            this.im24a = json.getString("im24a");
            this.im24b = json.getString("im24b");
            this.im24b98 = json.getString("im24b98");
            this.im24c = json.getString("im24c");
            /*    this.im24d = json.getString("im24d");*/
            this.im25 = json.getString("im25");
            this.im26 = json.getString("im26");
            this.im050198 = json.getString("im050198");
            this.im050298 = json.getString("im050298");
            this.im050398 = json.getString("im050398");
            this.im050498 = json.getString("im050498");
            this.im050598 = json.getString("im050598");
            this.im050698 = json.getString("im050698");
            this.im050798 = json.getString("im050798");
            this.im050898 = json.getString("im050898");
            this.im050998 = json.getString("im050998");
            this.im051098 = json.getString("im051098");
            this.im0510a98 = json.getString("im0510a98");
            this.im051198 = json.getString("im051198");
            this.im051298 = json.getString("im051298");
            this.im051398 = json.getString("im051398");
            this.im051498 = json.getString("im051498");
            this.im051598 = json.getString("im051598");
            this.im0515b98 = json.getString("im0515b98");
            this.im051698 = json.getString("im051698");
            this.im051798 = json.getString("im051798");
            this.im050295 = json.getString("im050295");
            this.im050495 = json.getString("im050495");
            this.im050595 = json.getString("im050595");
            this.im050695 = json.getString("im050695");
            this.im050895 = json.getString("im050895");
            this.im050995 = json.getString("im050995");
            this.im051095 = json.getString("im051095");
            this.im0510a95 = json.getString("im0510a95");
            this.im051295 = json.getString("im051295");
            this.im051395 = json.getString("im051395");
            this.im051495 = json.getString("im051495");
            this.im0515b95 = json.getString("im0515b95");
            this.im051795 = json.getString("im051795");

            this.b107 = json.getString("b107");
            this.b108 = json.getString("b108");
            this.b10801 = json.getString("b10801");
            this.b10802 = json.getString("b10802");
            this.b10803 = json.getString("b10803");
            this.b10804 = json.getString("b10804");
            this.b10805 = json.getString("b10805");
            this.b10898 = json.getString("b10898");
            this.b110 = json.getString("b110");
            this.b114 = json.getString("b114");
            this.b112 = json.getString("b112");
            this.b11201 = json.getString("b11201");
            this.b11202 = json.getString("b11202");
            this.b11203 = json.getString("b11203");
            this.b11204 = json.getString("b11204");
            this.b11205 = json.getString("b11205");
            this.b11206 = json.getString("b11206");
            this.b11207 = json.getString("b11207");
            this.b11208 = json.getString("b11208");
            this.b11209 = json.getString("b11209");
            this.b11210 = json.getString("b11210");
            this.b11296 = json.getString("b11296");
            this.b11296x = json.getString("b11296x");
            this.b105 = json.getString("b105");
            this.b106 = json.getString("b106");
            this.b10601 = json.getString("b10601");
            this.b10601x = json.getString("b10601x");
            this.b10602 = json.getString("b10602");
            this.b10602x = json.getString("b10602x");
            this.b115 = json.getString("b115");
            this.b116 = json.getString("b116");
            this.b117 = json.getString("b117");
            this.b118 = json.getString("b118");
            this.b11896x = json.getString("b11896x");
            this.b11901 = json.getString("b11901");
            this.b11902 = json.getString("b11902");
            this.b11903 = json.getString("b11903");
            this.b11904 = json.getString("b11904");
            this.b11905 = json.getString("b11905");
            this.b11906 = json.getString("b11906");
            this.b11996 = json.getString("b11996");
            this.b11998 = json.getString("b11998");
            this.b11996x = json.getString("b11996x");
            this.b120 = json.getString("b120");
            this.b121 = json.getString("b121");
            this.b12101 = json.getString("b12101");
            this.b12102 = json.getString("b12102");
            this.b12103 = json.getString("b12103");
            this.b12104 = json.getString("b12104");
            this.b12105 = json.getString("b12105");
            this.b12198 = json.getString("b12198");
            this.b12196 = json.getString("b12196");
            this.b12196x = json.getString("b12196x");
        }
    }


    public String sCHtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("ec13", ec13)
                .put("ec14", ec14)
                .put("ec15", ec15)
                .put("ec16", ec16)
                .put("ec17", ec17)
                .put("cb03dd", cb03dd)
                .put("cb03mm", cb03mm)
                .put("cb03yy", cb03yy)
                .put("cb04mm", cb04mm)
                .put("cb04yy", cb04yy)
                .put("ageInMonths", ageInMonths);

        return json.toString();


    }


    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("im01", im01)
                .put("im02", im02)
                .put("im02a", im02a)
                .put("im02a96x", im02a96x)
                .put("im03", im03)
                .put("im0396x", im0396x)
                .put("im04dd", im04dd)
                .put("trueAgeInMonths", trueAgeInMonths)
                .put("im04mm", im04mm)
                .put("im04yy", im04yy)
                .put("im0497", im0497)
                .put("backfilename", backfilename)
                .put("frontfilename", frontfilename)
                .put("im0501dd", im0501dd)
                .put("im0501mm", im0501mm)
                .put("im0501yy", im0501yy)
                .put("im0502dd", im0502dd)
                .put("im0502mm", im0502mm)
                .put("im0502yy", im0502yy)
                .put("im0503dd", im0503dd)
                .put("im0503mm", im0503mm)
                .put("im0503yy", im0503yy)
                .put("im0504dd", im0504dd)
                .put("im0504mm", im0504mm)
                .put("im0504yy", im0504yy)
                .put("im0505dd", im0505dd)
                .put("im0505mm", im0505mm)
                .put("im0505yy", im0505yy)
                .put("im0506dd", im0506dd)
                .put("im0506mm", im0506mm)
                .put("im0506yy", im0506yy)
                .put("im0507dd", im0507dd)
                .put("im0507mm", im0507mm)
                .put("im0507yy", im0507yy)
                .put("im0508dd", im0508dd)
                .put("im0508mm", im0508mm)
                .put("im0508yy", im0508yy)
                .put("im0509dd", im0509dd)
                .put("im0509mm", im0509mm)
                .put("im0509yy", im0509yy)
                .put("im0510dd", im0510dd)
                .put("im0510mm", im0510mm)
                .put("im0510yy", im0510yy)
                .put("im0510add", im0510add)
                .put("im0510amm", im0510amm)
                .put("im0510ayy", im0510ayy)
                .put("im0511dd", im0511dd)
                .put("im0511mm", im0511mm)
                .put("im0511yy", im0511yy)
                .put("im0512dd", im0512dd)
                .put("im0512mm", im0512mm)
                .put("im0512yy", im0512yy)
                .put("im0513dd", im0513dd)
                .put("im0513mm", im0513mm)
                .put("im0513yy", im0513yy)
                .put("im0514dd", im0514dd)
                .put("im0514mm", im0514mm)
                .put("im0514yy", im0514yy)
                .put("im0515dd", im0515dd)
                .put("im0515mm", im0515mm)
                .put("im0515yy", im0515yy)
                .put("im0515bdd", im0515bdd)
                .put("im0515bmm", im0515bmm)
                .put("im0515byy", im0515byy)
                .put("im0516dd", im0516dd)
                .put("im0516mm", im0516mm)
                .put("im0516yy", im0516yy)
                .put("im0517dd", im0517dd)
                .put("im0517mm", im0517mm)
                .put("im0517yy", im0517yy)
                //.put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im10a", im10a)
                .put("im11", im11)
                .put("im12", im12)
                .put("im12a", im12a)
                .put("im12a98", im12a98)
                .put("im14", im14)
                .put("im15", im15)
                .put("im16", im16)
                .put("im17", im17)
                .put("im18", im18)
                .put("im19", im19)
                .put("im20", im20)
                .put("im20a", im20a)
                .put("im21", im21)
                .put("im22", im22)
                .put("im22a", im22a)
                .put("im23", im23)
                .put("im236x", im236x)
                .put("im23a", im23a)
                .put("im2401", im2401)
                .put("im2402", im2402)
                .put("im2403", im2403)
                .put("im2404", im2404)
                .put("im2405", im2405)
                .put("im2406", im2406)
                .put("im2407", im2407)
                .put("im2408", im2408)
                .put("im2409", im2409)
                .put("im2410", im2410)
                .put("im2411", im2411)
                .put("im2412", im2412)
                .put("im2413", im2413)
                .put("im2414", im2414)
                .put("im2415", im2415)
                .put("im2416", im2416)
                .put("im2498", im2498)
                .put("im2496", im2496)
                .put("im2496x", im2496x)
                .put("im24a", im24a)
                .put("im24b", im24b)
                .put("im24b98", im24b98)
                .put("im24c", im24c)
                /*     .put("im24d", im24d)*/
                .put("im25", im25)
                .put("im26", im26)
                .put("im050198", im050198)
                .put("im050298", im050298)
                .put("im050398", im050398)
                .put("im050498", im050498)
                .put("im050598", im050598)
                .put("im050698", im050698)
                .put("im050798", im050798)
                .put("im050898", im050898)
                .put("im050998", im050998)
                .put("im051098", im051098)
                .put("im0510a98", im0510a98)
                .put("im051198", im051198)
                .put("im051298", im051298)
                .put("im051398", im051398)
                .put("im051498", im051498)
                .put("im051598", im051598)
                .put("im0515b98", im0515b98)
                .put("im051698", im051698)
                .put("im051798", im051798)
                .put("im050295", im050295)
                .put("im050495", im050495)
                .put("im050595", im050595)
                .put("im050695", im050695)
                .put("im050895", im050895)
                .put("im050995", im050995)
                .put("im051095", im051095)
                .put("im0510a95", im0510a95)
                .put("im051295", im051295)
                .put("im051395", im051395)
                .put("im051495", im051495)
                .put("im0515b95", im0515b95)
                .put("im051795", im051795)
                .put("b107", b107)
                .put("b108", b108)
                .put("b10801", b10801)
                .put("b10802", b10802)
                .put("b10803", b10803)
                .put("b10804", b10804)
                .put("b10805", b10805)
                .put("b10898", b10898)
                .put("b110", b110)
                .put("b114", b114)
                .put("b112", b112)
                .put("b11201", b11201)
                .put("b11202", b11202)
                .put("b11203", b11203)
                .put("b11204", b11204)
                .put("b11205", b11205)
                .put("b11206", b11206)
                .put("b11207", b11207)
                .put("b11208", b11208)
                .put("b11209", b11209)
                .put("b11210", b11210)
                .put("b11296", b11296)
                .put("b11296x", b11296x)
                .put("b105", b105)
                .put("b106", b106)
                .put("b10601", b10601)
                .put("b10601x", b10601x)
                .put("b10602", b10602)
                .put("b10602x", b10602x)
                .put("b115", b115)
                .put("b116", b116)
                .put("b117", b117)
                .put("b118", b118)
                .put("b11896x", b11896x)
                .put("b11901", b11901)
                .put("b11902", b11902)
                .put("b11903", b11903)
                .put("b11904", b11904)
                .put("b11905", b11905)
                .put("b11906", b11906)
                .put("b11996", b11996)
                .put("b11998", b11998)
                .put("b11996x", b11996x)
                .put("b120", b120)
                .put("b121", b121)
                .put("b12101", b12101)
                .put("b12102", b12102)
                .put("b12103", b12103)
                .put("b12104", b12104)
                .put("b12105", b12105)
                .put("b12198", b12198)
                .put("b12196", b12196)
                .put("b12196x", b12196x);

        return json.toString();
    }


    public String sCBtoString() throws JSONException {
        Log.d(TAG, "sCBtoString: ");
        JSONObject json = new JSONObject();
        json.put("ec01", ec01)
                .put("ec02", ec02)
                .put("ec03", ec03)
                .put("ec04", ec04)
                .put("ec04a", ec04a)
                .put("ec05", ec05)
                .put("ec06", ec06)
                .put("ec07", ec07)
                .put("ec09", ec09)
                .put("ec11", ec11)
                .put("ec12", ec12)
                .put("ec13cline", ec13cline)
                .put("ec14cname", ec14cname)
                .put("ec18", ec18)
                .put("ec19", ec19)
                .put("ec21", ec21)
                .put("ec22", ec22)
                .put("ec2206x", ec2206x)
                .put("ec2296x", ec2296x)
                .put("cb01a", cb01a)
                .put("cb01b", cb01b)
                .put("cb02a", cb02a)
                .put("cb02b", cb02b);


        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_EB_CODE, this.ebCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_CSTATUS, this.cstatus);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SCH, new JSONObject(sCHtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SCB, new JSONObject(sCBtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SIM, new JSONObject(sIMtoString()));

        return json;
    }


    private void CaluculateAge(String dd, String mm, String yy, boolean trueAge) {
        setAgeCheck(false);
        Log.d(TAG, "CaluculateAge: " + yy + "-" + mm + "-" + dd);

        if (!trueAge) {
            setCb04mm("");
            setCb04yy("");
        } else {
            setTrueAgeInMonths(this.ageInMonths);
        }
        if (!yy.equals("") && !yy.equals("9998") && !mm.equals("") && !dd.equals("")) {

            if ((Integer.parseInt(mm) > 12 && !mm.equals("98"))
                    || (Integer.parseInt(dd) > 31 && !dd.equals("98"))
                    || Integer.parseInt(yy) < 1920) {
                if (!trueAge) {
                    setCb04yy("");
                    setCb04mm("");
                    this.ageInMonths = 0;
                } else {
                    setTrueAgeInMonths(0);


                }
                return;
            }
            try {
                SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

                // set current Date
                Calendar cur = Calendar.getInstance();
                cur.setTime(sdf.parse(form.getHh01()));// all done


                // set Date of birth
                int day = !dd.equals("98") ? Integer.parseInt(dd) : 15;
                int month = !mm.equals("98") ? Integer.parseInt(mm) : 6;
                int year = Integer.parseInt(yy);
                Calendar cal = Calendar.getInstance();
                cal.setTime(df.parse(year + " " + month + " " + day));


//             String todayDate = df.format(Calendar.getInstance().getTime());




/*                System.out.println(df.format("Current: " + cur.getTime()));
                System.out.println(df.format("DOB: " + cal.getTime()));*/


                //long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                long millis = cur.getTimeInMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                //this.ageInMonths = MILLISECONDS.toDays(millis) / 30;
                // OLD METHOD
              /*  long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));
                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);*/

                Calendar c = Calendar.getInstance();

                c.setTimeInMillis(millis);
                int tYear = c.get(Calendar.YEAR) - 1970;
                int tMonth = c.get(Calendar.MONTH);
                int tDay = c.get(Calendar.DAY_OF_MONTH);


                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/


                if (!trueAge) {

                    setCb04yy(String.valueOf(tYear));
                    setCb04mm(String.valueOf(tMonth));
                    if (tYear < 0) {
                        setCb04yy("");
                    }
                } else {
                    setTrueAgeInMonths((Integer.parseInt(String.valueOf(tYear)) * 12L) + Integer.parseInt(String.valueOf(tMonth)));

                }
                //setAgeInMonths(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        }
    }


}
