package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class qc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ de0 e;

    public /* synthetic */ qc0(int i, de0 de0Var, int i2) {
        this.c = i2;
        this.d = i;
        this.e = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        de0 de0Var = this.e;
        int i2 = this.d;
        switch (i) {
            case 0:
                JniAdExt.jniOnKey(i2, de0Var.c);
                break;
            case 1:
                JniAdExt.jniOnKey(i2, de0Var.c & (-9));
                break;
            default:
                JniAdExt.jniOnKey(i2, de0Var.c | 8);
                break;
        }
    }
}
