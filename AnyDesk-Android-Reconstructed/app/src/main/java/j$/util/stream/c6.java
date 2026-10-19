package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class c6 extends y5 {
    public q6 c;

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.q6, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.w6] */
    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new q6((int) j) : new w6();
        } else {
            i2.b("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void m() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        n5 n5Var = this.a;
        n5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (n5Var.e()) {
                    break;
                }
                n5Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                n5Var.accept(dArr[i]);
                i++;
            }
        }
        n5Var.m();
    }
}
