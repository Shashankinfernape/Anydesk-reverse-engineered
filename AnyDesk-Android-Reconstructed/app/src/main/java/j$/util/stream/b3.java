package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b3 extends k2 implements x1 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            i2.c("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)});
        } else {
            this.b = i + 1;
            objArr[i] = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.x1
    public final f2 build() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        i2.c("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
        return null;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        Object[] objArr = this.a;
        if (j == objArr.length) {
            this.b = 0;
        } else {
            i2.c("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final void m() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return;
        }
        i2.c("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
    }

    @Override // j$.util.stream.k2
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }
}
