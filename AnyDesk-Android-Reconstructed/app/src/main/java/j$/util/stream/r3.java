package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class r3 extends s3 {
    public final Object[] h;

    public r3(r3 r3Var, j$.util.e1 e1Var, long j, long j2) {
        super(r3Var, e1Var, j, j2, r3Var.h.length);
        this.h = r3Var.h;
    }

    @Override // j$.util.stream.s3
    public final s3 a(j$.util.e1 e1Var, long j, long j2) {
        return new r3(this, e1Var, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public r3(j$.util.e1 e1Var, a aVar, Object[] objArr) {
        super(e1Var, aVar, objArr.length);
        this.h = objArr;
    }
}
