package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i90 implements ze1 {
    public final xe1[] a;

    public i90(xe1... xe1VarArr) {
        this.a = xe1VarArr;
    }

    @Override // defpackage.ze1
    public final ve1 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // defpackage.ze1
    public final ve1 b(Class cls, um0 um0Var) {
        xe1 xe1Var;
        fm fmVarA = nx0.a(cls);
        xe1[] xe1VarArr = this.a;
        xe1[] xe1VarArr2 = (xe1[]) Arrays.copyOf(xe1VarArr, xe1VarArr.length);
        int length = xe1VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                xe1Var = null;
                break;
            }
            xe1Var = xe1VarArr2[i];
            if (xe1Var.a.equals(fmVarA)) {
                break;
            }
            i++;
        }
        ve1 ve1Var = xe1Var != null ? (ve1) xe1Var.b.h(um0Var) : null;
        if (ve1Var != null) {
            return ve1Var;
        }
        nh0.i(y90.u(fmVarA), "No initializer set for given class ");
        return null;
    }

    @Override // defpackage.ze1
    public final ve1 c(fm fmVar, um0 um0Var) {
        Class cls = fmVar.a;
        cls.getClass();
        return b(cls, um0Var);
    }
}
