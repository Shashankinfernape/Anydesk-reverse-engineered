package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class i8 implements Consumer, j$.util.e1 {
    public int a;
    public Object b;
    public x6 c;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                x6 x6Var = new x6();
                this.c = x6Var;
                x6Var.o(this.b);
                this.a++;
            }
            this.c.o(obj);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return 17488;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return (-this.a) - 1;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.o(this.b);
            this.a = -1;
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
        if (this.a != -2) {
            return false;
        }
        consumer.o(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.e1
    public final j$.util.e1 trySplit() {
        return null;
    }
}
