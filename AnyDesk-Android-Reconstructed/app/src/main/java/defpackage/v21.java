package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public abstract class v21 extends yt {
    public String q0;
    public String r0;
    public int s0;
    public String t0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String str = this.q0;
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = str;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(S0(), (ViewGroup) null);
        T0(viewInflate);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new u21(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new u21(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public abstract int S0();

    public abstract void T0(View view);

    public abstract void U0();

    public abstract void V0(Bundle bundle);

    public abstract void W0(Bundle bundle);

    public abstract void X0();

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        X0();
        if (bundle == null) {
            bundle = H0();
        }
        V0(bundle);
        this.q0 = bundle.getString("skey_title");
        this.r0 = bundle.getString("skey_key");
        this.s0 = bundle.getInt("skey_input_type", 1);
        String string = bundle.getString("skey_regex_filter");
        this.t0 = string;
        if (this.q0 == null) {
            this.q0 = "";
        }
        if (this.r0 == null) {
            this.r0 = "";
        }
        if (string == null) {
            this.t0 = "";
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        W0(bundle);
        bundle.putString("skey_title", this.q0);
        bundle.putString("skey_key", this.r0);
        bundle.putInt("skey_input_type", this.s0);
        bundle.putString("skey_regex_filter", this.t0);
    }
}
