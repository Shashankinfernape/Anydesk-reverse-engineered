package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class r30 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public r30(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public r30(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = null;
        this.f = i3;
    }
}
