package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class ti extends y90 {
    public final Typeface i;
    public final af1 j;
    public boolean k;

    public ti(af1 af1Var, Typeface typeface) {
        this.i = typeface;
        this.j = af1Var;
    }

    @Override // defpackage.y90
    public final void N(int i) {
        if (this.k) {
            return;
        }
        sm smVar = (sm) this.j.d;
        if (smVar.j(this.i)) {
            smVar.h(false);
        }
    }

    @Override // defpackage.y90
    public final void O(Typeface typeface, boolean z) {
        if (this.k) {
            return;
        }
        sm smVar = (sm) this.j.d;
        if (smVar.j(typeface)) {
            smVar.h(false);
        }
    }
}
