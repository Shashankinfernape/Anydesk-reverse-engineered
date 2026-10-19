package com.samsung.android.knox;

import android.content.Context;
import android.util.Log;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.keystore.TimaKeystore;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.vpn.GenericVpnPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseKnoxManager {
    private static final String TAG = "EnterpriseKnoxManager-SupportLib";
    private static Context mContext;
    private static com.sec.enterprise.knox.EnterpriseKnoxManager mEkm;
    private static EnterpriseKnoxManager mInstance;
    private volatile AdvancedRestrictionPolicy mAdvancedRestrictionPolicy;
    private volatile AuditLog mAuditLogPolicy;
    private volatile CertificatePolicy mCertificatePolicy;
    private volatile ClientCertificateManager mClientCertificateManagerPolicy;
    private volatile EnterpriseBillingPolicy mEnterpriseBillingPolicy;
    private volatile TimaKeystore mTimaKeystorePolicy;

    private EnterpriseKnoxManager(com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager) {
        mEkm = enterpriseKnoxManager;
    }

    public static EnterpriseKnoxManager getInstance(Context context) {
        EnterpriseKnoxManager enterpriseKnoxManager;
        com.sec.enterprise.knox.EnterpriseKnoxManager enterpriseKnoxManager2;
        if (context == null) {
            return null;
        }
        EnterpriseKnoxManager enterpriseKnoxManager3 = mInstance;
        if (enterpriseKnoxManager3 != null) {
            return enterpriseKnoxManager3;
        }
        try {
            synchronized (EnterpriseKnoxManager.class) {
                try {
                    enterpriseKnoxManager = mInstance;
                    if (enterpriseKnoxManager == null && (enterpriseKnoxManager2 = com.sec.enterprise.knox.EnterpriseKnoxManager.getInstance()) != null) {
                        enterpriseKnoxManager = new EnterpriseKnoxManager(enterpriseKnoxManager2);
                        mInstance = enterpriseKnoxManager;
                        mContext = context;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return enterpriseKnoxManager;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
            return null;
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
                if (advancedRestrictionPolicy == null && (advancedRestrictionPolicy2 = mEkm.getAdvancedRestrictionPolicy(mContext)) != null) {
                    advancedRestrictionPolicy = new AdvancedRestrictionPolicy(advancedRestrictionPolicy2);
                    this.mAdvancedRestrictionPolicy = advancedRestrictionPolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return advancedRestrictionPolicy;
    }

    public AuditLog getAuditLogPolicy() {
        AuditLog auditLog;
        com.sec.enterprise.knox.auditlog.AuditLog auditLog2;
        AuditLog auditLog3 = this.mAuditLogPolicy;
        if (auditLog3 != null) {
            return auditLog3;
        }
        synchronized (this) {
            try {
                auditLog = this.mAuditLogPolicy;
                if (auditLog == null && (auditLog2 = com.sec.enterprise.knox.auditlog.AuditLog.getInstance(mContext)) != null) {
                    auditLog = new AuditLog(auditLog2);
                    this.mAuditLogPolicy = auditLog;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return auditLog;
    }

    public CertificatePolicy getCertificatePolicy() {
        CertificatePolicy certificatePolicy;
        com.sec.enterprise.knox.certificate.CertificatePolicy certificatePolicy2;
        CertificatePolicy certificatePolicy3 = this.mCertificatePolicy;
        if (certificatePolicy3 != null) {
            return certificatePolicy3;
        }
        synchronized (this) {
            try {
                certificatePolicy = this.mCertificatePolicy;
                if (certificatePolicy == null && (certificatePolicy2 = com.sec.enterprise.knox.certificate.CertificatePolicy.getInstance(mContext)) != null) {
                    certificatePolicy = new CertificatePolicy(certificatePolicy2);
                    this.mCertificatePolicy = certificatePolicy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return certificatePolicy;
    }

    public ClientCertificateManager getClientCertificateManagerPolicy() {
        ClientCertificateManager clientCertificateManager;
        com.sec.enterprise.knox.ccm.ClientCertificateManager clientCertificateManagerPolicy;
        ClientCertificateManager clientCertificateManager2 = this.mClientCertificateManagerPolicy;
        if (clientCertificateManager2 != null) {
            return clientCertificateManager2;
        }
        synchronized (this) {
            try {
                clientCertificateManager = this.mClientCertificateManagerPolicy;
                if (clientCertificateManager == null && (clientCertificateManagerPolicy = mEkm.getClientCertificateManagerPolicy(mContext)) != null) {
                    clientCertificateManager = new ClientCertificateManager(clientCertificateManagerPolicy);
                    this.mClientCertificateManagerPolicy = clientCertificateManager;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return clientCertificateManager;
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
                    com.sec.enterprise.knox.billing.EnterpriseBillingPolicy enterpriseBillingPolicy3 = mEkm.getEnterpriseBillingPolicy();
                    if (enterpriseBillingPolicy3 != null) {
                        enterpriseBillingPolicy = new EnterpriseBillingPolicy(enterpriseBillingPolicy3);
                        this.mEnterpriseBillingPolicy = enterpriseBillingPolicy;
                    }
                } catch (NoSuchMethodError unused) {
                    throw new NoSuchMethodError(SupportLibUtils.buildMethodErrorMsg(EnterpriseKnoxManager.class, "getEnterpriseBillingPolicy", null, 13));
                }
            }
        }
        return enterpriseBillingPolicy;
    }

    public EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(String str) {
        com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy = mEkm.getEnterpriseCertEnrollPolicy(mContext, str);
        if (enterpriseCertEnrollPolicy != null) {
            return new EnterpriseCertEnrollPolicy(enterpriseCertEnrollPolicy);
        }
        return null;
    }

    public GenericVpnPolicy getGenericVpnPolicy(String str, int i) {
        com.sec.enterprise.knox.GenericVpnPolicy genericVpnPolicy = mEkm.getGenericVpnPolicy(str, i);
        if (genericVpnPolicy != null) {
            return new GenericVpnPolicy(genericVpnPolicy);
        }
        return null;
    }

    public synchronized KnoxContainerManager getKnoxContainerManager(int i) {
        com.sec.enterprise.knox.container.KnoxContainerManager knoxContainerManager;
        knoxContainerManager = mEkm.getKnoxContainerManager(mContext, i);
        return knoxContainerManager != null ? new KnoxContainerManager(mContext, knoxContainerManager) : null;
    }

    public TimaKeystore getTimaKeystorePolicy() {
        TimaKeystore timaKeystore;
        com.sec.enterprise.knox.keystore.TimaKeystore timaKeystorePolicy;
        TimaKeystore timaKeystore2 = this.mTimaKeystorePolicy;
        if (timaKeystore2 != null) {
            return timaKeystore2;
        }
        synchronized (this) {
            try {
                timaKeystore = this.mTimaKeystorePolicy;
                if (timaKeystore == null && (timaKeystorePolicy = mEkm.getTimaKeystorePolicy(mContext)) != null) {
                    timaKeystore = new TimaKeystore(timaKeystorePolicy);
                    this.mTimaKeystorePolicy = timaKeystore;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return timaKeystore;
    }
}
