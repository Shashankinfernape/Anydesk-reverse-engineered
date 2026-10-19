package defpackage;

import android.graphics.Bitmap;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ sb0(float f, float f2, float f3, int i) {
        this.c = i;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ConnectionFragment connectionFragment;
        switch (this.c) {
            case 0:
                zg0 zg0Var = JniAdExt.G0;
                synchronized (zg0Var) {
                    try {
                        zg0Var.b = this.d;
                        zg0Var.c = this.e;
                        float f = this.f;
                        if (f != zg0Var.f || ((Bitmap) zg0Var.h) == null) {
                            zg0Var.f = f;
                            if (((Bitmap) zg0Var.g) != null) {
                                JniAdExt.m1();
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z && (connectionFragment = JniAdExt.T) != null) {
                    connectionFragment.f1();
                }
                ConnectionFragment connectionFragment2 = JniAdExt.U;
                if (connectionFragment2 != null) {
                    connectionFragment2.u1();
                    return;
                }
                return;
            case 1:
                JniAdExt.jniOnStartPanZoom(this.d, this.e, this.f);
                return;
            default:
                JniAdExt.jniOnPanZoom(this.d, this.e, this.f);
                return;
        }
    }
}
