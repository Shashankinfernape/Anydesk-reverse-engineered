package com.samsung.android.knox.dlp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.AppIdentity;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DLPPackageInfo implements Parcelable {
    public static final Parcelable.Creator<DLPPackageInfo> CREATOR = new Parcelable.Creator<DLPPackageInfo>() { // from class: com.samsung.android.knox.dlp.DLPPackageInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DLPPackageInfo createFromParcel(Parcel parcel) {
            return new DLPPackageInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DLPPackageInfo[] newArray(int i) {
            return new DLPPackageInfo[i];
        }
    };
    public AppIdentity appIdentity;
    public Bundle extras;

    public DLPPackageInfo(AppIdentity appIdentity, Bundle bundle) {
        this.appIdentity = appIdentity;
        this.extras = bundle;
    }

    public static DLPPackageInfo convertToNew(com.sec.enterprise.knox.dlp.DLPPackageInfo dLPPackageInfo) {
        if (dLPPackageInfo == null) {
            return null;
        }
        return new DLPPackageInfo(AppIdentity.convertToNew(dLPPackageInfo.appIdentity), dLPPackageInfo.extras);
    }

    public static List<DLPPackageInfo> convertToNewList(List<com.sec.enterprise.knox.dlp.DLPPackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator<com.sec.enterprise.knox.dlp.DLPPackageInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToNew(it.next()));
        }
        return arrayList;
    }

    public static com.sec.enterprise.knox.dlp.DLPPackageInfo convertToOld(DLPPackageInfo dLPPackageInfo) {
        if (dLPPackageInfo == null) {
            return null;
        }
        try {
            try {
                return new com.sec.enterprise.knox.dlp.DLPPackageInfo(AppIdentity.convertToOld(dLPPackageInfo.appIdentity), dLPPackageInfo.extras);
            } catch (NoClassDefFoundError unused) {
                id.g(SupportLibUtils.buildClassErrorMsg(DLPPackageInfo.class, 19));
                return null;
            }
        } catch (NoClassDefFoundError e) {
            id.g(e.getMessage());
            return null;
        }
    }

    public static List<com.sec.enterprise.knox.dlp.DLPPackageInfo> convertToOldList(List<DLPPackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator<DLPPackageInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToOld(it.next()));
        }
        return arrayList;
    }

    private void readFromParcel(Parcel parcel) {
        this.appIdentity = (AppIdentity) parcel.readParcelable(AppIdentity.class.getClassLoader());
        this.extras = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.appIdentity, i);
        parcel.writeBundle(this.extras);
    }

    public DLPPackageInfo() {
    }

    private DLPPackageInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
