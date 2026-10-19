package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ph implements bg1 {
    public Object c = uh.p;
    public xi d;
    public final /* synthetic */ sh e;

    public ph(sh shVar) {
        this.e = shVar;
    }

    @Override // defpackage.bg1
    public final void a(w01 w01Var, int i) {
        xi xiVar = this.d;
        if (xiVar != null) {
            xiVar.a(w01Var, i);
        }
    }

    public final Object b(sq sqVar) throws Throwable {
        sk skVar;
        sk skVar2;
        Object obj = this.c;
        boolean z = true;
        if (obj == uh.p || obj == uh.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sh.i;
            sh shVar = this.e;
            sk skVar3 = (sk) atomicReferenceFieldUpdater.get(shVar);
            while (!shVar.y(sh.d.get(shVar), true)) {
                long andIncrement = sh.e.getAndIncrement(shVar);
                long j = uh.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (skVar3.e != j2) {
                    sk skVarN = shVar.n(j2, skVar3);
                    if (skVarN == null) {
                        continue;
                    } else {
                        skVar = skVarN;
                    }
                } else {
                    skVar = skVar3;
                }
                Object objK = shVar.K(skVar, i, andIncrement, null);
                bx bxVar = uh.m;
                if (objK == bxVar) {
                    nh0.j("unreachable");
                    return null;
                }
                bx bxVar2 = uh.o;
                if (objK == bxVar2) {
                    if (andIncrement < shVar.u()) {
                        skVar.a();
                    }
                    skVar3 = skVar;
                } else {
                    if (objK == uh.n) {
                        xi xiVarT = ds.t(ds.u(sqVar));
                        try {
                            this.d = xiVarT;
                            Object objK2 = shVar.K(skVar, i, andIncrement, this);
                            if (objK2 == bxVar) {
                                a(skVar, i);
                            } else {
                                if (objK2 == bxVar2) {
                                    if (andIncrement < shVar.u()) {
                                        skVar.a();
                                    }
                                    sk skVar4 = (sk) sh.i.get(shVar);
                                    while (true) {
                                        if (shVar.y(sh.d.get(shVar), true)) {
                                            xi xiVar = this.d;
                                            xiVar.getClass();
                                            this.d = null;
                                            this.c = uh.l;
                                            Throwable thS = shVar.s();
                                            if (thS == null) {
                                                xiVar.g(Boolean.FALSE);
                                            } else {
                                                xiVar.g(new py0(thS));
                                            }
                                        } else {
                                            long andIncrement2 = sh.e.getAndIncrement(shVar);
                                            long j3 = uh.b;
                                            long j4 = andIncrement2 / j3;
                                            int i2 = (int) (andIncrement2 % j3);
                                            if (skVar4.e != j4) {
                                                sk skVarN2 = shVar.n(j4, skVar4);
                                                if (skVarN2 != null) {
                                                    skVar2 = skVarN2;
                                                }
                                            } else {
                                                skVar2 = skVar4;
                                            }
                                            Object objK3 = shVar.K(skVar2, i2, andIncrement2, this);
                                            sk skVar5 = skVar2;
                                            if (objK3 == uh.m) {
                                                a(skVar5, i2);
                                            } else {
                                                if (objK3 != uh.o) {
                                                    if (objK3 == uh.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    skVar5.a();
                                                    this.c = objK3;
                                                    this.d = null;
                                                    break;
                                                }
                                                if (andIncrement2 < shVar.u()) {
                                                    skVar5.a();
                                                }
                                                skVar4 = skVar5;
                                            }
                                        }
                                    }
                                } else {
                                    skVar.a();
                                    this.c = objK2;
                                    this.d = null;
                                }
                                xiVarT.D(Boolean.TRUE, null);
                            }
                            return xiVarT.s();
                        } catch (Throwable th) {
                            xiVarT.B();
                            throw th;
                        }
                    }
                    skVar.a();
                    this.c = objK;
                }
            }
            this.c = uh.l;
            Throwable thS2 = shVar.s();
            if (thS2 != null) {
                int i3 = t61.a;
                throw thS2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.c;
        bx bxVar = uh.p;
        if (obj == bxVar) {
            nh0.j("`hasNext()` has not been invoked");
            return null;
        }
        this.c = bxVar;
        if (obj != uh.l) {
            return obj;
        }
        Throwable thS = this.e.s();
        if (thS == null) {
            thS = new om("Channel was closed");
        }
        int i = t61.a;
        throw thS;
    }
}
