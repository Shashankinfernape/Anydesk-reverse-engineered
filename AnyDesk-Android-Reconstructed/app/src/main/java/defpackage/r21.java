package defpackage;

import android.app.AppOpsManager;
import android.app.Dialog;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.PermissionIcon;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public class r21 extends yt implements g21, md0, w60 {
    public TextView A0;
    public View B0;
    public k21 C0;
    public q21[] D0;
    public View E0;
    public View F0;
    public View G0;
    public View H0;
    public String r0;
    public bc s0;
    public PermissionProfile t0;
    public View u0;
    public TextView v0;
    public TextView w0;
    public CheckBox x0;
    public TextView y0;
    public CheckBox z0;
    public final Logging q0 = new Logging("SettingsDialogFragmentPermissionProfileEdit");
    public boolean I0 = false;
    public final xt0 J0 = new xt0(this);
    public final tl0 K0 = new tl0(this, new k21(this));
    public final zd L0 = new zd(0);

    public static void S0(r21 r21Var) {
        AppOpsManager appOpsManager;
        bc bcVar = r21Var.s0;
        if (bcVar == null) {
            return;
        }
        bcVar.w0();
        MainApplication.v().l();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_UNATTENDED_ACCESS_INFO) == 0 || (appOpsManager = (AppOpsManager) r21Var.G0().getSystemService("appops")) == null || appOpsManager.checkOp("android:project_media", Binder.getCallingUid(), r21Var.I0().getPackageName()) == 0) {
            return;
        }
        bc bcVar2 = r21Var.s0;
        Looper looper = t70.a;
        boolean z = i >= 29 && !Settings.canDrawOverlays(r21Var.G0());
        bcVar2.getClass();
        qc1 qc1Var = new qc1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("skey_unattended_access_should_request_overlay_permission", z);
        qc1Var.N0(bundle);
        bcVar2.p0(qc1Var, "UnattendedAccessDialog", true);
    }

    @Override // defpackage.md0
    public final void H() {
        t70.Y(new n21(this, 1));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarY = Y();
        if (qaVarY == null) {
            return super.P0(bundle);
        }
        v7 v7Var = new v7(qaVarY);
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = JniAdExt.n1("ad.cfg.sec.perm.permission_profile");
        View viewInflate = qaVarY.getLayoutInflater().inflate(R.layout.fragment_dialog_permission_profile, (ViewGroup) null);
        int i = 1;
        this.I0 = true;
        this.u0 = viewInflate.findViewById(R.id.settings_group_security_pp_unattended_access);
        this.v0 = (TextView) viewInflate.findViewById(R.id.settings_security_pp_main_title);
        this.w0 = (TextView) viewInflate.findViewById(R.id.settings_security_pp_enabled_descriiption);
        this.x0 = (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_enabled_checkbox);
        this.y0 = (TextView) viewInflate.findViewById(R.id.settings_security_pp_unattended_access_active_description);
        this.z0 = (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_unattended_access_active_checkbox);
        this.A0 = (TextView) viewInflate.findViewById(R.id.settings_security_pp_unattended_access_passwd);
        this.B0 = viewInflate.findViewById(R.id.settings_security_pp_unattended_access_passwd_layout);
        r3.r(viewInflate.findViewById(R.id.settings_security_pp_enabled_layout), this.x0);
        r3.r(viewInflate.findViewById(R.id.settings_security_pp_unattended_access_active_layout), this.z0);
        this.w0.setText(JniAdExt.n1("ad.cfg.sec.perm.profile_enabled"));
        this.y0.setText(JniAdExt.n1("ad.cfg.sec.access.active"));
        this.A0.setText(JniAdExt.n1("ad.connect.share.set_passwd"));
        int i2 = 0;
        this.x0.setOnCheckedChangeListener(new l21(this, i2));
        this.z0.setOnCheckedChangeListener(new l21(this, i));
        this.B0.setOnClickListener(new m21(this, i2));
        TextView textView = (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_hint);
        this.D0 = new q21[19];
        V0(du0.pf_audio, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_audio_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_audio_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_audio_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_audio_layout), JniAdExt.n1("ad.cfg.sec.perm.audio"), new l21(this, 2), new m21(this, i));
        U0(du0.pf_input, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_ctrl_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_ctrl_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_ctrl_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_ctrl_layout), JniAdExt.n1("ad.cfg.sec.perm.ctrl"));
        U0(du0.pf_mouse_pointer, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_show_pointer_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_show_pointer_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_show_pointer_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_show_pointer_layout), JniAdExt.n1("ad.cfg.sec.perm.user_pointer"));
        U0(du0.pf_clipboard, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_layout), JniAdExt.n1("ad.cfg.sec.perm.clipbrd"));
        U0(du0.pf_clipboard_files, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_files_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_files_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_files_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_clipbrd_files_layout), JniAdExt.n1("ad.cfg.sec.perm.clipbrd.files"));
        this.E0 = viewInflate.findViewById(R.id.settings_security_pp_permissions_file_manager_layout);
        U0(du0.pf_file_manager, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_file_manager_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_file_manager_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_file_manager_checkbox), this.E0, JniAdExt.n1("ad.cfg.sec.perm.file_manager"));
        U0(du0.pf_sysinfo, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_sysinfo_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_sysinfo_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_sysinfo_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_sysinfo_layout), JniAdExt.n1("ad.cfg.sec.perm.sysinfo"));
        this.F0 = viewInflate.findViewById(R.id.settings_security_pp_permissions_tcp_tunnel_layout);
        U0(du0.pf_tcp_tunnel, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_tcp_tunnel_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_tcp_tunnel_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_tcp_tunnel_checkbox), this.F0, JniAdExt.n1("ad.cfg.sec.perm.tcp_tunnel"));
        this.G0 = viewInflate.findViewById(R.id.settings_security_pp_permissions_vpn_layout);
        U0(du0.pf_vpn, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_vpn_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_vpn_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_vpn_checkbox), this.G0, JniAdExt.n1("ad.cfg.sec.perm.vpn"));
        this.H0 = viewInflate.findViewById(R.id.settings_security_pp_permissions_record_layout);
        U0(du0.pf_record_session, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_record_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_record_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_record_checkbox), this.H0, JniAdExt.n1("ad.accept.auth.record_session"));
        U0(du0.pf_modify_forbidden_windows, (PermissionIcon) viewInflate.findViewById(R.id.settings_security_pp_permissions_modify_forbidden_windows_icon), (TextView) viewInflate.findViewById(R.id.settings_security_pp_permissions_modify_forbidden_windows_description), (CheckBox) viewInflate.findViewById(R.id.settings_security_pp_permissions_modify_forbidden_windows_checkbox), viewInflate.findViewById(R.id.settings_security_pp_permissions_modify_forbidden_windows_layout), JniAdExt.n1("ad.accept.auth.modify_forbidden_windows"));
        textView.setText(JniAdExt.n1("ad.cfg.sec.perm.permissions"));
        textView2.setText(JniAdExt.n1("ad.cfg.sec.perm.hint"));
        X0();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.cfg.close"), new k4(5));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.w60
    public final void Q(int i, boolean z) {
        if (i == 12) {
            if (t70.T(G0(), this.q0, t70.m(G0()))) {
                return;
            }
            this.J0.u(a0(), JniAdExt.n1("ad.setup.microphone.msg.request_failed"));
        }
    }

    public final void T0() {
        PermissionProfile[] permissionProfileArrF2 = JniAdExt.F2();
        this.t0 = null;
        if (permissionProfileArrF2 != null) {
            for (PermissionProfile permissionProfile : permissionProfileArrF2) {
                if (this.r0.equals(permissionProfile.a)) {
                    this.t0 = permissionProfile;
                }
            }
        }
    }

    public final void U0(du0 du0Var, PermissionIcon permissionIcon, TextView textView, CheckBox checkBox, View view, String str) {
        V0(du0Var, permissionIcon, textView, checkBox, view, str, new j3(this, du0Var, 1), new p(this, 10, du0Var));
    }

    public final void V0(du0 du0Var, PermissionIcon permissionIcon, TextView textView, CheckBox checkBox, View view, String str, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, View.OnClickListener onClickListener) {
        q21 p21Var;
        k21 k21Var = this.C0;
        k21Var.getClass();
        if (du0Var == du0.pf_clipboard_files) {
            p21Var = new o21(1);
        } else {
            p21Var = du0Var == du0.pf_modify_forbidden_windows ? new p21(k21Var.c) : new o21(0);
        }
        p21Var.a = du0Var;
        p21Var.b = permissionIcon;
        p21Var.c = textView;
        p21Var.d = checkBox;
        this.D0[du0Var.c] = p21Var;
        if (du0Var != du0.pf_modify_forbidden_windows && du0Var != du0.pf_feature_count) {
            synchronized (this.L0) {
                this.L0.add(du0Var);
            }
        }
        r3.r(view, p21Var.d);
        p21Var.c.setText(str);
        p21Var.d.setOnCheckedChangeListener(onCheckedChangeListener);
        p21Var.b.setOnClickListener(onClickListener);
    }

    public final void W0() {
        boolean z = this.I0;
        this.I0 = true;
        PermissionProfile permissionProfile = this.t0;
        boolean z2 = permissionProfile != null && permissionProfile.g;
        r3.F(this.v0, JniAdExt.n1("ad.cfg.sec.perm.profile") + ": " + this.t0.b);
        r3.B(this.x0, z2);
        PermissionProfile permissionProfile2 = this.t0;
        boolean z3 = (permissionProfile2 == null || permissionProfile2.j) ? false : true;
        r3.C(this.w0, z3);
        r3.C(this.x0, z3);
        this.I0 = z;
    }

    public final void X0() {
        boolean z = this.I0;
        this.I0 = true;
        T0();
        W0();
        Y0();
        boolean z2 = this.I0;
        this.I0 = true;
        for (q21 q21Var : this.D0) {
            if (q21Var != null) {
                PermissionProfile permissionProfile = this.t0;
                boolean zB = q21Var.b(permissionProfile);
                r3.B(q21Var.d, zB);
                r3.x(q21Var.b, zB);
                boolean zA = q21Var.a(permissionProfile);
                r3.C(q21Var.c, zA);
                r3.C(q21Var.d, zA);
                r3.y(q21Var.b, !zA);
            }
        }
        r3.I(this.E0, JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER) ? 0 : 8);
        r3.I(this.F0, JniAdExt.g2(io.KEY_FEATURE_TCP_TUNNELING) ? 0 : 8);
        r3.I(this.G0, JniAdExt.g2(io.KEY_FEATURE_VPN) ? 0 : 8);
        r3.I(this.H0, JniAdExt.g2(io.KEY_FEATURE_SESSION_RECORDING) ? 0 : 8);
        this.I0 = z2;
        r3.I(this.u0, JniAdExt.g2(io.KEY_FEATURE_UNATTENDED) ? 0 : 8);
        this.I0 = z;
    }

    public final void Y0() {
        boolean z = this.I0;
        this.I0 = true;
        PermissionProfile permissionProfile = this.t0;
        boolean z2 = permissionProfile != null && permissionProfile.e;
        boolean z3 = permissionProfile != null && permissionProfile.f;
        r3.B(this.z0, z2);
        boolean zG2 = JniAdExt.g2(io.KEY_FEATURE_UNATTENDED);
        boolean z4 = zG2 && !z3;
        boolean z5 = zG2 && !z3 && z2;
        r3.C(this.y0, z4);
        r3.C(this.z0, z4);
        r3.C(this.A0, z5);
        r3.C(this.B0, z5);
        this.I0 = z;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_pp_name");
        this.r0 = string;
        if (string == null) {
            this.r0 = "";
        }
        this.s0 = new bc(Z(), 19);
        this.C0 = new k21(this);
        JniAdExt.B1(this);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        zd zdVar = JniAdExt.e0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        bc bcVar = this.s0;
        if (bcVar != null) {
            bcVar.e = null;
        }
        this.C0 = null;
        this.s0 = null;
        this.r0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        for (q21 q21Var : this.D0) {
            if (q21Var != null) {
                q21Var.b = null;
                q21Var.c = null;
                q21Var.d = null;
            }
        }
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        this.I0 = false;
        X0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putString("skey_pp_name", this.r0);
    }

    @Override // defpackage.w60
    public final void C(int i, boolean z) {
    }
}
