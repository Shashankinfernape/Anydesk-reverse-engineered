package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.element.FileManagerAttrsTab;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentAudio;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentInput;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentPermissions;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVideo;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVpn;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SessionInfoFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsCategoryFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentIdentity;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d3 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public Object e;

    public d3(cf cfVar) {
        this.c = 7;
        this.d = cfVar;
        this.e = new AtomicReference(null);
    }

    private final void a() {
        lp lpVar = MainApplication.v().r;
        if (lpVar != null) {
            lpVar.I((du0) this.e, (cu0) this.d);
        }
        zd zdVar = JniAdExt.p;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    id0 id0Var = (id0) tdVar.next();
                    if (id0Var != null) {
                        id0Var.q((du0) this.e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (JniAdExt.t0) {
            try {
                int length = ((long[]) this.e).length;
                byte[] bArr = (byte[]) this.d;
                if (bArr.length < length) {
                    length = bArr.length;
                }
                for (int i = 0; i < length; i++) {
                    LruCache lruCache = JniAdExt.u0;
                    Long lValueOf = Long.valueOf(((long[]) this.e)[i]);
                    byte b = ((byte[]) this.d)[i];
                    br0 br0Var = br0.os_unknown;
                    for (br0 br0Var2 : br0.values()) {
                        if (br0Var2.c == b) {
                            br0Var = br0Var2;
                            break;
                        }
                    }
                    lruCache.put(lValueOf, br0Var);
                }
                Map mapSnapshot = JniAdExt.u0.snapshot();
                MainFragment mainFragment = JniAdExt.J;
                if (mainFragment != null) {
                    t70.Y(new d3(mainFragment, 24, mapSnapshot));
                }
                zd zdVar = JniAdExt.K;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            bd0 bd0Var = (bd0) tdVar.next();
                            if (bd0Var != null) {
                                bd0Var.M(mapSnapshot);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        int i = 0;
        while (true) {
            try {
                ((Runnable) this.e).run();
            } catch (Throwable th) {
                uj.s(kx.c, th);
            }
            try {
                Runnable runnableO = ((kf0) this.d).o();
                if (runnableO == null) {
                    return;
                }
                this.e = runnableO;
                i++;
                if (i >= 16) {
                    kf0 kf0Var = (kf0) this.d;
                    if (r71.M(kf0Var.f, kf0Var)) {
                        kf0 kf0Var2 = (kf0) this.d;
                        r71.L(kf0Var2.f, kf0Var2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                kf0 kf0Var3 = (kf0) this.d;
                synchronized (kf0Var3.i) {
                    kf0.j.decrementAndGet(kf0Var3);
                    throw th2;
                }
            }
        }
    }

    private final void d() {
        SessionInfoFragment sessionInfoFragment = (SessionInfoFragment) this.d;
        du0 du0Var = (du0) this.e;
        Map map = SessionInfoFragment.m0;
        sessionInfoFragment.Z0(du0Var);
        du0 du0Var2 = du0.pf_sysinfo;
        if (du0Var == du0Var2) {
            if (!SessionInfoFragment.U0(du0Var2)) {
                sessionInfoFragment.c0 = false;
                lp lpVar = MainApplication.v().r;
                synchronized (lpVar) {
                    lpVar.G.i(null);
                }
                return;
            }
            sessionInfoFragment.c0 = JniAdExt.h4();
            View view = sessionInfoFragment.H;
            if (view != null) {
                sessionInfoFragment.Y0(view);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l3 l3Var;
        z80 z80Var;
        PermissionProfile permissionProfile;
        l3 l3Var2;
        z80 z80Var2;
        PermissionProfile permissionProfile2;
        pk0 pk0Var;
        int i = 0;
        switch (this.c) {
            case 0:
                k3 k3Var = (k3) this.d;
                View viewFindViewById = ((View) this.e).findViewById(R.id.dialog_accept_permissions_audio_icon);
                if (!k3Var.I0) {
                    k3Var.M0.a(k3Var, !((fu0) viewFindViewById).f);
                }
                du0 du0Var = du0.pf_audio;
                if (k3Var.I0 || (l3Var = k3Var.u0) == null || (z80Var = l3Var.b) == null || (permissionProfile = z80Var.l) == null || !permissionProfile.a(du0Var, z80Var.n)) {
                    return;
                }
                z80 z80Var3 = k3Var.u0.b;
                JniAdExt.D4(z80Var3.a, du0Var, !z80Var3.l.m.contains(du0Var));
                return;
            case 1:
                du0 du0Var2 = (du0) this.e;
                k3 k3Var2 = (k3) this.d;
                if (k3Var2.I0 || (l3Var2 = k3Var2.u0) == null || (z80Var2 = l3Var2.b) == null || (permissionProfile2 = z80Var2.l) == null || !permissionProfile2.a(du0Var2, z80Var2.n)) {
                    return;
                }
                z80 z80Var4 = k3Var2.u0.b;
                JniAdExt.D4(z80Var4.a, du0Var2, !z80Var4.l.m.contains(du0Var2));
                return;
            case 2:
                r5 r5Var = (r5) this.e;
                w5 w5Var = (w5) this.d;
                rk0 rk0Var = w5Var.e;
                if (rk0Var != null && (pk0Var = rk0Var.e) != null) {
                    pk0Var.o(rk0Var);
                }
                View view = (View) w5Var.j;
                if (view != null && view.getWindowToken() != null) {
                    if (r5Var.b()) {
                        w5Var.v = r5Var;
                    } else if (r5Var.e != null) {
                        r5Var.d(0, 0, false, false);
                        w5Var.v = r5Var;
                    }
                }
                w5Var.x = null;
                return;
            case 3:
                ((g6) this.e).c = this.d;
                return;
            case 4:
                ((Application) this.e).unregisterActivityLifecycleCallbacks((g6) this.d);
                return;
            case 5:
                Object obj = this.d;
                Object obj2 = this.e;
                try {
                    Method method = h6.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        h6.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                qe qeVar = (qe) this.d;
                te teVar = (te) qeVar.g;
                if (teVar.g == qeVar.d) {
                    List list = (List) qeVar.f;
                    h7 h7Var = (h7) this.e;
                    List list2 = teVar.f;
                    teVar.e = list;
                    teVar.f = DesugarCollections.unmodifiableList(list);
                    h7Var.d(teVar.a);
                    teVar.a(list2);
                    return;
                }
                return;
            case 7:
                jn jnVar = (jn) ((AtomicReference) this.e).get();
                if (jnVar != null) {
                    Iterator it = ((cf) this.d).j.iterator();
                    while (it.hasNext()) {
                        ((z50) it.next()).h(jnVar);
                    }
                    return;
                }
                return;
            case 8:
                xt0 xt0Var = (xt0) this.e;
                Typeface typeface = (Typeface) this.d;
                uj ujVar = (uj) xt0Var.d;
                if (ujVar != null) {
                    ujVar.A(typeface);
                    return;
                }
                return;
            case 9:
                if (((du0) this.e) == du0.pf_audio) {
                    ((ConnectionSettingsFragmentAudio) this.d).O0();
                    return;
                }
                return;
            case 10:
                ConnectionSettingsFragmentInput connectionSettingsFragmentInput = (ConnectionSettingsFragmentInput) this.d;
                int iOrdinal = ((du0) this.e).ordinal();
                if (iOrdinal == 0) {
                    connectionSettingsFragmentInput.P0();
                    return;
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    connectionSettingsFragmentInput.O0();
                    return;
                }
            case 11:
                ConnectionSettingsFragmentPermissions connectionSettingsFragmentPermissions = (ConnectionSettingsFragmentPermissions) this.d;
                du0 du0Var3 = (du0) this.e;
                int iOrdinal2 = du0Var3.ordinal();
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 6) {
                        connectionSettingsFragmentPermissions.O0();
                        return;
                    } else if (iOrdinal2 != 12) {
                        return;
                    }
                }
                boolean zO3 = JniAdExt.o3();
                if (du0Var3 == du0.pf_clipboard) {
                    connectionSettingsFragmentPermissions.P0(zO3);
                }
                connectionSettingsFragmentPermissions.Q0(zO3);
                return;
            case 12:
                if (((du0) this.e) == du0.pf_privacy_feature) {
                    ((ConnectionSettingsFragmentVideo) this.d).O0();
                    return;
                }
                return;
            case 13:
                ConnectionSettingsFragmentVpn connectionSettingsFragmentVpn = (ConnectionSettingsFragmentVpn) this.d;
                String str = (String) this.e;
                TextView textView = connectionSettingsFragmentVpn.Z;
                if (textView != null) {
                    textView.setText(str);
                }
                connectionSettingsFragmentVpn.O0(JniAdExt.L0.a, JniAdExt.S2(10));
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                t40 t40Var = (t40) this.e;
                t40Var.x(true);
                t40Var.C();
                c40 c40VarB = t40Var.B((String) this.d);
                if (c40VarB != null) {
                    sf sfVar = new sf(t40Var);
                    sfVar.g(c40VarB);
                    sfVar.d(false);
                    t40Var.x(true);
                    t40Var.C();
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                ArrayList arrayList = ((v00) this.e).a;
                FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) this.d;
                CardView cardView = fileManagerFileListFragment.K0;
                boolean z = cardView != null && cardView.getVisibility() == 0;
                FileManagerAttrsTab fileManagerAttrsTab = fileManagerFileListFragment.c0 ? fileManagerFileListFragment.o0 : fileManagerFileListFragment.n0;
                if (fileManagerAttrsTab != null) {
                    i = z ? 8 : 8;
                    fileManagerAttrsTab.setVisibility(i);
                }
                fileManagerFileListFragment.k1((z && arrayList.isEmpty()) ? JniAdExt.n1("ad.file_browser.select_destination") : JniAdExt.n1("ad.file_browser.select_files"));
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                String strN1 = JniAdExt.n1("ad.status.select_files.error.msg");
                String str2 = (String) this.e;
                if (str2 != null) {
                    strN1 = strN1 + ": " + str2;
                }
                t70.g0((Context) this.d, strN1, 0);
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                String str3 = (String) this.d;
                t01 t01Var = (t01) this.e;
                if (JniAdExt.K3(t01.a(t01Var)) > 0) {
                    byte[] bArrC = nd0.c(t01Var.c);
                    JniAdExt.jniSetProfilePwd(nd0.T(str3), bArrC);
                    t70.a0(bArrC);
                } else {
                    JniAdExt.jniSetProfilePwd(nd0.T(str3), nd0.c(t01.d));
                }
                t01Var.b();
                JniAdExt.T1();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                zd zdVar = JniAdExt.r;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            kd0 kd0Var = (kd0) tdVar.next();
                            if (kd0Var != null) {
                                kd0Var.m((String) this.e, (String) this.d);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                a();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                b();
                return;
            case 21:
                c();
                return;
            case 22:
                MainFragment mainFragment = (MainFragment) ((vt) this.d).d;
                vf vfVar = mainFragment.o0;
                if (vfVar != null) {
                    if (!((Boolean) this.e).booleanValue()) {
                        vfVar.n(false);
                        return;
                    } else {
                        lk0.b(vfVar, mainFragment.g0);
                        vfVar.n(true);
                        return;
                    }
                }
                return;
            case 23:
                ((MainFragment) ((ii0) this.d).b).g1((String) this.e);
                return;
            case 24:
                Map map = (Map) this.e;
                MainFragment mainFragment2 = (MainFragment) this.d;
                cj0 cj0Var = mainFragment2.c0;
                if (cj0Var == null) {
                    return;
                }
                ArrayList arrayList2 = mainFragment2.w0;
                int size = arrayList2.size();
                boolean z2 = false;
                boolean z3 = false;
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    SpeedDialItem speedDialItem = (SpeedDialItem) obj3;
                    br0 br0Var = (br0) map.get(Long.valueOf(speedDialItem.mCid));
                    if (br0Var != null && br0Var != speedDialItem.mOnlineState) {
                        speedDialItem.mOnlineState = br0Var;
                        if (speedDialItem.mIsFavorite) {
                            z3 = true;
                        }
                        z2 = true;
                    }
                }
                ArrayList arrayList3 = mainFragment2.x0;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    nu nuVar = (nu) obj4;
                    br0 br0Var2 = (br0) map.get(Long.valueOf(nuVar.a));
                    if (br0Var2 != null && br0Var2 != nuVar.g) {
                        nuVar.g = br0Var2;
                        i = 1;
                    }
                }
                if (z2 || i != 0) {
                    int iD = cj0Var.d();
                    if (iD == 1 || ((z2 && iD == 3) || ((z3 && iD == 2) || (i != 0 && iD == 4)))) {
                        mainFragment2.H1.c();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((k30) this.e).accept(this.d);
                return;
            case 26:
                d();
                return;
            case 27:
                SettingsCategoryFragment settingsCategoryFragment = (SettingsCategoryFragment) this.d;
                int iOrdinal3 = ((v11) this.e).ordinal();
                if (iOrdinal3 == 1) {
                    settingsCategoryFragment.k0 = settingsCategoryFragment.l0;
                } else if (iOrdinal3 == 2) {
                    settingsCategoryFragment.k0 = settingsCategoryFragment.m0;
                }
                settingsCategoryFragment.O0();
                settingsCategoryFragment.T0(settingsCategoryFragment.d0, settingsCategoryFragment.k0, false);
                return;
            case 28:
                r3.F(((SettingsFragmentAccess) this.d).O0, (String) this.e);
                return;
            default:
                ((SettingsFragmentIdentity) this.d).O0((String) this.e);
                return;
        }
    }

    public /* synthetic */ d3(Object obj, Object obj2, int i, boolean z) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public /* synthetic */ d3(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }
}
