package com.samsung.android.knox.container;

import android.app.enterprise.FirewallPolicy;
import android.app.enterprise.MiscPolicy;
import android.app.enterprise.SecurityPolicy;
import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.dlp.DLPManagerPolicy;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import defpackage.id;
import defpackage.nh0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KnoxContainerManager {
    public static final String ACTION_CONTAINER_ADMIN_LOCK = "com.samsung.android.knox.intent.action.CONTAINER_ADMIN_LOCK";
    public static final String ACTION_CONTAINER_CREATION_STATUS = "com.samsung.android.knox.intent.action.CONTAINER_CREATION_STATUS";
    public static final String ACTION_CONTAINER_REMOVED = "com.samsung.android.knox.intent.action.CONTAINER_REMOVED";
    public static final String ACTION_CONTAINER_STATE_CHANGED = "com.samsung.android.knox.intent.action.CONTAINER_STATE_CHANGED";
    public static final String CONTAINER_CREATION_REQUEST_ID = "requestId";
    public static final String CONTAINER_CREATION_STATUS_CODE = "code";
    public static final String CONTAINER_ID = "containerid";
    public static final String CONTAINER_NEW_STATE = "container_new_state";
    public static final String CONTAINER_OLD_STATE = "container_old_state";
    public static final int ERROR_INTERNAL_ERROR = -1014;
    public static final String INTENT_BUNDLE = "intent";
    private static final String TAG = "KnoxContainerManager-SupportLib";
    private volatile AdvancedRestrictionPolicy mAdvancedRestrictionPolicy;
    private volatile ApplicationPolicy mApplicationPolicy;
    private volatile AuditLog mAuditLogPolicy;
    private volatile BasePasswordPolicy mBasePasswordPolicy;
    private volatile BootBanner mBootBanner;
    private volatile BrowserPolicy mBrowserPolicy;
    private volatile CertificatePolicy mCertificatePolicy;
    private volatile CertificateProvisioning mCertificateProvisioning;
    private volatile ClientCertificateManager mClientCertificateManager;
    private volatile ContainerConfigurationPolicy mContainerConfigurationPolicy;
    private Context mContext;
    private volatile DLPManagerPolicy mDLPManagerPolicy;
    private volatile DateTimePolicy mDateTimePolicy;
    private volatile DeviceAccountPolicy mDeviceAccountPolicy;
    private volatile ExchangeAccountPolicy mEasAccountPolicy;
    private volatile EmailAccountPolicy mEmailAccountPolicy;
    private volatile EmailPolicy mEmailPolicy;
    private volatile EnterpriseBillingPolicy mEnterpriseBillingPolicy;
    private volatile EnterpriseCertEnrollPolicy mEnterpriseCertEnrollPolicy;
    private volatile Firewall mFirewall;
    private volatile Geofencing mGeofencing;
    private volatile KioskMode mKioskMode;
    private com.sec.enterprise.knox.container.KnoxContainerManager mKnoxContainerManager;
    private volatile LDAPAccountPolicy mLDAPAccountPolicy;
    private volatile LocationPolicy mLocationPolicy;
    private volatile PasswordPolicy mPasswordPolicy;
    private volatile RCPPolicy mRCPPolicy = null;
    private volatile RestrictionPolicy mRestrictionPolicy;
    private volatile WifiPolicy mWifiPolicy;

    public KnoxContainerManager(Context context, com.sec.enterprise.knox.container.KnoxContainerManager knoxContainerManager) {
        this.mContext = context;
        this.mKnoxContainerManager = knoxContainerManager;
    }

    public static boolean addConfigurationType(Context context, KnoxConfigurationType knoxConfigurationType) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.addConfigurationType(context, KnoxConfigurationType.convertToOld(knoxConfigurationType));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return false;
        }
    }

    public static int createContainer(CreationParams creationParams) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(CreationParams.convertToOld(creationParams));
        } catch (NoClassDefFoundError e) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                return ERROR_INTERNAL_ERROR;
            }
            id.g(e.getMessage());
            return 0;
        }
    }

    public static void doSelfUninstall() {
        try {
            com.sec.enterprise.knox.container.KnoxContainerManager.doSelfUninstall();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
        }
    }

    public static KnoxConfigurationType getConfigurationType(int i) {
        try {
            return KnoxConfigurationType.convertToNew(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationType(i));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static KnoxConfigurationType getConfigurationTypeByName(String str) {
        try {
            return KnoxConfigurationType.convertToNew(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationTypeByName(str));
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static List<KnoxConfigurationType> getConfigurationTypes() {
        try {
            return KnoxConfigurationType.convertToNewList(com.sec.enterprise.knox.container.KnoxContainerManager.getConfigurationTypes());
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static List<Integer> getContainers() {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.getContainers();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
        }
    }

    public static boolean removeConfigurationType(String str) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.removeConfigurationType(str);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return false;
        } catch (NoSuchMethodError unused2) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "removeConfigurationType", new Class[]{String.class}, 13));
            return false;
        }
    }

    public static int removeContainer(int i) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.removeContainer(i);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }

    public AdvancedRestrictionPolicy getAdvancedRestrictionPolicy() {
        AdvancedRestrictionPolicy advancedRestrictionPolicy;
        com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy2;
        AdvancedRestrictionPolicy advancedRestrictionPolicy3 = this.mAdvancedRestrictionPolicy;
        if (advancedRestrictionPolicy3 != null) {
            return advancedRestrictionPolicy3;
        }
        synchronized (this) {
            try {
                advancedRestrictionPolicy = this.mAdvancedRestrictionPolicy;
                if (advancedRestrictionPolicy == null && (advancedRestrictionPolicy2 = this.mKnoxContainerManager.getAdvancedRestrictionPolicy()) != null) {
                    advancedRestrictionPolicy = new AdvancedRestrictionPolicy(advancedRestrictionPolicy2);
                    this.mAdvancedRestrictionPolicy = advancedRestrictionPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return advancedRestrictionPolicy;
    }

    public ApplicationPolicy getApplicationPolicy() {
        ApplicationPolicy applicationPolicy;
        ApplicationPolicy applicationPolicy2 = this.mApplicationPolicy;
        if (applicationPolicy2 != null) {
            return applicationPolicy2;
        }
        synchronized (this) {
            try {
                applicationPolicy = this.mApplicationPolicy;
                if (applicationPolicy == null) {
                    android.app.enterprise.ApplicationPolicy applicationPolicy3 = this.mKnoxContainerManager.getApplicationPolicy();
                    com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy = this.mKnoxContainerManager.getAdvancedRestrictionPolicy();
                    if (applicationPolicy3 != null && advancedRestrictionPolicy != null) {
                        applicationPolicy = new ApplicationPolicy(applicationPolicy3, advancedRestrictionPolicy);
                        this.mApplicationPolicy = applicationPolicy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return applicationPolicy;
    }

    public AuditLog getAuditLogPolicy() {
        if (this.mAuditLogPolicy == null) {
            synchronized (this) {
                if (this.mAuditLogPolicy == null) {
                    try {
                        com.sec.enterprise.knox.auditlog.AuditLog auditLogPolicy = this.mKnoxContainerManager.getAuditLogPolicy();
                        if (auditLogPolicy != null) {
                            this.mAuditLogPolicy = new AuditLog(auditLogPolicy);
                        }
                    } catch (NoSuchMethodError unused) {
                        throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getAuditLogPolicy", null, 19));
                    }
                }
            }
        }
        return this.mAuditLogPolicy;
    }

    public BasePasswordPolicy getBasePasswordPolicy() {
        BasePasswordPolicy basePasswordPolicy;
        android.app.enterprise.BasePasswordPolicy basePasswordPolicy2;
        BasePasswordPolicy basePasswordPolicy3 = this.mBasePasswordPolicy;
        if (basePasswordPolicy3 != null) {
            return basePasswordPolicy3;
        }
        synchronized (this) {
            try {
                basePasswordPolicy = this.mBasePasswordPolicy;
                if (basePasswordPolicy == null && (basePasswordPolicy2 = this.mKnoxContainerManager.getBasePasswordPolicy()) != null) {
                    basePasswordPolicy = new BasePasswordPolicy(basePasswordPolicy2);
                    this.mBasePasswordPolicy = basePasswordPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return basePasswordPolicy;
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
                if (bootBanner == null && (securityPolicy = this.mKnoxContainerManager.getSecurityPolicy()) != null) {
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
                    android.app.enterprise.BrowserPolicy browserPolicy3 = this.mKnoxContainerManager.getBrowserPolicy();
                    MiscPolicy miscPolicy = this.mKnoxContainerManager.getMiscPolicy();
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

    public CertificatePolicy getCertificatePolicy() {
        CertificatePolicy certificatePolicy;
        CertificatePolicy certificatePolicy2 = this.mCertificatePolicy;
        if (certificatePolicy2 != null) {
            return certificatePolicy2;
        }
        synchronized (this) {
            certificatePolicy = this.mCertificatePolicy;
            if (certificatePolicy == null) {
                try {
                    com.sec.enterprise.knox.certificate.CertificatePolicy certificatePolicy3 = this.mKnoxContainerManager.getCertificatePolicy();
                    if (certificatePolicy3 != null) {
                        certificatePolicy = new CertificatePolicy(certificatePolicy3);
                        this.mCertificatePolicy = certificatePolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getCertificatePolicy", null, 12));
                }
            }
        }
        return certificatePolicy;
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
                if (certificateProvisioning == null && (securityPolicy = this.mKnoxContainerManager.getSecurityPolicy()) != null) {
                    certificateProvisioning = new CertificateProvisioning(securityPolicy);
                    this.mCertificateProvisioning = certificateProvisioning;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return certificateProvisioning;
    }

    public ClientCertificateManager getClientCertificateManagerPolicy() {
        ClientCertificateManager clientCertificateManager;
        ClientCertificateManager clientCertificateManager2 = this.mClientCertificateManager;
        if (clientCertificateManager2 != null) {
            return clientCertificateManager2;
        }
        synchronized (this) {
            clientCertificateManager = this.mClientCertificateManager;
            if (clientCertificateManager == null) {
                try {
                    com.sec.enterprise.knox.ccm.ClientCertificateManager clientCertificateManagerPolicy = this.mKnoxContainerManager.getClientCertificateManagerPolicy();
                    if (clientCertificateManagerPolicy != null) {
                        clientCertificateManager = new ClientCertificateManager(clientCertificateManagerPolicy);
                        this.mClientCertificateManager = clientCertificateManager;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getClientCertificateManagerPolicy", null, 12));
                }
            }
        }
        return clientCertificateManager;
    }

    public ContainerConfigurationPolicy getContainerConfigurationPolicy() {
        ContainerConfigurationPolicy containerConfigurationPolicy;
        com.sec.enterprise.knox.container.ContainerConfigurationPolicy containerConfigurationPolicy2;
        ContainerConfigurationPolicy containerConfigurationPolicy3 = this.mContainerConfigurationPolicy;
        if (containerConfigurationPolicy3 != null) {
            return containerConfigurationPolicy3;
        }
        synchronized (this) {
            try {
                containerConfigurationPolicy = this.mContainerConfigurationPolicy;
                if (containerConfigurationPolicy == null && (containerConfigurationPolicy2 = this.mKnoxContainerManager.getContainerConfigurationPolicy()) != null) {
                    containerConfigurationPolicy = new ContainerConfigurationPolicy(containerConfigurationPolicy2);
                    this.mContainerConfigurationPolicy = containerConfigurationPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containerConfigurationPolicy;
    }

    public DLPManagerPolicy getDLPManagerPolicy() {
        DLPManagerPolicy dLPManagerPolicy;
        DLPManagerPolicy dLPManagerPolicy2 = this.mDLPManagerPolicy;
        if (dLPManagerPolicy2 != null) {
            return dLPManagerPolicy2;
        }
        synchronized (this) {
            dLPManagerPolicy = this.mDLPManagerPolicy;
            if (dLPManagerPolicy == null) {
                try {
                    com.sec.enterprise.knox.dlp.DLPManagerPolicy dLPManagerPolicy3 = this.mKnoxContainerManager.getDLPManagerPolicy();
                    if (dLPManagerPolicy3 != null) {
                        dLPManagerPolicy = new DLPManagerPolicy(dLPManagerPolicy3);
                        this.mDLPManagerPolicy = dLPManagerPolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getDLPManagerPolicy", null, 19));
                }
            }
        }
        return dLPManagerPolicy;
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
                if (dateTimePolicy == null && (dateTimePolicy2 = this.mKnoxContainerManager.getDateTimePolicy()) != null) {
                    dateTimePolicy = new DateTimePolicy(this.mContext, dateTimePolicy2);
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
                    android.app.enterprise.DeviceAccountPolicy deviceAccountPolicy3 = this.mKnoxContainerManager.getDeviceAccountPolicy();
                    SecurityPolicy securityPolicy = this.mKnoxContainerManager.getSecurityPolicy();
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
                if (emailAccountPolicy == null && (emailAccountPolicy2 = this.mKnoxContainerManager.getEmailAccountPolicy()) != null) {
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
                if (emailPolicy == null && (emailPolicy2 = this.mKnoxContainerManager.getEmailPolicy()) != null) {
                    emailPolicy = new EmailPolicy(emailPolicy2);
                    this.mEmailPolicy = emailPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emailPolicy;
    }

    public EnterpriseBillingPolicy getEnterpriseBillingPolicy() {
        EnterpriseBillingPolicy enterpriseBillingPolicy;
        EnterpriseBillingPolicy enterpriseBillingPolicy2 = this.mEnterpriseBillingPolicy;
        if (enterpriseBillingPolicy2 != null) {
            return enterpriseBillingPolicy2;
        }
        synchronized (this) {
            enterpriseBillingPolicy = this.mEnterpriseBillingPolicy;
            if (enterpriseBillingPolicy == null) {
                try {
                    com.sec.enterprise.knox.billing.EnterpriseBillingPolicy enterpriseBillingPolicy3 = this.mKnoxContainerManager.getEnterpriseBillingPolicy();
                    if (enterpriseBillingPolicy3 != null) {
                        enterpriseBillingPolicy = new EnterpriseBillingPolicy(enterpriseBillingPolicy3);
                        this.mEnterpriseBillingPolicy = enterpriseBillingPolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getEnterpriseBillingPolicy", null, 13));
                }
            }
        }
        return enterpriseBillingPolicy;
    }

    public EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(String str) {
        EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy;
        EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy2 = this.mEnterpriseCertEnrollPolicy;
        if (enterpriseCertEnrollPolicy2 != null) {
            return enterpriseCertEnrollPolicy2;
        }
        synchronized (this) {
            enterpriseCertEnrollPolicy = this.mEnterpriseCertEnrollPolicy;
            if (enterpriseCertEnrollPolicy == null) {
                try {
                    com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy3 = this.mKnoxContainerManager.getEnterpriseCertEnrollPolicy(str);
                    if (enterpriseCertEnrollPolicy3 != null) {
                        enterpriseCertEnrollPolicy = new EnterpriseCertEnrollPolicy(enterpriseCertEnrollPolicy3);
                        this.mEnterpriseCertEnrollPolicy = enterpriseCertEnrollPolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getEnterpriseCertEnrollPolicy", null, 12));
                }
            }
        }
        return enterpriseCertEnrollPolicy;
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        ExchangeAccountPolicy exchangeAccountPolicy;
        android.app.enterprise.ExchangeAccountPolicy exchangeAccountPolicy2;
        ExchangeAccountPolicy exchangeAccountPolicy3 = this.mEasAccountPolicy;
        if (exchangeAccountPolicy3 != null) {
            return exchangeAccountPolicy3;
        }
        synchronized (this) {
            try {
                exchangeAccountPolicy = this.mEasAccountPolicy;
                if (exchangeAccountPolicy == null && (exchangeAccountPolicy2 = this.mKnoxContainerManager.getExchangeAccountPolicy()) != null) {
                    exchangeAccountPolicy = new ExchangeAccountPolicy(exchangeAccountPolicy2);
                    this.mEasAccountPolicy = exchangeAccountPolicy;
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
            firewall = this.mFirewall;
            if (firewall == null) {
                try {
                    com.sec.enterprise.firewall.Firewall firewall3 = this.mKnoxContainerManager.getFirewall();
                    if (firewall3 != null) {
                        Firewall firewall4 = new Firewall(firewall3);
                        try {
                            this.mFirewall = firewall4;
                            firewall = firewall4;
                        } catch (NoSuchMethodError unused) {
                            firewall = firewall4;
                            FirewallPolicy firewallPolicy = this.mKnoxContainerManager.getFirewallPolicy();
                            if (firewallPolicy != null) {
                                firewall = new Firewall(firewallPolicy);
                                this.mFirewall = firewall;
                            }
                        }
                    }
                } catch (NoSuchMethodError unused2) {
                }
            }
        }
        return firewall;
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
                if (geofencing == null && (geofencing2 = this.mKnoxContainerManager.getGeofencing()) != null) {
                    geofencing = new Geofencing(geofencing2);
                    this.mGeofencing = geofencing;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return geofencing;
    }

    public KioskMode getKioskMode() {
        KioskMode kioskMode;
        KioskMode kioskMode2 = this.mKioskMode;
        if (kioskMode2 != null) {
            return kioskMode2;
        }
        synchronized (this) {
            kioskMode = this.mKioskMode;
            if (kioskMode == null) {
                try {
                    android.app.enterprise.kioskmode.KioskMode kioskMode3 = this.mKnoxContainerManager.getKioskMode();
                    if (kioskMode3 != null) {
                        kioskMode = new KioskMode(kioskMode3);
                        this.mKioskMode = kioskMode;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(KnoxContainerManager.class, "getKioskMode", null, 12));
                }
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
                if (lDAPAccountPolicy == null && (lDAPAccountPolicy2 = this.mKnoxContainerManager.getLDAPAccountPolicy()) != null) {
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
                if (locationPolicy == null && (locationPolicy2 = this.mKnoxContainerManager.getLocationPolicy()) != null) {
                    locationPolicy = new LocationPolicy(locationPolicy2);
                    this.mLocationPolicy = locationPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationPolicy;
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
                if (passwordPolicy == null && (passwordPolicy2 = this.mKnoxContainerManager.getPasswordPolicy()) != null) {
                    passwordPolicy = new PasswordPolicy(passwordPolicy2);
                    this.mPasswordPolicy = passwordPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return passwordPolicy;
    }

    public RCPPolicy getRCPPolicy() {
        RCPPolicy rCPPolicy;
        com.sec.enterprise.knox.container.RCPPolicy rCPPolicy2;
        RCPPolicy rCPPolicy3 = this.mRCPPolicy;
        if (rCPPolicy3 != null) {
            return rCPPolicy3;
        }
        synchronized (this) {
            try {
                rCPPolicy = this.mRCPPolicy;
                if (rCPPolicy == null && (rCPPolicy2 = this.mKnoxContainerManager.getRCPPolicy()) != null) {
                    rCPPolicy = new RCPPolicy(rCPPolicy2);
                    this.mRCPPolicy = rCPPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rCPPolicy;
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
                if (restrictionPolicy == null && (restrictionPolicy2 = this.mKnoxContainerManager.getRestrictionPolicy()) != null) {
                    restrictionPolicy = new RestrictionPolicy(restrictionPolicy2);
                    this.mRestrictionPolicy = restrictionPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return restrictionPolicy;
    }

    public int getStatus() {
        return this.mKnoxContainerManager.getStatus();
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
                if (wifiPolicy == null && (wifiPolicy2 = this.mKnoxContainerManager.getWifiPolicy()) != null) {
                    wifiPolicy = new WifiPolicy(wifiPolicy2);
                    this.mWifiPolicy = wifiPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wifiPolicy;
    }

    public boolean lock() {
        return this.mKnoxContainerManager.lock();
    }

    public boolean unlock() {
        return this.mKnoxContainerManager.unlock();
    }

    public static int createContainer(String str, String str2) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(str, str2);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }

    public static int createContainer(String str) {
        try {
            return com.sec.enterprise.knox.container.KnoxContainerManager.createContainer(str);
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return ERROR_INTERNAL_ERROR;
        }
    }
}
