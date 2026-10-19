package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.lk0;
import defpackage.u5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new u5(21);
    public final int c;
    public final long d;
    public final long e;
    public final float f;
    public final long g;
    public final int h;
    public final CharSequence i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public final Bundle m;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String c;
        public final CharSequence d;
        public final int e;
        public final Bundle f;

        public CustomAction(Parcel parcel) {
            this.c = parcel.readString();
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e = parcel.readInt();
            this.f = parcel.readBundle(lk0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.d) + ", mIcon=" + this.e + ", mExtras=" + this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.e);
            parcel.writeBundle(this.f);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.f = parcel.readFloat();
        this.j = parcel.readLong();
        this.e = parcel.readLong();
        this.g = parcel.readLong();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.l = parcel.readLong();
        this.m = parcel.readBundle(lk0.class.getClassLoader());
        this.h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.c + ", position=" + this.d + ", buffered position=" + this.e + ", speed=" + this.f + ", updated=" + this.j + ", actions=" + this.g + ", error code=" + this.h + ", error message=" + this.i + ", custom actions=" + this.k + ", active item id=" + this.l + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeFloat(this.f);
        parcel.writeLong(this.j);
        parcel.writeLong(this.e);
        parcel.writeLong(this.g);
        TextUtils.writeToParcel(this.i, parcel, i);
        parcel.writeTypedList(this.k);
        parcel.writeLong(this.l);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.h);
    }
}
