package com.samsung.android.knox.sdp.core;

import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.q51;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SdpDomain implements Serializable {
    private final String mAlias;
    private final String mPackageName;

    public SdpDomain(String str, String str2) {
        this.mAlias = str == null ? "" : str;
        this.mPackageName = str2 == null ? "" : str2;
    }

    public static SdpDomain convertToNew(com.sec.enterprise.knox.sdp.engine.SdpDomain sdpDomain) {
        if (sdpDomain == null) {
            return null;
        }
        return new SdpDomain(sdpDomain.getAlias(), sdpDomain.getPackageName());
    }

    public static ArrayList<SdpDomain> convertToNewList(ArrayList<com.sec.enterprise.knox.sdp.engine.SdpDomain> arrayList) {
        ArrayList<SdpDomain> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            com.sec.enterprise.knox.sdp.engine.SdpDomain sdpDomain = arrayList.get(i);
            i++;
            arrayList2.add(convertToNew(sdpDomain));
        }
        return arrayList2;
    }

    public static com.sec.enterprise.knox.sdp.engine.SdpDomain convertToOld(SdpDomain sdpDomain) {
        if (sdpDomain == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.knox.sdp.engine.SdpDomain(sdpDomain.getAlias(), sdpDomain.getPackageName());
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(SdpDomain.class, 19));
            return null;
        }
    }

    public static ArrayList<com.sec.enterprise.knox.sdp.engine.SdpDomain> convertToOldList(ArrayList<SdpDomain> arrayList) {
        ArrayList<com.sec.enterprise.knox.sdp.engine.SdpDomain> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            SdpDomain sdpDomain = arrayList.get(i);
            i++;
            arrayList2.add(convertToOld(sdpDomain));
        }
        return arrayList2;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdpDomain { alias : ");
        sb.append(this.mAlias);
        sb.append(" / pkgName : ");
        return new String(q51.m(sb, this.mPackageName, " }"));
    }
}
