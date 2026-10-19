package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b8 extends d8 implements j$.util.e1, Consumer {
    public Object f;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d8
    public final j$.util.e1 b(j$.util.e1 e1Var) {
        return new b8(e1Var, this);
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        i7 i7Var = null;
        while (true) {
            c8 c8VarF = f();
            if (c8VarF == c8.NO_MORE) {
                return;
            }
            c8 c8Var = c8.MAYBE_MORE;
            j$.util.e1 e1Var = this.a;
            if (c8VarF != c8Var) {
                e1Var.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (i7Var == null) {
                i7Var = new i7(i);
            } else {
                i7Var.a = 0;
            }
            long j = 0;
            while (e1Var.tryAdvance(i7Var)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i2 = 0; i2 < jA; i2++) {
                consumer.o(i7Var.b[i2]);
            }
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != c8.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.o(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
