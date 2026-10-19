package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spanned;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.GridAutofitLayoutManager;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AdNestedScrollView;
import com.anydesk.anydeskandroid.gui.element.AutoResizeTextView;
import com.anydesk.anydeskandroid.gui.element.CheckableImageView;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.a51;
import defpackage.aj0;
import defpackage.ap;
import defpackage.at;
import defpackage.b3;
import defpackage.bc;
import defpackage.bu0;
import defpackage.c6;
import defpackage.cd0;
import defpackage.cj0;
import defpackage.cp;
import defpackage.cz0;
import defpackage.d21;
import defpackage.dj;
import defpackage.du0;
import defpackage.er0;
import defpackage.ev;
import defpackage.f;
import defpackage.f91;
import defpackage.fd0;
import defpackage.gi;
import defpackage.gq0;
import defpackage.h;
import defpackage.hd0;
import defpackage.i4;
import defpackage.i7;
import defpackage.ii0;
import defpackage.io;
import defpackage.ip0;
import defpackage.ji0;
import defpackage.jl0;
import defpackage.jr0;
import defpackage.k61;
import defpackage.kd0;
import defpackage.ki0;
import defpackage.l61;
import defpackage.lg;
import defpackage.lk0;
import defpackage.m;
import defpackage.m80;
import defpackage.m91;
import defpackage.mi0;
import defpackage.n80;
import defpackage.nd0;
import defpackage.ni0;
import defpackage.nr0;
import defpackage.nu;
import defpackage.oi0;
import defpackage.pi0;
import defpackage.q51;
import defpackage.qa;
import defpackage.qi;
import defpackage.qi0;
import defpackage.r3;
import defpackage.r80;
import defpackage.ri0;
import defpackage.si0;
import defpackage.so;
import defpackage.t70;
import defpackage.t81;
import defpackage.uj;
import defpackage.vf;
import defpackage.vt;
import defpackage.w30;
import defpackage.w81;
import defpackage.we0;
import defpackage.wi0;
import defpackage.xi0;
import defpackage.xt0;
import defpackage.y6;
import defpackage.yi0;
import defpackage.z1;
import defpackage.z6;
import defpackage.z80;
import defpackage.zd;
import defpackage.zl0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MainFragment extends z6 implements jl0, cz0, n80, r80, cd0, ki0, ji0, d21, kd0, fd0, hd0 {
    public RecyclerView A0;
    public final oi0 A1;
    public GridAutofitLayoutManager B0;
    public final ri0 B1;
    public l61 C0;
    public aj0 D0;
    public final dj D1;
    public View E0;
    public final ii0 E1;
    public View F0;
    public final yi0 F1;
    public View G0;
    public final yi0 G1;
    public vf H0;
    public final h H1;
    public vf I0;
    public View J0;
    public View K0;
    public View L0;
    public TextView M0;
    public View N0;
    public View O0;
    public ImageView P0;
    public ImageView Q0;
    public View R0;
    public ImageView S0;
    public View T0;
    public View U0;
    public View V0;
    public AdEditText W0;
    public TextView X0;
    public TextView Y0;
    public TextView Z0;
    public nr0 a1;
    public AdNestedScrollView b1;
    public cj0 c0;
    public CardView c1;
    public bc d0;
    public CardView d1;
    public gq0 e0;
    public CardView e1;
    public ImageView f0;
    public View f1;
    public ImageView g0;
    public LinearLayout g1;
    public ImageView h0;
    public LinearLayout h1;
    public CheckableImageView i0;
    public LinearLayout i1;
    public CheckableImageView j0;
    public LinearLayout j1;
    public CheckableImageView k0;
    public ImageView k1;
    public CheckableImageView l0;
    public ImageView l1;
    public LinearLayout m0;
    public gi m1;
    public LinearLayout n0;
    public gi n1;
    public vf o0;
    public View p0;
    public long p1;
    public View q0;
    public final w30 q1;
    public TextView r0;
    public final w30 r1;
    public ArrayList s0;
    public final w30 s1;
    public ArrayList t0;
    public ArrayList u0;
    public ArrayList v0;
    public final ni0 v1;
    public ArrayList w0;
    public final oi0 w1;
    public ArrayList x0;
    public final oi0 x1;
    public LinkedHashMap y0;
    public final oi0 y1;
    public k61 z0;
    public final oi0 z1;
    public final Logging b0 = new Logging("MainFragment");
    public final xt0 o1 = new xt0(this);
    public final y6 t1 = new y6(this, new f(11, this));
    public final qi0 u1 = new qi0(18, this);
    public final b3 C1 = new b3(4, this);

    /* JADX WARN: Type inference failed for: r0v14, types: [oi0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [oi0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [oi0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [oi0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [oi0] */
    public MainFragment() {
        final int i = 2;
        final int i2 = 0;
        this.q1 = (w30) F0(new ri0(i2, this), new i4(i));
        final int i3 = 1;
        this.r1 = (w30) F0(new ri0(i3, this), new i4(i3));
        final int i4 = 3;
        this.s1 = (w30) F0(new ri0(i4, this), new i4(i3));
        this.v1 = new ni0(i2, this);
        this.w1 = new View.OnLayoutChangeListener() { // from class: oi0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i2;
                MainFragment mainFragment = this;
                switch (i13) {
                    case 0:
                        LinearLayout linearLayout = mainFragment.h1;
                        if (linearLayout != null) {
                            linearLayout.post(mainFragment.v1);
                        }
                        break;
                    case 1:
                        LinearLayout linearLayout2 = mainFragment.i1;
                        Resources resourcesF0 = mainFragment.f0();
                        Looper looper = t70.a;
                        int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_button_layout_max_width);
                        if (linearLayout2 != null && linearLayout2.getWidth() > dimensionPixelSize) {
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            layoutParams.width = dimensionPixelSize;
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = mainFragment.i1;
                        LinearLayout linearLayout4 = mainFragment.m0;
                        LinearLayout linearLayout5 = mainFragment.n0;
                        ImageView imageView = mainFragment.h0;
                        ImageView imageView2 = mainFragment.g0;
                        ImageView imageView3 = mainFragment.f0;
                        if (linearLayout3 != null && linearLayout4 != null && linearLayout5 != null && imageView != null && imageView2 != null && imageView3 != null) {
                            boolean z = linearLayout3.getWidth() >= linearLayout5.getWidth() + linearLayout4.getWidth();
                            linearLayout4.setVisibility(z ? 0 : 8);
                            imageView.setVisibility(z ? 8 : 0);
                        }
                        mainFragment.c1();
                        break;
                    case 2:
                        mainFragment.m1();
                        break;
                    case 3:
                        vf vfVar = mainFragment.H0;
                        View view2 = mainFragment.G0;
                        if (vfVar != null && view2 != null) {
                            Rect rect = new Rect();
                            view2.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(view2, null);
                            break;
                        }
                        break;
                    default:
                        vf vfVar2 = mainFragment.I0;
                        View view3 = mainFragment.R0;
                        if (vfVar2 != null && view3 != null) {
                            Rect rect2 = new Rect();
                            view3.getDrawingRect(rect2);
                            vfVar2.setBounds(rect2);
                            vfVar2.o(view3, null);
                            break;
                        }
                        break;
                }
            }
        };
        this.x1 = new View.OnLayoutChangeListener() { // from class: oi0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i3;
                MainFragment mainFragment = this;
                switch (i13) {
                    case 0:
                        LinearLayout linearLayout = mainFragment.h1;
                        if (linearLayout != null) {
                            linearLayout.post(mainFragment.v1);
                        }
                        break;
                    case 1:
                        LinearLayout linearLayout2 = mainFragment.i1;
                        Resources resourcesF0 = mainFragment.f0();
                        Looper looper = t70.a;
                        int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_button_layout_max_width);
                        if (linearLayout2 != null && linearLayout2.getWidth() > dimensionPixelSize) {
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            layoutParams.width = dimensionPixelSize;
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = mainFragment.i1;
                        LinearLayout linearLayout4 = mainFragment.m0;
                        LinearLayout linearLayout5 = mainFragment.n0;
                        ImageView imageView = mainFragment.h0;
                        ImageView imageView2 = mainFragment.g0;
                        ImageView imageView3 = mainFragment.f0;
                        if (linearLayout3 != null && linearLayout4 != null && linearLayout5 != null && imageView != null && imageView2 != null && imageView3 != null) {
                            boolean z = linearLayout3.getWidth() >= linearLayout5.getWidth() + linearLayout4.getWidth();
                            linearLayout4.setVisibility(z ? 0 : 8);
                            imageView.setVisibility(z ? 8 : 0);
                        }
                        mainFragment.c1();
                        break;
                    case 2:
                        mainFragment.m1();
                        break;
                    case 3:
                        vf vfVar = mainFragment.H0;
                        View view2 = mainFragment.G0;
                        if (vfVar != null && view2 != null) {
                            Rect rect = new Rect();
                            view2.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(view2, null);
                            break;
                        }
                        break;
                    default:
                        vf vfVar2 = mainFragment.I0;
                        View view3 = mainFragment.R0;
                        if (vfVar2 != null && view3 != null) {
                            Rect rect2 = new Rect();
                            view3.getDrawingRect(rect2);
                            vfVar2.setBounds(rect2);
                            vfVar2.o(view3, null);
                            break;
                        }
                        break;
                }
            }
        };
        this.y1 = new View.OnLayoutChangeListener() { // from class: oi0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i;
                MainFragment mainFragment = this;
                switch (i13) {
                    case 0:
                        LinearLayout linearLayout = mainFragment.h1;
                        if (linearLayout != null) {
                            linearLayout.post(mainFragment.v1);
                        }
                        break;
                    case 1:
                        LinearLayout linearLayout2 = mainFragment.i1;
                        Resources resourcesF0 = mainFragment.f0();
                        Looper looper = t70.a;
                        int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_button_layout_max_width);
                        if (linearLayout2 != null && linearLayout2.getWidth() > dimensionPixelSize) {
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            layoutParams.width = dimensionPixelSize;
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = mainFragment.i1;
                        LinearLayout linearLayout4 = mainFragment.m0;
                        LinearLayout linearLayout5 = mainFragment.n0;
                        ImageView imageView = mainFragment.h0;
                        ImageView imageView2 = mainFragment.g0;
                        ImageView imageView3 = mainFragment.f0;
                        if (linearLayout3 != null && linearLayout4 != null && linearLayout5 != null && imageView != null && imageView2 != null && imageView3 != null) {
                            boolean z = linearLayout3.getWidth() >= linearLayout5.getWidth() + linearLayout4.getWidth();
                            linearLayout4.setVisibility(z ? 0 : 8);
                            imageView.setVisibility(z ? 8 : 0);
                        }
                        mainFragment.c1();
                        break;
                    case 2:
                        mainFragment.m1();
                        break;
                    case 3:
                        vf vfVar = mainFragment.H0;
                        View view2 = mainFragment.G0;
                        if (vfVar != null && view2 != null) {
                            Rect rect = new Rect();
                            view2.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(view2, null);
                            break;
                        }
                        break;
                    default:
                        vf vfVar2 = mainFragment.I0;
                        View view3 = mainFragment.R0;
                        if (vfVar2 != null && view3 != null) {
                            Rect rect2 = new Rect();
                            view3.getDrawingRect(rect2);
                            vfVar2.setBounds(rect2);
                            vfVar2.o(view3, null);
                            break;
                        }
                        break;
                }
            }
        };
        this.z1 = new View.OnLayoutChangeListener() { // from class: oi0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i4;
                MainFragment mainFragment = this;
                switch (i13) {
                    case 0:
                        LinearLayout linearLayout = mainFragment.h1;
                        if (linearLayout != null) {
                            linearLayout.post(mainFragment.v1);
                        }
                        break;
                    case 1:
                        LinearLayout linearLayout2 = mainFragment.i1;
                        Resources resourcesF0 = mainFragment.f0();
                        Looper looper = t70.a;
                        int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_button_layout_max_width);
                        if (linearLayout2 != null && linearLayout2.getWidth() > dimensionPixelSize) {
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            layoutParams.width = dimensionPixelSize;
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = mainFragment.i1;
                        LinearLayout linearLayout4 = mainFragment.m0;
                        LinearLayout linearLayout5 = mainFragment.n0;
                        ImageView imageView = mainFragment.h0;
                        ImageView imageView2 = mainFragment.g0;
                        ImageView imageView3 = mainFragment.f0;
                        if (linearLayout3 != null && linearLayout4 != null && linearLayout5 != null && imageView != null && imageView2 != null && imageView3 != null) {
                            boolean z = linearLayout3.getWidth() >= linearLayout5.getWidth() + linearLayout4.getWidth();
                            linearLayout4.setVisibility(z ? 0 : 8);
                            imageView.setVisibility(z ? 8 : 0);
                        }
                        mainFragment.c1();
                        break;
                    case 2:
                        mainFragment.m1();
                        break;
                    case 3:
                        vf vfVar = mainFragment.H0;
                        View view2 = mainFragment.G0;
                        if (vfVar != null && view2 != null) {
                            Rect rect = new Rect();
                            view2.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(view2, null);
                            break;
                        }
                        break;
                    default:
                        vf vfVar2 = mainFragment.I0;
                        View view3 = mainFragment.R0;
                        if (vfVar2 != null && view3 != null) {
                            Rect rect2 = new Rect();
                            view3.getDrawingRect(rect2);
                            vfVar2.setBounds(rect2);
                            vfVar2.o(view3, null);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 4;
        this.A1 = new View.OnLayoutChangeListener() { // from class: oi0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                int i14 = i5;
                MainFragment mainFragment = this;
                switch (i14) {
                    case 0:
                        LinearLayout linearLayout = mainFragment.h1;
                        if (linearLayout != null) {
                            linearLayout.post(mainFragment.v1);
                        }
                        break;
                    case 1:
                        LinearLayout linearLayout2 = mainFragment.i1;
                        Resources resourcesF0 = mainFragment.f0();
                        Looper looper = t70.a;
                        int dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_button_layout_max_width);
                        if (linearLayout2 != null && linearLayout2.getWidth() > dimensionPixelSize) {
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            layoutParams.width = dimensionPixelSize;
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = mainFragment.i1;
                        LinearLayout linearLayout4 = mainFragment.m0;
                        LinearLayout linearLayout5 = mainFragment.n0;
                        ImageView imageView = mainFragment.h0;
                        ImageView imageView2 = mainFragment.g0;
                        ImageView imageView3 = mainFragment.f0;
                        if (linearLayout3 != null && linearLayout4 != null && linearLayout5 != null && imageView != null && imageView2 != null && imageView3 != null) {
                            boolean z = linearLayout3.getWidth() >= linearLayout5.getWidth() + linearLayout4.getWidth();
                            linearLayout4.setVisibility(z ? 0 : 8);
                            imageView.setVisibility(z ? 8 : 0);
                        }
                        mainFragment.c1();
                        break;
                    case 2:
                        mainFragment.m1();
                        break;
                    case 3:
                        vf vfVar = mainFragment.H0;
                        View view2 = mainFragment.G0;
                        if (vfVar != null && view2 != null) {
                            Rect rect = new Rect();
                            view2.getDrawingRect(rect);
                            vfVar.setBounds(rect);
                            vfVar.o(view2, null);
                            break;
                        }
                        break;
                    default:
                        vf vfVar2 = mainFragment.I0;
                        View view3 = mainFragment.R0;
                        if (vfVar2 != null && view3 != null) {
                            Rect rect2 = new Rect();
                            view3.getDrawingRect(rect2);
                            vfVar2.setBounds(rect2);
                            vfVar2.o(view3, null);
                            break;
                        }
                        break;
                }
            }
        };
        this.B1 = new ri0(i, this);
        dj djVar = new dj();
        djVar.d = this;
        djVar.c = false;
        this.D1 = djVar;
        this.E1 = new ii0(1, this);
        this.F1 = new yi0(i2, this);
        this.G1 = new yi0(i3, this);
        this.H1 = new h(2, this);
    }

    public static void R0(MainFragment mainFragment) {
        MainApplication.q(mainFragment.a0());
        JniAdExt.I0.post(new cp(MainApplication.v().D, 22));
        MainApplication.v().E = false;
        mainFragment.l1();
    }

    public static void S0(MainFragment mainFragment, String str) {
        if (JniAdExt.s2(12) == 0) {
            mainFragment.o1.u(mainFragment.a0(), JniAdExt.r2(5));
            return;
        }
        m80 m80Var = mainFragment.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).i0(str);
        }
    }

    public static void T0(MainFragment mainFragment) {
        if ("demo".equals(mainFragment.a1())) {
            mainFragment.e1("");
        }
    }

    public static void U0(MainFragment mainFragment) {
        MainApplication.q(mainFragment.a0());
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            mainFragment.q1.a(Intent.createChooser(intent, JniAdExt.n1("ad.status.select_files.chooser.upload.msg")));
        } catch (Throwable unused) {
            mainFragment.o1.u(mainFragment.a0(), JniAdExt.n1("ad.status.select_files.no_filemanager.msg.android"));
        }
    }

    public static void V0(MainFragment mainFragment, View view, int i) {
        if (!view.isActivated()) {
            mainFragment.o1.u(mainFragment.a0(), JniAdExt.r2(6));
            return;
        }
        bc bcVar = mainFragment.d0;
        if (bcVar != null) {
            bcVar.o0(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public static void W0(MainFragment mainFragment) {
        boolean z;
        int i;
        boolean z2;
        qa qaVarY = mainFragment.Y();
        if (qaVarY == null) {
            return;
        }
        if (JniAdExt.h2(io.KEY_UI_ENABLE_TUTORIAL_AUTOSTART) != 1) {
            SharedPreferences sharedPreferences = MainApplication.v().T;
            Looper looper = t70.a;
            try {
                z2 = sharedPreferences.getBoolean("tutorial_main_requested", false);
            } catch (Throwable unused) {
                z2 = false;
            }
            if (z2) {
                SharedPreferences sharedPreferences2 = MainApplication.v().T;
                Looper looper2 = t70.a;
                try {
                    z = sharedPreferences2.getBoolean("tutorial_main_finished", false);
                } catch (Throwable unused2) {
                    z = false;
                }
                if (!z) {
                    mainFragment.F1.g(qaVarY);
                    return;
                }
                SharedPreferences sharedPreferences3 = MainApplication.v().T;
                Looper looper3 = t70.a;
                try {
                    i = sharedPreferences3.getInt("tutorial_main_news_version", 0);
                } catch (Throwable unused3) {
                    i = 0;
                }
                if (i != 90002) {
                    mainFragment.G1.g(qaVarY);
                    return;
                }
            }
        } else {
            SharedPreferences sharedPreferences4 = MainApplication.v().T;
            Looper looper4 = t70.a;
            z = sharedPreferences4.getBoolean("tutorial_main_finished", false);
            if (!z) {
                mainFragment.F1.g(qaVarY);
                return;
            }
            SharedPreferences sharedPreferences5 = MainApplication.v().T;
            Looper looper5 = t70.a;
            i = sharedPreferences5.getInt("tutorial_main_news_version", 0);
            if (i != 90002) {
                mainFragment.G1.g(qaVarY);
                return;
            }
        }
        mainFragment.Z0(false);
    }

    public static void X0(MainFragment mainFragment, String str) {
        if (str == null) {
            return;
        }
        Looper looper = t70.a;
        if (!JniAdExt.n3(str.replaceAll("[\r\n\t ]", ""))) {
            mainFragment.o1.u(mainFragment.a0(), JniAdExt.n1("ad.dlg.closed.invalid_addr.title"));
            return;
        }
        ArrayList arrayListY2 = JniAdExt.y2();
        bc bcVar = mainFragment.d0;
        if (!arrayListY2.isEmpty() && bcVar != null) {
            bcVar.m0((zl0) arrayListY2.get(0), str);
            return;
        }
        m80 m80Var = mainFragment.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).k0(str);
        }
    }

    public static void h1(View view, String str, List list) {
        if (list.isEmpty()) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        ((TextView) view.findViewById(R.id.card_pending_files_info)).setText(str);
        ((TextView) view.findViewById(R.id.card_pending_files_count)).setText(String.format(list.size() == 1 ? JniAdExt.n1("ad.file_op_info.title.file") : JniAdExt.n1("ad.file_op_info.title.files"), Integer.valueOf(list.size())));
        view.findViewById(R.id.card_pending_files_close).setOnClickListener(new z1(4));
    }

    @Override // defpackage.cz0
    public final void A(String str, long j) {
        JniAdExt.c4(str, j);
        t70.Y(new xi0(3, this));
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        Looper looper = t70.a;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        cj0 cj0Var;
        super.C0(view, bundle);
        this.b1 = (AdNestedScrollView) view.findViewById(R.id.main_fragment_scroll_view);
        this.c1 = (CardView) view.findViewById(R.id.own_addr_card);
        this.d1 = (CardView) view.findViewById(R.id.disconnect_incoming_card);
        this.e1 = (CardView) view.findViewById(R.id.disconnect_outgoing_card);
        this.f1 = view.findViewById(R.id.addr_card);
        this.g1 = (LinearLayout) view.findViewById(R.id.main_fragment_card_subcontainer_wide_screen);
        this.h1 = (LinearLayout) view.findViewById(R.id.main_fragment_card_container);
        this.i1 = (LinearLayout) view.findViewById(R.id.speed_dial_btn_container);
        this.j1 = (LinearLayout) view.findViewById(R.id.speed_dial_container);
        this.A0 = (RecyclerView) view.findViewById(R.id.speed_dial);
        this.E0 = view.findViewById(R.id.button_incoming_offer_file);
        this.F0 = view.findViewById(R.id.button_incoming_accept_files);
        this.G0 = view.findViewById(R.id.button_incoming_chat);
        this.J0 = view.findViewById(R.id.button_incoming_restart_capture);
        this.K0 = view.findViewById(R.id.button_incoming_action_overflow);
        this.L0 = view.findViewById(R.id.button_incoming_action_overflow_bottom);
        this.M0 = (TextView) view.findViewById(R.id.disconnect_incoming_card_restart_capture_text);
        this.N0 = view.findViewById(R.id.button_disconnect_incoming);
        this.O0 = view.findViewById(R.id.button_disconnect_outgoing);
        this.P0 = (ImageView) view.findViewById(R.id.button_show_outgoing);
        this.Q0 = (ImageView) view.findViewById(R.id.button_browse_files_outgoing);
        this.R0 = view.findViewById(R.id.button_outgoing_chat);
        this.S0 = (ImageView) view.findViewById(R.id.button_show_vpn_outgoing);
        this.T0 = view.findViewById(R.id.addr_card_action_container);
        this.U0 = view.findViewById(R.id.button_connect);
        this.V0 = view.findViewById(R.id.button_addr_action_overflow);
        this.W0 = (AdEditText) view.findViewById(R.id.ad_addr_input_container);
        this.X0 = (TextView) view.findViewById(R.id.disconnect_incoming_card_text);
        this.Y0 = (TextView) view.findViewById(R.id.disconnect_outgoing_card_text);
        this.Z0 = (TextView) view.findViewById(R.id.disconnect_outgoing_card_vpn_status);
        this.k1 = (ImageView) view.findViewById(R.id.disconnect_incoming_card_user_image);
        this.l1 = (ImageView) view.findViewById(R.id.disconnect_outgoing_card_user_image);
        this.f0 = (ImageView) view.findViewById(R.id.btn_speed_dial_scroll_hint_top);
        this.g0 = (ImageView) view.findViewById(R.id.btn_speed_dial_size);
        this.h0 = (ImageView) view.findViewById(R.id.btn_speed_dial_category);
        this.i0 = (CheckableImageView) view.findViewById(R.id.btn_speed_dial_category_all_devices);
        this.j0 = (CheckableImageView) view.findViewById(R.id.btn_speed_dial_category_star);
        this.k0 = (CheckableImageView) view.findViewById(R.id.btn_speed_dial_category_recent);
        this.l0 = (CheckableImageView) view.findViewById(R.id.btn_speed_dial_category_discover);
        this.m0 = (LinearLayout) view.findViewById(R.id.btn_speed_dial_category_individual_layout);
        this.n0 = (LinearLayout) view.findViewById(R.id.btn_speed_dial_general_control_layout);
        this.p0 = view.findViewById(R.id.disconnect_incoming_card_file_progress_total);
        this.q0 = view.findViewById(R.id.disconnect_incoming_card_file_progress);
        this.r0 = (TextView) view.findViewById(R.id.disconnect_incoming_card_file_progress_text);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.own_addr_layout_vertical);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.own_addr_layout_horizontal);
        nr0 nr0Var = new nr0();
        int i = 1;
        nr0Var.s = true;
        nr0Var.a = linearLayout;
        nr0Var.b = linearLayout2;
        nr0Var.c = linearLayout == null ? null : (TextView) linearLayout.findViewById(R.id.own_addr_card_title);
        LinearLayout linearLayout3 = nr0Var.b;
        nr0Var.d = linearLayout3 == null ? null : (TextView) linearLayout3.findViewById(R.id.own_addr_card_title);
        LinearLayout linearLayout4 = nr0Var.a;
        nr0Var.e = linearLayout4 == null ? null : (AutoResizeTextView) linearLayout4.findViewById(R.id.own_addr);
        LinearLayout linearLayout5 = nr0Var.b;
        nr0Var.f = linearLayout5 == null ? null : (AutoResizeTextView) linearLayout5.findViewById(R.id.own_addr);
        LinearLayout linearLayout6 = nr0Var.a;
        nr0Var.g = linearLayout6 == null ? null : linearLayout6.findViewById(R.id.own_addr_card_override_password_msg_container);
        LinearLayout linearLayout7 = nr0Var.b;
        nr0Var.h = linearLayout7 == null ? null : linearLayout7.findViewById(R.id.own_addr_card_override_password_msg_container);
        LinearLayout linearLayout8 = nr0Var.a;
        nr0Var.i = linearLayout8 == null ? null : (TextView) linearLayout8.findViewById(R.id.own_addr_card_override_password_msg);
        LinearLayout linearLayout9 = nr0Var.b;
        nr0Var.j = linearLayout9 == null ? null : (TextView) linearLayout9.findViewById(R.id.own_addr_card_override_password_msg);
        LinearLayout linearLayout10 = nr0Var.a;
        nr0Var.k = linearLayout10 == null ? null : linearLayout10.findViewById(R.id.button_own_addr_help);
        LinearLayout linearLayout11 = nr0Var.b;
        nr0Var.l = linearLayout11 == null ? null : linearLayout11.findViewById(R.id.button_own_addr_help);
        LinearLayout linearLayout12 = nr0Var.a;
        nr0Var.m = linearLayout12 == null ? null : linearLayout12.findViewById(R.id.button_own_addr_set_password);
        LinearLayout linearLayout13 = nr0Var.b;
        nr0Var.n = linearLayout13 == null ? null : linearLayout13.findViewById(R.id.button_own_addr_set_password);
        LinearLayout linearLayout14 = nr0Var.a;
        nr0Var.o = linearLayout14 == null ? null : linearLayout14.findViewById(R.id.button_own_addr_share);
        LinearLayout linearLayout15 = nr0Var.b;
        nr0Var.p = linearLayout15 == null ? null : linearLayout15.findViewById(R.id.button_own_addr_share);
        LinearLayout linearLayout16 = nr0Var.a;
        nr0Var.q = linearLayout16 == null ? null : (ImageView) linearLayout16.findViewById(R.id.button_own_addr_setup);
        LinearLayout linearLayout17 = nr0Var.b;
        nr0Var.r = linearLayout17 != null ? (ImageView) linearLayout17.findViewById(R.id.button_own_addr_setup) : null;
        this.a1 = nr0Var;
        int i2 = 4;
        this.b1.setOnScrollChangeListener(new ri0(i2, this));
        bu0.D(this.f0, JniAdExt.n1("ad.menu.speed_dial.scroll_hint_top"));
        this.f0.setOnClickListener(new qi0(19, this));
        ImageView imageView = this.g0;
        int i3 = 6;
        if (imageView != null) {
            Context context = imageView.getContext();
            vf vfVar = new vf(context);
            this.o0 = vfVar;
            Looper looper = t70.a;
            vfVar.i(uj.l(context, R.color.colorMotdText));
            this.o0.h(uj.l(context, R.color.colorBadgeBackground));
            this.o0.j(f0().getDimensionPixelSize(R.dimen.main_fragment_button_width) / 6);
            this.o0.m(f0().getDimensionPixelSize(R.dimen.main_fragment_button_height) / 6);
            this.o0.k();
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.C1);
        G0().O(this, this);
        this.d0 = new bc(Z(), 19);
        this.e0 = new gq0(a0());
        int i4 = 5;
        t70.Y(new qi(this, JniAdExt.l, i4));
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new LinkedHashMap();
        i1();
        this.r0.setOnClickListener(new qi0(20, this));
        this.E0.setActivated(true);
        bu0.D(this.E0, JniAdExt.n1("ad.menu.pie.tooltip.upload"));
        this.E0.setOnClickListener(new qi0(21, this));
        bu0.D(this.F0, JniAdExt.n1("ad.accept.file_transfer.btn"));
        this.F0.setOnClickListener(new qi0(22, this));
        int i5 = 13;
        int i6 = 0;
        this.G0.setActivated(JniAdExt.s2(13) != 0);
        bu0.D(this.G0, JniAdExt.n1("ad.chat.open"));
        this.G0.setOnClickListener(new qi0(i6, this));
        bu0.D(this.J0, JniAdExt.n1("ad.msg.capture_restart.android"));
        this.J0.setActivated(true);
        this.J0.setOnClickListener(new pi0());
        this.M0.setText(JniAdExt.n1("ad.msg.capture_restart.android"));
        qi0 qi0Var = new qi0(i, this);
        this.K0.setOnClickListener(qi0Var);
        r3.E(this.L0, qi0Var);
        bu0.D(this.N0, JniAdExt.n1("ad.accept.btn.disconnect"));
        int i7 = 2;
        this.N0.setOnClickListener(new qi0(i7, this));
        bu0.D(this.P0, JniAdExt.n1("ad.connect.show.btn"));
        int i8 = 3;
        this.P0.setOnClickListener(new qi0(i8, this));
        bu0.D(this.Q0, JniAdExt.n1("ad.status.tooltip.file_manager"));
        this.Q0.setOnClickListener(new qi0(i2, this));
        this.R0.setActivated(JniAdExt.s2(13) != 0);
        bu0.D(this.R0, JniAdExt.n1("ad.chat.open"));
        this.R0.setOnClickListener(new qi0(i4, this));
        bu0.D(this.S0, JniAdExt.n1("ad.status.tooltip.vpn"));
        this.S0.setOnClickListener(new m(4, this));
        bu0.D(this.O0, JniAdExt.n1("ad.accept.btn.disconnect"));
        this.O0.setOnClickListener(new z1(i7));
        bu0.D(this.U0, JniAdExt.n1("ad.connect.connect.btn"));
        this.U0.setOnClickListener(new qi0(i3, this));
        this.V0.setOnClickListener(new qi0(7, this));
        this.W0.setFilter("[\r\n\t]");
        this.W0.setTextListener(this.B1);
        this.W0.setHint(JniAdExt.n1("ad.main_bar.enter_address"));
        this.t1.g();
        this.g0.setOnClickListener(new qi0(8, this));
        this.h0.setOnClickListener(new qi0(9, this));
        this.g0.setOnLongClickListener(new si0(i6, this));
        this.h0.setOnLongClickListener(new si0(i, this));
        bu0.D(this.i0, JniAdExt.n1("ad.menu.speed_dial.category.all"));
        this.i0.setOnClickListener(new qi0(10, this));
        bu0.D(this.j0, JniAdExt.n1("ad.menu.speed_dial.category.favorite"));
        this.j0.setOnClickListener(new qi0(11, this));
        bu0.D(this.k0, JniAdExt.n1("ad.menu.speed_dial.category.recent"));
        this.k0.setOnClickListener(new qi0(12, this));
        bu0.D(this.l0, JniAdExt.n1("ad.menu.speed_dial.category.discover"));
        this.l0.setOnClickListener(new qi0(i5, this));
        nr0 nr0Var2 = this.a1;
        String strN1 = JniAdExt.n1("ad.connect.share.mobile");
        r3.F(nr0Var2.c, strN1);
        r3.F(nr0Var2.d, strN1);
        nr0 nr0Var3 = this.a1;
        qi0 qi0Var2 = new qi0(14, this);
        r3.E(nr0Var3.e, qi0Var2);
        r3.E(nr0Var3.f, qi0Var2);
        nr0 nr0Var4 = this.a1;
        si0 si0Var = new si0(i7, this);
        AutoResizeTextView autoResizeTextView = nr0Var4.e;
        if (autoResizeTextView != null) {
            autoResizeTextView.setOnLongClickListener(si0Var);
        }
        AutoResizeTextView autoResizeTextView2 = nr0Var4.f;
        if (autoResizeTextView2 != null) {
            autoResizeTextView2.setOnLongClickListener(si0Var);
        }
        nr0 nr0Var5 = this.a1;
        String strN2 = JniAdExt.n1("ad.connect.share.set_passwd");
        r3.H(nr0Var5.m, strN2);
        r3.H(nr0Var5.n, strN2);
        nr0 nr0Var6 = this.a1;
        z1 z1Var = new z1(i8);
        r3.E(nr0Var6.m, z1Var);
        r3.E(nr0Var6.n, z1Var);
        nr0 nr0Var7 = this.a1;
        String strN3 = JniAdExt.n1("ad.connect.share.password_preset");
        r3.F(nr0Var7.i, strN3);
        r3.F(nr0Var7.j, strN3);
        nr0 nr0Var8 = this.a1;
        String strO1 = JniAdExt.o1("ad.cid.help.href");
        r3.H(nr0Var8.k, strO1);
        r3.H(nr0Var8.l, strO1);
        nr0 nr0Var9 = this.a1;
        qi0 qi0Var3 = new qi0(15, this);
        r3.E(nr0Var9.k, qi0Var3);
        r3.E(nr0Var9.l, qi0Var3);
        nr0 nr0Var10 = this.a1;
        String strN4 = JniAdExt.n1("ad.abook.item.share.tooltip");
        r3.H(nr0Var10.o, strN4);
        r3.H(nr0Var10.p, strN4);
        nr0 nr0Var11 = this.a1;
        qi0 qi0Var4 = new qi0(16, this);
        r3.E(nr0Var11.o, qi0Var4);
        r3.E(nr0Var11.p, qi0Var4);
        nr0 nr0Var12 = this.a1;
        String strN5 = JniAdExt.n1("ad.menu.setup");
        r3.H(nr0Var12.q, strN5);
        r3.H(nr0Var12.r, strN5);
        nr0 nr0Var13 = this.a1;
        qi0 qi0Var5 = new qi0(17, this);
        r3.E(nr0Var13.q, qi0Var5);
        r3.E(nr0Var13.r, qi0Var5);
        aj0 aj0Var = new aj0(this, I0());
        this.D0 = aj0Var;
        this.A0.s.add(aj0Var);
        l61 l61Var = new l61(this, er0.c(), er0.d());
        this.C0 = l61Var;
        this.j1.setOnTouchListener(l61Var);
        this.j1.setOnGenericMotionListener(this.C0);
        JniAdExt.y = this;
        JniAdExt.H4(this);
        JniAdExt.z1(this);
        JniAdExt.s1(this);
        JniAdExt.P = this;
        JniAdExt.Q = this;
        zd zdVar = JniAdExt.r;
        synchronized (zdVar) {
            zdVar.add(this);
        }
        JniAdExt.x1(this);
        m80 m80Var = this.a0;
        if (m80Var != null) {
            MainActivity mainActivity = (MainActivity) m80Var;
            mainActivity.S.add(this);
            mainActivity.Q = this;
            mainActivity.R = this;
        }
        n1();
        o1();
        MainApplication.v().k(this);
        MainApplication.v().j(this);
        MainApplication.v().X = this;
        this.p1 = 0L;
        cj0 cj0Var2 = this.c0;
        if (cj0Var2 != null) {
            cj0Var2.d.e(h0(), new vt(i7, this));
            cj0Var2.e.e(h0(), new so(this, cj0Var2, i));
            cj0Var2.g.e(h0(), new mi0(i6, this));
        }
        this.h1.addOnLayoutChangeListener(this.w1);
        this.i1.addOnLayoutChangeListener(this.x1);
        this.p0.addOnLayoutChangeListener(this.y1);
        View view2 = this.G0;
        if (view2 != null) {
            Context context2 = view2.getContext();
            vf vfVar2 = new vf(context2);
            this.H0 = vfVar2;
            vfVar2.i(uj.l(context2, R.color.colorMotdText));
            this.H0.h(uj.l(context2, R.color.colorBadgeBackground));
            this.H0.j(f0().getDimensionPixelSize(R.dimen.main_fragment_button_width) / 6);
            this.H0.m(f0().getDimensionPixelSize(R.dimen.main_fragment_button_height) / 6);
            this.H0.k();
            lk0.b(this.H0, this.G0);
            this.G0.addOnLayoutChangeListener(this.z1);
        }
        View view3 = this.R0;
        if (view3 != null) {
            Context context3 = view3.getContext();
            vf vfVar3 = new vf(context3);
            this.I0 = vfVar3;
            vfVar3.i(uj.l(context3, R.color.colorMotdText));
            this.I0.h(uj.l(context3, R.color.colorBadgeBackground));
            this.I0.j(f0().getDimensionPixelSize(R.dimen.main_fragment_button_width) / 6);
            this.I0.m(f0().getDimensionPixelSize(R.dimen.main_fragment_button_height) / 6);
            this.I0.k();
            lk0.b(this.I0, this.R0);
            this.R0.addOnLayoutChangeListener(this.A1);
        }
        b1();
        if (this.H == null || (cj0Var = this.c0) == null) {
            return;
        }
        cj0Var.g(0, h0(), new mi0(i7, this));
    }

    @Override // defpackage.fd0
    public final void D(int i) {
        l1();
    }

    @Override // defpackage.ji0
    public final void E() {
        t70.Y(new xi0(1, this));
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new xi0(11, this));
    }

    @Override // defpackage.ki0
    public final void G() {
        t70.Y(new xi0(6, this));
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        t70.Y(new xi0(4, this));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.ji0
    public final void T() {
        t70.Y(new ni0(1, this));
    }

    @Override // defpackage.ji0
    public final void U() {
        t70.Y(new xi0(2, this));
    }

    public final void Y0() {
        cj0 cj0Var = this.c0;
        if (cj0Var == null) {
            return;
        }
        h hVar = this.H1;
        hVar.c.clear();
        hVar.a(this.s0);
        hVar.a(this.t0);
        hVar.a(this.u0);
        int iR = q51.r(cj0Var.d());
        if (iR == 0) {
            hVar.a(this.v0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.w0;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                SpeedDialItem speedDialItem = (SpeedDialItem) obj;
                if (!speedDialItem.mIsFavorite) {
                    arrayList.add(speedDialItem);
                }
            }
            hVar.a(arrayList);
            hVar.a(this.x0);
        } else if (iR == 1) {
            hVar.a(this.v0);
        } else if (iR == 2) {
            hVar.a(this.w0);
        } else if (iR != 3) {
            this.b0.a("unhandled speed dial category");
        } else {
            hVar.a(this.x0);
        }
        hVar.c();
    }

    public final void Z0(boolean z) {
        qa qaVarY = Y();
        MainApplication mainApplicationV = MainApplication.v();
        if (qaVarY == null || mainApplicationV == null) {
            return;
        }
        if (nd0.l(qaVarY, this.e0) != 3 || JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_SETUP_PROMPT) == 0) {
            Bitmap bitmap = JniAdExt.a;
            t70.V(new i7(8));
        } else if (!mainApplicationV.J || z) {
            t70.V(new i7(7));
            mainApplicationV.J = true;
        }
    }

    public final String a1() {
        AdEditText adEditText = this.W0;
        Logging logging = this.b0;
        if (adEditText == null) {
            logging.a("cannot find address widget");
            return null;
        }
        String text = adEditText.getText();
        if (text != null) {
            return text;
        }
        logging.a("cannot get address content");
        return null;
    }

    public final void b1() {
        int i;
        if (this.H == null || this.c0 == null || (i = MainApplication.v().D) == 0) {
            return;
        }
        this.c0.g(i, h0(), new mi0(1, this));
    }

    public final void c1() {
        LinearLayout linearLayout;
        GridAutofitLayoutManager gridAutofitLayoutManager = this.B0;
        if (gridAutofitLayoutManager != null) {
            if (gridAutofitLayoutManager.F != 1) {
                gridAutofitLayoutManager.s1(1);
            }
            AdNestedScrollView adNestedScrollView = this.b1;
            if (adNestedScrollView == null || (linearLayout = this.j1) == null) {
                return;
            }
            int height = adNestedScrollView.getHeight();
            int height2 = adNestedScrollView.getHeight();
            LinearLayout linearLayout2 = this.h1;
            if (linearLayout2 != null) {
                height -= linearLayout2.getHeight();
            }
            LinearLayout linearLayout3 = this.i1;
            if (linearLayout3 != null) {
                height2 -= linearLayout3.getHeight();
                height -= linearLayout3.getHeight();
            }
            Resources resourcesF0 = f0();
            Looper looper = t70.a;
            int dimensionPixelSize = f0().getDimensionPixelSize(R.dimen.speed_dial_item_small_bottom_margin) + f0().getDimensionPixelSize(R.dimen.speed_dial_item_small_top_margin) + resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_item_height);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (height >= dimensionPixelSize) {
                height2 = height;
            }
            layoutParams.height = height2;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.fd0
    public final void d(int i) {
        l1();
    }

    public final void d1() {
        SpeedDialItem[] speedDialItemArrX2 = JniAdExt.X2();
        this.y0.clear();
        this.v0.clear();
        this.w0.clear();
        this.x0.clear();
        f1();
        this.t0.clear();
        if (JniAdExt.g2(io.KEY_FEATURE_TELEMETRY) && JniAdExt.g2(io.KEY_UI_SHOW_TILE_TELEMETRY) && !JniAdExt.Z2()) {
            ArrayList arrayList = this.t0;
            Context contextI0 = I0();
            Looper looper = t70.a;
            arrayList.add(new f91(7, uj.l(contextI0, R.color.colorTelemetryGradient1), uj.l(contextI0, R.color.colorTelemetryGradient2)));
        }
        int i = 0;
        for (SpeedDialItem speedDialItem : speedDialItemArrX2) {
            this.y0.put(Long.valueOf(speedDialItem.mCid), speedDialItem);
            if (speedDialItem.mIsFavorite) {
                this.v0.add(speedDialItem);
            }
            this.w0.add(speedDialItem);
        }
        this.u0 = JniAdExt.A2();
        ArrayList arrayListN2 = JniAdExt.n2();
        int size = arrayListN2.size();
        while (i < size) {
            Object obj = arrayListN2.get(i);
            i++;
            nu nuVar = (nu) obj;
            if (!this.y0.containsKey(Long.valueOf(nuVar.a))) {
                this.x0.add(nuVar);
            }
        }
        Y0();
        m80 m80Var = this.a0;
        if (m80Var != null) {
            MainActivity mainActivity = (MainActivity) m80Var;
            a51 a51Var = mainActivity.F;
            a51Var.getClass();
            if (Build.VERSION.SDK_INT < 25) {
                return;
            }
            w81.b.a(new at(a51Var, mainActivity, speedDialItemArrX2, 2));
        }
    }

    @Override // defpackage.kd0
    public final void e(int i, int i2, boolean z) {
        t70.Y(new c6(this, JniAdExt.f3(i, i2, z), i));
    }

    public final void e1(String str) {
        AdEditText adEditText = this.W0;
        if (adEditText == null) {
            this.b0.a("cannot find address widget");
        } else {
            adEditText.l(str, false);
        }
    }

    public final void f1() {
        this.s0.clear();
        if (JniAdExt.s2(20) != 0) {
            return;
        }
        this.s0.add(new we0(Color.parseColor(JniAdExt.t2(26)), Color.parseColor(JniAdExt.t2(27)), JniAdExt.t2(22), JniAdExt.t2(23), JniAdExt.t2(24), JniAdExt.t2(25)));
    }

    @Override // defpackage.d21
    public final void g(String str) {
        JniAdExt.x4(io.KEY_SHOW_ID_INSTEAD_OF_ALIAS, false);
        t70.Y(new wi0(this, JniAdExt.B2(), 1));
    }

    public final void g1(String str) {
        nr0 nr0Var = this.a1;
        if (nr0Var != null) {
            r3.F(nr0Var.e, lg.c().e(str));
            r3.F(nr0Var.f, lg.c().e(str));
            View view = nr0Var.o;
            if (view != null) {
                view.setActivated(true);
            }
            View view2 = nr0Var.p;
            if (view2 != null) {
                view2.setActivated(true);
            }
        }
    }

    @Override // defpackage.z6, defpackage.l80
    public final boolean h(KeyEvent keyEvent) {
        m80 m80Var;
        View viewF;
        m80 m80Var2;
        DrawerLayout drawerLayout;
        View viewF2;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        boolean zL = false;
        if (keyCode != 82) {
            if (keyCode == 111 && (m80Var2 = this.a0) != null) {
                MainActivity mainActivity = (MainActivity) m80Var2;
                DrawerLayout drawerLayout2 = mainActivity.L;
                if ((drawerLayout2 == null || (viewF2 = drawerLayout2.f(8388611)) == null) ? false : DrawerLayout.l(viewF2)) {
                    if (action == 1 && (drawerLayout = mainActivity.L) != null) {
                        drawerLayout.d();
                        return true;
                    }
                }
            }
            return false;
        }
        if (action == 1 && (m80Var = this.a0) != null) {
            MainActivity mainActivity2 = (MainActivity) m80Var;
            DrawerLayout drawerLayout3 = mainActivity2.L;
            if (drawerLayout3 != null && (viewF = drawerLayout3.f(8388611)) != null) {
                zL = DrawerLayout.l(viewF);
            }
            DrawerLayout drawerLayout4 = mainActivity2.L;
            if (zL) {
                if (drawerLayout4 != null) {
                    drawerLayout4.d();
                    return true;
                }
            } else if (drawerLayout4 != null) {
                drawerLayout4.o();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i1() {
        RecyclerView recyclerView;
        int dimensionPixelSize;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        cj0 cj0Var = this.c0;
        if (cj0Var == null || (recyclerView = this.A0) == null) {
            return;
        }
        k61 k61Var = this.z0;
        if (k61Var != null) {
            k61Var.n = null;
            recyclerView.setAdapter(null);
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        int iR = q51.r(cj0Var.e());
        if (iR != 1) {
            if (iR != 2) {
                Resources resourcesF0 = f0();
                Looper looper = t70.a;
                dimensionPixelSize = resourcesF0.getDimensionPixelSize(R.dimen.speed_dial_item_width);
                int dimensionPixelSize2 = f0().getDimensionPixelSize(R.dimen.speed_dial_item_horizontal_margin);
                float dimension = (f0().getDimension(R.dimen.speed_dial_item_width) / er0.b()) / (f0().getDimension(R.dimen.speed_dial_item_height) / er0.b());
                layoutParams.width = -2;
                i = R.layout.motd_text;
                i2 = R.layout.motd_image;
                i3 = R.layout.motd_combined;
                i4 = R.layout.discovery;
                f = dimension;
                i5 = dimensionPixelSize2;
                i6 = R.layout.speed_dial_item;
                z = true;
                i7 = R.layout.speed_dial_item;
            } else {
                Resources resourcesF1 = f0();
                Looper looper2 = t70.a;
                dimensionPixelSize = resourcesF1.getDimensionPixelSize(R.dimen.speed_dial_item_line_width);
                int dimensionPixelSize3 = f0().getDimensionPixelSize(R.dimen.speed_dial_item_line_horizontal_margin);
                layoutParams.width = -1;
                i = R.layout.motd_text_line;
                i2 = R.layout.motd_image_line;
                i3 = R.layout.motd_combined_line;
                i4 = R.layout.discovery_line;
                i5 = dimensionPixelSize3;
                i6 = R.layout.speed_dial_item_line;
                z = false;
                i7 = R.layout.speed_dial_item_line;
                f = 0.0f;
                i8 = R.drawable.unknown_desktop_line;
            }
            recyclerView.setLayoutParams(layoutParams);
            int dimensionPixelSize4 = f0().getDimensionPixelSize(R.dimen.activity_horizontal_margin) - i5;
            recyclerView.setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
            k61 k61Var2 = new k61(this.H1.c, i6, i, i2, i3, i4, z, i7, f, i8);
            this.z0 = k61Var2;
            k61Var2.n = this.D1;
            recyclerView.setAdapter(k61Var2);
            int i9 = (i5 * 2) + dimensionPixelSize;
            GridAutofitLayoutManager gridAutofitLayoutManager = new GridAutofitLayoutManager(a0());
            gridAutofitLayoutManager.Q = i9;
            recyclerView.setLayoutManager(gridAutofitLayoutManager);
            this.B0 = gridAutofitLayoutManager;
        }
        Resources resourcesF2 = f0();
        Looper looper3 = t70.a;
        dimensionPixelSize = resourcesF2.getDimensionPixelSize(R.dimen.speed_dial_item_small_width);
        int dimensionPixelSize5 = f0().getDimensionPixelSize(R.dimen.speed_dial_item_small_horizontal_margin);
        float dimension2 = (f0().getDimension(R.dimen.speed_dial_item_small_width) / er0.b()) / (f0().getDimension(R.dimen.speed_dial_item_small_height) / er0.b());
        layoutParams.width = -2;
        i = R.layout.motd_text_small;
        i2 = R.layout.motd_image_small;
        i3 = R.layout.motd_combined_small;
        i4 = R.layout.discovery_small;
        f = dimension2;
        i5 = dimensionPixelSize5;
        i6 = R.layout.speed_dial_item_small;
        z = true;
        i7 = R.layout.speed_dial_item_small;
        i8 = R.drawable.unknown_desktop;
        recyclerView.setLayoutParams(layoutParams);
        int dimensionPixelSize6 = f0().getDimensionPixelSize(R.dimen.activity_horizontal_margin) - i5;
        recyclerView.setPadding(dimensionPixelSize6, 0, dimensionPixelSize6, 0);
        k61 k61Var3 = new k61(this.H1.c, i6, i, i2, i3, i4, z, i7, f, i8);
        this.z0 = k61Var3;
        k61Var3.n = this.D1;
        recyclerView.setAdapter(k61Var3);
        int i10 = (i5 * 2) + dimensionPixelSize;
        GridAutofitLayoutManager gridAutofitLayoutManager2 = new GridAutofitLayoutManager(a0());
        gridAutofitLayoutManager2.Q = i10;
        recyclerView.setLayoutManager(gridAutofitLayoutManager2);
        this.B0 = gridAutofitLayoutManager2;
    }

    public final void j1(boolean z) {
        int i;
        cj0 cj0Var = this.c0;
        if (cj0Var == null) {
            return;
        }
        int iD = cj0Var.d();
        if (iD == 0) {
            this.b0.a("unhandled speed dial category");
            cj0Var.o(1);
        } else {
            if (z) {
                int[] iArrS = q51.s(4);
                i = iArrS[(q51.r(iD) + 1) % iArrS.length];
            } else {
                int[] iArrS2 = q51.s(4);
                int iR = (q51.r(iD) - 1) % iArrS2.length;
                if (iR < 0) {
                    iR += iArrS2.length;
                }
                i = iArrS2[iR];
            }
            cj0Var.o(i);
        }
        n1();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final void k1() {
        int i;
        int i2;
        int i3;
        int i4;
        MainApplication mainApplicationV = MainApplication.v();
        CardView cardView = this.c1;
        CardView cardView2 = this.d1;
        CardView cardView3 = this.e1;
        View view = this.f1;
        LinearLayout linearLayout = this.i1;
        LinearLayout linearLayout2 = this.j1;
        if (cardView == null || cardView2 == null || cardView3 == null || view == null || linearLayout == null || linearLayout2 == null) {
            return;
        }
        if (mainApplicationV.o0 != 1) {
            i = 8;
            i2 = 0;
        } else {
            i = JniAdExt.L1() ? 0 : 8;
            i2 = 8;
        }
        int i5 = mainApplicationV.n0;
        io ioVar = io.KEY_FEATURE_CONNECT;
        if (i5 == 1) {
            if (JniAdExt.g2(ioVar) && JniAdExt.g2(io.KEY_FEATURE_ADDRESS_BAR)) {
                i3 = 8;
                i4 = 0;
            } else {
                i3 = 8;
            }
            int i6 = JniAdExt.g2(ioVar) ? 0 : 8;
            cardView.setVisibility(i);
            cardView2.setVisibility(i2);
            cardView3.setVisibility(i3);
            view.setVisibility(i4);
            linearLayout.setVisibility(i6);
            linearLayout2.setVisibility(i6);
            if (i == 0) {
                t70.V(new ap(this, 4, i3 == 0));
            }
        }
        i3 = 0;
        i4 = 8;
        if (JniAdExt.g2(ioVar)) {
        }
        cardView.setVisibility(i);
        cardView2.setVisibility(i2);
        cardView3.setVisibility(i3);
        view.setVisibility(i4);
        linearLayout.setVisibility(i6);
        linearLayout2.setVisibility(i6);
        if (i == 0) {
            t70.V(new ap(this, 4, i3 == 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    public final void l1() {
        z80 z80Var;
        boolean z;
        boolean z2;
        String string;
        Logging logging = this.b0;
        MainApplication mainApplicationV = MainApplication.v();
        int i = mainApplicationV.o0;
        ev evVar = mainApplicationV.q;
        synchronized (evVar) {
            z80Var = (z80) evVar.d;
        }
        PermissionProfile permissionProfile = z80Var == null ? null : z80Var.l;
        View view = this.E0;
        View view2 = this.F0;
        if (view != null && view2 != null) {
            if (i == 2) {
                if (permissionProfile.m.contains(du0.pf_clipboard)) {
                    if (permissionProfile.m.contains(du0.pf_clipboard_files)) {
                        view2.setActivated(mainApplicationV.E);
                        view.setVisibility(0);
                        view2.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                        view2.setVisibility(8);
                    }
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(8);
                }
            } else {
                view.setVisibility(8);
                view2.setVisibility(8);
            }
        }
        View view3 = this.G0;
        if (view3 != null) {
            view3.setActivated(JniAdExt.s2(13) != 0);
        }
        View view4 = this.R0;
        if (view4 != null) {
            view4.setActivated(JniAdExt.s2(13) != 0);
        }
        if (i != 1) {
            boolean z3 = mainApplicationV.C;
            TextView textView = this.X0;
            lg lgVarC = lg.c();
            String strM = q51.m(new StringBuilder("<b>"), t70.c(mainApplicationV.z, mainApplicationV.y, mainApplicationV.A, mainApplicationV.B, z3), "</b><br>");
            StringBuilder sb = new StringBuilder();
            sb.append(strM);
            String strN1 = JniAdExt.n1("ad.accept.connected");
            sb.append(strN1);
            if (i == 2) {
                string = strM.concat(strN1);
            } else {
                sb.append(" (");
                if (i == 4) {
                    sb.append(JniAdExt.n1("ad.vpn.title"));
                } else if (i == 3) {
                    sb.append(JniAdExt.n1("ad.common.file_transfer"));
                } else if (logging != null) {
                    logging.c("incoming connection type not recognised; no appropriate simple text found");
                }
                sb.append(")");
                string = sb.toString();
            }
            Spanned spannedF = t70.F(string);
            lgVarC.getClass();
            dj djVar = m91.a;
            r3.F(textView, lgVarC.d(spannedF));
            Bitmap bitmapE = t70.E(I0(), mainApplicationV.x, z3, false, logging);
            ImageView imageView = this.k1;
            if (imageView != null) {
                imageView.setImageBitmap(bitmapE);
            }
            m1();
        }
        boolean z4 = i == 2 && mainApplicationV.G;
        r3.I(this.J0, z4 ? 0 : 8);
        r3.I(this.M0, z4 ? 0 : 8);
        if (this.L0 != null) {
            r3.I(this.K0, z4 ? 8 : 0);
            r3.I(this.L0, z4 ? 0 : 8);
        }
        int i2 = mainApplicationV.n0;
        ImageView imageView2 = this.P0;
        ImageView imageView3 = this.Q0;
        ImageView imageView4 = this.S0;
        if (i2 != 2 && i2 != 4 && i2 != 5) {
            if (i2 == 3) {
                TextView textView2 = this.Y0;
                if (textView2 != null) {
                    lg lgVarC2 = lg.c();
                    Spanned spannedF2 = t70.F(JniAdExt.n1("ad.status.sess.playback.android") + "<br><b>" + mainApplicationV.p + "</b>");
                    lgVarC2.getClass();
                    dj djVar2 = m91.a;
                    textView2.setText(lgVarC2.d(spannedF2));
                }
                r3.D(imageView2, R.drawable.ic_btn_playback);
                r3.I(imageView3, 8);
                r3.I(view4, 8);
                r3.I(imageView4, 8);
                ImageView imageView5 = this.l1;
                if (imageView5 != null) {
                    imageView5.setImageResource(R.drawable.ic_nav_recordings);
                    imageView5.setScaleX(0.6f);
                    imageView5.setScaleY(0.6f);
                    Context contextI0 = I0();
                    Looper looper = t70.a;
                    imageView5.setImageTintList(uj.m(contextI0, R.color.colorMainFragmentButtonIcon));
                    return;
                }
                return;
            }
            return;
        }
        boolean z5 = mainApplicationV.l;
        TextView textView3 = this.Y0;
        if (textView3 != null) {
            lg lgVarC3 = lg.c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(JniAdExt.n1("ad.status.sess.connected.android"));
            sb2.append("<br><b>");
            z = z5;
            sb2.append(t70.c(mainApplicationV.m, mainApplicationV.j, mainApplicationV.n, mainApplicationV.o, z5));
            sb2.append("</b>");
            Spanned spannedF3 = t70.F(sb2.toString());
            lgVarC3.getClass();
            dj djVar3 = m91.a;
            textView3.setText(lgVarC3.d(spannedF3));
        } else {
            z = z5;
        }
        if (imageView2 != null) {
            imageView2.setVisibility((i2 == 5 || i2 == 4) ? 8 : 0);
        }
        if (imageView3 != null) {
            imageView3.setVisibility(!JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER) ? 8 : 0);
            ImageView imageView6 = this.Q0;
            boolean z6 = JniAdExt.s2(12) != 0;
            if (imageView6 != null) {
                imageView6.setActivated(z6);
            }
        }
        int i3 = i2 == 5 ? 0 : 8;
        TextView textView4 = this.Z0;
        if (textView4 != null) {
            textView4.setVisibility(i3);
        }
        jr0 jr0Var = JniAdExt.L0;
        if (i2 == 5 || jr0Var.a != 0) {
            r3.I(imageView4, 0);
            p1(JniAdExt.f3(jr0Var.a, jr0Var.b, jr0Var.c));
            int i4 = jr0Var.a;
            ImageView imageView7 = this.S0;
            if (imageView7 != null) {
                if (i4 == 2) {
                    imageView7.setImageResource(R.drawable.ic_btn_vpn_connected);
                } else {
                    imageView7.setImageResource(R.drawable.ic_btn_vpn_disconnected);
                }
            }
        }
        if (i2 == 5) {
            ViewGroup viewGroup = (ViewGroup) imageView4.getParent();
            viewGroup.removeView(imageView4);
            z2 = false;
            viewGroup.addView(imageView4, 0);
        } else {
            z2 = false;
        }
        Bitmap bitmapE2 = t70.E(I0(), mainApplicationV.i, z, z2, logging);
        ImageView imageView8 = this.l1;
        if (imageView8 != null) {
            imageView8.setImageBitmap(bitmapE2);
            imageView8.setScaleX(1.0f);
            imageView8.setScaleY(1.0f);
            imageView8.setImageTintList(null);
        }
    }

    @Override // defpackage.kd0
    public final void m(String str, String str2) {
    }

    public final void m1() {
        int i;
        cj0 cj0Var = this.c0;
        if (cj0Var == null) {
            return;
        }
        View view = this.p0;
        View view2 = this.q0;
        TextView textView = this.r0;
        if (view == null || view2 == null || textView == null) {
            return;
        }
        int i2 = MainApplication.v().F;
        View view3 = this.p0;
        View view4 = this.q0;
        if (view3 != null && view4 != null) {
            float fMax = Math.max(0.0f, Math.min(1.0f, i2 / 100.0f));
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            layoutParams.width = (int) (view3.getWidth() * fMax);
            view4.setLayoutParams(layoutParams);
        }
        if (i2 == 100) {
            textView.setText(t70.F("<u>" + JniAdExt.n1("ad.status.file_transfer.msg.finished") + "</u>"));
        } else {
            textView.setText(t70.F("<u>" + JniAdExt.n1("ad.status.file_transfer.msg.progress") + "</u>"));
        }
        synchronized (cj0Var) {
            i = cj0Var.c;
        }
        view.setVisibility(i);
        textView.setVisibility(i);
    }

    @Override // defpackage.kd0
    public final void n(long j, long j2) {
    }

    public final void n1() {
        cj0 cj0Var = this.c0;
        if (cj0Var == null) {
            return;
        }
        r3.B(this.i0, false);
        r3.B(this.l0, false);
        r3.B(this.k0, false);
        r3.B(this.j0, false);
        int iR = q51.r(cj0Var.d());
        if (iR == 0) {
            r3.D(this.h0, R.drawable.ic_view_dial_all_devices_active);
            r3.B(this.i0, true);
        } else if (iR == 1) {
            r3.D(this.h0, R.drawable.ic_view_dial_star_active);
            r3.B(this.j0, true);
        } else if (iR == 2) {
            r3.D(this.h0, R.drawable.ic_view_dial_recent_active);
            r3.B(this.k0, true);
        } else if (iR != 3) {
            this.b0.a("unhandled speed dial category");
        } else {
            r3.D(this.h0, R.drawable.ic_view_dial_discover_active);
            r3.B(this.l0, true);
        }
        i1();
        d1();
    }

    @Override // defpackage.jl0
    public final boolean o(MenuItem menuItem) {
        return menuItem.getItemId() == R.id.action_account;
    }

    public final void o1() {
        cj0 cj0Var = this.c0;
        if (cj0Var == null) {
            return;
        }
        ImageView imageView = this.g0;
        if (imageView != null) {
            int iR = q51.r(cj0Var.e());
            if (iR == 0) {
                imageView.setImageResource(R.drawable.ic_view_tile_big_active);
            } else if (iR == 1) {
                imageView.setImageResource(R.drawable.ic_view_tile_small_active);
            } else if (iR != 2) {
                this.b0.a("unhandled speed dial mode");
            } else {
                imageView.setImageResource(R.drawable.ic_view_list_active);
            }
        }
        i1();
    }

    @Override // defpackage.r80
    public final void onWindowFocusChanged(boolean z) {
        t81 t81Var;
        if (z) {
            yi0 yi0Var = this.F1;
            if (yi0Var.d()) {
                t81 t81Var2 = (t81) yi0Var.d;
                if (t81Var2 != null) {
                    t81Var2.requestFocus();
                    return;
                }
                return;
            }
            yi0 yi0Var2 = this.G1;
            if (!yi0Var2.d() || (t81Var = (t81) yi0Var2.d) == null) {
                return;
            }
            t81Var.requestFocus();
        }
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void p(Menu menu) {
    }

    public final void p1(String str) {
        TextView textView = this.Z0;
        if (textView == null) {
            return;
        }
        textView.setText(JniAdExt.n1("ad.vpn.title") + " " + str);
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.c0 = MainApplication.v().u;
    }

    @Override // defpackage.ji0
    public final void r() {
        t70.Y(new ni0(1, this));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.c0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.F1.c();
        this.G1.c();
        K0().getViewTreeObserver().removeOnGlobalLayoutListener(this.C1);
        if (JniAdExt.c) {
            if (this.c0 != null) {
                int i = MainApplication.v().D;
                if (i != 0) {
                    cj0 cj0Var = this.c0;
                    synchronized (cj0Var) {
                        cj0Var.c(i).k(this);
                    }
                }
                this.c0.j(0, this);
            }
            MainApplication.v().X = null;
            MainApplication.v().O(this);
            MainApplication.v().P(this);
            m80 m80Var = this.a0;
            if (m80Var != null) {
                MainActivity mainActivity = (MainActivity) m80Var;
                mainActivity.S.remove(this);
                mainActivity.R = null;
                mainActivity.Q = null;
            }
            JniAdExt.W3(this);
            JniAdExt.a4(this);
            JniAdExt.X3(this);
            JniAdExt.Q = null;
            JniAdExt.P = null;
            JniAdExt.U3(this);
            JniAdExt.H4(null);
            JniAdExt.y = null;
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
            k61 k61Var = this.z0;
            this.z0 = null;
            if (k61Var != null) {
                k61Var.n = null;
            }
            this.b1.setOnScrollChangeListener((ip0) null);
            this.h1.removeOnLayoutChangeListener(this.w1);
            this.h1.removeCallbacks(this.v1);
            this.p0.removeOnLayoutChangeListener(this.y1);
            this.r0.setOnClickListener(null);
            this.i1.removeOnLayoutChangeListener(this.x1);
            this.f0.setOnClickListener(null);
            this.g0.setOnClickListener(null);
            this.g0.setOnLongClickListener(null);
            this.h0.setOnClickListener(null);
            this.h0.setOnLongClickListener(null);
            this.i0.setOnClickListener(null);
            this.j0.setOnClickListener(null);
            this.k0.setOnClickListener(null);
            this.l0.setOnClickListener(null);
            this.A0.setAdapter(null);
            this.A0.setLayoutManager(null);
            this.j1.setOnTouchListener(null);
            this.j1.setOnGenericMotionListener(null);
            this.E0.setOnClickListener(null);
            this.F0.setOnClickListener(null);
            this.G0.removeOnLayoutChangeListener(this.z1);
            this.G0.setOnClickListener(null);
            this.J0.setOnClickListener(null);
            this.K0.setOnClickListener(null);
            r3.E(this.L0, null);
            this.N0.setOnClickListener(null);
            this.O0.setOnClickListener(null);
            this.Q0.setOnClickListener(null);
            this.R0.removeOnLayoutChangeListener(this.A1);
            this.R0.setOnClickListener(null);
            this.S0.setOnClickListener(null);
            this.P0.setOnClickListener(null);
            this.U0.setOnClickListener(null);
            this.V0.setOnClickListener(null);
            RecyclerView recyclerView = this.A0;
            aj0 aj0Var = this.D0;
            recyclerView.s.remove(aj0Var);
            if (recyclerView.t == aj0Var) {
                recyclerView.t = null;
            }
            AdEditText adEditText = this.W0;
            if (adEditText != null) {
                adEditText.b();
                this.W0 = null;
            }
            nr0 nr0Var = this.a1;
            if (nr0Var != null) {
                r3.E(nr0Var.e, null);
                r3.E(nr0Var.f, null);
                AutoResizeTextView autoResizeTextView = nr0Var.e;
                if (autoResizeTextView != null) {
                    autoResizeTextView.setOnLongClickListener(null);
                }
                AutoResizeTextView autoResizeTextView2 = nr0Var.f;
                if (autoResizeTextView2 != null) {
                    autoResizeTextView2.setOnLongClickListener(null);
                }
                r3.E(nr0Var.k, null);
                r3.E(nr0Var.l, null);
                r3.E(nr0Var.m, null);
                r3.E(nr0Var.n, null);
                r3.E(nr0Var.o, null);
                r3.E(nr0Var.p, null);
                r3.E(nr0Var.q, null);
                r3.E(nr0Var.r, null);
                nr0Var.a = null;
                nr0Var.b = null;
                nr0Var.c = null;
                nr0Var.d = null;
                nr0Var.e = null;
                nr0Var.f = null;
                nr0Var.g = null;
                nr0Var.h = null;
                nr0Var.i = null;
                nr0Var.j = null;
                nr0Var.k = null;
                nr0Var.l = null;
                nr0Var.m = null;
                nr0Var.n = null;
                nr0Var.o = null;
                nr0Var.p = null;
                nr0Var.q = null;
                nr0Var.r = null;
                this.a1 = null;
            }
            aj0 aj0Var2 = this.D0;
            if (aj0Var2 != null) {
                aj0Var2.a = null;
                this.D0 = null;
            }
            l61 l61Var = this.C0;
            if (l61Var != null) {
                l61Var.i = null;
                this.C0 = null;
            }
            this.p0 = null;
            this.q0 = null;
            this.r0 = null;
            this.f0 = null;
            this.g0 = null;
            this.h0 = null;
            this.i0 = null;
            this.j0 = null;
            this.k0 = null;
            this.l0 = null;
            this.m0 = null;
            this.n0 = null;
            this.o0 = null;
            this.H0 = null;
            this.I0 = null;
            this.b1 = null;
            this.c1 = null;
            this.d1 = null;
            this.e1 = null;
            this.f1 = null;
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.j1 = null;
            this.A0 = null;
            this.B0 = null;
            this.E0 = null;
            this.F0 = null;
            this.G0 = null;
            this.J0 = null;
            this.K0 = null;
            this.L0 = null;
            this.M0 = null;
            this.N0 = null;
            this.O0 = null;
            this.Q0 = null;
            this.R0 = null;
            this.S0 = null;
            this.P0 = null;
            this.T0 = null;
            this.U0 = null;
            this.V0 = null;
            this.W0 = null;
            this.X0 = null;
            this.Y0 = null;
            this.Z0 = null;
            this.k1 = null;
            this.l1 = null;
            this.m1 = null;
            this.n1 = null;
        }
    }

    @Override // defpackage.jl0
    public final void v(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_action_bar, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_account);
        String strN1 = JniAdExt.n1("ad.account.title");
        ImageView imageView = new ImageView(new ContextThemeWrapper(a0(), R.style.AdImageButtonStyleToolbarMain), null, 0);
        imageView.setBackgroundResource(R.drawable.toolbar_action_background);
        imageView.setImageResource(R.drawable.ic_account_user);
        Context contextA0 = a0();
        Looper looper = t70.a;
        imageView.setColorFilter(uj.l(contextA0, R.color.colorToolbarBurger));
        imageView.setContentDescription(strN1);
        bu0.D(imageView, strN1);
        imageView.setOnClickListener(this.u1);
        menuItemFindItem.setActionView(imageView);
        menuItemFindItem.setVisible(JniAdExt.g2(io.KEY_FEATURE_USER_ACCOUNT));
    }

    @Override // defpackage.n80
    public final boolean x() {
        RecyclerView recyclerView;
        yi0 yi0Var = this.F1;
        if (yi0Var.d()) {
            yi0Var.a();
            return true;
        }
        yi0 yi0Var2 = this.G1;
        if (yi0Var2.d()) {
            yi0Var2.a();
            return true;
        }
        GridAutofitLayoutManager gridAutofitLayoutManager = this.B0;
        if (gridAutofitLayoutManager == null || gridAutofitLayoutManager.M0() <= 0 || (recyclerView = this.A0) == null) {
            return false;
        }
        recyclerView.h0(0);
        return true;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void x0() {
        super.x0();
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).s0(this);
        }
        ii0 ii0Var = this.E1;
        zd zdVar = JniAdExt.w;
        synchronized (zdVar) {
            zdVar.remove(ii0Var);
        }
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void y(Menu menu) {
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        View view;
        AdEditText adEditText;
        super.y0();
        if (this.a0 != null) {
            zd zdVar = MainActivity.j0;
            synchronized (zdVar) {
                zdVar.add(this);
            }
        }
        k1();
        l1();
        nr0 nr0Var = this.a1;
        if (nr0Var != null) {
            boolean zJ3 = JniAdExt.j3();
            int i = (JniAdExt.g2(io.KEY_CFG_ENABLED) && JniAdExt.g2(io.KEY_CFG_ENABLE_SECURITY) && JniAdExt.g2(io.KEY_CFG_ENABLE_PERMISSION_PROFILES) && JniAdExt.g2(io.KEY_FEATURE_UNATTENDED) && !JniAdExt.k3() && !zJ3 && !zJ3) ? 0 : 8;
            int i2 = zJ3 ? 0 : 8;
            r3.I(nr0Var.m, i);
            r3.I(nr0Var.n, i);
            r3.I(nr0Var.g, i2);
            r3.I(nr0Var.h, i2);
        }
        nr0 nr0Var2 = this.a1;
        if (nr0Var2 != null) {
            int iL = nd0.l(G0(), this.e0);
            int i3 = iL != 1 ? 0 : 8;
            if (iL == 3) {
                Context contextA0 = a0();
                Looper looper = t70.a;
                int iL2 = uj.l(contextA0, R.color.colorPrimary);
                r3.u(nr0Var2.q, iL2);
                r3.u(nr0Var2.r, iL2);
            } else if (iL == 2) {
                Context contextA1 = a0();
                Looper looper2 = t70.a;
                int iL3 = uj.l(contextA1, R.color.colorSetupStatusWarning);
                r3.u(nr0Var2.q, iL3);
                r3.u(nr0Var2.r, iL3);
            } else if (iL == 1) {
                r3.e(nr0Var2.q);
                r3.e(nr0Var2.r);
            }
            r3.I(nr0Var2.q, i3);
            r3.I(nr0Var2.r, i3);
        }
        JniAdExt.C1(this.E1);
        g1(JniAdExt.B2());
        d1();
        if (this.F1.d() || this.G1.d() || (view = this.f1) == null || view.getVisibility() != 0 || (adEditText = this.W0) == null) {
            return;
        }
        adEditText.i(false);
    }

    @Override // defpackage.ki0
    public final void z() {
        t70.Y(new xi0(5, this));
    }
}
