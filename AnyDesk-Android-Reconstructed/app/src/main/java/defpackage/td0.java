package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class td0 extends qh0 implements uu, a90 {
    public wd0 i;

    @Override // defpackage.a90
    public final boolean a() {
        return true;
    }

    @Override // defpackage.uu
    public final void b() {
        q().Y(this);
    }

    @Override // defpackage.a90
    public final vp0 d() {
        return null;
    }

    public pd0 getParent() {
        return q();
    }

    public final wd0 q() {
        wd0 wd0Var = this.i;
        if (wd0Var != null) {
            return wd0Var;
        }
        y90.W("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.qh0
    public final String toString() {
        return getClass().getSimpleName() + '@' + ds.s(this) + "[job@" + ds.s(q()) + ']';
    }
}
