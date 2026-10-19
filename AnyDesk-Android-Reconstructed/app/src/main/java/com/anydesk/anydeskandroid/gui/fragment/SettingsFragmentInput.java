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
import defpackage.ep;
import defpackage.io;
import defpackage.m31;
import defpackage.q51;
import defpackage.r3;
import defpackage.r71;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentInput extends c40 {
    public TextView Z;
    public CheckBox a0;
    public TextView b0;
    public TextView c0;
    public RadioButton d0;
    public TextView e0;
    public RadioButton f0;
    public TextView g0;
    public CheckBox h0;
    public TextView i0;
    public CheckBox j0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.Z = (TextView) view.findViewById(R.id.settings_input_auto_keyboard_description);
        this.a0 = (CheckBox) view.findViewById(R.id.settings_input_auto_keyboard_checkbox);
        this.b0 = (TextView) view.findViewById(R.id.settings_input_title_touch_mode);
        this.c0 = (TextView) view.findViewById(R.id.settings_input_touch_mode_mouse_description);
        this.d0 = (RadioButton) view.findViewById(R.id.settings_input_touch_mode_mouse_radiobutton);
        this.e0 = (TextView) view.findViewById(R.id.settings_input_touch_mode_touchpad_description);
        this.f0 = (RadioButton) view.findViewById(R.id.settings_input_touch_mode_touchpad_radiobutton);
        this.g0 = (TextView) view.findViewById(R.id.settings_input_auto_touch_to_touch_mode_description);
        this.h0 = (CheckBox) view.findViewById(R.id.settings_input_auto_touch_to_touch_mode_checkbox);
        this.i0 = (TextView) view.findViewById(R.id.settings_input_inject_mouse_as_touch_description);
        this.j0 = (CheckBox) view.findViewById(R.id.settings_input_inject_mouse_as_touch_checkbox);
        r3.r(view.findViewById(R.id.settings_input_auto_keyboard_layout), this.a0);
        r3.r(view.findViewById(R.id.settings_input_touch_mode_mouse_layout), this.d0);
        r3.r(view.findViewById(R.id.settings_input_touch_mode_touchpad_layout), this.f0);
        r3.r(view.findViewById(R.id.settings_input_auto_touch_to_touch_mode_layout), this.h0);
        r3.r(view.findViewById(R.id.settings_input_inject_mouse_as_touch_layout), this.j0);
        this.Z.setText(JniAdExt.n1("ad.cfg.video.fx.auto_keyboard"));
        this.b0.setText(JniAdExt.n1("ad.menu.input.touch_mode.title"));
        this.c0.setText(JniAdExt.n1("ad.menu.input.touch_mode.mouse"));
        this.e0.setText(JniAdExt.n1("ad.menu.input.touch_mode.touchpad"));
        this.g0.setText(JniAdExt.n1("ad.cfg.input.auto_touch_to_touch_mode"));
        this.i0.setText(JniAdExt.n1("ad.cfg.input.inject_mouse_as_touch"));
        this.a0.setOnCheckedChangeListener(new ep(14));
        this.d0.setOnCheckedChangeListener(new m31(this, 0));
        this.f0.setOnCheckedChangeListener(new m31(this, 1));
        this.h0.setOnCheckedChangeListener(new ep(15));
        this.j0.setOnCheckedChangeListener(new ep(16));
        O0();
    }

    public final void O0() {
        int i;
        CheckBox checkBox = this.a0;
        io ioVar = io.KEY_AUTOMATIC_KEYBOARD;
        r3.B(checkBox, JniAdExt.g2(ioVar));
        io ioVar2 = io.KEY_TOUCH_MODE;
        int iR = r71.r(JniAdExt.h2(ioVar2));
        r3.B(this.d0, iR == 2);
        r3.B(this.f0, iR == 3);
        CheckBox checkBox2 = this.h0;
        io ioVar3 = io.KEY_AUTOMATIC_TOUCH_TO_TOUCH_MODE;
        r3.B(checkBox2, JniAdExt.g2(ioVar3));
        io ioVar4 = io.KEY_INJECT_MOUSE_AS_TOUCH;
        int iH2 = JniAdExt.h2(ioVar4);
        int[] iArrS = q51.s(2);
        int length = iArrS.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = iArrS[i2];
            if (q51.r(i) == iH2) {
                break;
            } else {
                i2++;
            }
        }
        r3.B(this.j0, i == 2);
        boolean z = !JniAdExt.p3(ioVar);
        boolean z2 = !JniAdExt.p3(ioVar2);
        boolean z3 = !JniAdExt.p3(ioVar3);
        boolean z4 = !JniAdExt.p3(ioVar4);
        r3.C(this.Z, z);
        r3.C(this.a0, z);
        r3.C(this.c0, z2);
        r3.C(this.d0, z2);
        r3.C(this.e0, z2);
        r3.C(this.f0, z2);
        r3.C(this.g0, z3);
        r3.C(this.h0, z3);
        r3.C(this.i0, z4);
        r3.C(this.j0, z4);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_input, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        O0();
    }
}
