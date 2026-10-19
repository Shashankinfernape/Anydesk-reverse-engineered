package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rw0 b;

    public /* synthetic */ pw0(rw0 rw0Var, int i) {
        this.a = i;
        this.b = rw0Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                right = view.getRight() + ((sw0) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                right = view.getBottom() + ((sw0) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                sw0 sw0Var = (sw0) view.getLayoutParams();
                left = view.getLeft() - ((sw0) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin;
                break;
            default:
                sw0 sw0Var2 = (sw0) view.getLayoutParams();
                left = view.getTop() - ((sw0) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) sw0Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int iE;
        int i2 = this.a;
        rw0 rw0Var = this.b;
        switch (i2) {
            case 0:
                i = rw0Var.n;
                iE = rw0Var.E();
                break;
            default:
                i = rw0Var.o;
                iE = rw0Var.C();
                break;
        }
        return i - iE;
    }

    public final int d() {
        int i = this.a;
        rw0 rw0Var = this.b;
        switch (i) {
            case 0:
                return rw0Var.D();
            default:
                return rw0Var.F();
        }
    }
}
