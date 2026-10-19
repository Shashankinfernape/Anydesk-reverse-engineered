package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b9 extends d9 implements LongConsumer, j$.util.y0 {
    public long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(j$.util.e1 e1Var, int i) {
        super(e1Var);
        this.f = i;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.d9
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        switch (this.f) {
            case 0:
                return new b9((j$.util.y0) e1Var, this, 0);
            default:
                return new b9((j$.util.y0) e1Var, this, 1);
        }
    }

    @Override // j$.util.b1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.y0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f;
        j$.util.e1 e1Var = this.a;
        LongPredicate longPredicate = null;
        switch (i) {
            case 0:
                if (!this.c) {
                    return ((j$.util.y0) e1Var).tryAdvance(longConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.y0) e1Var).tryAdvance((LongConsumer) this);
                if (zTryAdvance && a()) {
                    longPredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                longConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.y0) e1Var).tryAdvance((LongConsumer) this)) {
                    longPredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public j$.util.y0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.y0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(j$.util.e1 e1Var, d9 d9Var, int i) {
        super(e1Var, d9Var);
        this.f = i;
    }

    @Override // j$.util.stream.d9, j$.util.e1
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
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
        return j$.util.c.k(this, consumer);
    }

    @Override // j$.util.b1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
