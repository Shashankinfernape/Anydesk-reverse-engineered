package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class z8 implements TypeEvaluator {
    public au0[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        au0[] au0VarArr = (au0[]) obj;
        au0[] au0VarArr2 = (au0[]) obj2;
        if (!uj.c(au0VarArr, au0VarArr2)) {
            id.q("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!uj.c(this.a, au0VarArr)) {
            this.a = uj.k(au0VarArr);
        }
        int i = 0;
        while (true) {
            int length = au0VarArr.length;
            au0[] au0VarArr3 = this.a;
            if (i >= length) {
                return au0VarArr3;
            }
            au0 au0Var = au0VarArr3[i];
            au0 au0Var2 = au0VarArr[i];
            au0 au0Var3 = au0VarArr2[i];
            au0Var.getClass();
            au0Var.a = au0Var2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = au0Var2.b;
                if (i2 < fArr.length) {
                    au0Var.b[i2] = (au0Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            i++;
        }
    }
}
