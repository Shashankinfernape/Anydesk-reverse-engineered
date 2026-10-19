package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class v2 {
    public w2[] c;
    public int d;
    public int e;
    public w71 f;

    public final w2 c() {
        w2 w2VarD;
        w71 w71Var;
        synchronized (this) {
            try {
                w2[] w2VarArrE = this.c;
                if (w2VarArrE == null) {
                    w2VarArrE = e();
                    this.c = w2VarArrE;
                } else if (this.d >= w2VarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(w2VarArrE, w2VarArrE.length * 2);
                    this.c = (w2[]) objArrCopyOf;
                    w2VarArrE = (w2[]) objArrCopyOf;
                }
                int i = this.e;
                do {
                    w2VarD = w2VarArrE[i];
                    if (w2VarD == null) {
                        w2VarD = d();
                        w2VarArrE[i] = w2VarD;
                    }
                    i++;
                    if (i >= w2VarArrE.length) {
                        i = 0;
                    }
                } while (!w2VarD.a(this));
                this.e = i;
                this.d++;
                w71Var = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (w71Var != null) {
            w71Var.v(1);
        }
        return w2VarD;
    }

    public abstract w2 d();

    public abstract w2[] e();

    public final void f(w2 w2Var) {
        w71 w71Var;
        int i;
        rq[] rqVarArrB;
        synchronized (this) {
            try {
                int i2 = this.d - 1;
                this.d = i2;
                w71Var = this.f;
                if (i2 == 0) {
                    this.e = 0;
                }
                w2Var.getClass();
                rqVarArrB = w2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (rq rqVar : rqVarArrB) {
            if (rqVar != null) {
                rqVar.g(uc1.a);
            }
        }
        if (w71Var != null) {
            w71Var.v(-1);
        }
    }
}
