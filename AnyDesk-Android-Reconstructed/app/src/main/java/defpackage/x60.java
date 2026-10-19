package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class x60 extends yt {
    public w60 q0;
    public boolean r0 = false;
    public int s0;
    public String t0;
    public String u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public String y0;
    public String z0;

    public static x60 S0(boolean z, int i, String str, String str2, String str3, boolean z2, String str4, String str5) {
        x60 x60Var = new x60();
        Bundle bundle = new Bundle();
        bundle.putBoolean("skey_frag_listener", z);
        bundle.putInt("skey_type", i);
        bundle.putString("skey_title", str);
        bundle.putString("skey_msg", str2);
        bundle.putString("skey_checkbox_desc", str3);
        bundle.putBoolean("skey_checkbox_state", false);
        bundle.putBoolean("skey_checkbox_enabled", z2);
        bundle.putString("skey_pos_btn", str4);
        bundle.putString("skey_neg_btn", str5);
        x60Var.N0(bundle);
        return x60Var;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_checkbox_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.checkbox_dialog_container_wrapper);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox_dialog_checkbox);
        TextView textView = (TextView) viewInflate.findViewById(R.id.checkbox_dialog_checkbox_description);
        String str = this.v0;
        if (str == null || str.isEmpty()) {
            viewFindViewById.setVisibility(8);
        } else {
            textView.setText(this.v0);
            checkBox.setChecked(this.w0);
            textView.setEnabled(this.x0);
            checkBox.setEnabled(this.x0);
            checkBox.setOnCheckedChangeListener(new c3(6, this));
            viewFindViewById.setVisibility(0);
        }
        v7 v7Var = new v7(qaVarG0);
        r7 r7Var = (r7) v7Var.d;
        if (this.s0 == 3) {
            r7Var.c = R.drawable.ic_setup_critical;
        }
        r7Var.e = this.t0;
        r7Var.g = this.u0;
        r7Var.q = viewInflate;
        String str2 = this.y0;
        if (str2 != null && !str2.isEmpty()) {
            v7Var.d(this.y0, new v60(this, 0));
        }
        String str3 = this.z0;
        if (str3 != null && !str3.isEmpty()) {
            v7Var.b(this.z0, new v60(this, 1));
        }
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        w60 w60Var = this.q0;
        if (w60Var != null) {
            w60Var.C(this.s0, this.w0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (this.r0) {
            return;
        }
        try {
            this.q0 = (w60) context;
        } catch (ClassCastException unused) {
            this.q0 = null;
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getBoolean("skey_frag_listener");
        this.s0 = bundle.getInt("skey_type");
        this.t0 = bundle.getString("skey_title");
        this.u0 = bundle.getString("skey_msg");
        this.v0 = bundle.getString("skey_checkbox_desc");
        this.w0 = bundle.getBoolean("skey_checkbox_state");
        this.x0 = bundle.getBoolean("skey_checkbox_enabled");
        this.y0 = bundle.getString("skey_pos_btn");
        this.z0 = bundle.getString("skey_neg_btn");
        if (this.r0) {
            this.q0 = (w60) J0();
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        if (this.r0) {
            this.q0 = null;
        }
    }

    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void u0() {
        super.u0();
        if (this.r0) {
            return;
        }
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_frag_listener", this.r0);
        bundle.putInt("skey_type", this.s0);
        bundle.putString("skey_title", this.t0);
        bundle.putString("skey_msg", this.u0);
        bundle.putString("skey_checkbox_desc", this.v0);
        bundle.putBoolean("skey_checkbox_state", this.w0);
        bundle.putBoolean("skey_checkbox_enabled", this.x0);
        bundle.putString("skey_pos_btn", this.y0);
        bundle.putString("skey_neg_btn", this.z0);
    }
}
