package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.jni.JniAdExt;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends yt {
    public AbookRosterFragment q0;
    public String r0;
    public String s0;
    public String t0;
    public AdEditText u0;
    public AdEditText v0;
    public final y6 w0;
    public final y6 x0;
    public final af1 y0 = new af1(4, this);

    public p0() {
        final int i = 0;
        this.w0 = new y6(this, new Supplier(this) { // from class: n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i2 = i;
                p0 p0Var = this.b;
                switch (i2) {
                    case 0:
                        return p0Var.u0;
                    default:
                        return p0Var.v0;
                }
            }
        });
        final int i2 = 1;
        this.x0 = new y6(this, new Supplier(this) { // from class: n0
            public final /* synthetic */ p0 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i3 = i2;
                p0 p0Var = this.b;
                switch (i3) {
                    case 0:
                        return p0Var.u0;
                    default:
                        return p0Var.v0;
                }
            }
        });
    }

    public static void S0(p0 p0Var) {
        AdEditText adEditText;
        String text;
        String text2;
        AdEditText adEditText2 = p0Var.u0;
        if (adEditText2 == null || (adEditText = p0Var.v0) == null || (text = adEditText2.getText()) == null || (text2 = adEditText.getText()) == null) {
            return;
        }
        String strReplaceAll = text.replaceAll("[;,\r\n]", "");
        String strReplaceAll2 = text2.replaceAll("[;,\r\n]", "");
        if (p0Var.q0 != null) {
            String str = p0Var.t0;
            if (JniAdExt.R2() == 1) {
                return;
            }
            JniAdExt.I0.post(new xa0(JniAdExt.P2(), strReplaceAll, strReplaceAll2, str));
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        AdEditText adEditText = this.u0;
        if (adEditText != null) {
            adEditText.l(this.r0, false);
        }
        AdEditText adEditText2 = this.v0;
        if (adEditText2 != null) {
            adEditText2.l(this.s0, false);
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.abook.menu.add_item");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_roster_item_create, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.abook_roster_item_create_name_input_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.abook_roster_item_create_addr_input_title);
        this.u0 = (AdEditText) viewInflate.findViewById(R.id.abook_roster_item_create_name_input);
        this.v0 = (AdEditText) viewInflate.findViewById(R.id.abook_roster_item_create_addr_input);
        textView.setText(JniAdExt.n1("ad.abook.dlg.new_name"));
        textView2.setText(JniAdExt.n1("ad.abook.dlg.new_addr"));
        this.u0.setFilter("[;,\r\n]");
        this.w0.g();
        this.v0.setFilter("[;,\r\n]");
        this.v0.setTextListener(this.y0);
        this.x0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new o0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new o0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (AbookRosterFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_edit_roster_item_name");
        this.r0 = string;
        if (string == null) {
            this.r0 = "";
        }
        String string2 = bundle.getString("skey_edit_roster_item_addr");
        this.s0 = string2;
        if (string2 == null) {
            this.s0 = "";
        }
        String string3 = bundle.getString("skey_edit_roster_item_comment");
        this.t0 = string3;
        if (string3 == null) {
            this.t0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.u0.b();
        this.v0.b();
        this.u0 = null;
        this.v0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.u0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_edit_roster_item_name", text);
        String text2 = this.v0.getText();
        bundle.putString("skey_edit_roster_item_addr", text2 != null ? text2 : "");
        bundle.putString("skey_edit_roster_item_comment", this.t0);
    }
}
