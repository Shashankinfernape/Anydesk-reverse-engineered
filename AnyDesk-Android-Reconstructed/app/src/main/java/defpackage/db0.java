package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class db0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ du0 d;
    public final /* synthetic */ boolean e;

    public db0(int i, du0 du0Var, boolean z) {
        this.c = i;
        this.d = du0Var;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JniAdExt.jniSetCurrentProfilePermission(this.c, this.d.c, this.e);
    }
}
