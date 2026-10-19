package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class e21 extends yt {
    public HandlerThread q0;
    public s7 r0;
    public TextView s0;
    public TextView t0;
    public TextView u0;
    public TextView v0;
    public AdEditText w0;
    public Button x0;
    public d21 z0;
    public final y6 y0 = new y6(this, new f(16, this));
    public final b21 A0 = new b21(this);
    public final b21 B0 = new b21(this);

    public static boolean T0(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.replaceAll("[-._0-9a-zA-Z]", "").isEmpty();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        HandlerThread handlerThread = new HandlerThread("aliasHT");
        this.q0 = handlerThread;
        handlerThread.start();
        this.r0 = new s7(this, this.q0.getLooper(), 6);
        JniAdExt.w4(this.B0);
        U0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.w4(null);
        HandlerThread handlerThread = this.q0;
        if (handlerThread != null) {
            handlerThread.quit();
            this.q0 = null;
        }
        this.r0 = null;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.alias.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_alias, (ViewGroup) null);
        this.s0 = (TextView) viewInflate.findViewById(R.id.dialog_alias_state_available);
        this.t0 = (TextView) viewInflate.findViewById(R.id.dialog_alias_state_taken);
        this.u0 = (TextView) viewInflate.findViewById(R.id.dialog_alias_state_invalid);
        this.v0 = (TextView) viewInflate.findViewById(R.id.dialog_alias_state_regfail);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_alias_msg);
        this.w0 = (AdEditText) viewInflate.findViewById(R.id.dialog_alias_input);
        this.x0 = (Button) viewInflate.findViewById(R.id.dialog_alias_btn_pos);
        Button button = (Button) viewInflate.findViewById(R.id.dialog_alias_btn_neg);
        this.s0.setText(JniAdExt.n1("ad.alias.free"));
        this.t0.setText(JniAdExt.n1("ad.alias.taken"));
        this.u0.setText(JniAdExt.n1("ad.alias.invalid"));
        textView.setText(JniAdExt.n1("ad.inst.alias.description1") + " " + JniAdExt.n1("ad.inst.alias.description2"));
        this.w0.l("", false);
        this.x0.setText(JniAdExt.n1("ad.alias.claim_alias"));
        button.setText(JniAdExt.n1("ad.dlg.cancel"));
        this.x0.setOnClickListener(new a21(this, 0));
        button.setOnClickListener(new a21(this, 1));
        this.w0.setFilter("[\r\n\t]");
        this.w0.setTextListener(this.A0);
        this.y0.g();
        r7Var.q = viewInflate;
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final String S0() {
        AdEditText adEditText = this.w0;
        if (adEditText == null) {
            return null;
        }
        return adEditText.getText();
    }

    public final void U0() {
        String strS0 = S0();
        if (strS0 == null || strS0.isEmpty()) {
            V0(1);
            return;
        }
        if (!T0(S0())) {
            V0(2);
            return;
        }
        V0(1);
        s7 s7Var = this.r0;
        if (s7Var != null) {
            s7Var.removeMessages(q51.d(3));
            s7Var.sendEmptyMessageDelayed(q51.d(3), 1000L);
        }
    }

    public final void V0(int i) {
        Button button = this.x0;
        TextView textView = this.s0;
        TextView textView2 = this.t0;
        TextView textView3 = this.u0;
        TextView textView4 = this.v0;
        AdEditText adEditText = this.w0;
        if (button == null || textView == null || textView2 == null || textView4 == null || adEditText == null) {
            return;
        }
        button.setEnabled(i == 3);
        textView.setVisibility(i == 3 ? 0 : 4);
        textView2.setVisibility(i == 4 ? 0 : 4);
        textView3.setVisibility(i == 2 ? 0 : 4);
        textView4.setVisibility(i == 6 ? 0 : 4);
        adEditText.setEnabled(i != 5);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.z0 = (d21) J0();
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.w0.b();
        this.w0 = null;
        this.z0 = null;
    }
}
