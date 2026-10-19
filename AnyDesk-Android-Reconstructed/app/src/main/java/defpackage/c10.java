package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class c10 implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ f10 d;

    public /* synthetic */ c10(f10 f10Var, int i) {
        this.c = i;
        this.d = f10Var;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.c;
        f10 f10Var = this.d;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                Handler handler = f10Var.p0;
                c cVar = f10Var.q0;
                handler.removeCallbacks(cVar);
                int iIntValue = num.intValue();
                if (f10Var.u0 != null && Build.VERSION.SDK_INT >= 23) {
                    int i2 = f10Var.r0.w;
                    Context contextA0 = f10Var.a0();
                    Drawable drawable = null;
                    if (contextA0 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i3 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i2 == 0 && iIntValue == 1) {
                            drawable = contextA0.getDrawable(i3);
                        } else {
                            if (i2 == 1 && iIntValue == 2) {
                                i3 = R.drawable.fingerprint_dialog_error;
                            } else if ((i2 == 2 && iIntValue == 1) || (i2 == 1 && iIntValue == 3)) {
                            }
                            drawable = contextA0.getDrawable(i3);
                        }
                    }
                    if (drawable != null) {
                        f10Var.u0.setImageDrawable(drawable);
                        if ((i2 != 0 || iIntValue != 1) && ((i2 == 1 && iIntValue == 2) || (i2 == 2 && iIntValue == 1))) {
                            d10.a(drawable);
                        }
                        f10Var.r0.w = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = f10Var.v0;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? f10Var.s0 : f10Var.t0);
                }
                handler.postDelayed(cVar, 2000L);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                Handler handler2 = f10Var.p0;
                c cVar2 = f10Var.q0;
                handler2.removeCallbacks(cVar2);
                TextView textView2 = f10Var.v0;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(cVar2, 2000L);
                break;
        }
    }
}
