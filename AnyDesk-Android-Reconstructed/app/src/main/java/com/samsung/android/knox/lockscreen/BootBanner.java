package com.samsung.android.knox.lockscreen;

import android.app.enterprise.SecurityPolicy;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class BootBanner {
    private SecurityPolicy mSecurityPolicy;

    public BootBanner(SecurityPolicy securityPolicy) {
        this.mSecurityPolicy = securityPolicy;
    }

    public boolean enableRebootBanner(boolean z, String str) {
        try {
            return this.mSecurityPolicy.enableRebootBanner(z, str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(BootBanner.class, "enableRebootBanner", new Class[]{Boolean.TYPE, String.class}, 13));
            return false;
        }
    }

    public boolean isRebootBannerEnabled() {
        return this.mSecurityPolicy.isRebootBannerEnabled();
    }

    public boolean enableRebootBanner(boolean z) {
        return this.mSecurityPolicy.enableRebootBanner(z);
    }
}
