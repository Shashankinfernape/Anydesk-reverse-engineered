package defpackage;

import android.graphics.Bitmap;
import android.view.Window;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fj(Object obj, int i, boolean z) {
        this.c = i;
        this.e = obj;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PermissionProfile permissionProfileU;
        switch (this.c) {
            case 0:
                mj mjVar = (mj) this.e;
                mjVar.c = this.d;
                mjVar.d();
                return;
            case 1:
                ConnectionFragment connectionFragment = (ConnectionFragment) this.e;
                boolean z = this.d;
                Window windowO0 = connectionFragment.O0();
                if (windowO0 != null) {
                    r3.g(windowO0, z);
                    return;
                }
                return;
            case 2:
                Object obj = this.e;
                boolean z2 = this.d;
                Bitmap bitmap = JniAdExt.a;
                GlowActivity glowActivity = (GlowActivity) obj;
                glowActivity.e = z2;
                if (glowActivity.getWindow() != null) {
                    r3.g(glowActivity.getWindow(), z2);
                    return;
                }
                return;
            default:
                MainApplication mainApplication = (MainApplication) this.e;
                boolean z3 = this.d;
                if (mainApplication.o0 == 2) {
                    mainApplication.U(z3);
                    if (!z3 && (permissionProfileU = mainApplication.u()) != null) {
                        dj djVar = mainApplication.h;
                        boolean zContains = permissionProfileU.m.contains(du0.pf_input);
                        synchronized (djVar) {
                            if (djVar.c) {
                                djVar.c = false;
                                djVar.d = Boolean.valueOf(zContains);
                            }
                            break;
                        }
                    }
                    if (mainApplication.h.f()) {
                        JniAdExt.D4(mainApplication.D, du0.pf_input, z3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
