package edu.aku.dmu.quasi_experimental.models;

import static edu.aku.dmu.quasi_experimental.core.MainApp.PROJECT_NAME;
import static edu.aku.dmu.quasi_experimental.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.dmu.quasi_experimental.BR;
import edu.aku.dmu.quasi_experimental.contracts.TableContract.COMPLAINTSTable;
import edu.aku.dmu.quasi_experimental.core.MainApp;

public class Complaints extends BaseObservable implements Observable {

    private final String TAG = "Complaints";
    public String prno = _EMPTY_;
    public String facility = _EMPTY_;
    public String facilityCode = _EMPTY_;
    public String vdate = _EMPTY_;
    public String pc200 = _EMPTY_;
    public String pc201 = _EMPTY_;
    public String pc202 = _EMPTY_;
    public String pc203 = _EMPTY_;
    public String pc204 = _EMPTY_;
    public String pc205 = _EMPTY_;
    public String pc206 = _EMPTY_;
    public String pc207 = _EMPTY_;
    public String pc208 = _EMPTY_;
    public String pc209 = _EMPTY_;
    public String pc210 = _EMPTY_;
    public String pc211 = _EMPTY_;
    public String pc212 = _EMPTY_;
    public String pc213 = _EMPTY_;
    public String pc214 = _EMPTY_;
    public String pc215 = _EMPTY_;
    public String pc216 = _EMPTY_;
    public String pc217 = _EMPTY_;
    public String pc218 = _EMPTY_;
    public String pc219 = _EMPTY_;
    public String pc220 = _EMPTY_;
    public String pc221 = _EMPTY_;
    public String pc222 = _EMPTY_;
    public String pc223 = _EMPTY_;
    public String pc224 = _EMPTY_;
    public String pc225 = _EMPTY_;
    public String pc226 = _EMPTY_;
    public String pc227 = _EMPTY_;
    public String pc228 = _EMPTY_;
    public String pc229 = _EMPTY_;
    public String pc230 = _EMPTY_;
    public String pc231 = _EMPTY_;
    public String pc232 = _EMPTY_;
    public String pc233 = _EMPTY_;
    public String pc234 = _EMPTY_;
    public String pc235 = _EMPTY_;
    public String pc236 = _EMPTY_;
    public String pc237 = _EMPTY_;
    public String pc238 = _EMPTY_;
    public String pc239 = _EMPTY_;
    public String pc240 = _EMPTY_;
    public String pc241 = _EMPTY_;
    public String pc242 = _EMPTY_;
    public String pc243 = _EMPTY_;
    public String pc244 = _EMPTY_;
    public String pc245 = _EMPTY_;
    public String pc246 = _EMPTY_;
    public String pc247 = _EMPTY_;
    public String pc248 = _EMPTY_;
    public String pc249 = _EMPTY_;
    public String pc250 = _EMPTY_;
    public String pc251 = _EMPTY_;
    public String pc252 = _EMPTY_;
    public String pc253 = _EMPTY_;
    public String pc254 = _EMPTY_;
    public String pc255 = _EMPTY_;
    public String pc256 = _EMPTY_;
    public String pc257 = _EMPTY_;
    public String pc258 = _EMPTY_;
    public String pc259 = _EMPTY_;
    public String pc2961 = _EMPTY_;
    public String pc2961x = _EMPTY_;
    public String pc2962 = _EMPTY_;
    public String pc2962x = _EMPTY_;
    public String pc2963 = _EMPTY_;
    public String pc2963x = _EMPTY_;
    public String pc200nr = _EMPTY_;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String entryType = _EMPTY_;
    // SECTION VARIABLE = _EMPTY_;
    private String sComplaints = _EMPTY_;
    private String compCode = _EMPTY_;
    private String compOther = _EMPTY_;

