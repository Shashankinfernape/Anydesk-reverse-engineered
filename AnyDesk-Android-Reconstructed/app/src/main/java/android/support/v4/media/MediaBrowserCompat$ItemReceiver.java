package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.lk0;
import defpackage.sy0;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends sy0 {
    @Override // defpackage.sy0
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(lk0.class.getClassLoader());
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
