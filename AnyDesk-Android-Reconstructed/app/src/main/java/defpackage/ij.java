package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.projection.MediaProjection;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ij implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ mj d;

    public /* synthetic */ ij(mj mjVar, int i) {
        this.c = i;
        this.d = mjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DisplayManager displayManager;
        int i = this.c;
        mj mjVar = this.d;
        switch (i) {
            case 0:
                gj gjVar = mjVar.q;
                if (gjVar != null) {
                    gjVar.disable();
                }
                mjVar.q = null;
                hj hjVar = mjVar.r;
                if (hjVar != null && (displayManager = mjVar.s) != null) {
                    displayManager.unregisterDisplayListener(hjVar);
                }
                mjVar.r = null;
                mjVar.s = null;
                mjVar.b = null;
                mjVar.c = false;
                mjVar.g();
                JniAdExt.F = null;
                mjVar.i(1);
                break;
            case 1:
                mjVar.e(false);
                break;
            case 2:
                if (mjVar.w == null) {
                    mj.a(mjVar);
                } else {
                    mjVar.x = true;
                    s7 s7Var = mjVar.v;
                    if (s7Var != null) {
                        s7Var.removeMessages(q51.d(13));
                        s7Var.sendEmptyMessageDelayed(q51.d(13), 2000L);
                    }
                    mjVar.w.stop();
                }
                break;
            default:
                MediaProjection mediaProjection = mjVar.w;
                Context context = mjVar.y;
                if (mediaProjection != null && context != null) {
                    mediaProjection.registerCallback(mjVar.B, mjVar.v);
                    s7 s7Var2 = mjVar.m;
                    if (s7Var2 != null) {
                        s7Var2.post(new wh(mjVar, context, s7Var2, 1));
                    }
                    ff ffVar = mjVar.n;
                    if (ffVar != null && context != null && mjVar.w != null && !ffVar.g.get()) {
                        mjVar.n.a(context, mjVar.w);
                    }
                    break;
                }
                break;
        }
    }
}
