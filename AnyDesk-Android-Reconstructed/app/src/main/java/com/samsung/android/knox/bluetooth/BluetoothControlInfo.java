package com.samsung.android.knox.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.ControlInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BluetoothControlInfo extends ControlInfo {
    public static final Parcelable.Creator<BluetoothControlInfo> CREATOR = new Parcelable.Creator<BluetoothControlInfo>() { // from class: com.samsung.android.knox.bluetooth.BluetoothControlInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothControlInfo createFromParcel(Parcel parcel) {
            return new BluetoothControlInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothControlInfo[] newArray(int i) {
            return new BluetoothControlInfo[i];
        }
    };

    private BluetoothControlInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static BluetoothControlInfo convertToNew(android.app.enterprise.BluetoothControlInfo bluetoothControlInfo) {
        if (bluetoothControlInfo == null) {
            return null;
        }
        BluetoothControlInfo bluetoothControlInfo2 = new BluetoothControlInfo();
        bluetoothControlInfo2.adminPackageName = bluetoothControlInfo.adminPackageName;
        bluetoothControlInfo2.entries = new ArrayList(bluetoothControlInfo.entries);
        return bluetoothControlInfo2;
    }

    public static List<BluetoothControlInfo> convertToNewList(List<android.app.enterprise.BluetoothControlInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.BluetoothControlInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToNew(it.next()));
        }
        return arrayList;
    }

    public BluetoothControlInfo() {
    }
}
