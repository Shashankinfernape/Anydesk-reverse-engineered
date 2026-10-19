package com.samsung.android.knox.restriction;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class AdvancedRestrictionPolicy {
    private com.sec.enterprise.knox.AdvancedRestrictionPolicy mAdvancedRestrictionPolicy;

    public AdvancedRestrictionPolicy(com.sec.enterprise.knox.AdvancedRestrictionPolicy advancedRestrictionPolicy) {
        this.mAdvancedRestrictionPolicy = advancedRestrictionPolicy;
    }

    public boolean allowFirmwareAutoUpdate(boolean z) {
        return this.mAdvancedRestrictionPolicy.allowFirmwareAutoUpdate(z);
    }

    public boolean enableODETrustedBootVerification(boolean z) {
        return this.mAdvancedRestrictionPolicy.enableODETrustedBootVerification(z);
    }

    public int getCCModeState() {
        try {
            return this.mAdvancedRestrictionPolicy.getCCModeState();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(AdvancedRestrictionPolicy.class, "getCCModeState", null, 15));
            return 0;
        }
    }

    public boolean isFirmwareAutoUpdateAllowed(boolean z) {
        return this.mAdvancedRestrictionPolicy.isFirmwareAutoUpdateAllowed(z);
    }

    public boolean isODETrustedBootVerificationEnabled() {
        return this.mAdvancedRestrictionPolicy.isODETrustedBootVerificationEnabled();
    }

    public boolean setCCMode(boolean z) {
        return this.mAdvancedRestrictionPolicy.setCCMode(z);
    }
}
