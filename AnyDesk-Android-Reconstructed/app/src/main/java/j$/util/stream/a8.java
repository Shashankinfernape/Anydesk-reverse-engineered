package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a8 extends d8 implements j$.util.b1 {
    @Override // j$.util.b1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        h7 h7VarJ = null;
        while (true) {
            c8 c8VarF = f();
            if (c8VarF == c8.NO_MORE) {
                return;
            }
            c8 c8Var = c8.MAYBE_MORE;
            j$.util.e1 e1Var = this.a;
            if (c8VarF != c8Var) {
                ((j$.util.b1) e1Var).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (h7VarJ == null) {
                h7VarJ = j(i);
            } else {
                h7VarJ.b = 0;
            }
            long j = 0;
            while (((j$.util.b1) e1Var).tryAdvance(h7VarJ)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                h7VarJ.a(obj, a(j));
            }
        }
    }

    public abstract void g(Object obj);

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

    public abstract h7 j(int i);

    @Override // j$.util.b1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != c8.NO_MORE && ((j$.util.b1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
