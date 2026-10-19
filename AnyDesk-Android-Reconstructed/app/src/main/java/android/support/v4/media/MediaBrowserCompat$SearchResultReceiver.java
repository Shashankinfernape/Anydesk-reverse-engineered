package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.lk0;
import defpackage.sy0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends sy0 {
    @Override // defpackage.sy0
    public final void a(int i, Bundle bundle) {
        Parcelable[] parcelableArray;
        if (bundle != null) {
            bundle.setClassLoader(lk0.class.getClassLoader());
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
