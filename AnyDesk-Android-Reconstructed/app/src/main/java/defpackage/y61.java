package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y61 extends a6 implements pk0 {
    public Context e;
    public ActionBarContextView f;
    public bc g;
    public WeakReference h;
    public boolean i;
    public rk0 j;

    @Override // defpackage.a6
    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.b0(this);
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
        return this.j;
    }

    @Override // defpackage.a6
    public final MenuInflater d() {
        return new c81(this.f.getContext());
    }

    @Override // defpackage.a6
    public final CharSequence e() {
        return this.f.getSubtitle();
    }

    @Override // defpackage.pk0
    public final boolean f(rk0 rk0Var, MenuItem menuItem) {
        return ((ah) this.g.d).t(this, menuItem);
    }

    @Override // defpackage.a6
    public final CharSequence g() {
        return this.f.getTitle();
    }

    @Override // defpackage.a6
    public final void h() {
        this.g.c0(this, this.j);
    }

    @Override // defpackage.a6
    public final boolean i() {
        return this.f.u;
    }

    @Override // defpackage.a6
    public final void j(View view) {
        this.f.setCustomView(view);
        this.h = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.a6
    public final void k(int i) {
        l(this.e.getString(i));
    }

    @Override // defpackage.a6
    public final void l(CharSequence charSequence) {
        this.f.setSubtitle(charSequence);
    }

    @Override // defpackage.a6
    public final void m(int i) {
        n(this.e.getString(i));
    }

    @Override // defpackage.a6
    public final void n(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // defpackage.pk0
    public final void o(rk0 rk0Var) {
        h();
        w5 w5Var = this.f.f;
        if (w5Var != null) {
            w5Var.n();
        }
    }

    @Override // defpackage.a6
    public final void p(boolean z) {
        this.d = z;
        this.f.setTitleOptional(z);
    }
}
