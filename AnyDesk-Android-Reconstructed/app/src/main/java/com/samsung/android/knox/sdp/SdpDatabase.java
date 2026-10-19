package com.samsung.android.knox.sdp;

import android.database.sqlite.SQLiteDatabase;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.sdp.core.SdpException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineLockedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import defpackage.id;
import defpackage.nh0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SdpDatabase {
    private com.sec.enterprise.knox.sdp.SdpDatabase mSdpDatabase;

    public SdpDatabase(String str) throws SdpException {
        try {
            this.mSdpDatabase = new com.sec.enterprise.knox.sdp.SdpDatabase(str);
        } catch (SdpEngineNotExistsException unused) {
            nh0.d(-5);
            throw null;
        } catch (SdpLicenseRequiredException unused2) {
            nh0.d(-8);
            throw null;
        } catch (NoClassDefFoundError unused3) {
            id.g(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "SdpDatabase", new Class[]{String.class}, 19));
            throw null;
        }
    }

    public boolean isSensitive(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            return this.mSdpDatabase.isSensitive(sQLiteDatabase, str, str2, str3);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "isSensitive", new Class[]{SQLiteDatabase.class, String.class, String.class, String.class}, 19));
            return false;
        }
    }

    public boolean setSensitive(SQLiteDatabase sQLiteDatabase, String str, String str2, List<String> list) throws SdpException {
        try {
            return this.mSdpDatabase.setSensitive(sQLiteDatabase, str, str2, list);
        } catch (SdpEngineLockedException unused) {
            nh0.d(-6);
            return false;
        } catch (NoSuchMethodError unused2) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "setSensitive", new Class[]{SQLiteDatabase.class, String.class, String.class, List.class}, 19));
            return false;
        }
    }

    public boolean updateStateToDB(SQLiteDatabase sQLiteDatabase, String str, int i) {
        try {
            return this.mSdpDatabase.updateStateToDB(sQLiteDatabase, str, i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "updateStateToDB", new Class[]{SQLiteDatabase.class, String.class, Integer.TYPE}, 19));
            return false;
        }
    }

    public boolean updateStateToDB(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            return this.mSdpDatabase.updateStateToDB(sQLiteDatabase, i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpDatabase.class, "updateStateToDB", new Class[]{SQLiteDatabase.class, Integer.TYPE}, 19));
            return false;
        }
    }
}
