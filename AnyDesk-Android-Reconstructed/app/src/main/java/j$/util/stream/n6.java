package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n6 extends b6 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            i2.b("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void m() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        n5 n5Var = this.a;
        n5Var.c(j);
        if (this.c) {
            while (i < this.e && !n5Var.e()) {
                n5Var.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                n5Var.accept(this.d[i]);
                i++;
            }
        }
        n5Var.m();
        this.d = null;
    }
}
