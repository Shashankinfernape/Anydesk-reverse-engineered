package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements e1 {
    public final Object[] a;
    public int b;
    public final int c;
    public final int d;

    public j1(Object[] objArr, int i, int i2, int i3) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return c.e(this, i);
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        consumer.accept(this.a[i]);
        return true;
    }

    @Override // j$.util.e1
    public final e1 trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new j1(this.a, i, i2, this.d);
    }
}
