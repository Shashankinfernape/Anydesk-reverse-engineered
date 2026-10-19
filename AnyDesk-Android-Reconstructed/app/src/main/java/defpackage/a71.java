package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class a71 extends al0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context d;
    public final rk0 e;
    public final ok0 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final gl0 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public hl0 p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final b3 k = new b3(6, this);
    public final qj l = new qj(3, this);
    public int u = 0;

    public a71(Context context, rk0 rk0Var, View view, int i, boolean z) {
        this.d = context;
        this.e = rk0Var;
        this.g = z;
        this.f = new ok0(rk0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.i = i;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new gl0(context, null, i, 0);
        rk0Var.b(this, context);
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
        if (rk0Var != this.e) {
            return;
        }
        dismiss();
        hl0 hl0Var = this.p;
        if (hl0Var != null) {
            hl0Var.a(rk0Var, z);
        }
    }

    @Override // defpackage.b51
    public final boolean b() {
        return !this.r && this.j.B.isShowing();
    }

    @Override // defpackage.b51
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.r || (view = this.n) == null) {
            nh0.j("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.o = view;
        gl0 gl0Var = this.j;
        ac acVar = gl0Var.B;
        ac acVar2 = gl0Var.B;
        acVar.setOnDismissListener(this);
        gl0Var.r = this;
        gl0Var.A = true;
        acVar2.setFocusable(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        gl0Var.q = view2;
        gl0Var.n = this.u;
        boolean z2 = this.s;
        Context context = this.d;
        ok0 ok0Var = this.f;
        if (!z2) {
            this.t = al0.o(ok0Var, context, this.h);
            this.s = true;
        }
        gl0Var.r(this.t);
        acVar2.setInputMethodMode(2);
        Rect rect = this.c;
        gl0Var.z = rect != null ? new Rect(rect) : null;
        gl0Var.d();
        uv uvVar = gl0Var.e;
        uvVar.setOnKeyListener(this);
        if (this.v) {
            rk0 rk0Var = this.e;
            if (rk0Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) uvVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(rk0Var.m);
                }
                frameLayout.setEnabled(false);
                uvVar.addHeaderView(frameLayout, null, false);
            }
        }
        gl0Var.q(ok0Var);
        gl0Var.d();
    }

    @Override // defpackage.b51
    public final void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // defpackage.il0
    public final void f(hl0 hl0Var) {
        this.p = hl0Var;
    }

    @Override // defpackage.il0
    public final void h() {
        this.s = false;
        ok0 ok0Var = this.f;
        if (ok0Var != null) {
            ok0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.b51
    public final uv i() {
        return this.j.e;
    }

    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
        boolean z;
        if (q71Var.hasVisibleItems()) {
            cl0 cl0Var = new cl0(this.d, q71Var, this.o, this.g, this.i, 0);
            hl0 hl0Var = this.p;
            cl0Var.h = hl0Var;
            al0 al0Var = cl0Var.i;
            if (al0Var != null) {
                al0Var.f(hl0Var);
            }
            int size = q71Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = q71Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            cl0Var.g = z;
            al0 al0Var2 = cl0Var.i;
            if (al0Var2 != null) {
                al0Var2.q(z);
            }
            cl0Var.j = this.m;
            this.m = null;
            this.e.c(false);
            gl0 gl0Var = this.j;
            int width = gl0Var.h;
            int iO = gl0Var.o();
            if ((Gravity.getAbsoluteGravity(this.u, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!cl0Var.b()) {
                if (cl0Var.e != null) {
                    cl0Var.d(width, iO, true, true);
                }
            }
            hl0 hl0Var2 = this.p;
            if (hl0Var2 != null) {
                hl0Var2.v(q71Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.il0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.il0
    public final Parcelable m() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.r = true;
        this.e.c(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.al0
    public final void p(View view) {
        this.n = view;
    }

    @Override // defpackage.al0
    public final void q(boolean z) {
        this.f.c = z;
    }

    @Override // defpackage.al0
    public final void r(int i) {
        this.u = i;
    }

    @Override // defpackage.al0
    public final void s(int i) {
        this.j.h = i;
    }

    @Override // defpackage.al0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.al0
    public final void u(boolean z) {
        this.v = z;
    }

    @Override // defpackage.al0
    public final void v(int i) {
        this.j.k(i);
    }

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
    }

    @Override // defpackage.al0
    public final void n(rk0 rk0Var) {
    }
}
