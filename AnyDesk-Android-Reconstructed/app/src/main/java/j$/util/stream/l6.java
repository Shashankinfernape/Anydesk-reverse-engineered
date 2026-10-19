package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends z5 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = new int[(int) j];
        } else {
            i2.b("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void m() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        n5 n5Var = this.a;
        n5Var.c(j);
        if (this.b) {
            while (i < this.d && !n5Var.e()) {
                n5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                n5Var.accept(this.c[i]);
                i++;
            }
        }
        n5Var.m();
        this.c = null;
    }
}
