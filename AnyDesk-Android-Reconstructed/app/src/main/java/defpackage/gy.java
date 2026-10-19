package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy implements Runnable, Comparable, uu {
    private volatile Object _heap;
    public long c;
    public int d = -1;

    public gy(long j) {
        this.c = j;
    }

    public final y91 a() {
        Object obj = this._heap;
        if (obj instanceof y91) {
            return (y91) obj;
        }
        return null;
    }

    @Override // defpackage.uu
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                bx bxVar = th1.e;
                if (obj == bxVar) {
                    return;
                }
                hy hyVar = obj instanceof hy ? (hy) obj : null;
                if (hyVar != null) {
                    hyVar.b(this);
                }
                this._heap = bxVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.c - ((gy) obj).c;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, hy hyVar, iy iyVar) {
        synchronized (this) {
            if (this._heap == th1.e) {
                return 2;
            }
            synchronized (hyVar) {
                try {
                    gy[] gyVarArr = hyVar.a;
                    gy gyVar = gyVarArr != null ? gyVarArr[0] : null;
                    if (iy.j.get(iyVar) == 1) {
                        return 1;
                    }
                    if (gyVar == null) {
                        hyVar.c = j;
                    } else {
                        long j2 = gyVar.c;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - hyVar.c > 0) {
                            hyVar.c = j;
                        }
                    }
                    long j3 = this.c;
                    long j4 = hyVar.c;
                    if (j3 - j4 < 0) {
                        this.c = j4;
                    }
                    hyVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(hy hyVar) {
        if (this._heap != th1.e) {
            this._heap = hyVar;
        } else {
            id.q("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.c + ']';
    }
}
