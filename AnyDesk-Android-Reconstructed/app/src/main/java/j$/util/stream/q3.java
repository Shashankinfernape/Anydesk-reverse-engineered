package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class q3 extends s3 implements m5 {
    public final long[] h;

    public q3(q3 q3Var, j$.util.e1 e1Var, long j, long j2) {
        super(q3Var, e1Var, j, j2, q3Var.h.length);
        this.h = q3Var.h;
    }

    @Override // j$.util.stream.s3
    public final s3 a(j$.util.e1 e1Var, long j, long j2) {
        return new q3(this, e1Var, j, j2);
    }

    @Override // j$.util.stream.s3, j$.util.stream.n5
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }

    public q3(j$.util.e1 e1Var, a aVar, long[] jArr) {
        super(e1Var, aVar, jArr.length);
        this.h = jArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }
}
