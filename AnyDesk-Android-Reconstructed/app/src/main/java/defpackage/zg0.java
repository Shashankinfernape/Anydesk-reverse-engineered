package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public Object g;
    public Object h;

    public zg0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.g = new ArrayList();
                this.h = new ArrayList();
                e(0.0f, 270.0f, 0.0f);
                break;
            default:
                this.b = -1.0f;
                this.c = -1.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.g = null;
                this.f = 1.0f;
                this.h = null;
                break;
        }
    }

    public void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        i41 i41Var = new i41(f4, f5, f4, f5);
        i41Var.f = this.e;
        i41Var.g = f3;
        ((ArrayList) this.h).add(new g41(i41Var));
        this.e = f;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((k41) arrayList.get(i)).a(matrix, path);
        }
    }

    public zg0 c() {
        zg0 zg0Var = new zg0(0);
        zg0Var.b = this.b;
        zg0Var.c = this.c;
        zg0Var.d = this.d;
        zg0Var.e = this.e;
        zg0Var.g = (Bitmap) this.g;
        zg0Var.f = this.f;
        zg0Var.h = (Bitmap) this.h;
        return zg0Var;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.a) {
            case 0:
                return c();
            default:
                return super.clone();
        }
    }

    public void d(float f, float f2) {
        j41 j41Var = new j41();
        j41Var.b = f;
        j41Var.c = f2;
        ((ArrayList) this.g).add(j41Var);
        h41 h41Var = new h41(j41Var, this.c, this.d);
        float fB = h41Var.b() + 270.0f;
        float fB2 = h41Var.b() + 270.0f;
        a(fB);
        ((ArrayList) this.h).add(h41Var);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public void e(float f, float f2, float f3) {
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        ((ArrayList) this.g).clear();
        ((ArrayList) this.h).clear();
    }
}
