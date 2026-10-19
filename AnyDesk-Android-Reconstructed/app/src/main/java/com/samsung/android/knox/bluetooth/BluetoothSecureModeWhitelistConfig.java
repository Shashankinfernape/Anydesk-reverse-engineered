package com.samsung.android.knox.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BluetoothSecureModeWhitelistConfig implements Parcelable {
    public static final Parcelable.Creator<BluetoothSecureModeWhitelistConfig> CREATOR = new Parcelable.Creator<BluetoothSecureModeWhitelistConfig>() { // from class: com.samsung.android.knox.bluetooth.BluetoothSecureModeWhitelistConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothSecureModeWhitelistConfig createFromParcel(Parcel parcel) {
            return new BluetoothSecureModeWhitelistConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BluetoothSecureModeWhitelistConfig[] newArray(int i) {
            return new BluetoothSecureModeWhitelistConfig[i];
        }
    };
    public int cod;
    public String name;
    public String[] uuids;

    public BluetoothSecureModeWhitelistConfig(String str, int i, String[] strArr) {
        this.name = str;
        this.cod = i;
        this.uuids = strArr;
    }

    public static BluetoothSecureModeWhitelistConfig convertToNew(android.app.enterprise.BluetoothSecureModeWhitelistConfig bluetoothSecureModeWhitelistConfig) {
        if (bluetoothSecureModeWhitelistConfig == null) {
            return null;
        }
        return new BluetoothSecureModeWhitelistConfig(bluetoothSecureModeWhitelistConfig.name, bluetoothSecureModeWhitelistConfig.cod, bluetoothSecureModeWhitelistConfig.uuids);
    }

    public static List<BluetoothSecureModeWhitelistConfig> convertToNewList(List<android.app.enterprise.BluetoothSecureModeWhitelistConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.BluetoothSecureModeWhitelistConfig> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToNew(it.next()));
        }
        return arrayList;
    }

    public static android.app.enterprise.BluetoothSecureModeWhitelistConfig convertToOld(BluetoothSecureModeWhitelistConfig bluetoothSecureModeWhitelistConfig) {
        if (bluetoothSecureModeWhitelistConfig == null) {
            return null;
        }
        return new android.app.enterprise.BluetoothSecureModeWhitelistConfig(bluetoothSecureModeWhitelistConfig.name, bluetoothSecureModeWhitelistConfig.cod, bluetoothSecureModeWhitelistConfig.uuids);
    }

    public static List<android.app.enterprise.BluetoothSecureModeWhitelistConfig> convertToOldList(List<BluetoothSecureModeWhitelistConfig> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothSecureModeWhitelistConfig> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToOld(it.next()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.name = parcel.readString();
        this.cod = parcel.readInt();
        int i = parcel.readInt();
        if (i <= 0) {
            this.uuids = null;
            return;
        }
        String[] strArr = new String[i];
        this.uuids = strArr;
        parcel.readStringArray(strArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeString(this.name);
        parcel.writeInt(this.cod);
        String[] strArr = this.uuids;
        if (strArr == null || strArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.uuids);
        }
    }

    public BluetoothSecureModeWhitelistConfig() {
    }

    private BluetoothSecureModeWhitelistConfig(Parcel parcel) {
        readFromParcel(parcel);
    }
}
