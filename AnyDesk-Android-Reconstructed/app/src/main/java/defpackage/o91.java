package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o91 {
    public float c;
    public float d;
    public final WeakReference f;
    public l91 g;
    public final TextPaint a = new TextPaint(1);
    public final pl b = new pl(1, this);
    public boolean e = true;

    public o91(n91 n91Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(n91Var);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(l91 l91Var, Context context) {
        if (this.g != l91Var) {
            this.g = l91Var;
            WeakReference weakReference = this.f;
            if (l91Var != null) {
                TextPaint textPaint = this.a;
                pl plVar = this.b;
                l91Var.f(context, textPaint, plVar);
                n91 n91Var = (n91) weakReference.get();
                if (n91Var != null) {
                    textPaint.drawableState = n91Var.getState();
                }
                l91Var.e(context, textPaint, plVar);
                this.e = true;
            }
            n91 n91Var2 = (n91) weakReference.get();
            if (n91Var2 != null) {
                n91Var2.a();
                n91Var2.onStateChange(n91Var2.getState());
            }
        }
    }
}
