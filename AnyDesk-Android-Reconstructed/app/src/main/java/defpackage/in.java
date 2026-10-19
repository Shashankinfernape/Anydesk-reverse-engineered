package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class in implements br, Serializable {
    public final br c;
    public final zq d;

    public in(br brVar, zq zqVar) {
        brVar.getClass();
        zqVar.getClass();
        this.c = brVar;
        this.d = zqVar;
    }

    public final boolean equals(Object obj) {
        boolean zE;
        if (this == obj) {
            return true;
        }
        if (obj instanceof in) {
            in inVar = (in) obj;
            int i = 2;
            in inVar2 = inVar;
            int i2 = 2;
            while (true) {
                br brVar = inVar2.c;
                inVar2 = brVar instanceof in ? (in) brVar : null;
                if (inVar2 == null) {
                    break;
                }
                i2++;
            }
            in inVar3 = this;
            while (true) {
                br brVar2 = inVar3.c;
                inVar3 = brVar2 instanceof in ? (in) brVar2 : null;
                if (inVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                in inVar4 = this;
                while (true) {
                    zq zqVar = inVar4.d;
                    if (!y90.e(inVar.l(zqVar.getKey()), zqVar)) {
                        zE = false;
                        break;
                    }
                    br brVar3 = inVar4.c;
                    if (!(brVar3 instanceof in)) {
                        brVar3.getClass();
                        zq zqVar2 = (zq) brVar3;
                        zE = y90.e(inVar.l(zqVar2.getKey()), zqVar2);
                        break;
                    }
                    inVar4 = (in) brVar3;
                }
                if (zE) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.br
    public final Object h(Object obj, d60 d60Var) {
        return d60Var.f(this.c.h(obj, d60Var), this.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    @Override // defpackage.br
    public final br j(br brVar) {
        brVar.getClass();
        return brVar == kx.c ? this : (br) brVar.h(this, new hn(1));
    }

    @Override // defpackage.br
    public final zq l(ar arVar) {
        arVar.getClass();
        in inVar = this;
        while (true) {
            zq zqVarL = inVar.d.l(arVar);
            if (zqVarL != null) {
                return zqVarL;
            }
            br brVar = inVar.c;
            if (!(brVar instanceof in)) {
                return brVar.l(arVar);
            }
            inVar = (in) brVar;
        }
    }

    @Override // defpackage.br
    public final br q(ar arVar) {
        arVar.getClass();
        zq zqVar = this.d;
        zq zqVarL = zqVar.l(arVar);
        br brVar = this.c;
        if (zqVarL != null) {
            return brVar;
        }
        br brVarQ = brVar.q(arVar);
        if (brVarQ == brVar) {
            return this;
        }
        return brVarQ == kx.c ? zqVar : new in(brVarQ, zqVar);
    }

    public final String toString() {
        return "[" + ((String) h("", new hn(0))) + ']';
    }
}
