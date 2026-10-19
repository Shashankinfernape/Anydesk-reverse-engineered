package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.c40;
import defpackage.ep;
import defpackage.gi;
import defpackage.h31;
import defpackage.i31;
import defpackage.i4;
import defpackage.io;
import defpackage.j31;
import defpackage.q51;
import defpackage.r3;
import defpackage.r71;
import defpackage.s0;
import defpackage.t70;
import defpackage.w30;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentGeneral extends c40 {
    public final w30 A0;
    public final w30 B0;
    public gi a0;
    public LinearLayout b0;
    public View c0;
    public TextView d0;
    public CheckBox e0;
    public View f0;
    public TextView g0;
    public TextView h0;
    public CheckBox i0;
    public View j0;
    public TextView k0;
    public TextView l0;
    public CheckBox m0;
    public View n0;
    public TextView o0;
    public TextView p0;
    public RadioButton q0;
    public TextView r0;
    public RadioButton s0;
    public LinearLayout t0;
    public TextView u0;
    public CheckBox v0;
    public LinearLayout w0;
    public CheckBox x0;
    public final w30 z0;
    public final Logging Z = new Logging("SettingsFragmentGeneral");
    public final xt0 y0 = new xt0(this);

    public SettingsFragmentGeneral() {
        int i = 2;
        this.z0 = (w30) F0(new i31(this, 0), new i4(i));
        this.A0 = (w30) F0(new i31(this, 1), new i4(i));
        this.B0 = (w30) F0(new i31(this, 2), new i4(i));
    }

    public static void O0(SettingsFragmentGeneral settingsFragmentGeneral, Uri uri, w30 w30Var) {
        try {
            Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
            if (uri != null) {
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri);
            }
            w30Var.a(intent);
        } catch (Throwable th) {
            q51.o(th, new StringBuilder("cannot select ringtone: "), settingsFragmentGeneral.Z);
            settingsFragmentGeneral.y0.u(settingsFragmentGeneral.a0(), JniAdExt.n1("ad.msg.ringtone_picker_failed.android"));
        }
    }

    public static void P0(SettingsFragmentGeneral settingsFragmentGeneral, View view, int i, Intent intent) {
        if (i != -1 || intent == null) {
            return;
        }
        settingsFragmentGeneral.R0(view, (Uri) t70.x(intent, "android.intent.extra.ringtone.PICKED_URI"));
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        Uri uri;
        this.b0 = (LinearLayout) view.findViewById(R.id.settings_group_general_sound);
        TextView textView = (TextView) view.findViewById(R.id.settings_general_title_sound);
        this.c0 = view.findViewById(R.id.settings_general_sound_on_incoming_connection_request_active_layout);
        this.d0 = (TextView) view.findViewById(R.id.settings_general_sound_on_incoming_connection_request_active_description);
        this.e0 = (CheckBox) view.findViewById(R.id.settings_general_sound_on_incoming_connection_request_active_checkbox);
        this.f0 = view.findViewById(R.id.settings_general_sound_on_incoming_connection_request_layout);
        this.g0 = (TextView) view.findViewById(R.id.settings_general_sound_on_incoming_connection_request_description);
        this.h0 = (TextView) view.findViewById(R.id.settings_general_sound_on_session_creation_active_description);
        this.i0 = (CheckBox) view.findViewById(R.id.settings_general_sound_on_session_creation_active_checkbox);
        this.j0 = view.findViewById(R.id.settings_general_sound_on_session_creation_layout);
        this.k0 = (TextView) view.findViewById(R.id.settings_general_sound_on_session_creation_description);
        this.l0 = (TextView) view.findViewById(R.id.settings_general_sound_on_session_close_active_description);
        this.m0 = (CheckBox) view.findViewById(R.id.settings_general_sound_on_session_close_active_checkbox);
        this.n0 = view.findViewById(R.id.settings_general_sound_on_session_close_layout);
        this.o0 = (TextView) view.findViewById(R.id.settings_general_sound_on_session_close_description);
        TextView textView2 = (TextView) view.findViewById(R.id.settings_general_title_chat_log);
        this.p0 = (TextView) view.findViewById(R.id.settings_general_chat_log_source_none_description);
        this.q0 = (RadioButton) view.findViewById(R.id.settings_general_chat_log_source_none_radiobutton);
        this.r0 = (TextView) view.findViewById(R.id.settings_general_chat_log_source_auto_description);
        this.s0 = (RadioButton) view.findViewById(R.id.settings_general_chat_log_source_auto_radiobutton);
        this.t0 = (LinearLayout) view.findViewById(R.id.settings_group_general_online_status_receive);
        TextView textView3 = (TextView) view.findViewById(R.id.settings_general_title_online_status_receive);
        this.u0 = (TextView) view.findViewById(R.id.settings_general_online_status_receive_description);
        this.v0 = (CheckBox) view.findViewById(R.id.settings_general_online_status_receive_checkbox);
        this.w0 = (LinearLayout) view.findViewById(R.id.settings_group_general_telemetry);
        TextView textView4 = (TextView) view.findViewById(R.id.settings_general_title_telemetry);
        TextView textView5 = (TextView) view.findViewById(R.id.settings_general_telemetry_hint);
        TextView textView6 = (TextView) view.findViewById(R.id.settings_general_telemetry_link);
        TextView textView7 = (TextView) view.findViewById(R.id.settings_general_telemetry_checkbox_description);
        this.x0 = (CheckBox) view.findViewById(R.id.settings_general_allow_telemetry_checkbox);
        gi giVar = this.a0;
        if (giVar != null) {
            synchronized (giVar) {
                uri = (Uri) giVar.b;
            }
            r3.F(this.g0, Q0(uri));
        }
        gi giVar2 = this.a0;
        if (giVar2 != null) {
            r3.F(this.k0, Q0(giVar2.e()));
        }
        gi giVar3 = this.a0;
        if (giVar3 != null) {
            r3.F(this.o0, Q0(giVar3.d()));
        }
        r3.r(this.c0, this.e0);
        r3.r(view.findViewById(R.id.settings_general_sound_on_session_creation_active_layout), this.i0);
        r3.r(view.findViewById(R.id.settings_general_sound_on_session_close_active_layout), this.m0);
        r3.r(view.findViewById(R.id.settings_general_chat_log_source_none_layout), this.q0);
        r3.r(view.findViewById(R.id.settings_general_chat_log_source_auto_layout), this.s0);
        r3.r(view.findViewById(R.id.settings_general_online_status_receive_layout), this.v0);
        r3.r(view.findViewById(R.id.settings_general_telemetry_layout), this.x0);
        textView.setText(JniAdExt.n1("ad.cfg.ui.notification_sound.title"));
        this.d0.setText(JniAdExt.n1("ad.cfg.ui.notification_sound.incoming_conn_request"));
        this.h0.setText(JniAdExt.n1("ad.cfg.ui.notification_sound.sess_create"));
        this.l0.setText(JniAdExt.n1("ad.cfg.ui.notification_sound.sess_close"));
        textView2.setText(JniAdExt.n1("ad.cfg.priv.chat"));
        this.p0.setText(JniAdExt.n1("ad.cfg.priv.chat.none"));
        this.r0.setText(JniAdExt.n1("ad.cfg.priv.chat.auto"));
        textView3.setText(JniAdExt.n1("ad.cfg.sec.online_status.title"));
        this.u0.setText(JniAdExt.n1("ad.cfg.sec.online_status.receive"));
        textView4.setText(JniAdExt.n1("ad.telemetry.consent_title"));
        textView5.setText(JniAdExt.n1("ad.telemetry.consent_text"));
        textView6.setText(t70.F("<u>" + JniAdExt.n1("ad.telemetry.consent_learn_more") + "</u>"));
        textView7.setText(JniAdExt.n1("ad.telemetry.allow_data"));
        final int i = 0;
        this.e0.setOnCheckedChangeListener(new j31(this, i));
        final int i2 = 1;
        this.i0.setOnCheckedChangeListener(new j31(this, i2));
        int i3 = 2;
        this.m0.setOnCheckedChangeListener(new j31(this, i3));
        this.f0.setOnClickListener(new h31(this, i2));
        this.j0.setOnClickListener(new h31(this, i3));
        this.n0.setOnClickListener(new h31(this, 3));
        this.q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: g31
            public final /* synthetic */ SettingsFragmentGeneral b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i;
                io ioVar = io.KEY_CHAT_PATH_CFG;
                SettingsFragmentGeneral settingsFragmentGeneral = this.b;
                switch (i4) {
                    case 0:
                        if (z) {
                            JniAdExt.y4(ioVar, 0);
                            r3.B(settingsFragmentGeneral.s0, false);
                        }
                        break;
                    default:
                        if (z) {
                            JniAdExt.y4(ioVar, 1);
                            r3.B(settingsFragmentGeneral.q0, false);
                        }
                        break;
                }
            }
        });
        this.s0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: g31
            public final /* synthetic */ SettingsFragmentGeneral b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i2;
                io ioVar = io.KEY_CHAT_PATH_CFG;
                SettingsFragmentGeneral settingsFragmentGeneral = this.b;
                switch (i4) {
                    case 0:
                        if (z) {
                            JniAdExt.y4(ioVar, 0);
                            r3.B(settingsFragmentGeneral.s0, false);
                        }
                        break;
                    default:
                        if (z) {
                            JniAdExt.y4(ioVar, 1);
                            r3.B(settingsFragmentGeneral.q0, false);
                        }
                        break;
                }
            }
        });
        this.v0.setOnCheckedChangeListener(new ep(11));
        this.x0.setOnCheckedChangeListener(new ep(12));
        textView6.setOnClickListener(new h31(this, i));
        s0 s0Var = new s0(4, this);
        this.f0.setOnLongClickListener(s0Var);
        this.j0.setOnLongClickListener(s0Var);
        this.n0.setOnLongClickListener(s0Var);
        T0();
    }

    public final String Q0(Uri uri) {
        Ringtone ringtone = RingtoneManager.getRingtone(a0(), uri);
        if (ringtone == null) {
            return null;
        }
        return ringtone.getTitle(a0());
    }

    public final void R0(View view, Uri uri) {
        gi giVar;
        if (view == null || (giVar = this.a0) == null) {
            return;
        }
        View view2 = this.f0;
        if (view2 != null && view2.getId() == view.getId()) {
            r3.F(this.g0, Q0(uri));
            synchronized (giVar) {
                giVar.b = uri;
                giVar.h((SharedPreferences) giVar.e, "notification_sound_incoming_connection_request", uri);
            }
            return;
        }
        View view3 = this.j0;
        if (view3 != null && view3.getId() == view.getId()) {
            r3.F(this.k0, Q0(uri));
            giVar.j(uri);
            return;
        }
        View view4 = this.n0;
        if (view4 == null || view4.getId() != view.getId()) {
            return;
        }
        r3.F(this.o0, Q0(uri));
        giVar.i(uri);
    }

    public final void S0() {
        boolean zIsEnabled = this.f0.isEnabled();
        CheckBox checkBox = this.e0;
        if (zIsEnabled) {
            checkBox.setNextFocusDownId(this.f0.getId());
            this.i0.setNextFocusUpId(this.f0.getId());
        } else {
            checkBox.setNextFocusDownId(-1);
            this.i0.setNextFocusUpId(-1);
        }
        boolean zIsEnabled2 = this.j0.isEnabled();
        CheckBox checkBox2 = this.i0;
        if (zIsEnabled2) {
            checkBox2.setNextFocusDownId(this.j0.getId());
            this.m0.setNextFocusUpId(this.j0.getId());
        } else {
            checkBox2.setNextFocusDownId(-1);
            this.m0.setNextFocusUpId(-1);
        }
    }

    public final void T0() {
        io ioVar = io.KEY_UI_NOTIFICATION_SOUND_INCOMING_CONN_REQUEST;
        boolean z = JniAdExt.h2(ioVar) == 1;
        io ioVar2 = io.KEY_UI_NOTIFICATION_SOUND_SESS_CREATE;
        boolean z2 = JniAdExt.h2(ioVar2) == 1;
        io ioVar3 = io.KEY_UI_NOTIFICATION_SOUND_SESS_CLOSE;
        boolean z3 = JniAdExt.h2(ioVar3) == 1;
        r3.B(this.e0, z);
        r3.B(this.i0, z2);
        r3.B(this.m0, z3);
        r3.C(this.f0, z);
        r3.C(this.g0, z);
        r3.C(this.j0, z2);
        r3.C(this.k0, z2);
        r3.C(this.n0, z3);
        r3.C(this.o0, z3);
        boolean zP3 = JniAdExt.p3(ioVar);
        boolean zP4 = JniAdExt.p3(ioVar2);
        boolean zP5 = JniAdExt.p3(ioVar3);
        boolean z4 = !zP3;
        r3.C(this.e0, z4);
        boolean z5 = !zP4;
        r3.C(this.i0, z5);
        boolean z6 = !zP5;
        r3.C(this.m0, z6);
        r3.C(this.d0, z4);
        r3.C(this.h0, z5);
        r3.C(this.l0, z6);
        boolean zG2 = JniAdExt.g2(io.KEY_FEATURE_ACCEPT);
        io ioVar4 = io.KEY_FEATURE_CONNECT;
        boolean zG3 = JniAdExt.g2(ioVar4);
        int i = zG2 ? 0 : 8;
        int i2 = (zG2 || zG3) ? 0 : 8;
        r3.I(this.c0, i);
        r3.I(this.f0, i);
        r3.I(this.b0, i2);
        S0();
        io ioVar5 = io.KEY_CHAT_PATH_CFG;
        int iQ = r71.q(JniAdExt.h2(ioVar5));
        r3.B(this.q0, iQ == 1);
        r3.B(this.s0, iQ != 1);
        boolean z7 = !JniAdExt.p3(ioVar5);
        r3.C(this.p0, z7);
        r3.C(this.q0, z7);
        r3.C(this.r0, z7);
        r3.C(this.s0, z7);
        CheckBox checkBox = this.v0;
        io ioVar6 = io.KEY_ONLINE_STATUS_RECEIVE;
        r3.B(checkBox, JniAdExt.h2(ioVar6) != 0);
        boolean z8 = !JniAdExt.p3(ioVar6);
        r3.C(this.u0, z8);
        r3.C(this.v0, z8);
        r3.I(this.t0, JniAdExt.g2(ioVar4) ? 0 : 8);
        r3.B(this.x0, JniAdExt.Z2());
        r3.I(this.w0, JniAdExt.g2(io.KEY_FEATURE_TELEMETRY) ? 0 : 8);
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.a0 = MainApplication.v().v;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_general, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.a0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
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
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        T0();
    }
}
