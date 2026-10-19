package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends c3 implements v1 {
    @Override // j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            i2.c("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)});
        } else {
            this.b = i2 + 1;
            iArr[i2] = i;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.v1, j$.util.stream.x1
    public final b2 build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        i2.c("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
        return null;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        int[] iArr = this.a;
        if (j == iArr.length) {
            this.b = 0;
        } else {
            i2.c("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(iArr.length)});
        }
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final void m() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return;
        }
        i2.c("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(iArr.length)});
    }

    @Override // j$.util.stream.c3
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.x1
    public final /* bridge */ /* synthetic */ f2 build() {
        build();
        return this;
    }
}
