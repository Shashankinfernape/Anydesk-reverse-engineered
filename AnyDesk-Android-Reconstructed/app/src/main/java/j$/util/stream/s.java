package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, int i, int i2) {
        super(aVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new r(this, n5Var, 0);
            case 1:
                return n5Var;
            case 2:
                return new r(this, n5Var, 3);
            case 3:
                return new w0(1, n5Var);
            case 4:
                return new w0(this, n5Var, 3);
            case 5:
                return new d1(n5Var);
            default:
                return new d1(this, n5Var, 3);
        }
    }
}
