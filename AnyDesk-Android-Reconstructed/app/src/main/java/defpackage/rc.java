package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class rc extends uj {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ WeakReference p;
    public final /* synthetic */ wc q;

    public rc(wc wcVar, int i, int i2, WeakReference weakReference) {
        this.q = wcVar;
        this.n = i;
        this.o = i2;
        this.p = weakReference;
    }

    @Override // defpackage.uj
    public final void A(Typeface typeface) {
        int i;
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.n) != -1) {
            typeface = vc.a(typeface, i, (this.o & 2) != 0);
        }
        wc wcVar = this.q;
        if (wcVar.m) {
            wcVar.l = typeface;
            TextView textView = (TextView) this.p.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = wcVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new c6(i3, i2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    @Override // defpackage.uj
    public final void z(int i) {
    }
}
