package defpackage;

import android.graphics.Bitmap;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 implements Runnable {
    public final /* synthetic */ int c;

    public tb0(long j) {
        this.c = 5;
    }

    private final void a() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.B();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.V();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.w();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.O();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f() {
        h5 h5Var = MainApplication.v().w;
        if (h5Var != null) {
            h5Var.b0(3);
            h5Var.N(false);
        }
        zd zdVar = JniAdExt.X;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    xc0 xc0Var = (xc0) tdVar.next();
                    if (xc0Var != null) {
                        xc0Var.J();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void g() {
        zd zdVar = JniAdExt.e0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    md0 md0Var = (md0) tdVar.next();
                    if (md0Var != null) {
                        md0Var.H();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.U1();
                return;
            case 1:
                Bitmap bitmap = JniAdExt.a;
                return;
            case 2:
                zd zdVar = JniAdExt.W;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            wc0 wc0Var = (wc0) tdVar.next();
                            if (wc0Var != null) {
                                wc0Var.f();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                b();
                return;
            case 5:
                c();
                return;
            case 6:
                d();
                return;
            case 7:
                e();
                return;
            case 8:
                f();
                return;
            case 9:
                g();
                return;
            case 10:
                iz izVar = JniAdExt.k0;
                if (izVar != null) {
                    t70.Y(new c(21, izVar));
                    return;
                }
                return;
            case 11:
                JniAdExt.jniRewindPlayback();
                return;
            case 12:
                JniAdExt.jniWolReconnect();
                return;
            case 13:
                JniAdExt.jniWolWake();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                JniAdExt.jniClosePanel();
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                JniAdExt.jniRestartAudioCapture();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                JniAdExt.jniOnEndScroll();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                JniAdExt.jniOnEndPanZoom();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                JniAdExt.jniStartPanZoomCorrection(500L);
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                JniAdExt.jniOnMouseRelativeStart();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                JniAdExt.jniRefreshLicense();
                return;
            case 21:
                JniAdExt.jniOnSendSas();
                return;
            case 22:
                JniAdExt.jniStartVpn();
                return;
            case 23:
                JniAdExt.jniStopVpn();
                return;
            case 24:
                JniAdExt.jniOnStartSessionRecording();
                return;
            case 25:
                JniAdExt.jniOnStopSessionRecording();
                return;
            case 26:
                JniAdExt.jniOnRequestElevation();
                return;
            case 27:
                JniAdExt.jniOnSaveScreenshot();
                return;
            case 28:
                JniAdExt.jniOnAcceptFiles();
                return;
            default:
                JniAdExt.jniNotifyReadyForBackendFileOperations();
                return;
        }
    }

    public /* synthetic */ tb0(int i) {
        this.c = i;
    }

    public tb0(long[] jArr) {
        this.c = 7;
    }
}
