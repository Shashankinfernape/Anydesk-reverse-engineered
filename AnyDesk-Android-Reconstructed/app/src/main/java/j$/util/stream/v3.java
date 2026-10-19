package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public class v3 extends CountedCompleter {
    public final f2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, f2 f2Var, int i) {
        this(v3Var, f2Var, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) v3Var.d;
    }

    public final v3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new v3(this, ((e2) this.a).a(i), i2);
            default:
                return new v3(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        v3 v3VarA = this;
        while (v3VarA.a.p() != 0) {
            v3VarA.setPendingCount(v3VarA.a.p() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iP = v3VarA.a.p() - 1;
                i = v3VarA.b;
                if (i2 < iP) {
                    v3 v3VarA2 = v3VarA.a(i2, i + iCount);
                    iCount = (int) (v3VarA2.a.count() + ((long) iCount));
                    v3VarA2.fork();
                    i2++;
                }
            }
            v3VarA = v3VarA.a(i2, i + iCount);
        }
        switch (v3VarA.c) {
            case 0:
                ((e2) v3VarA.a).f(v3VarA.b, v3VarA.d);
                break;
            default:
                v3VarA.a.k((Object[]) v3VarA.d, v3VarA.b);
                break;
        }
        v3VarA.propagateCompletion();
    }

    public v3(v3 v3Var, f2 f2Var, int i, byte b) {
        super(v3Var);
        this.a = f2Var;
        this.b = i;
    }

    public v3(f2 f2Var, Object obj, int i) {
        this.c = i;
        this.a = f2Var;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, e2 e2Var, int i) {
        this(v3Var, e2Var, i, (byte) 0);
        this.c = 0;
        this.d = v3Var.d;
    }
}
