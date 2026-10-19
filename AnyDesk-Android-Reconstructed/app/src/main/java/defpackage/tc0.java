package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 implements Runnable {
    public final /* synthetic */ t01 c;
    public final /* synthetic */ t01 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public tc0(t01 t01Var, t01 t01Var2, boolean z, String str, String str2) {
        this.c = t01Var;
        this.d = t01Var2;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t01 t01Var = this.c;
        byte[] bArrC = nd0.c(t01Var.c);
        t01 t01Var2 = this.d;
        byte[] bArrC2 = nd0.c(t01Var2.c);
        t01Var.b();
        t01Var2.b();
        JniAdExt.jniAnynetAccountLogin(this.e, bArrC, bArrC2, nd0.T(this.f), nd0.T(this.g));
        t70.a0(bArrC);
        t70.a0(bArrC2);
    }
}
