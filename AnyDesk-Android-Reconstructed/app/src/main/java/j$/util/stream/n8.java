package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class n8 extends j5 implements w8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ m8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(m8 m8Var, n5 n5Var, boolean z) {
        super(n5Var);
        this.e = m8Var;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.m.test(obj);
            this.c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.d;
        if (z2 && !z) {
            this.b++;
        }
        if (z2 || z) {
            this.a.accept(obj);
        }
    }

    @Override // j$.util.stream.w8
    public final long h() {
        return this.b;
    }
}
