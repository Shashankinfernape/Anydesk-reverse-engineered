package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 extends d9 implements IntConsumer, j$.util.v0 {
    public final IntPredicate e;
    public int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(j$.util.v0 v0Var, a9 a9Var, int i) {
        super(v0Var, a9Var);
        this.g = i;
        this.e = a9Var.e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.d9
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        switch (this.g) {
            case 0:
                return new a9((j$.util.v0) e1Var, this, 0);
            default:
                return new a9((j$.util.v0) e1Var, this, 1);
        }
    }

    @Override // j$.util.b1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.b1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean zTest;
        int i = this.g;
        IntPredicate intPredicate = this.e;
        j$.util.e1 e1Var = this.a;
        boolean z = false;
        switch (i) {
            case 0:
                if (!this.c) {
                    return ((j$.util.v0) e1Var).tryAdvance(intConsumer);
                }
                this.c = false;
                while (true) {
                    zTryAdvance = ((j$.util.v0) e1Var).tryAdvance((IntConsumer) this);
                    if (zTryAdvance && a() && intPredicate.test(this.f)) {
                        z = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z) {
                    this.b.set(true);
                }
                intConsumer.accept(this.f);
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.v0) e1Var).tryAdvance((IntConsumer) this)) {
                    zTest = intPredicate.test(this.f);
                    if (zTest) {
                        intConsumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public j$.util.v0 trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.v0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(j$.util.v0 v0Var, IntPredicate intPredicate, int i) {
        super(v0Var);
        this.g = i;
        this.e = intPredicate;
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.e1 trySplit() {
        switch (this.g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        switch (this.g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.j(this, consumer);
    }
}
