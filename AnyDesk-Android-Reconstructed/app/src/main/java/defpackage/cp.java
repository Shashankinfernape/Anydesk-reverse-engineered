package defpackage;

import android.app.NotificationManager;
import android.os.Build;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class cp implements Runnable {
    public final /* synthetic */ int c;
    public final int d;

    public cp(int i) {
        this.c = 0;
        this.d = q51.r(i);
    }

    private final void a() {
        dj djVar = JniAdExt.N;
        if (djVar != null) {
            djVar.x();
        }
        Hashtable hashtable = JniAdExt.C0;
        ArrayList arrayList = new ArrayList(DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable));
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z80 z80Var = (z80) obj;
            if (z80Var.a != this.d) {
                JniAdExt.b.e("session " + this.d + " kicks out session " + z80Var.a);
                JniAdExt.g(z80Var.a, true);
                JniAdExt.jniKickoutIncomingConnection(z80Var.a);
                z = true;
            }
        }
        NotificationManager notificationManager = new gq0(JniAdExt.d).c;
        if (notificationManager != null) {
            notificationManager.cancel(600);
        }
        JniAdExt.n0.d(this.d);
        z80 z80Var2 = (z80) JniAdExt.C0.get(Integer.valueOf(this.d));
        if (z80Var2 == null) {
            JniAdExt.jniCloseIncomingConnection(this.d);
            return;
        }
        zd zdVar = JniAdExt.C;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    gd0 gd0Var = (gd0) tdVar.next();
                    if (gd0Var != null) {
                        ((MainApplication) gd0Var).J(z80Var2, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        zl0 zl0Var;
        synchronized (JniAdExt.x0) {
            zl0Var = (zl0) JniAdExt.y0.remove(Integer.valueOf(this.d));
        }
        if (zl0Var == null || !zl0Var.a()) {
            return;
        }
        JniAdExt.Q4(false);
    }

    private final void c() {
        zl0 zl0Var;
        synchronized (JniAdExt.x0) {
            zl0Var = (zl0) JniAdExt.y0.remove(Integer.valueOf(this.d));
        }
        if (zl0Var == null || !zl0Var.a()) {
            return;
        }
        JniAdExt.Q4(false);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String strN1;
        int i2 = 9;
        int i3 = 2;
        boolean z = true;
        switch (this.c) {
            case 0:
                JniAdExt.K4(9, this.d);
                return;
            case 1:
                JniAdExt.jniSelectMonitor(this.d);
                return;
            case 2:
                ConnectionFragment connectionFragment = JniAdExt.v;
                if (connectionFragment != null) {
                    int iR = r71.r(this.d);
                    if (MainApplication.v().n0 == 2) {
                        b7 b7Var = connectionFragment.l0;
                        if (b7Var != null) {
                            b7Var.k(iR);
                        }
                        t70.Y(new yo(connectionFragment, iR, i3));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ConnectionFragment connectionFragment2 = JniAdExt.x;
                if (connectionFragment2 != null) {
                    int i4 = this.d;
                    lp lpVar = connectionFragment2.d0;
                    if (lpVar == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        int iB = lpVar.b();
                        vl0 vl0VarF = lpVar.f(iB);
                        vl0 vl0VarF2 = lpVar.f(i4);
                        if (i4 == iB || vl0VarF == null || vl0VarF2 == null || (vl0VarF2.a == vl0VarF.a && vl0VarF2.b == vl0VarF.b)) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    synchronized (lpVar) {
                        lpVar.o = i4;
                    }
                    if (z) {
                        t70.Y(new uo(connectionFragment2, 6));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (MainApplication.v().T(5)) {
                    return;
                }
                JniAdExt.P3(this.d, false);
                return;
            case 5:
                a();
                return;
            case 6:
                JniAdExt.g(this.d, false);
                return;
            case 7:
                JniAdExt.m0.w(this.d);
                return;
            case 8:
                MainApplication mainApplication = JniAdExt.s;
                if (mainApplication != null) {
                    t70.Y(new qi(mainApplication, this.d, 4));
                    return;
                }
                return;
            case 9:
                MainApplication mainApplication2 = JniAdExt.t;
                if (mainApplication2 != null) {
                    int i5 = this.d;
                    if (mainApplication2.o0 == 2 && mainApplication2.D == i5) {
                        mainApplication2.E = true;
                        mainApplication2.F = 0;
                        t70.g0(mainApplication2.getApplicationContext(), JniAdExt.n1("ad.status.tooltip.clipboard_files.backend.android"), 1);
                        MainFragment mainFragment = mainApplication2.X;
                        if (mainFragment != null) {
                            t70.Y(new xi0(i2, mainFragment));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                MainApplication mainApplication3 = JniAdExt.t;
                if (mainApplication3 != null) {
                    int i6 = this.d;
                    mainApplication3.F = i6;
                    mainApplication3.u.l(0);
                    if (i6 == 100) {
                        t70.g0(mainApplication3.getApplicationContext(), JniAdExt.n1("ad.status.file_transfer.msg.finished"), 0);
                    }
                    MainFragment mainFragment2 = mainApplication3.X;
                    if (mainFragment2 != null) {
                        t70.Y(new xi0(10, mainFragment2));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                MainActivity mainActivity = JniAdExt.S;
                if (mainActivity != null) {
                    int i7 = this.d;
                    dj djVar = mainActivity.U;
                    if (djVar != null) {
                        if (i7 >= 60) {
                            i = (i7 / 60) + 1;
                            strN1 = JniAdExt.n1("ad.status.app.status_bar.minutes");
                        } else {
                            i = i7 + 1;
                            strN1 = JniAdExt.n1("ad.status.app.status_bar.seconds");
                        }
                        r3.F((TextView) djVar.d, JniAdExt.n1("ad.banner.free.needs_review_by_legal.android") + ' ' + String.format(JniAdExt.n1("ad.banner.disconnect_countdown.needs_review_by_legal.android"), Integer.valueOf(i), strN1));
                        djVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                FileManagerFragment fileManagerFragment = JniAdExt.l0;
                if (fileManagerFragment != null) {
                    fileManagerFragment.g0.u(fileManagerFragment.a0(), hq.u(this.d));
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                JniAdExt.jniFileManagerDeleteConfirmDialogCancel(this.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                JniAdExt.jniFileManagerConflictDialogCancel(this.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                JniAdExt.jniFileManagerRemoveProgressItem(this.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                JniAdExt.jniOnAcceptSession(this.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                JniAdExt.jniOnRejectSession(this.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                JniAdExt.jniCloseIncomingConnection(this.d);
                return;
            case 21:
                JniAdExt.jniOnRemoteRestart(q51.r(this.d));
                return;
            case 22:
                JniAdExt.jniAcceptBackendFiles(this.d);
                return;
            default:
                JniAdExt.jniInjectChats(this.d);
                return;
        }
    }

    public /* synthetic */ cp(long j, int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    public /* synthetic */ cp(int i, int i2) {
        this.c = i2;
        this.d = i;
    }
}
