package com.anydesk.anydeskandroid.gui.activity;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.ConnectionService;
import com.anydesk.anydeskandroid.IncomingConnectionService;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.navigation.NavigationView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.a51;
import defpackage.ab0;
import defpackage.ai0;
import defpackage.ap;
import defpackage.az;
import defpackage.bc;
import defpackage.bc0;
import defpackage.bi0;
import defpackage.bo0;
import defpackage.bv0;
import defpackage.c0;
import defpackage.cc1;
import defpackage.cd0;
import defpackage.ci0;
import defpackage.cp0;
import defpackage.cr0;
import defpackage.cz;
import defpackage.d00;
import defpackage.d5;
import defpackage.di0;
import defpackage.dj;
import defpackage.e9;
import defpackage.ei0;
import defpackage.er0;
import defpackage.fi0;
import defpackage.fw;
import defpackage.gf;
import defpackage.gq0;
import defpackage.hd0;
import defpackage.hh0;
import defpackage.hn0;
import defpackage.hq;
import defpackage.i3;
import defpackage.i4;
import defpackage.i80;
import defpackage.i91;
import defpackage.ih0;
import defpackage.io;
import defpackage.j7;
import defpackage.jf;
import defpackage.k01;
import defpackage.l;
import defpackage.l01;
import defpackage.l4;
import defpackage.l40;
import defpackage.l80;
import defpackage.ld0;
import defpackage.lk0;
import defpackage.lz;
import defpackage.m80;
import defpackage.mn0;
import defpackage.n;
import defpackage.nd0;
import defpackage.o;
import defpackage.o4;
import defpackage.ol0;
import defpackage.p6;
import defpackage.q51;
import defpackage.qa;
import defpackage.qi;
import defpackage.r3;
import defpackage.r71;
import defpackage.r80;
import defpackage.sa1;
import defpackage.t70;
import defpackage.td;
import defpackage.th1;
import defpackage.tq;
import defpackage.uj;
import defpackage.v11;
import defpackage.vh0;
import defpackage.vn0;
import defpackage.w60;
import defpackage.wi0;
import defpackage.x2;
import defpackage.xi0;
import defpackage.xn0;
import defpackage.xt0;
import defpackage.y2;
import defpackage.yc0;
import defpackage.yt0;
import defpackage.z6;
import defpackage.z80;
import defpackage.zc0;
import defpackage.zd;
import defpackage.zh0;
import defpackage.zl0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends qa implements i80, m80, i3, k01, hh0, w60, cp0, ld0, zc0, yc0, hd0, hn0, cd0 {
    public static final zd j0 = new zd(0);
    public bc D;
    public gq0 E;
    public a51 F;
    public int J;
    public v11 K;
    public DrawerLayout L;
    public NavigationView M;
    public Toolbar N;
    public ImageView O;
    public MenuItem P;
    public MainFragment Q;
    public MainFragment R;
    public dj U;
    public ArrayList V;
    public Rect W;
    public final p6 X;
    public final p6 Y;
    public final p6 Z;
    public final p6 a0;
    public final p6 b0;
    public final p6 c0;
    public final p6 d0;
    public final p6 e0;
    public final p6 f0;
    public final l40 g0;
    public final l h0;
    public final ci0 i0;
    public final Logging C = new Logging("MainActivity");
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public final zd S = new zd(0);
    public final xt0 T = new xt0(this);

    public MainActivity() {
        dj djVar = new dj();
        djVar.d = null;
        djVar.c = false;
        this.U = djVar;
        int i = 2;
        this.X = (p6) V(new fw(25), new i4(i));
        this.Y = (p6) V(new di0(this, 0), new i4(i));
        int i2 = 1;
        this.Z = (p6) V(new di0(this, i2), new i4(i));
        this.a0 = (p6) V(new di0(this, i), new i4(i));
        this.b0 = (p6) V(new di0(this, 3), new i4(i));
        this.c0 = (p6) V(new di0(this, 4), new i4(i2));
        this.d0 = (p6) V(new di0(this, 5), new i4(i2));
        this.e0 = (p6) V(new fw(26), new i4(i2));
        this.f0 = (p6) V(new di0(this, 6), new i4(i2));
        this.g0 = new l40(this, i2);
        this.h0 = new l(13, this);
        this.i0 = new ci0();
    }

    public static Uri y0(CharSequence charSequence) {
        try {
            File fileCreateTempFile = File.createTempFile("text-", ".txt");
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(charSequence.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
            return Uri.fromFile(fileCreateTempFile);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.yc0
    public final void A(String str, String str2) {
        bc bcVar = this.D;
        if (bcVar != null) {
            o oVar = new o();
            Bundle bundle = new Bundle();
            bundle.putString("skey_title", str);
            bundle.putString("skey_msg", str2);
            oVar.N0(bundle);
            bcVar.p0(oVar, "AbookNativeMessageDialog", true);
        }
    }

    public final void A0() {
        NavigationView navigationView = this.M;
        if (navigationView == null) {
            return;
        }
        navigationView.getMenu().findItem(R.id.nav_address_book).setVisible(JniAdExt.Z1() && JniAdExt.g2(io.KEY_FEATURE_ABOOK) && JniAdExt.g2(io.KEY_FEATURE_CONNECT));
    }

    @Override // defpackage.yc0
    public final void B() {
        bc bcVar = this.D;
        if (bcVar != null) {
            o4 o4Var = new o4();
            Bundle bundle = new Bundle();
            bundle.putString("skey_num_otp", "");
            bundle.putBoolean("skey_is_in_wait_state", false);
            o4Var.N0(bundle);
            bcVar.p0(o4Var, "AccountOtpDialog", true);
        }
    }

    public final void B0() {
        boolean z = JniAdExt.h2(io.KEY_FEATURE_HUB_LOCAL) != 0;
        NavigationView navigationView = this.M;
        View childAt = navigationView != null ? navigationView.k.d.getChildAt(0) : null;
        if (childAt == null || JniAdExt.h2(io.KEY_UI_SHOW_AD1_CHECK) == 0) {
            return;
        }
        childAt.findViewById(R.id.nav_header_checkbox_frame).setVisibility(0);
        CheckBox checkBox = (CheckBox) childAt.findViewById(R.id.nav_header_ad1_checkbox);
        checkBox.setText(JniAdExt.n1("ad.titlebar.enable_anydesk_one"));
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new x2(2, this));
        ((TextView) childAt.findViewById(R.id.nav_header_experimental)).setText(JniAdExt.n1("ad.experimental"));
    }

    @Override // defpackage.w60
    public final void C(int i, boolean z) {
        MainApplication mainApplicationV = MainApplication.v();
        if (i == 3) {
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_SETUP_PROMPT, !z ? 1 : 0);
            return;
        }
        if (i == 13) {
            NotificationManager notificationManager = this.E.c;
            if (notificationManager != null) {
                notificationManager.cancel(103);
            }
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_OVERLAY_PERMISSION, !z ? 1 : 0);
            return;
        }
        if (i == 8) {
            t70.U(this, JniAdExt.o1("ad.menu.help.href"));
        } else {
            if (i != 9) {
                return;
            }
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_LANGUAGE_CHANGED, !z ? 1 : 0);
        }
    }

    @Override // defpackage.yc0
    public final void D() {
        bc bcVar;
        MainApplication.v().getClass();
        io ioVar = io.KEY_UI_ENABLE_DIALOG_LANGUAGE_CHANGED;
        if (JniAdExt.h2(ioVar) == 0 || (bcVar = this.D) == null) {
            return;
        }
        if (jf.h(getResources()).equals(JniAdExt.d2())) {
            bcVar.G(9);
        } else {
            bcVar.q0(9, JniAdExt.n1("ad.dlg.language_change.title"), JniAdExt.n1("ad.dlg.language_change.msg"), JniAdExt.n1("ad.gen.dont_show_again"), !JniAdExt.p3(ioVar), JniAdExt.n1("ad.dlg.restart"), JniAdExt.n1("ad.dlg.cancel"));
        }
    }

    @Override // defpackage.yc0
    public final void E() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.G(13);
        }
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new ai0(this, 5));
    }

    @Override // defpackage.ld0
    public final void G(int i, String str) {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.s0(i91.U0(str, i, new ArrayList()));
        }
    }

    @Override // defpackage.ld0
    public final void H() {
        bc bcVar = this.D;
        if (bcVar != null) {
            cc1 cc1Var = new cc1();
            cc1Var.N0(new Bundle());
            bcVar.s0(cc1Var);
        }
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        t70.Y(new ap(this, 3, z));
    }

    @Override // defpackage.yc0
    public final void J() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.p0(new d5(), "AccountVerificationPendingDialog", true);
        }
    }

    @Override // defpackage.ld0
    public final void L() {
        long j = MainApplication.v().m;
        String str = MainApplication.v().n;
        MainApplication mainApplicationV = MainApplication.v();
        TcpTunnelFragment.T0(this, true, j, str, t70.y(mainApplicationV.n, mainApplicationV.m, mainApplicationV.j));
    }

    @Override // defpackage.yc0
    public final void M() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.F("AccountVerificationPendingDialog");
        }
    }

    @Override // defpackage.w60
    public final void Q(int i, boolean z) {
        MainApplication mainApplicationV = MainApplication.v();
        Logging logging = this.C;
        if (i == 1) {
            if (r3.n(this, this.c0, logging)) {
                MainApplication.q(getApplicationContext());
                return;
            }
            return;
        }
        if (i == 2) {
            if (r3.n(this, this.f0, logging)) {
                MainApplication.q(getApplicationContext());
                return;
            }
            return;
        }
        if (i == 3) {
            uj.v(this, R.id.setupFragment);
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_SETUP_PROMPT, !z ? 1 : 0);
            return;
        }
        if (i == 9) {
            mainApplicationV.getClass();
            JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_LANGUAGE_CHANGED, !z ? 1 : 0);
            mainApplicationV.N();
            c0 c0Var = new c0(mainApplicationV, 12, (Object) null);
            mainApplicationV.d.e("waiting for service termination...");
            new fi0(mainApplicationV, c0Var).start();
            return;
        }
        if (i != 13) {
            return;
        }
        NotificationManager notificationManager = this.E.c;
        if (notificationManager != null) {
            notificationManager.cancel(103);
        }
        mainApplicationV.getClass();
        JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_OVERLAY_PERMISSION, !z ? 1 : 0);
        Looper looper = t70.a;
        if (t70.S(this, "android.settings.action.MANAGE_OVERLAY_PERMISSION", "android.settings.action.MANAGE_OVERLAY_PERMISSION", getPackageName(), logging)) {
            return;
        }
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.q0(13, JniAdExt.n1("ad.dlg.overlay.title"), JniAdExt.n1("ad.dlg.overlay_failed.msg"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
        } else {
            t70.g0(this, JniAdExt.n1("ad.msg.overlay_failed.android"), 1);
        }
    }

    @Override // defpackage.ld0
    public final void c(boolean z, gf gfVar) {
        bc bcVar = this.D;
        if (bcVar != null) {
            yt0 yt0Var = new yt0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("skey_passwd_supports_token", z);
            bundle.putSerializable("skey_passwd_flags", gfVar);
            yt0Var.N0(bundle);
            bcVar.s0(yt0Var);
        }
    }

    @Override // defpackage.zc0
    public final void d(int i) {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.F("AcceptDialog_" + i);
            bcVar.F("SCAM_" + i);
            bcVar.F("SCAM_LOCAL_" + i);
        }
    }

    @Override // defpackage.qa
    public final void d0() {
        super.d0();
        getWindow().getDecorView().post(new ai0(this, 2));
    }

    @Override // defpackage.qa, defpackage.bo, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zd zdVar = j0;
        synchronized (zdVar) {
            try {
                td tdVar = new td(zdVar);
                while (tdVar.hasNext()) {
                    l80 l80Var = (l80) tdVar.next();
                    if (l80Var != null && l80Var.h(keyEvent)) {
                        return true;
                    }
                }
                try {
                    return super.dispatchKeyEvent(keyEvent);
                } catch (IllegalStateException e) {
                    this.C.e("dispatchKeyEvent failed: " + e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zc0
    public final void e(z80 z80Var) {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.l0(z80Var.a, true);
            if (z80Var.j) {
                int i = z80Var.a;
                ih0 ih0Var = new ih0();
                Bundle bundle = new Bundle();
                bundle.putInt("skey_scam_local_session_idx", i);
                bundle.putLong("skey_scam_local_timer_millis", 10000L);
                bundle.putBoolean("skey_scam_local_agree", false);
                bundle.putBoolean("skey_scam_local_disable", false);
                ih0Var.N0(bundle);
                bcVar.p0(ih0Var, "SCAM_LOCAL_" + i, false);
            }
        }
    }

    @Override // defpackage.yc0
    public final void f() {
        t70.Y(new ai0(this, 3));
    }

    @Override // defpackage.yc0
    public final void g(int i, int i2, boolean z) {
        String strN1;
        String strN2;
        String str;
        String str2;
        String str3;
        String strN3;
        String strN4;
        bc bcVar = this.D;
        if (bcVar == null) {
            return;
        }
        String strN5 = JniAdExt.n1("ad.dlg.ok");
        if ((i == 0 && i2 == 1) || (i == 1 && i2 == 1)) {
            if (z) {
                strN3 = JniAdExt.n1("ad.dlg.key.remove.success.title");
                strN4 = JniAdExt.n1("ad.dlg.key.remove.success.msg");
            } else {
                strN3 = JniAdExt.n1("ad.dlg.key.success.title");
                strN4 = JniAdExt.n1("ad.dlg.key.success.msg");
            }
            str3 = null;
            str2 = strN3;
            str = strN4;
        } else {
            String strN6 = JniAdExt.n1("ad.menu.help");
            if (i == 1 && i2 == 17) {
                strN1 = JniAdExt.n1("ad.dlg.key.invalid_key.title");
                strN2 = JniAdExt.n1("ad.dlg.key.invalid_key.msg");
            } else if (i == 1 && i2 == 15) {
                strN1 = JniAdExt.n1("ad.dlg.key.client_limit.title");
                strN2 = JniAdExt.n1("ad.dlg.key.client_limit.msg");
            } else if (i == 1 && i2 == 21) {
                strN1 = JniAdExt.n1("ad.dlg.key.remove.success.title");
                strN2 = JniAdExt.n1("ad.dlg.key.remove.success.msg");
            } else if (i == 1 && i2 == 48) {
                strN1 = JniAdExt.n1("ad.dlg.key.already_registered.title");
                strN2 = JniAdExt.n1("ad.dlg.key.already_registered.msg");
            } else {
                strN1 = JniAdExt.n1("ad.register_license_feedback.dialog.error.title");
                strN2 = String.format(JniAdExt.n1("ad.register_license_feedback.dialog.error.description"), JniAdExt.o1("ad.support.email"));
            }
            str = strN2;
            str2 = strN1;
            str3 = strN6;
        }
        bcVar.q0(8, str2, str, null, true, strN5, str3);
    }

    @Override // defpackage.qa
    public final boolean g0() {
        uj.x(this);
        return true;
    }

    @Override // defpackage.yc0
    public final void h() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.q0(3, JniAdExt.n1("ad.setup.dlg.title.prompt"), JniAdExt.n1("ad.setup.dlg.msg.prompt"), JniAdExt.n1("ad.gen.dont_show_again"), !JniAdExt.p3(io.KEY_UI_ENABLE_DIALOG_SETUP_PROMPT), JniAdExt.n1("ad.dlg.ok"), JniAdExt.n1("ad.dlg.cancel"));
        }
    }

    @Override // defpackage.yc0
    public final void i() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.G(3);
        }
    }

    public final void i0(String str) {
        boolean zEquals;
        p0();
        int i = 3;
        if (!r3.d(this)) {
            t70.Y(new qi(this, 2, i));
            return;
        }
        if (r3.n(this, this.f0, this.C)) {
            MainApplication.q(getApplicationContext());
        }
        if (str == null) {
            return;
        }
        Looper looper = t70.a;
        String strReplaceAll = str.replaceAll("[\r\n\t ]", "");
        if (!JniAdExt.n3(strReplaceAll)) {
            this.T.u(this, JniAdExt.n1("ad.dlg.closed.invalid_addr.title"));
            return;
        }
        if (strReplaceAll == null || strReplaceAll.length() <= 0) {
            return;
        }
        int iR = q51.r(MainApplication.v().n0);
        if (iR != 0) {
            zEquals = (iR == 1 || iR == 3 || iR == 4) ? strReplaceAll.equals(MainApplication.v().o) : false;
        } else {
            zEquals = true;
        }
        if (zEquals) {
            Bundle bundle = new Bundle();
            bundle.putString("addr", strReplaceAll);
            uj.w(this, R.id.fileManagerFragment, bundle);
        } else {
            t70.g0(this, JniAdExt.n1("ad.msg.connect_multi.android"), 1);
            if (MainApplication.v().n0 == 4) {
                uj.v(this, R.id.fileManagerFragment);
            }
        }
    }

    @Override // defpackage.yc0
    public final void j() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.q0(13, JniAdExt.n1("ad.dlg.overlay.title"), JniAdExt.n1("ad.dlg.overlay.msg"), JniAdExt.n1("ad.gen.dont_show_again"), !JniAdExt.p3(io.KEY_UI_ENABLE_DIALOG_OVERLAY_PERMISSION), JniAdExt.n1("ad.dlg.ok"), JniAdExt.n1("ad.dlg.cancel"));
        }
    }

    public final void j0() {
        bc bcVar;
        MainApplication mainApplicationV = MainApplication.v();
        if (mainApplicationV == null || (bcVar = this.D) == null) {
            return;
        }
        if (JniAdExt.s2(2) != 0) {
            bcVar.F("LockdownDialog");
            mainApplicationV.I = false;
            return;
        }
        bo0 bo0VarP = uj.p(this);
        vn0 vn0VarF = bo0VarP == null ? null : bo0VarP.b.f();
        if (vn0VarF != null && vn0VarF.d.a != R.id.mainFragment) {
            uj.v(this, R.id.mainFragment);
        }
        if (mainApplicationV.I) {
            return;
        }
        vh0 vh0Var = new vh0();
        Bundle bundle = new Bundle();
        bundle.putLong("skey_lockdown_timer_millis", 10000L);
        bundle.putBoolean("skey_is_timer_expired", false);
        vh0Var.N0(bundle);
        vh0Var.f0 = false;
        Dialog dialog = vh0Var.k0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        bcVar.p0(vh0Var, "LockdownDialog", true);
        mainApplicationV.I = true;
    }

    @Override // defpackage.yc0
    public final void k() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.F("AccountOtpDialog");
        }
    }

    public final void k0(String str) {
        List list = (List) MainApplication.v().u.g.d();
        if (list != null && !list.isEmpty()) {
            i0(str);
            return;
        }
        p0();
        if (str == null) {
            return;
        }
        String strReplaceAll = str.replaceAll("[\r\n\t ]", "");
        if (!JniAdExt.n3(strReplaceAll)) {
            this.T.u(this, JniAdExt.n1("ad.dlg.closed.invalid_addr.title"));
            return;
        }
        if (strReplaceAll == null || strReplaceAll.length() <= 0) {
            return;
        }
        if (MainApplication.v().n0 == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("addr", strReplaceAll);
            uj.w(this, R.id.connectionFragment, bundle);
        } else {
            t70.g0(this, JniAdExt.n1("ad.msg.connect_multi.android"), 1);
            if (MainApplication.v().n0 == 2) {
                uj.v(this, R.id.connectionFragment);
            }
        }
    }

    @Override // defpackage.yc0
    public final void l(int i, int i2, long j, String str, long j2, String str2, long j3, long j4, String str3) {
        bc bcVar = this.D;
        if (bcVar != null) {
            lz lzVar = new lz();
            Bundle bundle = new Bundle();
            bundle.putInt("skey_progress_id", i);
            bundle.putInt("skey_progress_conflict_handler_id", i2);
            bundle.putLong("skey_src_write_time", j);
            bundle.putString("skey_src_name", str);
            bundle.putLong("skey_src_file_size", j2);
            bundle.putString("skey_src_file_size_str", str2);
            bundle.putLong("skey_dst_write_time", j3);
            bundle.putLong("skey_dst_file_size", j4);
            bundle.putString("skey_dst_file_size_str", str3);
            bundle.putBoolean("skey_do_check_all", false);
            lzVar.N0(bundle);
            bcVar.p0(lzVar, "FileManagerConflictDialog", true);
        }
    }

    public final void l0(String str) {
        p0();
        if (JniAdExt.g2(io.KEY_FEATURE_VPN) && str != null) {
            String strReplaceAll = str.replaceAll("[\r\n\t ]", "");
            if (!JniAdExt.n3(strReplaceAll)) {
                this.T.u(this, JniAdExt.n1("ad.dlg.closed.invalid_addr.title"));
            } else {
                if (strReplaceAll == null || strReplaceAll.length() <= 0) {
                    return;
                }
                MainApplication mainApplicationV = MainApplication.v();
                mainApplicationV.H = strReplaceAll;
                mainApplicationV.r.v(true);
                r0("connect");
            }
        }
    }

    @Override // defpackage.hn0
    public final void m(bo0 bo0Var, vn0 vn0Var, Bundle bundle) {
        p0();
    }

    public final Point m0() {
        if (Build.VERSION.SDK_INT < 30) {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            return point;
        }
        Point point2 = new Point();
        Rect bounds = getWindowManager().getCurrentWindowMetrics().getBounds();
        point2.x = bounds.width();
        point2.y = bounds.height();
        return point2;
    }

    @Override // defpackage.zc0
    public final void n(int i) {
        bc bcVar = this.D;
        if (bcVar != null) {
            l01 l01Var = new l01();
            Bundle bundle = new Bundle();
            bundle.putInt("skey_scam_session_idx", i);
            bundle.putLong("skey_scam_timer_millis", 10000L);
            l01Var.N0(bundle);
            bcVar.p0(l01Var, "SCAM_" + i, false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n0(Intent intent) {
        String strSubstring;
        NotificationManager notificationManager;
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        int i = 2;
        int i2 = 1;
        boolean z = false;
        if (extras != null) {
            int i3 = extras.getInt("cmd", 0);
            int i4 = 3;
            if (i3 != 3) {
                if (i3 == 1) {
                    k0(extras.getString("connect_addr"));
                } else if (i3 == 2) {
                    i0(extras.getString("connect_addr"));
                } else if (i3 == 4) {
                    t70.Y(new ai0(this, i4));
                } else if (i3 == 5) {
                    if (!r0("incoming")) {
                        JniAdExt.P3(MainApplication.v().D, false);
                    }
                } else if (i3 == 6) {
                    w0();
                } else if (i3 == 7) {
                    w0();
                    gq0 gq0Var = MainApplication.v().Y;
                    if (gq0Var != null && (notificationManager = gq0Var.c) != null) {
                        notificationManager.cancel(700);
                    }
                } else {
                    int i5 = 8;
                    if (i3 == 8) {
                        t70.Y(new bi0(this, i2));
                    } else if (i3 == 9) {
                        int i6 = extras.getInt("session_idx", 0);
                        bc bcVar = this.D;
                        if (bcVar != null) {
                            bcVar.o0(i6);
                        }
                    } else if (i3 == 10) {
                        uj.v(this, R.id.supportFragment);
                    } else if (i3 == 11) {
                        MainApplication mainApplicationV = MainApplication.v();
                        mainApplicationV.getClass();
                        t70.V(new ei0(mainApplicationV, i5));
                    } else if (i3 == 12) {
                        j();
                    }
                }
            }
        }
        String action = intent.getAction();
        if (action == null) {
            MainApplication.v().n();
        }
        byte b = -1;
        switch (action.hashCode()) {
            case -1173264947:
                if (action.equals("android.intent.action.SEND")) {
                    b = 0;
                }
                break;
            case -1173171990:
                if (action.equals("android.intent.action.VIEW")) {
                    b = 1;
                }
                break;
            case -58484670:
                if (action.equals("android.intent.action.SEND_MULTIPLE")) {
                    b = 2;
                }
                break;
        }
        xt0 xt0Var = this.T;
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.ID");
                Uri uri = (Uri) t70.x(intent, "android.intent.extra.STREAM");
                if (uri == null) {
                    CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
                    if (charSequenceExtra != null) {
                        Uri uriY0 = y0(charSequenceExtra);
                        if (uriY0 == null) {
                            xt0Var.u(this, JniAdExt.n1("ad.msg.share.error"));
                        } else {
                            Object[] objArr = {uriY0};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            arrayList.add(obj);
                            o0(new ArrayList(DesugarCollections.unmodifiableList(arrayList)), stringExtra);
                        }
                    } else {
                        xt0Var.u(this, JniAdExt.n1("ad.msg.share.unsupported"));
                    }
                } else {
                    Object[] objArr2 = {uri};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    o0(new ArrayList(DesugarCollections.unmodifiableList(arrayList2)), stringExtra);
                }
                break;
            case 1:
                int i7 = 4;
                Uri data = intent.getData();
                if (data != null) {
                    if (!"anydesk".equals(data.getScheme())) {
                        if ("file".equals(data.getScheme()) || "content".equals(data.getScheme())) {
                            t70.b(this, data, true, "recording.tmp", this.E, JniAdExt.n1("ad.status.select_files.replay.title"), new d00(i, this));
                        }
                        break;
                    } else {
                        String schemeSpecificPart = data.getSchemeSpecificPart();
                        if (schemeSpecificPart == null) {
                            strSubstring = null;
                        } else {
                            int i8 = 0;
                            while (i8 < schemeSpecificPart.length() && schemeSpecificPart.charAt(i8) == '/') {
                                i8++;
                            }
                            strSubstring = schemeSpecificPart.substring(i8);
                        }
                        if (strSubstring != null) {
                            int iIndexOf = strSubstring.indexOf("?");
                            String strSubstring2 = iIndexOf > 0 ? strSubstring.substring(0, iIndexOf) : strSubstring;
                            String strJ = r71.J(strSubstring, "nav/");
                            if (strJ != null) {
                                String strJ2 = r71.J(strJ, "ad/");
                                if (strJ2 == null) {
                                    String strJ3 = r71.J(strJ, "one/");
                                    if (strJ3 != null) {
                                        Intent intent2 = new Intent(this, (Class<?>) HubActivity.class);
                                        intent2.putExtra("nav", strJ3);
                                        startActivity(intent2);
                                        finish();
                                    }
                                } else {
                                    int iIndexOf2 = strJ2.indexOf("?");
                                    if (iIndexOf2 > 0) {
                                        strJ2 = strJ2.substring(0, iIndexOf2);
                                    }
                                    if ("setup".equals(strJ2)) {
                                        MainApplication.v().J = true;
                                        i();
                                        uj.v(this, R.id.setupFragment);
                                    } else if ("settings".equals(strJ2)) {
                                        uj.v(this, R.id.settingsFragment);
                                    } else if ("about".equals(strJ2)) {
                                        uj.v(this, R.id.aboutFragment);
                                    } else if ("trace".equals(strJ2)) {
                                        uj.v(this, R.id.traceFragment);
                                    } else if ("tutorial".equals(strJ2)) {
                                        uj.v(this, R.id.mainFragment);
                                        x0();
                                    }
                                }
                            } else if (!"register-license".equals(strSubstring2) && !"register-licence".equals(strSubstring2)) {
                                MainFragment mainFragment = this.Q;
                                if (mainFragment != null) {
                                    t70.Y(new wi0(mainFragment, strSubstring, 0));
                                }
                                k0(strSubstring);
                            } else if (data.isHierarchical()) {
                                JniAdExt.I0.post(new ab0(data.getQueryParameter("key"), !(data.getQueryParameter("silent") != null), i7));
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                String stringExtra2 = intent.getStringExtra("android.intent.extra.shortcut.ID");
                ArrayList arrayListW = t70.w(intent);
                if (arrayListW == null || arrayListW.isEmpty()) {
                    ArrayList<CharSequence> charSequenceArrayListExtra = intent.getCharSequenceArrayListExtra("android.intent.extra.TEXT");
                    if (charSequenceArrayListExtra == null || charSequenceArrayListExtra.isEmpty()) {
                        xt0Var.u(this, JniAdExt.n1("ad.msg.share.unsupported"));
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        int size = charSequenceArrayListExtra.size();
                        int i9 = 0;
                        while (i9 < size) {
                            CharSequence charSequence = charSequenceArrayListExtra.get(i9);
                            i9++;
                            Uri uriY1 = y0(charSequence);
                            if (uriY1 != null) {
                                arrayList3.add(uriY1);
                            } else {
                                z = true;
                            }
                        }
                        if (z) {
                            xt0Var.u(this, JniAdExt.n1("ad.msg.share.error"));
                        }
                        if (!arrayList3.isEmpty()) {
                            o0(arrayList3, stringExtra2);
                        }
                    }
                } else {
                    o0(arrayListW, stringExtra2);
                }
                break;
        }
    }

    @Override // defpackage.ld0
    public final void o(String str, int i, ArrayList arrayList) {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.s0(i91.U0(str, i, arrayList));
        }
    }

    public final void o0(ArrayList arrayList, String str) {
        if (!JniAdExt.g2(io.KEY_FEATURE_CONNECT)) {
            this.T.u(this, JniAdExt.n1("ad.dlg.availability.title"));
            return;
        }
        String strReplace = str == null ? null : str.replace("anydesk_", "");
        MainApplication.v().Z(arrayList, strReplace);
        if (strReplace != null) {
            this.F.h(this, strReplace);
            MainFragment mainFragment = this.Q;
            if (mainFragment != null) {
                t70.Y(new wi0(mainFragment, strReplace, 0));
            }
            k0(strReplace);
        }
    }

    @Override // defpackage.qa, defpackage.co, defpackage.bo, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ImageView imageView;
        super.onCreate(bundle);
        MainApplication.v().f0 = this;
        JniAdExt.M4();
        this.D = new bc(Y(), 19);
        this.E = new gq0(this);
        this.F = new a51(this.T);
        int i = 0;
        this.H = false;
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.N = toolbar;
        toolbar.m(R.menu.menu_action_bar);
        this.L = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.M = (NavigationView) findViewById(R.id.nav_view);
        this.O = (ImageView) findViewById(R.id.toolbar_logo);
        dj djVar = this.U;
        djVar.d = (TextView) findViewById(R.id.license_banner);
        djVar.n();
        djVar.p();
        bo0 bo0VarN = lk0.n(this);
        bo0VarN.a(this);
        h0(this.N);
        v0(this.N, bo0VarN, this.L);
        this.L.a(this.i0);
        if (!JniAdExt.c) {
            uj.v(this, R.id.supportFragment);
            return;
        }
        this.M.setNavigationItemSelectedListener(this);
        Menu menu = this.M.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.nav_address_book);
        menuItemFindItem.setTitle(JniAdExt.n1("ad.menu.address_book"));
        MenuItem menuItemFindItem2 = menu.findItem(R.id.nav_recordings);
        menuItemFindItem2.setTitle(JniAdExt.n1("ad.menu.session_player"));
        menuItemFindItem2.setVisible(JniAdExt.g2(io.KEY_FEATURE_SESSION_PLAYBACK) && !er0.f);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.nav_downloads);
        menuItemFindItem3.setTitle(JniAdExt.n1("ad.menu.downloads"));
        MenuItem menuItemFindItem4 = menu.findItem(R.id.nav_settings);
        menuItemFindItem4.setTitle(JniAdExt.n1("ad.menu.settings"));
        if (!JniAdExt.g2(io.KEY_CFG_ENABLED)) {
            menuItemFindItem4.setVisible(false);
        }
        MenuItem menuItemFindItem5 = menu.findItem(R.id.nav_exit);
        menuItemFindItem5.setTitle(JniAdExt.n1("ad.menu.quit"));
        MenuItem menuItemFindItem6 = menu.findItem(R.id.nav_about);
        menuItemFindItem6.setTitle(JniAdExt.n1("ad.about.title"));
        MenuItem menuItemFindItem7 = menu.findItem(R.id.nav_plugin_ad1);
        menuItemFindItem7.setTitle(JniAdExt.n1("ad.menu.plugin").concat(" AD1"));
        MenuItem menuItemFindItem8 = menu.findItem(R.id.nav_help);
        menuItemFindItem8.setTitle(JniAdExt.n1("ad.menu.help"));
        MenuItem menuItemFindItem9 = menu.findItem(R.id.nav_tutorial);
        menuItemFindItem9.setTitle(JniAdExt.n1("ad.menu.tutorial"));
        MenuItem menuItemFindItem10 = menu.findItem(R.id.nav_privacy_statement);
        menuItemFindItem10.setTitle(JniAdExt.n1("ad.about.ver.privacy"));
        MenuItem menuItemFindItem11 = menu.findItem(R.id.nav_setup);
        this.P = menuItemFindItem11;
        menuItemFindItem11.setTitle(JniAdExt.n1("ad.menu.setup"));
        this.M.setItemIconTintList(null);
        ColorStateList itemTextColor = this.M.getItemTextColor();
        hq.M(menuItemFindItem2, itemTextColor);
        hq.M(menuItemFindItem, itemTextColor);
        hq.M(menuItemFindItem3, itemTextColor);
        hq.M(menuItemFindItem4, itemTextColor);
        hq.M(menuItemFindItem5, itemTextColor);
        hq.M(menuItemFindItem6, itemTextColor);
        hq.M(menuItemFindItem7, itemTextColor);
        hq.M(menuItemFindItem8, itemTextColor);
        hq.M(menuItemFindItem9, itemTextColor);
        hq.M(menuItemFindItem10, itemTextColor);
        NavigationView navigationView = this.M;
        View childAt = navigationView != null ? navigationView.k.d.getChildAt(0) : null;
        Bitmap bitmapR = MainApplication.v().r();
        if (bitmapR != null) {
            if (childAt != null && (imageView = (ImageView) childAt.findViewById(R.id.nav_header_main_logo)) != null) {
                imageView.setImageBitmap(bitmapR);
            }
            this.O.setImageDrawable(new BitmapDrawable(getResources(), bitmapR));
        }
        if (childAt != null) {
            childAt.findViewById(R.id.nav_header_network_info).setOnClickListener(new zh0(this, i));
        }
        T().a(this, this.g0);
        if (bundle == null) {
            n0(getIntent());
        }
        MainApplication.v().u.f.e(this, new y2(5, this));
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        bo0 bo0VarP = uj.p(this);
        if (bo0VarP != null) {
            mn0 mn0Var = bo0VarP.b;
            mn0Var.getClass();
            mn0Var.o.remove(this);
        }
        MainApplication.v().f0 = null;
        this.H = true;
        this.M.setNavigationItemSelectedListener(null);
        DrawerLayout drawerLayout = this.L;
        ci0 ci0Var = this.i0;
        if (ci0Var == null) {
            drawerLayout.getClass();
        } else {
            ArrayList arrayList = drawerLayout.u;
            if (arrayList != null) {
                arrayList.remove(ci0Var);
            }
        }
        getWindow().getDecorView().removeCallbacks(this.h0);
        this.E.b();
        this.E = null;
        this.D.e = null;
        this.D = null;
        this.L = null;
        this.M = null;
        this.U = null;
        this.O = null;
        this.N = null;
        this.P = null;
    }

    @Override // defpackage.co, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        n0(intent);
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.G = false;
        Bitmap bitmap = JniAdExt.a;
        Object obj = null;
        t70.Y(new bc0(2, obj));
        t70.Y(new bc0(3, obj));
        t70.Y(new bc0(4, obj));
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onResume() {
        ColorStateList colorStateListM;
        NavigationView navigationView;
        NotificationManager notificationManager;
        super.onResume();
        this.G = true;
        MainApplication mainApplicationV = MainApplication.v();
        gq0 gq0Var = mainApplicationV.Y;
        if (mainApplicationV.o0 == 1) {
            mainApplicationV.Z.c(IncomingConnectionService.class);
            if (gq0Var != null && (notificationManager = gq0Var.c) != null) {
                notificationManager.cancel(200);
            }
        }
        if (mainApplicationV.n0 == 1) {
            mainApplicationV.Z.c(ConnectionService.class);
            if (gq0Var != null) {
                NotificationManager notificationManager2 = gq0Var.c;
                if (notificationManager2 != null) {
                    notificationManager2.cancel(300);
                }
                NotificationManager notificationManager3 = gq0Var.c;
                if (notificationManager3 != null) {
                    notificationManager3.cancel(700);
                }
                NotificationManager notificationManager4 = gq0Var.c;
                if (notificationManager4 != null) {
                    notificationManager4.cancel(101);
                }
            }
        }
        MainApplication.v().S.t();
        j0();
        MainApplication mainApplicationV2 = MainApplication.v();
        bc bcVar = this.D;
        if (mainApplicationV2 != null && bcVar != null && mainApplicationV2.C()) {
            bcVar.p0(new bv0(), "PrivacyPolicyDialog", true);
        }
        PackageManager packageManager = getPackageManager();
        if (packageManager != null && (navigationView = this.M) != null) {
            navigationView.getMenu().findItem(R.id.nav_plugin_ad1).setVisible(t70.L(packageManager, tq.b.a));
        }
        MenuItem menuItem = this.P;
        if (menuItem != null) {
            int iL = nd0.l(this, this.E);
            int iR = q51.r(iL);
            if (iR == 1) {
                colorStateListM = uj.m(this, R.color.colorSetupStatusWarning);
            } else if (iR != 2) {
                NavigationView navigationView2 = this.M;
                colorStateListM = navigationView2 != null ? navigationView2.getItemTextColor() : null;
            } else {
                colorStateListM = uj.m(this, R.color.colorPrimary);
            }
            if (colorStateListM != null) {
                hq.M(menuItem, colorStateListM);
            }
            menuItem.setIcon(iL == 1 ? R.drawable.ic_nav_setup_complete : R.drawable.ic_nav_setup);
        }
        if (this.I) {
            this.I = false;
            this.C.e("executing postponed navigation to settings");
            q0(this.J, this.K);
        }
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        super.onStart();
        MainApplication.v().e = this;
        MainApplication.v().f = this;
        JniAdExt.z1(this);
        JniAdExt.S = this;
        JniAdExt.R = this;
        B0();
        A0();
        JniAdExt.s1(this);
        z0();
        NotificationManager notificationManager = this.E.c;
        if (notificationManager != null) {
            notificationManager.cancel(600);
        }
    }

    @Override // defpackage.qa, android.app.Activity
    public final void onStop() {
        super.onStop();
        JniAdExt.X3(this);
        JniAdExt.U3(this);
        JniAdExt.R = null;
        JniAdExt.S = null;
        MainApplication.v().f = null;
        MainApplication.v().e = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        zd zdVar = this.S;
        zdVar.getClass();
        td tdVar = new td(zdVar);
        while (tdVar.hasNext()) {
            ((r80) tdVar.next()).onWindowFocusChanged(z);
        }
    }

    @Override // defpackage.yc0
    public final void p() {
        this.D.G(1);
    }

    public final void p0() {
        t70.Y(new ai0(this, 0));
    }

    @Override // defpackage.yc0
    public final void q(String str) {
        bc bcVar = this.D;
        if (bcVar != null) {
            l4 l4Var = new l4();
            Bundle bundle = new Bundle();
            bundle.putString("skey_oauth_provider", str);
            l4Var.N0(bundle);
            bcVar.p0(l4Var, "AccountOAuthWaitingDialog", true);
        }
    }

    public final void q0(int i, v11 v11Var) {
        int i2 = m0().x;
        Resources resources = getResources();
        Looper looper = t70.a;
        boolean z = i2 >= resources.getDimensionPixelSize(R.dimen.settings_multi_panel_min_width);
        if (this.G) {
            if (!z) {
                uj.v(this, i);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("skey_req_direct_nav", v11Var);
            uj.w(this, R.id.settingsFragment, bundle);
            return;
        }
        this.C.e("postponing navigation to settings");
        this.I = true;
        if (z) {
            i = 0;
        }
        this.J = i;
        if (!z) {
            v11Var = v11.c;
        }
        this.K = v11Var;
    }

    @Override // defpackage.yc0
    public final void r() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.F("FileManagerConflictDialog");
        }
    }

    public final boolean r0(String str) {
        Logging logging = this.C;
        Intent intentPrepare = VpnService.prepare(this);
        if (intentPrepare == null) {
            return MainApplication.v().W(this, str);
        }
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 92796966) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 951351530 && str.equals("connect")) {
                        this.a0.a(intentPrepare);
                        return true;
                    }
                } else if (str.equals("start")) {
                    this.Z.a(intentPrepare);
                    return true;
                }
            } else if (str.equals("incoming")) {
                this.b0.a(intentPrepare);
                return true;
            }
            logging.c("action not implemented");
            return true;
        } catch (Throwable th) {
            logging.a("cannot start activity for vpn preparation intent: " + th.getMessage());
            t70.g0(this, JniAdExt.n1("ad.msg.vpn.preparation_failed.android"), 1);
            return false;
        }
    }

    @Override // defpackage.yc0
    public final void s(int i, int i2, long j, String str, long j2, String str2) {
        bc bcVar = this.D;
        if (bcVar != null) {
            cz czVar = new cz();
            Bundle bundle = new Bundle();
            bundle.putInt("skey_progress_id", i);
            bundle.putInt("skey_progress_conflict_handler_id", i2);
            bundle.putLong("skey_src_write_time", j);
            bundle.putString("skey_src_path", str);
            bundle.putLong("skey_dst_write_time", j2);
            bundle.putString("skey_dst_path", str2);
            bundle.putBoolean("skey_do_check_all", false);
            czVar.N0(bundle);
            bcVar.p0(czVar, "FileManagerConflictDialog", true);
        }
    }

    public final void s0(z6 z6Var) {
        zd zdVar = j0;
        synchronized (zdVar) {
            zdVar.remove(z6Var);
        }
    }

    public final void t0() {
        MainApplication.q(getApplicationContext());
        try {
            this.Y.a(t70.z(this));
        } catch (Throwable th) {
            this.T.u(this, JniAdExt.n1("ad.status.select_files.no_filemanager.msg.android"));
            q51.o(th, new StringBuilder("cannot open recordings folder: "), this.C);
        }
    }

    @Override // defpackage.ld0
    public final void u() {
        t70.Y(new ai0(this, 4));
    }

    public final void u0(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.W == null) {
                this.W = new Rect();
            }
            if (this.V == null) {
                ArrayList arrayList = new ArrayList();
                this.V = arrayList;
                arrayList.add(this.W);
            }
            Rect rect = this.W;
            rect.left = i;
            rect.top = i2;
            rect.right = i + i3;
            rect.bottom = i2 + i4;
            this.L.setSystemGestureExclusionRects(this.V);
        }
    }

    @Override // defpackage.yc0
    public final void v() {
        bc bcVar = this.D;
        if (bcVar == null) {
            return;
        }
        bcVar.q0(0, JniAdExt.n1("ad.abook.free_user_limit.logout.title.needs_review_by_legal.android"), JniAdExt.n1("ad.abook.free_user_limit.logout.msg.needs_review_by_legal.android"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
    }

    public final void v0(Toolbar toolbar, bo0 bo0Var, cr0 cr0Var) {
        if (toolbar == null || bo0Var == null) {
            return;
        }
        xn0 xn0VarG = bo0Var.b.g();
        HashSet hashSet = new HashSet();
        int i = xn0.j;
        hashSet.add(Integer.valueOf(th1.q(xn0VarG).d.a));
        bc bcVar = new bc(hashSet, cr0Var, 6, false);
        bo0Var.a(new sa1(toolbar, bcVar));
        int i2 = 1;
        toolbar.setNavigationOnClickListener(new n(bo0Var, i2, bcVar));
        toolbar.setNavigationOnClickListener(new zh0(this, i2));
    }

    @Override // defpackage.ld0
    public final void w(int i) {
        int i2;
        bc bcVar = this.D;
        if (bcVar != null) {
            int[] iArrS = q51.s(20);
            int length = iArrS.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i2 = 1;
                    break;
                }
                i2 = iArrS[i3];
                if (q51.r(i2) == i) {
                    break;
                } else {
                    i3++;
                }
            }
            switch (q51.r(i2)) {
                case 2:
                    bcVar.r0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.closed.desk_access_denied.title"), JniAdExt.n1("ad.dlg.closed.desk_access_denied.message"), j7.ACTION_CLOSE_PANEL, true);
                    break;
                case 3:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.switch_sides.failed.title"), JniAdExt.n1("ad.dlg.switch_sides.failed.msg"), null, true);
                    break;
                case 4:
                    bcVar.n0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.closed.backend_fault.title"), JniAdExt.n1("ad.dlg.closed.backend_fault.message"), true);
                    break;
                case 5:
                    bcVar.r0(R.drawable.ic_dialog_elevate_red, JniAdExt.n1("ad.dlg.elevation.failed.title"), JniAdExt.n1("ad.dlg.elevation.failed.msg"), null, true);
                    break;
                case 6:
                    bcVar.r0(R.drawable.ic_dialog_elevate_red, JniAdExt.n1("ad.dlg.elevation.denied.title"), JniAdExt.n1("ad.dlg.elevation.denied.msg"), null, true);
                    break;
                case 7:
                    bcVar.r0(R.drawable.ic_dialog_elevate_red, JniAdExt.n1("ad.dlg.elevation.incorrect_credentials.title"), JniAdExt.n1("ad.dlg.elevation.incorrect_credentials.msg"), null, true);
                    break;
                case 8:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.closed.restart_fault.title"), JniAdExt.n1("ad.dlg.closed.restart_fault.message"), null, true);
                    break;
                case 9:
                case 11:
                default:
                    ((Logging) bcVar.d).a("dialog not implemented: type=" + i);
                    break;
                case 10:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.closed.restart_disallowed.title"), JniAdExt.n1("ad.dlg.closed.restart_disallowed.message"), null, true);
                    break;
                case 12:
                    bcVar.n0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.elevation.wait_for_auth.title"), JniAdExt.n1("ad.dlg.elevation.wait_for_auth.msg"), true);
                    break;
                case 13:
                    bcVar.r0(R.drawable.ic_dialog_disconnected, JniAdExt.n1("ad.dlg.closed.err_display_server_not_supported.title"), JniAdExt.n1("ad.dlg.closed.desk_access_denied.message"), null, true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.privacy_failed.title"), JniAdExt.n1("ad.dlg.privacy_failed.msg"), null, true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.privacy_denied.title"), JniAdExt.n1("ad.dlg.privacy_denied.msg"), null, true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.privacy_not_supported.title"), JniAdExt.n1("ad.dlg.privacy_not_supported.msg"), null, true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                    bcVar.r0(R.drawable.ic_dialog_alert, JniAdExt.n1("ad.dlg.restart.incorrect_credentials.title"), JniAdExt.n1("ad.dlg.restart.incorrect_credentials.msg"), null, true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                    bcVar.n0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.capture_lost.title"), JniAdExt.n1("ad.dlg.capture_lost.message"), true);
                    break;
                case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                    bcVar.n0(R.drawable.ic_dialog_connected, JniAdExt.n1("ad.dlg.capture_restarting.title"), JniAdExt.n1("ad.dlg.capture_restarting.message"), true);
                    break;
            }
        }
    }

    public final void w0() {
        if (MainApplication.v().n0 != 4) {
            return;
        }
        int i = m0().x;
        Resources resources = getResources();
        Looper looper = t70.a;
        uj.v(this, i < resources.getDimensionPixelSize(R.dimen.filemanager_triple_panel_min_width) ? R.id.fileManagerProgressListFragmentWrapper : R.id.fileManagerFragment);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:249:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac A[LOOP:1: B:30:0x00ce->B:83:0x01ac, LOOP_END] */
    @Override // defpackage.ld0
    public final void x(int i, int i2, int i3) {
        int i4;
        j7 j7Var;
        int i5;
        String str;
        String strN1;
        boolean z;
        int i6;
        String strN2;
        boolean z2;
        boolean z3;
        String strN3;
        int i7;
        boolean z4;
        int i8;
        int i9;
        String strN4;
        boolean z5;
        String strN5;
        String strN6;
        bc bcVar = this.D;
        if (bcVar != null) {
            int[] iArrS = q51.s(10);
            int length = iArrS.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i4 = 1;
                    break;
                }
                i4 = iArrS[i10];
                if (q51.r(i4) == i) {
                    break;
                } else {
                    i10++;
                }
            }
            int i11 = 13;
            switch (q51.r(i4)) {
                case 1:
                case 2:
                case 3:
                    bcVar.n0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.connect.title"), JniAdExt.n1("ad.dlg.connect.msg"), true);
                    return;
                case 4:
                default:
                    ((Logging) bcVar.d).a("dialog not implemented: type=" + i);
                    return;
                case 5:
                    bcVar.n0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.wait_for_accept.title"), JniAdExt.n1("ad.dlg.wait_for_accept.msg"), true);
                    return;
                case 6:
                    String strN7 = null;
                    j7 j7Var2 = j7.ACTION_CLOSE_PANEL;
                    int i12 = R.drawable.ic_dialog_alert;
                    if (i2 != 1) {
                        if (i2 == 0) {
                            int[] iArrS2 = q51.s(36);
                            int length2 = iArrS2.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 < length2) {
                                    i8 = iArrS2[i13];
                                    if (q51.r(i8) != i3) {
                                        i13++;
                                    }
                                } else {
                                    i8 = 1;
                                }
                            }
                            if (i8 == 9) {
                                strN7 = JniAdExt.n1("ad.dlg.closed.invalid_addr.title");
                                strN2 = JniAdExt.n1("ad.dlg.closed.invalid_addr.message");
                            } else {
                                if (i8 == 4) {
                                    strN7 = JniAdExt.n1("ad.dlg.closed.socket_closed.title");
                                    strN2 = JniAdExt.n1("ad.dlg.closed.socket_closed.message");
                                } else if (i8 == 5) {
                                    strN7 = JniAdExt.n1("ad.dlg.closed.socket_timeout.title");
                                    strN2 = JniAdExt.n1("ad.dlg.closed.socket_timeout.message");
                                } else {
                                    if (i8 == 12) {
                                        strN7 = JniAdExt.n1("ad.dlg.closed.not_connected.title");
                                        strN2 = JniAdExt.n1("ad.dlg.closed.not_connected.message");
                                    } else {
                                        if (i8 == 13) {
                                            String strN8 = JniAdExt.n1("ad.dlg.closed.client_offline.title");
                                            String str2 = String.format(JniAdExt.n1("ad.dlg.closed.client_offline.message"), JniAdExt.M2(i2, i3));
                                            String strN9 = JniAdExt.n1("ad.dlg.retry");
                                            String strN10 = JniAdExt.n1("ad.dlg.cancel");
                                            String strN11 = JniAdExt.n1("ad.dlg.wake");
                                            MainApplication.v().r.v(true);
                                            bcVar.s0(ol0.S0(R.drawable.ic_dialog_alert, strN8, str2, strN9, strN10, strN11, j7.ACTION_WOL_RECONNECT, j7Var2, j7.ACTION_WOL_WAKE, false));
                                            return;
                                        }
                                        j7Var = j7Var2;
                                        if (i8 != 21) {
                                            if (i8 == 22) {
                                                strN7 = JniAdExt.n1("ad.dlg.closed.wol_waking.title");
                                                strN2 = JniAdExt.n1("ad.dlg.closed.wol_waking.message");
                                                z2 = false;
                                                z3 = false;
                                                i7 = R.drawable.ic_dialog_connecting;
                                            } else if (i8 == 23) {
                                                strN7 = JniAdExt.n1("ad.dlg.closed.wol_no_device.title");
                                                strN2 = JniAdExt.n1("ad.dlg.closed.wol_no_device.message");
                                            } else if (i8 == 24) {
                                                strN7 = JniAdExt.n1("ad.dlg.closed.wol_not_supported.title");
                                                strN2 = JniAdExt.n1("ad.dlg.closed.wol_not_supported.message");
                                            } else if (i8 == 27) {
                                                strN7 = JniAdExt.n1("ad.dlg.closed.outgoing_limit_reached.title");
                                                strN2 = JniAdExt.n1("ad.dlg.closed.outgoing_limit_reached.message");
                                            }
                                        }
                                        strN2 = null;
                                        z2 = true;
                                        z3 = false;
                                        i7 = R.drawable.ic_dialog_message;
                                    }
                                    z2 = true;
                                    z3 = false;
                                    i7 = R.drawable.ic_dialog_alert;
                                }
                                j7Var = j7Var2;
                                z2 = true;
                                z3 = true;
                                i7 = R.drawable.ic_dialog_alert;
                            }
                            j7Var = j7Var2;
                            z2 = true;
                            z3 = false;
                            i7 = R.drawable.ic_dialog_alert;
                        } else {
                            j7Var = j7Var2;
                            if (i2 == 5) {
                                int[] iArrS3 = q51.s(35);
                                int length3 = iArrS3.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < length3) {
                                        int i15 = iArrS3[i14];
                                        if (q51.r(i15) == i3) {
                                            i6 = i15;
                                        } else {
                                            i14++;
                                        }
                                    } else {
                                        i6 = 1;
                                    }
                                }
                                if (i6 == 4) {
                                    strN7 = JniAdExt.n1("ad.dlg.closed.auth_failed.title");
                                    strN2 = JniAdExt.n1("ad.dlg.closed.auth_failed.message");
                                } else {
                                    if (i6 == 5) {
                                        strN7 = JniAdExt.n1("ad.dlg.closed.user_close.title");
                                        strN2 = JniAdExt.n1("ad.dlg.closed.user_close.message");
                                    } else {
                                        if (i6 == 6) {
                                            strN7 = JniAdExt.n1("ad.dlg.closed.outdated_ver.title");
                                            strN2 = JniAdExt.n1("ad.dlg.closed.outdated_ver.message");
                                        } else {
                                            if (i6 == 7) {
                                                strN7 = JniAdExt.n1("ad.dlg.closed.rejected.title");
                                                strN2 = JniAdExt.n1("ad.dlg.closed.rejected.message");
                                                z2 = true;
                                                z3 = true;
                                            } else {
                                                if (i6 == 8) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.logon_disabled.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.logon_disabled.message");
                                                } else if (i6 == 9) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.no_logon_frontend.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.no_logon_frontend.message");
                                                } else if (i6 == 10) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.switched_sides.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.switched_sides.message");
                                                } else if (i6 == 13) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.retry_limit_reached.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.retry_limit_reached.message");
                                                } else if (i6 == 15) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.acl_denied.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.acl_denied.message");
                                                } else if (i6 == 14) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.restarting.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.restarting.message");
                                                    z2 = false;
                                                    z3 = true;
                                                    i7 = R.drawable.ic_dialog_connecting;
                                                } else if (i6 == 16) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.playback_file_not_found.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.playback_file_not_found.message");
                                                } else if (i6 == 17) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.playback_file_damaged.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.playback_file_damaged.message");
                                                } else if (i6 == 18) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.playback_file_invalid.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.playback_file_invalid.message");
                                                } else if (i6 == 19) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.err_display_server_not_supported.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.err_display_server_not_supported.message");
                                                } else if (i6 == 21) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.err_vpn_not_supported.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.err_vpn_not_supported.message");
                                                } else if (i6 == 22) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.no_capture_permissions.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.no_capture_permissions.message");
                                                } else if (i6 == 23) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.err_vpn_already_in_use.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.err_vpn_already_in_use.message");
                                                } else if (i6 == 24) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.two_factor_auth_failed.title");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.two_factor_auth_failed.message");
                                                } else if (i6 == 25) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.two_factor_auth_not_supported.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.two_factor_auth_not_supported.message");
                                                } else if (i6 == 29) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.incoming_limit_reached.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.incoming_limit_reached.message");
                                                } else if (i6 == 28) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.session_ended");
                                                    strN2 = JniAdExt.n1("ad.dlg.closed.message_desk_rt_auto_disconnect");
                                                    i7 = R.drawable.ic_dialog_disconnected;
                                                    z2 = true;
                                                    z3 = true;
                                                } else if (i6 == 33) {
                                                    strN7 = JniAdExt.n1("ad.dlg.closed.rejected_no_license.title");
                                                    strN3 = JniAdExt.n1("ad.dlg.closed.rejected_no_license.message");
                                                } else {
                                                    strN2 = null;
                                                    z2 = true;
                                                    z3 = false;
                                                    i7 = R.drawable.ic_dialog_message;
                                                }
                                                strN2 = strN3;
                                                z2 = true;
                                                z3 = false;
                                            }
                                            i7 = R.drawable.ic_dialog_connection_rejected;
                                        }
                                        z2 = true;
                                        z3 = false;
                                        i7 = R.drawable.ic_dialog_alert;
                                    }
                                    z2 = true;
                                    z3 = true;
                                    i7 = R.drawable.ic_dialog_message;
                                }
                                z2 = true;
                                z3 = true;
                                i7 = R.drawable.ic_dialog_alert;
                            } else {
                                i5 = 1;
                                if (i2 == 7 && i3 == 1) {
                                    String strN12 = JniAdExt.n1("ad.dlg.closed.invalid_addr.title");
                                    strN1 = JniAdExt.n1("ad.dlg.closed.invalid_addr.message");
                                    str = strN12;
                                    z = false;
                                } else {
                                    str = null;
                                    strN1 = null;
                                    z = false;
                                    i12 = R.drawable.ic_dialog_message;
                                }
                            }
                        }
                        z4 = z2;
                        z = z3;
                        i12 = i7;
                        str = strN7;
                        strN1 = strN2;
                        i5 = 1;
                        if (str != null || strN1 == null) {
                            bcVar.r0(R.drawable.ic_dialog_disconnected, JniAdExt.n1("ad.dlg.closed.title"), String.format(JniAdExt.n1("ad.dlg.closed.msg"), JniAdExt.M2(i2, i3)), j7Var, false);
                            return;
                        }
                        Object[] objArr = new Object[i5];
                        objArr[0] = JniAdExt.M2(i2, i3);
                        String str3 = String.format(strN1, objArr);
                        if (z4) {
                            bcVar.r0(i12, str, str3, j7Var, z);
                            return;
                        } else {
                            bcVar.n0(i12, str, str3, z);
                            return;
                        }
                    }
                    int[] iArrS4 = q51.s(48);
                    int length4 = iArrS4.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length4) {
                            int i17 = iArrS4[i16];
                            switch (i17) {
                                case 1:
                                    i11 = 0;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 2:
                                    i11 = 1;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 3:
                                    i11 = 2;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 4:
                                    i11 = 3;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 5:
                                    i11 = 4;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 6:
                                    i11 = 5;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 7:
                                    i11 = 6;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 8:
                                    i11 = 7;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 9:
                                    i11 = 8;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 10:
                                    i11 = 9;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 11:
                                    i11 = 10;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 12:
                                    i11 = 11;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 13:
                                    i11 = 12;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                                    i11 = 14;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                                    i11 = 15;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                    i11 = 16;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                    i11 = 17;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                    i11 = 18;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                    i11 = 19;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 21:
                                    i11 = 20;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 22:
                                    i11 = 21;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 23:
                                    i11 = 22;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 24:
                                    i11 = 23;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 25:
                                    i11 = 24;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 26:
                                    i11 = 25;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 27:
                                    i11 = 26;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 28:
                                    i11 = 27;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 29:
                                    i11 = 28;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 30:
                                    i11 = 29;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 31:
                                    i11 = 30;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 32:
                                    i11 = 31;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 33:
                                    i11 = 32;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 34:
                                    i11 = 33;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 35:
                                    i11 = 34;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 36:
                                    i11 = 35;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 37:
                                    i11 = 36;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 38:
                                    i11 = 37;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 39:
                                    i11 = 38;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 40:
                                    i11 = 39;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 41:
                                    i11 = 40;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 42:
                                    i11 = 41;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 43:
                                    i11 = 42;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 44:
                                    i11 = 43;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 45:
                                    i11 = 44;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 46:
                                    i11 = 47;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 47:
                                    i11 = 48;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                case 48:
                                    i11 = 49;
                                    if (i11 == i3) {
                                        i16++;
                                        i11 = 13;
                                    } else {
                                        i9 = i17;
                                    }
                                    break;
                                default:
                                    throw null;
                            }
                        } else {
                            i9 = 1;
                        }
                    }
                    if (i9 == 4 || i9 == 6) {
                        strN7 = JniAdExt.n1("ad.dlg.closed.invalid_addr.title");
                        strN4 = JniAdExt.n1("ad.dlg.closed.invalid_addr.message");
                    } else {
                        if (i9 == 3) {
                            strN7 = JniAdExt.n1("ad.dlg.closed.outdated_ver.title");
                            strN4 = JniAdExt.n1("ad.dlg.closed.outdated_ver.message");
                        } else {
                            if (i9 == 14) {
                                strN7 = JniAdExt.n1("ad.dlg.closed.time_limit.title.needs_review_by_legal.android");
                                strN4 = JniAdExt.n1("ad.dlg.closed.time_limit.message.needs_review_by_legal.android");
                            } else {
                                if (i9 == 15) {
                                    strN7 = JniAdExt.n1("ad.dlg.closed.conn_limit.title.needs_review_by_legal.android");
                                    strN4 = JniAdExt.n1("ad.dlg.closed.conn_limit.message.needs_review_by_legal.android");
                                } else if (i9 == 21) {
                                    strN7 = JniAdExt.n1("ad.dlg.closed.admin_close.title");
                                    strN4 = JniAdExt.n1("ad.dlg.closed.admin_close.message");
                                } else {
                                    strN4 = null;
                                }
                                z5 = false;
                                i12 = R.drawable.ic_dialog_message;
                            }
                            z5 = true;
                            i12 = R.drawable.ic_dialog_message;
                        }
                        strN1 = strN4;
                        z = z5;
                        str = strN7;
                        j7Var = j7Var2;
                        i5 = 1;
                    }
                    z5 = false;
                    strN1 = strN4;
                    z = z5;
                    str = strN7;
                    j7Var = j7Var2;
                    i5 = 1;
                    z4 = true;
                    if (str != null) {
                    }
                    bcVar.r0(R.drawable.ic_dialog_disconnected, JniAdExt.n1("ad.dlg.closed.title"), String.format(JniAdExt.n1("ad.dlg.closed.msg"), JniAdExt.M2(i2, i3)), j7Var, false);
                    return;
                case 7:
                    if (i2 == 5 && i3 == 13) {
                        strN6 = JniAdExt.n1("ad.dlg.closed.restarting.title");
                        strN5 = JniAdExt.n1("ad.dlg.closed.restarting.message");
                    } else {
                        String strN13 = JniAdExt.n1("ad.dlg.closed.reconnect");
                        strN5 = String.format(JniAdExt.n1("ad.dlg.closed.msg"), JniAdExt.M2(i2, i3));
                        strN6 = strN13;
                    }
                    bcVar.n0(R.drawable.ic_dialog_connecting, strN6, strN5, true);
                    return;
                case 8:
                    bcVar.n0(R.drawable.ic_dialog_connected, JniAdExt.n1("ad.dlg.wait_for_image.title"), JniAdExt.n1("ad.dlg.wait_for_image.msg"), true);
                    return;
                case 9:
                    bcVar.r0(R.drawable.ic_dialog_connecting, JniAdExt.n1("ad.dlg.bandwidth_limit.title"), JniAdExt.n1("ad.dlg.bandwidth_limit.msg"), null, true);
                    return;
            }
        }
    }

    public final void x0() {
        MainApplication mainApplicationV = MainApplication.v();
        int i = 0;
        t70.b0(mainApplicationV.T, "tutorial_main_finished", false);
        t70.b0(mainApplicationV.T, "tutorial_conn_finished", false);
        t70.c0(mainApplicationV.T, "tutorial_main_news_version", 0);
        t70.c0(mainApplicationV.T, "tutorial_conn_news_version", 0);
        t70.b0(MainApplication.v().T, "tutorial_main_requested", true);
        t70.b0(MainApplication.v().T, "tutorial_conn_requested", true);
        MainFragment mainFragment = this.R;
        if (mainFragment != null) {
            t70.Y(new xi0(i, mainFragment));
        }
    }

    @Override // defpackage.yc0
    public final void y(String str, int i, int i2, int i3) {
        bc bcVar = this.D;
        if (bcVar != null) {
            az azVar = new az();
            Bundle bundle = new Bundle();
            bundle.putInt("skey_progress_id", i);
            bundle.putInt("skey_total_files", i2);
            bundle.putInt("skey_total_folders", i3);
            bundle.putString("skey_src_path", str);
            bundle.putBoolean("skey_do_check_all", false);
            azVar.N0(bundle);
            bcVar.p0(azVar, "FileManagerConflictDialog", true);
        }
    }

    @Override // defpackage.yc0
    public final void z() {
        bc bcVar = this.D;
        if (bcVar != null) {
            bcVar.F("AccountOAuthWaitingDialog");
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (JniAdExt.f2(false)) {
            synchronized (JniAdExt.x0) {
                try {
                    arrayList = new ArrayList();
                    for (zl0 zl0Var : JniAdExt.y0.values()) {
                        if (zl0Var.a == 102) {
                            arrayList.add(zl0Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bc bcVar = this.D;
            if (arrayList.isEmpty() || bcVar == null) {
                return;
            }
            bcVar.p0(e9.T0((zl0) arrayList.get(0)), "AnyMessageDialog", false);
        }
    }
}
