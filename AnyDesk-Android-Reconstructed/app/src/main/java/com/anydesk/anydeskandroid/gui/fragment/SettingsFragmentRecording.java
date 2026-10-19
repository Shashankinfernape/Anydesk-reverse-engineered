package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.b;
import defpackage.c40;
import defpackage.i4;
import defpackage.io;
import defpackage.p31;
import defpackage.q31;
import defpackage.q51;
import defpackage.r3;
import defpackage.w30;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentRecording extends c40 {
    public View a0;
    public TextView b0;
    public CheckBox c0;
    public View d0;
    public View e0;
    public TextView f0;
    public CheckBox g0;
    public View h0;
    public final Logging Z = new Logging("SettingsFragmentRecording");
    public final xt0 i0 = new xt0(this);
    public final w30 j0 = (w30) F0(new p31(this, 0), new i4(1));
    public final w30 k0 = (w30) F0(new p31(this, 1), new i4(1));

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.a0 = view.findViewById(R.id.settings_recording_incoming_layout_container);
        this.b0 = (TextView) view.findViewById(R.id.settings_recording_incoming_description);
        this.c0 = (CheckBox) view.findViewById(R.id.settings_recording_incoming_checkbox);
        this.d0 = view.findViewById(R.id.settings_recording_incoming_toast_overlay);
        this.e0 = view.findViewById(R.id.settings_recording_outgoing_layout_container);
        this.f0 = (TextView) view.findViewById(R.id.settings_recording_outgoing_description);
        this.g0 = (CheckBox) view.findViewById(R.id.settings_recording_outgoing_checkbox);
        this.h0 = view.findViewById(R.id.settings_recording_outgoing_toast_overlay);
        r3.r(view.findViewById(R.id.settings_recording_incoming_layout), this.c0);
        r3.r(view.findViewById(R.id.settings_recording_outgoing_layout), this.g0);
        this.b0.setText(JniAdExt.n1("ad.cfg.recording.incoming"));
        this.f0.setText(JniAdExt.n1("ad.cfg.recording.outgoing"));
        this.c0.setOnCheckedChangeListener(new q31(this, 0));
        this.g0.setOnCheckedChangeListener(new q31(this, 1));
        b bVar = new b(23, this);
        this.d0.setOnClickListener(bVar);
        this.h0.setOnClickListener(bVar);
        O0();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    public final void O0() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3 = JniAdExt.s2(15) != 0;
        CheckBox checkBox = this.c0;
        io ioVar = io.KEY_RECORD_INCOMING;
        if (z3) {
            int iH2 = JniAdExt.h2(ioVar);
            int[] iArrS = q51.s(2);
            int length = iArrS.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i2 = 1;
                    break;
                }
                i2 = iArrS[i3];
                if (q51.r(i2) == iH2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        r3.B(checkBox, z);
        CheckBox checkBox2 = this.g0;
        io ioVar2 = io.KEY_RECORD_OUTGOING;
        if (z3) {
            int iH3 = JniAdExt.h2(ioVar2);
            int[] iArrS2 = q51.s(2);
            int length2 = iArrS2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    i = 1;
                    break;
                }
                i = iArrS2[i4];
                if (q51.r(i) == iH3) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        r3.B(checkBox2, z2);
        boolean z4 = z3 && !JniAdExt.p3(ioVar);
        boolean z5 = z3 && !JniAdExt.p3(ioVar2);
        r3.C(this.b0, z4);
        r3.C(this.c0, z4);
        r3.C(this.f0, z5);
        r3.C(this.g0, z5);
        int i5 = (JniAdExt.g2(io.KEY_FEATURE_ACCEPT) && JniAdExt.g2(io.KEY_LOGIN_ENABLED)) ? 0 : 8;
        int i6 = JniAdExt.g2(io.KEY_FEATURE_CONNECT) ? 0 : 8;
        r3.I(this.a0, i5);
        r3.I(this.e0, i6);
        r3.I(this.d0, (z3 || JniAdExt.p3(ioVar)) ? 8 : 0);
        r3.I(this.h0, (z3 || JniAdExt.p3(ioVar2)) ? 8 : 0);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_recording, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        O0();
    }
}
