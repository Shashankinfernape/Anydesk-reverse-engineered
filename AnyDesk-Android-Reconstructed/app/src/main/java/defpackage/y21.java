package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class y21 extends yt implements ng0 {
    public SettingsFragmentAccess q0;
    public View r0;
    public AdEditText s0;
    public ListenerScrollView t0;
    public boolean u0;
    public byte[] v0;
    public String w0;
    public int x0;
    public boolean y0 = false;
    public final xt0 z0 = new xt0(10, this);

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.g4();
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.x0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        r7 r7Var = (r7) v7Var.d;
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        if (this.u0) {
            r7Var.e = JniAdExt.n1("ad.dlg.two_factor_auth_enable.enable_title");
        } else {
            r7Var.e = JniAdExt.n1("ad.dlg.two_factor_auth_enable.setup_title");
        }
        r7Var.c = R.drawable.ic_dialog_key_red;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_two_factor_auth, (ViewGroup) null);
        this.r0 = viewInflate;
        String str = this.w0;
        int i = 0;
        if (viewInflate != null) {
            this.t0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_2fa_scroll_view);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_2fa_text);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.dialog_2fa_qr_code);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_2fa_qr_code_info);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.dialog_2fa_input_title);
            this.s0 = (AdEditText) viewInflate.findViewById(R.id.dialog_2fa_input);
            ListenerScrollView listenerScrollView = this.t0;
            if (listenerScrollView != null) {
                listenerScrollView.setListener(this);
            }
            if (textView != null) {
                if (this.u0) {
                    textView.setText(JniAdExt.n1("ad.dlg.two_factor_auth_enable.enable_text"));
                } else {
                    textView.setText(JniAdExt.n1("ad.dlg.two_factor_auth_enable.setup_text"));
                }
            }
            if (imageView != null) {
                imageView.setImageBitmap(JniAdExt.c2(this.v0));
            }
            if (textView2 != null) {
                textView2.setText(JniAdExt.G1(this.v0));
            }
            int i2 = this.u0 ? 0 : 8;
            if (textView3 != null) {
                textView3.setVisibility(i2);
                textView3.setText(JniAdExt.n1("ad.dlg.two_factor_auth.code"));
            }
            AdEditText adEditText = this.s0;
            if (adEditText != null) {
                adEditText.setVisibility(i2);
                if (this.u0) {
                    this.s0.l(str, false);
                    this.s0.setTextListener(this.z0);
                }
            }
        }
        r7Var.q = this.r0;
        if (this.u0) {
            v7Var.d(JniAdExt.n1("ad.dlg.two_factor_auth_enable.enable.android"), new x21(this, i));
        }
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new x21(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        View view = this.r0;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.dialog_2fa_scroll_hint_top);
            View viewFindViewById2 = view.findViewById(R.id.dialog_2fa_scroll_hint_bottom);
            if (viewFindViewById != null) {
                if (scrollY < this.x0) {
                    viewFindViewById.setVisibility(4);
                } else {
                    viewFindViewById.setVisibility(0);
                }
            }
            if (viewFindViewById2 != null) {
                if (bottom < this.x0) {
                    viewFindViewById2.setVisibility(4);
                } else {
                    viewFindViewById2.setVisibility(0);
                }
            }
        }
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        SettingsFragmentAccess settingsFragmentAccess = this.q0;
        if (settingsFragmentAccess != null) {
            t70.Y(new b31(settingsFragmentAccess, 1));
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (SettingsFragmentAccess) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.u0 = bundle.getBoolean("skey_enable_auth");
        this.v0 = bundle.getByteArray("skey_2fa_key");
        String string = bundle.getString("skey_code");
        this.w0 = string;
        if (string == null) {
            this.w0 = "";
        }
        zd zdVar = JniAdExt.d0;
        synchronized (zdVar) {
            zdVar.add(this);
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        zd zdVar = JniAdExt.d0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        ListenerScrollView listenerScrollView = this.t0;
        this.t0 = null;
        if (listenerScrollView != null) {
            listenerScrollView.setListener(null);
        }
        AdEditText adEditText = this.s0;
        this.s0 = null;
        if (adEditText != null) {
            adEditText.b();
        }
        this.r0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_enable_auth", this.u0);
        bundle.putByteArray("skey_2fa_key", this.v0);
        String text = this.s0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_code", text);
    }
}
