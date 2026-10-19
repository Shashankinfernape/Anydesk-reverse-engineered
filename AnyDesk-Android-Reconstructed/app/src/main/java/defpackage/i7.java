package defpackage;

import android.os.Build;
import android.os.Trace;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.SettingsCategoryFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i7 implements Runnable {
    public final /* synthetic */ int c;

    public /* synthetic */ i7(int i) {
        this.c = i;
    }

    private final void a() {
        zd zdVar = JniAdExt.r;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    kd0 kd0Var = (kd0) tdVar.next();
                    if (kd0Var != null) {
                        jr0 jr0Var = JniAdExt.L0;
                        kd0Var.n(jr0Var.f, jr0Var.g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        MainApplication mainApplication = JniAdExt.o;
        if (mainApplication != null) {
            int i = 0;
            mainApplication.r.v(false);
            x00 x00Var = mainApplication.s;
            synchronized (x00Var.b) {
                x00Var.e = false;
            }
            int i2 = mainApplication.n0;
            if (i2 == 2 || i2 == 4 || i2 == 5) {
                gi giVar = mainApplication.v;
                if (JniAdExt.h2(io.KEY_UI_NOTIFICATION_SOUND_SESS_CLOSE) == 1 && giVar != null) {
                    r71.D(mainApplication.getApplicationContext(), giVar.d());
                }
                mainApplication.K();
                MainActivity mainActivity = mainApplication.f0;
                if (mainActivity == null || Build.VERSION.SDK_INT < 26) {
                    return;
                }
                t70.Y(new bi0(mainActivity, i));
            }
        }
    }

    private final void c() {
        zd zdVar = JniAdExt.c0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    hd0 hd0Var = (hd0) tdVar.next();
                    if (hd0Var != null) {
                        hd0Var.F();
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
                JniAdExt.V1();
                return;
            case 1:
                JniAdExt.I0.post(new tb0(12));
                return;
            case 2:
                JniAdExt.I0.post(new tb0(13));
                return;
            case 3:
                try {
                    Method method = bb1.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (rw.k != null) {
                        rw.a().c();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = bb1.b;
                    Trace.endSection();
                }
            case 4:
                JniAdExt.o0.z();
                return;
            case 5:
                JniAdExt.o0.B();
                return;
            case 6:
                JniAdExt.o0.k();
                return;
            case 7:
                JniAdExt.o0.h();
                return;
            case 8:
                JniAdExt.o0.i();
                return;
            case 9:
                JniAdExt.o0.J();
                return;
            case 10:
                JniAdExt.o0.M();
                return;
            case 11:
                JniAdExt.jniOnAddressBookClose();
                return;
            case 12:
                JniAdExt.jniMonitorOnlineStates(new long[0]);
                return;
            case 13:
                JniAdExt.o0.v();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                SettingsCategoryFragment settingsCategoryFragment = JniAdExt.z;
                if (settingsCategoryFragment != null) {
                    settingsCategoryFragment.U0();
                    settingsCategoryFragment.O0();
                    settingsCategoryFragment.T0(settingsCategoryFragment.d0, settingsCategoryFragment.k0, false);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                JniAdExt.jniClearPreviousSessionProfiles();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                JniAdExt.jniSyncInstallationId();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                JniAdExt.o0.D();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                zd zdVar = JniAdExt.w;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            ii0 ii0Var = (ii0) tdVar.next();
                            if (ii0Var != null) {
                                switch (ii0Var.a) {
                                    case 0:
                                        ((MainApplication) ii0Var.b).e0.I();
                                        break;
                                    default:
                                        t70.Y(new d3(ii0Var, 23, JniAdExt.B2()));
                                        break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                JniAdExt.o0.p();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                MainApplication.v().X();
                return;
            case 21:
                a();
                return;
            case 22:
                JniAdExt.o0.r();
                return;
            case 23:
                MainApplication mainApplication = JniAdExt.E;
                if (mainApplication != null) {
                    boolean zA = mainApplication.Z.a();
                    Logging logging = mainApplication.d;
                    if (!zA) {
                        logging.e("delaying capture start");
                        return;
                    }
                    logging.e("starting capture");
                    mainApplication.g.i(2);
                    t70.Y(new ei0(mainApplication, 6));
                    return;
                }
                return;
            case 24:
                JniAdExt.m0.H();
                return;
            case 25:
                JniAdExt.m0.L();
                return;
            case 26:
                JniAdExt.m0.u();
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                JniAdExt.U1();
                return;
        }
    }
}
