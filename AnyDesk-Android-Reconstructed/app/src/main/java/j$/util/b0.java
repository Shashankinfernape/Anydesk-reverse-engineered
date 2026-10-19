package j$.util;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final b0 c = new b0();
    public final boolean a;
    public final long b;

    public b0() {
        this.a = false;
        this.b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z = b0Var.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == b0Var.b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public b0(long j) {
        this.a = true;
        this.b = j;
    }
}
