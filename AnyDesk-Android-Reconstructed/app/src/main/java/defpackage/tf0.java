package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iC;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((hx0) this.k.get(i2)).a;
            sw0 sw0Var = (sw0) view3.getLayoutParams();
            if (view3 != view && !sw0Var.a.i() && (iC = (sw0Var.a.c() - this.d) * this.e) >= 0 && iC < i) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i = iC;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((sw0) view2.getLayoutParams()).a.c();
        }
    }

    public final View b(yw0 yw0Var) {
        List list = this.k;
        if (list == null) {
            View view = yw0Var.q(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((hx0) this.k.get(i)).a;
            sw0 sw0Var = (sw0) view2.getLayoutParams();
            if (!sw0Var.a.i() && this.d == sw0Var.a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
