package defpackage;

import android.graphics.Bitmap;
import android.view.Choreographer;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ ha0(Object obj, int i, int i2) {
        this.c = i2;
        this.d = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        final int i2 = this.e;
        Object obj = this.d;
        switch (i) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                final GlowActivity glowActivity = (GlowActivity) obj;
                glowActivity.getClass();
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: c70
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        GlowActivity.jniOnSurfaceRedrawNeeded(glowActivity.mNativeActivityPtr, i2);
                    }
                });
                break;
            case 1:
                Bitmap bitmap2 = JniAdExt.a;
                GlowActivity glowActivity2 = (GlowActivity) obj;
                e70 e70Var = (e70) glowActivity2.f.remove(Integer.valueOf(i2));
                if (e70Var != null) {
                    e70Var.getHolder().getSurface().release();
                }
                glowActivity2.c.removeView(e70Var);
                break;
            default:
                ((uj) obj).z(i2);
                break;
        }
    }
}
