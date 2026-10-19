package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends t2 implements u1 {
    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            i2.c("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(dArr.length)});
        } else {
            this.b = i + 1;
            dArr[i] = d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.u1, j$.util.stream.x1
    public final z1 build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        i2.c("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(dArr.length)});
        return null;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        double[] dArr = this.a;
        if (j == dArr.length) {
            this.b = 0;
        } else {
            i2.c("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(dArr.length)});
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final void m() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return;
        }
        i2.c("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(dArr.length)});
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        w3.d(this, d);
    }

    @Override // j$.util.stream.t2
    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.x1
    public final /* bridge */ /* synthetic */ f2 build() {
        build();
        return this;
    }
}
