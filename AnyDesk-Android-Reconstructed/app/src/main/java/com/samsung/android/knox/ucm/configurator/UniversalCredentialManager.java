package com.samsung.android.knox.ucm.configurator;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UniversalCredentialManager {
    private static final String BUNDLE_CA_CERT_TYPE = "cert_type";
    private static final String BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST = "add_pin_cache_exemptlist";
    private static final String BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET = "enforce_lock_type_direct_set";
    private static final String BUNDLE_EXTRA_ODE_CA_CERT = "ode_ca_cert";
    private static final String BUNDLE_EXTRA_PIN_CACHE = "pin_cache";
    private static final String BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES = "timeout";
    private static final String BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST = "remove_pin_cache_exemptlist";
    private static final String BUNDLE_EXTRA_USER_ID = "userId";
    private static final String TAG = "UniversalCredentialManager-SupportLib";
    private com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager mCredentialManager;

    private UniversalCredentialManager(com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager universalCredentialManager) {
        this.mCredentialManager = universalCredentialManager;
    }

    public static synchronized UniversalCredentialManager getUCMManager(Context context) {
        try {
            com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager uCMManager = com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(context);
            if (uCMManager != null) {
                return new UniversalCredentialManager(uCMManager);
            }
        } catch (NoClassDefFoundError unused) {
            if (EnterpriseDeviceManager.getAPILevel() > -1) {
                throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialManager.class, 19));
            }
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
        return null;
    }

    private void validateBundle(Bundle bundle) {
        if (bundle != null && EnterpriseDeviceManager.getAPILevel() > -1 && EnterpriseDeviceManager.getAPILevel() < 20) {
            if (bundle.get(BUNDLE_CA_CERT_TYPE) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_CA_CERT_TYPE, 20));
                return;
            }
            if (bundle.get(BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST, 20));
                return;
            }
            if (bundle.get(BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET, 20));
                return;
            }
            if (bundle.get(BUNDLE_EXTRA_ODE_CA_CERT) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_ODE_CA_CERT, 20));
                return;
            }
            if (bundle.get(BUNDLE_EXTRA_PIN_CACHE) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_PIN_CACHE, 20));
                return;
            }
            if (bundle.get(BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES, 20));
            } else if (bundle.get(BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST) != null) {
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST, 20));
            } else {
                if (bundle.get(BUNDLE_EXTRA_USER_ID) == null) {
                    return;
                }
                id.t(SupportLibUtils.buildFieldErrorMsg(UniversalCredentialManager.class, BUNDLE_EXTRA_USER_ID, 20));
            }
        }
    }

    public int addPackagesToExemptList(CredentialStorage credentialStorage, int i, List<AppIdentity> list) {
        try {
            return this.mCredentialManager.addPackagesToExemptList(CredentialStorage.convertToOld(credentialStorage), i, AppIdentity.convertToOldList(list));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int addPackagesToWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.addPackagesToWhiteList(CredentialStorage.convertToOld(credentialStorage), AppIdentity.convertToOldList(list), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int clearWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.clearWhiteList(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int configureCredentialStorageForODESettings(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.configureCredentialStorageForODESettings(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int configureCredentialStoragePlugin(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.configureCredentialStoragePlugin(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int deleteCACertificate(String str) {
        try {
            return this.mCredentialManager.deleteCACertificate(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "deleteCACertificate", new Class[]{String.class}, 20));
            return 0;
        }
    }

    public int deleteCertificate(CredentialStorage credentialStorage, String str) {
        try {
            return this.mCredentialManager.deleteCertificate(CredentialStorage.convertToOld(credentialStorage), str);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            if (EnterpriseDeviceManager.getAPILevel() != 20 && bundle != null) {
                return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage), bundle);
            }
            return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "enforceCredentialStorageAsLockType", new Class[]{CredentialStorage.class, Bundle.class}, 20));
            return 0;
        }
    }

    public String[] getAliases(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getAliases(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public int getAuthType(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getAuthType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public CredentialStorage[] getAvailableCredentialStorages() {
        try {
            return CredentialStorage.convertToNewArray(this.mCredentialManager.getAvailableCredentialStorages());
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getAvailableCredentialStorages", null, 19));
            return null;
        }
    }

    public CACertificateInfo getCACertificate(String str) {
        try {
            return CACertificateInfo.convertToNew(this.mCredentialManager.getCACertificate(str));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCACertificate", new Class[]{String.class}, 20));
            return null;
        }
    }

    public String[] getCACertificateAliases(Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.getCACertificateAliases(bundle);
        } catch (NoSuchFieldError e) {
            id.t(e.getMessage());
            return null;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCACertificateAliases", new Class[]{Bundle.class}, 20));
            return null;
        }
    }

    public Bundle getCredentialStoragePluginConfiguration(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getCredentialStoragePluginConfiguration(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public Bundle getCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.getCredentialStorageProperty(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCredentialStorageProperty", new Class[]{CredentialStorage.class, Bundle.class}, 20));
            return null;
        }
    }

    public CredentialStorage[] getCredentialStorages(String str) {
        try {
            return CredentialStorage.convertToNewArray(this.mCredentialManager.getCredentialStorages(str));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getCredentialStorages", new Class[]{String.class}, 19));
            return null;
        }
    }

    public CredentialStorage getEnforcedCredentialStorageForLockType() {
        try {
            return CredentialStorage.convertToNew(this.mCredentialManager.getEnforcedCredentialStorageForLockType());
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getEnforcedCredentialStorageForLockType", null, 20));
            return null;
        }
    }

    public Bundle getODESettingsConfiguration() {
        try {
            return this.mCredentialManager.getODESettingsConfiguration();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "getODESettingsConfiguration", null, 20));
            return null;
        }
    }

    public List<AppIdentity> getPackagesFromExemptList(CredentialStorage credentialStorage, int i) {
        try {
            return AppIdentity.convertoToNewList(this.mCredentialManager.getPackagesFromExemptList(CredentialStorage.convertToOld(credentialStorage), i));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public List<AppIdentity> getPackagesFromWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            return AppIdentity.convertoToNewList(this.mCredentialManager.getPackagesFromWhiteList(CredentialStorage.convertToOld(credentialStorage), bundle));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public String[] getSupportedAlgorithms(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.getSupportedAlgorithms(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public int installCACertificate(byte[] bArr, String str, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.installCACertificate(bArr, str, bundle);
        } catch (NoSuchFieldError e) {
            id.t(e.getMessage());
            return 0;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "installCACertificate", new Class[]{byte[].class, String.class, Bundle.class}, 20));
            return 0;
        }
    }

    public int installCertificate(CredentialStorage credentialStorage, byte[] bArr, String str, String str2, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.installCertificate(CredentialStorage.convertToOld(credentialStorage), bArr, str, str2, bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public boolean isCredentialStorageManaged(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.isCredentialStorageManaged(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return false;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return false;
        }
    }

    public int manageCredentialStorage(CredentialStorage credentialStorage, boolean z) {
        try {
            return this.mCredentialManager.manageCredentialStorage(CredentialStorage.convertToOld(credentialStorage), z);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int removePackagesFromExemptList(CredentialStorage credentialStorage, int i, List<AppIdentity> list) {
        try {
            return this.mCredentialManager.removePackagesFromExemptList(CredentialStorage.convertToOld(credentialStorage), i, AppIdentity.convertToOldList(list));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int removePackagesFromWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.removePackagesFromWhiteList(CredentialStorage.convertToOld(credentialStorage), AppIdentity.convertToOldList(list), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public int setAuthType(CredentialStorage credentialStorage, int i) {
        try {
            return this.mCredentialManager.setAuthType(CredentialStorage.convertToOld(credentialStorage), i);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        }
    }

    public Bundle setCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        try {
            validateBundle(bundle);
            return this.mCredentialManager.setCredentialStorageProperty(CredentialStorage.convertToOld(credentialStorage), bundle);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "setCredentialStorageProperty", new Class[]{CredentialStorage.class, Bundle.class}, 20));
            return null;
        }
    }

    public static synchronized UniversalCredentialManager getUCMManager(Context context, int i) {
        try {
            com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager uCMManager = com.sec.enterprise.knox.ucm.configurator.UniversalCredentialManager.getUCMManager(context, i);
            if (uCMManager != null) {
                return new UniversalCredentialManager(uCMManager);
            }
        } catch (NoClassDefFoundError unused) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            } else {
                throw new NoClassDefFoundError(SupportLibUtils.buildClassErrorMsg(UniversalCredentialManager.class, 19));
            }
        }
        return null;
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage) {
        try {
            return this.mCredentialManager.enforceCredentialStorageAsLockType(CredentialStorage.convertToOld(credentialStorage));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return 0;
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(UniversalCredentialManager.class, "enforceCredentialStorageAsLockType", new Class[]{CredentialStorage.class}, 20));
            return 0;
        }
    }
}
