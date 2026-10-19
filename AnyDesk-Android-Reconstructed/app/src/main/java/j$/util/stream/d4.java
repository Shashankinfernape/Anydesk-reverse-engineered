package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class d4 extends w3 {
    public final /* synthetic */ int h;

    public /* synthetic */ d4(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.w3, j$.util.stream.j8
    public final Object a(a aVar, j$.util.e1 e1Var) {
        switch (this.h) {
            case 0:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.a(aVar, e1Var);
            case 1:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.a(aVar, e1Var);
            case 2:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.a(aVar, e1Var);
            default:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.a(aVar, e1Var);
        }
    }

    @Override // j$.util.stream.w3
    public final r4 a0() {
        switch (this.h) {
            case 0:
                return new v4();
            case 1:
                return new t4();
            case 2:
                return new w4();
            default:
                return new u4();
        }
    }

    @Override // j$.util.stream.w3, j$.util.stream.j8
    public final Object b(a aVar, j$.util.e1 e1Var) {
        switch (this.h) {
            case 0:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.b(aVar, e1Var);
            case 1:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.b(aVar, e1Var);
            case 2:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.b(aVar, e1Var);
            default:
                return b7.SIZED.d(aVar.f) ? Long.valueOf(e1Var.getExactSizeIfKnown()) : (Long) super.b(aVar, e1Var);
        }
    }

    @Override // j$.util.stream.w3, j$.util.stream.j8
    public final int f() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return b7.r;
    }
}
