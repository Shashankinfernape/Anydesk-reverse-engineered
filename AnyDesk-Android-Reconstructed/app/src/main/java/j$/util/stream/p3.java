package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class p3 extends s3 implements l5 {
    public final int[] h;

    public p3(p3 p3Var, j$.util.e1 e1Var, long j, long j2) {
        super(p3Var, e1Var, j, j2, p3Var.h.length);
        this.h = p3Var.h;
    }

    @Override // j$.util.stream.s3
    public final s3 a(j$.util.e1 e1Var, long j, long j2) {
        return new p3(this, e1Var, j, j2);
    }

    @Override // j$.util.stream.s3, j$.util.stream.n5
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void d(Integer num) {
        w3.g(this, num);
    }

    public p3(j$.util.e1 e1Var, a aVar, int[] iArr) {
        super(e1Var, aVar, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }
}
