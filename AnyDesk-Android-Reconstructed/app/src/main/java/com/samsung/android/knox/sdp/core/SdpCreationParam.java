package com.samsung.android.knox.sdp.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SdpCreationParam implements Parcelable {
    public static final Parcelable.Creator<SdpCreationParam> CREATOR = new Parcelable.Creator<SdpCreationParam>() { // from class: com.samsung.android.knox.sdp.core.SdpCreationParam.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdpCreationParam createFromParcel(Parcel parcel) {
            return new SdpCreationParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdpCreationParam[] newArray(int i) {
            return new SdpCreationParam[i];
        }
    };
    private String mAlias;
    private int mFlags;
    private ArrayList<SdpDomain> mPrivilegedApps;

    private SdpCreationParam(Parcel parcel) {
        this.mFlags = 0;
        this.mAlias = parcel.readString();
        this.mFlags = parcel.readInt();
        this.mPrivilegedApps = (ArrayList) parcel.readSerializable();
    }

    public static SdpCreationParam convertToNew(com.sec.enterprise.knox.sdp.engine.SdpCreationParam sdpCreationParam) {
        if (sdpCreationParam == null) {
            return null;
        }
        return new SdpCreationParam(sdpCreationParam.getAlias(), sdpCreationParam.getFlags(), SdpDomain.convertToNewList(sdpCreationParam.getPrivilegedApps()));
    }

    public static com.sec.enterprise.knox.sdp.engine.SdpCreationParam convertToOld(SdpCreationParam sdpCreationParam) {
        if (sdpCreationParam == null) {
            return null;
        }
        try {
            return new com.sec.enterprise.knox.sdp.engine.SdpCreationParam(sdpCreationParam.getAlias(), sdpCreationParam.getFlags(), SdpDomain.convertToOldList(sdpCreationParam.getPrivilegedApps()));
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(SdpCreationParam.class, 19));
            return null;
        }
    }

    private int validateFlags(int i) {
        if (i < 0 || i > 1) {
            return 0;
        }
        return i;
    }

    private ArrayList<SdpDomain> validatePrivilegedApps(ArrayList<SdpDomain> arrayList) {
        ArrayList<SdpDomain> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                SdpDomain sdpDomain = arrayList.get(i);
                i++;
                SdpDomain sdpDomain2 = sdpDomain;
                if (sdpDomain2.getPackageName() != null && !sdpDomain2.getPackageName().trim().isEmpty()) {
                    arrayList2.add(sdpDomain2);
                }
            }
        }
        return arrayList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public ArrayList<SdpDomain> getPrivilegedApps() {
        return this.mPrivilegedApps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nSdpCreationParam { \n");
        sb.append("alias:" + this.mAlias);
        sb.append("\n");
        ArrayList<SdpDomain> arrayList = this.mPrivilegedApps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            SdpDomain sdpDomain = arrayList.get(i);
            i++;
            sb.append(sdpDomain.toString());
            sb.append("\n");
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAlias);
        parcel.writeInt(this.mFlags);
        parcel.writeSerializable(this.mPrivilegedApps);
    }

    public SdpCreationParam(String str, int i, ArrayList<SdpDomain> arrayList) {
        this.mFlags = 0;
        this.mAlias = str == null ? "" : str;
        this.mFlags = validateFlags(i);
        this.mPrivilegedApps = validatePrivilegedApps(arrayList);
    }
}
