package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class l4 extends yt {
    public String q0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        r7 r7Var = (r7) v7Var.d;
        r7Var.c = R.drawable.ic_dialog_key_red;
        StringBuilder sb = new StringBuilder();
        sb.append(JniAdExt.n1("ad.account.oauth.title"));
        if (!TextUtils.isEmpty(this.q0)) {
            sb.append(" (");
            sb.append(this.q0);
            sb.append(")");
        }
        r7Var.e = sb.toString();
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_account_oauth_waiting, (ViewGroup) null);
        if (viewInflate != null) {
            r3.F((TextView) viewInflate.findViewById(R.id.dialog_account_oauth_waiting_message), JniAdExt.n1("ad.account.oauth.waiting"));
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.account.login.back"), new k4(0));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.I0.post(new sc0(2));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_oauth_provider");
        this.q0 = string;
        if (string == null) {
            this.q0 = "";
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putString("skey_oauth_provider", this.q0);
    }
}
