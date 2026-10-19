package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentConnection;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class w21 extends v21 {
    public SettingsFragmentConnection u0;
    public AdEditTextSecure v0;
    public t01 w0 = t01.e;
    public final xt0 x0 = new xt0(9, this);

    @Override // defpackage.v21
    public final int S0() {
        return R.layout.fragment_dialog_text_secure;
    }

    @Override // defpackage.v21
    public final void T0(View view) {
        AdEditTextSecure adEditTextSecure = (AdEditTextSecure) view.findViewById(R.id.settings_dialog_text_secure_input);
        this.v0 = adEditTextSecure;
        adEditTextSecure.setInputType(this.s0);
        this.v0.l(this.w0, true);
        this.v0.setFilter(this.t0);
        this.v0.setTextListener(this.x0);
    }

    @Override // defpackage.v21
    public final void U0() {
        SettingsFragmentConnection settingsFragmentConnection;
        AdEditTextSecure adEditTextSecure = this.v0;
        if (adEditTextSecure == null || (settingsFragmentConnection = this.u0) == null) {
            return;
        }
        String str = this.r0;
        t01 text = adEditTextSecure.getText();
        if ("ad.anynet.proxy.pass".equals(str)) {
            t70.Y(new jp(settingsFragmentConnection.z0, !text.isEmpty() ? "***" : "", 1));
            if (settingsFragmentConnection.C0) {
                return;
            }
            JniAdExt.C4(text);
            JniAdExt.Q3();
        }
    }

    @Override // defpackage.v21
    public final void V0(Bundle bundle) {
        this.w0.b();
        t01 t01Var = (t01) t70.A(bundle, "skey_text", t01.class);
        this.w0 = t01Var;
        if (t01Var == null) {
            this.w0 = t01.e;
        }
        bundle.remove("skey_text");
    }

    @Override // defpackage.v21
    public final void W0(Bundle bundle) {
        bundle.putSerializable("skey_text", this.v0.getText());
    }

    @Override // defpackage.v21
    public final void X0() {
        this.u0 = (SettingsFragmentConnection) J0();
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.u0 = null;
        AdEditTextSecure adEditTextSecure = this.v0;
        if (adEditTextSecure != null) {
            adEditTextSecure.b();
        }
        this.v0 = null;
    }
}
