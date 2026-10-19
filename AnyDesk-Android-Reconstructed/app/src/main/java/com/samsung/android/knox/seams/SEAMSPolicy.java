package com.samsung.android.knox.seams;

import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.SupportLibUtils;
import com.sec.enterprise.knox.seams.SEAMS;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SEAMSPolicy {
    private static String TAG = "SEAMSPolicy-SupportLib";
    private static SEAMSPolicy mInstance;
    private static SEAMS mSEAMS;

    private SEAMSPolicy(SEAMS seams) {
        mSEAMS = seams;
    }

    public static SEAMSPolicy getInstance(Context context) {
        SEAMSPolicy sEAMSPolicy;
        SEAMS seams;
        if (context == null) {
            return null;
        }
        SEAMSPolicy sEAMSPolicy2 = mInstance;
        if (sEAMSPolicy2 != null) {
            return sEAMSPolicy2;
        }
        try {
            synchronized (SEAMSPolicy.class) {
                try {
                    sEAMSPolicy = mInstance;
                    if (sEAMSPolicy == null && (seams = SEAMS.getInstance(context)) != null) {
                        sEAMSPolicy = new SEAMSPolicy(seams);
                        mInstance = sEAMSPolicy;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return sEAMSPolicy;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public int addAppToContainer(String str, String[] strArr, int i, int i2) {
        return mSEAMS.addAppToContainer(str, strArr, i, i2);
    }

    public int createSEContainer() {
        try {
            return mSEAMS.createSEContainer();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "createSEContainer", null, 12));
            return 0;
        }
    }

    public String getAMSLog() {
        return mSEAMS.getAMSLog();
    }

    public int getAMSLogLevel() {
        return mSEAMS.getAMSLogLevel();
    }

    public int getAMSMode() {
        return mSEAMS.getAMSMode();
    }

    public String getAVCLog() {
        return mSEAMS.getAVCLog();
    }

    public String getDataType(String str) {
        return mSEAMS.getDataType(str);
    }

    public String getDomain(String str) {
        return mSEAMS.getDomain(str);
    }

    public String[] getPackageNamesFromSEContainer(int i, int i2) {
        try {
            return mSEAMS.getPackageNamesFromSEContainer(i, i2);
        } catch (NoSuchMethodError unused) {
            Class cls = Integer.TYPE;
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "getPackageNamesFromSEContainer", new Class[]{cls, cls}, 12));
            return null;
        }
    }

    public String getSEAMSLog() {
        try {
            return mSEAMS.getSEAMSLog();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "getSEAMSLog", null, 12));
            return null;
        }
    }

    public int getSEContainerClipboardMode(int i) {
        try {
            return mSEAMS.getSEContainerClipboardMode(i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "getSEContainerClipboardMode", new Class[]{Integer.TYPE}, 19));
            return 0;
        }
    }

    public int[] getSEContainerIDs() {
        try {
            return mSEAMS.getSEContainerIDs();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "getSEContainerIDs", null, 12));
            return null;
        }
    }

    public int[] getSEContainerIDsFromPackageName(String str, int i) {
        try {
            return mSEAMS.getSEContainerIDsFromPackageName(str, i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "getSEContainerIDsFromPackageName", new Class[]{String.class, Integer.TYPE}, 12));
            return null;
        }
    }

    public int getSELinuxMode() {
        return mSEAMS.getSELinuxMode();
    }

    public String getSepolicyVersion() {
        return mSEAMS.getSepolicyVersion();
    }

    public String getSignatureFromCertificate(byte[] bArr) {
        return mSEAMS.getSignatureFromCertificate(bArr);
    }

    public String getSignatureFromPackage(String str) {
        return mSEAMS.getSignatureFromPackage(str);
    }

    public int hasKnoxContainers() {
        try {
            return mSEAMS.hasKnoxContainers();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "hasKnoxContainers", null, 12));
            return 0;
        }
    }

    public int hasSEContainers() {
        try {
            return mSEAMS.hasSEContainers();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "hasSEContainers", null, 12));
            return 0;
        }
    }

    public int isSEAndroidLogDumpStateInclude() {
        try {
            return mSEAMS.isSEAndroidLogDumpStateInclude();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "isSEAndroidLogDumpStateInclude", null, 12));
            return 0;
        }
    }

    public int isSEPolicyAutoUpdateEnabled() {
        try {
            return mSEAMS.isSEPolicyAutoUpdateEnabled();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "isSEPolicyAutoUpdateEnabled", null, 12));
            return 0;
        }
    }

    public int relabelAppDir(String str) {
        return mSEAMS.relabelAppDir(str);
    }

    public int relabelData() {
        return mSEAMS.relabelData();
    }

    public int removeAppFromContainer(String str, String[] strArr, int i, int i2) {
        try {
            return mSEAMS.removeAppFromContainer(str, strArr, i, i2);
        } catch (NoSuchMethodError unused) {
            Class cls = Integer.TYPE;
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "removeAppFromContainer", new Class[]{String.class, String[].class, cls, cls}, 12));
            return 0;
        }
    }

    public int removeSEContainer(int i) {
        try {
            return mSEAMS.removeSEContainer(i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "removeSEContainer", new Class[]{Integer.TYPE}, 12));
            return 0;
        }
    }

    public int setAMSLogLevel(int i) {
        return mSEAMS.setAMSLogLevel(i);
    }

    public int setSEAndroidLogDumpStateInclude(boolean z) {
        try {
            return mSEAMS.setSEAndroidLogDumpStateInclude(z);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "setSEAndroidLogDumpStateInclude", new Class[]{Boolean.TYPE}, 12));
            return 0;
        }
    }

    public int setSEContainerClipboardMode(int i, int i2) {
        try {
            return mSEAMS.setSEContainerClipboardMode(i, i2);
        } catch (NoSuchMethodError unused) {
            Class cls = Integer.TYPE;
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SEAMSPolicy.class, "setSEContainerClipboardMode", new Class[]{cls, cls}, 19));
            return 0;
        }
    }

    public String getDataType(String str, int i) {
        return mSEAMS.getDataType(str, i);
    }

    public String getDomain(String str, int i) {
        return mSEAMS.getDomain(str, i);
    }

    public int removeAppFromContainer(String str, String[] strArr) {
        return mSEAMS.removeAppFromContainer(str, strArr);
    }
}
