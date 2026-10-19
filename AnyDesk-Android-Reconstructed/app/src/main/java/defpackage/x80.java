package defpackage;

import android.animation.TimeAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import com.anydesk.anydeskandroid.IncomingConnectionService;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class x80 implements Runnable {
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ev f;

    public x80(ev evVar, nm0 nm0Var, int i, int i2) {
        this.f = evVar;
        this.c = nm0Var;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su0 su0Var;
        ev evVar = this.f;
        IncomingConnectionService incomingConnectionService = (IncomingConnectionService) evVar.d;
        IncomingConnectionService incomingConnectionService2 = (IncomingConnectionService) evVar.d;
        nm0 nm0Var = incomingConnectionService.e;
        int i = this.c.c;
        if ((i & 1) == 1) {
            incomingConnectionService.e = new nm0(nm0Var.c | 1);
        }
        if ((i & 4) == 4) {
            incomingConnectionService.e = new nm0(incomingConnectionService.e.c | 4);
        }
        if ((i & 16) == 16) {
            incomingConnectionService.e = new nm0(incomingConnectionService.e.c | 16);
        }
        if ((i & 2) == 2) {
            incomingConnectionService.e = new nm0(incomingConnectionService.e.c & (-2));
        }
        if ((i & 8) == 8) {
            incomingConnectionService.e = new nm0(incomingConnectionService.e.c & (-5));
        }
        if ((i & 32) == 32) {
            incomingConnectionService.e = new nm0(incomingConnectionService.e.c & (-17));
        }
        mr0 mr0Var = incomingConnectionService.d;
        if (mr0Var != null) {
            PointF pointF = incomingConnectionService.g;
            pointF.x = this.d;
            pointF.y = this.e;
            MainApplication mainApplicationV = MainApplication.v();
            if (mainApplicationV.S(incomingConnectionService2.g)) {
                PointF pointF2 = incomingConnectionService2.g;
                int i2 = (int) pointF2.x;
                int i3 = (int) pointF2.y;
                mr0Var.i = i2;
                mr0Var.j = i3;
                if (!mr0Var.e) {
                    mr0Var.a();
                }
                if (!mr0Var.f) {
                    mr0Var.c();
                    su0 su0Var2 = mr0Var.d;
                    if (su0Var2 != null) {
                        su0Var2.a();
                    }
                }
            }
            if (incomingConnectionService2.e.c != 0 && nm0Var.c == 0) {
                if (!mr0Var.e) {
                    mr0Var.a();
                }
                su0 su0Var3 = mr0Var.d;
                if (su0Var3 != null) {
                    su0Var3.h = SystemClock.uptimeMillis();
                    su0Var3.i = false;
                    su0Var3.j = false;
                    TimeAnimator timeAnimator = su0Var3.f;
                    if (timeAnimator != null) {
                        timeAnimator.cancel();
                    }
                    su0Var3.b();
                    su0Var3.g = 0L;
                    su0Var3.setVisibility(0);
                    TimeAnimator timeAnimator2 = su0Var3.f;
                    if (timeAnimator2 != null) {
                        timeAnimator2.setCurrentPlayTime(0L);
                        timeAnimator2.start();
                    }
                }
            }
            if (incomingConnectionService2.e.c == 0 && nm0Var.c != 0 && (su0Var = mr0Var.d) != null) {
                su0Var.h = SystemClock.uptimeMillis();
                su0Var.i = false;
                su0Var.g = 0L;
                TimeAnimator timeAnimator3 = su0Var.f;
                if (timeAnimator3 != null) {
                    timeAnimator3.cancel();
                }
                su0Var.j = true;
                TimeAnimator timeAnimator4 = su0Var.f;
                if (timeAnimator4 != null) {
                    timeAnimator4.setCurrentPlayTime(0L);
                    timeAnimator4.start();
                }
            }
            if (incomingConnectionService2.e.c == 0 || nm0Var.c != 0) {
                return;
            }
            Looper looper = t70.a;
            if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(incomingConnectionService2) || incomingConnectionService2.h) {
                return;
            }
            int iH2 = JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_OVERLAY_PERMISSION);
            Logging logging = mainApplicationV.d;
            if (iH2 == 0) {
                logging.e("requesting overlay permission disabled");
            } else {
                logging.e("requesting overlay permission");
                t70.Y(new ei0(mainApplicationV, 1));
            }
            incomingConnectionService2.h = true;
        }
    }
}
