package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public class xz extends yt {
    public boolean r0;
    public String s0;
    public String t0;
    public x00 u0;
    public AdEditText v0;
    public TextView w0;
    public Button x0;
    public final Logging q0 = new Logging("FileManagerFileItemRenameDialogFragment");
    public final y6 y0 = new y6(this, new f(9, this));
    public final ev z0 = new ev(6, this);

    public static void S0(xz xzVar) {
        x00 x00Var;
        Button button = xzVar.x0;
        AdEditText adEditText = xzVar.v0;
        if (adEditText == null || button == null || !button.isEnabled()) {
            return;
        }
        String text = adEditText.getText();
        if (text != null && (x00Var = xzVar.u0) != null) {
            text = text.replaceAll(x00Var.n(xzVar.r0), "");
        }
        if (text != null) {
            JniAdExt.I0.post(new bb0(xzVar.r0, xzVar.s0, text));
        }
    }

    public static void T0(xz xzVar, String str) {
        TextView textView = xzVar.w0;
        Button button = xzVar.x0;
        String strN1 = "";
        if (TextUtils.isEmpty(str)) {
            if (textView != null) {
                textView.setText("");
            }
            if (button != null) {
                button.setEnabled(false);
                return;
            }
            return;
        }
        if (str.equals(xzVar.s0)) {
            strN1 = JniAdExt.n1("ad.file_manager.error.already_exists");
        } else if (!str.equalsIgnoreCase(xzVar.s0)) {
            x00 x00Var = xzVar.u0;
            if (x00Var == null) {
                strN1 = JniAdExt.n1("ad.file_manager.error.unknown");
            } else if (!x00Var.t(str, xzVar.r0)) {
                strN1 = JniAdExt.n1("ad.file_manager.error.already_exists");
            }
        }
        if (textView != null) {
            textView.setText(strN1);
        }
        if (button != null) {
            button.setEnabled(strN1.isEmpty());
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        LayoutInflater layoutInflater = G0().getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.file_browser.menu.rename");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_text, (ViewGroup) null);
        this.w0 = (TextView) viewInflate.findViewById(R.id.settings_dialog_text_input_state);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.settings_dialog_text_input);
        this.v0 = adEditText;
        adEditText.l(this.t0, true);
        x00 x00Var = this.u0;
        if (x00Var != null) {
            this.v0.setFilter(x00Var.n(this.r0));
        }
        this.v0.setTextListener(this.z0);
        this.y0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new wz(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new wz(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 7));
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getBoolean("skey_is_local");
        this.s0 = bundle.getString("skey_current_name");
        String string = bundle.getString("skey_new_name");
        this.t0 = string;
        if (this.s0 == null) {
            this.s0 = "";
        }
        if (string == null) {
            this.t0 = this.s0;
        }
        x00 x00Var = MainApplication.v().s;
        this.u0 = x00Var;
        if (x00Var == null) {
            this.q0.c("no view model");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.v0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.u0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_is_local", this.r0);
        if (this.s0 == null) {
            this.s0 = "";
        }
        bundle.putString("skey_current_name", this.s0);
        String text = this.v0.getText();
        if (text == null) {
            text = this.s0;
        }
        bundle.putString("skey_new_name", text);
    }
}
