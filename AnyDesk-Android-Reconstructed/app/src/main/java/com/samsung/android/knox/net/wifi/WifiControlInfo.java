package com.samsung.android.knox.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WifiControlInfo implements Parcelable {
    public static final Parcelable.Creator<WifiControlInfo> CREATOR = new Parcelable.Creator<WifiControlInfo>() { // from class: com.samsung.android.knox.net.wifi.WifiControlInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WifiControlInfo createFromParcel(Parcel parcel) {
            return new WifiControlInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WifiControlInfo[] newArray(int i) {
            return new WifiControlInfo[i];
        }
    };
    public String adminPackageName;
    public List<String> entries;

    private WifiControlInfo(Parcel parcel) {
        this.adminPackageName = null;
        this.entries = null;
        readFromParcel(parcel);
    }

    public static WifiControlInfo convertToNew(android.app.enterprise.WifiControlInfo wifiControlInfo) {
        if (wifiControlInfo == null) {
            return null;
        }
        WifiControlInfo wifiControlInfo2 = new WifiControlInfo();
        wifiControlInfo2.adminPackageName = wifiControlInfo.adminPackageName;
        wifiControlInfo2.entries = wifiControlInfo.entries;
        return wifiControlInfo2;
    }

    public static List<WifiControlInfo> convertToNewList(List<android.app.enterprise.WifiControlInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator<android.app.enterprise.WifiControlInfo> it = list.iterator();
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
        this.adminPackageName = parcel.readString();
        this.entries = parcel.createStringArrayList();
    }

    public String toString() {
        return "adminPackageName: " + this.adminPackageName + " ,entries: " + this.entries;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.adminPackageName);
        parcel.writeStringList(this.entries);
    }

    public WifiControlInfo() {
        this.adminPackageName = null;
        this.entries = null;
    }
}
