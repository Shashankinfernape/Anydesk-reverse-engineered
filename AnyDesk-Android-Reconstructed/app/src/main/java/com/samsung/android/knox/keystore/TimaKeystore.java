package com.samsung.android.knox.keystore;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class TimaKeystore {
    private com.sec.enterprise.knox.keystore.TimaKeystore mTimaKeystore;

    public TimaKeystore(com.sec.enterprise.knox.keystore.TimaKeystore timaKeystore) {
        this.mTimaKeystore = timaKeystore;
    }

    public boolean enableTimaKeystore(boolean z) {
        return this.mTimaKeystore.enableTimaKeystore(z);
    }

    public boolean enableTimaKeystorePerApp(boolean z) {
        try {
            return this.mTimaKeystore.enableTimaKeystorePerApp(z);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(TimaKeystore.class, "enableTimaKeystorePerApp", new Class[]{Boolean.TYPE}, 20));
            return false;
        }
    }

    public boolean isTimaKeystoreEnabled() {
        return this.mTimaKeystore.isTimaKeystoreEnabled();
    }
}
