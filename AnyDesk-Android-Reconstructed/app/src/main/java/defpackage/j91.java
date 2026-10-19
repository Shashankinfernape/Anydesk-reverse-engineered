package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends uj {
    public final /* synthetic */ y90 n;
    public final /* synthetic */ l91 o;

    public j91(l91 l91Var, y90 y90Var) {
        this.o = l91Var;
        this.n = y90Var;
    }

    @Override // defpackage.uj
    public final void A(Typeface typeface) {
        l91 l91Var = this.o;
        Typeface typefaceCreate = Typeface.create(typeface, l91Var.c);
        l91Var.n = typefaceCreate;
        l91Var.m = true;
        this.n.O(typefaceCreate, false);
    }

    @Override // defpackage.uj
    public final void z(int i) {
        this.o.m = true;
        this.n.N(i);
    }
}
