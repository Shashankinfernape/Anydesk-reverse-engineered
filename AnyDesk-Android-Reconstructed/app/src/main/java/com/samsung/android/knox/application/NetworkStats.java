package com.samsung.android.knox.application;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NetworkStats implements Parcelable {
    public static final Parcelable.Creator<NetworkStats> CREATOR = new Parcelable.Creator<NetworkStats>() { // from class: com.samsung.android.knox.application.NetworkStats.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkStats createFromParcel(Parcel parcel) {
            return new NetworkStats(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetworkStats[] newArray(int i) {
            return new NetworkStats[i];
        }
    };
    public int uid = 0;
    public long wifiRxBytes = 0;
    public long wifiTxBytes = 0;
    public long mobileRxBytes = 0;
    public long mobileTxBytes = 0;

    public NetworkStats(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static NetworkStats convertToNew(android.app.enterprise.NetworkStats networkStats) {
        if (networkStats == null) {
            return null;
        }
        NetworkStats networkStats2 = new NetworkStats();
        networkStats2.uid = networkStats.uid;
        networkStats2.wifiRxBytes = networkStats.wifiRxBytes;
        networkStats2.wifiTxBytes = networkStats.wifiTxBytes;
        networkStats2.mobileRxBytes = networkStats.mobileRxBytes;
        networkStats2.mobileTxBytes = networkStats.mobileTxBytes;
        return networkStats2;
    }

    public static List<NetworkStats> convertToNewList(List<android.app.enterprise.NetworkStats> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.NetworkStats> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToNew(it.next()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.uid = parcel.readInt();
        this.wifiRxBytes = parcel.readLong();
        this.wifiTxBytes = parcel.readLong();
        this.mobileRxBytes = parcel.readLong();
        this.mobileTxBytes = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.uid);
        parcel.writeLong(this.wifiRxBytes);
        parcel.writeLong(this.wifiTxBytes);
        parcel.writeLong(this.mobileRxBytes);
        parcel.writeLong(this.mobileTxBytes);
    }

    public NetworkStats() {
    }
}
