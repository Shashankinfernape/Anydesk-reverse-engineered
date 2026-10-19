package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kd1 extends ld1 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public kd1(kd1 kd1Var, xd xdVar) {
        md1 id1Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = kd1Var.c;
        this.d = kd1Var.d;
        this.e = kd1Var.e;
        this.f = kd1Var.f;
        this.g = kd1Var.g;
        this.h = kd1Var.h;
        this.i = kd1Var.i;
        String str = kd1Var.k;
        this.k = str;
        if (str != null) {
            xdVar.put(str, this);
        }
        matrix.set(kd1Var.j);
        ArrayList arrayList = kd1Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof kd1) {
                this.b.add(new kd1((kd1) obj, xdVar));
            } else {
                if (obj instanceof jd1) {
                    jd1 jd1Var = (jd1) obj;
                    jd1 jd1Var2 = new jd1(jd1Var);
                    jd1Var2.e = 0.0f;
                    jd1Var2.g = 1.0f;
                    jd1Var2.h = 1.0f;
                    jd1Var2.i = 0.0f;
                    jd1Var2.j = 1.0f;
                    jd1Var2.k = 0.0f;
                    jd1Var2.l = Paint.Cap.BUTT;
                    jd1Var2.m = Paint.Join.MITER;
                    jd1Var2.n = 4.0f;
                    jd1Var2.d = jd1Var.d;
                    jd1Var2.e = jd1Var.e;
                    jd1Var2.g = jd1Var.g;
                    jd1Var2.f = jd1Var.f;
                    jd1Var2.c = jd1Var.c;
                    jd1Var2.h = jd1Var.h;
                    jd1Var2.i = jd1Var.i;
                    jd1Var2.j = jd1Var.j;
                    jd1Var2.k = jd1Var.k;
                    jd1Var2.l = jd1Var.l;
                    jd1Var2.m = jd1Var.m;
                    jd1Var2.n = jd1Var.n;
                    id1Var = jd1Var2;
                } else {
                    if (!(obj instanceof id1)) {
                        nh0.j("Unknown object in the tree!");
                        throw null;
                    }
                    id1Var = new id1((id1) obj);
                }
                this.b.add(id1Var);
                Object obj2 = id1Var.b;
                if (obj2 != null) {
                    xdVar.put(obj2, id1Var);
                }
            }
        }
    }

    @Override // defpackage.ld1
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((ld1) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ld1
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((ld1) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public kd1() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
