package com.samsung.android.knox.sdp.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class SdpEngineInfo implements Parcelable {
    public static final Parcelable.Creator<SdpEngineInfo> CREATOR = new Parcelable.Creator<SdpEngineInfo>() { // from class: com.samsung.android.knox.sdp.core.SdpEngineInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdpEngineInfo createFromParcel(Parcel parcel) {
            return new SdpEngineInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdpEngineInfo[] newArray(int i) {
            return new SdpEngineInfo[i];
        }
    };
    private String mAlias;
    private int mFlags;
    private int mId;
    private int mState;
    private int mType;
    private int mUserId;

    private SdpEngineInfo(Parcel parcel) {
        this.mAlias = parcel.readString();
        this.mId = parcel.readInt();
        this.mUserId = parcel.readInt();
        this.mState = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mType = parcel.readInt();
    }

    public static SdpEngineInfo convertToNew(com.sec.enterprise.knox.sdp.engine.SdpEngineInfo sdpEngineInfo) {
        if (sdpEngineInfo == null) {
            return null;
        }
        SdpEngineInfo sdpEngineInfo2 = new SdpEngineInfo();
        sdpEngineInfo2.setFlag(sdpEngineInfo.getFlag());
        sdpEngineInfo2.setState(sdpEngineInfo.getState());
        sdpEngineInfo2.mAlias = sdpEngineInfo.getAlias();
        sdpEngineInfo2.mId = sdpEngineInfo.getId();
        sdpEngineInfo2.mUserId = sdpEngineInfo.getUserId();
        if (sdpEngineInfo.isAndroidDefaultEngine()) {
            sdpEngineInfo2.mType = 1;
            return sdpEngineInfo2;
        }
        if (sdpEngineInfo.isCustomEngine()) {
            sdpEngineInfo2.mType = 2;
            return sdpEngineInfo2;
        }
        sdpEngineInfo2.mType = -1;
        return sdpEngineInfo2;
    }

    private void setFlag(int i) {
        this.mFlags = i;
    }

    private void setState(int i) {
        this.mState = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.mAlias;
    }

    public int getFlag() {
        return this.mFlags;
    }

    public int getId() {
        return this.mId;
    }

    public int getState() {
        return this.mState;
    }

    public int getUserId() {
        return this.mUserId;
    }

    public boolean isAndroidDefaultEngine() {
        return this.mType == 1;
    }

    public boolean isCustomEngine() {
        return this.mType == 2;
    }

    public boolean isMdfpp() {
        return !isMinor();
    }

    public boolean isMinor() {
        return (this.mFlags & 1) == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAlias);
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mUserId);
        parcel.writeInt(this.mState);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mType);
    }

    public SdpEngineInfo() {
        this.mAlias = null;
        this.mId = -1;
        this.mUserId = -1;
        this.mState = -1;
        this.mFlags = -1;
        this.mType = -1;
    }
}
