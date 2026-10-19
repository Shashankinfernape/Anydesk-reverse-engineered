package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public class p81 {
    public final String a;
    public final CharSequence b;
    public Rect e;
    public BitmapDrawable f;
    public float c = 0.96f;
    public int d = 44;
    public final int g = -1;
    public final int h = -1;
    public final int i = -1;
    public final int j = -1;
    public final int k = -1;
    public Integer l = null;
    public Integer m = null;
    public Integer n = null;
    public Integer o = null;
    public final int p = -1;
    public final int q = -1;
    public final int r = 20;
    public final int s = 18;
    public boolean t = false;
    public final boolean u = true;
    public final boolean v = true;
    public boolean w = false;
    public float x = 0.54f;

    public p81(String str, CharSequence charSequence) {
        this.a = str;
        this.b = charSequence;
    }

    public static Integer a(Context context, Integer num, int i) {
        return i != -1 ? Integer.valueOf(uj.l(context, i)) : num;
    }

    public static p81 b(Rect rect, String str, String str2) {
        p81 p81Var = new p81(str, str2);
        p81Var.e = rect;
        return p81Var;
    }

    public void c(bc0 bc0Var) {
        bc0Var.run();
    }
}
