package com.samsung.android.knox.ucm.configurator;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class CACertificateInfo implements Parcelable {
    public static final Parcelable.Creator<CACertificateInfo> CREATOR = new Parcelable.Creator<CACertificateInfo>() { // from class: com.samsung.android.knox.ucm.configurator.CACertificateInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CACertificateInfo createFromParcel(Parcel parcel) {
            return new CACertificateInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CACertificateInfo[] newArray(int i) {
            return new CACertificateInfo[i];
        }
    };
    public Bundle bundle;
    private int certLength;
    public byte[] certificate;

    private CACertificateInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static CACertificateInfo convertToNew(com.sec.enterprise.knox.ucm.configurator.CACertificateInfo cACertificateInfo) {
        CACertificateInfo cACertificateInfo2 = new CACertificateInfo();
        cACertificateInfo2.bundle = cACertificateInfo.bundle;
        cACertificateInfo2.certificate = cACertificateInfo.certificate;
        return cACertificateInfo2;
    }

    private void readFromParcel(Parcel parcel) {
        this.bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        int i = parcel.readInt();
        this.certLength = i;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.certificate = bArr;
            parcel.readByteArray(bArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeParcelable(this.bundle, i);
            parcel.writeInt(this.certLength);
            if (this.certLength != 0) {
                parcel.writeByteArray(this.certificate);
            }
        }
    }

    private CACertificateInfo() {
    }
}
