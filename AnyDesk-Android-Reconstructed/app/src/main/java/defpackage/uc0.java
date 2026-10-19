package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements Runnable {
    public final /* synthetic */ t01 c;
    public final /* synthetic */ t01 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ f9 h;

    public uc0(t01 t01Var, t01 t01Var2, String str, String str2, boolean z, f9 f9Var) {
        this.c = t01Var;
        this.d = t01Var2;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t01 t01Var = this.c;
        byte[] bArrC = nd0.c(t01Var.c);
        t01 t01Var2 = this.d;
        byte[] bArrC2 = nd0.c(t01Var2.c);
        t01Var.b();
        t01Var2.b();
        JniAdExt.jniAnynetAccountRegister(bArrC, bArrC2, nd0.T(this.e), nd0.T(this.f), this.g, this.h.c);
        t70.a0(bArrC);
        t70.a0(bArrC2);
    }
}
