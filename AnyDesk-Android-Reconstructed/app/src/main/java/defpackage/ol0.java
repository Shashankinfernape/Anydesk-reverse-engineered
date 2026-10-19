package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class ol0 extends yt {
    public int q0;
    public String r0;
    public String s0;
    public String t0;
    public String u0;
    public String v0;
    public j7 w0;
    public j7 x0;
    public j7 y0;
    public boolean z0;

    public static ol0 S0(int i, String str, String str2, String str3, String str4, String str5, j7 j7Var, j7 j7Var2, j7 j7Var3, boolean z) {
        ol0 ol0Var = new ol0();
        Bundle bundle = new Bundle();
        bundle.putInt("skey_msg_icon", i);
        bundle.putString("skey_msg_title", str);
        bundle.putString("skey_msg_msg", str2);
        bundle.putString("skey_msg_button_pos", str3);
        bundle.putString("skey_msg_button_neg", str4);
        bundle.putString("skey_msg_button_ext", str5);
        if (j7Var != null) {
            bundle.putInt("skey_msg_action_pos", j7Var.c);
        }
        if (j7Var2 != null) {
            bundle.putInt("skey_msg_action_neg", j7Var2.c);
        }
        if (j7Var3 != null) {
            bundle.putInt("skey_msg_action_ext", j7Var3.c);
        }
        bundle.putBoolean("skey_msg_allow_chat", z);
        ol0Var.N0(bundle);
        return ol0Var;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        int i = this.q0;
        r7 r7Var = (r7) v7Var.d;
        r7Var.c = i;
        r7Var.e = this.r0;
        r7Var.g = this.s0;
        if (this.v0 != null) {
            View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_ext_btn, (ViewGroup) null);
            Button button = (Button) viewInflate.findViewById(R.id.dialog_ext_btn);
            button.setText(this.v0);
            button.setOnClickListener(new b(18, this));
            r7Var.q = viewInflate;
        }
        String str = this.t0;
        if (str != null) {
            v7Var.d(str, new nl0(this, 0));
        }
        String str2 = this.u0;
        if (str2 != null) {
            v7Var.b(str2, new nl0(this, 1));
        }
        w7 w7VarA = v7Var.a();
        if (this.z0) {
            R0(w7VarA);
        }
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.u0 != null) {
            Runnable runnable = this.x0.d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.w0.d;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getInt("skey_msg_icon");
        this.r0 = bundle.getString("skey_msg_title");
        this.s0 = bundle.getString("skey_msg_msg");
        this.t0 = bundle.getString("skey_msg_button_pos");
        this.u0 = bundle.getString("skey_msg_button_neg");
        this.v0 = bundle.getString("skey_msg_button_ext");
        this.w0 = j7.a(bundle.getInt("skey_msg_action_pos", 0));
        this.x0 = j7.a(bundle.getInt("skey_msg_action_neg", 0));
        this.y0 = j7.a(bundle.getInt("skey_msg_action_ext", 0));
        this.z0 = bundle.getBoolean("skey_msg_allow_chat");
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_msg_icon", this.q0);
        bundle.putString("skey_msg_title", this.r0);
        bundle.putString("skey_msg_msg", this.s0);
        bundle.putString("skey_msg_button_pos", this.t0);
        bundle.putString("skey_msg_button_neg", this.u0);
        bundle.putString("skey_msg_button_ext", this.v0);
        bundle.putInt("skey_msg_action_pos", this.w0.c);
        bundle.putInt("skey_msg_action_neg", this.x0.c);
        bundle.putInt("skey_msg_action_ext", this.y0.c);
        bundle.putBoolean("skey_msg_allow_chat", this.z0);
    }
}
