package com.samsung.android.knox.custom;

import android.app.enterprise.knoxcustom.KnoxCustomManager;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public class CustomDeviceManager {
    static final int ON = 1;
    static final int SHORTCUT_APP_TYPE = 1;
    private static final String TAG = "CustomDeviceManager-SupportLib";
    static final int USE_DEFAULT = 0;
    private static android.app.enterprise.knoxcustom.CustomDeviceManager mCustomDeviceManager;
    private static CustomDeviceManager mInstance;
    private static ProKioskManager mInstanceProKioskManager;
    private static SettingsManager mInstanceSettingsManager;
    private static SystemManager mInstanceSystemManager;
    private static KnoxCustomManager mKnoxCustomManager;

    private CustomDeviceManager(android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager) {
        mCustomDeviceManager = customDeviceManager;
    }

    public static CustomDeviceManager getInstance() {
        try {
            if (mInstance == null) {
                if (EnterpriseDeviceManager.getAPILevel() >= 17) {
                    android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = android.app.enterprise.knoxcustom.CustomDeviceManager.getInstance();
                    if (customDeviceManager != null) {
                        mInstance = new CustomDeviceManager(customDeviceManager);
                    }
                } else {
                    KnoxCustomManager knoxCustomManager = KnoxCustomManager.getInstance();
                    if (knoxCustomManager != null) {
                        mInstance = new CustomDeviceManager(knoxCustomManager);
                    }
                }
            }
            return mInstance;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public boolean checkEnterprisePermission(String str) {
        android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
        return customDeviceManager != null ? customDeviceManager.checkEnterprisePermission(str) : mKnoxCustomManager.checkEnterprisePermission(str);
    }

    public ProKioskManager getProKioskManager() {
        if (mInstanceProKioskManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceProKioskManager = new ProKioskManager(customDeviceManager.getProKioskManager());
            } else {
                mInstanceProKioskManager = new ProKioskManager(mKnoxCustomManager);
            }
        }
        return mInstanceProKioskManager;
    }

    public String getSerialNumber() {
        android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
        return customDeviceManager != null ? customDeviceManager.getSerialNumber() : mKnoxCustomManager.getSerialNumber();
    }

    public SettingsManager getSettingsManager() {
        if (mInstanceSettingsManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceSettingsManager = new SettingsManager(customDeviceManager.getSettingsManager());
            } else {
                mInstanceSettingsManager = new SettingsManager(mKnoxCustomManager);
            }
        }
        return mInstanceSettingsManager;
    }

    public SystemManager getSystemManager() {
        if (mInstanceSystemManager == null) {
            android.app.enterprise.knoxcustom.CustomDeviceManager customDeviceManager = mCustomDeviceManager;
            if (customDeviceManager != null) {
                mInstanceSystemManager = new SystemManager(customDeviceManager.getSystemManager());
            } else {
                mInstanceSystemManager = new SystemManager(mKnoxCustomManager);
            }
        }
        return mInstanceSystemManager;
    }

    private CustomDeviceManager(KnoxCustomManager knoxCustomManager) {
        mKnoxCustomManager = knoxCustomManager;
    }
}
