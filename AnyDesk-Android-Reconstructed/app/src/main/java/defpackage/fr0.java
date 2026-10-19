package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class fr0 extends ow {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr0(rw0 rw0Var, int i) {
        super(rw0Var);
        this.d = i;
    }

    @Override // defpackage.ow
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                right = view.getRight() + ((sw0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                right = view.getBottom() + ((sw0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.ow
    public final int c(View view) {
        int iA;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                iA = rw0.A(view) + ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                iA = rw0.z(view) + ((ViewGroup.MarginLayoutParams) sw0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).bottomMargin;
                break;
        }
        return iA + i;
    }

    @Override // defpackage.ow
    public final int d(View view) {
        int iZ;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                iZ = rw0.z(view) + ((ViewGroup.MarginLayoutParams) sw0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).bottomMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                iZ = rw0.A(view) + ((ViewGroup.MarginLayoutParams) sw0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).rightMargin;
                break;
        }
        return iZ + i;
    }

    @Override // defpackage.ow
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                left = view.getLeft() - ((sw0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                ((rw0) obj).getClass();
                left = view.getTop() - ((sw0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.ow
    public final int f() {
        switch (this.d) {
            case 0:
                return ((rw0) this.b).n;
            default:
                return ((rw0) this.b).o;
        }
    }

    @Override // defpackage.ow
    public final int g() {
        int i;
        int iE;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rw0 rw0Var = (rw0) obj;
                i = rw0Var.n;
                iE = rw0Var.E();
                break;
            default:
                rw0 rw0Var2 = (rw0) obj;
                i = rw0Var2.o;
                iE = rw0Var2.C();
                break;
        }
        return i - iE;
    }

    @Override // defpackage.ow
    public final int h() {
        switch (this.d) {
            case 0:
                return ((rw0) this.b).E();
            default:
                return ((rw0) this.b).C();
        }
    }

    @Override // defpackage.ow
    public final int i() {
        switch (this.d) {
            case 0:
                return ((rw0) this.b).l;
            default:
                return ((rw0) this.b).m;
        }
    }

    @Override // defpackage.ow
    public final int j() {
        switch (this.d) {
            case 0:
                return ((rw0) this.b).m;
            default:
                return ((rw0) this.b).l;
        }
    }

    @Override // defpackage.ow
    public final int k() {
        switch (this.d) {
            case 0:
                return ((rw0) this.b).D();
            default:
                return ((rw0) this.b).F();
        }
    }

    @Override // defpackage.ow
    public final int l() {
        int iD;
        int iE;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                rw0 rw0Var = (rw0) obj;
                iD = rw0Var.n - rw0Var.D();
                iE = rw0Var.E();
                break;
            default:
                rw0 rw0Var2 = (rw0) obj;
                iD = rw0Var2.o - rw0Var2.F();
                iE = rw0Var2.C();
                break;
        }
        return iD - iE;
    }

    @Override // defpackage.ow
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((rw0) obj2).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((rw0) obj2).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.ow
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((rw0) obj2).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((rw0) obj2).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.ow
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((rw0) this.b).O(i);
                break;
            default:
                ((rw0) this.b).P(i);
                break;
        }
    }
}
