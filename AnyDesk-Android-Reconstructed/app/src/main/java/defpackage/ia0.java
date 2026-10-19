package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.DismissFileManagerSystemPermissionReceiver;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.anydesk.jni.JniAdExt;
import j$.util.DesugarCollections;
import java.util.Hashtable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia0 implements Runnable {
    public final /* synthetic */ int c;

    public /* synthetic */ ia0(int i) {
        this.c = i;
    }

    private final void a() {
        zd zdVar = JniAdExt.W;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    wc0 wc0Var = (wc0) tdVar.next();
                    if (wc0Var != null) {
                        wc0Var.P();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (JniAdExt.t0) {
            Set set = JniAdExt.w0;
            JniAdExt.i = !set.isEmpty();
            set.clear();
        }
        JniAdExt.U1();
    }

    @Override // java.lang.Runnable
    public final void run() {
        gq0 gq0Var;
        Context context;
        boolean z = false;
        switch (this.c) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                x00 x00Var = MainApplication.v().s;
                if (x00Var == null) {
                    return;
                }
                x00Var.f(false);
                x00Var.g();
                zd zdVar = JniAdExt.f0;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) tdVar.next();
                            if (fileManagerFileListFragment != null) {
                                t70.Y(new b00(fileManagerFileListFragment, false, 0));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                FileManagerProgressListFragment fileManagerProgressListFragment = JniAdExt.g0;
                if (fileManagerProgressListFragment != null) {
                    t70.Y(new c(23, fileManagerProgressListFragment));
                }
                MainApplication mainApplication = JniAdExt.j0;
                if (mainApplication != null) {
                    t70.Y(new ei0(mainApplication, 5));
                    return;
                }
                return;
            case 1:
                Bitmap bitmap2 = JniAdExt.a;
                Intent intent = new Intent(JniAdExt.d, (Class<?>) MainActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("cmd", 10);
                JniAdExt.d.startActivity(intent);
                return;
            case 2:
                MainActivity mainActivity = JniAdExt.R;
                if (mainActivity != null) {
                    mainActivity.B0();
                    return;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                if (r3.d(JniAdExt.d)) {
                    return;
                }
                Hashtable hashtable = JniAdExt.C0;
                for (z80 z80Var : DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable)) {
                    if (z80Var.k) {
                        z = true;
                    } else {
                        z80Var.k = true;
                    }
                }
                if (z) {
                    return;
                }
                if (!JniAdExt.m3() && (context = (gq0Var = new gq0(JniAdExt.d)).b) != null && gq0Var.c != null) {
                    dq0 dq0Var = new dq0(context, "anydesk_headsup");
                    dq0Var.o = "anydesk_headsup";
                    dq0Var.w.icon = R.drawable.ic_notify_browse_files;
                    Context context2 = gq0Var.b;
                    Looper looper = t70.a;
                    dq0Var.q = uj.l(context2, R.color.colorPrimary);
                    dq0Var.f(JniAdExt.n1("ad.dlg.perm.all_files.title"));
                    dq0Var.e(JniAdExt.n1("ad.dlg.perm.all_files.msg"));
                    dq0Var.j(true);
                    dq0Var.d(true);
                    dq0Var.i = 1;
                    dq0Var.r = 1;
                    Intent intent2 = new Intent(gq0Var.b, (Class<?>) MainActivity.class);
                    int iS = bu0.s();
                    Context context3 = gq0Var.b;
                    int i = gq0.d;
                    PendingIntent activity = PendingIntent.getActivity(context3, iS, intent2, i);
                    dq0Var.g = activity;
                    dq0Var.a(new aq0(IconCompat.b(gq0Var.b, R.drawable.ic_notify_action_ok), JniAdExt.n1("ad.dlg.ok"), activity).a());
                    dq0Var.a(new aq0(IconCompat.b(gq0Var.b, R.drawable.ic_notify_action_disconnect), JniAdExt.n1("ad.dlg.cancel"), PendingIntent.getBroadcast(gq0Var.b, bu0.s(), new Intent(gq0Var.b, (Class<?>) DismissFileManagerSystemPermissionReceiver.class), i)).a());
                    dq0Var.k(RingtoneManager.getDefaultUri(2));
                    gq0Var.c.notify(701, dq0Var.b());
                }
                JniAdExt.o0.f();
                return;
            case 5:
                b();
                return;
            default:
                mj mjVar = JniAdExt.G;
                if (mjVar != null) {
                    ff ffVar = mjVar.n;
                    if (ffVar == null) {
                        mjVar.a.a("called onRequestStopAudioPlaybackCapture when already stopped");
                        return;
                    } else {
                        ffVar.c();
                        mjVar.n = null;
                        return;
                    }
                }
                return;
        }
    }
}
