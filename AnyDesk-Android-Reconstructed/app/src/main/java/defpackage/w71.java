package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w71 extends v41 implements c71 {
    @Override // defpackage.c71
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.j;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.k + ((long) ((int) ((n() + ((long) this.m)) - this.k)))) - 1))]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.j;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.k + ((long) ((int) ((n() + ((long) this.m)) - this.k)))) - 1))]).intValue() + i));
        }
    }
}
