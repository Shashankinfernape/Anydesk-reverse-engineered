package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public aa(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = new HashMap();
                this.b = 0L;
                a();
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public synchronized void a() {
        ((HashMap) this.c).clear();
        this.b = 0L;
    }

    public void b(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            aaVar.b(i - 64);
        }
    }

    public int c(int i) {
        aa aaVar = (aa) this.c;
        if (aaVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + aaVar.c(i - 64);
    }

    public void d() {
        if (((aa) this.c) == null) {
            this.c = new aa(1);
        }
    }

    public boolean e(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        d();
        return ((aa) this.c).e(i - 64);
    }

    public synchronized long f(String str) {
        if (((HashMap) this.c).containsKey(str)) {
            Long l = (Long) ((HashMap) this.c).get(str);
            return l == null ? -1L : l.longValue();
        }
        if (this.b == Long.MAX_VALUE) {
            a();
        }
        ((HashMap) this.c).put(str, Long.valueOf(this.b));
        long j = this.b;
        this.b = 1 + j;
        return j;
    }

    public void g(int i, boolean z) {
        if (i >= 64) {
            d();
            ((aa) this.c).g(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            j(i);
        } else {
            b(i);
        }
        if (z2 || ((aa) this.c) != null) {
            d();
            ((aa) this.c).g(0, z2);
        }
    }

    public boolean h(int i) {
        if (i >= 64) {
            d();
            return ((aa) this.c).h(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            if (aaVar.e(0)) {
                j(63);
            }
            ((aa) this.c).h(0);
        }
        return z;
    }

    public void i() {
        this.b = 0L;
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            aaVar.i();
        }
    }

    public void j(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            d();
            ((aa) this.c).j(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (((aa) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((aa) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public aa(long j, bs bsVar) {
        this.a = 0;
        this.b = j;
        this.c = bsVar;
    }
}
