package j$.util.stream;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d9 implements j$.util.e1 {
    public final j$.util.e1 a;
    public final AtomicBoolean b;
    public boolean c;
    public int d;

    public d9(j$.util.e1 e1Var) {
        this.c = true;
        this.a = e1Var;
        this.b = new AtomicBoolean();
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    public abstract j$.util.e1 b(j$.util.e1 e1Var);

    @Override // j$.util.e1
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.e1
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.e1
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.e1
    public j$.util.e1 trySplit() {
        j$.util.e1 e1VarTrySplit = this.a.trySplit();
        if (e1VarTrySplit != null) {
            return b(e1VarTrySplit);
        }
        return null;
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.v0 trySplit() {
        return (j$.util.v0) trySplit();
    }

    public d9(j$.util.e1 e1Var, d9 d9Var) {
        this.c = true;
        this.a = e1Var;
        d9Var.getClass();
        this.b = d9Var.b;
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.y0 trySplit() {
        return (j$.util.y0) trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.s0 trySplit() {
        return (j$.util.s0) trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) trySplit();
    }
}
