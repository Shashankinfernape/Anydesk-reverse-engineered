package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class bv0 extends yt implements ng0 {
    public int q0;
    public ListenerScrollView r0;
    public View s0;
    public View t0;
    public View u0;
    public final q4 v0 = new q4(this, 10);

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.q0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarG0 = G0();
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_privacy_policy_dialog, (ViewGroup) null);
        int i = 0;
        int i2 = 1;
        if (viewInflate != null) {
            this.r0 = (ListenerScrollView) viewInflate.findViewById(R.id.privacy_policy_dialog_scroll_view);
            this.s0 = viewInflate.findViewById(R.id.privacy_policy_dialog_content);
            this.t0 = viewInflate.findViewById(R.id.privacy_policy_dialog_scroll_hint_top);
            this.u0 = viewInflate.findViewById(R.id.privacy_policy_dialog_scroll_hint_bottom);
            TextView textView = (TextView) viewInflate.findViewById(R.id.privacy_policy_dialog_message);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.privacy_policy_dialog_imprint_link);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.privacy_policy_dialog_privacy_policy_link);
            r3.F(textView, JniAdExt.n1("ad.about.ver.privacy.msg"));
            r3.F(textView2, t70.F("<u>" + JniAdExt.n1("ad.link.imprint") + "</u>"));
            r3.F(textView3, t70.F("<u>" + JniAdExt.n1("ad.about.ver.privacy.learn_more") + "</u>"));
            r3.E(textView2, new av0(this, i));
            r3.E(textView3, new av0(this, i2));
            this.r0.setListener(this);
            this.s0.addOnLayoutChangeListener(this.v0);
        }
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.about.ver.privacy");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.about.ver.privacy.agree"), new k4(2));
        boolean zC3 = JniAdExt.C3();
        i2 = JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_PRIVACY_POLICY) != 1 ? 0 : 1;
        if (zC3 && i2 != 0) {
            v7Var.b(JniAdExt.n1("ad.about.ver.privacy.reject"), new a(this, 8));
        }
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.t0, scrollY < this.q0 ? 4 : 0);
        r3.I(this.u0, bottom < this.q0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        boolean z;
        if (JniAdExt.h2(io.KEY_UI_ENABLE_DIALOG_PRIVACY_POLICY) == 1) {
            SharedPreferences sharedPreferences = MainApplication.v().T;
            Looper looper = t70.a;
            try {
                z = sharedPreferences.getBoolean("privacy_statement_shown", false);
            } catch (Throwable unused) {
                z = false;
            }
            if (z) {
                return;
            }
            System.exit(0);
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.r0.setListener(null);
        this.s0.removeOnLayoutChangeListener(this.v0);
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
    }
}
