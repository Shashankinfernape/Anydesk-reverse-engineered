package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 {
    public ow a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public rf0() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        ow owVar = this.a;
        this.c = z ? owVar.g() : owVar.k();
    }

    public final void b(View view, int i) {
        ow owVar = this.a;
        int iL = Integer.MIN_VALUE == owVar.a ? 0 : owVar.l() - owVar.a;
        if (iL >= 0) {
            boolean z = this.d;
            ow owVar2 = this.a;
            if (z) {
                int iB = owVar2.b(view);
                ow owVar3 = this.a;
                this.c = (Integer.MIN_VALUE != owVar3.a ? owVar3.l() - owVar3.a : 0) + iB;
            } else {
                this.c = owVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        ow owVar4 = this.a;
        if (!z2) {
            int iE = owVar4.e(view);
            int iK = iE - this.a.k();
            this.c = iE;
            if (iK > 0) {
                int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                if (iG < 0) {
                    this.c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (owVar4.g() - iL) - this.a.b(view);
        this.c = this.a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.c - this.a.c(view);
            int iK2 = this.a.k();
            int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.c = Math.min(iG2, -iMin) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
