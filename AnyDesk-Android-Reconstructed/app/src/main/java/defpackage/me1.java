package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class me1 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static nq b(View view, nq nqVar) {
        ContentInfo contentInfoC = nqVar.a.c();
        Objects.requireNonNull(contentInfoC);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoC);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoC ? nqVar : new nq(new jq(contentInfoPerformReceiveContent));
    }
}
