package com.samsung.android.knox.sdp.core;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;

/* JADX INFO: loaded from: classes.dex */
public class SdpCreationParamBuilder {
    private com.sec.enterprise.knox.sdp.engine.SdpCreationParamBuilder mSdpCreationParamBuilder;

    public SdpCreationParamBuilder(String str, int i) {
        this.mSdpCreationParamBuilder = new com.sec.enterprise.knox.sdp.engine.SdpCreationParamBuilder(str, i);
    }

    public void addPrivilegedApp(SdpDomain sdpDomain) {
        try {
            this.mSdpCreationParamBuilder.addPrivilegedApp(SdpDomain.convertToOld(sdpDomain));
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
        }
    }

    public SdpCreationParam getParam() {
        try {
            return SdpCreationParam.convertToNew(this.mSdpCreationParamBuilder.getParam());
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpCreationParamBuilder.class, "getParam", null, 19));
            return null;
        }
    }

    public void setMdfpp() {
        try {
            this.mSdpCreationParamBuilder.setMdfpp();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpCreationParamBuilder.class, "setMdfpp", null, 19));
        }
    }

    public void setMinor() {
        try {
            this.mSdpCreationParamBuilder.setMinor();
        } catch (NoSuchMethodError unused) {
            nh0.q(SupportLibUtils.buildMethodErrorMsg(SdpCreationParamBuilder.class, "setMinor", null, 19));
        }
    }
}
