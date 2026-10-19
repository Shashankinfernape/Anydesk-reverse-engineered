package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.os.Looper;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qi implements Runnable {
    public final /* synthetic */ int c;
    public final int d;
    public final Object e;

    public qi(List list, int i, Throwable th) {
        this.c = 1;
        r71.i(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        nr0 nr0Var;
        vn0 vn0VarF;
        int i = this.c;
        int i2 = R.color.colorPrimary;
        int i3 = 0;
        switch (i) {
            case 0:
                xt0 xt0Var = (xt0) this.e;
                int i4 = this.d;
                uj ujVar = (uj) xt0Var.d;
                if (ujVar != null) {
                    ujVar.z(i4);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.e;
                int size = arrayList.size();
                if (this.d != 1) {
                    while (i3 < size) {
                        ((pw) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    return;
                } else {
                    while (i3 < size) {
                        ((pw) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
            case 2:
                zk zkVar = (zk) JniAdExt.V.get(Integer.valueOf(this.d));
                if (zkVar != null) {
                    fl flVar = (fl) this.e;
                    al alVar = zkVar.a;
                    int i5 = alVar.e + 1;
                    alVar.e = i5;
                    if (i5 > alVar.f.size()) {
                        ArrayList arrayList2 = new ArrayList(alVar.f);
                        alVar.f = arrayList2;
                        arrayList2.add(flVar);
                        alVar.g.l(DesugarCollections.unmodifiableList(alVar.f));
                        return;
                    }
                    return;
                }
                int i6 = this.d;
                fl flVar2 = (fl) this.e;
                if (JniAdExt.s2(13) != 0 && flVar2.a == 1 && flVar2.e) {
                    MainApplication mainApplicationV = MainApplication.v();
                    cj0 cj0Var = mainApplicationV.u;
                    cj0Var.a(i6);
                    synchronized (cj0Var) {
                        try {
                            vm0 vm0VarC = cj0Var.c(i6);
                            Integer num = (Integer) vm0VarC.d();
                            vm0VarC.l(Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    cj0Var.k(i6, flVar2);
                    mainApplicationV.Y(i6, mainApplicationV.u.f(i6));
                    return;
                }
                return;
            case 3:
                bc bcVar = ((MainActivity) this.e).D;
                if (bcVar == null) {
                    return;
                }
                bcVar.q0(this.d, JniAdExt.n1("ad.dlg.perm.all_files.title"), JniAdExt.n1("ad.dlg.perm.all_files.msg"), null, true, JniAdExt.n1("ad.dlg.ok"), JniAdExt.n1("ad.dlg.cancel"));
                return;
            case 4:
                MainApplication mainApplication = (MainApplication) this.e;
                gq0 gq0Var = mainApplication.Y;
                int i7 = this.d;
                if (i7 != 100) {
                    if (gq0Var == null || (context = gq0Var.b) == null || gq0Var.c == null) {
                        return;
                    }
                    dq0 dq0Var = new dq0(context, "anydesk");
                    dq0Var.o = "anydesk";
                    dq0Var.w.icon = R.drawable.ic_notify_download;
                    Looper looper = t70.a;
                    dq0Var.q = uj.l(context, R.color.colorPrimary);
                    dq0Var.f(JniAdExt.n1("ad.status.file_transfer.title"));
                    dq0Var.e(JniAdExt.n1("ad.status.file_transfer.msg.progress"));
                    dq0Var.m = 100;
                    dq0Var.n = i7;
                    dq0Var.j(true);
                    dq0Var.r = 1;
                    dq0Var.g = PendingIntent.getActivity(context, bu0.s(), t70.u(context), gq0.d | 134217728);
                    gq0Var.c.notify(101, dq0Var.b());
                    return;
                }
                if (gq0Var != null && (context2 = gq0Var.b) != null && gq0Var.c != null) {
                    dq0 dq0Var2 = new dq0(context2, "anydesk");
                    dq0Var2.o = "anydesk";
                    dq0Var2.w.icon = R.drawable.ic_notify_download;
                    Looper looper2 = t70.a;
                    dq0Var2.q = uj.l(context2, R.color.colorPrimary);
                    dq0Var2.f(JniAdExt.n1("ad.status.file_transfer.title"));
                    dq0Var2.e(JniAdExt.n1("ad.status.file_transfer.msg.finished"));
                    dq0Var2.m = 100;
                    dq0Var2.n = 100;
                    dq0Var2.j(false);
                    dq0Var2.g = PendingIntent.getActivity(context2, bu0.s(), t70.u(context2), gq0.d | 134217728);
                    dq0Var2.d(true);
                    dq0Var2.r = 1;
                    dq0Var2.i(uj.l(context2, R.color.colorPrimary));
                    dq0Var2.w.vibrate = new long[]{500, 500};
                    dq0Var2.k(RingtoneManager.getDefaultUri(2));
                    gq0Var.c.notify(101, dq0Var2.b());
                }
                t70.g0(mainApplication.getApplicationContext(), JniAdExt.n1("ad.status.file_transfer.msg.finished"), 0);
                return;
            case 5:
                MainFragment mainFragment = (MainFragment) this.e;
                if (mainFragment.a0 == null || (nr0Var = mainFragment.a1) == null) {
                    return;
                }
                if (this.d != 2) {
                    i2 = R.color.colorToolBarNotConnected;
                }
                Context contextA0 = mainFragment.a0();
                Looper looper3 = t70.a;
                int iL = uj.l(contextA0, i2);
                r3.G(nr0Var.e, iL);
                r3.G(nr0Var.f, iL);
                return;
            default:
                bo0 bo0VarP = uj.p((Activity) this.e);
                if (bo0VarP == null || (vn0VarF = bo0VarP.b.f()) == null) {
                    return;
                }
                int i8 = vn0VarF.d.a;
                int i9 = this.d;
                if (i8 != i9) {
                    bo0VarP.c(i9, null);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qi(Object obj, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    public qi(int i, fl flVar) {
        this.c = 2;
        this.d = i;
        this.e = flVar;
    }
}
