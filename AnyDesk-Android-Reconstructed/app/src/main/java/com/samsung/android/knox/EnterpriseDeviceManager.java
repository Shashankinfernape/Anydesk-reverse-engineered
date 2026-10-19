package com.samsung.android.knox;

import android.app.Application;
import android.app.enterprise.FirewallPolicy;
import android.app.enterprise.MiscPolicy;
import android.app.enterprise.SecurityPolicy;
import android.app.enterprise.devicesettings.DeviceSettingsPolicy;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.bluetooth.BluetoothPolicy;
import com.samsung.android.knox.bluetooth.BluetoothSecureModePolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.container.BasePasswordPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.deviceinfo.DeviceInventory;
import com.samsung.android.knox.devicesecurity.DeviceSecurityPolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.display.Font;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.lockscreen.LockscreenOverlay;
import com.samsung.android.knox.multiuser.MultiUserManager;
import com.samsung.android.knox.net.GlobalProxy;
import com.samsung.android.knox.net.apn.ApnSettingsPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.vpn.VpnPolicy;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.nfc.NfcPolicy;
import com.samsung.android.knox.remotecontrol.RemoteInjection;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import com.samsung.android.knox.restriction.RoamingPolicy;
import com.samsung.android.knox.restriction.SPDControlPolicy;
import com.sec.enterprise.knox.AdvancedRestrictionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseDeviceManager {
    private static final int API_LEVEL_NOT_DEFINED = 0;
    private static final boolean DEBUG = true;
    private static final int KNOX_1_0 = 6;
    private static final int KNOX_1_0_1 = 7;
    private static final int KNOX_1_0_2 = 8;
    private static final int KNOX_1_1 = 9;
    private static final int KNOX_1_2 = 10;
    public static final int KNOX_2_0 = 11;
    public static final int KNOX_2_1 = 12;
    public static final int KNOX_2_2 = 13;
    public static final int KNOX_2_3 = 14;
    public static final int KNOX_2_4 = 15;
    public static final int KNOX_2_4_1 = 16;
    public static final int KNOX_2_5 = 17;
    public static final int KNOX_2_5_1 = 18;
    public static final int KNOX_2_6 = 19;
    public static final int KNOX_2_7 = 20;
    public static final int KNOX_NOT_SUPPORTED = -1;
    private static final int MDM_2_0 = 2;
    private static final int MDM_2_1 = 3;
    private static final int MDM_2_2 = 4;
    private static final int MDM_3_0 = 5;
    private static final String TAG = "EnterpriseDeviceManager-SupportLib";
    private static int mAPILevel;
    private static Context mContext;
    private static android.app.enterprise.EnterpriseDeviceManager mEdm;
    private static EnterpriseDeviceManager mInstance;
    private volatile ApnSettingsPolicy mApnSettingsPolicy;
    private volatile ApplicationPolicy mApplicationPolicy;
    private volatile BasePasswordPolicy mBasePasswordPolicy;
    private volatile BluetoothPolicy mBluetoothPolicy;
    private volatile BluetoothSecureModePolicy mBluetoothSecureModePolicy;
    private volatile BootBanner mBootBanner;
    private volatile BrowserPolicy mBrowserPolicy;
    private volatile CertificateProvisioning mCertificateProvisioning;
    private volatile DateTimePolicy mDateTimePolicy;
    private volatile DeviceAccountPolicy mDeviceAccountPolicy;
    private volatile DeviceInventory mDeviceInventory;
    private volatile DeviceSecurityPolicy mDeviceSecurityPolicy;
    private volatile EmailAccountPolicy mEmailAccountPolicy;
    private volatile EmailPolicy mEmailPolicy;
    private volatile EnterpriseLicenseManager mEnterpriseLicenseManager;
    private volatile ExchangeAccountPolicy mExchangeAccountPolicy;
    private volatile Firewall mFirewall;
    private volatile Font mFont;
    private volatile Geofencing mGeofencing;
    private volatile GlobalProxy mGlobalProxy;
    private volatile KioskMode mKioskMode;
    private volatile LDAPAccountPolicy mLDAPAccountPolicy;
    private volatile LocationPolicy mLocationPolicy;
    private volatile LockscreenOverlay mLockscreenOverlay;
    private volatile MultiUserManager mMultiUserManager;
    private volatile NfcPolicy mNfcPolicy;
    private volatile PasswordPolicy mPasswordPolicy;
    private volatile PhoneRestrictionPolicy mPhoneRestrictionPolicy;
    private volatile RemoteInjection mRemoteInjection;
    private volatile RestrictionPolicy mRestrictionPolicy;
    private volatile RoamingPolicy mRoamingPolicy;
    private volatile SPDControlPolicy mSPDControlPolicy;
    private volatile VpnPolicy mVpnPolicy;
    private volatile WifiPolicy mWifiPolicy;

    /* JADX INFO: renamed from: com.samsung.android.knox.EnterpriseDeviceManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion;
        static final /* synthetic */ int[] $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion;

        static {
            int[] iArr = new int[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.values().length];
            $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion = iArr;
            try {
                iArr[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_2_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4_0_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_4_1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_4_1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_5.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_5_1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_6.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[android.app.enterprise.EnterpriseDeviceManager.EnterpriseSdkVersion.ENTERPRISE_SDK_VERSION_5_7.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr2 = new int[com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.values().length];
            $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion = iArr2;
            try {
                iArr2[com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_0_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_0_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_1_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[com.sec.enterprise.knox.EnterpriseKnoxManager.EnterpriseKnoxSdkVersion.KNOX_ENTERPRISE_SDK_VERSION_1_2_0.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private EnterpriseDeviceManager(android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager) {
        mEdm = enterpriseDeviceManager;
    }

    public static int getAPILevel() {
        int i = mAPILevel;
        if (i != 0) {
            return i;
        }
        try {
            android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager = mEdm;
            if (enterpriseDeviceManager == null) {
                Context contextFromCurrentApplication = getContextFromCurrentApplication();
                enterpriseDeviceManager = contextFromCurrentApplication != null ? (android.app.enterprise.EnterpriseDeviceManager) contextFromCurrentApplication.getSystemService("enterprise_policy") : null;
            }
            if (enterpriseDeviceManager != null) {
                switch (AnonymousClass1.$SwitchMap$android$app$enterprise$EnterpriseDeviceManager$EnterpriseSdkVersion[enterpriseDeviceManager.getEnterpriseSdkVer().ordinal()]) {
                    case 1:
                        mAPILevel = 2;
                        break;
                    case 2:
                        mAPILevel = 3;
                        break;
                    case 3:
                        mAPILevel = 4;
                        break;
                    case 4:
                        mAPILevel = 5;
                        break;
                    case 5:
                        mAPILevel = 6;
                        break;
                    case 6:
                        com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager = com.sec.enterprise.knox.EnterpriseKnoxManager.getInstance();
                        if (enterpriseKnoxManager != null) {
                            int i2 = AnonymousClass1.$SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[enterpriseKnoxManager.getVersion().ordinal()];
                            if (i2 != 1 && i2 == 2) {
                                mAPILevel = 8;
                            } else {
                                mAPILevel = 7;
                            }
                        }
                        break;
                    case 7:
                        com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager2 = com.sec.enterprise.knox.EnterpriseKnoxManager.getInstance();
                        if (enterpriseKnoxManager2 != null) {
                            int i3 = AnonymousClass1.$SwitchMap$com$sec$enterprise$knox$EnterpriseKnoxManager$EnterpriseKnoxSdkVersion[enterpriseKnoxManager2.getVersion().ordinal()];
                            if (i3 != 3 && i3 == 4) {
                                mAPILevel = 10;
                            } else {
                                mAPILevel = 9;
                            }
                        }
                        break;
                    case 8:
                        mAPILevel = 11;
                        break;
                    case 9:
                        mAPILevel = 12;
                        break;
                    case 10:
                        mAPILevel = 13;
                        break;
                    case 11:
                        mAPILevel = 14;
                        break;
                    case 12:
                        mAPILevel = 15;
                        break;
                    case 13:
                        mAPILevel = 16;
                        break;
                    case KNOX_2_3 /* 14 */:
                        mAPILevel = 17;
                        break;
                    case KNOX_2_4 /* 15 */:
                        mAPILevel = 18;
                        break;
                    case KNOX_2_4_1 /* 16 */:
                        mAPILevel = 19;
                        break;
                    case KNOX_2_5 /* 17 */:
                        mAPILevel = 20;
                        break;
                }
            }
            return mAPILevel;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return -1;
        }
    }

    private static Context getContextFromCurrentApplication() {
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
        } catch (Exception unused) {
            Log.w(TAG, "Could not call ActivityThread.currentApplication()");
            return null;
        }
    }

    public static EnterpriseDeviceManager getInstance(Context context) {
        EnterpriseDeviceManager enterpriseDeviceManager;
        android.app.enterprise.EnterpriseDeviceManager enterpriseDeviceManager2;
        if (context == null) {
            return null;
        }
        EnterpriseDeviceManager enterpriseDeviceManager3 = mInstance;
        if (enterpriseDeviceManager3 != null) {
            return enterpriseDeviceManager3;
        }
        try {
            synchronized (EnterpriseDeviceManager.class) {
                try {
                    enterpriseDeviceManager = mInstance;
                    if (enterpriseDeviceManager == null && (enterpriseDeviceManager2 = (android.app.enterprise.EnterpriseDeviceManager) context.getSystemService("enterprise_policy")) != null) {
                        enterpriseDeviceManager = new EnterpriseDeviceManager(enterpriseDeviceManager2);
                        mInstance = enterpriseDeviceManager;
                        mContext = context;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return enterpriseDeviceManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public boolean getAdminRemovable(String str) {
        return mEdm.getAdminRemovable(str);
    }

    public ApnSettingsPolicy getApnSettingsPolicy() {
        ApnSettingsPolicy apnSettingsPolicy;
        android.app.enterprise.ApnSettingsPolicy apnSettingsPolicy2;
        ApnSettingsPolicy apnSettingsPolicy3 = this.mApnSettingsPolicy;
        if (apnSettingsPolicy3 != null) {
            return apnSettingsPolicy3;
        }
        synchronized (this) {
            try {
                apnSettingsPolicy = this.mApnSettingsPolicy;
                if (apnSettingsPolicy == null && (apnSettingsPolicy2 = mEdm.getApnSettingsPolicy()) != null) {
                    apnSettingsPolicy = new ApnSettingsPolicy(apnSettingsPolicy2);
                    this.mApnSettingsPolicy = apnSettingsPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return apnSettingsPolicy;
    }

    public ApplicationPolicy getApplicationPolicy() {
        ApplicationPolicy applicationPolicy;
        ApplicationPolicy applicationPolicy2 = this.mApplicationPolicy;
        com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager = com.sec.enterprise.knox.EnterpriseKnoxManager.getInstance();
        if (applicationPolicy2 != null) {
            return applicationPolicy2;
        }
        synchronized (this) {
            try {
                applicationPolicy = this.mApplicationPolicy;
                if (applicationPolicy == null) {
                    android.app.enterprise.ApplicationPolicy applicationPolicy3 = mEdm.getApplicationPolicy();
                    if (getAPILevel() >= 11) {
                        AdvancedRestrictionPolicy advancedRestrictionPolicy = enterpriseKnoxManager.getAdvancedRestrictionPolicy(mContext);
                        if (applicationPolicy3 != null && advancedRestrictionPolicy != null) {
                            applicationPolicy = new ApplicationPolicy(applicationPolicy3, advancedRestrictionPolicy);
                            this.mApplicationPolicy = applicationPolicy;
                        }
                    } else if (applicationPolicy3 != null) {
                        applicationPolicy = new ApplicationPolicy(applicationPolicy3, null);
                        this.mApplicationPolicy = applicationPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return applicationPolicy;
    }

    public BluetoothPolicy getBluetoothPolicy() {
        BluetoothPolicy bluetoothPolicy;
        BluetoothPolicy bluetoothPolicy2 = this.mBluetoothPolicy;
        if (bluetoothPolicy2 != null) {
            return bluetoothPolicy2;
        }
        synchronized (this) {
            try {
                bluetoothPolicy = this.mBluetoothPolicy;
                if (bluetoothPolicy == null) {
                    android.app.enterprise.BluetoothPolicy bluetoothPolicy3 = mEdm.getBluetoothPolicy();
                    android.app.enterprise.RestrictionPolicy restrictionPolicy = mEdm.getRestrictionPolicy();
                    if (bluetoothPolicy3 != null && restrictionPolicy != null) {
                        bluetoothPolicy = new BluetoothPolicy(bluetoothPolicy3, restrictionPolicy);
                        this.mBluetoothPolicy = bluetoothPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bluetoothPolicy;
    }

    public BluetoothSecureModePolicy getBluetoothSecureModePolicy() {
        BluetoothSecureModePolicy bluetoothSecureModePolicy;
        android.app.enterprise.BluetoothSecureModePolicy bluetoothSecureModePolicy2;
        BluetoothSecureModePolicy bluetoothSecureModePolicy3 = this.mBluetoothSecureModePolicy;
        if (bluetoothSecureModePolicy3 != null) {
            return bluetoothSecureModePolicy3;
        }
        synchronized (this) {
            try {
                bluetoothSecureModePolicy = this.mBluetoothSecureModePolicy;
                if (bluetoothSecureModePolicy == null && (bluetoothSecureModePolicy2 = mEdm.getBluetoothSecureModePolicy()) != null) {
                    bluetoothSecureModePolicy = new BluetoothSecureModePolicy(bluetoothSecureModePolicy2);
                    this.mBluetoothSecureModePolicy = bluetoothSecureModePolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bluetoothSecureModePolicy;
    }

    public BootBanner getBootBanner() {
        BootBanner bootBanner;
        SecurityPolicy securityPolicy;
        BootBanner bootBanner2 = this.mBootBanner;
        if (bootBanner2 != null) {
            return bootBanner2;
        }
        synchronized (this) {
            try {
                bootBanner = this.mBootBanner;
                if (bootBanner == null && (securityPolicy = mEdm.getSecurityPolicy()) != null) {
                    bootBanner = new BootBanner(securityPolicy);
                    this.mBootBanner = bootBanner;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bootBanner;
    }

    public BrowserPolicy getBrowserPolicy() {
        BrowserPolicy browserPolicy;
        BrowserPolicy browserPolicy2 = this.mBrowserPolicy;
        if (browserPolicy2 != null) {
            return browserPolicy2;
        }
        synchronized (this) {
            try {
                browserPolicy = this.mBrowserPolicy;
                if (browserPolicy == null) {
                    android.app.enterprise.BrowserPolicy browserPolicy3 = mEdm.getBrowserPolicy();
                    MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                    if (browserPolicy3 != null && miscPolicy != null) {
                        browserPolicy = new BrowserPolicy(browserPolicy3, miscPolicy);
                        this.mBrowserPolicy = browserPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return browserPolicy;
    }

    public CertificateProvisioning getCertificateProvisioning() {
        CertificateProvisioning certificateProvisioning;
        SecurityPolicy securityPolicy;
        CertificateProvisioning certificateProvisioning2 = this.mCertificateProvisioning;
        if (certificateProvisioning2 != null) {
            return certificateProvisioning2;
        }
        synchronized (this) {
            try {
                certificateProvisioning = this.mCertificateProvisioning;
                if (certificateProvisioning == null && (securityPolicy = mEdm.getSecurityPolicy()) != null) {
                    certificateProvisioning = new CertificateProvisioning(securityPolicy);
                    this.mCertificateProvisioning = certificateProvisioning;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return certificateProvisioning;
    }

    public DateTimePolicy getDateTimePolicy() {
        DateTimePolicy dateTimePolicy;
        android.app.enterprise.DateTimePolicy dateTimePolicy2;
        DateTimePolicy dateTimePolicy3 = this.mDateTimePolicy;
        if (dateTimePolicy3 != null) {
            return dateTimePolicy3;
        }
        synchronized (this) {
            try {
                dateTimePolicy = this.mDateTimePolicy;
                if (dateTimePolicy == null && (dateTimePolicy2 = mEdm.getDateTimePolicy()) != null) {
                    dateTimePolicy = new DateTimePolicy(mContext, dateTimePolicy2);
                    this.mDateTimePolicy = dateTimePolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dateTimePolicy;
    }

    public DeviceAccountPolicy getDeviceAccountPolicy() {
        DeviceAccountPolicy deviceAccountPolicy;
        DeviceAccountPolicy deviceAccountPolicy2 = this.mDeviceAccountPolicy;
        if (deviceAccountPolicy2 != null) {
            return deviceAccountPolicy2;
        }
        synchronized (this) {
            try {
                deviceAccountPolicy = this.mDeviceAccountPolicy;
                if (deviceAccountPolicy == null) {
                    android.app.enterprise.DeviceAccountPolicy deviceAccountPolicy3 = mEdm.getDeviceAccountPolicy();
                    SecurityPolicy securityPolicy = mEdm.getSecurityPolicy();
                    if (deviceAccountPolicy3 != null && securityPolicy != null) {
                        deviceAccountPolicy = new DeviceAccountPolicy(deviceAccountPolicy3, securityPolicy);
                        this.mDeviceAccountPolicy = deviceAccountPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceAccountPolicy;
    }

    public DeviceInventory getDeviceInventory() {
        DeviceInventory deviceInventory;
        DeviceInventory deviceInventory2 = this.mDeviceInventory;
        if (deviceInventory2 != null) {
            return deviceInventory2;
        }
        synchronized (this) {
            try {
                deviceInventory = this.mDeviceInventory;
                if (deviceInventory == null) {
                    android.app.enterprise.DeviceInventory deviceInventory3 = mEdm.getDeviceInventory();
                    MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                    if (deviceInventory3 != null && miscPolicy != null) {
                        deviceInventory = new DeviceInventory(deviceInventory3, miscPolicy);
                        this.mDeviceInventory = deviceInventory;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceInventory;
    }

    public DeviceSecurityPolicy getDeviceSecurityPolicy() {
        DeviceSecurityPolicy deviceSecurityPolicy;
        DeviceSecurityPolicy deviceSecurityPolicy2 = this.mDeviceSecurityPolicy;
        if (deviceSecurityPolicy2 != null) {
            return deviceSecurityPolicy2;
        }
        synchronized (this) {
            try {
                deviceSecurityPolicy = this.mDeviceSecurityPolicy;
                if (deviceSecurityPolicy == null) {
                    MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                    SecurityPolicy securityPolicy = mEdm.getSecurityPolicy();
                    if (miscPolicy != null && securityPolicy != null) {
                        deviceSecurityPolicy = new DeviceSecurityPolicy(miscPolicy, securityPolicy);
                        this.mDeviceSecurityPolicy = deviceSecurityPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceSecurityPolicy;
    }

    public EmailAccountPolicy getEmailAccountPolicy() {
        EmailAccountPolicy emailAccountPolicy;
        android.app.enterprise.EmailAccountPolicy emailAccountPolicy2;
        EmailAccountPolicy emailAccountPolicy3 = this.mEmailAccountPolicy;
        if (emailAccountPolicy3 != null) {
            return emailAccountPolicy3;
        }
        synchronized (this) {
            try {
                emailAccountPolicy = this.mEmailAccountPolicy;
                if (emailAccountPolicy == null && (emailAccountPolicy2 = mEdm.getEmailAccountPolicy()) != null) {
                    emailAccountPolicy = new EmailAccountPolicy(emailAccountPolicy2);
                    this.mEmailAccountPolicy = emailAccountPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emailAccountPolicy;
    }

    public EmailPolicy getEmailPolicy() {
        EmailPolicy emailPolicy;
        android.app.enterprise.EmailPolicy emailPolicy2;
        EmailPolicy emailPolicy3 = this.mEmailPolicy;
        if (emailPolicy3 != null) {
            return emailPolicy3;
        }
        synchronized (this) {
            try {
                emailPolicy = this.mEmailPolicy;
                if (emailPolicy == null && (emailPolicy2 = mEdm.getEmailPolicy()) != null) {
                    emailPolicy = new EmailPolicy(emailPolicy2);
                    this.mEmailPolicy = emailPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emailPolicy;
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        ExchangeAccountPolicy exchangeAccountPolicy;
        android.app.enterprise.ExchangeAccountPolicy exchangeAccountPolicy2;
        ExchangeAccountPolicy exchangeAccountPolicy3 = this.mExchangeAccountPolicy;
        if (exchangeAccountPolicy3 != null) {
            return exchangeAccountPolicy3;
        }
        synchronized (this) {
            try {
                exchangeAccountPolicy = this.mExchangeAccountPolicy;
                if (exchangeAccountPolicy == null && (exchangeAccountPolicy2 = mEdm.getExchangeAccountPolicy()) != null) {
                    exchangeAccountPolicy = new ExchangeAccountPolicy(exchangeAccountPolicy2);
                    this.mExchangeAccountPolicy = exchangeAccountPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exchangeAccountPolicy;
    }

    public Firewall getFirewall() {
        Firewall firewall;
        Firewall firewall2 = this.mFirewall;
        if (firewall2 != null) {
            return firewall2;
        }
        synchronized (this) {
            try {
                firewall = this.mFirewall;
                if (firewall == null) {
                    if (getAPILevel() >= 17) {
                        com.sec.enterprise.firewall.Firewall firewall3 = mEdm.getFirewall();
                        if (firewall3 != null) {
                            firewall = new Firewall(firewall3);
                            this.mFirewall = firewall;
                        }
                    } else {
                        FirewallPolicy firewallPolicy = mEdm.getFirewallPolicy();
                        if (firewallPolicy != null) {
                            firewall = new Firewall(firewallPolicy);
                            this.mFirewall = firewall;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return firewall;
    }

    public Font getFont() {
        Font font;
        MiscPolicy miscPolicy;
        Font font2 = this.mFont;
        if (font2 != null) {
            return font2;
        }
        synchronized (this) {
            try {
                font = this.mFont;
                if (font == null && (miscPolicy = mEdm.getMiscPolicy()) != null) {
                    font = new Font(miscPolicy);
                    this.mFont = font;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return font;
    }

    public Geofencing getGeofencing() {
        Geofencing geofencing;
        android.app.enterprise.geofencing.Geofencing geofencing2;
        Geofencing geofencing3 = this.mGeofencing;
        if (geofencing3 != null) {
            return geofencing3;
        }
        synchronized (this) {
            try {
                geofencing = this.mGeofencing;
                if (geofencing == null && (geofencing2 = android.app.enterprise.geofencing.Geofencing.getInstance(mContext)) != null) {
                    geofencing = new Geofencing(geofencing2);
                    this.mGeofencing = geofencing;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return geofencing;
    }

    public GlobalProxy getGlobalProxy() {
        GlobalProxy globalProxy;
        DeviceSettingsPolicy deviceSettingsPolicy;
        GlobalProxy globalProxy2 = this.mGlobalProxy;
        if (globalProxy2 != null) {
            return globalProxy2;
        }
        synchronized (this) {
            try {
                globalProxy = this.mGlobalProxy;
                if (globalProxy == null && (deviceSettingsPolicy = DeviceSettingsPolicy.getInstance(mContext)) != null) {
                    globalProxy = new GlobalProxy(deviceSettingsPolicy);
                    this.mGlobalProxy = globalProxy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return globalProxy;
    }

    public KioskMode getKioskMode() {
        KioskMode kioskMode;
        android.app.enterprise.kioskmode.KioskMode kioskMode2;
        KioskMode kioskMode3 = this.mKioskMode;
        if (kioskMode3 != null) {
            return kioskMode3;
        }
        synchronized (this) {
            try {
                kioskMode = this.mKioskMode;
                if (kioskMode == null && (kioskMode2 = android.app.enterprise.kioskmode.KioskMode.getInstance(mContext)) != null) {
                    kioskMode = new KioskMode(kioskMode2);
                    this.mKioskMode = kioskMode;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kioskMode;
    }

    public LDAPAccountPolicy getLDAPAccountPolicy() {
        LDAPAccountPolicy lDAPAccountPolicy;
        android.app.enterprise.LDAPAccountPolicy lDAPAccountPolicy2;
        LDAPAccountPolicy lDAPAccountPolicy3 = this.mLDAPAccountPolicy;
        if (lDAPAccountPolicy3 != null) {
            return lDAPAccountPolicy3;
        }
        synchronized (this) {
            try {
                lDAPAccountPolicy = this.mLDAPAccountPolicy;
                if (lDAPAccountPolicy == null && (lDAPAccountPolicy2 = mEdm.getLDAPAccountPolicy()) != null) {
                    lDAPAccountPolicy = new LDAPAccountPolicy(lDAPAccountPolicy2);
                    this.mLDAPAccountPolicy = lDAPAccountPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lDAPAccountPolicy;
    }

    public LocationPolicy getLocationPolicy() {
        LocationPolicy locationPolicy;
        android.app.enterprise.LocationPolicy locationPolicy2;
        LocationPolicy locationPolicy3 = this.mLocationPolicy;
        if (locationPolicy3 != null) {
            return locationPolicy3;
        }
        synchronized (this) {
            try {
                locationPolicy = this.mLocationPolicy;
                if (locationPolicy == null && (locationPolicy2 = mEdm.getLocationPolicy()) != null) {
                    locationPolicy = new LocationPolicy(locationPolicy2);
                    this.mLocationPolicy = locationPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationPolicy;
    }

    public LockscreenOverlay getLockscreenOverlay() {
        LockscreenOverlay lockscreenOverlay;
        LockscreenOverlay lockscreenOverlay2 = this.mLockscreenOverlay;
        if (lockscreenOverlay2 != null) {
            return lockscreenOverlay2;
        }
        synchronized (this) {
            try {
                lockscreenOverlay = this.mLockscreenOverlay;
                if (lockscreenOverlay == null) {
                    android.app.enterprise.lso.LockscreenOverlay lockscreenOverlay3 = android.app.enterprise.lso.LockscreenOverlay.getInstance(mContext);
                    MiscPolicy miscPolicy = mEdm.getMiscPolicy();
                    if (lockscreenOverlay3 != null && miscPolicy != null) {
                        lockscreenOverlay = new LockscreenOverlay(lockscreenOverlay3, miscPolicy);
                        this.mLockscreenOverlay = lockscreenOverlay;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lockscreenOverlay;
    }

    public MultiUserManager getMultiUserManager() {
        MultiUserManager multiUserManager;
        android.app.enterprise.multiuser.MultiUserManager multiUserManager2;
        MultiUserManager multiUserManager3 = this.mMultiUserManager;
        if (multiUserManager3 != null) {
            return multiUserManager3;
        }
        synchronized (this) {
            try {
                multiUserManager = this.mMultiUserManager;
                if (multiUserManager == null && (multiUserManager2 = android.app.enterprise.multiuser.MultiUserManager.getInstance(mContext)) != null) {
                    multiUserManager = new MultiUserManager(multiUserManager2);
                    this.mMultiUserManager = multiUserManager;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return multiUserManager;
    }

    public NfcPolicy getNfcPolicy() {
        NfcPolicy nfcPolicy;
        DeviceSettingsPolicy deviceSettingsPolicy;
        NfcPolicy nfcPolicy2 = this.mNfcPolicy;
        if (nfcPolicy2 != null) {
            return nfcPolicy2;
        }
        synchronized (this) {
            try {
                nfcPolicy = this.mNfcPolicy;
                if (nfcPolicy == null && (deviceSettingsPolicy = DeviceSettingsPolicy.getInstance(mContext)) != null) {
                    nfcPolicy = new NfcPolicy(deviceSettingsPolicy);
                    this.mNfcPolicy = nfcPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nfcPolicy;
    }

    public PasswordPolicy getPasswordPolicy() {
        PasswordPolicy passwordPolicy;
        android.app.enterprise.PasswordPolicy passwordPolicy2;
        PasswordPolicy passwordPolicy3 = this.mPasswordPolicy;
        if (passwordPolicy3 != null) {
            return passwordPolicy3;
        }
        synchronized (this) {
            try {
                passwordPolicy = this.mPasswordPolicy;
                if (passwordPolicy == null && (passwordPolicy2 = mEdm.getPasswordPolicy()) != null) {
                    passwordPolicy = new PasswordPolicy(passwordPolicy2);
                    this.mPasswordPolicy = passwordPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return passwordPolicy;
    }

    public PhoneRestrictionPolicy getPhoneRestrictionPolicy() {
        PhoneRestrictionPolicy phoneRestrictionPolicy;
        android.app.enterprise.PhoneRestrictionPolicy phoneRestrictionPolicy2;
        PhoneRestrictionPolicy phoneRestrictionPolicy3 = this.mPhoneRestrictionPolicy;
        if (phoneRestrictionPolicy3 != null) {
            return phoneRestrictionPolicy3;
        }
        synchronized (this) {
            try {
                phoneRestrictionPolicy = this.mPhoneRestrictionPolicy;
                if (phoneRestrictionPolicy == null && (phoneRestrictionPolicy2 = mEdm.getPhoneRestrictionPolicy()) != null) {
                    phoneRestrictionPolicy = new PhoneRestrictionPolicy(phoneRestrictionPolicy2);
                    this.mPhoneRestrictionPolicy = phoneRestrictionPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return phoneRestrictionPolicy;
    }

    public RemoteInjection getRemoteInjection() {
        RemoteInjection remoteInjection;
        android.app.enterprise.remotecontrol.RemoteInjection remoteInjection2;
        RemoteInjection remoteInjection3 = this.mRemoteInjection;
        if (remoteInjection3 != null) {
            return remoteInjection3;
        }
        synchronized (this) {
            try {
                remoteInjection = this.mRemoteInjection;
                if (remoteInjection == null && (remoteInjection2 = android.app.enterprise.remotecontrol.RemoteInjection.getInstance()) != null) {
                    remoteInjection = new RemoteInjection(remoteInjection2);
                    this.mRemoteInjection = remoteInjection;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remoteInjection;
    }

    public RestrictionPolicy getRestrictionPolicy() {
        RestrictionPolicy restrictionPolicy;
        android.app.enterprise.RestrictionPolicy restrictionPolicy2;
        RestrictionPolicy restrictionPolicy3 = this.mRestrictionPolicy;
        if (restrictionPolicy3 != null) {
            return restrictionPolicy3;
        }
        synchronized (this) {
            try {
                restrictionPolicy = this.mRestrictionPolicy;
                if (restrictionPolicy == null && (restrictionPolicy2 = mEdm.getRestrictionPolicy()) != null) {
                    restrictionPolicy = new RestrictionPolicy(restrictionPolicy2);
                    this.mRestrictionPolicy = restrictionPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return restrictionPolicy;
    }

    public RoamingPolicy getRoamingPolicy() {
        RoamingPolicy roamingPolicy;
        android.app.enterprise.RoamingPolicy roamingPolicy2;
        RoamingPolicy roamingPolicy3 = this.mRoamingPolicy;
        if (roamingPolicy3 != null) {
            return roamingPolicy3;
        }
        synchronized (this) {
            try {
                roamingPolicy = this.mRoamingPolicy;
                if (roamingPolicy == null && (roamingPolicy2 = mEdm.getRoamingPolicy()) != null) {
                    roamingPolicy = new RoamingPolicy(roamingPolicy2);
                    this.mRoamingPolicy = roamingPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return roamingPolicy;
    }

    public SPDControlPolicy getSPDControlPolicy() {
        SPDControlPolicy sPDControlPolicy;
        SPDControlPolicy sPDControlPolicy2 = this.mSPDControlPolicy;
        if (sPDControlPolicy2 != null) {
            return sPDControlPolicy2;
        }
        synchronized (this) {
            sPDControlPolicy = this.mSPDControlPolicy;
            if (sPDControlPolicy == null) {
                try {
                    com.sec.enterprise.spd.SPDControlPolicy sPDControlPolicy3 = mEdm.getSPDControlPolicy();
                    if (sPDControlPolicy3 != null) {
                        sPDControlPolicy = new SPDControlPolicy(sPDControlPolicy3);
                        this.mSPDControlPolicy = sPDControlPolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(EnterpriseDeviceManager.class, "getSPDControlPolicy", null, 19));
                }
            }
        }
        return sPDControlPolicy;
    }

    public VpnPolicy getVpnPolicy() {
        VpnPolicy vpnPolicy;
        android.app.enterprise.VpnPolicy vpnPolicy2;
        VpnPolicy vpnPolicy3 = this.mVpnPolicy;
        if (vpnPolicy3 != null) {
            return vpnPolicy3;
        }
        synchronized (this) {
            try {
                vpnPolicy = this.mVpnPolicy;
                if (vpnPolicy == null && (vpnPolicy2 = mEdm.getVpnPolicy()) != null) {
                    vpnPolicy = new VpnPolicy(vpnPolicy2);
                    this.mVpnPolicy = vpnPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vpnPolicy;
    }

    public WifiPolicy getWifiPolicy() {
        WifiPolicy wifiPolicy;
        android.app.enterprise.WifiPolicy wifiPolicy2;
        WifiPolicy wifiPolicy3 = this.mWifiPolicy;
        if (wifiPolicy3 != null) {
            return wifiPolicy3;
        }
        synchronized (this) {
            try {
                wifiPolicy = this.mWifiPolicy;
                if (wifiPolicy == null && (wifiPolicy2 = mEdm.getWifiPolicy()) != null) {
                    wifiPolicy = new WifiPolicy(wifiPolicy2);
                    this.mWifiPolicy = wifiPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wifiPolicy;
    }

    public boolean isAdminActive(ComponentName componentName) {
        return mEdm.isAdminActive(componentName);
    }

    public boolean setAdminRemovable(boolean z, String str) {
        return mEdm.setAdminRemovable(z, str);
    }

    public boolean getAdminRemovable() {
        return mEdm.getAdminRemovable();
    }

    public boolean setAdminRemovable(boolean z) {
        return mEdm.setAdminRemovable(z);
    }
}
