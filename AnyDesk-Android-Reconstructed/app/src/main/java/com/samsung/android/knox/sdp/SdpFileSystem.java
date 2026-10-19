package com.samsung.android.knox.sdp;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.sdp.core.SdpException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import defpackage.id;
import defpackage.nh0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class SdpFileSystem {
    private com.sec.enterprise.knox.sdp.SdpFileSystem mSdpFileSystem;

    public SdpFileSystem(Context context, String str) throws SdpException {
        try {
            this.mSdpFileSystem = new com.sec.enterprise.knox.sdp.SdpFileSystem(context, str);
        } catch (SdpLicenseRequiredException unused) {
            nh0.d(-8);
            throw null;
        } catch (SdpEngineNotExistsException unused2) {
            nh0.d(-5);
            throw null;
        } catch (NoClassDefFoundError unused3) {
            id.g(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "SdpFileSystem", new Class[]{Context.class, String.class}, 19));
            throw null;
        }
    }

    public static File getExternalStorageDirectory(int i) {
        try {
            return com.sec.enterprise.knox.sdp.SdpFileSystem.getExternalStorageDirectory(i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getExternalStorageDirectory", new Class[]{Integer.TYPE}, 19));
            return null;
        }
    }

    public static File getUserDataDir(int i, String str) {
        try {
            return com.sec.enterprise.knox.sdp.SdpFileSystem.getUserDataDir(i, str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getUserDataDir", new Class[]{Integer.TYPE, String.class}, 19));
            return null;
        }
    }

    public File getCacheDir() {
        try {
            return this.mSdpFileSystem.getCacheDir();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getCacheDir", null, 19));
            return null;
        }
    }

    public File getDatabasePath(String str) {
        try {
            return this.mSdpFileSystem.getDatabasePath(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getDatabasePath", new Class[]{String.class}, 19));
            return null;
        }
    }

    public File getFilesDir() {
        try {
            return this.mSdpFileSystem.getFilesDir();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getFilesDir", null, 19));
            return null;
        }
    }

    public File getManagedProfileKnoxDir() {
        try {
            return this.mSdpFileSystem.getManagedProfileKnoxDir();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getManagedProfileKnoxDir", null, 19));
            return null;
        }
    }

    public boolean isSensitive(File file) {
        try {
            return this.mSdpFileSystem.isSensitive(file);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "isSensitive", new Class[]{File.class}, 19));
            return false;
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        try {
            return this.mSdpFileSystem.openOrCreateDatabase(str, i, cursorFactory, databaseErrorHandler);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "openOrCreateDatabase", new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class, DatabaseErrorHandler.class}, 19));
            return null;
        }
    }

    public boolean setSensitive(File file) {
        try {
            return this.mSdpFileSystem.setSensitive(file);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "setSensitive", new Class[]{File.class}, 19));
            return false;
        }
    }

    public File getExternalStorageDirectory() {
        try {
            return this.mSdpFileSystem.getExternalStorageDirectory();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getExternalStorageDirectory", null, 19));
            return null;
        }
    }

    public File getUserDataDir() {
        try {
            return this.mSdpFileSystem.getUserDataDir();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "getUserDataDir", null, 19));
            return null;
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        try {
            return this.mSdpFileSystem.openOrCreateDatabase(str, i, cursorFactory);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpFileSystem.class, "openOrCreateDatabase", new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class}, 19));
            return null;
        }
    }
}
