package com.samsung.android.knox.ucm.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ApduMessage implements Parcelable {
    public static final Parcelable.Creator<ApduMessage> CREATOR = new Parcelable.Creator<ApduMessage>() { // from class: com.samsung.android.knox.ucm.core.ApduMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduMessage createFromParcel(Parcel parcel) {
            return new ApduMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduMessage[] newArray(int i) {
            return new ApduMessage[i];
        }
    };
    public int errorCode;
    public byte[] message;
    public int messageType;
    public int status;

    private ApduMessage(Parcel parcel) {
        this.status = 1;
        this.errorCode = -1;
        this.messageType = 0;
        this.message = null;
        this.status = ((Integer) parcel.readSerializable()).intValue();
        this.errorCode = ((Integer) parcel.readSerializable()).intValue();
        this.messageType = ((Integer) parcel.readSerializable()).intValue();
        this.message = (byte[]) parcel.readSerializable();
    }

    public static ApduMessage convertToNew(com.sec.enterprise.knox.ucm.core.ApduMessage apduMessage) {
        if (apduMessage == null) {
            return null;
        }
        return new ApduMessage(apduMessage.status, apduMessage.errorCode, apduMessage.messageType, apduMessage.message);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [byte[], java.io.Serializable] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(Integer.valueOf(this.status));
        parcel.writeSerializable(Integer.valueOf(this.errorCode));
        parcel.writeSerializable(Integer.valueOf(this.messageType));
        parcel.writeSerializable(this.message);
    }

    public ApduMessage(int i, int i2, int i3, byte[] bArr) {
        this.status = i;
        this.errorCode = i2;
        this.messageType = i3;
        this.message = bArr;
    }
}
