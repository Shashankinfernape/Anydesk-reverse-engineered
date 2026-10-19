package com.samsung.android.knox.ucm.core;

import android.os.Bundle;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SecureChannelManager {
    private static final String TAG = "SecureChannelManager-SupportLib";
    private com.sec.enterprise.knox.ucm.core.SecureChannelManager mSecureChannelManager;

    private SecureChannelManager(com.sec.enterprise.knox.ucm.core.SecureChannelManager secureChannelManager) {
        this.mSecureChannelManager = secureChannelManager;
    }

    public static SecureChannelManager getInstance() {
        try {
            com.sec.enterprise.knox.ucm.core.SecureChannelManager secureChannelManager = com.sec.enterprise.knox.ucm.core.SecureChannelManager.getInstance();
            if (secureChannelManager == null) {
                return null;
            }
            return new SecureChannelManager(secureChannelManager);
        } catch (NoClassDefFoundError unused) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                return null;
            }
            id.g(SupportLibUtils.buildClassErrorMsg(SecureChannelManager.class, 20));
            return null;
        }
    }

    public ApduMessage createSecureChannel(int i, Bundle bundle) {
        try {
            return ApduMessage.convertToNew(this.mSecureChannelManager.createSecureChannel(i, bundle));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SecureChannelManager.class, "createSecureChannel", new Class[]{Integer.TYPE, Bundle.class}, 20));
            return null;
        }
    }

    public int destroySecureChannel() {
        try {
            return this.mSecureChannelManager.destroySecureChannel();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SecureChannelManager.class, "destroySecureChannel", null, 20));
            return 0;
        }
    }

    public ApduMessage processMessage(int i, byte[] bArr) {
        try {
            return ApduMessage.convertToNew(this.mSecureChannelManager.processMessage(i, bArr));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SecureChannelManager.class, "processMessage", new Class[]{Integer.TYPE, byte[].class}, 20));
            return null;
        }
    }
}
