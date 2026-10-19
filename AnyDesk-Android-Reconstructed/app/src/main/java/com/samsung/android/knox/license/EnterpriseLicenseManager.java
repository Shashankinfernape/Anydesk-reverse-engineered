package com.samsung.android.knox.license;

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseLicenseManager {
    public static final String ACTION_LICENSE_STATUS = "com.samsung.android.knox.intent.action.LICENSE_STATUS";
    public static final String EXTRA_LICENSE_ATTESTATION_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_ATTESTATION_STATUS";
    public static final String EXTRA_LICENSE_ERROR_CODE = "com.samsung.android.knox.intent.extra.LICENSE_ERROR_CODE";
    public static final String EXTRA_LICENSE_PERM_GROUP = "com.samsung.android.knox.intent.extra.LICENSE_PERM_GROUP";
    public static final String EXTRA_LICENSE_RESULT_TYPE = "com.samsung.android.knox.intent.extra.LICENSE_RESULT_TYPE";
    public static final String EXTRA_LICENSE_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_STATUS";
    private static final String TAG = "EnterpriseLicenseManager-SupportLib";
    private static EnterpriseLicenseManager mELM;
    private static android.app.enterprise.license.EnterpriseLicenseManager mEnterpriseLicenseManager;

    private EnterpriseLicenseManager(android.app.enterprise.license.EnterpriseLicenseManager enterpriseLicenseManager) {
        mEnterpriseLicenseManager = enterpriseLicenseManager;
    }

    public static EnterpriseLicenseManager getInstance(Context context) {
        EnterpriseLicenseManager enterpriseLicenseManager;
        android.app.enterprise.license.EnterpriseLicenseManager enterpriseLicenseManager2;
        if (context == null) {
            return null;
        }
        EnterpriseLicenseManager enterpriseLicenseManager3 = mELM;
        if (enterpriseLicenseManager3 != null) {
            return enterpriseLicenseManager3;
        }
        try {
            synchronized (EnterpriseLicenseManager.class) {
                try {
                    enterpriseLicenseManager = mELM;
                    if (enterpriseLicenseManager == null && (enterpriseLicenseManager2 = android.app.enterprise.license.EnterpriseLicenseManager.getInstance(context)) != null) {
                        enterpriseLicenseManager = new EnterpriseLicenseManager(enterpriseLicenseManager2);
                        mELM = enterpriseLicenseManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return enterpriseLicenseManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public void activateLicense(String str) {
        mEnterpriseLicenseManager.activateLicense(str);
    }

    public JSONArray getApiCallDataByAdmin(String str) {
        return mEnterpriseLicenseManager.getApiCallDataByAdmin(str);
    }

    public void activateLicense(String str, String str2) {
        mEnterpriseLicenseManager.activateLicense(str, str2);
    }
}
