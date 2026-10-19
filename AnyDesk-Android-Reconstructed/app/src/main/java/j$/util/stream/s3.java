package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s3 extends CountedCompleter implements n5 {
    public final j$.util.e1 a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public s3(s3 s3Var, j$.util.e1 e1Var, long j, long j2, int i) {
        super(s3Var);
        this.a = e1Var;
        this.b = s3Var.b;
        this.c = s3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract s3 a(j$.util.e1 e1Var, long j, long j2);

    public /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.e1 e1VarTrySplit;
        j$.util.e1 e1Var = this.a;
        s3 s3VarA = this;
        while (e1Var.estimateSize() > s3VarA.c && (e1VarTrySplit = e1Var.trySplit()) != null) {
            s3VarA.setPendingCount(1);
            long jEstimateSize = e1VarTrySplit.estimateSize();
            s3 s3Var = s3VarA;
            s3Var.a(e1VarTrySplit, s3VarA.d, jEstimateSize).fork();
            s3VarA = s3Var.a(e1Var, s3Var.d + jEstimateSize, s3Var.e - jEstimateSize);
        }
        s3 s3Var2 = s3VarA;
        s3Var2.b.N(e1Var, s3Var2);
        s3Var2.propagateCompletion();
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public s3(j$.util.e1 e1Var, a aVar, int i) {
        this.a = e1Var;
        this.b = aVar;
        this.c = d.e(e1Var.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void m() {
    }
}
