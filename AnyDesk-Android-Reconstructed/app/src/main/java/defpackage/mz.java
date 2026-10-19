package defpackage;

import android.text.TextUtils;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class mz implements j80 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final xy e;
    public final wy f;
    public final long g;
    public final String h;
    public final long i;
    public boolean j = false;
    public long k = -1;
    public boolean l = false;

    public mz(boolean z, String str, String str2, String str3, xy xyVar, wy wyVar, long j, String str4, long j2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = xyVar;
        this.f = wyVar;
        this.g = j;
        this.h = str4;
        this.i = j2;
    }

    public final synchronized long a() {
        return this.k;
    }

    public final String b(String str) {
        String str2 = this.d;
        if ("/".equals(str2)) {
            return str2 + str;
        }
        return str2 + "/" + str;
    }

    public final boolean c() {
        return (this.f.c & 2) == 2;
    }

    public final boolean d() {
        return c() && "..".equals(this.c);
    }

    public final synchronized boolean e() {
        return this.j;
    }

    public final synchronized void f(long j) {
        if (j >= 0) {
            if (!this.l) {
                this.k = j;
                this.l = true;
            }
        }
    }

    public final synchronized void g(boolean z) {
        this.j = z;
    }

    @Override // defpackage.j80
    public final boolean matchesFilter(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!(TextUtils.isEmpty(str) ? true : d() ? JniAdExt.g2(io.KEY_FILES_ENABLE_PARENT_FOLDER) : this.c.toLowerCase().contains(str))) {
                return false;
            }
        }
        return true;
    }
}
