package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public fb0(int i, int i2, boolean z) {
        this.c = 3;
        this.d = z;
    }

    private final void a() {
        zd zdVar = JniAdExt.f0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                    if (fileManagerFileListFragment != null) {
                        t70.Y(new b00(fileManagerFileListFragment, this.d, 1));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        zd zdVar = JniAdExt.f0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                    if (fileManagerFileListFragment != null) {
                        t70.Y(new b00(fileManagerFileListFragment, this.d, 2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        x00 x00Var = MainApplication.v().s;
        if (x00Var == null) {
            return;
        }
        x00Var.G(this.d);
        zd zdVar = JniAdExt.i0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                    if (fileManagerFileListFragment != null) {
                        t70.Y(new c00(fileManagerFileListFragment, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.c) {
            case 0:
                JniAdExt.jniSetTelemetryConsent(this.d);
                return;
            case 1:
                zd zdVar = JniAdExt.q;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            cd0 cd0Var = (cd0) tdVar.next();
                            if (cd0Var != null) {
                                cd0Var.I(this.d);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ConnectionFragment connectionFragment = JniAdExt.u;
                if (connectionFragment != null) {
                    t70.Y(new ap(connectionFragment, i, this.d));
                    return;
                }
                return;
            case 4:
                t70.g0(JniAdExt.d, this.d ? JniAdExt.n1("ad.msg.privacy_on.android") : JniAdExt.n1("ad.msg.privacy_off.android"), 0);
                return;
            case 5:
                b();
                return;
            case 6:
                JniAdExt.jniFileManagerOnHomeClicked(this.d);
                return;
            case 7:
                JniAdExt.jniFileManagerOnRefreshClicked(this.d);
                return;
            case 8:
                c();
                return;
            case 9:
                JniAdExt.jniFileManagerAbortRequestForFileProperties(this.d);
                return;
            case 10:
                JniAdExt.jniSetPlaybackPaused(this.d);
                return;
            case 11:
                JniAdExt.jniStopPanZoomCorrection(this.d);
                return;
            default:
                JniAdExt.jniOnPrivacyMode(this.d);
                return;
        }
    }

    public /* synthetic */ fb0(int i, boolean z) {
        this.c = i;
        this.d = z;
    }
}
