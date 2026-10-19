package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.c40;
import defpackage.cd0;
import defpackage.cu0;
import defpackage.d3;
import defpackage.du0;
import defpackage.ep;
import defpackage.fp;
import defpackage.id0;
import defpackage.r3;
import defpackage.r71;
import defpackage.t70;
import defpackage.uj;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentInput extends c40 implements cd0, id0 {
    public TextView Z;
    public CheckBox a0;
    public TextView b0;
    public CheckBox c0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.Z = (TextView) view.findViewById(R.id.connection_settings_input_control_mouse_and_keyboard_description);
        this.a0 = (CheckBox) view.findViewById(R.id.connection_settings_input_control_mouse_and_keyboard_checkbox);
        this.b0 = (TextView) view.findViewById(R.id.connection_settings_input_block_user_input_description);
        this.c0 = (CheckBox) view.findViewById(R.id.connection_settings_input_block_user_input_checkbox);
        TextView textView = (TextView) view.findViewById(R.id.connection_settings_input_auto_keyboard_description);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.connection_settings_input_auto_keyboard_checkbox);
        TextView textView2 = (TextView) view.findViewById(R.id.connection_settings_input_title_touch_mode);
        TextView textView3 = (TextView) view.findViewById(R.id.connection_settings_input_touch_mode_mouse_description);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.connection_settings_input_touch_mode_mouse_radiobutton);
        TextView textView4 = (TextView) view.findViewById(R.id.connection_settings_input_touch_mode_touchpad_description);
        RadioButton radioButton2 = (RadioButton) view.findViewById(R.id.connection_settings_input_touch_mode_touchpad_radiobutton);
        TextView textView5 = (TextView) view.findViewById(R.id.connection_settings_input_touch_mode_direct_description);
        RadioButton radioButton3 = (RadioButton) view.findViewById(R.id.connection_settings_input_touch_mode_direct_radiobutton);
        r3.r(view.findViewById(R.id.connection_settings_input_control_mouse_and_keyboard_layout), this.a0);
        r3.r(view.findViewById(R.id.connection_settings_input_block_user_input_layout), this.c0);
        r3.r(view.findViewById(R.id.connection_settings_input_auto_keyboard_layout), checkBox);
        r3.r(view.findViewById(R.id.connection_settings_input_touch_mode_mouse_layout), radioButton);
        r3.r(view.findViewById(R.id.connection_settings_input_touch_mode_touchpad_layout), radioButton2);
        r3.r(view.findViewById(R.id.connection_settings_input_touch_mode_direct_layout), radioButton3);
        textView.setText(JniAdExt.n1("ad.cfg.video.fx.auto_keyboard"));
        textView2.setText(JniAdExt.n1("ad.menu.input.touch_mode.title"));
        textView3.setText(JniAdExt.n1("ad.menu.input.touch_mode.mouse"));
        textView4.setText(JniAdExt.n1("ad.menu.input.touch_mode.touchpad"));
        textView5.setText(JniAdExt.n1("ad.menu.input.touch_mode.direct"));
        P0();
        O0();
        checkBox.setChecked(JniAdExt.S2(5));
        int iR = r71.r(JniAdExt.T2(9));
        radioButton.setChecked(iR == 2);
        radioButton2.setChecked(iR == 3);
        radioButton3.setChecked(iR == 1);
        boolean zS3 = JniAdExt.s3();
        textView5.setEnabled(zS3);
        radioButton3.setEnabled(zS3);
        this.a0.setOnCheckedChangeListener(new ep(1));
        this.c0.setOnCheckedChangeListener(new ep(2));
        checkBox.setOnCheckedChangeListener(new ep(3));
        radioButton.setOnCheckedChangeListener(new fp(radioButton2, radioButton3, 0));
        radioButton2.setOnCheckedChangeListener(new fp(radioButton, radioButton3, 1));
        radioButton3.setOnCheckedChangeListener(new fp(radioButton, radioButton2, 2));
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
        cu0 cu0Var = new cu0(JniAdExt.T2(3));
        r3.s(this.b0, JniAdExt.n1("ad.menu.block"), cu0Var.c(), cu0Var.c() && cu0Var.a());
        r3.B(this.c0, cu0Var.b());
    }

    public final void P0() {
        cu0 cu0Var = new cu0(JniAdExt.T2(1));
        r3.s(this.Z, JniAdExt.n1("ad.menu.input"), cu0Var.c(), cu0Var.c() && cu0Var.a());
        r3.B(this.a0, cu0Var.b());
    }

    @Override // defpackage.id0
    public final void q(du0 du0Var) {
        t70.Y(new d3(this, 10, du0Var));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_input, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.Y3(this);
        JniAdExt.U3(this);
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
    }
}
