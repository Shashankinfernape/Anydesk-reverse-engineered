package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class mg1 extends a6 implements pk0 {
    public final Context e;
    public final rk0 f;
    public bc g;
    public WeakReference h;
    public final /* synthetic */ ng1 i;

    public mg1(ng1 ng1Var, Context context, bc bcVar) {
        this.i = ng1Var;
        this.e = context;
        this.g = bcVar;
        rk0 rk0Var = new rk0(context);
        rk0Var.l = 1;
        this.f = rk0Var;
        rk0Var.e = this;
    }

    @Override // defpackage.a6
    public final void a() {
        ng1 ng1Var = this.i;
        if (ng1Var.r != this) {
            return;
        }
        boolean z = ng1Var.y;
        boolean z2 = ng1Var.z;
        if (z || z2) {
            ng1Var.s = this;
            ng1Var.t = this.g;
        } else {
            this.g.b0(this);
        }
        this.g = null;
        ng1Var.e0(false);
        ActionBarContextView actionBarContextView = ng1Var.o;
        if (actionBarContextView.m == null) {
            actionBarContextView.e();
        }
        ng1Var.l.setHideOnContentScrollEnabled(ng1Var.E);
        ng1Var.r = null;
    }

    @Override // defpackage.a6
    public final View b() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.a6
    public final rk0 c() {
        return this.f;
    }

    @Override // defpackage.a6
    public final MenuInflater d() {
        return new c81(this.e);
    }

    @Override // defpackage.a6
    public final CharSequence e() {
        return this.i.o.getSubtitle();
    }

    @Override // defpackage.pk0
    public final boolean f(rk0 rk0Var, MenuItem menuItem) {
        bc bcVar = this.g;
        if (bcVar != null) {
            return ((ah) bcVar.d).t(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.a6
    public final CharSequence g() {
        return this.i.o.getTitle();
    }

    @Override // defpackage.a6
    public final void h() {
        if (this.i.r != this) {
            return;
        }
        rk0 rk0Var = this.f;
        rk0Var.w();
        try {
            this.g.c0(this, rk0Var);
        } finally {
            rk0Var.v();
        }
    }

    @Override // defpackage.a6
    public final boolean i() {
        return this.i.o.u;
    }

    @Override // defpackage.a6
    public final void j(View view) {
        this.i.o.setCustomView(view);
        this.h = new WeakReference(view);
    }

    @Override // defpackage.a6
    public final void k(int i) {
        l(this.i.j.getResources().getString(i));
    }

    @Override // defpackage.a6
    public final void l(CharSequence charSequence) {
        this.i.o.setSubtitle(charSequence);
    }

    @Override // defpackage.a6
    public final void m(int i) {
        n(this.i.j.getResources().getString(i));
    }

    @Override // defpackage.a6
    public final void n(CharSequence charSequence) {
        this.i.o.setTitle(charSequence);
    }

    @Override // defpackage.pk0
    public final void o(rk0 rk0Var) {
        if (this.g == null) {
            return;
        }
        h();
        w5 w5Var = this.i.o.f;
        if (w5Var != null) {
            w5Var.n();
        }
    }

    @Override // defpackage.a6
    public final void p(boolean z) {
        this.d = z;
        this.i.o.setTitleOptional(z);
    }
}
