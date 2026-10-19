package com.samsung.android.knox.sdp;

import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.sdp.core.SdpEngineInfo;
import com.samsung.android.knox.sdp.core.SdpException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpInternalException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import defpackage.id;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SdpUtil {
    private static final String TAG = "SdpUtil-SupportLib";
    private static SdpUtil mInstance;
    private static com.sec.enterprise.knox.sdp.SdpUtil mSdpUtil;

    private SdpUtil(com.sec.enterprise.knox.sdp.SdpUtil sdpUtil) {
        mSdpUtil = sdpUtil;
    }

    public static SdpUtil getInstance() {
        if (mInstance == null) {
            try {
                com.sec.enterprise.knox.sdp.SdpUtil sdpUtil = com.sec.enterprise.knox.sdp.SdpUtil.getInstance();
                if (sdpUtil != null) {
                    mInstance = new SdpUtil(sdpUtil);
                }
            } catch (NoClassDefFoundError unused) {
                if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                    Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                    return null;
                }
                id.g(SupportLibUtils.buildClassErrorMsg(SdpUtil.class, 19));
                return null;
            }
        }
        return mInstance;
    }

    public static boolean isKnoxWorkspace(int i) {
        try {
            return com.sec.enterprise.knox.sdp.SdpUtil.isKnoxWorkspace(i);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "isKnoxWorkspace", new Class[]{Integer.TYPE}, 19));
            return false;
        }
    }

    public SdpEngineInfo getEngineInfo(String str) throws SdpException {
        try {
            return SdpEngineInfo.convertToNew(mSdpUtil.getEngineInfo(str));
        } catch (SdpInternalException unused) {
            nh0.d(-15);
            return null;
        } catch (SdpEngineNotExistsException unused2) {
            nh0.d(-5);
            return null;
        } catch (SdpLicenseRequiredException unused3) {
            nh0.d(-8);
            return null;
        } catch (NoSuchMethodError unused4) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "getEngineInfo", new Class[]{String.class}, 19));
            return null;
        }
    }

    public boolean isSdpSupported() {
        try {
            return mSdpUtil.isSdpSupported();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "isSdpSupported", null, 19));
            return false;
        }
    }

    public boolean registerListener(String str, SdpStateListener sdpStateListener) {
        try {
            return mSdpUtil.registerListener(str, new SdpStateListenerProxy(sdpStateListener));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "registerListener", new Class[]{String.class, SdpStateListener.class}, 19));
            return false;
        }
    }

    public boolean unregisterListener(String str, SdpStateListener sdpStateListener) {
        try {
            return mSdpUtil.unregisterListener(str, new SdpStateListenerProxy(sdpStateListener));
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpUtil.class, "unregisterListener", new Class[]{String.class, SdpStateListener.class}, 19));
            return false;
        }
    }
}
