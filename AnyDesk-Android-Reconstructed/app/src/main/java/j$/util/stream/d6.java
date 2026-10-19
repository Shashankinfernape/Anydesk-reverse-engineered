package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class d6 extends z5 {
    public s6 c;

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        this.c.accept(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.s6, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.w6] */
    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new s6((int) j) : new w6();
        } else {
            i2.b("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void m() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        n5 n5Var = this.a;
        n5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (n5Var.e()) {
                    break;
                }
                n5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                n5Var.accept(iArr[i]);
                i++;
            }
        }
        n5Var.m();
    }
}
