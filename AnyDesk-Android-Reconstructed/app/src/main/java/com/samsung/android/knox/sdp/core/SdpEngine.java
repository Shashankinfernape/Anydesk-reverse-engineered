package com.samsung.android.knox.sdp.core;

import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.SupportLibUtils;
import com.sec.enterprise.knox.sdp.exception.SdpAccessDeniedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineLockedException;
import com.sec.enterprise.knox.sdp.exception.SdpEngineNotExistsException;
import com.sec.enterprise.knox.sdp.exception.SdpInternalException;
import com.sec.enterprise.knox.sdp.exception.SdpInvalidPasswordException;
import com.sec.enterprise.knox.sdp.exception.SdpInvalidResetTokenException;
import com.sec.enterprise.knox.sdp.exception.SdpLicenseRequiredException;
import com.sec.enterprise.knox.sdp.exception.SdpNotSupportedException;
import defpackage.id;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SdpEngine {
    private static final String TAG = "SdpEngine-SupportLib";
    private static SdpEngine mInstance;
    private static com.sec.enterprise.knox.sdp.engine.SdpEngine mSdpEngine;

    private SdpEngine(com.sec.enterprise.knox.sdp.engine.SdpEngine sdpEngine) {
        mSdpEngine = sdpEngine;
    }

    public static SdpEngine getInstance() throws SdpException {
        if (mInstance == null) {
            try {
                com.sec.enterprise.knox.sdp.engine.SdpEngine sdpEngine = com.sec.enterprise.knox.sdp.engine.SdpEngine.getInstance();
                if (sdpEngine != null) {
                    mInstance = new SdpEngine(sdpEngine);
                }
            } catch (NoClassDefFoundError unused) {
                if (EnterpriseDeviceManager.getAPILevel() <= -1) {
                    Log.w(TAG, "Calling method from a non-Knox device, exiting gracefully..");
                    return null;
                }
                id.g(SupportLibUtils.buildClassErrorMsg(SdpEngine.class, 19));
                return null;
            } catch (SdpLicenseRequiredException unused2) {
                nh0.d(-8);
                return null;
            }
        }
        return mInstance;
    }

    public void addEngine(SdpCreationParam sdpCreationParam, String str, String str2) throws SdpException {
        try {
            mSdpEngine.addEngine(SdpCreationParam.convertToOld(sdpCreationParam), str, str2);
        } catch (SdpInvalidResetTokenException unused) {
            nh0.d(-2);
        } catch (SdpEngineExistsException unused2) {
            nh0.d(-4);
        } catch (SdpAccessDeniedException unused3) {
            nh0.d(-7);
        } catch (SdpInternalException unused4) {
            nh0.d(-15);
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
        } catch (SdpNotSupportedException unused5) {
            nh0.d(-9);
        } catch (SdpInvalidPasswordException unused6) {
            nh0.d(-1);
        }
    }

    public boolean exists(String str) {
        try {
            return mSdpEngine.exists(str);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "exists", new Class[]{String.class}, 19));
            return false;
        }
    }

    public void lock(String str) throws SdpException {
        try {
            mSdpEngine.lock(str);
        } catch (SdpEngineNotExistsException unused) {
            nh0.d(-5);
        } catch (NoSuchMethodError unused2) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "lock", new Class[]{String.class}, 19));
        } catch (SdpAccessDeniedException unused3) {
            nh0.d(-7);
        } catch (SdpInternalException unused4) {
            nh0.d(-15);
        }
    }

    public void removeEngine(String str) throws SdpException {
        try {
            mSdpEngine.removeEngine(str);
        } catch (SdpEngineNotExistsException unused) {
            nh0.d(-5);
        } catch (NoSuchMethodError unused2) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "removeEngine", new Class[]{String.class}, 19));
        } catch (SdpAccessDeniedException unused3) {
            nh0.d(-7);
        } catch (SdpInternalException unused4) {
            nh0.d(-15);
        }
    }

    public void resetPassword(String str, String str2, String str3) throws SdpException {
        try {
            mSdpEngine.resetPassword(str, str2, str3);
        } catch (SdpAccessDeniedException unused) {
            nh0.d(-7);
        } catch (SdpInternalException unused2) {
            nh0.d(-15);
        } catch (SdpInvalidPasswordException unused3) {
            nh0.d(-1);
        } catch (SdpEngineNotExistsException unused4) {
            nh0.d(-5);
        } catch (SdpInvalidResetTokenException unused5) {
            nh0.d(-2);
        } catch (NoSuchMethodError unused6) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "resetPassword", new Class[]{String.class, String.class, String.class}, 19));
        }
    }

    public void setPassword(String str, String str2) throws SdpException {
        try {
            mSdpEngine.setPassword(str, str2);
        } catch (SdpEngineNotExistsException unused) {
            nh0.d(-5);
        } catch (SdpAccessDeniedException unused2) {
            nh0.d(-7);
        } catch (NoSuchMethodError unused3) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "setPassword", new Class[]{String.class, String.class}, 19));
        } catch (SdpInternalException unused4) {
            nh0.d(-15);
        } catch (SdpInvalidPasswordException unused5) {
            nh0.d(-1);
        } catch (SdpEngineLockedException unused6) {
            nh0.d(-6);
        }
    }

    public void unlock(String str, String str2) throws SdpException {
        try {
            mSdpEngine.unlock(str, str2);
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpEngine.class, "unlock", new Class[]{String.class, String.class}, 19));
        } catch (SdpInternalException unused2) {
            nh0.d(-15);
        } catch (SdpEngineNotExistsException unused3) {
            nh0.d(-5);
        } catch (SdpInvalidPasswordException unused4) {
            nh0.d(-1);
        } catch (SdpAccessDeniedException unused5) {
            nh0.d(-7);
        }
    }
}
