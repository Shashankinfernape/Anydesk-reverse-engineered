package j$.util.concurrent;

import j$.util.e1;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends p implements e1 {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i, int i2, int i3, long j, int i4) {
        super(lVarArr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // j$.util.e1
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.e1
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA != null) {
                        consumer.accept(lVarA.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 != null) {
                        consumer.accept(lVarA2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.e1
    public final Comparator getComparator() {
        switch (this.i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.e1
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
        }
        return j$.util.c.d(this);
    }

    @Override // j$.util.e1
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
        }
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA == null) {
                    return false;
                }
                consumer.accept(lVarA.b);
                return true;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 == null) {
                    return false;
                }
                consumer.accept(lVarA2.c);
                return true;
        }
    }

    @Override // j$.util.e1
    public final e1 trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                l[] lVarArr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new j(lVarArr, this.h, i3, i2, j, 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                l[] lVarArr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new j(lVarArr2, this.h, i6, i5, j2, 1);
        }
    }
}
