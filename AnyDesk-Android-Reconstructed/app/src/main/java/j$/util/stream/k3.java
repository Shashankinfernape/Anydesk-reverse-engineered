package j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k3 implements j$.util.e1 {
    public f2 a;
    public int b;
    public j$.util.e1 c;
    public j$.util.e1 d;
    public Deque e;

    public k3(f2 f2Var) {
        this.a = f2Var;
    }

    public static f2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            f2 f2Var = (f2) arrayDeque.pollFirst();
            if (f2Var == null) {
                return null;
            }
            if (f2Var.p() != 0) {
                for (int iP = f2Var.p() - 1; iP >= 0; iP--) {
                    arrayDeque.addFirst(f2Var.a(iP));
                }
            } else if (f2Var.count() > 0) {
                return f2Var;
            }
        }
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iP = this.a.p();
        while (true) {
            iP--;
            if (iP < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iP));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        j$.util.e1 e1Var = this.c;
        if (e1Var != null) {
            this.d = e1Var;
            return true;
        }
        Deque dequeB = b();
        this.e = dequeB;
        f2 f2VarA = a(dequeB);
        if (f2VarA != null) {
            this.d = f2VarA.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        j$.util.e1 e1Var = this.c;
        if (e1Var != null) {
            return e1Var.estimateSize();
        }
        for (int i = this.b; i < this.a.p(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.e1
    public final j$.util.e1 trySplit() {
        f2 f2Var = this.a;
        if (f2Var == null || this.d != null) {
            return null;
        }
        j$.util.e1 e1Var = this.c;
        if (e1Var != null) {
            return e1Var.trySplit();
        }
        int i = this.b;
        int iP = f2Var.p() - 1;
        f2 f2Var2 = this.a;
        int i2 = this.b;
        if (i < iP) {
            this.b = i2 + 1;
            return f2Var2.a(i2).spliterator();
        }
        f2 f2VarA = f2Var2.a(i2);
        this.a = f2VarA;
        int iP2 = f2VarA.p();
        f2 f2Var3 = this.a;
        if (iP2 != 0) {
            this.b = 1;
            return f2Var3.a(0).spliterator();
        }
        j$.util.e1 e1VarSpliterator = f2Var3.spliterator();
        this.c = e1VarSpliterator;
        return e1VarSpliterator.trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.v0 trySplit() {
        return (j$.util.v0) trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.y0 trySplit() {
        return (j$.util.y0) trySplit();
    }

    @Override // j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.s0 trySplit() {
        return (j$.util.s0) trySplit();
    }
}
