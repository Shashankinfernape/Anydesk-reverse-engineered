package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null) {
            if (message.what == q51.d(4)) {
                JniAdExt.jniReconnectService();
                return;
            }
            if (message.what == q51.d(7)) {
                JniAdExt.f = 0L;
                JniAdExt.S1();
                return;
            }
            if (message.what == q51.d(8)) {
                JniAdExt.f4();
                return;
            }
            if (message.what == q51.d(9)) {
                synchronized (JniAdExt.t0) {
                    try {
                        if (!JniAdExt.m3()) {
                            JniAdExt.I0.post(new i7(12));
                            JniAdExt.h = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (message.what == q51.d(11)) {
                JniAdExt.e();
                return;
            }
            if (message.what == q51.d(14)) {
                JniAdExt.I0.post(new tb0(10));
                return;
            }
            if (message.what == q51.d(15)) {
                Bitmap bitmap = JniAdExt.a;
                MainApplication mainApplicationV = MainApplication.v();
                if (mainApplicationV == null || JniAdExt.i3() || mainApplicationV.M) {
                    return;
                }
                JniAdExt.b.e("device boot: terminating app because MainService not started");
                mainApplicationV.N();
                ei0 ei0Var = mainApplicationV.m0;
                mainApplicationV.d.e("waiting for service termination...");
                new fi0(mainApplicationV, ei0Var).start();
            }
        }
    }
}
