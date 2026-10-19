package com.samsung.android.knox.ucm.core;

import android.os.Bundle;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;
import defpackage.id;
import defpackage.nh0;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public class UniversalCredentialUtil {
    public static final String AGENT_IS_GENERATE_PASSWORD_AVAILABLE = "isGeneratePasswordAvailable";
    public static final String AGENT_IS_PUK_SUPPORTED = "isPUKSupported";
    private static final String TAG = "UniversalCredentialUtil-SupportLib";
    private final com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil mUniversalCredentialUtil;

    private UniversalCredentialUtil(com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil universalCredentialUtil) {
        this.mUniversalCredentialUtil = universalCredentialUtil;
    }

    public static UniversalCredentialUtil getInstance() {
        try {
            com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil universalCredentialUtil = com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getInstance();
            if (universalCredentialUtil == null) {
                return null;
            }
            return new UniversalCredentialUtil(universalCredentialUtil);
        } catch (NoClassDefFoundError unused) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                return null;
            }
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return null;
        }
    }

    public static String getKeychainUri(String str, String str2) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getKeychainUri(str, str2);
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return null;
        }
    }

    public static String getRawAlias(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getRawAlias(str);
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return null;
        }
    }

    public static String getSource(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getSource(str);
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return null;
        }
    }

    public static boolean isValidUri(String str) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.isValidUri(str);
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return false;
        }
    }

    private void verifyBundle(Bundle bundle) {
        if (bundle != null && EnterpriseDeviceManager.getAPILevel() > -1 && EnterpriseDeviceManager.getAPILevel() < 20) {
            if (bundle.get(AGENT_IS_GENERATE_PASSWORD_AVAILABLE) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, AGENT_IS_GENERATE_PASSWORD_AVAILABLE, 20));
            } else {
                if (bundle.get(AGENT_IS_PUK_SUPPORTED) == null) {
                    return;
                }
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, AGENT_IS_PUK_SUPPORTED, 20));
            }
        }
    }

    public Bundle APDUCommand(String str, byte[] bArr, Bundle bundle) {
        try {
            verifyBundle(bundle);
            return this.mUniversalCredentialUtil.APDUCommand(str, bArr, bundle);
        } catch (NoSuchFieldError e) {
            id.t(e.getMessage());
            return null;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "APDUCommand", new Class[]{String.class, byte[].class, Bundle.class}, 19));
            return null;
        }
    }

    public Bundle changePin(String str, String str2, String str3) {
        try {
            return this.mUniversalCredentialUtil.changePin(str, str2, str3);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "changePin", new Class[]{String.class, String.class, String.class}, 19));
            return null;
        }
    }

    public Bundle getInfo(String str) {
        try {
            return this.mUniversalCredentialUtil.getInfo(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "getInfo", new Class[]{String.class}, 19));
            return null;
        }
    }

    public Provider[] getProviders() {
        try {
            return this.mUniversalCredentialUtil.getProviders();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialUtil.class, "getProviders", null, 19));
            return null;
        }
    }

    public static String getKeychainUri(String str, String str2, int i) {
        try {
            return com.sec.enterprise.knox.ucm.core.UniversalCredentialUtil.getKeychainUri(str, str2, i);
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(UniversalCredentialUtil.class, 19));
            return null;
        }
    }
}
