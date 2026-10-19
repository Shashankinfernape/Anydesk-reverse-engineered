package defpackage;

import android.os.Build;
import android.os.Looper;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class t31 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ SetupFragment d;

    public /* synthetic */ t31(SetupFragment setupFragment, int i) {
        this.c = i;
        this.d = setupFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        SetupFragment setupFragment = this.d;
        switch (i) {
            case 0:
                qa qaVarG0 = setupFragment.G0();
                int i2 = Build.VERSION.SDK_INT;
                a41 a41Var = a41.g;
                if (i2 >= 30 || (uj.F(qaVarG0, "android.permission.WRITE_EXTERNAL_STORAGE") && uj.F(qaVarG0, "android.permission.READ_EXTERNAL_STORAGE"))) {
                    bc bcVar = setupFragment.d0;
                    if (bcVar != null) {
                        bcVar.p0(z31.V0(a41Var, 0), "SetupInfoDialog", true);
                    }
                    break;
                } else {
                    Logging logging = setupFragment.b0;
                    Boolean boolU0 = setupFragment.U0(a41Var);
                    if (boolU0 != null) {
                        if (!boolU0.booleanValue()) {
                            r3.o(setupFragment, setupFragment.y0, logging);
                        } else if (i2 < 30) {
                            t70.T(setupFragment.G0(), logging, t70.m(setupFragment.G0()));
                        } else {
                            qa qaVarG1 = setupFragment.G0();
                            Looper looper = t70.a;
                            t70.S(qaVarG1, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION", qaVarG1.getPackageName(), logging);
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (t70.K()) {
                    if (!uj.F(setupFragment.G0(), nd0.e[0])) {
                        setupFragment.W0();
                    } else {
                        bc bcVar2 = setupFragment.d0;
                        if (bcVar2 != null) {
                            bcVar2.p0(z31.V0(a41.h, 0), "SetupInfoDialog", true);
                        }
                    }
                    break;
                }
                break;
            case 2:
                setupFragment.Z0(true);
                break;
            case 3:
                boolean zF = uj.F(setupFragment.G0(), "android.permission.RECORD_AUDIO");
                a41 a41Var2 = a41.x;
                if (zF) {
                    bc bcVar3 = setupFragment.d0;
                    if (bcVar3 != null) {
                        bcVar3.p0(z31.V0(a41Var2, 0), "SetupInfoDialog", true);
                    }
                    break;
                } else {
                    Boolean boolU1 = setupFragment.U0(a41Var2);
                    if (boolU1 != null) {
                        if (!boolU1.booleanValue()) {
                            r3.m(setupFragment, new String[]{"android.permission.RECORD_AUDIO"}, setupFragment.A0.a);
                        } else {
                            setupFragment.b1();
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (!SetupFragment.R0(setupFragment, a41.c)) {
                    setupFragment.X0(true);
                }
                break;
            case 5:
                if (!SetupFragment.R0(setupFragment, a41.d)) {
                    setupFragment.Y0("anydesk", true);
                }
                break;
            case 6:
                if (!SetupFragment.R0(setupFragment, a41.e)) {
                    setupFragment.Y0("anydesk_headsup", true);
                }
                break;
            default:
                if (!SetupFragment.R0(setupFragment, a41.f)) {
                    setupFragment.Y0("anydesk_chat", true);
                }
                break;
        }
    }
}
