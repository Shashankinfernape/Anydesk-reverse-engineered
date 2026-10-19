package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class o3 extends s3 implements k5 {
    public final double[] h;

    public o3(o3 o3Var, j$.util.e1 e1Var, long j, long j2) {
        super(o3Var, e1Var, j, j2, o3Var.h.length);
        this.h = o3Var.h;
    }

    @Override // j$.util.stream.s3
    public final s3 a(j$.util.e1 e1Var, long j, long j2) {
        return new o3(this, e1Var, j, j2);
    }

    @Override // j$.util.stream.s3, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Double d) {
        w3.d(this, d);
    }

    public o3(j$.util.e1 e1Var, a aVar, double[] dArr) {
        super(e1Var, aVar, dArr.length);
        this.h = dArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }
}
