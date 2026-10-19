package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.bu0;
import defpackage.cb1;
import defpackage.cd0;
import defpackage.io;
import defpackage.j00;
import defpackage.k00;
import defpackage.ki0;
import defpackage.l00;
import defpackage.m80;
import defpackage.r3;
import defpackage.sc0;
import defpackage.t70;
import defpackage.ua0;
import defpackage.uj;
import defpackage.vt;
import defpackage.wh;
import defpackage.x00;
import defpackage.xt0;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class FileManagerFragment extends z6 implements cd0, ki0 {
    public boolean c0;
    public m80 d0;
    public x00 e0;
    public LinearLayout f0;
    public final Logging b0 = new Logging("FileManagerFragment");
    public final xt0 g0 = new xt0(this);

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.l0 = this;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.l0 = null;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        String string;
        boolean z;
        super.C0(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.filemanager_toolbar);
        TextView textView = (TextView) view.findViewById(R.id.filemanager_toolbar_title);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.filemanager_toolbar_progress_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.filemanager_toolbar_progress);
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(R.id.filemanager_toolbar_progress_indicator);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.filemanager_toolbar_history);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.filemanager_toolbar_close_session);
        this.f0 = (LinearLayout) view.findViewById(R.id.filemanager_layout_2);
        m80 m80Var = this.d0;
        if (m80Var != null) {
            MainActivity mainActivity = (MainActivity) m80Var;
            if (toolbar != null) {
                t70.Z(new wh(mainActivity, mainActivity, toolbar, 4), 100L);
            }
        }
        imageView.startAnimation(AnimationUtils.loadAnimation(a0(), R.anim.rotation));
        String strN1 = JniAdExt.n1("ad.file_browser.history");
        int i = 0;
        if (imageView2 != null) {
            bu0.D(imageView2, strN1);
            imageView2.setContentDescription(strN1);
            bu0.D(frameLayout, strN1);
        } else {
            frameLayout.setEnabled(false);
        }
        frameLayout.setContentDescription(strN1);
        String strN2 = JniAdExt.n1("ad.menu.pie.tooltip.close");
        bu0.D(imageView3, strN2);
        imageView3.setContentDescription(strN2);
        int i2 = 1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new j00(this, i));
            frameLayout.setOnClickListener(new j00(this, i2));
        }
        imageView3.setOnClickListener(new j00(this, 2));
        JniAdExt.s1(this);
        MainApplication.v().k(this);
        if (bundle == null) {
            Bundle bundle2 = this.h;
            string = bundle2 != null ? bundle2.getString("addr") : null;
        } else {
            string = bundle.getString("addr");
        }
        int i3 = MainApplication.v().n0;
        if (i3 == 1) {
            if (string != null) {
                R0(string, false);
            } else {
                x00 x00Var = this.e0;
                if (x00Var != null) {
                    synchronized (x00Var.b) {
                        z = x00Var.e;
                    }
                    if (!z) {
                        S0();
                    }
                }
            }
        } else if ((i3 == 2 || i3 == 5) && string != null) {
            R0(string, true);
        }
        x00 x00Var2 = this.e0;
        if (x00Var2 != null) {
            x00Var2.m.e(h0(), new vt(i2, textView));
            x00Var2.N.e(h0(), new k00(frameLayout, imageView2, circularProgressIndicator));
        }
    }

    @Override // defpackage.ki0
    public final void G() {
        t70.Y(new l00(this, 1));
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            S0();
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

    public final void R0(String str, boolean z) {
        if (!JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER)) {
            t70.g0(Y(), JniAdExt.n1("ad.dlg.availability.title"), 0);
            S0();
            return;
        }
        int i = 5;
        if (JniAdExt.s2(12) == 0) {
            t70.g0(Y(), JniAdExt.r2(5), 0);
            S0();
            return;
        }
        if (z) {
            JniAdExt.I0.post(new sc0(0));
        } else {
            this.b0.e("connecting via file manager to '" + str + "'...");
            JniAdExt.I0.post(new ua0(str, i));
        }
        x00 x00Var = this.e0;
        if (x00Var != null) {
            synchronized (x00Var.b) {
                x00Var.e = true;
            }
        }
    }

    public final synchronized void S0() {
        if (!T0()) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    public final synchronized boolean T0() {
        boolean z;
        z = this.c0;
        this.c0 = true;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z6, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.d0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.e0 = MainApplication.v().s;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c0 = false;
        return layoutInflater.inflate(R.layout.fragment_filemanager, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.e0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        T0();
        x00 x00Var = this.e0;
        if (x00Var != null) {
            x00Var.m.k(this);
            x00Var.N.k(this);
        }
        MainApplication.v().P(this);
        JniAdExt.U3(this);
        this.f0 = null;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void u0() {
        super.u0();
        this.d0 = null;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        boolean z;
        super.y0();
        x00 x00Var = this.e0;
        if (x00Var != null) {
            LinearLayout linearLayout = this.f0;
            synchronized (x00Var.b) {
                z = x00Var.f;
            }
            r3.I(linearLayout, z ? 0 : 4);
        }
    }

    @Override // defpackage.ki0
    public final void z() {
        t70.Y(new l00(this, 0));
    }
}
