package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements g {
    public final a a;
    public final a b;
    public final int c;
    public final a d;
    public int e;
    public int f;
    public j$.util.e1 g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public a(a aVar, int i) {
        if (aVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.h = true;
        aVar.d = this;
        this.b = aVar;
        this.c = b7.h & i;
        this.f = b7.a(i, aVar.f);
        a aVar2 = aVar.a;
        this.a = aVar2;
        if (I()) {
            aVar2.i = true;
        }
        this.e = aVar.e + 1;
    }

    public final f2 A(IntFunction intFunction) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || this.b == null || !I()) {
            return y(K(0), true, intFunction);
        }
        this.e = 0;
        a aVar = this.b;
        return G(aVar, aVar.K(0), intFunction);
    }

    public abstract f2 B(a aVar, j$.util.e1 e1Var, boolean z, IntFunction intFunction);

    public final long C(j$.util.e1 e1Var) {
        if (b7.SIZED.d(this.f)) {
            return e1Var.getExactSizeIfKnown();
        }
        return -1L;
    }

    public abstract boolean D(j$.util.e1 e1Var, n5 n5Var);

    public abstract c7 E();

    public abstract x1 F(long j, IntFunction intFunction);

    public f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public j$.util.e1 H(a aVar, j$.util.e1 e1Var) {
        return G(aVar, e1Var, new j$.util.function.c(1)).spliterator();
    }

    public abstract boolean I();

    public abstract n5 J(int i, n5 n5Var);

    public final j$.util.e1 K(int i) {
        int i2;
        int i3;
        a aVar = this.a;
        j$.util.e1 e1VarH = aVar.g;
        if (e1VarH == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        if (aVar.k && aVar.i) {
            a aVar2 = aVar.d;
            int i4 = 1;
            while (aVar != this) {
                int i5 = aVar2.c;
                if (aVar2.I()) {
                    if (b7.SHORT_CIRCUIT.d(i5)) {
                        i5 &= ~b7.u;
                    }
                    e1VarH = aVar2.H(aVar, e1VarH);
                    if (e1VarH.hasCharacteristics(64)) {
                        i2 = (~b7.t) & i5;
                        i3 = b7.s;
                    } else {
                        i2 = (~b7.s) & i5;
                        i3 = b7.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                aVar2.e = i4;
                aVar2.f = b7.a(i5, aVar.f);
                a aVar3 = aVar2;
                aVar2 = aVar2.d;
                aVar = aVar3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = b7.a(i, this.f);
        }
        return e1VarH;
    }

    public final j$.util.e1 L() {
        a aVar = this.a;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        j$.util.e1 e1Var = aVar.g;
        if (e1Var == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return e1Var;
    }

    public abstract j$.util.e1 M(a aVar, Supplier supplier, boolean z);

    public final n5 N(j$.util.e1 e1Var, n5 n5Var) {
        w(e1Var, O((n5) Objects.requireNonNull(n5Var)));
        return n5Var;
    }

    public final n5 O(n5 n5Var) {
        Objects.requireNonNull(n5Var);
        for (a aVar = this; aVar.e > 0; aVar = aVar.b) {
            n5Var = aVar.J(aVar.b.f, n5Var);
        }
        return n5Var;
    }

    public final j$.util.e1 P(j$.util.e1 e1Var) {
        return this.e == 0 ? e1Var : M(this, new j$.util.p(4, e1Var), this.a.k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        a aVar = this.a;
        Runnable runnable = aVar.j;
        if (runnable != null) {
            aVar.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.g
    public final boolean isParallel() {
        return this.a.k;
    }

    @Override // j$.util.stream.g
    public final g onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.a;
        Runnable runnable2 = aVar.j;
        if (runnable2 != null) {
            runnable = new g8(runnable2, runnable);
        }
        aVar.j = runnable;
        return this;
    }

    @Override // j$.util.stream.g
    public final g parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.g
    public final g sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.g
    public j$.util.e1 spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (this != aVar) {
            return M(this, new j$.util.p(3, this), aVar.k);
        }
        j$.util.e1 e1Var = aVar.g;
        if (e1Var == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return e1Var;
    }

    public final void w(j$.util.e1 e1Var, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.SHORT_CIRCUIT.d(this.f)) {
            x(e1Var, n5Var);
            return;
        }
        n5Var.c(e1Var.getExactSizeIfKnown());
        e1Var.forEachRemaining(n5Var);
        n5Var.m();
    }

    public final boolean x(j$.util.e1 e1Var, n5 n5Var) {
        a aVar = this;
        while (aVar.e > 0) {
            aVar = aVar.b;
        }
        n5Var.c(e1Var.getExactSizeIfKnown());
        boolean zD = aVar.D(e1Var, n5Var);
        n5Var.m();
        return zD;
    }

    public final f2 y(j$.util.e1 e1Var, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return B(this, e1Var, z, intFunction);
        }
        x1 x1VarF = F(C(e1Var), intFunction);
        N(e1Var, x1VarF);
        return x1VarF.build();
    }

    public final Object z(j8 j8Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? j8Var.b(this, K(j8Var.f())) : j8Var.a(this, K(j8Var.f()));
    }

    public a(j$.util.e1 e1Var, int i, boolean z) {
        this.b = null;
        this.g = e1Var;
        this.a = this;
        int i2 = b7.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & b7.l;
        this.e = 0;
        this.k = z;
    }
}
