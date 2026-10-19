package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg1 implements ht {
    public int a;
    public bq b;
    public kz0 c;
    public int d;
    public final mu e = new mu(this);
    public int f = 0;
    public boolean g = false;
    public final kt h = new kt(this);
    public final kt i = new kt(this);
    public int j = 1;

    public hg1(bq bqVar) {
        this.b = bqVar;
    }

    public static void b(kt ktVar, kt ktVar2, int i) {
        ktVar.l.add(ktVar2);
        ktVar.f = i;
        ktVar2.k.add(ktVar);
    }

    public static kt h(np npVar) {
        np npVar2 = npVar.f;
        if (npVar2 == null) {
            return null;
        }
        bq bqVar = npVar2.d;
        int iR = q51.r(npVar2.e);
        if (iR == 1) {
            return bqVar.d.h;
        }
        if (iR == 2) {
            return bqVar.e.h;
        }
        if (iR == 3) {
            return bqVar.d.i;
        }
        if (iR == 4) {
            return bqVar.e.i;
        }
        if (iR != 5) {
            return null;
        }
        return bqVar.e.k;
    }

    public static kt i(np npVar, int i) {
        np npVar2 = npVar.f;
        if (npVar2 == null) {
            return null;
        }
        bq bqVar = npVar2.d;
        hg1 hg1Var = i == 0 ? bqVar.d : bqVar.e;
        int iR = q51.r(npVar2.e);
        if (iR == 1 || iR == 2) {
            return hg1Var.h;
        }
        if (iR == 3 || iR == 4) {
            return hg1Var.i;
        }
        return null;
    }

    public final void c(kt ktVar, kt ktVar2, int i, mu muVar) {
        ktVar.l.add(ktVar2);
        ktVar.l.add(this.e);
        ktVar.h = i;
        ktVar.i = muVar;
        ktVar2.k.add(ktVar);
        muVar.k.add(ktVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        bq bqVar = this.b;
        if (i2 == 0) {
            int i3 = bqVar.v;
            int iMax = Math.max(bqVar.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = bqVar.y;
            int iMax2 = Math.max(bqVar.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        mu muVar = this.e;
        if (muVar.j) {
            return muVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(np npVar, np npVar2, int i) {
        mu muVar;
        float f;
        int i2;
        int i3;
        kt ktVarH = h(npVar);
        kt ktVarH2 = h(npVar2);
        if (ktVarH.j && ktVarH2.j) {
            int iE = npVar.e() + ktVarH.g;
            int iE2 = ktVarH2.g - npVar2.e();
            int i4 = iE2 - iE;
            mu muVar2 = this.e;
            if (!muVar2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    muVar2.d(g(i4, i));
                } else if (i5 == 1) {
                    muVar2.d(Math.min(g(muVar2.m, i), i4));
                } else if (i5 == 2) {
                    bq bqVar = this.b;
                    bq bqVar2 = bqVar.T;
                    if (bqVar2 != null) {
                        mu muVar3 = (i == 0 ? bqVar2.d : bqVar2.e).e;
                        if (muVar3.j) {
                            muVar2.d(g((int) ((muVar3.g * (i == 0 ? bqVar.w : bqVar.z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    bq bqVar3 = this.b;
                    hg1 hg1Var = bqVar3.d;
                    if (hg1Var.d == 3 && hg1Var.a == 3) {
                        zd1 zd1Var = bqVar3.e;
                        if (zd1Var.d != 3 || zd1Var.a != 3) {
                            if (i == 0) {
                                hg1Var = bqVar3.e;
                            }
                            muVar = hg1Var.e;
                            if (muVar.j) {
                                f = bqVar3.W;
                                i2 = muVar.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                muVar2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            hg1Var = bqVar3.e;
                        }
                        muVar = hg1Var.e;
                        if (muVar.j) {
                            f = bqVar3.W;
                            i2 = muVar.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            muVar2.d(i3);
                        }
                    }
                }
            }
            if (muVar2.j) {
                int i6 = muVar2.g;
                kt ktVar = this.i;
                kt ktVar2 = this.h;
                if (i6 == i4) {
                    ktVar2.d(iE);
                    ktVar.d(iE2);
                    return;
                }
                bq bqVar4 = this.b;
                float f2 = i == 0 ? bqVar4.d0 : bqVar4.e0;
                if (ktVarH == ktVarH2) {
                    iE = ktVarH.g;
                    iE2 = ktVarH2.g;
                    f2 = 0.5f;
                }
                ktVar2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                ktVar.d(ktVar2.g + muVar2.g);
            }
        }
    }
}
