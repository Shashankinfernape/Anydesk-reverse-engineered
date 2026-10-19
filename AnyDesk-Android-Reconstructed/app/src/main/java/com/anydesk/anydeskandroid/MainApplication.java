package com.anydesk.anydeskandroid;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.Log;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.CookieManager;
import com.anydesk.anydeskandroid.gui.activity.HubActivity;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.a41;
import defpackage.ai0;
import defpackage.bb;
import defpackage.bc;
import defpackage.bh;
import defpackage.bi0;
import defpackage.cd0;
import defpackage.ch;
import defpackage.cj0;
import defpackage.cp;
import defpackage.cy;
import defpackage.d00;
import defpackage.d51;
import defpackage.d6;
import defpackage.dd0;
import defpackage.dh;
import defpackage.dj;
import defpackage.ds;
import defpackage.du0;
import defpackage.dv0;
import defpackage.ec1;
import defpackage.ed0;
import defpackage.ei0;
import defpackage.el;
import defpackage.er0;
import defpackage.ev;
import defpackage.f7;
import defpackage.fb0;
import defpackage.fl;
import defpackage.gd0;
import defpackage.gf0;
import defpackage.gh;
import defpackage.gi;
import defpackage.gi0;
import defpackage.gq0;
import defpackage.h5;
import defpackage.hi0;
import defpackage.hq;
import defpackage.i7;
import defpackage.id;
import defpackage.ii0;
import defpackage.io;
import defpackage.jf;
import defpackage.ji0;
import defpackage.ki0;
import defpackage.l11;
import defpackage.la0;
import defpackage.lp;
import defpackage.m11;
import defpackage.md0;
import defpackage.mj;
import defpackage.nd0;
import defpackage.ot;
import defpackage.p90;
import defpackage.q51;
import defpackage.qa;
import defpackage.r3;
import defpackage.r71;
import defpackage.rd1;
import defpackage.rs;
import defpackage.se;
import defpackage.sf;
import defpackage.t40;
import defpackage.t70;
import defpackage.td;
import defpackage.ug;
import defpackage.v11;
import defpackage.vg;
import defpackage.vy0;
import defpackage.wx;
import defpackage.x00;
import defpackage.xx;
import defpackage.y6;
import defpackage.y7;
import defpackage.y90;
import defpackage.yg;
import defpackage.yw0;
import defpackage.z80;
import defpackage.za;
import defpackage.zd;
import defpackage.zx;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class MainApplication extends Application implements cd0, ed0, gd0, dd0, md0, Application.ActivityLifecycleCallbacks, rs {
    public static final /* synthetic */ int p0 = 0;
    public static MainApplication q0;
    public static final Object r0 = new Object();
    public String A;
    public String B;
    public int D;
    public String H;
    public wx S;
    public SharedPreferences T;
    public yw0 U;
    public MainFragment X;
    public gq0 Y;
    public m11 Z;
    public String c;
    public Bitmap d0;
    public MainActivity e;
    public y6 e0;
    public MainActivity f;
    public MainActivity f0;
    public mj g;
    public HubActivity g0;
    public dj h;
    public bc h0;
    public byte[] i;
    public String j;
    public int k;
    public boolean l;
    public String n;
    public String o;
    public String p;
    public ev q;
    public lp r;
    public x00 s;
    public cj0 u;
    public gi v;
    public h5 w;
    public byte[] x;
    public String y;
    public final Logging d = new Logging("MainApplication");
    public int n0 = 1;
    public int o0 = 1;
    public long m = 0;
    public final Hashtable t = new Hashtable();
    public long z = 0;
    public boolean C = false;
    public boolean E = false;
    public int F = 0;
    public boolean G = false;
    public boolean I = false;
    public boolean J = false;
    public int K = 0;
    public Intent L = null;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public long P = 0;
    public final HashSet Q = new HashSet();
    public final HashSet R = new HashSet();
    public final zd V = new zd(0);
    public final zd W = new zd(0);
    public boolean a0 = false;
    public boolean b0 = false;
    public boolean c0 = false;
    public final hi0 i0 = new hi0(this);
    public final ii0 j0 = new ii0(0, this);
    public final ev k0 = new ev(16, this);
    public final vy0 l0 = new vy0(new ei0(this, 0));
    public final ei0 m0 = new ei0(this, 2);

    public static void f(MainApplication mainApplication) {
        z80 z80Var;
        if (mainApplication.Z.a()) {
            gq0 gq0Var = mainApplication.Y;
            ev evVar = mainApplication.q;
            boolean z = mainApplication.G;
            gq0Var.getClass();
            synchronized (evVar) {
                z80Var = (z80) evVar.d;
            }
            if (z80Var == null) {
                return;
            }
            Notification notificationE = gq0Var.e(gq0Var.b, z80Var.a, z80Var.f, z80Var.b, z80Var.c, z80Var.e, z80Var.d, z80Var.g, z80Var.h, z);
            NotificationManager notificationManager = gq0Var.c;
            if (notificationManager != null) {
                notificationManager.notify(200, notificationE);
            }
        }
    }

    public static void q(Context context) {
        String strT = t(context);
        String strW = w(context);
        StringBuilder sb = new StringBuilder();
        sb.append(w(context));
        String strM = q51.m(sb, File.separator, "recordings");
        String strY = y(context);
        String strZ = z(context);
        try {
            new File(strT).mkdirs();
        } catch (Throwable unused) {
        }
        try {
            new File(strW).mkdirs();
        } catch (Throwable unused2) {
        }
        try {
            new File(strM).mkdirs();
        } catch (Throwable unused3) {
        }
        try {
            new File(strY).mkdirs();
        } catch (Throwable unused4) {
        }
        try {
            new File(strZ).mkdirs();
        } catch (Throwable unused5) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            ArrayList arrayListX = x(context);
            int size = arrayListX.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListX.get(i);
                i++;
                File fileS = s(id.b(obj));
                if (fileS != null) {
                    try {
                        new File(fileS.getAbsolutePath()).mkdirs();
                    } catch (Throwable unused6) {
                    }
                }
            }
        }
    }

    public static File s(StorageVolume storageVolume) {
        if (Build.VERSION.SDK_INT >= 30) {
            if (storageVolume == null) {
                return null;
            }
            return storageVolume.getDirectory();
        }
        if (storageVolume != null) {
            String state = storageVolume.getState();
            state.getClass();
            if (state.equals("mounted") || state.equals("mounted_ro")) {
                try {
                    Field declaredField = storageVolume.getClass().getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    return (File) declaredField.get(storageVolume);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static String t(Context context) {
        if (er0.f()) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            return q51.m(sb, File.separator, "downloads");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        return q51.m(sb2, File.separator, "AnyDesk");
    }

    public static MainApplication v() {
        MainApplication mainApplication;
        synchronized (r0) {
            mainApplication = q0;
        }
        return mainApplication;
    }

    public static String w(Context context) {
        if (er0.f()) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            return q51.m(sb, File.separator, "storage");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        return q51.m(sb2, File.separator, "AnyDesk");
    }

    public static ArrayList x(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 24) {
            return new ArrayList();
        }
        List<StorageVolume> storageVolumes = ((StorageManager) context.getSystemService("storage")).getStorageVolumes();
        Iterator<StorageVolume> it = storageVolumes.iterator();
        while (it.hasNext()) {
            StorageVolume storageVolumeB = id.b(it.next());
            if (storageVolumeB == null || storageVolumeB.isPrimary()) {
                it.remove();
            }
        }
        return new ArrayList(storageVolumes);
    }

    public static String y(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(w(context));
        return q51.m(sb, File.separator, "tmp_content");
    }

    public static String z(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            context = context.getApplicationContext().createDeviceProtectedStorageContext();
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("storage");
        sb.append(sb2.toString());
        sb.append(str);
        sb.append("tmp_native");
        return sb.toString();
    }

    public final boolean A() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new y6(new yg((ContextWrapper) this)).h(32783) == 0;
        }
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardSecure() || new y6(new yg((ContextWrapper) this)).h(255) == 0;
    }

    public final void B(int i, v11 v11Var) {
        MainActivity mainActivity = this.f0;
        if (mainActivity == null) {
            return;
        }
        if (y90.s(JniAdExt.h2(io.KEY_SETTINGS_PROTECTION)) == 1) {
            mainActivity.q0(i, v11Var);
            return;
        }
        Logging logging = this.d;
        logging.e("settings are protected");
        if (A()) {
            R(null, new y7(this, i, v11Var));
        } else {
            logging.e("device is not configured for auth - opening settings");
            mainActivity.q0(i, v11Var);
        }
    }

    public final boolean C() {
        boolean z;
        SharedPreferences sharedPreferences = this.T;
        if (JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_PRIVACY_POLICY) == 1) {
            if (sharedPreferences != null) {
                Looper looper = t70.a;
                try {
                    z = sharedPreferences.getBoolean("privacy_statement_shown", false);
                } catch (Throwable unused) {
                    z = false;
                }
                if (!z) {
                }
            }
            return true;
        }
        return false;
    }

    public final void D() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 24) {
            this.c = getApplicationContext().createDeviceProtectedStorageContext().getFilesDir().getAbsolutePath();
        } else {
            this.c = getApplicationContext().getFilesDir().getAbsolutePath();
        }
    }

    public final void E(Class cls) {
        m11 m11Var = this.Z;
        synchronized (m11Var.d) {
            try {
                l11 l11Var = (l11) m11Var.e.get(cls);
                if (l11Var != null) {
                    l11Var.e = true;
                } else {
                    m11Var.a.a("unexpected destroy for ".concat(cls.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(Class cls) {
        m11 m11Var = this.Z;
        synchronized (m11Var.d) {
            try {
                l11 l11Var = (l11) m11Var.e.get(cls);
                if (l11Var != null) {
                    l11Var.c = true;
                } else {
                    m11Var.a.a("unexpected start for ".concat(cls.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cls == IncomingConnectionService.class && this.g.c() == 1 && this.o0 == 2 && !this.G) {
            this.d.e("starting capture delayed");
            this.g.i(2);
            t70.Y(new ei0(this, 6));
            U(true);
            JniAdExt.I0.post(new la0(this.D, 19));
        }
    }

    public final void G(z80 z80Var) {
        Uri uri;
        gi giVar = this.v;
        if (JniAdExt.h2(io.KEY_UI_NOTIFICATION_SOUND_INCOMING_CONN_REQUEST) == 1 && giVar != null) {
            synchronized (giVar) {
                uri = (Uri) giVar.b;
            }
            r71.D(getApplicationContext(), uri);
        }
        this.O = this.N;
        int i = 3;
        if (hq.p(JniAdExt.h2(io.KEY_INTERACTIVE_ACCESS)) == 1 || !this.Q.isEmpty()) {
            T(3);
        }
        q(getApplicationContext());
        this.S.b();
        int i2 = z80Var.h.c;
        boolean z = (i2 & 2) == 2;
        boolean z2 = (i2 & 1) == 1;
        if (r3.d(getApplicationContext()) || !z || z2) {
            return;
        }
        MainActivity mainActivity = this.f;
        if (mainActivity != null) {
            t70.Y(new ai0(mainActivity, i));
        } else {
            T(4);
        }
    }

    @Override // defpackage.md0
    public final void H() {
        o();
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        K();
    }

    public final void J(z80 z80Var, boolean z) {
        MainActivity mainActivity;
        gi giVar = this.v;
        int i = 1;
        if (JniAdExt.h2(io.KEY_UI_NOTIFICATION_SOUND_SESS_CREATE) == 1 && giVar != null) {
            r71.D(getApplicationContext(), giVar.e());
        }
        long j = z80Var.b;
        HashSet hashSet = this.R;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(Long.valueOf(j));
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sb.append(t70.g(((Long) it.next()).longValue()));
            sb.append(",");
        }
        SharedPreferences sharedPreferences = this.T;
        String string = sb.toString();
        Looper looper = t70.a;
        sharedPreferences.edit().putString("incoming_cids", string).commit();
        if (zIsEmpty) {
            try {
                Intent intent = new Intent();
                intent.setAction("com.anydesk.anydeskandroid.BROADCAST_HAD_INCOMING_CONNECTION");
                sendBroadcast(intent, "com.anydesk.anydeskandroid.permission.RECEIVE_HAD_INCOMING_CONNECTION");
            } catch (Throwable th) {
                q51.o(th, new StringBuilder("cannot broadcast: "), this.d);
            }
        }
        this.P = SystemClock.uptimeMillis();
        this.D = z80Var.a;
        this.x = z80Var.g;
        this.z = z80Var.b;
        this.A = z80Var.c;
        this.B = z80Var.d;
        this.C = z80Var.e;
        this.y = z80Var.f;
        this.E = false;
        this.F = 0;
        this.u.l(8);
        this.o0 = q51.c(z80Var.h);
        this.q.p(z80Var);
        if (this.o0 == 2) {
            M(z);
        } else {
            V();
        }
        synchronized (this.W) {
            try {
                zd zdVar = this.W;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    ji0 ji0Var = (ji0) tdVar.next();
                    if (ji0Var != null) {
                        ji0Var.E();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.O && this.o0 == 2 && this.g.c() == 3 && (mainActivity = this.f0) != null) {
            t70.Y(new ai0(mainActivity, i));
        }
    }

    public final void K() {
        this.Z.c(ConnectionService.class);
        Looper looper = t70.a;
        this.P = SystemClock.uptimeMillis();
        this.n0 = 1;
        if (this.o0 == 1) {
            X();
        }
        synchronized (this.V) {
            try {
                zd zdVar = this.V;
                zdVar.getClass();
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    ki0 ki0Var = (ki0) tdVar.next();
                    if (ki0Var != null) {
                        ki0Var.G();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.r.a();
        this.s.e();
        t70.V(new ei0(this, 3));
        Bitmap bitmap = JniAdExt.a;
        t70.V(new i7(22));
        gq0 gq0Var = this.Y;
        if (gq0Var != null) {
            NotificationManager notificationManager = gq0Var.c;
            if (notificationManager != null) {
                notificationManager.cancel(700);
            }
            NotificationManager notificationManager2 = gq0Var.c;
            if (notificationManager2 != null) {
                notificationManager2.cancel(101);
            }
            gq0Var.a(0);
        }
    }

    public final void L() {
        try {
            Intent intentU = t70.u(getApplicationContext());
            intentU.addFlags(268435456);
            startActivity(intentU);
        } catch (Throwable th) {
            t70.g0(getApplicationContext(), JniAdExt.n1("ad.status.file_transfer.open_failed"), 1);
            q51.o(th, new StringBuilder("cannot open download folder: "), this.d);
        }
    }

    public final void M(boolean z) {
        l();
        if ((z && this.g.c() == 3) || (Build.VERSION.SDK_INT < 34 && (this.K != 0 || this.L != null))) {
            V();
            return;
        }
        MainActivity mainActivity = this.e;
        if (mainActivity != null) {
            t70.Y(new bi0(mainActivity, 1));
        } else if (JniAdExt.i3()) {
            T(8);
        }
    }

    public final void N() {
        z80 z80Var;
        this.d.e("terminating services");
        m11 m11Var = this.Z;
        m11Var.c = true;
        Hashtable hashtable = m11Var.e;
        Iterator it = DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable).iterator();
        while (it.hasNext()) {
            m11Var.c(((l11) it.next()).a);
        }
        X();
        this.Z.c(IncomingConnectionService.class);
        this.Z.c(ConnectionService.class);
        this.Z.c(MainService.class);
        if (this.o0 != 1) {
            ev evVar = this.q;
            synchronized (evVar) {
                z80Var = (z80) evVar.d;
            }
            if (z80Var != null) {
                JniAdExt.I0.post(new cp(z80Var.a, 20));
            }
        }
        JniAdExt.V1();
        MainActivity mainActivity = this.f0;
        if (mainActivity != null) {
            mainActivity.finish();
        }
        HubActivity hubActivity = this.g0;
        if (hubActivity != null) {
            hubActivity.finish();
        }
    }

    public final void O(ji0 ji0Var) {
        synchronized (this.W) {
            this.W.remove(ji0Var);
        }
    }

    public final void P(ki0 ki0Var) {
        synchronized (this.V) {
            this.V.remove(ki0Var);
        }
    }

    public final void Q() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeSessionCookies(null);
            cookieManager.flush();
        } catch (Throwable th) {
            Logging.g(6, this.d.a, "failed to remove session cookies: ", th);
        }
    }

    public final void R(SettingsFragmentAccess settingsFragmentAccess, ot otVar) {
        dh dhVar;
        bh bhVarA;
        MainActivity mainActivity = this.f0;
        if (settingsFragmentAccess == null && mainActivity == null) {
            otVar.a(false);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Executor executorJ = i >= 28 ? d6.j(this) : new se(new Handler(getMainLooper()), 3);
        gi0 gi0Var = new gi0(this, otVar);
        if (settingsFragmentAccess == null) {
            dhVar = new dh();
            if (mainActivity == null) {
                id.q("FragmentActivity must not be null.");
                return;
            }
            if (executorJ == null) {
                id.q("Executor must not be null.");
                return;
            }
            t40 t40VarY = mainActivity.Y();
            gh ghVarA = dh.a(mainActivity);
            dhVar.d = t40VarY;
            if (ghVarA != null) {
                ghVarA.b = executorJ;
                ghVarA.c = gi0Var;
            }
        } else {
            dh dhVar2 = new dh();
            if (executorJ == null) {
                id.q("Executor must not be null.");
                return;
            }
            qa qaVarY = settingsFragmentAccess.Y();
            t40 t40VarZ = settingsFragmentAccess.Z();
            gh ghVarA2 = dh.a(qaVarY);
            if (ghVarA2 != null) {
                settingsFragmentAccess.Q.a(new ch(ghVarA2));
            }
            dhVar2.d = t40VarZ;
            if (ghVarA2 != null) {
                ghVarA2.b = executorJ;
                ghVarA2.c = gi0Var;
            }
            dhVar = dhVar2;
        }
        this.d.e("biometric auth is required for settings");
        if (i >= 30) {
            bh bhVar = new bh();
            bhVar.c = JniAdExt.n1("ad.dlg.device_auth.title");
            bhVar.d = JniAdExt.n1("ad.dlg.device_auth.msg");
            bhVar.b = 32783;
            bhVarA = bhVar.a();
        } else {
            bh bhVar2 = new bh();
            bhVar2.c = JniAdExt.n1("ad.dlg.device_auth.title");
            bhVar2.d = JniAdExt.n1("ad.dlg.device_auth.msg");
            bhVar2.a = true;
            bhVarA = bhVar2.a();
        }
        t40 t40Var = dhVar.d;
        if (t40Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (t40Var.M()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        t40 t40Var2 = dhVar.d;
        vg vgVar = (vg) t40Var2.B("androidx.biometric.BiometricFragment");
        if (vgVar == null) {
            vgVar = new vg();
            sf sfVar = new sf(t40Var2);
            sfVar.e(0, vgVar, "androidx.biometric.BiometricFragment", 1);
            sfVar.d(true);
            t40Var2.x(true);
            t40Var2.C();
        }
        qa qaVarY2 = vgVar.Y();
        if (qaVarY2 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        gh ghVar = vgVar.a0;
        ghVar.d = bhVarA;
        int i2 = bhVarA.b;
        if (i2 == 0) {
            i2 = bhVarA.a ? 255 | 32768 : 255;
        }
        if (i < 23 || i >= 30 || i2 != 15) {
            ghVar.e = null;
        } else {
            ghVar.e = ds.g();
        }
        boolean zR0 = vgVar.R0();
        gh ghVar2 = vgVar.a0;
        if (zR0) {
            ghVar2.i = vgVar.g0(R.string.confirm_device_credential_password);
        } else {
            ghVar2.i = null;
        }
        if (vgVar.R0() && new y6(new yg((ContextWrapper) qaVarY2)).h(255) != 0) {
            vgVar.a0.l = true;
            vgVar.T0();
        } else if (vgVar.a0.n) {
            vgVar.Z.postDelayed(new ug(vgVar), 600L);
        } else {
            vgVar.Y0();
        }
    }

    public final boolean S(PointF pointF) {
        mj mjVar = this.g;
        if (mjVar == null) {
            return false;
        }
        int i = mjVar.e;
        int i2 = mjVar.f;
        int i3 = mjVar.h;
        int i4 = mjVar.i;
        if (i3 <= 0 || i4 <= 0) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return true;
        }
        pointF.x = (pointF.x * i) / i3;
        pointF.y = (pointF.y * i2) / i4;
        return true;
    }

    public final boolean T(int i) {
        try {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("cmd", i);
            applicationContext.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            this.d.a("cannot send intent to MainActivity");
            return false;
        }
    }

    public final void U(boolean z) {
        this.S.a.set(z);
        this.S.s();
    }

    public final void V() {
        z80 z80Var;
        ev evVar = this.q;
        synchronized (evVar) {
            z80Var = (z80) evVar.d;
        }
        if (z80Var == null) {
            return;
        }
        m11 m11Var = this.Z;
        m11Var.getClass();
        Intent intent = new Intent(m11Var.b, (Class<?>) IncomingConnectionService.class);
        intent.putExtra("session_idx", z80Var.a);
        intent.putExtra("name", z80Var.f);
        intent.putExtra("cid", z80Var.b);
        intent.putExtra("alias", z80Var.c);
        intent.putExtra("addr", z80Var.d);
        intent.putExtra("verified", z80Var.e);
        intent.putExtra("imgdata", z80Var.g);
        intent.putExtra("features", z80Var.h);
        intent.putExtra("fgs_type", this.o0 == 2 ? 1073741856 : 1073741824);
        intent.putExtra("screen_capture_lost", this.G);
        this.Z.b(IncomingConnectionService.class, intent);
    }

    public final boolean W(Context context, String str) {
        if ("disconnect".equals(str)) {
            X();
            return false;
        }
        m11 m11Var = this.Z;
        String str2 = this.H;
        if (m11Var.c) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) AdVpnService.class);
        intent.setAction(str);
        if ("connect".equals(str)) {
            intent.putExtra("addr", str2);
        }
        return m11Var.b(AdVpnService.class, intent);
    }

    public final void X() {
        m11 m11Var = this.Z;
        synchronized (m11Var.d) {
            try {
                l11 l11Var = (l11) m11Var.e.get(AdVpnService.class);
                if (l11Var != null) {
                    l11Var.e = false;
                    Intent intent = new Intent(m11Var.b, (Class<?>) AdVpnService.class);
                    intent.setAction("disconnect");
                    try {
                        m11Var.b.startService(intent);
                    } catch (Throwable th) {
                        m11Var.a.a("cannot stop VPN service: " + th.getMessage());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y(int i, int i2) {
        fl flVar;
        cj0 cj0Var = this.u;
        synchronized (cj0Var) {
            flVar = (fl) cj0Var.i.get(Integer.valueOf(i));
        }
        if (i2 > 0) {
            this.Y.k(i, flVar, i2, this.o0, this.G, null);
            return;
        }
        el elVarB = this.u.b(i);
        if (elVarB != null) {
            this.Y.k(i, flVar, elVarB.a, this.o0, this.G, elVarB.b());
        }
    }

    public final void Z(ArrayList arrayList, String str) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z = str == null || this.n0 == 1 || this.o.equals(str);
        x00 x00Var = this.s;
        x00Var.j = z;
        if (z) {
            x00Var.k = false;
            x00Var.f(true);
            this.u.g.l(arrayList);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t70.b(this, (Uri) obj, false, UUID.randomUUID().toString() + ".tmp", this.Y, JniAdExt.n1("ad.status.file_transfer.title"), new d00(3, this));
            }
        }
    }

    @Override // defpackage.rs
    public final void a(gf0 gf0Var) {
    }

    @Override // defpackage.dd0
    public final void b(int i, boolean z) {
        gi giVar = this.v;
        if (this.o0 != 1 && JniAdExt.h2(io.KEY_UI_NOTIFICATION_SOUND_SESS_CLOSE) == 1 && giVar != null) {
            r71.D(getApplicationContext(), giVar.d());
        }
        U(true);
        this.G = false;
        this.h.k(null);
        if (i == this.D) {
            Looper looper = t70.a;
            this.P = SystemClock.uptimeMillis();
            this.o0 = 1;
            this.q.j();
            if (!z) {
                this.Z.c(IncomingConnectionService.class);
            }
            if (this.o0 == 1 && this.n0 == 1) {
                X();
            }
            synchronized (this.W) {
                try {
                    zd zdVar = this.W;
                    zdVar.getClass();
                    td tdVar = new td(zdVar);
                    while (tdVar.hasNext()) {
                        ji0 ji0Var = (ji0) tdVar.next();
                        if (ji0Var != null) {
                            ji0Var.U();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.u.i(i);
        this.u.h(i);
        this.u.a(i);
        this.t.remove(Integer.valueOf(i));
    }

    @Override // defpackage.rs
    public final void c(gf0 gf0Var) {
        this.N = true;
    }

    @Override // defpackage.rs
    public final void d(gf0 gf0Var) {
        this.M = true;
        this.N = false;
        if (JniAdExt.l != 2) {
            JniAdExt.Q3();
        }
    }

    @Override // defpackage.rs
    public final void e(gf0 gf0Var) {
    }

    @Override // defpackage.rs
    public final void g(gf0 gf0Var) {
    }

    @Override // defpackage.rs
    public final void h(gf0 gf0Var) {
    }

    public final void j(ji0 ji0Var) {
        synchronized (this.W) {
            this.W.add(ji0Var);
        }
    }

    public final void k(ki0 ki0Var) {
        synchronized (this.V) {
            this.V.add(ki0Var);
        }
    }

    public final void l() {
        Logging logging = this.d;
        logging.e("AOPM start");
        logging.e("AOPM res: " + this.S.e().d(getPackageName()));
    }

    public final boolean m() {
        z80 z80Var;
        ev evVar = this.q;
        synchronized (evVar) {
            z80Var = (z80) evVar.d;
        }
        PermissionProfile permissionProfile = z80Var == null ? null : z80Var.l;
        if (permissionProfile == null) {
            return false;
        }
        HashSet hashSet = permissionProfile.m;
        return this.o0 == 2 && hashSet.contains(du0.pf_clipboard) && hashSet.contains(du0.pf_clipboard_files);
    }

    public final void n() {
        x00 x00Var = this.s;
        x00Var.j = false;
        x00Var.k = false;
        boolean z = true;
        x00Var.f(true);
        cj0 cj0Var = this.u;
        ArrayList arrayList = (ArrayList) cj0Var.g.d();
        if (arrayList != null) {
            arrayList.clear();
            cj0Var.g.l(arrayList);
        }
        JniAdExt.I0.post(new fb0(7, z));
    }

    public final void o() {
        boolean zI3 = JniAdExt.i3();
        m11 m11Var = this.Z;
        if (!zI3) {
            m11Var.c(MainService.class);
        } else {
            m11Var.getClass();
            m11Var.b(MainService.class, new Intent(m11Var.b, (Class<?>) MainService.class));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.Q.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.c0) {
            gq0 gq0Var = this.Y;
            String str = "Setup state file access: " + nd0.s(activity, a41.g);
            Logging logging = this.d;
            logging.e(str);
            logging.e("Setup state overlay: " + nd0.s(activity, a41.w));
            logging.e("Setup state microphone: " + nd0.s(activity, a41.x));
            logging.e("Setup state battery: " + nd0.q(a41.i));
            logging.e("Setup state ad1 install: " + nd0.q(a41.j));
            logging.e("Setup state ad1 consent: " + nd0.q(a41.k));
            logging.e("Setup state ad1 update: " + nd0.q(a41.m));
            logging.e("Setup state ad1 activate: " + nd0.q(a41.l));
            logging.e("Setup state ad1 profile: " + nd0.q(a41.q));
            logging.e("Setup state ad1 battery: " + nd0.q(a41.p));
            logging.e("Setup state manufacturer plugin install: " + nd0.s(activity, a41.r));
            logging.e("Setup state manufacturer plugin consent: " + nd0.s(activity, a41.s));
            logging.e("Setup state manufacturer plugin update: " + nd0.s(activity, a41.t));
            logging.e("Setup state manufacturer plugin battery: " + nd0.s(activity, a41.v));
            logging.e("Setup state notifications: " + nd0.s(activity, a41.c));
            logging.e("Setup state notifications background: " + nd0.r(activity, gq0Var, a41.d));
            logging.e("Setup state notifications headsup: " + nd0.r(activity, gq0Var, a41.e));
            logging.e("Setup state notifications chat: " + nd0.r(activity, gq0Var, a41.f));
            this.c0 = true;
        }
        Looper looper = t70.a;
        this.P = SystemClock.uptimeMillis();
        if (Build.VERSION.SDK_INT < 26 || !activity.isInPictureInPictureMode()) {
            this.Q.add(activity);
        }
        JniAdExt.P4();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Looper looper = t70.a;
        this.P = SystemClock.uptimeMillis();
        if ((Build.VERSION.SDK_INT < 26 || !activity.isInPictureInPictureMode()) && !this.Q.remove(activity)) {
            this.d.a("trying to remove an activity that is not present: " + activity.getClass().getCanonicalName());
        }
        JniAdExt.P4();
    }

    @Override // android.app.Application
    public final void onCreate() {
        InputMethodSubtype currentInputMethodSubtype;
        String locale;
        NotificationManager notificationManager;
        boolean z;
        D();
        dv0.k.h.a(this);
        za zaVar = bb.c;
        int i = rd1.a;
        jf.i(getApplicationContext());
        PackageManager packageManager = getPackageManager();
        er0.b = (WindowManager) getSystemService("window");
        er0.f = packageManager.hasSystemFeature("amazon.hardware.fire_tv");
        er0.g = packageManager.hasSystemFeature("android.software.leanback");
        er0.e = new y6(new Logging("ServiceTool"));
        this.Z = new m11(getApplicationContext());
        int i2 = Build.VERSION.SDK_INT;
        Logging logging = this.d;
        if (i2 >= 24) {
            logging.e("using device protected storage");
            Context contextCreateDeviceProtectedStorageContext = getApplicationContext().createDeviceProtectedStorageContext();
            SharedPreferences sharedPreferencesO = ec1.o(contextCreateDeviceProtectedStorageContext);
            Looper looper = t70.a;
            try {
                z = sharedPreferencesO.getBoolean("imported_from_default_storage", false);
            } catch (Throwable unused) {
                z = false;
            }
            if (z) {
                logging.e("already imported from default storage");
            } else {
                logging.e("importing from default storage...");
                try {
                    if (!contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(getApplicationContext(), getApplicationContext().getPackageName() + "_preferences")) {
                        logging.a("failed to import prefs from default storage");
                    }
                } catch (Throwable th) {
                    q51.o(th, new StringBuilder("failed to import prefs from default storage: "), logging);
                }
                try {
                    File filesDir = contextCreateDeviceProtectedStorageContext.getFilesDir();
                    if (filesDir.exists() || filesDir.mkdirs()) {
                        File filesDir2 = getApplicationContext().getFilesDir();
                        String[] list = filesDir2.list();
                        if (list != null) {
                            for (String str : list) {
                                File file = new File(filesDir2, str);
                                if (!t70.X(file, filesDir, null)) {
                                    logging.e("failed to import files from default storage: " + file.getAbsolutePath());
                                }
                            }
                        }
                    } else {
                        logging.e("failed to import files from default storage: cannot create directory '" + filesDir.getAbsolutePath() + "'");
                    }
                } catch (Throwable th2) {
                    q51.o(th2, new StringBuilder("failed to import files from default storage: "), logging);
                }
                sharedPreferencesO = ec1.o(contextCreateDeviceProtectedStorageContext);
                t70.b0(sharedPreferencesO, "imported_from_default_storage", true);
            }
            this.T = sharedPreferencesO;
        } else {
            logging.e("using default storage");
            this.T = ec1.o(getApplicationContext());
        }
        try {
            new File(w(getApplicationContext()) + File.separator + "captured_user_image.jpg").delete();
            File[] fileArrListFiles = new File(y(getApplicationContext())).listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        this.Y = new gq0(this);
        this.Z.c(IncomingConnectionService.class);
        this.Z.c(ConnectionService.class);
        this.Z.c(MainService.class);
        X();
        gq0 gq0Var = this.Y;
        if (gq0Var != null && (notificationManager = gq0Var.c) != null) {
            notificationManager.cancelAll();
        }
        this.U = new yw0(getApplicationContext());
        JniAdExt.O = this;
        String string = "";
        int i3 = ((ActivityManager) getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
        int i4 = ((-65536) & i3) >> 16;
        int i5 = i3 & 65535;
        if (i5 > 9) {
            i5 = 9;
        }
        int i6 = (i4 * 10) + i5;
        int i7 = Build.VERSION.SDK_INT;
        String strH = jf.h(getResources());
        InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method");
        String str2 = (inputMethodManager == null || (currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype()) == null || (locale = currentInputMethodSubtype.getLocale()) == null) ? "" : locale;
        String str3 = this.c;
        String str4 = getApplicationInfo().nativeLibraryDir;
        String strZ = z(getApplicationContext());
        getApplicationContext();
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
        String strT = t(getApplicationContext());
        String strW = w(getApplicationContext());
        String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
        String absolutePath3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        int iB = er0.b();
        q(getApplicationContext());
        if (JniAdExt.G3(getApplicationContext(), str3, str4, strZ, absolutePath, strT, strW, absolutePath2, absolutePath3, i6, i7, strH, str2, iB)) {
            SharedPreferences sharedPreferences = this.T;
            io ioVar = io.KEY_AUDIO_TRANSMIT_MODE;
            if (!sharedPreferences.contains("ad.audio.transmit_mode")) {
                JniAdExt.y4(ioVar, 0);
            }
            SharedPreferences sharedPreferences2 = this.T;
            io ioVar2 = io.KEY_AUTOMATIC_KEYBOARD;
            if (!sharedPreferences2.contains("ad.image.auto_keyboard")) {
                JniAdExt.x4(ioVar2, false);
            }
            HashSet hashSet = this.R;
            hashSet.clear();
            SharedPreferences sharedPreferences3 = this.T;
            Looper looper2 = t70.a;
            try {
                string = sharedPreferences3.getString("incoming_cids", "");
            } catch (Throwable unused3) {
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    long j = Long.parseLong(strNextToken);
                    if ((Long.MIN_VALUE & j) != 0) {
                        throw new NumberFormatException();
                    }
                    hashSet.add(Long.valueOf(j));
                } catch (Throwable unused4) {
                    this.d.a("cannot parse cid " + strNextToken);
                }
            }
            JniAdExt.H1();
        }
        ev evVar = new ev(13);
        evVar.j();
        this.q = evVar;
        this.r = new lp(this.T);
        this.s = new x00(this.T);
        this.u = new cj0(this.T);
        this.v = new gi(this.T);
        this.w = new h5(this.T);
        mj mjVar = new mj(getApplicationContext());
        this.g = mjVar;
        if (mjVar.u == null) {
            mjVar.u = (MediaProjectionManager) mjVar.y.getSystemService("media_projection");
            new f7(mjVar).start();
        }
        this.g.h(this);
        dj djVar = new dj();
        djVar.c = true;
        djVar.d = null;
        this.h = djVar;
        JniAdExt.n = this;
        JniAdExt.o = this;
        JniAdExt.s1(this);
        JniAdExt.t = this;
        JniAdExt.s = this;
        JniAdExt.w1(this);
        JniAdExt.y1(this);
        JniAdExt.v1(this);
        JniAdExt.E = this;
        JniAdExt.B1(this);
        JniAdExt.j0 = this;
        registerActivityLifecycleCallbacks(this);
        this.P = SystemClock.uptimeMillis();
        this.l0.c(120000L, 120000L);
        Logging logging2 = this.d;
        String packageName = getPackageName();
        PackageManager packageManager2 = getPackageManager();
        if (packageManager2 != null) {
            Signature signatureC = d51.c(packageManager2, packageName);
            if (signatureC != null) {
                StringBuilder sbN = q51.n("AnyDesk signature: pkg='", packageName, "' ");
                sbN.append(d51.d(signatureC));
                logging2.e(sbN.toString());
            } else {
                logging2.a("AnyDesk signature: cannot get signature");
            }
            Signature signatureF = d51.f(packageManager2);
            if (signatureF != null) {
                logging2.e("System signature: " + d51.d(signatureF));
            } else {
                logging2.a("System signature: cannot get signature");
            }
            if (r3.c(getApplicationContext(), new String[]{"android.permission.INJECT_EVENTS"})) {
                this.S = new xx(getApplicationContext());
            } else if (this.U.a > 0) {
                this.S = new cy(getApplicationContext(), this.U);
            } else {
                this.S = new zx(this.k0, getApplicationContext());
            }
        }
        o();
        this.b0 = t70.W(packageManager, new Intent("android.speech.action.RECOGNIZE_SPEECH")).size() > 0;
        synchronized (r0) {
            q0 = this;
        }
        int size = JniAdExt.A2().size();
        this.u.n(size);
        if (size > 0) {
            this.u.m(true);
        }
        Logging logging3 = this.d;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Iterator<ApplicationExitInfo> it = ((ActivityManager) getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 5).iterator();
                while (it.hasNext()) {
                    logging3.e("exitInfo: " + it.next().toString());
                }
            } catch (Throwable th3) {
                logging3.e("exitInfo crashed: " + th3.getMessage());
            }
        }
        this.S.b();
        this.e0 = new y6(getApplicationContext(), 4);
        JniAdExt.C1(this.j0);
        this.e0.I();
        Q();
        Logging logging4 = this.d;
        try {
            String strX = y90.x(this, null);
            if (strX == null) {
                logging4.e("no custom tabs service found");
                return;
            }
            logging4.e("starting custom tabs service connection");
            hi0 hi0Var = this.i0;
            hi0Var.a = getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (strX.isEmpty()) {
                throw new IllegalArgumentException("Service Intents must be explicit");
            }
            intent.setPackage(strX);
            bindService(intent, hi0Var, 33);
        } catch (Throwable th4) {
            logging4.e("binding custom tabs service failed: " + th4.getMessage());
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.d.e("trim level=" + i + " mem=" + (((long) (memoryInfo.getTotalPrivateClean() + memoryInfo.getTotalPrivateDirty())) * 1024));
    }

    public final void p() {
        p90 p90VarC = this.S.c();
        if (p90VarC != null) {
            synchronized (p90VarC.h) {
                p90VarC.h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final Bitmap r() {
        byte[] bArrM2;
        if (this.d0 == null && (bArrM2 = JniAdExt.m2()) != null && bArrM2.length > 0) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM2, 0, bArrM2.length);
            int iB = (er0.b() * 32) / 160;
            this.d0 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, (bitmapDecodeByteArray.getWidth() * iB) / bitmapDecodeByteArray.getHeight(), iB, true);
        }
        return this.d0;
    }

    public final PermissionProfile u() {
        z80 z80Var;
        ev evVar = this.q;
        synchronized (evVar) {
            z80Var = (z80) evVar.d;
        }
        if (z80Var == null) {
            return null;
        }
        return z80Var.l;
    }
}
