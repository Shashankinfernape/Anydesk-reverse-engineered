package com.samsung.android.knox.net.vpn.serviceprovider;

import android.content.Context;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class GenericVpnContext extends com.sec.vpn.knox.GenericVpnContext {
    public GenericVpnContext(Context context) {
        super(context);
    }

    public void enableMetaData(boolean z) {
        try {
            super.enableMetaData(z);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "enableMetaData", new Class[]{Boolean.TYPE}, 13));
        }
    }

    public String getVPNProfile() {
        try {
            return super.getVPNProfile();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "getVPNProfile", null, 13));
            return null;
        }
    }

    public boolean getVPNState() {
        try {
            return super.getVPNState();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "getVPNState", null, 13));
            return false;
        }
    }

    public boolean isMetaEnabled() {
        try {
            return super.isMetaEnabled();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "isMetaEnabled", null, 13));
            return false;
        }
    }

    public void setGenericVpnParams(String str, boolean z) {
        try {
            super.setGenericVpnParams(str, z);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GenericVpnContext.class, "setGenericVpnParams", new Class[]{String.class, Boolean.TYPE}, 13));
        }
    }
}
