package defpackage;

import android.graphics.Bitmap;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fl {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Bitmap f;
    public final int g;

    public fl(int i, String str, String str2, String str3, boolean z, Bitmap bitmap, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = bitmap;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return this.e == flVar.e && this.g == flVar.g && this.a == flVar.a && this.b.equals(flVar.b) && this.c.equals(flVar.c) && this.d.equals(flVar.d) && Objects.equals(this.f, flVar.f);
    }
}