    public Complaints() {
    }

    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setUuid(MainApp.patientDetails.getUid());
        setPrno(MainApp.patientDetails.getPrno());
        setFacility(MainApp.patientDetails.getFacility());
        setFacilityCode(MainApp.patientDetails.getFacilityCode());
        setVdate(MainApp.patientDetails.getVdate());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEntryType(String.valueOf(MainApp.entryType));

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }


    @Bindable
    public String getsComplaints() {
        return sComplaints;
    }

    public void setsComplaints(String sComplaints) {
        this.sComplaints = sComplaints;
        notifyPropertyChanged(BR.sComplaints);
    }

    @Bindable
    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
        notifyPropertyChanged(BR.compCode);
    }

    @Bindable
    public String getCompOther() {
        return compOther;
    }

    public void setCompOther(String compOther) {
        this.compOther = compOther;
        notifyPropertyChanged(BR.compOther);
    }

    @Bindable
    public String getPrno() {
        return prno;
    }

    public void setPrno(String prno) {
        this.prno = prno;
        notifyPropertyChanged(BR.prno);
    }

    @Bindable
    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
        notifyPropertyChanged(BR.facility);
    }

    @Bindable
    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
        notifyPropertyChanged(BR.facilityCode);
    }

    @Bindable
    public String getVdate() {
        return vdate;
    }

    public void setVdate(String vdate) {
        this.vdate = vdate;
        notifyPropertyChanged(BR.vdate);
    }

    @Bindable
    public String getPc200() {
        return pc200;
    }

    public void setPc200(String pc200) {
        this.pc200 = pc200;
        notifyPropertyChanged(BR.pc200);
    }

    @Bindable
    public String getPc201() {
        return pc201;
    }

    public void setPc201(String pc201) {
        if (this.pc201.equals(pc201)) return; // for all checkboxes
        this.pc201 = pc201;
        notifyPropertyChanged(BR.pc201);
    }

    @Bindable
    public String getPc202() {
        return pc202;
    }

    public void setPc202(String pc202) {
        if (this.pc202.equals(pc202)) return; // for all checkboxes
        this.pc202 = pc202;
        notifyPropertyChanged(BR.pc202);
    }

    @Bindable
    public String getPc203() {
        return pc203;
    }

    public void setPc203(String pc203) {
        if (this.pc203.equals(pc203)) return; // for all checkboxes
        this.pc203 = pc203;
        notifyPropertyChanged(BR.pc203);
    }

    @Bindable
    public String getPc204() {
        return pc204;
    }

    public void setPc204(String pc204) {
        if (this.pc204.equals(pc204)) return; // for all checkboxes
        this.pc204 = pc204;
        notifyPropertyChanged(BR.pc204);
    }

    @Bindable
    public String getPc205() {
        return pc205;
    }

    public void setPc205(String pc205) {
        if (this.pc205.equals(pc205)) return; // for all checkboxes
        this.pc205 = pc205;
        notifyPropertyChanged(BR.pc205);
    }

    @Bindable
    public String getPc206() {
        return pc206;
    }

    public void setPc206(String pc206) {
        if (this.pc206.equals(pc206)) return; // for all checkboxes
        this.pc206 = pc206;
        notifyPropertyChanged(BR.pc206);
    }

    @Bindable
    public String getPc207() {
        return pc207;
    }

    public void setPc207(String pc207) {
        if (this.pc207.equals(pc207)) return; // for all checkboxes
        this.pc207 = pc207;
        notifyPropertyChanged(BR.pc207);
    }

    @Bindable
    public String getPc208() {
        return pc208;
    }

    public void setPc208(String pc208) {
        if (this.pc208.equals(pc208)) return; // for all checkboxes
        this.pc208 = pc208;
        notifyPropertyChanged(BR.pc208);
    }

    @Bindable
    public String getPc209() {
        return pc209;
    }

    public void setPc209(String pc209) {
        if (this.pc209.equals(pc209)) return; // for all checkboxes
        this.pc209 = pc209;
        notifyPropertyChanged(BR.pc209);
    }

    @Bindable
    public String getPc210() {
        return pc210;
    }

    public void setPc210(String pc210) {
        if (this.pc210.equals(pc210)) return; // for all checkboxes
        this.pc210 = pc210;
        notifyPropertyChanged(BR.pc210);
    }

    @Bindable
    public String getPc211() {
        return pc211;
    }

    public void setPc211(String pc211) {
        if (this.pc211.equals(pc211)) return; // for all checkboxes
        this.pc211 = pc211;
        notifyPropertyChanged(BR.pc211);
    }

    @Bindable
    public String getPc212() {
        return pc212;
    }

    public void setPc212(String pc212) {
        if (this.pc212.equals(pc212)) return; // for all checkboxes
        this.pc212 = pc212;
        notifyPropertyChanged(BR.pc212);
    }

    @Bindable
    public String getPc213() {
        return pc213;
    }

    public void setPc213(String pc213) {
        if (this.pc213.equals(pc213)) return; // for all checkboxes
        this.pc213 = pc213;
        notifyPropertyChanged(BR.pc213);
    }

    @Bindable
    public String getPc214() {
        return pc214;
    }

    public void setPc214(String pc214) {
        if (this.pc214.equals(pc214)) return; // for all checkboxes
        this.pc214 = pc214;
        notifyPropertyChanged(BR.pc214);
    }

    @Bindable
    public String getPc215() {
        return pc215;
    }

    public void setPc215(String pc215) {
        if (this.pc215.equals(pc215)) return; // for all checkboxes
        this.pc215 = pc215;
        notifyPropertyChanged(BR.pc215);
    }

    @Bindable
    public String getPc216() {
        return pc216;
    }

    public void setPc216(String pc216) {
        if (this.pc216.equals(pc216)) return; // for all checkboxes
        this.pc216 = pc216;
        notifyPropertyChanged(BR.pc216);
    }

    @Bindable
    public String getPc217() {
        return pc217;
    }

    public void setPc217(String pc217) {
        if (this.pc217.equals(pc217)) return; // for all checkboxes
        this.pc217 = pc217;
        notifyPropertyChanged(BR.pc217);
    }

    @Bindable
    public String getPc218() {
        return pc218;
    }

    public void setPc218(String pc218) {
        if (this.pc218.equals(pc218)) return; // for all checkboxes
        this.pc218 = pc218;
        notifyPropertyChanged(BR.pc218);
    }

    @Bindable
    public String getPc219() {
        return pc219;
    }

    public void setPc219(String pc219) {
        if (this.pc219.equals(pc219)) return; // for all checkboxes
        this.pc219 = pc219;
        notifyPropertyChanged(BR.pc219);
    }

    @Bindable
    public String getPc220() {
        return pc220;
    }

    public void setPc220(String pc220) {
        if (this.pc220.equals(pc220)) return; // for all checkboxes
        this.pc220 = pc220;
        notifyPropertyChanged(BR.pc220);
    }

    @Bindable
    public String getPc221() {
        return pc221;
    }

    public void setPc221(String pc221) {
        if (this.pc221.equals(pc221)) return; // for all checkboxes
        this.pc221 = pc221;
        notifyPropertyChanged(BR.pc221);
    }

    @Bindable
    public String getPc222() {
        return pc222;
    }

    public void setPc222(String pc222) {
        if (this.pc222.equals(pc222)) return; // for all checkboxes
        this.pc222 = pc222;
        notifyPropertyChanged(BR.pc222);
    }

    @Bindable
    public String getPc223() {
        return pc223;
    }

    public void setPc223(String pc223) {
        if (this.pc223.equals(pc223)) return; // for all checkboxes
        this.pc223 = pc223;
        notifyPropertyChanged(BR.pc223);
    }

    @Bindable
    public String getPc224() {
        return pc224;
    }

    public void setPc224(String pc224) {
        if (this.pc224.equals(pc224)) return; // for all checkboxes
        this.pc224 = pc224;
        notifyPropertyChanged(BR.pc224);
    }

    @Bindable
    public String getPc225() {
        return pc225;
    }

    public void setPc225(String pc225) {
        if (this.pc225.equals(pc225)) return; // for all checkboxes
        this.pc225 = pc225;
        notifyPropertyChanged(BR.pc225);
    }

    @Bindable
    public String getPc226() {
        return pc226;
    }

    public void setPc226(String pc226) {
        if (this.pc226.equals(pc226)) return; // for all checkboxes
        this.pc226 = pc226;
        notifyPropertyChanged(BR.pc226);
    }

    @Bindable
    public String getPc227() {
        return pc227;
    }

    public void setPc227(String pc227) {
        if (this.pc227.equals(pc227)) return; // for all checkboxes
        this.pc227 = pc227;
        notifyPropertyChanged(BR.pc227);
    }

    @Bindable
    public String getPc228() {
        return pc228;
    }

    public void setPc228(String pc228) {
        if (this.pc228.equals(pc228)) return; // for all checkboxes
        this.pc228 = pc228;
        notifyPropertyChanged(BR.pc228);
    }

    @Bindable
    public String getPc229() {
        return pc229;
    }

    public void setPc229(String pc229) {
        if (this.pc229.equals(pc229)) return; // for all checkboxes
        this.pc229 = pc229;
        notifyPropertyChanged(BR.pc229);
    }

    @Bindable
    public String getPc230() {
        return pc230;
    }

    public void setPc230(String pc230) {
        if (this.pc230.equals(pc230)) return; // for all checkboxes
        this.pc230 = pc230;
        notifyPropertyChanged(BR.pc230);
    }

    @Bindable
    public String getPc231() {
        return pc231;
    }

    public void setPc231(String pc231) {
        if (this.pc231.equals(pc231)) return; // for all checkboxes
        this.pc231 = pc231;
        notifyPropertyChanged(BR.pc231);
    }

    @Bindable
    public String getPc232() {
        return pc232;
    }

    public void setPc232(String pc232) {
        if (this.pc232.equals(pc232)) return; // for all checkboxes
        this.pc232 = pc232;
        notifyPropertyChanged(BR.pc232);
    }

    @Bindable
    public String getPc233() {
        return pc233;
    }

    public void setPc233(String pc233) {
        if (this.pc233.equals(pc233)) return; // for all checkboxes
        this.pc233 = pc233;
        notifyPropertyChanged(BR.pc233);
    }

    @Bindable
    public String getPc234() {
        return pc234;
    }

    public void setPc234(String pc234) {
        if (this.pc234.equals(pc234)) return; // for all checkboxes
        this.pc234 = pc234;
        notifyPropertyChanged(BR.pc234);
    }

    @Bindable
    public String getPc235() {
        return pc235;
    }

    public void setPc235(String pc235) {
        if (this.pc235.equals(pc235)) return; // for all checkboxes
        this.pc235 = pc235;
        notifyPropertyChanged(BR.pc235);
    }

    @Bindable
    public String getPc236() {
        return pc236;
    }

    public void setPc236(String pc236) {
        if (this.pc236.equals(pc236)) return; // for all checkboxes
        this.pc236 = pc236;
        notifyPropertyChanged(BR.pc236);
    }

    @Bindable
    public String getPc237() {
        return pc237;
    }

    public void setPc237(String pc237) {
        if (this.pc237.equals(pc237)) return; // for all checkboxes
        this.pc237 = pc237;
        notifyPropertyChanged(BR.pc237);
    }

    @Bindable
    public String getPc238() {
        return pc238;
    }

    public void setPc238(String pc238) {
        if (this.pc238.equals(pc238)) return; // for all checkboxes
        this.pc238 = pc238;
        notifyPropertyChanged(BR.pc238);
    }

    @Bindable
    public String getPc239() {
        return pc239;
    }

    public void setPc239(String pc239) {
        if (this.pc239.equals(pc239)) return; // for all checkboxes
        this.pc239 = pc239;
        notifyPropertyChanged(BR.pc239);
    }

    @Bindable
    public String getPc240() {
        return pc240;
    }

    public void setPc240(String pc240) {
        if (this.pc240.equals(pc240)) return; // for all checkboxes
        this.pc240 = pc240;
        notifyPropertyChanged(BR.pc240);
    }

    @Bindable
    public String getPc241() {
        return pc241;
    }

    public void setPc241(String pc241) {
        if (this.pc241.equals(pc241)) return; // for all checkboxes
        this.pc241 = pc241;
        notifyPropertyChanged(BR.pc241);
    }

    @Bindable
    public String getPc242() {
        return pc242;
    }

    public void setPc242(String pc242) {
        if (this.pc242.equals(pc242)) return; // for all checkboxes
        this.pc242 = pc242;
        notifyPropertyChanged(BR.pc242);
    }

    @Bindable
    public String getPc243() {
        return pc243;
    }

    public void setPc243(String pc243) {
        if (this.pc243.equals(pc243)) return; // for all checkboxes
        this.pc243 = pc243;
        notifyPropertyChanged(BR.pc243);
    }

    @Bindable
    public String getPc244() {
        return pc244;
    }

    public void setPc244(String pc244) {
        if (this.pc244.equals(pc244)) return; // for all checkboxes
        this.pc244 = pc244;
        notifyPropertyChanged(BR.pc244);
    }

    @Bindable
    public String getPc245() {
        return pc245;
    }

    public void setPc245(String pc245) {
        if (this.pc245.equals(pc245)) return; // for all checkboxes
        this.pc245 = pc245;
        notifyPropertyChanged(BR.pc245);
    }

    @Bindable
    public String getPc246() {
        return pc246;
    }

    public void setPc246(String pc246) {
        if (this.pc246.equals(pc246)) return; // for all checkboxes
        this.pc246 = pc246;
        notifyPropertyChanged(BR.pc246);
    }

    @Bindable
    public String getPc247() {
        return pc247;
    }

    public void setPc247(String pc247) {
        if (this.pc247.equals(pc247)) return; // for all checkboxes
        this.pc247 = pc247;
        notifyPropertyChanged(BR.pc247);
    }

    @Bindable
    public String getPc248() {
        return pc248;
    }

    public void setPc248(String pc248) {
        if (this.pc248.equals(pc248)) return; // for all checkboxes
        this.pc248 = pc248;
        notifyPropertyChanged(BR.pc248);
    }

    @Bindable
    public String getPc249() {
        return pc249;
    }

    public void setPc249(String pc249) {
        if (this.pc249.equals(pc249)) return; // for all checkboxes
        this.pc249 = pc249;
        notifyPropertyChanged(BR.pc249);
    }

    @Bindable
    public String getPc250() {
        return pc250;
    }

    public void setPc250(String pc250) {
        if (this.pc250.equals(pc250)) return; // for all checkboxes
        this.pc250 = pc250;
        notifyPropertyChanged(BR.pc250);
    }

    @Bindable
    public String getPc251() {
        return pc251;
    }

    public void setPc251(String pc251) {
        if (this.pc251.equals(pc251)) return; // for all checkboxes
        this.pc251 = pc251;
        notifyPropertyChanged(BR.pc251);
    }

    @Bindable
    public String getPc252() {
        return pc252;
    }

    public void setPc252(String pc252) {
        if (this.pc252.equals(pc252)) return; // for all checkboxes
        this.pc252 = pc252;
        notifyPropertyChanged(BR.pc252);
    }

    @Bindable
    public String getPc253() {
        return pc253;
    }

    public void setPc253(String pc253) {
        if (this.pc253.equals(pc253)) return; // for all checkboxes
        this.pc253 = pc253;
        notifyPropertyChanged(BR.pc253);
    }

    @Bindable
    public String getPc254() {
        return pc254;
    }

    public void setPc254(String pc254) {
        if (this.pc254.equals(pc254)) return; // for all checkboxes
        this.pc254 = pc254;
        notifyPropertyChanged(BR.pc254);
    }

    @Bindable
    public String getPc255() {
        return pc255;
    }

    public void setPc255(String pc255) {
        if (this.pc255.equals(pc255)) return; // for all checkboxes
        this.pc255 = pc255;
        notifyPropertyChanged(BR.pc255);
    }

    @Bindable
    public String getPc256() {
        return pc256;
    }

    public void setPc256(String pc256) {
        if (this.pc256.equals(pc256)) return; // for all checkboxes
        this.pc256 = pc256;
        notifyPropertyChanged(BR.pc256);
    }

    @Bindable
    public String getPc257() {
        return pc257;
    }

    public void setPc257(String pc257) {
        if (this.pc257.equals(pc257)) return; // for all checkboxes
        this.pc257 = pc257;
        notifyPropertyChanged(BR.pc257);
    }

    @Bindable
    public String getPc258() {
        return pc258;
    }

    public void setPc258(String pc258) {
        if (this.pc258.equals(pc258)) return; // for all checkboxes
        this.pc258 = pc258;
        notifyPropertyChanged(BR.pc258);
    }

    @Bindable
    public String getPc259() {
        return pc259;
    }

    public void setPc259(String pc259) {
        if (this.pc259.equals(pc259)) return; // for all checkboxes
        this.pc259 = pc259;
        notifyPropertyChanged(BR.pc259);
    }

    @Bindable
    public String getPc2961() {
        return pc2961;
    }

    public void setPc2961(String pc2961) {
        if (this.pc2961.equals(pc2961)) return; // for all checkboxes
        this.pc2961 = pc2961;
        setPc2961x(pc2961.equals("961") ? this.pc2961x : "");
        notifyPropertyChanged(BR.pc2961);
    }

    @Bindable
    public String getPc2961x() {
        return pc2961x;
    }

    public void setPc2961x(String pc2961x) {
        this.pc2961x = pc2961x;
        notifyPropertyChanged(BR.pc2961x);
    }

    @Bindable
    public String getPc2962() {
        return pc2962;
    }

    public void setPc2962(String pc2962) {
        if (this.pc2962.equals(pc2962)) return; // for all checkboxes
        this.pc2962 = pc2962;
        setPc2962x(pc2962.equals("962") ? this.pc2962x : "");
        notifyPropertyChanged(BR.pc2962);
    }

    @Bindable
    public String getPc2962x() {
        return pc2962x;
    }

    public void setPc2962x(String pc2962x) {
        this.pc2962x = pc2962x;
        notifyPropertyChanged(BR.pc2962x);
    }

    @Bindable
    public String getPc2963() {
        return pc2963;
    }

    public void setPc2963(String pc2963) {
        if (this.pc2963.equals(pc2963)) return; // for all checkboxes
        this.pc2963 = pc2963;
        setPc2963x(pc2963.equals("963") ? this.pc2963x : "");
        notifyPropertyChanged(BR.pc2963);
    }

    @Bindable
    public String getPc2963x() {
        return pc2963x;
    }

    public void setPc2963x(String pc2963x) {
        this.pc2963x = pc2963x;
        notifyPropertyChanged(BR.pc2963x);
    }

    @Bindable
    public String getPc200nr() {
        return pc200nr;
    }

    public void setPc200nr(String pc200nr) {
        if (this.pc200nr.equals(pc200nr)) return; // for all checkboxes
        this.pc200nr = pc200nr;
        setPc201(pc200nr.equals("999") ? "" : this.pc201);
        setPc202(pc200nr.equals("999") ? "" : this.pc202);
        setPc203(pc200nr.equals("999") ? "" : this.pc203);
        setPc204(pc200nr.equals("999") ? "" : this.pc204);
        setPc205(pc200nr.equals("999") ? "" : this.pc205);
        setPc206(pc200nr.equals("999") ? "" : this.pc206);
        setPc207(pc200nr.equals("999") ? "" : this.pc207);
        setPc208(pc200nr.equals("999") ? "" : this.pc208);
        setPc209(pc200nr.equals("999") ? "" : this.pc209);
        setPc210(pc200nr.equals("999") ? "" : this.pc210);
        setPc211(pc200nr.equals("999") ? "" : this.pc211);
        setPc212(pc200nr.equals("999") ? "" : this.pc212);
        setPc213(pc200nr.equals("999") ? "" : this.pc213);
        setPc214(pc200nr.equals("999") ? "" : this.pc214);
        setPc215(pc200nr.equals("999") ? "" : this.pc215);
        setPc216(pc200nr.equals("999") ? "" : this.pc216);
        setPc217(pc200nr.equals("999") ? "" : this.pc217);
        setPc218(pc200nr.equals("999") ? "" : this.pc218);
        setPc219(pc200nr.equals("999") ? "" : this.pc219);
        setPc220(pc200nr.equals("999") ? "" : this.pc220);
        setPc221(pc200nr.equals("999") ? "" : this.pc221);
        setPc222(pc200nr.equals("999") ? "" : this.pc222);
        setPc223(pc200nr.equals("999") ? "" : this.pc223);
        setPc224(pc200nr.equals("999") ? "" : this.pc224);
        setPc225(pc200nr.equals("999") ? "" : this.pc225);
        setPc226(pc200nr.equals("999") ? "" : this.pc226);
        setPc227(pc200nr.equals("999") ? "" : this.pc227);
        setPc228(pc200nr.equals("999") ? "" : this.pc228);
        setPc229(pc200nr.equals("999") ? "" : this.pc229);
        setPc230(pc200nr.equals("999") ? "" : this.pc230);
        setPc231(pc200nr.equals("999") ? "" : this.pc231);
        setPc232(pc200nr.equals("999") ? "" : this.pc232);
        setPc233(pc200nr.equals("999") ? "" : this.pc233);
        setPc234(pc200nr.equals("999") ? "" : this.pc234);
        setPc235(pc200nr.equals("999") ? "" : this.pc235);
        setPc236(pc200nr.equals("999") ? "" : this.pc236);
        setPc237(pc200nr.equals("999") ? "" : this.pc237);
        setPc238(pc200nr.equals("999") ? "" : this.pc238);
        setPc239(pc200nr.equals("999") ? "" : this.pc239);
        setPc240(pc200nr.equals("999") ? "" : this.pc240);
        setPc241(pc200nr.equals("999") ? "" : this.pc241);
        setPc242(pc200nr.equals("999") ? "" : this.pc242);
        setPc243(pc200nr.equals("999") ? "" : this.pc243);
        setPc244(pc200nr.equals("999") ? "" : this.pc244);
        setPc245(pc200nr.equals("999") ? "" : this.pc245);
        setPc246(pc200nr.equals("999") ? "" : this.pc246);
        setPc247(pc200nr.equals("999") ? "" : this.pc247);
        setPc248(pc200nr.equals("999") ? "" : this.pc248);
        setPc249(pc200nr.equals("999") ? "" : this.pc249);
        setPc250(pc200nr.equals("999") ? "" : this.pc250);
        setPc251(pc200nr.equals("999") ? "" : this.pc251);
        setPc252(pc200nr.equals("999") ? "" : this.pc252);
        setPc253(pc200nr.equals("999") ? "" : this.pc253);
        setPc254(pc200nr.equals("999") ? "" : this.pc254);
        setPc255(pc200nr.equals("999") ? "" : this.pc255);
        setPc256(pc200nr.equals("999") ? "" : this.pc256);
        setPc257(pc200nr.equals("999") ? "" : this.pc257);
        setPc258(pc200nr.equals("999") ? "" : this.pc258);
        setPc259(pc200nr.equals("999") ? "" : this.pc259);
        setPc2961(pc200nr.equals("999") ? "" : this.pc2961);
        setPc2962(pc200nr.equals("999") ? "" : this.pc2962);
        setPc2963(pc200nr.equals("999") ? "" : this.pc2963);
        notifyPropertyChanged(BR.pc200nr);
    }


    public Complaints Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_UUID));
        this.prno = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_PRNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_USERNAME));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_PROJECT_NAME));
        this.facility = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_FACILITY));
        this.facilityCode = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_FACILITY_CODE));
        this.vdate = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_VDATE));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SYNCED_DATE));
        this.compCode = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_COMP_CODE));
        this.compOther = cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_COMP_OTHER));

        sCOMPHydrate(cursor.getString(cursor.getColumnIndexOrThrow(COMPLAINTSTable.COLUMN_SCOMP)));

        return this;
    }

    public void sCOMPHydrate(String string) throws JSONException {
        Log.d(TAG, "sCOMPHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.pc200 = json.has("pc200") ? json.getString("pc200") : "";
            this.pc201 = json.has("pc201") ? json.getString("pc201") : "";
            this.pc202 = json.has("pc202") ? json.getString("pc202") : "";
            this.pc203 = json.has("pc203") ? json.getString("pc203") : "";
            this.pc204 = json.has("pc204") ? json.getString("pc204") : "";
            this.pc205 = json.has("pc205") ? json.getString("pc205") : "";
            this.pc206 = json.has("pc206") ? json.getString("pc206") : "";
            this.pc207 = json.has("pc207") ? json.getString("pc207") : "";
            this.pc208 = json.has("pc208") ? json.getString("pc208") : "";
            this.pc209 = json.has("pc209") ? json.getString("pc209") : "";
            this.pc210 = json.has("pc210") ? json.getString("pc210") : "";
            this.pc211 = json.has("pc211") ? json.getString("pc211") : "";
            this.pc212 = json.has("pc212") ? json.getString("pc212") : "";
            this.pc213 = json.has("pc213") ? json.getString("pc213") : "";
            this.pc214 = json.has("pc214") ? json.getString("pc214") : "";
            this.pc215 = json.has("pc215") ? json.getString("pc215") : "";
            this.pc216 = json.has("pc216") ? json.getString("pc216") : "";
            this.pc217 = json.has("pc217") ? json.getString("pc217") : "";
            this.pc218 = json.has("pc218") ? json.getString("pc218") : "";
            this.pc219 = json.has("pc219") ? json.getString("pc219") : "";
            this.pc220 = json.has("pc220") ? json.getString("pc220") : "";
            this.pc221 = json.has("pc221") ? json.getString("pc221") : "";
            this.pc222 = json.has("pc222") ? json.getString("pc222") : "";
            this.pc223 = json.has("pc223") ? json.getString("pc223") : "";
            this.pc224 = json.has("pc224") ? json.getString("pc224") : "";
            this.pc225 = json.has("pc225") ? json.getString("pc225") : "";
            this.pc226 = json.has("pc226") ? json.getString("pc226") : "";
            this.pc227 = json.has("pc227") ? json.getString("pc227") : "";
            this.pc228 = json.has("pc228") ? json.getString("pc228") : "";
            this.pc229 = json.has("pc229") ? json.getString("pc229") : "";
            this.pc230 = json.has("pc230") ? json.getString("pc230") : "";
            this.pc231 = json.has("pc231") ? json.getString("pc231") : "";
            this.pc232 = json.has("pc232") ? json.getString("pc232") : "";
            this.pc233 = json.has("pc233") ? json.getString("pc233") : "";
            this.pc234 = json.has("pc234") ? json.getString("pc234") : "";
            this.pc235 = json.has("pc235") ? json.getString("pc235") : "";
            this.pc236 = json.has("pc236") ? json.getString("pc236") : "";
            this.pc237 = json.has("pc237") ? json.getString("pc237") : "";
            this.pc238 = json.has("pc238") ? json.getString("pc238") : "";
            this.pc239 = json.has("pc239") ? json.getString("pc239") : "";
            this.pc240 = json.has("pc240") ? json.getString("pc240") : "";
            this.pc241 = json.has("pc241") ? json.getString("pc241") : "";
            this.pc242 = json.has("pc242") ? json.getString("pc242") : "";
            this.pc243 = json.has("pc243") ? json.getString("pc243") : "";
            this.pc244 = json.has("pc244") ? json.getString("pc244") : "";
            this.pc245 = json.has("pc245") ? json.getString("pc245") : "";
            this.pc246 = json.has("pc246") ? json.getString("pc246") : "";
            this.pc247 = json.has("pc247") ? json.getString("pc247") : "";
            this.pc248 = json.has("pc248") ? json.getString("pc248") : "";
            this.pc249 = json.has("pc249") ? json.getString("pc249") : "";
            this.pc250 = json.has("pc250") ? json.getString("pc250") : "";
            this.pc251 = json.has("pc251") ? json.getString("pc251") : "";
            this.pc252 = json.has("pc252") ? json.getString("pc252") : "";
            this.pc253 = json.has("pc253") ? json.getString("pc253") : "";
            this.pc254 = json.has("pc254") ? json.getString("pc254") : "";
            this.pc255 = json.has("pc255") ? json.getString("pc255") : "";
            this.pc256 = json.has("pc256") ? json.getString("pc256") : "";
            this.pc257 = json.has("pc257") ? json.getString("pc257") : "";
            this.pc258 = json.has("pc258") ? json.getString("pc258") : "";
            this.pc259 = json.has("pc259") ? json.getString("pc259") : "";
            this.pc2961 = json.has("pc2961") ? json.getString("pc2961") : "";
            this.pc2961x = json.has("pc2961x") ? json.getString("pc2961x") : "";
            this.pc2962 = json.has("pc2962") ? json.getString("pc2962") : "";
            this.pc2962x = json.has("pc2962x") ? json.getString("pc2962x") : "";
            this.pc2963 = json.has("pc2963") ? json.getString("pc2963") : "";
            this.pc2963x = json.has("pc2963x") ? json.getString("pc2963x") : "";
            this.pc200nr = json.has("pc200nr") ? json.getString("pc200nr") : "";

        }
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(COMPLAINTSTable.COLUMN_ID, this.id);
        json.put(COMPLAINTSTable.COLUMN_UID, this.uid);
        json.put(COMPLAINTSTable.COLUMN_UUID, this.uuid);
        json.put(COMPLAINTSTable.COLUMN_PRNO, this.prno);
        json.put(COMPLAINTSTable.COLUMN_USERNAME, this.userName);
        json.put(COMPLAINTSTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(COMPLAINTSTable.COLUMN_FACILITY, this.facility);
        json.put(COMPLAINTSTable.COLUMN_FACILITY_CODE, this.facilityCode);
        json.put(COMPLAINTSTable.COLUMN_VDATE, this.vdate);
        json.put(COMPLAINTSTable.COLUMN_SYSDATE, this.sysDate);
        json.put(COMPLAINTSTable.COLUMN_DEVICEID, this.deviceId);
        json.put(COMPLAINTSTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(COMPLAINTSTable.COLUMN_APPVERSION, this.appver);
        json.put(COMPLAINTSTable.COLUMN_SYNCED, this.synced);
        json.put(COMPLAINTSTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(COMPLAINTSTable.COLUMN_COMP_CODE, this.compCode);
        json.put(COMPLAINTSTable.COLUMN_COMP_OTHER, this.compOther);

        json.put(COMPLAINTSTable.COLUMN_SCOMP, new JSONObject(sCOMPtoString()));
        return json;
    }

    public String sCOMPtoString() throws JSONException {
        Log.d(TAG, "sCOMPtoString: ");
        JSONObject json = new JSONObject();
        /*json.put("pc200", pc200)
                .put("pc201", pc201)
                .put("pc202", pc202)
                .put("pc203", pc203)
                .put("pc204", pc204)
                .put("pc205", pc205)
                .put("pc206", pc206)
                .put("pc207", pc207)
                .put("pc208", pc208)
                .put("pc209", pc209)
                .put("pc210", pc210)
                .put("pc211", pc211)
                .put("pc212", pc212)
                .put("pc213", pc213)
                .put("pc214", pc214)
                .put("pc215", pc215)
                .put("pc216", pc216)
                .put("pc217", pc217)
                .put("pc218", pc218)
                .put("pc219", pc219)
                .put("pc220", pc220)
                .put("pc221", pc221)
                .put("pc222", pc222)
                .put("pc223", pc223)
                .put("pc224", pc224)
                .put("pc225", pc225)
                .put("pc226", pc226)
                .put("pc227", pc227)
                .put("pc228", pc228)
                .put("pc229", pc229)
                .put("pc230", pc230)
                .put("pc231", pc231)
                .put("pc232", pc232)
                .put("pc233", pc233)
                .put("pc234", pc234)
                .put("pc235", pc235)
                .put("pc236", pc236)
                .put("pc237", pc237)
                .put("pc238", pc238)
                .put("pc239", pc239)
                .put("pc240", pc240)
                .put("pc241", pc241)
                .put("pc242", pc242)
                .put("pc243", pc243)
                .put("pc244", pc244)
                .put("pc245", pc245)
                .put("pc246", pc246)
                .put("pc247", pc247)
                .put("pc248", pc248)
                .put("pc249", pc249)
                .put("pc250", pc250)
                .put("pc251", pc251)
                .put("pc252", pc252)
                .put("pc253", pc253)
                .put("pc254", pc254)
                .put("pc255", pc255)
                .put("pc256", pc256)
                .put("pc257", pc257)
                .put("pc258", pc258)
                .put("pc259", pc259)
                .put("pc2961", pc2961)
                .put("pc2961x", pc2961x)
                .put("pc2962", pc2962)
                .put("pc2962x", pc2962x)
                .put("pc2963", pc2963)
                .put("pc2963x", pc2963x)
                .put("pc200nr", pc200nr);*/
        return json.toString();
    }

    public void updateComplaints(String compCode, String otherSpecify) {
        MainApp.complaints.setCompCode(compCode);
        MainApp.complaints.setCompOther(otherSpecify);
    }

}
