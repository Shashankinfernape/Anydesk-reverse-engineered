package com.samsung.android.knox.application;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Parcelable.Creator<AppInfo>() { // from class: com.samsung.android.knox.application.AppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    };
    public String packageName;
    public double usage;

    public AppInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static AppInfo convertToNew(android.app.enterprise.AppInfo appInfo) {
        if (appInfo == null) {
            return null;
        }
        AppInfo appInfo2 = new AppInfo();
        appInfo2.packageName = appInfo.mPackageName;
        appInfo2.usage = appInfo.mUsage;
        return appInfo2;
    }

    public static List<AppInfo> convertToNewList(List<android.app.enterprise.AppInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.AppInfo> it = list.iterator();
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
        this.packageName = parcel.readString();
        this.usage = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeDouble(this.usage);
    }

    public AppInfo() {
    }
}
