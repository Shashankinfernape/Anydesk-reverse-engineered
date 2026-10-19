package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class t5 extends h1 {
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(j1 j1Var, int i, long j, long j2) {
        super(j1Var, i);
        this.l = j;
        this.m = j2;
    }

    @Override // j$.util.stream.a
    public final f2 G(a aVar, j$.util.e1 e1Var, IntFunction intFunction) {
        long jMin;
        long j;
        long jC = aVar.C(e1Var);
        if (jC > 0 && e1Var.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return w3.E(aVar, w3.y(aVar2.E(), e1Var, this.l, this.m), true);
        }
        if (b7.ORDERED.d(aVar.f)) {
            return (f2) new x5(this, aVar, e1Var, intFunction, this.l, this.m).invoke();
        }
        j$.util.y0 y0Var = (j$.util.y0) aVar.P(e1Var);
        long j2 = this.l;
        long j3 = this.m;
        if (j2 <= jC) {
            long j4 = jC - j2;
            jMin = j3 >= 0 ? Math.min(j3, j4) : j4;
            j = 0;
        } else {
            jMin = j3;
            j = j2;
        }
        return w3.E(this, new z7(y0Var, j, jMin), true);
    }

    @Override // j$.util.stream.a
    public final j$.util.e1 H(a aVar, j$.util.e1 e1Var) {
        long jC = aVar.C(e1Var);
        if (jC > 0 && e1Var.hasCharacteristics(16384)) {
            j$.util.y0 y0Var = (j$.util.y0) aVar.P(e1Var);
            long j = this.l;
            return new t7(y0Var, j, w3.A(j, this.m));
        }
        if (b7.ORDERED.d(aVar.f)) {
            return ((f2) new x5(this, aVar, e1Var, new g2(10), this.l, this.m).invoke()).spliterator();
        }
        j$.util.y0 y0Var2 = (j$.util.y0) aVar.P(e1Var);
        long j2 = this.l;
        long j3 = this.m;
        if (j2 <= jC) {
            long jMin = jC - j2;
            if (j3 >= 0) {
                jMin = Math.min(j3, jMin);
            }
            j3 = jMin;
            j2 = 0;
        }
        return new z7(y0Var2, j2, j3);
    }

    @Override // j$.util.stream.a
    public final n5 J(int i, n5 n5Var) {
        return new s5(this, n5Var);
    }
}
