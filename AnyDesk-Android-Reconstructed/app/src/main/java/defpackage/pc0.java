package defpackage;

import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class pc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ nm0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ pc0(nm0 nm0Var, float f, float f2, int i) {
        this.c = i;
        this.d = nm0Var;
        this.e = f;
        this.f = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniOnMouse(this.d.c, this.e, this.f);
                break;
            default:
                JniAdExt.jniOnMouseRelative(this.d.c, this.e, this.f);
                break;
        }
    }
}
