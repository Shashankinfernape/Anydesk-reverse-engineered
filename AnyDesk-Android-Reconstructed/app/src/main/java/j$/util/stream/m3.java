package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class m3 extends l3 implements w1 {
    @Override // j$.util.stream.n5
    public final void accept(long j) {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            i2.c("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(jArr.length)});
        } else {
            this.b = i + 1;
            jArr[i] = j;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.w1, j$.util.stream.x1
    public final d2 build() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return this;
        }
        i2.c("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(jArr.length)});
        return null;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        long[] jArr = this.a;
        if (j == jArr.length) {
            this.b = 0;
        } else {
            i2.c("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(jArr.length)});
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }

    @Override // j$.util.stream.n5
    public final void m() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return;
        }
        i2.c("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(jArr.length)});
    }

    @Override // j$.util.stream.l3
    public final String toString() {
        long[] jArr = this.a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
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
