package com.samsung.android.knox.net;

import android.app.enterprise.devicesettings.DeviceSettingsPolicy;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class GlobalProxy {
    private DeviceSettingsPolicy mDeviceSettingsPolicy;

    public GlobalProxy(DeviceSettingsPolicy deviceSettingsPolicy) {
        this.mDeviceSettingsPolicy = deviceSettingsPolicy;
    }

    public ProxyProperties getGlobalProxy() {
        try {
            return ProxyProperties.convertToNew(this.mDeviceSettingsPolicy.getGlobalProxy());
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(GlobalProxy.class, "getGlobalProxy", null, 17));
            return null;
        }
    }

    public int setGlobalProxy(ProxyProperties proxyProperties) {
        try {
            return this.mDeviceSettingsPolicy.setGlobalProxy(ProxyProperties.convertToOld(proxyProperties));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return 0;
        } catch (NoSuchMethodError e2) {
            nh0.q(e2.getMessage());
            return 0;
        }
    }
}
