package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;

/* JADX INFO: loaded from: classes.dex */
public class t21 extends v21 {
    public s21 u0;
    public AdEditText v0;
    public String w0;
    public final y6 x0 = new y6(this, new f(18, this));
    public final xt0 y0 = new xt0(8, this);

    @Override // defpackage.v21
    public final int S0() {
        return R.layout.fragment_dialog_text;
    }

    @Override // defpackage.v21
    public final void T0(View view) {
        AdEditText adEditText = (AdEditText) view.findViewById(R.id.settings_dialog_text_input);
        this.v0 = adEditText;
        adEditText.setInputType(this.s0);
        this.v0.l(this.w0, true);
        this.v0.setFilter(this.t0);
        this.v0.setTextListener(this.y0);
        if (t70.e(this.s0, 16) || t70.e(this.s0, 128) || t70.e(this.s0, 144) || t70.e(this.s0, 224)) {
            return;
        }
        this.x0.g();
    }

    @Override // defpackage.v21
    public final void U0() {
        s21 s21Var;
        AdEditText adEditText = this.v0;
        if (adEditText == null || (s21Var = this.u0) == null) {
            return;
        }
        s21Var.N(this.r0, adEditText.getText());
    }

    @Override // defpackage.v21
    public final void V0(Bundle bundle) {
        String string = bundle.getString("skey_text");
        this.w0 = string;
        if (string == null) {
            this.w0 = "";
        }
    }

    @Override // defpackage.v21
    public final void W0(Bundle bundle) {
        String text = this.v0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_text", text);
    }

    @Override // defpackage.v21
    public final void X0() {
        this.u0 = (s21) J0();
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.u0 = null;
        AdEditText adEditText = this.v0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.v0 = null;
    }
}
