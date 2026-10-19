package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w7 {
    public final long a;
    public final long b;
    public j$.util.e1 c;
    public long d;
    public long e;

    public w7(j$.util.e1 e1Var, long j, long j2, long j3, long j4) {
        this.c = e1Var;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    public abstract j$.util.e1 a(j$.util.e1 e1Var, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final j$.util.e1 m16trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            j$.util.e1 e1VarTrySplit = this.c.trySplit();
            if (e1VarTrySplit == null) {
                return null;
            }
            long jEstimateSize = e1VarTrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin < j3) {
                    long j4 = this.d;
                    if (j4 < j2 || jEstimateSize > j3) {
                        this.d = jMin;
                        return a(e1VarTrySplit, j2, j3, j4, jMin);
                    }
                    this.d = jMin;
                    return e1VarTrySplit;
                }
                this.c = e1VarTrySplit;
                this.e = jMin;
            }
        }
    }

    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) m16trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.v0 m18trySplit() {
        return (j$.util.v0) m16trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.y0 m19trySplit() {
        return (j$.util.y0) m16trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.s0 m17trySplit() {
        return (j$.util.s0) m16trySplit();
    }
}
