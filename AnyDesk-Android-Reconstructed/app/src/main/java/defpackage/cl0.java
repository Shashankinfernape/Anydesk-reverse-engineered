package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class cl0 {
    public final Context a;
    public final rk0 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public hl0 h;
    public al0 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final bl0 k = new bl0(0, this);

    public cl0(Context context, rk0 rk0Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = rk0Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final al0 a() {
        al0 a71Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                a71Var = new sj(context2, this.e, this.d, this.c);
            } else {
                a71Var = new a71(context2, this.b, this.e, this.d, this.c);
            }
            a71Var.n(this.b);
            a71Var.t(this.k);
            a71Var.p(this.e);
            a71Var.f(this.h);
            a71Var.q(this.g);
            a71Var.r(this.f);
            this.i = a71Var;
        }
        return this.i;
    }

    public final boolean b() {
        al0 al0Var = this.i;
        return al0Var != null && al0Var.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        al0 al0VarA = a();
        al0VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            al0VarA.s(i);
            al0VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            al0VarA.c = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        al0VarA.d();
    }
}
