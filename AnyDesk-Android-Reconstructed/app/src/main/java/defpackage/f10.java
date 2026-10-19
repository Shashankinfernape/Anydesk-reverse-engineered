package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class f10 extends xt {
    public final Handler p0 = new Handler(Looper.getMainLooper());
    public final c q0 = new c(24, this);
    public gh r0;
    public int s0;
    public int t0;
    public ImageView u0;
    public TextView v0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(I0());
        r7 r7Var = (r7) v7Var.d;
        bh bhVar = this.r0.d;
        String strG0 = null;
        r7Var.e = bhVar != null ? bhVar.c : null;
        View viewInflate = LayoutInflater.from(r7Var.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            bh bhVar2 = this.r0.d;
            CharSequence charSequence = bhVar2 != null ? bhVar2.d : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.r0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.u0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.v0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (y90.G(this.r0.e())) {
            strG0 = g0(R.string.confirm_device_credential_password);
        } else {
            gh ghVar = this.r0;
            String str = ghVar.i;
            if (str != null) {
                strG0 = str;
            } else if (ghVar.d != null) {
                strG0 = "";
            }
        }
        v7Var.b(strG0, new a(this, 7));
        r7Var.q = viewInflate;
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final int R0(int i) {
        Context contextA0 = a0();
        qa qaVarY = Y();
        if (contextA0 == null || qaVarY == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextA0.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = qaVarY.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        gh ghVar = this.r0;
        if (ghVar.v == null) {
            ghVar.v = new vm0();
        }
        gh.j(ghVar.v, Boolean.TRUE);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        qa qaVarY = Y();
        int i = 0;
        if (qaVarY != null) {
            bf1 bf1VarK = qaVarY.K();
            ze1 ze1VarS = qaVarY.S();
            um0 um0VarT = qaVarY.t();
            ze1VarS.getClass();
            ah ahVar = new ah(bf1VarK, ze1VarS, um0VarT);
            fm fmVarA = nx0.a(gh.class);
            String strU = y90.u(fmVarA);
            if (strU == null) {
                id.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            gh ghVar = (gh) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
            this.r0 = ghVar;
            if (ghVar.x == null) {
                ghVar.x = new vm0();
            }
            ghVar.x.e(this, new c10(this, i));
            gh ghVar2 = this.r0;
            if (ghVar2.y == null) {
                ghVar2.y = new vm0();
            }
            ghVar2.y.e(this, new c10(this, 1));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.s0 = R0(e10.a());
        } else {
            Context contextA0 = a0();
            this.s0 = contextA0 != null ? uj.l(contextA0, R.color.biometric_error_color) : 0;
        }
        this.t0 = R0(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.c40
    public final void x0() {
        this.F = true;
        this.p0.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        gh ghVar = this.r0;
        ghVar.w = 0;
        ghVar.h(1);
        this.r0.g(g0(R.string.fingerprint_dialog_touch_sensor));
    }
}
