package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rd0 extends wd0 {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(pd0 pd0Var) {
        super(true);
        boolean z = true;
        M(pd0Var);
        ml mlVarI = I();
        nl nlVar = mlVarI instanceof nl ? (nl) mlVarI : null;
        if (nlVar == null) {
            z = false;
            break;
        }
        wd0 wd0VarQ = nlVar.q();
        while (!wd0VarQ.F()) {
            ml mlVarI2 = wd0VarQ.I();
            nl nlVar2 = mlVarI2 instanceof nl ? (nl) mlVarI2 : null;
            if (nlVar2 == null) {
                z = false;
                break;
            }
            wd0VarQ = nlVar2.q();
        }
        this.g = z;
    }

    @Override // defpackage.wd0
    public final boolean F() {
        return this.g;
    }

    @Override // defpackage.wd0
    public final boolean G() {
        return true;
    }
}
