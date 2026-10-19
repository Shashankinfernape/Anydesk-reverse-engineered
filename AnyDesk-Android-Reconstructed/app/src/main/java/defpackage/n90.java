package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class n90 implements o90 {
    public final InputContentInfo c;

    public n90(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.c = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.o90
    public final ClipDescription a() {
        return this.c.getDescription();
    }

    @Override // defpackage.o90
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.o90
    public final Uri c() {
        return this.c.getContentUri();
    }

    @Override // defpackage.o90
    public final void d() {
        this.c.requestPermission();
    }

    @Override // defpackage.o90
    public final Uri e() {
        return this.c.getLinkUri();
    }

    public n90(Object obj) {
        this.c = (InputContentInfo) obj;
    }
}
