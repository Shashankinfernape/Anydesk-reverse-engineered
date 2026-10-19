package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class o extends yt implements hd0 {
    public String q0;
    public String r0;

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.z1(this);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.X3(this);
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new l(0, this));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0, R.style.LockdownDialogStyle);
        String str = this.q0;
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = str;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_lockdown, (ViewGroup) null);
        int i = 0;
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_lockdown_message);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_status_message_text);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.dialog_status_message_icon);
            r3.F(textView, this.r0);
            r3.F(textView2, String.format(JniAdExt.n1("ad.dlg.closed.status_message"), this.q0));
            String strO1 = JniAdExt.o1("ad.abook.support.limit.href");
            r3.H(imageView, strO1);
            r3.E(imageView, new n(this, i, strO1));
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.abook.dlg.error.get_more"), null);
        v7Var.b(JniAdExt.n1("ad.abook.dlg.error.close"), new DialogInterface.OnClickListener() { // from class: j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Dialog dialog = this.c.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
            }
        });
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new k(this, i));
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getString("skey_title");
        this.r0 = bundle.getString("skey_msg");
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putString("skey_title", this.q0);
        bundle.putString("skey_msg", this.r0);
    }
}
