package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Looper;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ei0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainApplication d;

    public /* synthetic */ ei0(MainApplication mainApplication, int i) {
        this.c = i;
        this.d = mainApplication;
    }

    private final void a() {
        MainActivity mainActivity;
        MainApplication mainApplication = this.d;
        mj mjVar = mainApplication.g;
        if (mjVar != null) {
            int i = mainApplication.K;
            Intent intent = mainApplication.L;
            n9 n9Var = mjVar.l;
            if (n9Var != null) {
                synchronized (n9Var) {
                    n9Var.a = 0;
                    n9Var.b = 0;
                }
            }
            mjVar.k = 0;
            if (mjVar.c() == 2) {
                int i2 = 3;
                mjVar.i(3);
                mjVar.x = false;
                s7 s7Var = mjVar.v;
                if (s7Var != null) {
                    s7Var.removeMessages(q51.d(13));
                }
                try {
                    mjVar.w = mjVar.u.getMediaProjection(i, intent);
                } catch (IllegalStateException unused) {
                }
                if (s7Var != null) {
                    s7Var.post(new ij(mjVar, i2));
                }
            }
            if (mainApplication.O) {
                int i3 = 1;
                if ((mainApplication.o0 == 1 && hq.p(JniAdExt.h2(io.KEY_INTERACTIVE_ACCESS)) == 1) || (mainActivity = mainApplication.f0) == null) {
                    return;
                }
                t70.Y(new ai0(mainActivity, i3));
            }
        }
    }

    private final void b() {
        MainApplication mainApplication = this.d;
        if (mainApplication.o0 != 2) {
            return;
        }
        mainApplication.G = true;
        mainApplication.Y(0, mainApplication.u.f(0));
        int i = mainApplication.D;
        mainApplication.Y(i, mainApplication.u.f(i));
        MainApplication.f(this.d);
        this.d.U(false);
        JniAdExt.I0.post(new la0(this.d.D, 17));
        synchronized (this.d.W) {
            try {
                zd zdVar = this.d.W;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    ji0 ji0Var = (ji0) tdVar.next();
                    if (ji0Var != null) {
                        ji0Var.r();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        x00 x00Var;
        u00 u00Var;
        NotificationManager notificationManager;
        Notification notificationB;
        NotificationManager notificationManager2;
        boolean z = false;
        switch (this.c) {
            case 0:
                t70.Y(new bc0(9, this));
                return;
            case 1:
                JniAdExt.o0.j();
                gq0 gq0Var = this.d.Y;
                Context context = gq0Var.b;
                if (context == null || gq0Var.c == null) {
                    return;
                }
                dq0 dq0Var = new dq0(context, "anydesk_headsup");
                dq0Var.o = "anydesk_headsup";
                dq0Var.w.icon = R.drawable.ic_notify_warn;
                Looper looper = t70.a;
                dq0Var.q = uj.l(context, R.color.colorPrimary);
                dq0Var.f(JniAdExt.n1("ad.dlg.overlay.title"));
                dq0Var.e(JniAdExt.n1("ad.msg.overlay_permission"));
                Intent intent = new Intent(gq0Var.b, (Class<?>) MainActivity.class);
                intent.putExtra("cmd", 12);
                dq0Var.g = PendingIntent.getActivity(gq0Var.b, bu0.s(), intent, gq0.d);
                dq0Var.d(true);
                dq0Var.r = 1;
                dq0Var.i(uj.l(context, R.color.colorPrimary));
                dq0Var.w.vibrate = new long[]{500, 500};
                dq0Var.k(RingtoneManager.getDefaultUri(2));
                gq0Var.c.notify(103, dq0Var.b());
                return;
            case 2:
                MainApplication mainApplication = this.d;
                int i = MainApplication.p0;
                mainApplication.Q();
                mainApplication.d.e("terminating...");
                System.exit(0);
                return;
            case 3:
                MainApplication mainApplication2 = this.d;
                mainApplication2.u.i(0);
                mainApplication2.u.h(0);
                mainApplication2.u.a(0);
                mainApplication2.Z((ArrayList) mainApplication2.u.g.d(), null);
                return;
            case 4:
                MainApplication mainApplication3 = this.d;
                gq0 gq0Var2 = mainApplication3.Y;
                if (gq0Var2 == null || (x00Var = mainApplication3.s) == null || (u00Var = (u00) x00Var.N.d()) == null) {
                    return;
                }
                float f = u00Var.a;
                if (BigDecimal.valueOf(f).compareTo(BigDecimal.valueOf(1.0d)) >= 0 && u00Var.b == 3) {
                    z = true;
                }
                int i2 = z ? 100 : (int) (f * 100.0f);
                int i3 = gq0.d;
                Context context2 = gq0Var2.b;
                if (context2 == null || (notificationManager = gq0Var2.c) == null) {
                    return;
                }
                if (z) {
                    dq0 dq0Var2 = new dq0(context2, "anydesk");
                    dq0Var2.o = "anydesk";
                    dq0Var2.w.icon = R.drawable.ic_notify_browse_files;
                    Looper looper2 = t70.a;
                    dq0Var2.q = uj.l(context2, R.color.colorPrimary);
                    dq0Var2.f(JniAdExt.n1("ad.status.file_manager.title"));
                    dq0Var2.e(JniAdExt.n1("ad.status.file_manager.msg.finished"));
                    dq0Var2.m = 100;
                    dq0Var2.n = 100;
                    dq0Var2.r = 1;
                    dq0Var2.j(true);
                    dq0Var2.d(true);
                    Intent intent2 = new Intent(context2, (Class<?>) MainActivity.class);
                    intent2.putExtra("cmd", 7);
                    dq0Var2.g = PendingIntent.getActivity(context2, bu0.s(), intent2, i3 | 134217728);
                    dq0Var2.i(uj.l(context2, R.color.colorPrimary));
                    dq0Var2.w.vibrate = new long[]{500, 500};
                    dq0Var2.k(RingtoneManager.getDefaultUri(2));
                    notificationB = dq0Var2.b();
                } else {
                    dq0 dq0Var3 = new dq0(context2, "anydesk");
                    dq0Var3.o = "anydesk";
                    dq0Var3.w.icon = R.drawable.ic_notify_browse_files;
                    Looper looper3 = t70.a;
                    dq0Var3.q = uj.l(context2, R.color.colorPrimary);
                    dq0Var3.f(JniAdExt.n1("ad.status.file_manager.title"));
                    dq0Var3.e(JniAdExt.n1("ad.status.file_manager.msg.progress"));
                    dq0Var3.m = 100;
                    dq0Var3.n = i2;
                    dq0Var3.r = 1;
                    dq0Var3.j(true);
                    Intent intent3 = new Intent(context2, (Class<?>) MainActivity.class);
                    intent3.putExtra("cmd", 6);
                    dq0Var3.g = PendingIntent.getActivity(context2, bu0.s(), intent3, i3 | 134217728);
                    notificationB = dq0Var3.b();
                }
                notificationManager.notify(700, notificationB);
                return;
            case 5:
                gq0 gq0Var3 = this.d.Y;
                if (gq0Var3 == null || (notificationManager2 = gq0Var3.c) == null) {
                    return;
                }
                notificationManager2.cancel(700);
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            default:
                MainApplication mainApplication4 = this.d;
                if (mainApplication4.o0 != 2) {
                    return;
                }
                mainApplication4.G = false;
                mainApplication4.Y(0, mainApplication4.u.f(0));
                int i4 = mainApplication4.D;
                mainApplication4.Y(i4, mainApplication4.u.f(i4));
                MainApplication.f(this.d);
                JniAdExt.I0.post(new la0(this.d.D, 18));
                this.d.M(false);
                synchronized (this.d.W) {
                    try {
                        zd zdVar = this.d.W;
                        zdVar.getClass();
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            ji0 ji0Var = (ji0) tdVar.next();
                            if (ji0Var != null) {
                                ji0Var.T();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
