package com.samsung.android.knox.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Geofence implements Parcelable {
    public static final Parcelable.Creator<Geofence> CREATOR = new Parcelable.Creator<Geofence>() { // from class: com.samsung.android.knox.location.Geofence.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Geofence createFromParcel(Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int i = parcel.readInt();
            parcel.setDataPosition(iDataPosition);
            return GeofenceFactory.createGeofence(i, parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Geofence[] newArray(int i) {
            return null;
        }
    };
    public int id;
    public int type;

    public static List<Geofence> convertToNewList(List<android.app.enterprise.geofencing.Geofence> list) {
        Parcelable parcelableConvertToNew;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.geofencing.Geofence> it = list.iterator();
        while (it.hasNext()) {
            android.app.enterprise.geofencing.CircularGeofence circularGeofence = (android.app.enterprise.geofencing.Geofence) it.next();
            if (((android.app.enterprise.geofencing.Geofence) circularGeofence).type == 1) {
                parcelableConvertToNew = CircularGeofence.convertToNew(circularGeofence);
            } else if (((android.app.enterprise.geofencing.Geofence) circularGeofence).type == 2) {
                parcelableConvertToNew = PolygonalGeofence.convertToNew((android.app.enterprise.geofencing.PolygonalGeofence) circularGeofence);
            } else {
                parcelableConvertToNew = ((android.app.enterprise.geofencing.Geofence) circularGeofence).type == 3 ? LinearGeofence.convertToNew((android.app.enterprise.geofencing.LinearGeofence) circularGeofence) : null;
            }
            arrayList.add(parcelableConvertToNew);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.type = parcel.readInt();
        this.id = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.id);
    }
}
