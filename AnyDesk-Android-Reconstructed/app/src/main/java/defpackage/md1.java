package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class md1 extends ld1 {
    public au0[] a;
    public String b;
    public int c;

    public md1(md1 md1Var) {
        this.a = null;
        this.c = 0;
        this.b = md1Var.b;
        this.a = uj.k(md1Var.a);
    }

    public au0[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(au0[] au0VarArr) {
        if (!uj.c(this.a, au0VarArr)) {
            this.a = uj.k(au0VarArr);
            return;
        }
        au0[] au0VarArr2 = this.a;
        for (int i = 0; i < au0VarArr.length; i++) {
            au0VarArr2[i].a = au0VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = au0VarArr[i].b;
                if (i2 < fArr.length) {
                    au0VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public md1() {
        this.a = null;
        this.c = 0;
    }
}
