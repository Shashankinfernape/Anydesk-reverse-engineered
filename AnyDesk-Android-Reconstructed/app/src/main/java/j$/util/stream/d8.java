package j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d8 {
    public final j$.util.e1 a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public d8(j$.util.e1 e1Var, long j, long j2) {
        this.a = e1Var;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long jMin;
        do {
            j2 = this.e.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.e.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public abstract j$.util.e1 b(j$.util.e1 e1Var);

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final c8 f() {
        if (this.e.get() > 0) {
            return c8.MAYBE_MORE;
        }
        return this.b ? c8.UNLIMITED : c8.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final j$.util.e1 m12trySplit() {
        j$.util.e1 e1VarTrySplit;
        if (this.e.get() == 0 || (e1VarTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(e1VarTrySplit);
    }

    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) m12trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.v0 m14trySplit() {
        return (j$.util.v0) m12trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.y0 m15trySplit() {
        return (j$.util.y0) m12trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.s0 m13trySplit() {
        return (j$.util.s0) m12trySplit();
    }

    public d8(j$.util.e1 e1Var, d8 d8Var) {
        this.a = e1Var;
        this.b = d8Var.b;
        this.e = d8Var.e;
        this.d = d8Var.d;
        this.c = d8Var.c;
    }
}
