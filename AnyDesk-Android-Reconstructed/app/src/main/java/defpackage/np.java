package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class np {
    public int b;
    public boolean c;
    public final bq d;
    public final int e;
    public np f;
    public r51 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public np(bq bqVar, int i) {
        this.d = bqVar;
        this.e = i;
    }

    public final void a(np npVar, int i) {
        b(npVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(np npVar, int i, int i2, boolean z) {
        if (npVar == null) {
            j();
            return true;
        }
        if (!z && !i(npVar)) {
            return false;
        }
        this.f = npVar;
        if (npVar.a == null) {
            npVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, gg1 gg1Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y90.o(((np) it.next()).d, i, arrayList, gg1Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        np npVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (npVar = this.f) == null || npVar.d.g0 != 8) ? this.g : i;
    }

    public final np f() {
        int i = this.e;
        int iR = q51.r(i);
        bq bqVar = this.d;
        switch (iR) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return bqVar.K;
            case 2:
                return bqVar.L;
            case 3:
                return bqVar.I;
            case 4:
                return bqVar.J;
            default:
                throw new AssertionError(q51.q(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((np) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(np npVar) {
        if (npVar != null) {
            bq bqVar = npVar.d;
            int i = npVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (q51.r(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(bqVar instanceof k70)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(bqVar instanceof k70)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(q51.q(i2));
                }
            } else if (i2 != 6 || (bqVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        np npVar = this.f;
        if (npVar != null && (hashSet = npVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        r51 r51Var = this.i;
        if (r51Var == null) {
            this.i = new r51(1);
        } else {
            r51Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + q51.q(this.e);
    }
}
