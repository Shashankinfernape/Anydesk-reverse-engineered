package com.anydesk.anydeskandroid.gui.fragment;

import android.app.PictureInPictureParams;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.ConnectionRootView;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.a7;
import defpackage.b7;
import defpackage.bc;
import defpackage.bc0;
import defpackage.be0;
import defpackage.bp;
import defpackage.c6;
import defpackage.c7;
import defpackage.cd0;
import defpackage.cp;
import defpackage.d7;
import defpackage.de0;
import defpackage.ds;
import defpackage.er0;
import defpackage.f3;
import defpackage.fb0;
import defpackage.fe0;
import defpackage.fj;
import defpackage.g4;
import defpackage.ge0;
import defpackage.gq0;
import defpackage.i4;
import defpackage.ic0;
import defpackage.ie0;
import defpackage.io;
import defpackage.iq0;
import defpackage.je0;
import defpackage.kc0;
import defpackage.ke0;
import defpackage.ki0;
import defpackage.kq0;
import defpackage.lk0;
import defpackage.lp;
import defpackage.lu0;
import defpackage.m80;
import defpackage.n80;
import defpackage.nm0;
import defpackage.no;
import defpackage.nu0;
import defpackage.po;
import defpackage.q51;
import defpackage.qa;
import defpackage.qo;
import defpackage.r3;
import defpackage.r71;
import defpackage.r80;
import defpackage.ro;
import defpackage.s0;
import defpackage.s7;
import defpackage.so;
import defpackage.t6;
import defpackage.t70;
import defpackage.tb0;
import defpackage.to;
import defpackage.u01;
import defpackage.ua0;
import defpackage.uj;
import defpackage.uo;
import defpackage.ut0;
import defpackage.v01;
import defpackage.vf;
import defpackage.vl0;
import defpackage.vo;
import defpackage.vy0;
import defpackage.w30;
import defpackage.w81;
import defpackage.x00;
import defpackage.xf;
import defpackage.xt0;
import defpackage.y2;
import defpackage.yo;
import defpackage.z6;
import defpackage.zd;
import defpackage.zg0;
import defpackage.zo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionFragment extends z6 implements SurfaceHolder.Callback, n80, r80, cd0, ki0 {
    public View A0;
    public vf A1;
    public ImageButton B0;
    public float B1;
    public View C0;
    public Spinner D0;
    public final w30 D1;
    public FrameLayout E0;
    public final w30 E1;
    public nu0 F0;
    public final w30 F1;
    public lu0 G0;
    public final w30 G1;
    public lu0 H0;
    public final w30 H1;
    public lu0 I0;
    public final w30 I1;
    public lu0 J0;
    public final zo J1;
    public lu0 K0;
    public final zo K1;
    public lu0 L0;
    public final bp L1;
    public lu0 M0;
    public final bp M1;
    public lu0 N0;
    public lu0 O0;
    public lu0 P0;
    public lu0 Q0;
    public lu0 R0;
    public lu0 S0;
    public lu0 T0;
    public lu0 U0;
    public lu0 V0;
    public lu0 W0;
    public lu0 X0;
    public lu0 Y0;
    public lu0 Z0;
    public lu0 a1;
    public lu0 b1;
    public boolean c0;
    public lu0 c1;
    public lp d0;
    public lu0 d1;
    public HandlerThread e0;
    public lu0 e1;
    public s7 f0;
    public View f1;
    public no g0;
    public View g1;
    public v01 h0;
    public View h1;
    public a7 i0;
    public EditText i1;
    public d7 j0;
    public FloatingActionButton j1;
    public u01 k0;
    public FloatingActionButton k1;
    public b7 l0;
    public FloatingActionButton l1;
    public kq0 m0;
    public View m1;
    public ut0 n0;
    public EditText n1;
    public je0 o0;
    public FloatingActionButton o1;
    public bc p0;
    public FloatingActionButton p1;
    public gq0 q0;
    public FloatingActionButton q1;
    public ConnectionRootView r0;
    public View r1;
    public FrameLayout s0;
    public FloatingActionButton s1;
    public View t0;
    public FloatingActionButton t1;
    public View u0;
    public FloatingActionButton u1;
    public View v0;
    public ImageView v1;
    public View w0;
    public SurfaceView w1;
    public TextView x0;
    public View x1;
    public TextView y0;
    public ImageView y1;
    public View z0;
    public vf z1;
    public final Logging b0 = new Logging("ConnectionFragment");
    public final xt0 C1 = new xt0(this);

    public ConnectionFragment() {
        int i = 2;
        int i2 = 0;
        this.D1 = (w30) F0(new ro(this, i2), new i4(i));
        int i3 = 1;
        this.E1 = (w30) F0(new ro(this, i3), new i4(i));
        this.F1 = (w30) F0(new ro(this, i), new i4(i3));
        this.G1 = (w30) F0(new ro(this, 3), new i4(i3));
        this.H1 = (w30) F0(new ro(this, 4), new i4(i3));
        this.I1 = (w30) F0(new ro(this, 5), new i4(i3));
        this.J1 = new zo(i2, this);
        this.K1 = new zo(i3, this);
        this.L1 = new bp(this, i2);
        this.M1 = new bp(this, i3);
    }

    public static void A1(CharSequence charSequence, View view, View view2) {
        int i = 0;
        int i2 = 8;
        if (charSequence.length() == 0) {
            i = 8;
            if (MainApplication.v().b0) {
                i2 = 0;
            }
        }
        r3.I(view, i);
        r3.I(view2, i2);
    }

    public static void R0(ConnectionFragment connectionFragment) {
        Logging logging = connectionFragment.b0;
        connectionFragment.a1();
        lp lpVar = connectionFragment.d0;
        if (lpVar != null) {
            lpVar.w(ke0.c);
        }
        qa qaVarY = connectionFragment.Y();
        if (qaVarY != null) {
            Rational rationalY0 = connectionFragment.Y0();
            Rational rational = new Rational(16, 10);
            try {
                qaVarY.enterPictureInPictureMode(Z0(rationalY0, true));
            } catch (Exception e) {
                if (rationalY0.equals(rational)) {
                    logging.a("Failed to enter PiP mode: " + e.getMessage());
                } else {
                    try {
                        qaVarY.enterPictureInPictureMode(Z0(rational, true));
                    } catch (Exception e2) {
                        logging.a("Failed to enter PiP mode: " + e2.getMessage());
                    }
                }
            }
        }
    }

    public static Rect S0(ConnectionFragment connectionFragment, lu0 lu0Var) {
        nu0 nu0Var;
        if (lu0Var == null || (nu0Var = connectionFragment.F0) == null) {
            return null;
        }
        Point position = nu0Var.getPosition();
        int[] iArr = new int[2];
        nu0Var.getLocationInWindow(iArr);
        int i = position.x + iArr[0];
        position.x = i;
        position.y += iArr[1];
        int i2 = lu0Var.m;
        double d = ((lu0Var.n - i2) / 2) + i2;
        double d2 = (lu0Var.l / 2.0f) + lu0Var.k;
        int iSin = i - ((int) (Math.sin(d2) * d));
        int iCos = position.y - ((int) (Math.cos(d2) * d));
        return new Rect(iSin, iCos, iSin, iCos);
    }

    public static void T0(ConnectionFragment connectionFragment) {
        MainApplication.q(connectionFragment.a0());
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            connectionFragment.d0.J(false);
            connectionFragment.D1.a(Intent.createChooser(intent, JniAdExt.n1("ad.status.select_files.chooser.upload.msg")));
        } catch (Throwable unused) {
            connectionFragment.C1.u(connectionFragment.a0(), JniAdExt.n1("ad.status.select_files.no_filemanager.msg.android"));
        }
    }

    public static void U0(ConnectionFragment connectionFragment, ke0 ke0Var) {
        ke0 ke0Var2 = ke0.c;
        if (ke0Var == ke0Var2) {
            return;
        }
        lp lpVar = connectionFragment.d0;
        if (lpVar == null) {
            connectionFragment.a1();
            return;
        }
        if (lpVar.d() == ke0Var) {
            ke0Var = ke0Var2;
        }
        lpVar.w(ke0Var);
        connectionFragment.p1();
    }

    public static PictureInPictureParams Z0(Rational rational, boolean z) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        builder.setAspectRatio(rational);
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAutoEnterEnabled(z);
        }
        return builder.build();
    }

    public static void o1(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        view.measure(0, 0);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = -view.getMeasuredWidth();
        layoutParams.bottomMargin = -view.getMeasuredHeight();
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        Window windowO0;
        WindowInsetsController insetsController;
        super.A0();
        JniAdExt.T = this;
        t70.V(new uo(this, 11));
        JniAdExt.U = this;
        t70.V(new uo(this, 12));
        this.w1.setVisibility(0);
        int i = 8;
        if (t70.I()) {
            View view = this.x1;
            if (view != null) {
                view.setBackgroundColor(uj.l(I0(), R.color.colorConnectionScreen));
            }
            if ((f0().getConfiguration().uiMode & 48) != 32 && (windowO0 = O0()) != null && (insetsController = windowO0.getInsetsController()) != null) {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        }
        int i2 = 1;
        if (!t70.I()) {
            t70.Y(new yo(this, (Build.VERSION.SDK_INT < 30 ? 16 : 48) | 2, i2));
        }
        lp lpVar = this.d0;
        if (lpVar != null) {
            t70.Y(new fj(this, i2, lpVar.p()));
        }
        if (MainApplication.v().n0 == 3) {
            t70.Y(new uo(this, i));
            t70.Y(new uo(this, 9));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            w1(true);
        }
        MainApplication mainApplicationV = MainApplication.v();
        x00 x00Var = mainApplicationV.s;
        if (x00Var.j && !x00Var.k && mainApplicationV.n0 == 2) {
            e1();
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        Window windowO0;
        WindowInsetsController insetsController;
        super.B0();
        JniAdExt.U = null;
        JniAdExt.T = null;
        boolean z = false;
        this.m0.f.b(false);
        this.n0.a(false);
        JniAdExt.M3(null);
        this.w1.setVisibility(8);
        if (t70.I()) {
            View view = this.x1;
            if (view != null) {
                view.setBackgroundColor(uj.l(I0(), R.color.colorMainBackground));
            }
            if ((f0().getConfiguration().uiMode & 48) != 32 && (windowO0 = O0()) != null && (insetsController = windowO0.getInsetsController()) != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
        int i = 1;
        if (!t70.I()) {
            t70.Y(new yo(this, 34, i));
        }
        t70.Y(new fj(this, i, z));
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).u0(0, 0, 0, 0);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            w1(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0a96  */
    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        String string;
        TextView textView;
        int i;
        lu0 lu0Var;
        View view2;
        double d;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        super.C0(view, bundle);
        HandlerThread handlerThread = new HandlerThread("delayedMsg");
        this.e0 = handlerThread;
        handlerThread.start();
        int i2 = 3;
        this.f0 = new s7(this, this.e0.getLooper(), 3);
        int i3 = 6;
        this.o0 = new je0(Y(), new ro(this, i3));
        qa qaVarG0 = G0();
        this.p0 = new bc(qaVarG0.Y(), 19);
        this.q0 = new gq0(a0());
        ConnectionRootView connectionRootView = (ConnectionRootView) view.findViewById(R.id.rootview);
        this.r0 = connectionRootView;
        connectionRootView.setKeyEventListener(this);
        this.s0 = (FrameLayout) view.findViewById(R.id.playback_ctrl_container);
        this.t0 = view.findViewById(R.id.playback_ctrl_progress_total);
        this.v0 = view.findViewById(R.id.playback_ctrl_progress);
        this.w0 = view.findViewById(R.id.playback_ctrl_seek_target);
        this.y0 = (TextView) view.findViewById(R.id.playback_ctrl_progress_time_total);
        this.x0 = (TextView) view.findViewById(R.id.playback_ctrl_progress_time);
        final int i4 = 0;
        this.t0.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: mo
            public final /* synthetic */ ConnectionFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i4;
                ConnectionFragment connectionFragment = this.b;
                switch (i13) {
                    case 0:
                        if (MainApplication.v().n0 == 3) {
                            connectionFragment.z1();
                        }
                        break;
                    default:
                        vf vfVar = connectionFragment.z1;
                        ImageView imageView = connectionFragment.v1;
                        if (vfVar != null && imageView != null) {
                            Rect rect = new Rect();
                            imageView.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(imageView, null);
                            break;
                        }
                        break;
                }
            }
        });
        v01 v01Var = new v01();
        v01Var.d = 0.0d;
        v01Var.e = 0L;
        v01Var.a = this;
        int i5 = 14;
        v01Var.b = new bc0(i5, v01Var);
        v01Var.c = new vy0(v01Var.b);
        this.h0 = v01Var;
        u01 u01Var = new u01();
        u01Var.c = 0;
        u01Var.d = false;
        u01Var.f = 0;
        u01Var.g = v01Var;
        this.k0 = u01Var;
        View viewFindViewById4 = view.findViewById(R.id.playback_ctrl_bottom_container);
        this.u0 = viewFindViewById4;
        viewFindViewById4.setOnGenericMotionListener(this.k0);
        this.u0.setOnTouchListener(this.k0);
        View viewFindViewById5 = view.findViewById(R.id.playback_ctrl_close);
        this.z0 = viewFindViewById5;
        int i6 = 10;
        viewFindViewById5.setOnClickListener(new po(this, i6));
        View viewFindViewById6 = view.findViewById(R.id.playback_ctrl_restart);
        this.A0 = viewFindViewById6;
        viewFindViewById6.setOnClickListener(new po(this, i4));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.playback_ctrl_pause);
        this.B0 = imageButton;
        int i7 = 1;
        imageButton.setOnClickListener(new po(this, i7));
        this.D0 = (Spinner) view.findViewById(R.id.playback_ctrl_speed_select);
        ArrayAdapter arrayAdapter = new ArrayAdapter(a0(), R.layout.playback_speed_text, lp.L);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.D0.setAdapter((SpinnerAdapter) arrayAdapter);
        this.D0.setOnItemSelectedListener(new f3(i7, this));
        View viewFindViewById7 = view.findViewById(R.id.playback_ctrl_speed);
        this.C0 = viewFindViewById7;
        int i8 = 2;
        viewFindViewById7.setOnClickListener(new po(this, i8));
        this.E0 = (FrameLayout) view.findViewById(R.id.pie_container);
        nu0 nu0Var = new nu0(a0());
        this.F0 = nu0Var;
        nu0Var.setDpi(er0.b());
        this.F0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.E0.addView(this.F0);
        this.G0 = ds.w(a0(), "fullscreen", R.drawable.ic_pie_fullscreen, JniAdExt.n1("ad.menu.pie.tooltip.fullscreen"), new qo(this, i4));
        this.H0 = ds.w(a0(), "remote_restart", R.drawable.ic_pie_restart, JniAdExt.n1("ad.menu.action.remote_restart"), new qo(this, i7));
        this.R0 = ds.w(a0(), "tcpTunnel", R.drawable.ic_pie_tcp_tunnel, JniAdExt.n1("ad.menu.action.tcp_tunnel"), new qo(this, i8));
        this.I0 = ds.w(a0(), "sas", R.drawable.ic_pie_sas, JniAdExt.n1("ad.menu.pie.tooltip.sas"), new qo(this, i2));
        int i9 = 4;
        this.J0 = ds.w(a0(), "priv", R.drawable.ic_pie_privacy, JniAdExt.n1("ad.menu.pie.tooltip.privacy"), new qo(this, i9));
        int i10 = 5;
        this.K0 = ds.w(a0(), "rec", R.drawable.ic_pie_record_session, JniAdExt.n1("ad.main_bar.start_recording"), new qo(this, i10));
        this.L0 = ds.w(a0(), "vpn", R.drawable.ic_pie_vpn, JniAdExt.n1("ad.menu.pie.tooltip.vpn"), new qo(this, i3));
        int i11 = 7;
        this.Q0 = ds.w(a0(), "sessionInfo", R.drawable.ic_pie_sysinfo, JniAdExt.n1("ad.menu.action.sys_info"), new qo(this, i11));
        this.M0 = ds.w(a0(), "elevate", R.drawable.ic_pie_elevate, JniAdExt.n1("ad.menu.pie.tooltip.request_elevation"), new qo(this, 8));
        this.N0 = ds.w(a0(), "scrshot", R.drawable.ic_pie_screenshot, JniAdExt.n1("ad.menu.pie.tooltip.screenshot"), new qo(this, 9));
        this.O0 = ds.w(a0(), "acceptF", R.drawable.ic_pie_download, JniAdExt.n1("ad.accept.file_transfer.btn"), new qo(this, i6));
        this.P0 = ds.w(a0(), "offerF", R.drawable.ic_pie_upload, JniAdExt.n1("ad.menu.pie.tooltip.upload"), new qo(this, 11));
        this.W0 = ds.w(a0(), "cfg", R.drawable.ic_pie_settings, JniAdExt.n1("ad.menu.pie.tooltip.settings"), new qo(this, 12));
        this.X0 = ds.w(a0(), "input", R.drawable.ic_pie_input, JniAdExt.n1("ad.menu.pie.tooltip.input"), null);
        this.r1 = view.findViewById(R.id.keyboard_switch_close_container);
        this.s1 = (FloatingActionButton) view.findViewById(R.id.keyboard_resize);
        this.t1 = (FloatingActionButton) view.findViewById(R.id.keyboard_switch);
        this.u1 = (FloatingActionButton) view.findViewById(R.id.keyboard_close);
        this.j1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_top_send);
        this.o1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_bottom_send);
        this.k1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_top_trash);
        this.p1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_bottom_trash);
        this.l1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_top_microphone);
        this.q1 = (FloatingActionButton) view.findViewById(R.id.keyboard_unrestricted_bottom_microphone);
        this.t1.setOnClickListener(new po(this, i9));
        this.t1.setOnLongClickListener(new s0(i2, this));
        this.u1.setOnClickListener(new po(this, i2));
        this.j1.setOnClickListener(new po(this, i10));
        this.o1.setOnClickListener(new po(this, i3));
        this.s1.setOnClickListener(new po(this, i11));
        this.Y0 = ds.w(a0(), "keyb", R.drawable.ic_pie_keyboard, JniAdExt.n1("ad.menu.pie.tooltip.keyboard"), new qo(this, 13));
        this.Z0 = ds.w(a0(), "ukeyb", R.drawable.ic_pie_unrestricted_keyboard, JniAdExt.n1("ad.menu.pie.tooltip.unrestricted_keyboard"), new qo(this, i5));
        this.a1 = ds.w(a0(), "skeyb", R.drawable.ic_pie_special_keyboard, JniAdExt.n1("ad.menu.pie.tooltip.special_keyboard"), new qo(this, 15));
        this.b1 = ds.w(a0(), "mouse", R.drawable.ic_pie_input_touch_mouse, JniAdExt.n1("ad.menu.pie.tooltip.mouse"), new qo(this, 16));
        this.c1 = ds.w(a0(), "touchpad", R.drawable.ic_pie_input_touch_touchpad, JniAdExt.n1("ad.menu.pie.tooltip.touchpad"), new qo(this, 17));
        this.d1 = ds.w(a0(), "directtouch", R.drawable.ic_pie_input_touch_direct, JniAdExt.n1("ad.menu.pie.tooltip.touch"), new qo(this, 18));
        lu0 lu0VarW = ds.w(a0(), "close", R.drawable.ic_pie_close, JniAdExt.n1("ad.menu.pie.tooltip.close"), new qo(this, 19));
        this.e1 = lu0VarW;
        lu0VarW.j = true;
        this.V0 = ds.w(a0(), "monitors", R.drawable.ic_pie_monitor, JniAdExt.n1("ad.menu.pie.tooltip.monitor"), null);
        this.S0 = ds.w(a0(), "actions", R.drawable.ic_pie_action, JniAdExt.n1("ad.menu.pie.tooltip.action"), null);
        this.T0 = ds.w(a0(), "browseF", R.drawable.ic_pie_browse_files, JniAdExt.n1("ad.abook.item.menu.file_manager"), new qo(this, 20));
        this.U0 = ds.w(a0(), "chat", R.drawable.ic_pie_chat, JniAdExt.n1("ad.chat.tooltip"), new qo(this, 21));
        this.F0.a(this.W0);
        this.F0.a(this.X0);
        this.F0.a(this.V0);
        if (JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER)) {
            this.F0.a(this.T0);
        }
        this.F0.a(this.U0);
        this.F0.a(this.S0);
        this.F0.a(this.e1);
        this.S0.d(this.N0);
        this.S0.d(this.P0);
        this.S0.d(this.O0);
        this.S0.d(this.Q0);
        this.S0.d(this.M0);
        this.S0.d(this.I0);
        this.S0.d(this.H0);
        this.S0.d(this.R0);
        if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
            this.S0.d(this.L0);
        }
        this.S0.d(this.J0);
        if (JniAdExt.g2(io.KEY_FEATURE_SESSION_RECORDING)) {
            this.S0.d(this.K0);
        }
        this.X0.d(this.a1);
        this.X0.d(this.Z0);
        this.X0.d(this.Y0);
        this.X0.d(this.b1);
        this.X0.d(this.c1);
        this.X0.d(this.d1);
        this.f1 = view.findViewById(R.id.keyboard_special_extended);
        this.g1 = view.findViewById(R.id.keyboard_special_shrunk);
        this.h1 = view.findViewById(R.id.keyboard_unrestricted_top);
        this.i1 = (EditText) view.findViewById(R.id.keyboard_unrestricted_top_input);
        this.m1 = view.findViewById(R.id.keyboard_unrestricted_bottom);
        this.n1 = (EditText) view.findViewById(R.id.keyboard_unrestricted_bottom_input);
        this.i1.addTextChangedListener(this.J1);
        this.n1.addTextChangedListener(this.K1);
        t6 t6Var = new t6(1, this);
        this.i1.setOnEditorActionListener(t6Var);
        this.n1.setOnEditorActionListener(t6Var);
        po poVar = new po(this, 8);
        this.k1.setOnClickListener(poVar);
        this.p1.setOnClickListener(poVar);
        po poVar2 = new po(this, 9);
        this.l1.setOnClickListener(poVar2);
        this.q1.setOnClickListener(poVar2);
        je0 je0Var = this.o0;
        je0Var.d(R.id.kbs_extended_button_menu, 117);
        je0Var.d(R.id.kbs_extended_button_apps, 123);
        je0Var.d(R.id.kbs_extended_button_home, 116);
        je0Var.d(R.id.kbs_extended_button_back, 115);
        je0Var.d(R.id.kbs_extended_button_volume_minus, 120);
        je0Var.d(R.id.kbs_extended_button_volume_plus, 119);
        je0Var.d(R.id.kbs_extended_button_power, 118);
        je0Var.d(R.id.kbs_extended_button_ok, 121);
        je0Var.d(R.id.kbs_extended_button_escape, 2);
        je0Var.d(R.id.kbs_extended_button_f1, 3);
        je0Var.d(R.id.kbs_extended_button_f2, 4);
        je0Var.d(R.id.kbs_extended_button_f3, 5);
        je0Var.d(R.id.kbs_extended_button_f4, 6);
        je0Var.d(R.id.kbs_extended_button_f5, 7);
        je0Var.d(R.id.kbs_extended_button_f6, 8);
        je0Var.d(R.id.kbs_extended_button_backspace, 31);
        je0Var.d(R.id.kbs_extended_button_sys, 15);
        je0Var.d(R.id.kbs_extended_button_tab, 32);
        int i12 = 9;
        je0Var.d(R.id.kbs_extended_button_f7, 9);
        je0Var.d(R.id.kbs_extended_button_f8, 10);
        je0Var.d(R.id.kbs_extended_button_f9, 11);
        je0Var.d(R.id.kbs_extended_button_f10, 12);
        je0Var.d(R.id.kbs_extended_button_f11, 13);
        je0Var.d(R.id.kbs_extended_button_f12, 14);
        je0Var.d(R.id.kbs_extended_button_return, 58);
        fe0 fe0Var = new fe0(je0Var, 16, 1);
        qa qaVar = je0Var.b;
        if (qaVar != null && (viewFindViewById3 = qaVar.findViewById(R.id.kbs_extended_button_roll)) != null) {
            viewFindViewById3.setOnGenericMotionListener(je0Var.i);
            viewFindViewById3.setOnTouchListener(null);
            viewFindViewById3.setOnClickListener(fe0Var);
        }
        fe0 fe0Var2 = new fe0(je0Var, 46, 1);
        qa qaVar2 = je0Var.b;
        if (qaVar2 != null && (viewFindViewById2 = qaVar2.findViewById(R.id.kbs_extended_button_caps_lock)) != null) {
            viewFindViewById2.setOnGenericMotionListener(je0Var.i);
            viewFindViewById2.setOnTouchListener(null);
            viewFindViewById2.setOnClickListener(fe0Var2);
        }
        je0Var.e(R.id.kbs_extended_button_shift, new ge0(je0Var, 59, 1));
        je0Var.e(R.id.kbs_extended_button_altgr, new ge0(je0Var, 75, 32));
        je0Var.d(R.id.kbs_extended_button_ins, 79);
        je0Var.d(R.id.kbs_extended_button_pg_up, 81);
        je0Var.d(R.id.kbs_extended_button_pos1, 80);
        je0Var.d(R.id.kbs_extended_button_up, 85);
        je0Var.d(R.id.kbs_extended_button_end, 83);
        je0Var.d(R.id.kbs_extended_button_break, 17);
        je0Var.e(R.id.kbs_extended_button_ctrl, new ge0(je0Var, 71, 4));
        je0Var.e(R.id.kbs_extended_button_win, new ge0(je0Var, 72, 64));
        je0Var.e(R.id.kbs_extended_button_alt, new ge0(je0Var, 73, 16));
        je0Var.d(R.id.kbs_extended_button_del, 82);
        je0Var.d(R.id.kbs_extended_button_pg_down, 84);
        je0Var.d(R.id.kbs_extended_button_left, 86);
        je0Var.d(R.id.kbs_extended_button_down, 87);
        je0Var.d(R.id.kbs_extended_button_right, 88);
        final int i13 = 1;
        fe0 fe0Var3 = new fe0(je0Var, 89, i13);
        qa qaVar3 = je0Var.b;
        if (qaVar3 != null && (viewFindViewById = qaVar3.findViewById(R.id.kbs_extended_button_num_lock)) != null) {
            viewFindViewById.setOnGenericMotionListener(je0Var.i);
            viewFindViewById.setOnTouchListener(null);
            viewFindViewById.setOnClickListener(fe0Var3);
        }
        je0Var.d(R.id.kbs_shrunk_button_menu, 117);
        je0Var.d(R.id.kbs_shrunk_button_apps, 123);
        je0Var.d(R.id.kbs_shrunk_button_home, 116);
        je0Var.d(R.id.kbs_shrunk_button_back, 115);
        je0Var.d(R.id.kbs_shrunk_button_power, 118);
        p1();
        SurfaceView surfaceView = (SurfaceView) view.findViewById(R.id.surfaceview);
        this.w1 = surfaceView;
        surfaceView.getHolder().addCallback(this);
        this.y1 = (ImageView) view.findViewById(R.id.local_cursor);
        this.v1 = (ImageView) view.findViewById(R.id.ad_nubsi);
        String string2 = null;
        int i14 = 8;
        kq0 kq0Var = new kq0(this, this, this.w1.getWidth() - this.v1.getWidth(), this.w1.getHeight() - this.v1.getHeight(), er0.c(), er0.d());
        this.m0 = kq0Var;
        this.v1.setOnGenericMotionListener(kq0Var);
        this.v1.setOnTouchListener(this.m0);
        lp lpVar = this.d0;
        if (lpVar != null) {
            kq0 kq0Var2 = this.m0;
            synchronized (lpVar) {
                d = lpVar.q;
            }
            kq0Var2.a(d, lpVar.g());
        }
        this.n0 = new ut0();
        a7 a7Var = new a7(this);
        this.i0 = a7Var;
        d7 d7Var = new d7();
        d7Var.h = nm0.d;
        d7Var.i = 0.0f;
        d7Var.j = 0.0f;
        d7Var.k = 0.0f;
        d7Var.l = 0.0f;
        d7Var.m = 0L;
        d7Var.n = 0L;
        d7Var.a = a7Var;
        d7Var.b = new c7(d7Var, 0);
        d7Var.c = new c7(d7Var, i13);
        d7Var.d = new c7(d7Var, 2);
        d7Var.e = new vy0(d7Var.b);
        d7Var.f = new vy0(d7Var.c);
        d7Var.g = new vy0(d7Var.d);
        this.j0 = d7Var;
        this.l0 = new b7(d7Var, er0.c(), er0.d());
        int iR = r71.r(JniAdExt.T2(9));
        if (!JniAdExt.s3()) {
            int iR2 = iR == 1 ? r71.r(JniAdExt.h2(io.KEY_TOUCH_MODE)) : iR;
            if (iR2 == 1) {
                iR2 = 3;
            }
            if (iR2 != iR) {
                w81.b.a(new cp(iR2));
                iR = iR2;
            }
        }
        this.l0.k(iR);
        this.w1.setOnGenericMotionListener(this.l0);
        this.w1.setOnTouchListener(this.l0);
        View decorView = qaVarG0.getWindow().getDecorView();
        this.x1 = decorView;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30) {
            decorView.setOnSystemUiVisibilityChangeListener(new to(this));
        } else if (!t70.I()) {
            decorView.setOnApplyWindowInsetsListener(this);
        }
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).S.add(this);
        }
        JniAdExt.M = this;
        JniAdExt.s1(this);
        JniAdExt.u = this;
        JniAdExt.v = this;
        JniAdExt.x = this;
        JniAdExt.I = this;
        MainApplication.v().k(this);
        if (bundle == null) {
            Bundle bundle2 = this.h;
            if (bundle2 != null) {
                string2 = bundle2.getString("addr");
                string = bundle2.getString("file");
            } else {
                string = null;
            }
        } else {
            string2 = bundle.getString("addr");
            string = bundle.getString("file");
        }
        if (MainApplication.v().n0 == 1) {
            a1();
            if (string != null) {
                if (JniAdExt.g2(io.KEY_FEATURE_SESSION_PLAYBACK)) {
                    this.b0.e("start playback of '" + string + "'...");
                    JniAdExt.I0.post(new ua0(string, i12));
                    lp lpVar2 = this.d0;
                    if (lpVar2 != null) {
                        lpVar2.v(true);
                        lpVar2.A(0);
                    }
                } else {
                    t70.g0(Y(), JniAdExt.n1("ad.dlg.availability.title"), 0);
                    V0();
                }
            } else if (string2 == null) {
                lp lpVar3 = this.d0;
                if (lpVar3 != null && !lpVar3.o()) {
                    V0();
                }
            } else if (JniAdExt.g2(io.KEY_FEATURE_CONNECT)) {
                this.b0.e("connecting to '" + string2 + "'...");
                JniAdExt.I0.post(new ua0(string2, i14));
                lp lpVar4 = this.d0;
                if (lpVar4 != null) {
                    lpVar4.v(true);
                }
            } else {
                this.C1.u(a0(), JniAdExt.n1("ad.dlg.availability.title"));
                V0();
            }
        }
        lp lpVar5 = this.d0;
        if (MainApplication.v().n0 == 3 || string != null) {
            this.v1.setVisibility(4);
            if (lpVar5 != null) {
                lpVar5.y(false);
                n1(lpVar5.h());
            }
            this.l0.k(2);
            lp lpVar6 = this.d0;
            if (lpVar6 != null && (textView = this.y0) != null) {
                textView.setText(t70.O(lpVar6.l()));
            }
            z1();
            x1();
            y1();
        } else if (lpVar5 != null) {
            lpVar5.y(true);
        }
        if (i15 < 26 || !qaVarG0.isInPictureInPictureMode()) {
            i = 0;
        } else {
            this.v1.setVisibility(4);
            this.s0.setVisibility(4);
            if (lpVar5 != null) {
                i = 0;
                lpVar5.y(false);
            } else {
                i = 0;
            }
        }
        if (lpVar5 != null) {
            lpVar5.C.e(h0(), new so(this, lpVar5, i));
        }
        ImageView imageView = this.v1;
        if (imageView != null) {
            Context context = imageView.getContext();
            vf vfVar = new vf(context);
            this.z1 = vfVar;
            Looper looper = t70.a;
            vfVar.i(uj.l(context, R.color.colorMotdText));
            this.z1.h(uj.l(context, R.color.colorBadgeBackground));
            Drawable drawable = this.v1.getDrawable();
            int intrinsicWidth = (int) (((double) drawable.getIntrinsicWidth()) * 0.9d);
            int intrinsicHeight = (int) (((double) drawable.getIntrinsicHeight()) * 0.1d);
            vf vfVar2 = this.z1;
            xf xfVar = vfVar2.g;
            if (xfVar.b.u.intValue() != 8388659) {
                xfVar.a.u = 8388659;
                xfVar.b.u = 8388659;
                vfVar2.d();
            }
            this.z1.j(intrinsicWidth);
            this.z1.m(intrinsicHeight);
            this.z1.k();
            lk0.b(this.z1, this.v1);
            this.v1.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: mo
                public final /* synthetic */ ConnectionFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i16, int i17, int i18, int i19, int i20, int i110, int i111, int i112) {
                    int i113 = i13;
                    ConnectionFragment connectionFragment = this.b;
                    switch (i113) {
                        case 0:
                            if (MainApplication.v().n0 == 3) {
                                connectionFragment.z1();
                            }
                            break;
                        default:
                            vf vfVar3 = connectionFragment.z1;
                            ImageView imageView2 = connectionFragment.v1;
                            if (vfVar3 != null && imageView2 != null) {
                                Rect rect = new Rect();
                                imageView2.getDrawingRect(rect);
                                vfVar3.setBounds(rect);
                                vfVar3.o(imageView2, null);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        if (this.F0 != null && (lu0Var = this.U0) != null && (view2 = lu0Var.a) != null) {
            Context context2 = view2.getContext();
            vf vfVar3 = new vf(context2);
            this.A1 = vfVar3;
            Looper looper2 = t70.a;
            vfVar3.i(uj.l(context2, R.color.colorMotdText));
            this.A1.h(uj.l(context2, R.color.colorBadgeBackground));
            this.A1.j(view2.getWidth() / 6);
            this.A1.m(view2.getHeight() / 6);
            this.A1.k();
            this.F0.addView(view2);
            lk0.b(this.A1, view2);
            this.F0.removeView(view2);
        }
        MainApplication.v().u.g(0, h0(), new y2(i2, this));
    }

    @Override // defpackage.ki0
    public final void G() {
        t70.Y(new uo(this, 10));
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            V0();
        }
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.z6
    public final boolean Q0() {
        return !(JniAdExt.s2(19) != 0);
    }

    public final synchronized void V0() {
        if (!l1()) {
            uj.x(Y());
        }
    }

    public final void W0() {
        ImageView imageView = this.y1;
        FrameLayout frameLayout = this.s0;
        FrameLayout frameLayout2 = this.E0;
        ImageView imageView2 = this.v1;
        View view = this.f1;
        View view2 = this.g1;
        View view3 = this.m1;
        View view4 = this.r1;
        if (imageView != null) {
            imageView.bringToFront();
        }
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        if (frameLayout2 != null) {
            frameLayout2.bringToFront();
        }
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        if (view != null && view.getVisibility() == 0) {
            view.bringToFront();
        }
        if (view2 != null && view2.getVisibility() == 0) {
            view2.bringToFront();
        }
        if (view3 != null) {
            view3.bringToFront();
        }
        if (view4 != null) {
            view4.bringToFront();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    public final void X0() {
        ImageView imageView;
        boolean z;
        boolean z2;
        ImageView imageView2 = this.v1;
        SurfaceView surfaceView = this.w1;
        kq0 kq0Var = this.m0;
        if (imageView2 != null && surfaceView != null && kq0Var != null) {
            int i = 0;
            imageView2.measure(0, 0);
            int width = surfaceView.getWidth();
            int height = surfaceView.getHeight();
            if (width > 0 && height > 0) {
                int measuredWidth = width - imageView2.getMeasuredWidth();
                int measuredHeight = height - imageView2.getMeasuredHeight();
                kq0Var.h = measuredWidth;
                kq0Var.i = measuredHeight;
                kq0Var.a(kq0Var.l, kq0Var.m);
                bp bpVar = this.L1;
                bpVar.c();
                bp bpVar2 = this.M1;
                bpVar2.c();
                b1();
                qa qaVarY = Y();
                if (qaVarY != null && (imageView = this.v1) != null && imageView.getVisibility() == 0) {
                    if (JniAdExt.h2(io.KEY_UI_ENABLE_TUTORIAL_AUTOSTART) != 1) {
                        SharedPreferences sharedPreferences = MainApplication.v().T;
                        Looper looper = t70.a;
                        try {
                            z2 = sharedPreferences.getBoolean("tutorial_conn_requested", false);
                        } catch (Throwable unused) {
                            z2 = false;
                        }
                        if (z2) {
                            SharedPreferences sharedPreferences2 = MainApplication.v().T;
                            Looper looper2 = t70.a;
                            try {
                                z = sharedPreferences2.getBoolean("tutorial_conn_finished", false);
                            } catch (Throwable unused2) {
                                z = false;
                            }
                            if (z) {
                                SharedPreferences sharedPreferences3 = MainApplication.v().T;
                                Looper looper3 = t70.a;
                                try {
                                    i = sharedPreferences3.getInt("tutorial_conn_news_version", 0);
                                } catch (Throwable unused3) {
                                }
                                if (i != 90002) {
                                    bpVar2.g(qaVarY);
                                }
                            } else {
                                bpVar.g(qaVarY);
                            }
                        }
                    } else {
                        SharedPreferences sharedPreferences4 = MainApplication.v().T;
                        Looper looper4 = t70.a;
                        z = sharedPreferences4.getBoolean("tutorial_conn_finished", false);
                        if (z) {
                            bpVar.g(qaVarY);
                        } else {
                            SharedPreferences sharedPreferences5 = MainApplication.v().T;
                            Looper looper5 = t70.a;
                            i = sharedPreferences5.getInt("tutorial_conn_news_version", 0);
                            if (i != 90002) {
                                bpVar2.g(qaVarY);
                            }
                        }
                    }
                }
            }
        }
        if (surfaceView != null) {
            je0 je0Var = this.o0;
            int width2 = surfaceView.getWidth();
            qa qaVar = je0Var.b;
            if (qaVar == null) {
                return;
            }
            GridLayout gridLayout = (GridLayout) qaVar.findViewById(R.id.kbs_extended_button_container);
            int columnCount = gridLayout.getColumnCount();
            gridLayout.getRowCount();
            Resources resources = qaVar.getResources();
            Looper looper6 = t70.a;
            int dimensionPixelSize = (width2 - (resources.getDimensionPixelSize(R.dimen.kbs_margin) * 2)) / columnCount;
            int dimensionPixelSize2 = qaVar.getResources().getDimensionPixelSize(R.dimen.kbs_key_height);
            je0Var.c(R.id.kbs_extended_button_menu, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_apps, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_home, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_back, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_volume_minus, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_volume_plus, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_power, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_ok, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_escape, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f1, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f2, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f3, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f4, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f5, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f6, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_backspace, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_sys, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_tab, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f7, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f8, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f9, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f10, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f11, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_f12, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_return, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_roll, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_caps_lock, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_shift, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_altgr, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_ins, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_pg_up, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_pos1, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_up, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_end, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_break, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_ctrl, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_win, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_alt, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_del, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_pg_down, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_left, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_down, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_right, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_extended_button_num_lock, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_shrunk_button_menu, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_shrunk_button_apps, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_shrunk_button_home, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_shrunk_button_back, dimensionPixelSize, dimensionPixelSize2);
            je0Var.c(R.id.kbs_shrunk_button_power, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public final Rational Y0() {
        vl0 vl0VarF;
        lp lpVar = this.d0;
        if (lpVar != null && (vl0VarF = lpVar.f(lpVar.b())) != null && vl0VarF.a > 0 && vl0VarF.b > 0) {
            return new Rational(vl0VarF.a, vl0VarF.b);
        }
        this.b0.h("no monitor info available: fallback aspect is 16:10");
        return new Rational(16, 10);
    }

    public final void a1() {
        Context contextA0 = a0();
        if (contextA0 != null) {
            ((InputMethodManager) contextA0.getSystemService("input_method")).hideSoftInputFromWindow(this.r0.getWindowToken(), 0);
        }
        r3.I(this.r1, 4);
        r3.I(this.s1, 8);
        r3.I(this.h1, 8);
        r3.I(this.m1, 8);
        r3.I(this.f1, 8);
        r3.I(this.g1, 8);
        W0();
    }

    public final void b1() {
        t70.Y(new uo(this, 4));
    }

    public final void c1() {
        FrameLayout frameLayout = this.E0;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        nu0 nu0Var = this.F0;
        if (nu0Var != null) {
            nu0Var.i = false;
            nu0Var.postInvalidate();
        }
        W0();
    }

    public final void d1(int i, int i2) {
        v1(0);
        ImageView imageView = this.v1;
        if (imageView != null) {
            t70.Y(new g4(this, imageView, i, i2));
        }
    }

    public final void e1() {
        lu0 lu0Var = this.T0;
        if (lu0Var != null) {
            if (!lu0Var.f) {
                this.C1.u(a0(), JniAdExt.r2(5));
            } else {
                m80 m80Var = this.a0;
                if (m80Var != null) {
                    ((MainActivity) m80Var).i0(MainApplication.v().o);
                }
            }
        }
    }

    public final void f1() {
        ImageView imageView;
        int i;
        b7 b7Var = this.l0;
        if (b7Var == null || (imageView = this.y1) == null) {
            return;
        }
        synchronized (b7Var) {
            i = b7Var.Q;
        }
        if (i != 3) {
            return;
        }
        zg0 zg0VarV2 = JniAdExt.v2();
        Bitmap bitmap = (Bitmap) zg0VarV2.h;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.ic_pointer);
        }
        if (zg0VarV2.b >= 0.0f && zg0VarV2.c >= 0.0f) {
            imageView.setVisibility(0);
        }
        u1();
    }

    public final void g1(double d) {
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        JniAdExt.I0.post(new kc0(d));
        m1(!lpVar.q());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x0166  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0219  */
    /* JADX WARN: Code duplicated, block: B:179:0x021c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0223 A[LOOP:0: B:178:0x021a->B:182:0x0223, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x022a  */
    /* JADX WARN: Code duplicated, block: B:188:0x022e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0237  */
    /* JADX WARN: Code duplicated, block: B:190:0x0241  */
    /* JADX WARN: Code duplicated, block: B:192:0x0244  */
    /* JADX WARN: Code duplicated, block: B:195:0x0250 A[LOOP:1: B:191:0x0242->B:195:0x0250, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x025b  */
    /* JADX WARN: Code duplicated, block: B:337:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    @Override // defpackage.z6, defpackage.l80
    public final boolean h(KeyEvent keyEvent) {
        KeyEvent keyEvent2;
        nu0 nu0Var;
        ie0 ie0Var;
        ie0 ie0Var2;
        boolean z;
        int i;
        ArrayList arrayList;
        int size;
        int i2;
        lu0 lu0Var;
        int i3;
        lp lpVar;
        lp lpVar2;
        lp lpVar3;
        lp lpVar4;
        lp lpVar5;
        lp lpVar6;
        lp lpVar7;
        v1(0);
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        boolean z2 = true;
        if (keyCode == 4) {
            keyEvent2 = keyEvent;
            if (keyEvent2.isFromSource(257)) {
                lp lpVar8 = this.d0;
                if (lpVar8 != null) {
                    ke0 ke0VarD = lpVar8.d();
                    ke0 ke0Var = ke0.c;
                    if (ke0VarD != ke0Var) {
                        if (action == 1) {
                            a1();
                            lpVar8.w(ke0Var);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        keyEvent2 = keyEvent;
        if (MainApplication.v().n0 != 3) {
            if (MainApplication.v().n0 != 2 || this.L1.d() || this.M1.d()) {
                return false;
            }
            if (keyCode == 82) {
                if (action != 1 || (nu0Var = this.F0) == null) {
                    return true;
                }
                if (nu0Var.i) {
                    c1();
                    return true;
                }
                s1(true);
                return true;
            }
            nu0 nu0Var2 = this.F0;
            if (nu0Var2 == null || !(z = nu0Var2.i)) {
                if (keyCode == 4) {
                    return false;
                }
                lp lpVar9 = this.d0;
                if (lpVar9 == null || lpVar9.d() != ke0.e) {
                    je0 je0Var = this.o0;
                    Logging logging = je0Var.a;
                    int action2 = keyEvent2.getAction();
                    int keyCode2 = keyEvent2.getKeyCode();
                    int modifiers = keyEvent2.getModifiers();
                    int unicodeChar = keyEvent2.getUnicodeChar();
                    boolean z3 = unicodeChar != 0;
                    ro roVar = je0Var.c;
                    if (keyCode2 != 4 && keyCode2 != 79 && keyCode2 != 82 && keyCode2 != 130 && keyCode2 != 164 && keyCode2 != 222 && keyCode2 != 24 && keyCode2 != 25 && keyCode2 != 126 && keyCode2 != 127) {
                        switch (keyCode2) {
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                                return false;
                            default:
                                de0 de0Var = action2 == 0 ? de0.d : de0.e;
                                int i4 = je0Var.e == 0 ? 3 : 2;
                                if (action2 == 0 || action2 == 1) {
                                    int i5 = be0.b.a.get(keyCode2, 0);
                                    if (i5 != 0) {
                                        if (roVar != null) {
                                            roVar.a(i5, new de0(je0Var.d.c | de0Var.c));
                                            return true;
                                        }
                                    } else if (!z3) {
                                        int i6 = be0.a.a.get(keyCode2, 0);
                                        if (i6 == 0) {
                                            logging.h("cannot inject keycode " + keyCode2);
                                            return true;
                                        }
                                        if (roVar != null) {
                                            boolean z4 = de0Var.c == 8;
                                            if (!z4 && (ie0Var2 = je0Var.g) != null) {
                                                ArrayList arrayListA = ie0Var2.a(modifiers);
                                                int size2 = arrayListA.size();
                                                int i7 = 0;
                                                while (i7 < size2) {
                                                    Object obj = arrayListA.get(i7);
                                                    i7++;
                                                    Integer num = (Integer) obj;
                                                    roVar.a(num.intValue(), new de0(de0Var.c | je0Var.d.c));
                                                    Integer num2 = (Integer) ie0.c.get(num);
                                                    if (num2 != null) {
                                                        ie0Var2.b(num2.intValue());
                                                    }
                                                }
                                            }
                                            if (!ie0.c.containsKey(Integer.valueOf(i6))) {
                                                roVar.a(i6, new de0(je0Var.d.c | de0Var.c));
                                            }
                                            if (z4 && (ie0Var = je0Var.h) != null) {
                                                ArrayList arrayListA2 = ie0Var.a(modifiers);
                                                int size3 = arrayListA2.size();
                                                int i8 = 0;
                                                while (i8 < size3) {
                                                    Object obj2 = arrayListA2.get(i8);
                                                    i8++;
                                                    Integer num3 = (Integer) obj2;
                                                    roVar.a(num3.intValue(), new de0(je0Var.d.c | de0Var.c));
                                                    Integer num4 = (Integer) ie0.c.get(num3);
                                                    if (num4 != null) {
                                                        ie0Var.b(num4.intValue());
                                                    }
                                                }
                                            }
                                        }
                                    } else if (action2 == 0) {
                                        je0Var.b(unicodeChar, i4, 1);
                                        return true;
                                    }
                                } else if (action2 == 2) {
                                    if (keyCode2 != 0) {
                                        int i9 = be0.b.a.get(keyCode2, 0);
                                        if (i9 == 0) {
                                            if (z3) {
                                                je0Var.b(unicodeChar, i4, keyEvent2.getRepeatCount());
                                                return true;
                                            }
                                            int i10 = be0.a.a.get(keyCode2, 0);
                                            if (i10 == 0) {
                                                logging.h("cannot inject keycode " + keyCode2);
                                                return true;
                                            }
                                            for (int i11 = 0; i11 < keyEvent2.getRepeatCount(); i11++) {
                                                if (roVar != null) {
                                                    roVar.b(i10, je0Var.d);
                                                }
                                                if (roVar != null) {
                                                    roVar.d(i10, je0Var.d);
                                                }
                                            }
                                        } else {
                                            for (int i12 = 0; i12 < keyEvent2.getRepeatCount(); i12++) {
                                                if (roVar != null) {
                                                    roVar.b(i9, je0Var.d);
                                                }
                                                if (roVar != null) {
                                                    roVar.d(i9, je0Var.d);
                                                }
                                            }
                                        }
                                    } else if (roVar != null) {
                                        String characters = keyEvent2.getCharacters();
                                        de0 de0Var2 = je0Var.d;
                                        roVar.d.v1(0);
                                        JniAdExt.I0.post(new c6(i4, 5, characters, de0Var2));
                                        return true;
                                    }
                                }
                                break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (keyCode != 66 && keyCode != 160) {
                        return false;
                    }
                    if (action == 1) {
                        k1();
                        return true;
                    }
                }
            } else {
                if (!z) {
                    return false;
                }
                int action3 = keyEvent2.getAction();
                int keyCode3 = keyEvent2.getKeyCode();
                if (keyCode3 != 4) {
                    switch (keyCode3) {
                        case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                        case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                        case 21:
                        case 22:
                            if (action3 == 1) {
                                lu0 lu0Var2 = nu0Var2.l;
                                lu0 lu0Var3 = null;
                                switch (keyCode3) {
                                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                        if (lu0Var2 != null) {
                                            i = lu0Var2.e + 1;
                                            if (i >= 2) {
                                                lu0Var3 = lu0Var2;
                                            }
                                        } else {
                                            i = 0;
                                        }
                                        arrayList = (ArrayList) nu0Var2.k.get(i);
                                        if (arrayList != null && (size = arrayList.size()) > 0) {
                                            switch (keyCode3) {
                                                case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                                    lu0Var3 = (lu0) arrayList.get(size / 2);
                                                    break;
                                                case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 >= size) {
                                                            lu0Var3 = (lu0) arrayList.get(size / 2);
                                                        } else {
                                                            lu0Var = (lu0) arrayList.get(i2);
                                                            if (lu0Var.h) {
                                                                lu0Var3 = lu0Var;
                                                            } else {
                                                                i2++;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 21:
                                                case 22:
                                                    i3 = 0;
                                                    while (true) {
                                                        if (i3 >= size) {
                                                            i3 = -1;
                                                        } else if (arrayList.get(i3) != lu0Var2) {
                                                            i3++;
                                                        }
                                                    }
                                                    if (i3 >= 0) {
                                                        if (keyCode3 == 21) {
                                                            lu0Var3 = (lu0) arrayList.get((i3 + 1) % size);
                                                        } else {
                                                            lu0Var3 = (lu0) arrayList.get(((i3 + size) - 1) % size);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                        if (lu0Var2 != null && (i = lu0Var2.e - 1) >= 0) {
                                            arrayList = (ArrayList) nu0Var2.k.get(i);
                                            if (arrayList != null) {
                                                switch (keyCode3) {
                                                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                                        lu0Var3 = (lu0) arrayList.get(size / 2);
                                                        break;
                                                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                                        i2 = 0;
                                                        while (true) {
                                                            if (i2 >= size) {
                                                                lu0Var3 = (lu0) arrayList.get(size / 2);
                                                            } else {
                                                                lu0Var = (lu0) arrayList.get(i2);
                                                                if (lu0Var.h) {
                                                                    lu0Var3 = lu0Var;
                                                                } else {
                                                                    i2++;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 21:
                                                    case 22:
                                                        i3 = 0;
                                                        while (true) {
                                                            if (i3 >= size) {
                                                                i3 = -1;
                                                            } else if (arrayList.get(i3) != lu0Var2) {
                                                                i3++;
                                                            }
                                                        }
                                                        if (i3 >= 0) {
                                                            if (keyCode3 == 21) {
                                                                lu0Var3 = (lu0) arrayList.get((i3 + 1) % size);
                                                            } else {
                                                                lu0Var3 = (lu0) arrayList.get(((i3 + size) - 1) % size);
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 21:
                                    case 22:
                                        if (lu0Var2 != null) {
                                            i = lu0Var2.e;
                                            arrayList = (ArrayList) nu0Var2.k.get(i);
                                            if (arrayList != null) {
                                                switch (keyCode3) {
                                                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                                        lu0Var3 = (lu0) arrayList.get(size / 2);
                                                        break;
                                                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                                        i2 = 0;
                                                        while (true) {
                                                            if (i2 >= size) {
                                                                lu0Var3 = (lu0) arrayList.get(size / 2);
                                                            } else {
                                                                lu0Var = (lu0) arrayList.get(i2);
                                                                if (lu0Var.h) {
                                                                    lu0Var3 = lu0Var;
                                                                } else {
                                                                    i2++;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 21:
                                                    case 22:
                                                        i3 = 0;
                                                        while (true) {
                                                            if (i3 >= size) {
                                                                i3 = -1;
                                                            } else if (arrayList.get(i3) != lu0Var2) {
                                                                i3++;
                                                            }
                                                        }
                                                        if (i3 >= 0) {
                                                            if (keyCode3 == 21) {
                                                                lu0Var3 = (lu0) arrayList.get((i3 + 1) % size);
                                                            } else {
                                                                lu0Var3 = (lu0) arrayList.get(((i3 + size) - 1) % size);
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                if ((lu0Var3 != lu0Var2 || (lu0Var2 != null && !lu0Var2.i)) && lu0Var3 != nu0Var2.m) {
                                    nu0Var2.m = lu0Var3;
                                    nu0Var2.b(nu0Var2.l, lu0Var3);
                                }
                                if (lu0Var3 == null && keyCode3 == 20) {
                                    nu0Var2.i = false;
                                    nu0Var2.postInvalidate();
                                    return true;
                                }
                            }
                            break;
                        case 23:
                            if (action3 == 1) {
                                lu0 lu0Var4 = nu0Var2.l;
                                lu0 lu0Var5 = nu0Var2.m;
                                if (lu0Var4 != lu0Var5) {
                                    nu0Var2.b(lu0Var4, lu0Var5);
                                }
                                lu0 lu0Var6 = nu0Var2.l;
                                if (lu0Var6 != null) {
                                    lu0Var6.c();
                                    if (lu0Var6.i) {
                                        lu0Var6.a();
                                        return true;
                                    }
                                }
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (action3 == 1) {
                    nu0Var2.i = false;
                    nu0Var2.postInvalidate();
                    return true;
                }
            }
        } else if (keyCode != 4) {
            int i13 = 10;
            if (keyCode == 62) {
                if (action == 1 && (lpVar = this.d0) != null) {
                    if (lpVar.q()) {
                        i1();
                        return true;
                    }
                    lpVar2 = this.d0;
                    if (lpVar2 != null) {
                        lpVar2.B(true);
                        JniAdExt.I0.post(new fb0(i13, z2));
                        x1();
                        n1(0);
                        return true;
                    }
                }
            } else if (keyCode == 82) {
                if (action == 1 && (lpVar3 = this.d0) != null) {
                    if (lpVar3.h() == 0) {
                        n1(4);
                        return true;
                    }
                    n1(0);
                    return true;
                }
            } else if (keyCode == 85) {
                if (action == 1) {
                    if (lpVar.q()) {
                        i1();
                        return true;
                    }
                    lpVar2 = this.d0;
                    if (lpVar2 != null) {
                        lpVar2.B(true);
                        JniAdExt.I0.post(new fb0(i13, z2));
                        x1();
                        n1(0);
                        return true;
                    }
                }
            } else if (keyCode != 111) {
                if (keyCode == 122) {
                    if (action == 1 && (lpVar4 = this.d0) != null) {
                        lpVar4.B(false);
                        JniAdExt.I0.post(new tb0(11));
                        x1();
                        n1(0);
                        return true;
                    }
                } else if (keyCode == 160 || keyCode == 66) {
                    if (action == 1 && (lpVar5 = this.d0) != null) {
                        lpVar5.D(1);
                        JniAdExt.I0.post(new ic0(lpVar5.j()));
                        y1();
                        n1(0);
                        return true;
                    }
                } else if (keyCode != 67) {
                    if (keyCode != 89) {
                        if (keyCode == 90) {
                            if (action == 1) {
                                h1();
                                return true;
                            }
                        } else if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode != 126) {
                                    if (keyCode != 127) {
                                        switch (keyCode) {
                                            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                                                if (action == 1) {
                                                    h1();
                                                    return true;
                                                }
                                                break;
                                            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                                                if (action == 1 && (lpVar7 = this.d0) != null) {
                                                    synchronized (lpVar7) {
                                                        lpVar7.j = (lpVar7.j + 4) % 5;
                                                    }
                                                    JniAdExt.I0.post(new ic0(lpVar7.j()));
                                                    y1();
                                                    n1(0);
                                                    return true;
                                                }
                                                break;
                                            case 21:
                                                if (action == 1) {
                                                    j1(-10);
                                                    return true;
                                                }
                                                break;
                                            case 22:
                                                if (action == 1) {
                                                    j1(10);
                                                    return true;
                                                }
                                                break;
                                            case 23:
                                                if (action == 1) {
                                                    if (lpVar.q()) {
                                                        i1();
                                                        return true;
                                                    }
                                                    lpVar2 = this.d0;
                                                    if (lpVar2 != null) {
                                                        lpVar2.B(true);
                                                        JniAdExt.I0.post(new fb0(i13, z2));
                                                        x1();
                                                        n1(0);
                                                        return true;
                                                    }
                                                }
                                                break;
                                            default:
                                                return false;
                                        }
                                    } else if (action == 1 && (lpVar6 = this.d0) != null) {
                                        lpVar6.B(true);
                                        JniAdExt.I0.post(new fb0(i13, z2));
                                        x1();
                                        n1(0);
                                        return true;
                                    }
                                } else if (action == 1) {
                                    i1();
                                    return true;
                                }
                            } else if (action == 1) {
                                j1(-60);
                                return true;
                            }
                        } else if (action == 1) {
                            j1(60);
                            return true;
                        }
                    } else if (action == 1) {
                        lpVar4.B(false);
                        JniAdExt.I0.post(new tb0(11));
                        x1();
                        n1(0);
                        return true;
                    }
                } else if (action == 1) {
                    uj.x(Y());
                    return true;
                }
            } else if (action == 1) {
                if (lpVar3.h() == 0) {
                    n1(4);
                    return true;
                }
                n1(0);
                return true;
            }
        } else {
            lp lpVar10 = this.d0;
            if (lpVar10 == null || lpVar10.h() != 0) {
                return false;
            }
            if (action == 1) {
                n1(4);
                return true;
            }
        }
        return true;
    }

    public final void h1() {
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        synchronized (lpVar) {
            lpVar.j = (lpVar.j + 1) % 5;
        }
        JniAdExt.I0.post(new ic0(lpVar.j()));
        y1();
        n1(0);
    }

    public final void i1() {
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        boolean z = false;
        if (lpVar.k() == lpVar.l()) {
            lpVar.B(false);
            JniAdExt.I0.post(new tb0(11));
        } else {
            lpVar.B(false);
            JniAdExt.I0.post(new fb0(10, z));
        }
        x1();
        n1(0);
    }

    public final void j1(int i) {
        boolean z;
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        synchronized (lpVar) {
            z = lpVar.h;
        }
        double dI = ((((long) i) * 1000) + (z ? lpVar.i() : lpVar.k())) / lpVar.l();
        if (dI < 0.0d) {
            dI = 0.0d;
        }
        if (dI > 1.0d) {
            dI = 1.0d;
        }
        JniAdExt.I0.post(new kc0(dI));
        n1(0);
    }

    public final void k1() {
        lp lpVar = this.d0;
        if (lpVar != null) {
            EditText editText = lpVar.p() ? this.i1 : this.n1;
            String string = editText.getText().toString();
            editText.getText().clear();
            if (string.length() > 0) {
                JniAdExt.I0.post(new ua0(string, 11));
            }
        }
    }

    public final synchronized boolean l1() {
        boolean z;
        z = this.c0;
        this.c0 = true;
        return z;
    }

    public final void m1(boolean z) {
        this.f0.removeMessages(q51.d(6));
        if (z) {
            this.f0.sendEmptyMessageDelayed(q51.d(6), 8000L);
        }
    }

    public final void n1(int i) {
        t70.Y(new yo(this, i, 0));
    }

    @Override // defpackage.z6, android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int iMax;
        if (Build.VERSION.SDK_INT < 30) {
            return view.onApplyWindowInsets(windowInsets);
        }
        int iSystemBars = WindowInsets.Type.systemBars();
        if (t70.I()) {
            iSystemBars |= WindowInsets.Type.displayCutout();
        }
        Insets insets = windowInsets.getInsets(iSystemBars);
        Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
        lp lpVar = this.d0;
        boolean z = lpVar != null && lpVar.p();
        int i = (t70.I() || z) ? insets.left : 0;
        int i2 = (t70.I() || z) ? insets.right : 0;
        int i3 = t70.I() ? insets.top : 0;
        if (t70.I()) {
            iMax = Math.max(insets2.bottom, insets.bottom);
        } else {
            int i4 = insets2.bottom;
            iMax = i4 > 0 ? i4 - insets.bottom : i4;
        }
        view.setPadding(i, i3, i2, iMax);
        if (t70.I()) {
            return WindowInsets.CONSUMED;
        }
        View view2 = this.r1;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.rightMargin = i2;
            view2.setLayoutParams(layoutParams);
        }
        View view3 = this.h1;
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.leftMargin = i;
            layoutParams2.rightMargin = i2;
            view3.setLayoutParams(layoutParams2);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // defpackage.r80
    public final void onWindowFocusChanged(boolean z) {
        Context contextA0;
        ClipboardManager clipboardManager;
        ClipDescription primaryClipDescription;
        boolean z2;
        if (!z) {
            this.f0.removeMessages(q51.d(5));
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && (contextA0 = a0()) != null && (clipboardManager = (ClipboardManager) contextA0.getSystemService("clipboard")) != null && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            boolean zK1 = JniAdExt.K1();
            lp lpVar = this.d0;
            synchronized (lpVar) {
                z2 = lpVar.c;
            }
            long timestamp = primaryClipDescription.getTimestamp();
            long jC = this.d0.c();
            long jE = this.d0.e();
            if (zK1 && z2 && timestamp > jC && jC != 0 && timestamp > jE) {
                JniAdExt.v4();
                this.d0.x(timestamp);
            }
        }
        this.f0.removeMessages(q51.d(5));
        this.f0.sendEmptyMessageDelayed(q51.d(5), 250L);
        this.d0.J(true);
    }

    public final void p1() {
        lp lpVar;
        lp lpVar2 = this.d0;
        if (lpVar2 == null) {
            return;
        }
        a1();
        int iOrdinal = lpVar2.d().ordinal();
        if (iOrdinal == 1) {
            lp lpVar3 = this.d0;
            if (lpVar3 != null) {
                EditText editText = lpVar3.p() ? this.i1 : this.n1;
                ConnectionRootView connectionRootView = this.r0;
                if (connectionRootView != null) {
                    if (editText != null && a0() != null) {
                        ((InputMethodManager) a0().getSystemService("input_method")).showSoftInput(editText, 0);
                    }
                    t1(connectionRootView, 500L);
                }
            }
            q1();
            W0();
            return;
        }
        if (iOrdinal == 2) {
            lp lpVar4 = this.d0;
            if (lpVar4 == null) {
                return;
            }
            View view = lpVar4.p() ? this.h1 : this.m1;
            EditText editText2 = lpVar4.p() ? this.i1 : this.n1;
            FloatingActionButton floatingActionButton = lpVar4.p() ? this.k1 : this.p1;
            FloatingActionButton floatingActionButton2 = lpVar4.p() ? this.l1 : this.q1;
            if (view != null && editText2 != null) {
                A1(editText2.getText().toString(), floatingActionButton, floatingActionButton2);
                view.setVisibility(0);
                lp lpVar5 = this.d0;
                if (lpVar5 != null) {
                    EditText editText3 = lpVar5.p() ? this.i1 : this.n1;
                    ConnectionRootView connectionRootView2 = this.r0;
                    if (editText3 != null) {
                        if (connectionRootView2 != null && a0() != null) {
                            ((InputMethodManager) a0().getSystemService("input_method")).showSoftInput(connectionRootView2, 0);
                        }
                        t1(editText3, 500L);
                    }
                }
                q1();
            }
            W0();
            return;
        }
        if (iOrdinal == 3 && (lpVar = this.d0) != null) {
            if (lpVar.n() == 1) {
                lpVar.H(JniAdExt.J2());
            }
            qa qaVarG0 = G0();
            View viewFindViewById = qaVarG0.findViewById(R.id.kbs_extended_button_win);
            Context contextA0 = a0();
            int i = lpVar.n() == 5 ? R.drawable.toggle_button_cmd : R.drawable.toggle_button_win;
            Looper looper = t70.a;
            Drawable drawable = contextA0.getDrawable(i);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(drawable);
            }
            if (lpVar.m() == 0) {
                long jI2 = JniAdExt.I2();
                synchronized (lpVar) {
                    lpVar.n = jI2;
                }
            }
            boolean z = (lpVar.m() & 2097152) == 2097152;
            int i2 = z ? 0 : 8;
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_menu), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_apps), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_home), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_back), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_volume_minus), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_volume_plus), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_power), i2);
            r3.I(qaVarG0.findViewById(R.id.kbs_extended_button_ok), i2);
            View view2 = (z && lpVar.r()) ? this.g1 : this.f1;
            if (view2 != null) {
                view2.setVisibility(0);
                r3.I(this.s1, i2);
                q1();
                lp lpVar6 = this.d0;
                FloatingActionButton floatingActionButton3 = this.s1;
                if (lpVar6 != null && floatingActionButton3 != null) {
                    floatingActionButton3.setImageResource(lpVar6.r() ? R.drawable.ic_key_extend : R.drawable.ic_key_shrink);
                }
            }
            W0();
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.d0 = MainApplication.v().r;
    }

    public final void q1() {
        lp lpVar = this.d0;
        if (lpVar != null) {
            boolean zP = lpVar.p();
            View view = this.r1;
            if (zP) {
                ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388661;
            } else {
                ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388693;
            }
            r3.I(this.r1, 0);
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c0 = false;
        G0().setTitle("");
        return layoutInflater.inflate(R.layout.fragment_connection, viewGroup, false);
    }

    public final void r1() {
        t70.Y(new uo(this, 3));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.d0 = null;
    }

    public final void s1(boolean z) {
        int i;
        lu0 lu0Var;
        View view;
        ArrayList arrayList;
        int size;
        nu0 nu0Var = this.F0;
        ImageView imageView = this.v1;
        if (nu0Var == null || imageView == null) {
            return;
        }
        this.T0.f = JniAdExt.s2(12) != 0;
        this.U0.f = JniAdExt.s2(13) != 0;
        this.V0.d.clear();
        lp lpVar = this.d0;
        if (lpVar != null) {
            this.G0.g = lpVar.p();
        }
        this.V0.d(this.G0);
        int iX2 = JniAdExt.x2();
        int iL2 = JniAdExt.l2();
        int i2 = 0;
        while (i2 < iX2) {
            StringBuilder sb = new StringBuilder("");
            int i3 = i2 + 1;
            sb.append(i3);
            String string = sb.toString();
            Context contextA0 = a0();
            String strConcat = "monitor-".concat(string);
            String str = String.format(JniAdExt.n1("ad.menu.pie.tooltip.monitor_n"), string);
            lu0 lu0Var2 = new lu0(strConcat, new vo(this, i2));
            lu0Var2.b = str;
            TextView textView = new TextView(contextA0);
            Looper looper = t70.a;
            textView.setTextColor(uj.l(contextA0, R.color.colorPieText));
            textView.setTextSize(0, contextA0.getResources().getDimensionPixelSize(R.dimen.pie_text_size));
            textView.setText(string);
            lu0Var2.a = textView;
            lu0Var2.g = i2 == iL2;
            this.V0.d(lu0Var2);
            i2 = i3;
        }
        boolean zF3 = JniAdExt.F3();
        lu0 lu0Var3 = this.L0;
        lu0Var3.f = zF3;
        if (zF3) {
            lu0Var3.g = JniAdExt.L0.a == 2;
        }
        this.H0.f = JniAdExt.w3();
        this.R0.f = JniAdExt.D3();
        this.I0.f = JniAdExt.A3();
        this.J0.f = JniAdExt.u3();
        this.J0.g = JniAdExt.H2();
        boolean zB3 = JniAdExt.B3();
        this.K0.f = JniAdExt.P1() && JniAdExt.s2(15) != 0;
        lu0 lu0Var4 = this.K0;
        lu0Var4.g = zB3;
        Context contextA1 = a0();
        int i4 = zB3 ? R.drawable.ic_pie_record_session_pause : R.drawable.ic_pie_record_session;
        ImageView imageView2 = new ImageView(contextA1);
        imageView2.setImageResource(i4);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        Looper looper2 = t70.a;
        imageView2.setColorFilter(uj.l(contextA1, R.color.colorPieText));
        lu0Var4.a = imageView2;
        this.K0.b = zB3 ? JniAdExt.n1("ad.main_bar.stop_recording") : JniAdExt.n1("ad.main_bar.start_recording");
        this.M0.f = JniAdExt.y3() || JniAdExt.z3();
        this.O0.f = JniAdExt.h3();
        this.P0.f = JniAdExt.J1();
        this.c1.g = false;
        this.b1.g = false;
        this.d1.g = false;
        b7 b7Var = this.l0;
        synchronized (b7Var) {
            i = b7Var.Q;
        }
        int iR = q51.r(i);
        if (iR == 0) {
            this.d1.g = true;
        } else if (iR == 1) {
            this.b1.g = true;
        } else if (iR == 2) {
            this.c1.g = true;
        }
        this.d1.f = JniAdExt.s3();
        imageView.measure(0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        int measuredWidth = imageView.getMeasuredWidth() / 2;
        int measuredHeight = imageView.getMeasuredHeight() / 2;
        int i5 = layoutParams.leftMargin + measuredWidth;
        int i6 = layoutParams.topMargin + measuredHeight;
        FrameLayout frameLayout = this.E0;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        b7 b7Var2 = this.l0;
        if (b7Var2 != null) {
            b7Var2.j();
        }
        ArrayList arrayList2 = nu0Var.k;
        Point point = nu0Var.c;
        point.x = i5;
        point.y = i6;
        nu0Var.i = true;
        nu0Var.l = null;
        nu0Var.m = null;
        ArrayList arrayList3 = nu0Var.j;
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList3.get(i7);
            i7++;
            ((lu0) obj).f(false);
        }
        for (int i8 = 0; i8 < 2; i8++) {
            arrayList2.set(i8, null);
        }
        arrayList2.set(0, arrayList3);
        if (z && (arrayList = (ArrayList) arrayList2.get(0)) != null && (size = arrayList.size()) > 0) {
            lu0 lu0Var5 = (lu0) arrayList.get(size / 2);
            nu0Var.m = lu0Var5;
            nu0Var.b(nu0Var.l, lu0Var5);
        }
        for (int i9 = 0; i9 < 2; i9++) {
            nu0Var.c(i9, (List) arrayList2.get(i9));
        }
        nu0Var.postInvalidate();
        nu0 nu0Var2 = this.F0;
        if (nu0Var2 != null && (lu0Var = this.U0) != null && this.A1 != null && (view = lu0Var.a) != null) {
            nu0Var2.addView(view);
            vf vfVar = this.A1;
            if (vfVar != null) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                vfVar.setBounds(rect);
                vfVar.o(view, null);
            }
            this.F0.removeView(view);
        }
        W0();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.b0.e("surfaceChanged(): w=" + i2 + ", h=" + i3);
        JniAdExt.M3(surfaceHolder.getSurface());
        X0();
        v1(0);
        t70.Y(new uo(this, 2));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        JniAdExt.M3(null);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        l1();
        this.L1.c();
        this.M1.c();
        b1();
        MainApplication.v().P(this);
        ut0 ut0Var = this.n0;
        if (ut0Var != null) {
            ut0Var.a(false);
            ut0Var.c.setTimeListener(null);
            this.n0 = null;
        }
        View view = this.x1;
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 30) {
                view.setOnSystemUiVisibilityChangeListener(null);
            } else if (!t70.I()) {
                view.setOnApplyWindowInsetsListener(null);
            }
            View view2 = this.x1;
            if (i >= 30 && !t70.I()) {
                view2.setPadding(0, 0, 0, 0);
            }
            this.x1 = null;
        }
        ConnectionRootView connectionRootView = this.r0;
        if (connectionRootView != null) {
            connectionRootView.removeCallbacks(this.g0);
            this.r0.setKeyEventListener(null);
            this.r0 = null;
        }
        View view3 = this.h1;
        if (view3 != null) {
            view3.setVisibility(8);
            this.h1 = null;
        }
        View view4 = this.m1;
        if (view4 != null) {
            view4.setVisibility(8);
            this.m1 = null;
        }
        View view5 = this.f1;
        if (view5 != null) {
            view5.setVisibility(8);
            this.f1 = null;
        }
        View view6 = this.g1;
        if (view6 != null) {
            view6.setVisibility(8);
            this.g1 = null;
        }
        View view7 = this.r1;
        if (view7 != null) {
            view7.setVisibility(8);
            this.r1 = null;
        }
        this.u0.setOnGenericMotionListener(null);
        this.u0.setOnTouchListener(null);
        this.z0.setOnClickListener(null);
        this.A0.setOnClickListener(null);
        this.B0.setOnClickListener(null);
        this.C0.setOnClickListener(null);
        this.j1.setOnClickListener(null);
        this.o1.setOnClickListener(null);
        this.s1.setOnClickListener(null);
        this.t1.setOnClickListener(null);
        this.u1.setOnClickListener(null);
        this.l1.setOnClickListener(null);
        this.q1.setOnClickListener(null);
        this.k1.setOnClickListener(null);
        this.p1.setOnClickListener(null);
        this.s0 = null;
        this.u0 = null;
        this.t0 = null;
        this.v0 = null;
        this.w0 = null;
        this.y0 = null;
        this.x0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.i1.removeTextChangedListener(this.J1);
        this.i1 = null;
        this.n1.removeTextChangedListener(this.K1);
        this.n1 = null;
        this.j1 = null;
        this.o1 = null;
        this.s1 = null;
        this.t1 = null;
        this.u1 = null;
        this.l1 = null;
        this.q1 = null;
        this.k1 = null;
        this.p1 = null;
        this.E0 = null;
        nu0 nu0Var = this.F0;
        if (nu0Var != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                nu0Var.k.set(i2, null);
            }
            nu0Var.j.clear();
            nu0Var.l = null;
            nu0Var.m = null;
            nu0Var.n = null;
            nu0Var.o = null;
            nu0Var.p = null;
            nu0Var.q = null;
            nu0Var.r = null;
            nu0Var.s = null;
            nu0Var.t = null;
            nu0Var.u = null;
            this.F0 = null;
        }
        lu0 lu0Var = this.G0;
        if (lu0Var != null) {
            lu0Var.e();
            this.G0 = null;
        }
        lu0 lu0Var2 = this.L0;
        if (lu0Var2 != null) {
            lu0Var2.e();
            this.L0 = null;
        }
        lu0 lu0Var3 = this.H0;
        if (lu0Var3 != null) {
            lu0Var3.e();
            this.H0 = null;
        }
        lu0 lu0Var4 = this.R0;
        if (lu0Var4 != null) {
            lu0Var4.e();
            this.R0 = null;
        }
        lu0 lu0Var5 = this.I0;
        if (lu0Var5 != null) {
            lu0Var5.e();
            this.I0 = null;
        }
        lu0 lu0Var6 = this.J0;
        if (lu0Var6 != null) {
            lu0Var6.e();
            this.J0 = null;
        }
        lu0 lu0Var7 = this.K0;
        if (lu0Var7 != null) {
            lu0Var7.e();
            this.K0 = null;
        }
        lu0 lu0Var8 = this.Q0;
        if (lu0Var8 != null) {
            lu0Var8.e();
            this.Q0 = null;
        }
        lu0 lu0Var9 = this.M0;
        if (lu0Var9 != null) {
            lu0Var9.e();
            this.M0 = null;
        }
        lu0 lu0Var10 = this.N0;
        if (lu0Var10 != null) {
            lu0Var10.e();
            this.N0 = null;
        }
        lu0 lu0Var11 = this.O0;
        if (lu0Var11 != null) {
            lu0Var11.e();
            this.O0 = null;
        }
        lu0 lu0Var12 = this.P0;
        if (lu0Var12 != null) {
            lu0Var12.e();
            this.P0 = null;
        }
        lu0 lu0Var13 = this.S0;
        if (lu0Var13 != null) {
            lu0Var13.e();
            this.S0 = null;
        }
        lu0 lu0Var14 = this.T0;
        if (lu0Var14 != null) {
            lu0Var14.e();
            this.T0 = null;
        }
        this.A1 = null;
        lu0 lu0Var15 = this.U0;
        if (lu0Var15 != null) {
            lu0Var15.e();
            this.U0 = null;
        }
        lu0 lu0Var16 = this.V0;
        if (lu0Var16 != null) {
            lu0Var16.e();
            this.V0 = null;
        }
        lu0 lu0Var17 = this.W0;
        if (lu0Var17 != null) {
            lu0Var17.e();
            this.W0 = null;
        }
        lu0 lu0Var18 = this.X0;
        if (lu0Var18 != null) {
            lu0Var18.e();
            this.X0 = null;
        }
        lu0 lu0Var19 = this.Y0;
        if (lu0Var19 != null) {
            lu0Var19.e();
            this.Y0 = null;
        }
        lu0 lu0Var20 = this.Z0;
        if (lu0Var20 != null) {
            lu0Var20.e();
            this.Z0 = null;
        }
        lu0 lu0Var21 = this.a1;
        if (lu0Var21 != null) {
            lu0Var21.e();
            this.a1 = null;
        }
        lu0 lu0Var22 = this.b1;
        if (lu0Var22 != null) {
            lu0Var22.e();
            this.b1 = null;
        }
        lu0 lu0Var23 = this.c1;
        if (lu0Var23 != null) {
            lu0Var23.e();
            this.c1 = null;
        }
        lu0 lu0Var24 = this.d1;
        if (lu0Var24 != null) {
            lu0Var24.e();
            this.d1 = null;
        }
        lu0 lu0Var25 = this.e1;
        if (lu0Var25 != null) {
            lu0Var25.e();
            this.e1 = null;
        }
        this.y1 = null;
        this.m0 = null;
        this.z1 = null;
        ImageView imageView = this.v1;
        if (imageView != null) {
            imageView.setOnTouchListener(null);
            this.v1 = null;
        }
        SurfaceView surfaceView = this.w1;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
            this.w1.setOnGenericMotionListener(null);
            this.w1.setOnTouchListener(null);
            this.w1 = null;
        }
        JniAdExt.I = null;
        JniAdExt.x = null;
        JniAdExt.v = null;
        JniAdExt.u = null;
        JniAdExt.U3(this);
        JniAdExt.M = null;
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).S.remove(this);
        }
        v01 v01Var = this.h0;
        if (v01Var != null) {
            synchronized (v01Var) {
                vy0 vy0Var = v01Var.c;
                if (vy0Var != null) {
                    vy0Var.d();
                }
            }
            v01Var.a = null;
            v01Var.c.d();
            v01Var.c = null;
            v01Var.b = null;
            this.h0 = null;
        }
        u01 u01Var = this.k0;
        if (u01Var != null) {
            u01Var.g = null;
            this.k0 = null;
        }
        d7 d7Var = this.j0;
        if (d7Var != null) {
            d7Var.a();
            this.j0 = null;
        }
        a7 a7Var = this.i0;
        if (a7Var != null) {
            a7Var.b();
            this.i0 = null;
        }
        b7 b7Var = this.l0;
        if (b7Var != null) {
            b7Var.K = null;
            this.l0 = null;
        }
        je0 je0Var = this.o0;
        if (je0Var != null) {
            je0Var.a(R.id.kbs_extended_button_menu);
            je0Var.a(R.id.kbs_extended_button_apps);
            je0Var.a(R.id.kbs_extended_button_home);
            je0Var.a(R.id.kbs_extended_button_back);
            je0Var.a(R.id.kbs_extended_button_volume_minus);
            je0Var.a(R.id.kbs_extended_button_volume_plus);
            je0Var.a(R.id.kbs_extended_button_power);
            je0Var.a(R.id.kbs_extended_button_ok);
            je0Var.a(R.id.kbs_extended_button_escape);
            je0Var.a(R.id.kbs_extended_button_f1);
            je0Var.a(R.id.kbs_extended_button_f2);
            je0Var.a(R.id.kbs_extended_button_f3);
            je0Var.a(R.id.kbs_extended_button_f4);
            je0Var.a(R.id.kbs_extended_button_f5);
            je0Var.a(R.id.kbs_extended_button_f6);
            je0Var.a(R.id.kbs_extended_button_backspace);
            je0Var.a(R.id.kbs_extended_button_sys);
            je0Var.a(R.id.kbs_extended_button_tab);
            je0Var.a(R.id.kbs_extended_button_f7);
            je0Var.a(R.id.kbs_extended_button_f8);
            je0Var.a(R.id.kbs_extended_button_f9);
            je0Var.a(R.id.kbs_extended_button_f10);
            je0Var.a(R.id.kbs_extended_button_f11);
            je0Var.a(R.id.kbs_extended_button_f12);
            je0Var.a(R.id.kbs_extended_button_return);
            je0Var.a(R.id.kbs_extended_button_roll);
            je0Var.a(R.id.kbs_extended_button_caps_lock);
            je0Var.e(R.id.kbs_extended_button_shift, null);
            je0Var.e(R.id.kbs_extended_button_altgr, null);
            je0Var.a(R.id.kbs_extended_button_ins);
            je0Var.a(R.id.kbs_extended_button_pg_up);
            je0Var.a(R.id.kbs_extended_button_pos1);
            je0Var.a(R.id.kbs_extended_button_up);
            je0Var.a(R.id.kbs_extended_button_end);
            je0Var.a(R.id.kbs_extended_button_break);
            je0Var.e(R.id.kbs_extended_button_ctrl, null);
            je0Var.e(R.id.kbs_extended_button_win, null);
            je0Var.e(R.id.kbs_extended_button_alt, null);
            je0Var.a(R.id.kbs_extended_button_del);
            je0Var.a(R.id.kbs_extended_button_pg_down);
            je0Var.a(R.id.kbs_extended_button_left);
            je0Var.a(R.id.kbs_extended_button_down);
            je0Var.a(R.id.kbs_extended_button_right);
            je0Var.a(R.id.kbs_extended_button_num_lock);
            je0Var.a(R.id.kbs_shrunk_button_menu);
            je0Var.a(R.id.kbs_shrunk_button_apps);
            je0Var.a(R.id.kbs_shrunk_button_home);
            je0Var.a(R.id.kbs_shrunk_button_back);
            je0Var.a(R.id.kbs_shrunk_button_power);
            je0Var.b = null;
            je0Var.c = null;
            je0Var.g = null;
            je0Var.h = null;
            this.o0 = null;
        }
        bc bcVar = this.p0;
        if (bcVar != null) {
            bcVar.e = null;
            this.p0 = null;
        }
        gq0 gq0Var = this.q0;
        if (gq0Var != null) {
            gq0Var.b();
            this.q0 = null;
        }
        HandlerThread handlerThread = this.e0;
        if (handlerThread != null) {
            handlerThread.quit();
            this.e0 = null;
        }
        this.f0 = null;
        this.d0.C.k(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Runnable, no] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t1(final View view, long j) {
        if (this.r0 == null) {
            return;
        }
        view.requestFocus();
        if (a0() != null ? ((InputMethodManager) a0().getSystemService("input_method")).showSoftInput(view, 0) : false) {
            return;
        }
        if (j <= 0) {
            return;
        }
        long j2 = j > 400 ? 100L : 200L;
        final long j3 = j > j2 ? j - j2 : 0L;
        this.r0.removeCallbacks(this.g0);
        ?? r7 = new Runnable() { // from class: no
            @Override // java.lang.Runnable
            public final void run() {
                this.c.t1(view, j3);
            }
        };
        this.g0 = r7;
        this.r0.postDelayed(r7, j2);
    }

    public final void u1() {
        ImageView imageView;
        int i;
        b7 b7Var = this.l0;
        if (b7Var == null || (imageView = this.y1) == null) {
            return;
        }
        synchronized (b7Var) {
            i = b7Var.Q;
        }
        if (i != 3) {
            return;
        }
        zg0 zg0VarV2 = JniAdExt.v2();
        float f = zg0VarV2.b;
        float f2 = zg0VarV2.d;
        float f3 = zg0VarV2.f;
        o1(imageView, (int) (f - (f2 * f3)), (int) (zg0VarV2.c - (zg0VarV2.e * f3)));
        if (zg0VarV2.b < 0.0f || zg0VarV2.c < 0.0f) {
            return;
        }
        imageView.setVisibility(0);
    }

    public final void v1(int i) {
        t70.Y(new yo(this, i, 3));
    }

    public final void w1(boolean z) {
        qa qaVarY = Y();
        if (qaVarY != null) {
            Rational rationalY0 = Y0();
            Rational rational = new Rational(16, 10);
            try {
                qaVarY.setPictureInPictureParams(Z0(rationalY0, z));
            } catch (Exception e) {
                boolean zEquals = rationalY0.equals(rational);
                Logging logging = this.b0;
                if (zEquals) {
                    logging.a("Failed to set PiP params: " + e.getMessage());
                } else {
                    try {
                        qaVarY.setPictureInPictureParams(Z0(rational, z));
                    } catch (Exception e2) {
                        logging.a("Failed to set PiP params: " + e2.getMessage());
                    }
                }
            }
        }
    }

    @Override // defpackage.n80
    public final boolean x() {
        bp bpVar = this.L1;
        if (bpVar.d()) {
            bpVar.a();
            return true;
        }
        bp bpVar2 = this.M1;
        if (!bpVar2.d()) {
            return false;
        }
        bpVar2.a();
        return true;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void x0() {
        kq0 kq0Var;
        super.x0();
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).s0(this);
        }
        lp lpVar = this.d0;
        if (lpVar != null && (kq0Var = this.m0) != null) {
            double d = kq0Var.l;
            synchronized (lpVar) {
                lpVar.q = d;
                SharedPreferences sharedPreferences = lpVar.F;
                Looper looper = t70.a;
                sharedPreferences.edit().putFloat("nubsi_pos_x", (float) d).commit();
            }
            lpVar.G(kq0Var.m);
        }
        Context contextA0 = a0();
        if (contextA0 != null) {
            ((InputMethodManager) contextA0.getSystemService("input_method")).hideSoftInputFromWindow(this.r0.getWindowToken(), 0);
        }
        c1();
        iq0 iq0Var = this.m0.e;
        iq0Var.c = 0;
        iq0Var.d = false;
    }

    public final void x1() {
        ImageButton imageButton;
        lp lpVar = this.d0;
        if (lpVar == null || (imageButton = this.B0) == null) {
            return;
        }
        if (lpVar.q()) {
            imageButton.setImageResource(R.drawable.ic_playback_play);
        } else {
            imageButton.setImageResource(R.drawable.ic_playback_pause);
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        super.y0();
        if (this.a0 != null) {
            zd zdVar = MainActivity.j0;
            synchronized (zdVar) {
                zdVar.add(this);
            }
        }
        X0();
        W0();
    }

    public final void y1() {
        int i;
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        Spinner spinner = this.D0;
        synchronized (lpVar) {
            i = lpVar.j;
        }
        spinner.setSelection(i);
    }

    @Override // defpackage.ki0
    public final void z() {
    }

    public final void z1() {
        boolean z;
        lp lpVar = this.d0;
        if (lpVar == null) {
            return;
        }
        View view = this.t0;
        View view2 = this.v0;
        View view3 = this.w0;
        long jL = lpVar.l();
        if (view != null && view2 != null && view3 != null && jL > 0) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            float f = jL;
            layoutParams.width = (int) ((lpVar.k() / f) * view.getWidth());
            view2.setLayoutParams(layoutParams);
            synchronized (lpVar) {
                z = lpVar.h;
            }
            if (z) {
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                layoutParams2.width = (int) (((lpVar.i() / f) * view.getWidth()) - layoutParams.width);
                view3.setLayoutParams(layoutParams2);
                view3.setVisibility(0);
            } else {
                view3.setVisibility(4);
            }
        }
        TextView textView = this.x0;
        if (textView != null) {
            textView.setText(t70.O(lpVar.k()));
        }
    }
}
