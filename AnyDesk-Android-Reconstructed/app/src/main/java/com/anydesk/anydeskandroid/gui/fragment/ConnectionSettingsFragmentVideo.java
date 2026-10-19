package com.anydesk.anydeskandroid.gui.fragment;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.b;
import defpackage.c40;
import defpackage.cd0;
import defpackage.cu0;
import defpackage.d3;
import defpackage.du0;
import defpackage.ep;
import defpackage.fp;
import defpackage.gp;
import defpackage.id0;
import defpackage.lp;
import defpackage.qa;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentVideo extends c40 implements cd0, id0 {
    public TextView Z;
    public CheckBox a0;
    public View b0;
    public final xt0 c0 = new xt0(this);

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        TextView textView = (TextView) view.findViewById(R.id.connection_settings_video_title_quality);
        TextView textView2 = (TextView) view.findViewById(R.id.connection_settings_video_quality_best_description);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.connection_settings_video_quality_best_radiobutton);
        TextView textView3 = (TextView) view.findViewById(R.id.connection_settings_video_quality_balanced_description);
        RadioButton radioButton2 = (RadioButton) view.findViewById(R.id.connection_settings_video_quality_balanced_radiobutton);
        TextView textView4 = (TextView) view.findViewById(R.id.connection_settings_video_quality_fast_description);
        RadioButton radioButton3 = (RadioButton) view.findViewById(R.id.connection_settings_video_quality_fast_radiobutton);
        TextView textView5 = (TextView) view.findViewById(R.id.connection_settings_video_adaptive_quality_description);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.connection_settings_video_adaptive_quality_checkbox);
        View viewFindViewById = view.findViewById(R.id.connection_settings_video_lossless_quality_layout);
        TextView textView6 = (TextView) view.findViewById(R.id.connection_settings_video_lossless_quality_description);
        CheckBox checkBox2 = (CheckBox) view.findViewById(R.id.connection_settings_video_lossless_quality_checkbox);
        TextView textView7 = (TextView) view.findViewById(R.id.connection_settings_video_title_remote_cursor);
        TextView textView8 = (TextView) view.findViewById(R.id.connection_settings_video_remote_cursor_hide_description);
        RadioButton radioButton4 = (RadioButton) view.findViewById(R.id.connection_settings_video_remote_cursor_hide_radiobutton);
        TextView textView9 = (TextView) view.findViewById(R.id.connection_settings_video_remote_cursor_show_description);
        RadioButton radioButton5 = (RadioButton) view.findViewById(R.id.connection_settings_video_remote_cursor_show_radiobutton);
        TextView textView10 = (TextView) view.findViewById(R.id.connection_settings_video_remote_cursor_auto_description);
        RadioButton radioButton6 = (RadioButton) view.findViewById(R.id.connection_settings_video_remote_cursor_auto_radiobutton);
        TextView textView11 = (TextView) view.findViewById(R.id.connection_settings_video_follow_remote_cursor_description);
        CheckBox checkBox3 = (CheckBox) view.findViewById(R.id.connection_settings_video_follow_remote_cursor_checkbox);
        TextView textView12 = (TextView) view.findViewById(R.id.connection_settings_video_follow_remote_focus_description);
        CheckBox checkBox4 = (CheckBox) view.findViewById(R.id.connection_settings_video_follow_remote_focus_checkbox);
        this.Z = (TextView) view.findViewById(R.id.connection_settings_video_privacy_mode_description);
        this.a0 = (CheckBox) view.findViewById(R.id.connection_settings_video_privacy_mode_checkbox);
        this.b0 = view.findViewById(R.id.connection_settings_video_privacy_mode_toast_overlay);
        qa qaVarG0 = G0();
        Looper looper = t70.a;
        ActivityManager activityManager = (ActivityManager) qaVarG0.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        viewFindViewById.setVisibility(memoryInfo.totalMem >= 3000000000L ? 0 : 8);
        r3.r(view.findViewById(R.id.connection_settings_video_quality_best_layout), radioButton);
        r3.r(view.findViewById(R.id.connection_settings_video_quality_balanced_layout), radioButton2);
        r3.r(view.findViewById(R.id.connection_settings_video_quality_fast_layout), radioButton3);
        r3.r(view.findViewById(R.id.connection_settings_video_adaptive_quality_layout), checkBox);
        r3.r(view.findViewById(R.id.connection_settings_video_remote_cursor_hide_layout), radioButton4);
        r3.r(view.findViewById(R.id.connection_settings_video_remote_cursor_show_layout), radioButton5);
        r3.r(view.findViewById(R.id.connection_settings_video_remote_cursor_auto_layout), radioButton6);
        r3.r(view.findViewById(R.id.connection_settings_video_follow_remote_cursor_layout), checkBox3);
        r3.r(view.findViewById(R.id.connection_settings_video_follow_remote_focus_layout), checkBox4);
        r3.r(view.findViewById(R.id.connection_settings_video_privacy_mode_layout), this.a0);
        textView.setText(JniAdExt.n1("ad.menu.display.imgqual.title"));
        textView2.setText(JniAdExt.n1("ad.menu.display.imgqual.best"));
        textView3.setText(JniAdExt.n1("ad.menu.display.imgqual.balanced"));
        textView4.setText(JniAdExt.n1("ad.menu.display.imgqual.fast"));
        textView5.setText(JniAdExt.n1("ad.menu.display.imgqual.adaptive"));
        textView6.setText(JniAdExt.n1("ad.menu.display.imgqual.lossless"));
        textView7.setText(JniAdExt.n1("ad.menu.display.show_mouse_cursor"));
        textView8.setText(JniAdExt.n1("ad.menu.display.show_mouse_cursor.disabled.short"));
        textView9.setText(JniAdExt.n1("ad.menu.display.show_mouse_cursor.enabled.short"));
        textView10.setText(JniAdExt.n1("ad.menu.display.show_mouse_cursor.auto.short"));
        textView11.setText(JniAdExt.n1("ad.menu.display.follow_mouse_cursor"));
        textView12.setText(JniAdExt.n1("ad.menu.display.follow_remote_focus"));
        int iT2 = JniAdExt.T2(6);
        radioButton.setChecked(iT2 == 0);
        radioButton2.setChecked(iT2 == 1);
        radioButton3.setChecked(iT2 == 2);
        checkBox.setChecked(JniAdExt.S2(7));
        checkBox2.setChecked(JniAdExt.S2(17));
        int iT3 = JniAdExt.T2(8);
        radioButton4.setChecked(iT3 == 0);
        radioButton5.setChecked(iT3 == 1);
        radioButton6.setChecked(iT3 == 2);
        checkBox3.setChecked(JniAdExt.S2(15));
        checkBox4.setChecked(JniAdExt.S2(18));
        boolean zO1 = JniAdExt.O1(17);
        boolean zO2 = JniAdExt.O1(8);
        boolean zO3 = JniAdExt.O1(18);
        textView6.setEnabled(zO1);
        checkBox2.setEnabled(zO1);
        textView9.setEnabled(zO2);
        radioButton5.setEnabled(zO2);
        textView10.setEnabled(zO2);
        radioButton6.setEnabled(zO2);
        textView11.setEnabled(zO2);
        checkBox3.setEnabled(zO2);
        textView12.setEnabled(zO3);
        checkBox4.setEnabled(zO3);
        O0();
        radioButton.setOnCheckedChangeListener(new fp(radioButton2, radioButton3, 3));
        radioButton2.setOnCheckedChangeListener(new fp(radioButton, radioButton3, 4));
        radioButton3.setOnCheckedChangeListener(new fp(radioButton, radioButton2, 5));
        checkBox.setOnCheckedChangeListener(new ep(8));
        checkBox2.setOnCheckedChangeListener(new ep(9));
        radioButton4.setOnCheckedChangeListener(new gp(radioButton5, radioButton6, checkBox3, 0));
        radioButton5.setOnCheckedChangeListener(new gp(radioButton4, radioButton6, checkBox3, 1));
        radioButton6.setOnCheckedChangeListener(new gp(radioButton4, radioButton5, checkBox3, 2));
        checkBox3.setOnCheckedChangeListener(new fp(radioButton4, radioButton6, 6));
        checkBox4.setOnCheckedChangeListener(new ep(6));
        this.a0.setOnCheckedChangeListener(new ep(7));
        this.b0.setOnClickListener(new b(11, this));
        JniAdExt.s1(this);
        JniAdExt.A1(this);
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    public final void O0() {
        cu0 cu0Var;
        lp lpVar = MainApplication.v().r;
        if (lpVar == null) {
            return;
        }
        du0 du0Var = du0.pf_privacy_feature;
        synchronized (lpVar) {
            cu0Var = (cu0) lpVar.H.get(du0Var);
        }
        boolean zU3 = JniAdExt.u3();
        r3.s(this.Z, JniAdExt.n1("ad.menu.enable_privacy"), cu0Var == null || cu0Var.c(), zU3);
        r3.B(this.a0, JniAdExt.G2());
        if (zU3) {
            return;
        }
        r3.I(this.b0, JniAdExt.s2(8) != 0 ? 8 : 0);
    }

    @Override // defpackage.id0
    public final void q(du0 du0Var) {
        t70.Y(new d3(this, 12, du0Var));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_video, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.Y3(this);
        JniAdExt.U3(this);
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
    }
}
