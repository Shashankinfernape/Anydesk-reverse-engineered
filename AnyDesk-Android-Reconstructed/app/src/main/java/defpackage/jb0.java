package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ jb0(int i, int i2, int i3, boolean z) {
        this.c = i3;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                zd zdVar = JniAdExt.r;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            kd0 kd0Var = (kd0) tdVar.next();
                            if (kd0Var != null) {
                                kd0Var.e(this.d, this.e, this.f);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                JniAdExt.o0.g(this.d, this.e, this.f);
                return;
            default:
                JniAdExt.jniFileManagerDeleteConfirmDialogResolve(this.d, q51.r(this.e), this.f);
                return;
        }
    }
}
