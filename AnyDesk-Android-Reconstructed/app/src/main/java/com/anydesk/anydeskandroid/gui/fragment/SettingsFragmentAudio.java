package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAudio;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.bc;
import defpackage.c40;
import defpackage.ep;
import defpackage.io;
import defpackage.m;
import defpackage.q51;
import defpackage.r3;
import defpackage.t70;
import defpackage.tl0;
import defpackage.w60;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentAudio extends c40 implements w60 {
    public View a0;
    public View b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public TextView f0;
    public RadioButton g0;
    public RadioButton h0;
    public RadioButton i0;
    public TextView j0;
    public TextView k0;
    public CheckBox l0;
    public bc m0;
    public final Logging Z = new Logging("SettingsFragmentAudio");
    public final xt0 n0 = new xt0(this);
    public final tl0 o0 = new tl0(this, new xt0(11, this));

    public static void O0(int i) {
        int iR = q51.r(i);
        JniAdExt.y4(io.KEY_AUDIO_TRANSMIT_MODE, iR);
        t70.c0(MainApplication.v().T, "ad.audio.transmit_mode", iR);
    }

    @Override // defpackage.w60
    public final void C(int i, boolean z) {
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.m0 = new bc(Z(), 19);
        this.a0 = view.findViewById(R.id.settings_group_audio_transmission);
        this.b0 = view.findViewById(R.id.settings_group_audio_output);
        this.c0 = (TextView) view.findViewById(R.id.settings_audio_title_transmission);
        TextView textView = (TextView) view.findViewById(R.id.settings_audio_transmission_hint);
        this.d0 = (TextView) view.findViewById(R.id.settings_audio_transmission_inactive_description);
        this.e0 = (TextView) view.findViewById(R.id.settings_audio_transmission_output_description);
        this.f0 = (TextView) view.findViewById(R.id.settings_audio_transmission_mic_description);
        this.g0 = (RadioButton) view.findViewById(R.id.settings_audio_transmission_inactive_radiobutton);
        this.h0 = (RadioButton) view.findViewById(R.id.settings_audio_transmission_output_radiobutton);
        this.i0 = (RadioButton) view.findViewById(R.id.settings_audio_transmission_mic_radiobutton);
        this.j0 = (TextView) view.findViewById(R.id.settings_audio_title_output);
        this.k0 = (TextView) view.findViewById(R.id.settings_audio_output_description);
        this.l0 = (CheckBox) view.findViewById(R.id.settings_audio_output_checkbox);
        r3.r(view.findViewById(R.id.settings_audio_transmission_inactive_layout), this.g0);
        View viewFindViewById = view.findViewById(R.id.settings_audio_transmission_output_layout);
        r3.r(viewFindViewById, this.h0);
        r3.r(view.findViewById(R.id.settings_audio_transmission_mic_layout), this.i0);
        r3.r(view.findViewById(R.id.settings_audio_output_layout), this.l0);
        if (Build.VERSION.SDK_INT < 29) {
            viewFindViewById.setOnClickListener(new m(7, this));
        }
        this.c0.setText(JniAdExt.n1("ad.cfg.audio.transmission"));
        textView.setText(JniAdExt.n1("ad.cfg.audio.transmission.access_hint"));
        this.d0.setText(JniAdExt.n1("ad.cfg.audio.inactive"));
        this.e0.setText(JniAdExt.n1("ad.cfg.audio.transmission.monitor"));
        this.f0.setText(JniAdExt.n1("ad.cfg.audio.transmission.microphone"));
        this.j0.setText(JniAdExt.n1("ad.cfg.audio.output"));
        this.k0.setText(JniAdExt.n1("ad.cfg.audio.output.active"));
        final int i = 0;
        this.g0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d31
            public final /* synthetic */ SettingsFragmentAudio b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = i;
                SettingsFragmentAudio settingsFragmentAudio = this.b;
                switch (i2) {
                    case 0:
                        if (z) {
                            SettingsFragmentAudio.O0(1);
                            r3.B(settingsFragmentAudio.h0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        break;
                    case 1:
                        if (z) {
                            SettingsFragmentAudio.O0(3);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                    default:
                        if (z) {
                            SettingsFragmentAudio.O0(2);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.h0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.h0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d31
            public final /* synthetic */ SettingsFragmentAudio b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = i2;
                SettingsFragmentAudio settingsFragmentAudio = this.b;
                switch (i3) {
                    case 0:
                        if (z) {
                            SettingsFragmentAudio.O0(1);
                            r3.B(settingsFragmentAudio.h0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        break;
                    case 1:
                        if (z) {
                            SettingsFragmentAudio.O0(3);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                    default:
                        if (z) {
                            SettingsFragmentAudio.O0(2);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.h0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.i0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: d31
            public final /* synthetic */ SettingsFragmentAudio b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i3;
                SettingsFragmentAudio settingsFragmentAudio = this.b;
                switch (i4) {
                    case 0:
                        if (z) {
                            SettingsFragmentAudio.O0(1);
                            r3.B(settingsFragmentAudio.h0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        break;
                    case 1:
                        if (z) {
                            SettingsFragmentAudio.O0(3);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.i0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                    default:
                        if (z) {
                            SettingsFragmentAudio.O0(2);
                            r3.B(settingsFragmentAudio.g0, false);
                            r3.B(settingsFragmentAudio.h0, false);
                        }
                        settingsFragmentAudio.o0.a(settingsFragmentAudio, z);
                        break;
                }
            }
        });
        this.l0.setOnCheckedChangeListener(new ep(10));
        P0();
    }

    public final void P0() {
        io ioVar = io.KEY_AUDIO_TRANSMIT_MODE;
        int iH2 = JniAdExt.h2(ioVar);
        io ioVar2 = io.KEY_AUDIO_PLAYBACK_MODE;
        int iH3 = JniAdExt.h2(ioVar2);
        if (iH2 != 0) {
            r3.m(this, new String[]{"android.permission.RECORD_AUDIO"}, this.o0.a);
        }
        r3.B(this.g0, iH2 == 0);
        r3.B(this.h0, iH2 == 2);
        r3.B(this.i0, iH2 == 1);
        r3.B(this.l0, iH3 != 0);
        boolean zP3 = JniAdExt.p3(ioVar);
        boolean z = !zP3;
        boolean z2 = !JniAdExt.p3(ioVar2);
        r3.C(this.d0, z);
        r3.C(this.e0, !zP3 && Build.VERSION.SDK_INT >= 29);
        r3.C(this.f0, z);
        r3.C(this.g0, z);
        r3.C(this.h0, !zP3 && Build.VERSION.SDK_INT >= 29);
        r3.C(this.i0, z);
        r3.C(this.k0, z2);
        r3.C(this.l0, z2);
        int i = (JniAdExt.g2(io.KEY_FEATURE_ACCEPT) && JniAdExt.g2(io.KEY_LOGIN_ENABLED)) ? 0 : 8;
        int i2 = JniAdExt.g2(io.KEY_FEATURE_CONNECT) ? 0 : 8;
        r3.I(this.a0, i);
        r3.I(this.b0, i2);
    }

    @Override // defpackage.w60
    public final void Q(int i, boolean z) {
        if (i == 12) {
            if (t70.T(G0(), this.Z, t70.m(G0()))) {
                return;
            }
            this.n0.u(a0(), JniAdExt.n1("ad.setup.microphone.msg.request_failed"));
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_audio, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        bc bcVar = this.m0;
        if (bcVar != null) {
            bcVar.e = null;
            this.m0 = null;
        }
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
        this.k0 = null;
        this.l0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        P0();
    }
}
