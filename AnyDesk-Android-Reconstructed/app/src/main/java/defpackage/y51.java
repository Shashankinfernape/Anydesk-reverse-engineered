package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y51 extends t90 {
    public int c;
    public final /* synthetic */ x51 d;

    public y51(x51 x51Var) {
        this.d = x51Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.d.f();
    }

    @Override // defpackage.t90
    public final int nextInt() {
        int i = this.c;
        this.c = i + 1;
        return this.d.d(i);
    }
}
