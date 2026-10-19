package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nd0;
import defpackage.u5;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new u5(13);
    public final String c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final Bitmap g;
    public final Uri h;
    public final Bundle i;
    public final Uri j;
    public Object k;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.c = str;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = bitmap;
        this.h = uri;
        this.i = bundle;
        this.j = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.d) + ", " + ((Object) this.e) + ", " + ((Object) this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.k;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.c);
            builder.setTitle(this.d);
            builder.setSubtitle(this.e);
            builder.setDescription(this.f);
            builder.setIconBitmap(this.g);
            builder.setIconUri(this.h);
            int i2 = Build.VERSION.SDK_INT;
            Uri uri = this.j;
            Bundle bundle = this.i;
            if (i2 < 23 && uri != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                nd0.M(builder, uri);
            }
            objBuild = builder.build();
            this.k = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
