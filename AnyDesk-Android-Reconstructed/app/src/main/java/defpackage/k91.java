package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class k91 extends y90 {
    public final /* synthetic */ Context i;
    public final /* synthetic */ TextPaint j;
    public final /* synthetic */ y90 k;
    public final /* synthetic */ l91 l;

    public k91(l91 l91Var, Context context, TextPaint textPaint, y90 y90Var) {
        this.l = l91Var;
        this.i = context;
        this.j = textPaint;
        this.k = y90Var;
    }

    @Override // defpackage.y90
    public final void N(int i) {
        this.k.N(i);
    }

    @Override // defpackage.y90
    public final void O(Typeface typeface, boolean z) {
        this.l.g(this.i, this.j, typeface);
        this.k.O(typeface, z);
    }
}
