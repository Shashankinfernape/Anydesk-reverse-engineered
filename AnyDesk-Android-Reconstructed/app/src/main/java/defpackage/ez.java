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
public class ez extends yt {
    public boolean r0;
    public String s0;
    public x00 t0;
    public AdEditText u0;
    public TextView v0;
    public Button w0;
    public final Logging q0 = new Logging("FileManagerDirCreateDialogFragment");
    public final y6 x0 = new y6(this, new f(7, this));
    public final ev y0 = new ev(4, this);

    public static void S0(ez ezVar) {
        x00 x00Var;
        Button button = ezVar.w0;
        AdEditText adEditText = ezVar.u0;
        if (adEditText == null || button == null || !button.isEnabled()) {
            return;
        }
        String text = adEditText.getText();
        if (text != null && (x00Var = ezVar.t0) != null) {
            text = text.replaceAll(x00Var.n(ezVar.r0), "");
        }
        if (text != null) {
            JniAdExt.I0.post(new ab0(ezVar.r0, text, 2));
        }
    }

    public static void T0(ez ezVar, String str) {
        TextView textView = ezVar.v0;
        Button button = ezVar.w0;
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
        x00 x00Var = ezVar.t0;
        if (x00Var == null) {
            strN1 = JniAdExt.n1("ad.file_manager.error.unknown");
        } else if (!x00Var.t(str, ezVar.r0)) {
            strN1 = JniAdExt.n1("ad.file_manager.error.already_exists");
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
        String strN1 = JniAdExt.n1("ad.file_browser.new_folder");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_text, (ViewGroup) null);
        this.v0 = (TextView) viewInflate.findViewById(R.id.settings_dialog_text_input_state);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.settings_dialog_text_input);
        this.u0 = adEditText;
        adEditText.l(this.s0, true);
        this.x0.g();
        x00 x00Var = this.t0;
        if (x00Var != null) {
            this.u0.setFilter(x00Var.n(this.r0));
        }
        this.u0.setTextListener(this.y0);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new dz(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new dz(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 5));
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getBoolean("skey_is_local");
        String string = bundle.getString("skey_dir_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = JniAdExt.n1("ad.file_browser.new_folder");
        }
        x00 x00Var = MainApplication.v().s;
        this.t0 = x00Var;
        if (x00Var == null) {
            this.q0.c("no view model");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.u0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.t0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_is_local", this.r0);
        String text = this.u0.getText();
        if (text == null) {
            text = JniAdExt.n1("ad.file_browser.new_folder");
        }
        bundle.putString("skey_dir_name", text);
    }
}
