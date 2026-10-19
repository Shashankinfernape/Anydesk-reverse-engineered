package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o6 implements j$.util.e1 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object[] e;
    public final /* synthetic */ x6 f;

    public o6(x6 x6Var, int i, int i2, int i3, int i4) {
        this.f = x6Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr = x6Var.f;
        this.e = objArr == null ? x6Var.e : objArr[i];
    }

    @Override // j$.util.e1
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        x6 x6Var;
        Objects.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                x6Var = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = x6Var.f[i];
                while (i4 < objArr.length) {
                    consumer.o(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.a == i3 ? this.e : x6Var.f[i3];
            while (i4 < i2) {
                consumer.o(objArr2[i4]);
                i4++;
            }
            this.a = i3;
            this.c = i2;
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
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.o(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.e1
    public final j$.util.e1 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            x6 x6Var = this.f;
            o6 o6Var = new o6(x6Var, i, i3, i4, x6Var.f[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = x6Var.f[i2];
            return o6Var;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        j$.util.j1 j1VarA = DesugarArrays.a(this.e, i5, i5 + i6);
        this.c += i6;
        return j1VarA;
    }
}
