package com.samsung.android.knox.restriction;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SPDControlPolicy {
    private com.sec.enterprise.spd.SPDControlPolicy mSpdControlPolicy;

    public SPDControlPolicy(com.sec.enterprise.spd.SPDControlPolicy sPDControlPolicy) {
        this.mSpdControlPolicy = sPDControlPolicy;
    }

    public int getAutoSecurityPolicyUpdateMode() {
        try {
            return this.mSpdControlPolicy.getAutoSecurityPolicyUpdateMode();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SPDControlPolicy.class, "getAutoSecurityPolicyUpdateMode", null, 19));
            return 0;
        }
    }

    public boolean setAutoSecurityPolicyUpdateMode(int i) {
        try {
            return this.mSpdControlPolicy.setAutoSecurityPolicyUpdateMode(i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SPDControlPolicy.class, "setAutoSecurityPolicyUpdateMode", new Class[]{Integer.TYPE}, 19));
            return false;
        }
    }
}
