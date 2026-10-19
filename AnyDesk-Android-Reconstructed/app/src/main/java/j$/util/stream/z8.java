package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class z8 extends d9 implements DoubleConsumer, j$.util.s0 {
    public double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(j$.util.e1 e1Var, int i) {
        super(e1Var);
        this.f = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.d9
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        switch (this.f) {
            case 0:
                return new z8((j$.util.s0) e1Var, this, 0);
            default:
                return new z8((j$.util.s0) e1Var, this, 1);
        }
    }

    @Override // j$.util.b1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.s0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        int i = this.f;
        j$.util.e1 e1Var = this.a;
        DoublePredicate doublePredicate = null;
        switch (i) {
            case 0:
                if (!this.c) {
                    return ((j$.util.s0) e1Var).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.s0) e1Var).tryAdvance((DoubleConsumer) this);
                if (zTryAdvance && a()) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                doubleConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.s0) e1Var).tryAdvance((DoubleConsumer) this)) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public j$.util.s0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.s0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(j$.util.e1 e1Var, d9 d9Var, int i) {
        super(e1Var, d9Var);
        this.f = i;
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.e1 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.i(this, consumer);
    }

    @Override // j$.util.b1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
