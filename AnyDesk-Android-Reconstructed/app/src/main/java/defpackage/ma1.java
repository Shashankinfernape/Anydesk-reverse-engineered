package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ma1 implements il0 {
    public rk0 c;
    public vk0 d;
    public final /* synthetic */ Toolbar e;

    public ma1(Toolbar toolbar) {
        this.e = toolbar;
    }

    @Override // defpackage.il0
    public final boolean c(vk0 vk0Var) {
        Toolbar toolbar = this.e;
        KeyEvent.Callback callback = toolbar.k;
        if (callback instanceof rm) {
            ((xk0) ((rm) callback)).c.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.k);
        toolbar.removeView(toolbar.j);
        toolbar.k = null;
        ArrayList arrayList = toolbar.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.d = null;
        toolbar.requestLayout();
        vk0Var.C = false;
        vk0Var.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.il0
    public final boolean g(vk0 vk0Var) {
        Toolbar toolbar = this.e;
        toolbar.c();
        ViewParent parent = toolbar.j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.j);
            }
            toolbar.addView(toolbar.j);
        }
        View actionView = vk0Var.getActionView();
        toolbar.k = actionView;
        this.d = vk0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.k);
            }
            na1 na1VarH = Toolbar.h();
            na1VarH.a = (toolbar.p & 112) | 8388611;
            na1VarH.b = 2;
            toolbar.k.setLayoutParams(na1VarH);
            toolbar.addView(toolbar.k);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((na1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.c) {
                toolbar.removeViewAt(childCount);
                toolbar.G.add(childAt);
            }
        }
        toolbar.requestLayout();
        vk0Var.C = true;
        vk0Var.n.p(false);
        KeyEvent.Callback callback = toolbar.k;
        if (callback instanceof rm) {
            ((xk0) ((rm) callback)).c.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.il0
    public final int getId() {
        return 0;
    }

    @Override // defpackage.il0
    public final void h() {
        if (this.d != null) {
            rk0 rk0Var = this.c;
            if (rk0Var != null) {
                int size = rk0Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.c.getItem(i) == this.d) {
                        return;
                    }
                }
            }
            c(this.d);
        }
    }

    @Override // defpackage.il0
    public final void j(Context context, rk0 rk0Var) {
        vk0 vk0Var;
        rk0 rk0Var2 = this.c;
        if (rk0Var2 != null && (vk0Var = this.d) != null) {
            rk0Var2.d(vk0Var);
        }
        this.c = rk0Var;
    }

    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
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

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
    }
}
