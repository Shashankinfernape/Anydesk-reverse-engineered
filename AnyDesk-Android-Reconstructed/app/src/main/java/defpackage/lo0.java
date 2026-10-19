package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class lo0 {
    public static final lh b = new lh(2, false);
    public static final lh c = new lh(4, false);
    public static final kh d = new kh(4, true);
    public static final kh e = new kh(5, true);
    public static final lh f = new lh(3, false);
    public static final kh g = new kh(6, true);
    public static final kh h = new kh(7, true);
    public static final lh i = new lh(1, false);
    public static final kh j = new kh(2, true);
    public static final kh k = new kh(3, true);
    public static final lh l = new lh(0, false);
    public static final kh m = new kh(0, true);
    public static final kh n = new kh(1, true);
    public static final lh o = new lh(5, true);
    public static final kh p = new kh(8, true);
    public static final kh q = new kh(9, true);
    public final boolean a;

    public lo0(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
