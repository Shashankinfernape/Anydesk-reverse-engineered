package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.PermissionIcon;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class k3 extends yt implements fd0 {
    public View A0;
    public vf B0;
    public ArrayList C0;
    public gu0 D0;
    public View E0;
    public View F0;
    public a3 G0;
    public h3[] H0;
    public bc K0;
    public i3 r0;
    public int s0;
    public boolean t0;
    public l3 u0;
    public boolean w0;
    public View x0;
    public Spinner y0;
    public ImageView z0;
    public final Logging q0 = new Logging("AcceptDialogFragment");
    public final Rect v0 = new Rect();
    public boolean I0 = false;
    public boolean J0 = false;
    public final xt0 L0 = new xt0(this);
    public final tl0 M0 = new tl0(this, new a3(this));
    public final b3 N0 = new b3(0, this);
    public final f3 O0 = new f3(0, this);

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        zd zdVar = JniAdExt.A;
        synchronized (zdVar) {
            zdVar.add(this);
        }
        Y0();
        this.w0 = true;
        S0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        zd zdVar = JniAdExt.A;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        this.w0 = false;
        MainApplication.v().p();
    }

    @Override // defpackage.fd0
    public final void D(int i) {
        z80 z80Var;
        l3 l3Var = this.u0;
        if (l3Var == null || (z80Var = l3Var.b) == null || z80Var.a != i) {
            return;
        }
        X0();
        W0();
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        z80 z80Var;
        qa qaVarY = Y();
        if (qaVarY == null) {
            return super.P0(bundle);
        }
        v7 v7Var = new v7(qaVarY);
        LayoutInflater layoutInflater = qaVarY.getLayoutInflater();
        this.K0 = new bc(Z(), 19);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_accept, (ViewGroup) null);
        this.x0 = viewInflate;
        this.I0 = true;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.dialog_accept_title_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_accept_title_text);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_accept_msg);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.dialog_accept_watermark);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.dialog_accept_profiles_list_title);
        this.y0 = (Spinner) viewInflate.findViewById(R.id.dialog_accept_profiles_list);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_title);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_hint);
        this.z0 = (ImageView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_switch);
        TextView textView7 = (TextView) viewInflate.findViewById(R.id.dialog_accept_open_chat_text);
        textView7.setText(JniAdExt.n1("ad.chat.open"));
        textView7.setOnClickListener(new m(1, this));
        View viewFindViewById = viewInflate.findViewById(R.id.dialog_accept_open_chat_icon);
        this.A0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new m(1, this));
        View view = this.A0;
        int i = 0;
        if (view != null) {
            Context context = view.getContext();
            vf vfVar = new vf(context);
            this.B0 = vfVar;
            Looper looper = t70.a;
            vfVar.i(uj.l(context, R.color.colorMotdText));
            this.B0.h(uj.l(context, R.color.colorBadgeBackground));
            this.B0.j(f0().getDimensionPixelSize(R.dimen.settings_icon_size) / 6);
            this.B0.m(f0().getDimensionPixelSize(R.dimen.settings_icon_size) / 6);
            this.B0.k();
            lk0.b(this.B0, this.A0);
            this.A0.addOnLayoutChangeListener(new z2(0, this));
        }
        MainApplication.v().u.g(this.s0, this, new y2(i, this));
        this.E0 = viewInflate.findViewById(R.id.dialog_accept_permissions_icon_container);
        this.F0 = viewInflate.findViewById(R.id.dialog_accept_permissions_detail_container);
        this.H0 = new h3[19];
        int i2 = 0;
        U0(du0.pf_audio, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_audio_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_audio_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_audio_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_audio_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_audio_checkbox), JniAdExt.n1("ad.cfg.sec.perm.audio"), new c3(i, this), new d3(this, 0, viewInflate));
        U0(du0.pf_input, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_ctrl_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_ctrl_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_ctrl_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_ctrl_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_ctrl_checkbox), JniAdExt.n1("ad.cfg.sec.perm.ctrl"), new x2(i2, this), new c0(this, 2, viewInflate));
        T0(du0.pf_mouse_pointer, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_show_pointer_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_show_pointer_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_show_pointer_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_show_pointer_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_show_pointer_checkbox), JniAdExt.n1("ad.cfg.sec.perm.user_pointer"));
        T0(du0.pf_clipboard, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_clipbrd_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_checkbox), JniAdExt.n1("ad.cfg.sec.perm.clipbrd"));
        T0(du0.pf_clipboard_files, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_clipbrd_files_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_files_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_files_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_files_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_clipbrd_files_checkbox), JniAdExt.n1("ad.cfg.sec.perm.clipbrd.files"));
        T0(du0.pf_file_manager, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_file_manager_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_file_manager_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_file_manager_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_file_manager_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_file_manager_checkbox), JniAdExt.n1("ad.cfg.sec.perm.file_manager"));
        T0(du0.pf_sysinfo, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_sysinfo_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_sysinfo_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_sysinfo_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_sysinfo_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_sysinfo_checkbox), JniAdExt.n1("ad.cfg.sec.perm.sysinfo"));
        T0(du0.pf_tcp_tunnel, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_tcp_tunnel_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_tcp_tunnel_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_tcp_tunnel_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_tcp_tunnel_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_tcp_tunnel_checkbox), JniAdExt.n1("ad.cfg.sec.perm.tcp_tunnel"));
        T0(du0.pf_vpn, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_vpn_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_vpn_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_vpn_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_vpn_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_vpn_checkbox), JniAdExt.n1("ad.cfg.sec.perm.vpn"));
        T0(du0.pf_record_session, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_record_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_record_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_record_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_record_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_record_checkbox), JniAdExt.n1("ad.accept.auth.record_session"));
        T0(du0.pf_modify_forbidden_windows, (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_modify_forbidden_windows_icon), viewInflate.findViewById(R.id.dialog_accept_permissions_detail_modify_forbidden_windows_layout), (PermissionIcon) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_modify_forbidden_windows_icon), (TextView) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_modify_forbidden_windows_description), (CheckBox) viewInflate.findViewById(R.id.dialog_accept_permissions_detail_modify_forbidden_windows_checkbox), JniAdExt.n1("ad.accept.auth.modify_forbidden_windows"));
        if (this.t0) {
            textView.setText(JniAdExt.n1("ad.accept.title.android"));
        } else {
            textView.setText(JniAdExt.n1("ad.accept.permissions.title"));
        }
        textView4.setText(JniAdExt.n1("ad.cfg.sec.perm.permission_profile"));
        textView5.setText(JniAdExt.n1("ad.cfg.sec.perm.permissions"));
        textView6.setText(JniAdExt.n1("ad.cfg.sec.perm.hint"));
        this.z0.setOnClickListener(new b(3, this));
        l3 l3Var = this.u0;
        if (l3Var != null && (z80Var = l3Var.b) != null) {
            Context contextA0 = a0();
            byte[] bArr = z80Var.g;
            boolean z = z80Var.e;
            Logging logging = this.q0;
            Bitmap bitmapE = t70.E(contextA0, bArr, z, false, logging);
            if (bitmapE != null) {
                imageView.setImageDrawable(new BitmapDrawable(f0(), bitmapE));
            }
            int iC = q51.c(z80Var.h);
            String strC = t70.c(z80Var.b, z80Var.f, z80Var.c, z80Var.d, z80Var.e);
            textView2.setText(this.t0 ? t70.r(iC, strC) : t70.s(iC, strC, logging));
        }
        textView3.setText(JniAdExt.n1("ad.watermark.license.needs_review_by_legal.android"));
        textView3.setVisibility(JniAdExt.s2(21) != 0 ? 8 : 0);
        this.y0.setAdapter((SpinnerAdapter) this.D0);
        this.y0.setOnItemSelectedListener(this.O0);
        Y0();
        ((r7) v7Var.d).q = this.x0;
        v7Var.d(this.t0 ? JniAdExt.n1("ad.accept.btn.accept") : JniAdExt.n1("ad.cfg.close"), new e3(this, i2));
        if (this.t0) {
            v7Var.b(JniAdExt.n1("ad.accept.btn.dismiss"), new e3(this, 1));
        }
        this.x0.getViewTreeObserver().addOnGlobalLayoutListener(this.N0);
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0() {
        z80 z80Var;
        if (this.w0) {
            MainApplication mainApplicationV = MainApplication.v();
            l3 l3Var = this.u0;
            if (l3Var != null && (z80Var = l3Var.b) != null && JniAdExt.M1(z80Var.a)) {
                mainApplicationV.p();
                return;
            }
            Rect rect = this.v0;
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            p90 p90VarC = mainApplicationV.S.c();
            if (p90VarC != null) {
                synchronized (p90VarC.h) {
                    p90VarC.h.set(f, f2, f3, f4);
                }
            }
        }
    }

    public final void T0(du0 du0Var, PermissionIcon permissionIcon, View view, PermissionIcon permissionIcon2, TextView textView, CheckBox checkBox, String str) {
        U0(du0Var, permissionIcon, view, permissionIcon2, textView, checkBox, str, new j3(this, du0Var, 0), new d3(this, 1, du0Var));
    }

    public final void U0(du0 du0Var, PermissionIcon permissionIcon, View view, PermissionIcon permissionIcon2, TextView textView, CheckBox checkBox, String str, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Runnable runnable) {
        h3 h3Var;
        k3 k3Var = this.G0.c;
        int i = 0;
        if (du0Var == du0.pf_audio) {
            h3Var = new g3(k3Var, i);
        } else {
            int i2 = 1;
            if (du0Var == du0.pf_input) {
                h3Var = new g3(k3Var, i2);
            } else if (du0Var == du0.pf_clipboard_files) {
                h3Var = new h3(k3Var, 1);
            } else {
                h3Var = du0Var == du0.pf_modify_forbidden_windows ? new h3(k3Var, 2) : new h3(k3Var, 0);
            }
        }
        h3Var.a = du0Var;
        h3Var.b = permissionIcon;
        h3Var.c = view;
        h3Var.d = permissionIcon2;
        h3Var.e = textView;
        h3Var.f = checkBox;
        this.H0[du0Var.c] = h3Var;
        r3.r(view, checkBox);
        h3Var.e.setText(str);
        h3Var.b.setTooltip(str);
        h3Var.f.setOnCheckedChangeListener(onCheckedChangeListener);
        p pVar = new p(h3Var, runnable);
        h3Var.d.setOnClickListener(pVar);
        h3Var.b.setOnClickListener(pVar);
    }

    public final void V0() {
        l3 l3Var = this.u0;
        if (l3Var == null) {
            return;
        }
        boolean zE = l3Var.e();
        r3.D(this.z0, zE ? R.drawable.ic_key_extend : R.drawable.ic_key_shrink);
        r3.I(this.E0, zE ? 8 : 0);
        r3.I(this.F0, zE ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0053. Please report as an issue. */
    public final void W0() {
        PermissionProfile permissionProfile;
        boolean z;
        boolean z2;
        boolean z3;
        z80 z80Var;
        z80 z80Var2;
        boolean z4 = this.I0;
        this.I0 = true;
        l3 l3Var = this.u0;
        if (l3Var == null || (z80Var2 = l3Var.b) == null || (permissionProfile = z80Var2.l) == null) {
            permissionProfile = null;
        }
        int iC = q51.c((l3Var == null || (z80Var = l3Var.b) == null) ? n11.d : z80Var.h);
        for (h3 h3Var : this.H0) {
            if (h3Var != null) {
                l3 l3Var2 = this.u0;
                if (permissionProfile == null) {
                    z = false;
                } else if (permissionProfile.m.contains(h3Var.a)) {
                    z = true;
                } else {
                    z = false;
                }
                r3.B(h3Var.f, z);
                r3.x(h3Var.d, z);
                r3.x(h3Var.b, z);
                if (l3Var2 != null) {
                    z80 z80Var3 = l3Var2.b;
                    switch (h3Var.g) {
                        case 0:
                            if (permissionProfile == null || !permissionProfile.a(h3Var.a, z80Var3.n)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            break;
                        case 1:
                            if (permissionProfile != null) {
                                if (permissionProfile.m.contains(du0.pf_clipboard) && permissionProfile.a(h3Var.a, z80Var3.n)) {
                                    z3 = true;
                                    break;
                                }
                            }
                            z3 = false;
                            break;
                        default:
                            if (permissionProfile != null) {
                                if (permissionProfile.m.contains(h3Var.a) && permissionProfile.a(h3Var.a, z80Var3.n)) {
                                    z3 = true;
                                    break;
                                }
                            }
                            z3 = false;
                            break;
                    }
                    if (z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                r3.C(h3Var.e, z2);
                r3.C(h3Var.f, z2);
                boolean z5 = !z2;
                r3.y(h3Var.d, z5);
                r3.y(h3Var.b, z5);
                int i = (!q51.e(iC, h3Var.a) || PermissionProfile.d(h3Var.a)) ? 8 : 0;
                r3.I(h3Var.c, i);
                r3.I(h3Var.b, i);
            }
        }
        this.I0 = z4;
    }

    public final void X0() {
        l3 l3Var;
        z80 z80Var;
        boolean z = this.I0;
        boolean z2 = true;
        this.I0 = true;
        Spinner spinner = this.y0;
        if (spinner == null || this.C0 == null || (l3Var = this.u0) == null || (z80Var = l3Var.b) == null) {
            return;
        }
        PermissionProfile permissionProfile = z80Var.l;
        if (permissionProfile != null && !permissionProfile.i) {
            z2 = false;
        }
        spinner.setEnabled(z2);
        this.C0.clear();
        ArrayList arrayList = this.u0.b.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PermissionProfile permissionProfileV2 = JniAdExt.V2(this.s0, (String) obj);
            if (!"_previous_session".equals(permissionProfileV2.a) && !permissionProfileV2.h) {
                if ("_scam_protection".equals(permissionProfileV2.a)) {
                    z80 z80Var2 = this.u0.b;
                    if (z80Var2.j || (z80Var2.i.c & 2) == 2) {
                    }
                }
            }
            this.C0.add(permissionProfileV2);
        }
        if (permissionProfile != null) {
            for (int i2 = 0; i2 < this.C0.size(); i2++) {
                if (permissionProfile.a.equals(((PermissionProfile) this.C0.get(i2)).a)) {
                    gu0 gu0Var = this.D0;
                    if (i2 != gu0Var.c) {
                        gu0Var.c = i2;
                        gu0Var.notifyDataSetChanged();
                    }
                    this.y0.setSelection(i2, false);
                }
            }
        }
        this.D0.notifyDataSetChanged();
        this.I0 = z;
    }

    public final void Y0() {
        boolean z = this.I0;
        this.I0 = true;
        X0();
        W0();
        V0();
        this.I0 = z;
    }

    @Override // defpackage.fd0
    public final void d(int i) {
        z80 z80Var;
        l3 l3Var = this.u0;
        if (l3Var == null || (z80Var = l3Var.b) == null || z80Var.a != i) {
            return;
        }
        X0();
        W0();
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (!this.t0 || this.r0 == null) {
            return;
        }
        JniAdExt.I0.post(new cp(this.s0, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        this.r0 = (i3) context;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.v0.set(0, 0, 0, 0);
        this.w0 = false;
        if (bundle == null) {
            bundle = H0();
        }
        this.s0 = bundle.getInt("skey_accept_session_idx");
        this.t0 = bundle.getBoolean("skey_accept_is_req");
        this.G0 = new a3(this);
        MainApplication mainApplicationV = MainApplication.v();
        int i = this.s0;
        Hashtable hashtable = mainApplicationV.t;
        l3 l3Var = (l3) hashtable.get(Integer.valueOf(i));
        if (l3Var == null) {
            z80 z80Var = (z80) JniAdExt.C0.get(Integer.valueOf(i));
            l3 l3Var2 = new l3(z80Var);
            if (z80Var != null) {
                hashtable.put(Integer.valueOf(i), l3Var2);
            }
            l3Var = l3Var2;
        }
        this.u0 = l3Var;
        if (l3Var.b == null) {
            t70.V(new c(5, this));
            return;
        }
        this.C0 = new ArrayList();
        Context contextA0 = a0();
        ArrayList arrayList = this.C0;
        z80 z80Var2 = this.u0.b;
        this.D0 = new gu0(contextA0, arrayList, z80Var2, q51.c(z80Var2.h));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        bc bcVar = this.K0;
        if (bcVar != null) {
            bcVar.e = null;
        }
        View view = this.x0;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.N0);
        }
        this.K0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.G0 = null;
        this.E0 = null;
        this.F0 = null;
        for (h3 h3Var : this.H0) {
            if (h3Var != null) {
                h3Var.b = null;
                h3Var.c = null;
                h3Var.d = null;
                h3Var.e = null;
                h3Var.f = null;
            }
        }
    }

    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void u0() {
        super.u0();
        this.r0 = null;
    }

    @Override // defpackage.c40
    public final void x0() {
        this.F = true;
        p90 p90VarC = MainApplication.v().S.c();
        if (p90VarC != null) {
            synchronized (p90VarC.f) {
                p90VarC.g = false;
            }
        }
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        this.I0 = false;
        p90 p90VarC = MainApplication.v().S.c();
        if (p90VarC != null) {
            synchronized (p90VarC.f) {
                p90VarC.g = true;
            }
        }
        Y0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_accept_session_idx", this.s0);
        bundle.putBoolean("skey_accept_is_req", this.t0);
    }
}
