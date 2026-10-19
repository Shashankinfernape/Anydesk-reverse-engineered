package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa extends ba {
    public final ea d;
    public final Object[] e;

    public fa(ea eaVar, Object[] objArr) {
        super(eaVar.c, objArr);
        this.d = eaVar;
        this.e = objArr;
    }

    @Override // defpackage.ba
    public final Object[] a() {
        return (Object[]) this.e.clone();
    }

    @Override // defpackage.ba
    public final String toString() {
        return String.format(this.d.c, this.e);
    }
}
