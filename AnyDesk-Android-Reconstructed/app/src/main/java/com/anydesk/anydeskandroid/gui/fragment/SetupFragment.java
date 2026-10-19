package com.anydesk.anydeskandroid.gui.fragment;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.SetupItem;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.a41;
import defpackage.b;
import defpackage.bc;
import defpackage.ev;
import defpackage.fq0;
import defpackage.fw;
import defpackage.gq0;
import defpackage.i4;
import defpackage.io;
import defpackage.j11;
import defpackage.jl0;
import defpackage.k11;
import defpackage.lg;
import defpackage.nd0;
import defpackage.o00;
import defpackage.p;
import defpackage.pt;
import defpackage.qa;
import defpackage.r3;
import defpackage.t31;
import defpackage.t70;
import defpackage.tl0;
import defpackage.tq;
import defpackage.u31;
import defpackage.uj;
import defpackage.v31;
import defpackage.w30;
import defpackage.w31;
import defpackage.w60;
import defpackage.xt0;
import defpackage.y31;
import defpackage.y6;
import defpackage.z31;
import defpackage.z6;
import defpackage.zc1;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class SetupFragment extends z6 implements jl0, y31, w60 {
    public bc d0;
    public gq0 e0;
    public SetupItem f0;
    public SetupItem g0;
    public SetupItem h0;
    public SetupItem i0;
    public SetupItem j0;
    public SetupItem k0;
    public SetupItem l0;
    public LinearLayout m0;
    public SetupItem n0;
    public SetupItem o0;
    public SetupItem p0;
    public SetupItem q0;
    public SetupItem r0;
    public SetupItem s0;
    public SetupItem t0;
    public SetupItem u0;
    public SetupItem v0;
    public final w30 x0;
    public final w30 y0;
    public final w30 z0;
    public final Logging b0 = new Logging("SetupFragment");
    public boolean c0 = false;
    public final xt0 w0 = new xt0(this);
    public final tl0 A0 = new tl0(this, new w31(this, 3));

    public SetupFragment() {
        int i = 1;
        this.x0 = (w30) F0(new w31(this, 0), new i4(i));
        this.y0 = (w30) F0(new w31(this, i), new i4(i));
        this.z0 = (w30) F0(new w31(this, 2), new i4(i));
    }

    public static boolean R0(SetupFragment setupFragment, a41 a41Var) {
        if (Build.VERSION.SDK_INT < 33 || !uj.F(setupFragment.G0(), nd0.d[0])) {
            return false;
        }
        bc bcVar = setupFragment.d0;
        if (bcVar != null) {
            bcVar.p0(z31.V0(a41Var, 0), "SetupInfoDialog", true);
        }
        return true;
    }

    public static String T0(j11 j11Var, PackageManager packageManager) {
        long jV = t70.v(packageManager, j11Var.a);
        if (jV < 0) {
            return JniAdExt.n1("ad.about.ver.prog");
        }
        int i = (int) (jV % 100);
        long j = jV / 100;
        int i2 = (int) (j % 100);
        int i3 = (int) (j / 100);
        Locale locale = Locale.US;
        return JniAdExt.n1("ad.about.ver.prog") + " " + i3 + "." + i2 + "." + i;
    }

    @Override // defpackage.w60
    public final void C(int i, boolean z) {
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        this.d0 = new bc(Z(), 19);
        this.e0 = new gq0(a0());
        qa qaVarG0 = G0();
        qaVarG0.setTitle(JniAdExt.n1("ad.menu.setup"));
        qaVarG0.O(this, this);
        ImageView imageView = (ImageView) view.findViewById(R.id.setup_preamble_info_icon);
        TextView textView = (TextView) view.findViewById(R.id.setup_preamble);
        TextView textView2 = (TextView) view.findViewById(R.id.setup_general_title);
        this.f0 = (SetupItem) view.findViewById(R.id.setup_general_notifications_item);
        this.g0 = (SetupItem) view.findViewById(R.id.setup_general_notifications_channel_bg_item);
        this.h0 = (SetupItem) view.findViewById(R.id.setup_general_notifications_channel_hu_item);
        this.i0 = (SetupItem) view.findViewById(R.id.setup_general_notifications_channel_chat_item);
        this.j0 = (SetupItem) view.findViewById(R.id.setup_general_file_access_item);
        this.k0 = (SetupItem) view.findViewById(R.id.setup_general_local_network_item);
        this.l0 = (SetupItem) view.findViewById(R.id.setup_general_battery_item);
        this.m0 = (LinearLayout) view.findViewById(R.id.setup_incoming_wrapper);
        TextView textView3 = (TextView) view.findViewById(R.id.setup_incoming_title);
        this.n0 = (SetupItem) view.findViewById(R.id.setup_incoming_ad1_plugin_install_item);
        this.o0 = (SetupItem) view.findViewById(R.id.setup_incoming_ad1_plugin_update_item);
        this.p0 = (SetupItem) view.findViewById(R.id.setup_incoming_ad1_plugin_battery_item);
        this.q0 = (SetupItem) view.findViewById(R.id.setup_incoming_ad1_plugin_nonpersonal_profile_item);
        this.r0 = (SetupItem) view.findViewById(R.id.setup_incoming_manufacturer_plugin_install_item);
        this.s0 = (SetupItem) view.findViewById(R.id.setup_incoming_manufacturer_plugin_update_item);
        this.t0 = (SetupItem) view.findViewById(R.id.setup_incoming_manufacturer_plugin_battery_item);
        this.u0 = (SetupItem) view.findViewById(R.id.setup_incoming_overlay_item);
        this.v0 = (SetupItem) view.findViewById(R.id.setup_incoming_microphone_item);
        r3.F(textView, lg.c().e(JniAdExt.n1("ad.setup.preamble")));
        r3.H(imageView, JniAdExt.n1("ad.dlg.more_info.needs_review_by_legal.android"));
        r3.F(textView2, JniAdExt.n1("ad.cfg.connection.general"));
        this.f0.setTitle(JniAdExt.n1("ad.setup.notifications.title"));
        this.f0.setDescription(t70.a() ? JniAdExt.n1("ad.setup.notifications.description.short") : JniAdExt.n1("ad.setup.notifications.description"));
        this.g0.setTitle(JniAdExt.n1("ad.setup.notifications.background.title"));
        this.g0.setDescription(JniAdExt.n1("ad.setup.notifications.background.description"));
        this.h0.setTitle(JniAdExt.n1("ad.setup.notifications.headsup.title"));
        this.h0.setDescription(JniAdExt.n1("ad.setup.notifications.headsup.description"));
        this.i0.setTitle(JniAdExt.n1("ad.setup.notifications.chat.title"));
        this.i0.setDescription(JniAdExt.n1("ad.setup.notifications.chat.description"));
        this.j0.setTitle(JniAdExt.n1("ad.setup.file_access.title"));
        this.j0.setDescription(JniAdExt.n1("ad.setup.file_access.description"));
        this.k0.setTitle(JniAdExt.n1("ad.setup.local_network.title"));
        this.k0.setDescription(JniAdExt.n1("ad.setup.local_network.description"));
        this.l0.setTitle(JniAdExt.n1("ad.setup.battery_opt.title"));
        this.l0.setDescription(JniAdExt.n1("ad.setup.battery_opt.description.app"));
        r3.F(textView3, JniAdExt.n1("ad.setup.incoming.title"));
        this.n0.setTitle(JniAdExt.n1("ad.menu.plugin").concat(" AD1"));
        this.n0.setDescription(JniAdExt.n1("ad.setup.plugin.generic.description"));
        this.q0.setTitle(JniAdExt.n1("ad.setup.plugin.generic.nonpersonalprofile.title"));
        this.q0.setDescription(JniAdExt.n1("ad.setup.plugin.generic.nonpersonalprofile.description"));
        this.p0.setTitle(JniAdExt.n1("ad.setup.battery_opt.title"));
        this.p0.setDescription(JniAdExt.n1("ad.setup.battery_opt.description.plugin"));
        this.r0.setDescription(JniAdExt.n1("ad.setup.plugin.manufacturer.description"));
        this.t0.setTitle(JniAdExt.n1("ad.setup.battery_opt.title"));
        this.t0.setDescription(JniAdExt.n1("ad.setup.battery_opt.description.plugin"));
        this.u0.setTitle(JniAdExt.n1("ad.setup.overlay.title"));
        this.v0.setTitle(JniAdExt.n1("ad.setup.microphone.title"));
        this.v0.setDescription(JniAdExt.n1("ad.setup.microphone.description"));
        int i = 0;
        r3.I(this.g0, t70.a() ? 0 : 8);
        r3.I(this.h0, t70.a() ? 0 : 8);
        r3.I(this.i0, t70.a() ? 0 : 8);
        r3.I(this.k0, t70.K() ? 0 : 8);
        r3.I(this.l0, t70.H() ? 0 : 8);
        r3.I(this.n0, tq.a() != null ? 0 : 8);
        SetupItem setupItem = this.u0;
        int i2 = Build.VERSION.SDK_INT;
        r3.I(setupItem, i2 >= 23 ? 0 : 8);
        r3.E(imageView, new b(25, this));
        d1(this.f0, a41.c, new t31(this, 4));
        if (t70.a()) {
            d1(this.g0, a41.d, new t31(this, 5));
            d1(this.h0, a41.e, new t31(this, 6));
            d1(this.i0, a41.f, new t31(this, 7));
        }
        d1(this.j0, a41.g, new t31(this, i));
        d1(this.k0, a41.h, new t31(this, 1));
        if (t70.H()) {
            d1(this.l0, a41.i, null);
        }
        if (tq.a() != null) {
            d1(this.o0, a41.m, null);
            if (t70.H()) {
                d1(this.p0, a41.p, null);
            }
            if (this.c0) {
                d1(this.q0, a41.q, null);
            }
        }
        d1(this.s0, a41.t, null);
        if (t70.H()) {
            d1(this.t0, a41.v, null);
        }
        if (i2 >= 23) {
            d1(this.u0, a41.w, new t31(this, 2));
        }
        d1(this.v0, a41.x, new t31(this, 3));
        h1();
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.w60
    public final void Q(int i, boolean z) {
        switch (i) {
            case 10:
                c1(false);
                break;
            case 11:
                int i2 = Build.VERSION.SDK_INT;
                Logging logging = this.b0;
                if (i2 < 30) {
                    t70.T(G0(), logging, t70.m(G0()));
                } else {
                    qa qaVarG0 = G0();
                    Looper looper = t70.a;
                    t70.S(qaVarG0, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION", qaVarG0.getPackageName(), logging);
                }
                break;
            case 12:
                b1();
                break;
        }
    }

    public final void S0(a41 a41Var) {
        Boolean boolU0;
        if (a41Var == a41.c) {
            X0(false);
            return;
        }
        if (a41Var == a41.d) {
            if (t70.a()) {
                Y0("anydesk", false);
                return;
            }
            return;
        }
        if (a41Var == a41.e) {
            if (t70.a()) {
                Y0("anydesk_headsup", false);
                return;
            }
            return;
        }
        if (a41Var == a41.f) {
            if (t70.a()) {
                Y0("anydesk_chat", false);
                return;
            }
            return;
        }
        a41 a41Var2 = a41.g;
        if (a41Var == a41Var2) {
            Boolean boolU1 = U0(a41Var2);
            if (boolU1 == null) {
                return;
            }
            boolean zBooleanValue = boolU1.booleanValue();
            Logging logging = this.b0;
            if (!zBooleanValue) {
                r3.o(this, this.y0, logging);
                return;
            } else {
                if (Build.VERSION.SDK_INT < 30) {
                    t70.T(G0(), logging, t70.m(G0()));
                    return;
                }
                qa qaVarG0 = G0();
                Looper looper = t70.a;
                t70.S(qaVarG0, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION", qaVarG0.getPackageName(), logging);
                return;
            }
        }
        if (a41Var == a41.h) {
            W0();
            return;
        }
        if (a41Var == a41.i) {
            if (t70.H()) {
                V0();
                return;
            }
            return;
        }
        if (JniAdExt.L1()) {
            if (a41Var == a41.j) {
                if (tq.a() != null) {
                    MainApplication.v().S.f(a0());
                    return;
                }
                return;
            }
            if (a41Var == a41.m || a41Var == a41.l || a41Var == a41.q || a41Var == a41.k || a41Var == a41.n) {
                if (tq.a() != null) {
                    a1(a41Var);
                    return;
                }
                return;
            }
            if (a41Var == a41.p) {
                if (tq.a() == null || !t70.H()) {
                    return;
                }
                V0();
                return;
            }
            if (a41Var == a41.r) {
                MainApplication.v().S.g(a0());
                return;
            }
            if (a41Var == a41.t || a41Var == a41.s) {
                a1(a41Var);
                return;
            }
            if (a41Var == a41.v) {
                if (t70.H()) {
                    V0();
                }
            } else {
                if (a41Var == a41.w) {
                    Looper looper2 = t70.a;
                    if (Build.VERSION.SDK_INT < 23) {
                        return;
                    }
                    Z0(false);
                    return;
                }
                a41 a41Var3 = a41.x;
                if (a41Var != a41Var3 || (boolU0 = U0(a41Var3)) == null) {
                    return;
                }
                if (boolU0.booleanValue()) {
                    b1();
                } else {
                    r3.m(this, new String[]{"android.permission.RECORD_AUDIO"}, this.A0.a);
                }
            }
        }
    }

    public final Boolean U0(a41 a41Var) {
        int iOrdinal = a41Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return nd0.r(G0(), this.e0, a41Var);
            }
            if (iOrdinal != 4 && iOrdinal != 5) {
                switch (iOrdinal) {
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                    case 21:
                        break;
                    default:
                        return nd0.q(a41Var);
                }
            }
        }
        return nd0.s(G0(), a41Var);
    }

    public final void V0() {
        if (t70.T(G0(), this.b0, new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS").addFlags(268435456))) {
            return;
        }
        t70.U(a0(), JniAdExt.o1("ad.menu.battery_opt_settings.android.information.href"));
    }

    public final void W0() {
        Boolean boolU0;
        if (t70.K() && (boolU0 = U0(a41.h)) != null) {
            if (boolU0.booleanValue()) {
                t70.T(G0(), this.b0, t70.m(G0()));
            } else {
                r3.l(G0(), nd0.e, this.z0);
            }
        }
    }

    public final void X0(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            qa qaVarG0 = G0();
            String[] strArr = nd0.d;
            if (!r3.c(qaVarG0, strArr)) {
                r3.l(G0(), strArr, this.x0);
                return;
            }
        }
        c1(z);
    }

    public final void Y0(String str, boolean z) {
        gq0 gq0Var;
        if (Build.VERSION.SDK_INT >= 33) {
            qa qaVarG0 = G0();
            String[] strArr = nd0.d;
            if (!r3.c(qaVarG0, strArr)) {
                r3.l(G0(), strArr, this.x0);
                return;
            }
        }
        if (!new fq0(G0()).a()) {
            c1(z);
            return;
        }
        qa qaVarG1 = G0();
        boolean zT = t70.T(qaVarG1, this.b0, t70.a() ? new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", qaVarG1.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", str).addFlags(268435456) : t70.m(qaVarG1));
        xt0 xt0Var = this.w0;
        if (!zT) {
            xt0Var.u(a0(), JniAdExt.n1("ad.setup.notifications.msg.request_failed"));
        } else if (z && (gq0Var = this.e0) != null && gq0Var.i(str)) {
            xt0Var.u(a0(), JniAdExt.n1("ad.setup.notifications.msg.request"));
        }
    }

    public final void Z0(boolean z) {
        qa qaVarG0 = G0();
        Looper looper = t70.a;
        boolean zS = t70.S(qaVarG0, "android.settings.action.MANAGE_OVERLAY_PERMISSION", "android.settings.action.MANAGE_OVERLAY_PERMISSION", qaVarG0.getPackageName(), this.b0);
        xt0 xt0Var = this.w0;
        if (!zS) {
            xt0Var.u(a0(), JniAdExt.n1("ad.msg.overlay_failed.android"));
        } else if (z && Boolean.FALSE.equals(U0(a41.w))) {
            xt0Var.u(a0(), JniAdExt.n1("ad.setup.overlay.msg.request"));
        }
    }

    public final void a1(a41 a41Var) {
        switch (a41Var.ordinal()) {
            case 8:
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                if (Boolean.FALSE.equals(U0(a41Var))) {
                    JniAdExt.y4(io.KEY_PROMINENT_DISCLOSURE_QUERY_ALL_PACKAGES_CONSENT, 1);
                    e1();
                    f1();
                    MainApplication.v().S.t();
                }
                break;
            case 9:
                MainApplication mainApplicationV = MainApplication.v();
                mainApplicationV.S.a(a0());
                break;
            case 10:
                MainApplication mainApplicationV2 = MainApplication.v();
                mainApplicationV2.S.r(a0());
                break;
            case 11:
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                t70.P(a0(), this.b0);
                break;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                MainApplication mainApplicationV3 = MainApplication.v();
                mainApplicationV3.S.u(a0());
                break;
        }
    }

    public final void b1() {
        if (t70.T(G0(), this.b0, t70.m(G0()))) {
            return;
        }
        this.w0.u(a0(), JniAdExt.n1("ad.setup.microphone.msg.request_failed"));
    }

    public final void c1(boolean z) {
        qa qaVarG0 = G0();
        boolean zT = t70.T(qaVarG0, this.b0, t70.a() ? new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", qaVarG0.getPackageName()).addFlags(268435456) : t70.m(qaVarG0));
        xt0 xt0Var = this.w0;
        if (!zT) {
            xt0Var.u(a0(), JniAdExt.n1("ad.setup.notifications.msg.request_failed"));
        } else {
            if (!z || new fq0(G0()).a()) {
                return;
            }
            xt0Var.u(a0(), JniAdExt.n1("ad.setup.notifications.msg.request"));
        }
    }

    public final void d1(SetupItem setupItem, a41 a41Var, Runnable runnable) {
        if (setupItem != null) {
            ViewGroup viewGroup = setupItem.d;
            if (viewGroup == null ? false : viewGroup.isEnabled()) {
                setupItem.setLayoutOnClickListener(new p(this, 11, a41Var));
            }
            setupItem.setStatusOnClickListener(new o00(this, runnable, a41Var, 1));
        }
    }

    public final void e1() {
        a41 a41Var;
        Boolean boolU0;
        k11 k11VarA = tq.a();
        if (k11VarA == null || (boolU0 = U0((a41Var = a41.j))) == null) {
            return;
        }
        SetupItem setupItem = this.n0;
        int i = 1;
        if (setupItem != null) {
            setupItem.setCritical(boolU0.booleanValue() || !Boolean.TRUE.equals(U0(a41.r)));
            boolean zBooleanValue = boolU0.booleanValue();
            a41 a41Var2 = a41.l;
            a41 a41Var3 = a41.n;
            v31 v31Var = null;
            if (zBooleanValue) {
                MainApplication mainApplicationV = MainApplication.v();
                if (mainApplicationV == null) {
                    a41Var = null;
                } else {
                    nd0.v(k11VarA);
                    a41Var = mainApplicationV.S.p() ? a41Var2 : a41Var3;
                }
            }
            if (!boolU0.booleanValue()) {
                setupItem.e(JniAdExt.n1("ad.setup.plugin.action.install"), false);
            } else if (a41Var == a41.k) {
                v31Var = new v31(this, 0, a41Var);
                setupItem.e(JniAdExt.n1("ad.setup.plugin.action.consent"), false);
            } else if (a41Var == a41Var2) {
                setupItem.e(JniAdExt.n1("ad.setup.plugin.action.activate"), false);
            } else if (a41Var == a41Var3) {
                setupItem.e(null, true);
            }
            setupItem.setLayoutEnabled(a41Var != a41Var3);
            d1(setupItem, a41Var, v31Var);
        }
        SetupItem setupItem2 = this.o0;
        if (setupItem2 != null) {
            setupItem2.setTitle(T0(k11VarA, G0().getApplicationContext().getPackageManager()));
            String strN1 = JniAdExt.n1("ad.setup.plugin.action.update");
            Boolean boolU1 = U0(a41.m);
            if (boolU1 != null) {
                setupItem2.e(strN1, boolU1.booleanValue());
            }
            setupItem2.setVisibility(boolU0.booleanValue() ? 0 : 8);
            if (boolU0.booleanValue() && !t70.H() && !this.c0) {
                i = 0;
            }
            setupItem2.b(i);
        }
        r3.I(this.q0, (boolU0.booleanValue() && this.c0) ? 0 : 8);
        i1(this.p0, a41.p);
        r3.I(this.p0, (boolU0.booleanValue() && t70.H()) ? 0 : 8);
    }

    public final void f1() {
        v31 v31Var;
        PackageManager packageManager = G0().getApplicationContext().getPackageManager();
        j11 j11VarB = tq.b(packageManager);
        int i = 8;
        if (j11VarB == null) {
            r3.I(this.r0, 8);
            r3.I(this.s0, 8);
            r3.I(this.t0, 8);
            return;
        }
        a41 a41Var = a41.r;
        Boolean boolU0 = U0(a41Var);
        if (boolU0 == null) {
            return;
        }
        SetupItem setupItem = this.r0;
        int i2 = 1;
        if (setupItem != null) {
            setupItem.setTitle(JniAdExt.n1("ad.menu.plugin") + " " + j11VarB.a().toUpperCase());
            setupItem.setCritical(boolU0.booleanValue() || !Boolean.TRUE.equals(U0(a41.j)));
            boolean zBooleanValue = boolU0.booleanValue();
            a41 a41Var2 = a41.s;
            if (zBooleanValue) {
                v31 v31Var2 = new v31(this, 0, a41Var2);
                String strN1 = JniAdExt.n1("ad.setup.plugin.action.consent");
                Boolean boolU1 = U0(a41Var2);
                if (boolU1 != null) {
                    setupItem.e(strN1, boolU1.booleanValue());
                }
                v31Var = v31Var2;
                a41Var = a41Var2;
            } else {
                setupItem.e(JniAdExt.n1("ad.setup.plugin.action.install"), false);
                v31Var = null;
            }
            setupItem.setLayoutEnabled(!boolU0.booleanValue() || Boolean.FALSE.equals(U0(a41Var2)));
            d1(setupItem, a41Var, v31Var);
            setupItem.setVisibility(0);
        }
        SetupItem setupItem2 = this.s0;
        if (setupItem2 != null) {
            setupItem2.setTitle(T0(j11VarB, packageManager));
            String strN2 = JniAdExt.n1("ad.setup.plugin.action.update");
            Boolean boolU2 = U0(a41.t);
            if (boolU2 != null) {
                setupItem2.e(strN2, boolU2.booleanValue());
            }
            setupItem2.setVisibility(boolU0.booleanValue() ? 0 : 8);
            if (boolU0.booleanValue() && !t70.H()) {
                i2 = 0;
            }
            setupItem2.b(i2);
        }
        i1(this.t0, a41.v);
        SetupItem setupItem3 = this.t0;
        if (boolU0.booleanValue() && t70.H()) {
            i = 0;
        }
        r3.I(setupItem3, i);
    }

    public final void g1() {
        i1(this.f0, a41.c);
        i1(this.g0, a41.d);
        i1(this.h0, a41.e);
        i1(this.i0, a41.f);
    }

    public final void h1() {
        SetupItem setupItem;
        g1();
        i1(this.j0, a41.g);
        i1(this.k0, a41.h);
        i1(this.l0, a41.i);
        boolean zL1 = JniAdExt.L1();
        r3.I(this.m0, zL1 ? 0 : 8);
        if (zL1) {
            e1();
            f1();
            Boolean boolU0 = U0(a41.w);
            if (boolU0 != null && (setupItem = this.u0) != null) {
                setupItem.d(boolU0.booleanValue());
                Looper looper = t70.a;
                setupItem.setDescription((Build.VERSION.SDK_INT < 29 || !JniAdExt.g2(io.KEY_FEATURE_UNATTENDED)) ? JniAdExt.n1("ad.setup.overlay.description") : JniAdExt.n1("ad.setup.overlay.description.uaccess"));
            }
            i1(this.v0, a41.x);
            SetupItem setupItem2 = this.v0;
            io ioVar = io.KEY_AUDIO_TRANSMIT_MODE;
            r3.I(setupItem2, (JniAdExt.p3(ioVar) && JniAdExt.h2(ioVar) == 0) ? 8 : 0);
        }
    }

    @Override // defpackage.y31
    public final void i(a41 a41Var) {
        int iOrdinal = a41Var.ordinal();
        if (iOrdinal == 6 || iOrdinal == 19 || iOrdinal == 13) {
            t70.U(a0(), JniAdExt.o1("ad.menu.battery_opt_settings.android.information.href"));
        } else {
            if (iOrdinal != 14) {
                return;
            }
            t70.U(a0(), JniAdExt.o1("ad.menu.help.android.nonpersonalprofile.href"));
        }
    }

    public final void i1(SetupItem setupItem, a41 a41Var) {
        Boolean boolU0 = U0(a41Var);
        if (boolU0 == null || setupItem == null) {
            return;
        }
        setupItem.d(boolU0.booleanValue());
    }

    @Override // defpackage.jl0
    public final boolean o(MenuItem menuItem) {
        return true;
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void p(Menu menu) {
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        final Context contextA0 = a0();
        if (contextA0 != null) {
            Looper looper = t70.a;
            fw fwVar = new fw(10);
            Logging logging = this.b0;
            zc1 zc1Var = new zc1(fwVar, logging);
            final ev evVar = new ev(25, new y6(zc1Var, new pt(logging), new pt(logging), 18));
            final int i = 0;
            Optional optionalOr = zc1Var.b(contextA0).or(new Supplier() { // from class: om0
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i2 = i;
                    final Context context = contextA0;
                    final ev evVar2 = evVar;
                    switch (i2) {
                        case 0:
                            return ((zc1) ((y6) evVar2.d).d).a(context);
                        default:
                            y6 y6Var = (y6) evVar2.d;
                            return ((zc1) y6Var.d).c(context).or(new f(12, (pt) y6Var.f)).flatMap(new Function() { // from class: pm0
                                public /* synthetic */ Function andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    if (((Boolean) obj).booleanValue()) {
                                        return Optional.of(Boolean.FALSE);
                                    }
                                    Logging logging2 = ((pt) ((y6) evVar2.d).e).a;
                                    DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                                    if (devicePolicyManager == null) {
                                        logging2.h("DEVICE_POLICY_SERVICE is not available");
                                        return Optional.empty();
                                    }
                                    try {
                                        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                                        if (activeAdmins != null) {
                                            for (ComponentName componentName : activeAdmins) {
                                                if (componentName != null && devicePolicyManager.isProfileOwnerApp(componentName.getPackageName())) {
                                                    return Optional.of(Boolean.TRUE);
                                                }
                                            }
                                        }
                                        return Optional.of(Boolean.FALSE);
                                    } catch (Throwable th) {
                                        logging2.i("DEVICE_POLICY_SERVICE throws unexpectedly", th);
                                        return Optional.empty();
                                    }
                                }

                                public /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                    }
                }
            });
            final int i2 = 1;
            this.c0 = ((Boolean) optionalOr.or(new Supplier() { // from class: om0
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i3 = i2;
                    final Context context = contextA0;
                    final ev evVar2 = evVar;
                    switch (i3) {
                        case 0:
                            return ((zc1) ((y6) evVar2.d).d).a(context);
                        default:
                            y6 y6Var = (y6) evVar2.d;
                            return ((zc1) y6Var.d).c(context).or(new f(12, (pt) y6Var.f)).flatMap(new Function() { // from class: pm0
                                public /* synthetic */ Function andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    if (((Boolean) obj).booleanValue()) {
                                        return Optional.of(Boolean.FALSE);
                                    }
                                    Logging logging2 = ((pt) ((y6) evVar2.d).e).a;
                                    DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                                    if (devicePolicyManager == null) {
                                        logging2.h("DEVICE_POLICY_SERVICE is not available");
                                        return Optional.empty();
                                    }
                                    try {
                                        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                                        if (activeAdmins != null) {
                                            for (ComponentName componentName : activeAdmins) {
                                                if (componentName != null && devicePolicyManager.isProfileOwnerApp(componentName.getPackageName())) {
                                                    return Optional.of(Boolean.TRUE);
                                                }
                                            }
                                        }
                                        return Optional.of(Boolean.FALSE);
                                    } catch (Throwable th) {
                                        logging2.i("DEVICE_POLICY_SERVICE throws unexpectedly", th);
                                        return Optional.empty();
                                    }
                                }

                                public /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                    }
                }
            }).orElse(Boolean.FALSE)).booleanValue();
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_setup, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        bc bcVar = this.d0;
        if (bcVar != null) {
            bcVar.e = null;
            this.d0 = null;
        }
        gq0 gq0Var = this.e0;
        if (gq0Var != null) {
            gq0Var.b();
            this.e0 = null;
        }
        SetupItem setupItem = this.f0;
        if (setupItem != null) {
            setupItem.a();
            this.f0 = null;
        }
        SetupItem setupItem2 = this.g0;
        if (setupItem2 != null) {
            setupItem2.a();
            this.g0 = null;
        }
        SetupItem setupItem3 = this.h0;
        if (setupItem3 != null) {
            setupItem3.a();
            this.h0 = null;
        }
        SetupItem setupItem4 = this.i0;
        if (setupItem4 != null) {
            setupItem4.a();
            this.i0 = null;
        }
        SetupItem setupItem5 = this.j0;
        if (setupItem5 != null) {
            setupItem5.a();
            this.j0 = null;
        }
        SetupItem setupItem6 = this.k0;
        if (setupItem6 != null) {
            setupItem6.a();
            this.k0 = null;
        }
        SetupItem setupItem7 = this.l0;
        if (setupItem7 != null) {
            setupItem7.a();
            this.l0 = null;
        }
        SetupItem setupItem8 = this.n0;
        if (setupItem8 != null) {
            setupItem8.a();
            this.n0 = null;
        }
        SetupItem setupItem9 = this.o0;
        if (setupItem9 != null) {
            setupItem9.a();
            this.o0 = null;
        }
        SetupItem setupItem10 = this.p0;
        if (setupItem10 != null) {
            setupItem10.a();
            this.p0 = null;
        }
        SetupItem setupItem11 = this.q0;
        if (setupItem11 != null) {
            setupItem11.a();
            this.q0 = null;
        }
        SetupItem setupItem12 = this.r0;
        if (setupItem12 != null) {
            setupItem12.a();
            this.r0 = null;
        }
        SetupItem setupItem13 = this.s0;
        if (setupItem13 != null) {
            setupItem13.a();
            this.s0 = null;
        }
        SetupItem setupItem14 = this.t0;
        if (setupItem14 != null) {
            setupItem14.a();
            this.t0 = null;
        }
        SetupItem setupItem15 = this.u0;
        if (setupItem15 != null) {
            setupItem15.a();
            this.u0 = null;
        }
        SetupItem setupItem16 = this.v0;
        if (setupItem16 != null) {
            setupItem16.a();
            this.v0 = null;
        }
        this.m0 = null;
    }

    @Override // defpackage.y31
    public final void u(a41 a41Var, int i) {
        S0(a41Var);
    }

    @Override // defpackage.jl0
    public final void v(Menu menu, MenuInflater menuInflater) {
        menu.add(JniAdExt.n1("ad.about.support.log_file")).setOnMenuItemClickListener(new u31(this));
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void y(Menu menu) {
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        super.y0();
        h1();
    }
}
