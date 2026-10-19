package com.samsung.android.knox.keystore;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseCertEnrollPolicy {
    private com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy mEnterpriseCertEnrollPolicy;

    public EnterpriseCertEnrollPolicy(com.sec.enterprise.knox.certenroll.EnterpriseCertEnrollPolicy enterpriseCertEnrollPolicy) {
        this.mEnterpriseCertEnrollPolicy = enterpriseCertEnrollPolicy;
    }

    public int deleteUserCertificate(String str) {
        try {
            return this.mEnterpriseCertEnrollPolicy.deleteUserCertificate(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(EnterpriseCertEnrollPolicy.class, "deleteUserCertificate", new Class[]{String.class}, 12));
            return 0;
        }
    }

    public String enrollUserCertificate(EnrollmentProfile enrollmentProfile, List<String> list, String str) {
        try {
            return this.mEnterpriseCertEnrollPolicy.enrollUserCertificate(EnrollmentProfile.convertToOld(enrollmentProfile), list, str);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        } catch (NoSuchFieldError e2) {
            id.t(e2.getMessage());
            return null;
        }
    }

    public int getCertEnrollmentStatus(String str) {
        try {
            return this.mEnterpriseCertEnrollPolicy.getCertEnrollmentStatus(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(EnterpriseCertEnrollPolicy.class, "getCertEnrollmentStatus", new Class[]{String.class}, 12));
            return 0;
        }
    }

    public String renewUserCertificate(String str, List<String> list) {
        try {
            return this.mEnterpriseCertEnrollPolicy.renewUserCertificate(str, list);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(EnterpriseCertEnrollPolicy.class, "renewUserCertificate", new Class[]{String.class, List.class}, 12));
            return null;
        }
    }
}
