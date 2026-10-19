package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class s81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t81 b;

    public /* synthetic */ s81(t81 t81Var, int i) {
        this.a = i;
        this.b = t81Var;
    }

    public void a(float f) {
        int i = this.a;
        t81 t81Var = this.b;
        switch (i) {
            case 0:
                Path path = t81Var.P;
                float f2 = t81Var.R * f;
                boolean z = f2 > t81Var.Q;
                if (!z) {
                    t81Var.a();
                }
                float f3 = t81Var.r.c * 255.0f;
                t81Var.Q = f2;
                float f4 = 1.5f * f;
                t81Var.T = (int) Math.min(f3, f4 * f3);
                path.reset();
                int[] iArr = t81Var.S;
                path.addCircle(iArr[0], iArr[1], t81Var.Q, Path.Direction.CW);
                t81Var.a0 = (int) Math.min(255.0f, f4 * 255.0f);
                int i2 = t81Var.g;
                if (z) {
                    t81Var.W = Math.min(1.0f, f4) * i2;
                } else {
                    t81Var.W = i2 * f;
                    t81Var.U *= f;
                }
                t81Var.b0 = (int) ((f >= 0.7f ? (f - 0.7f) / 0.3f : 0.0f) * 255.0f);
                if (z) {
                    t81Var.a();
                }
                t81Var.d(t81Var.N);
                break;
            case 1:
            case 4:
            default:
                float fMin = Math.min(1.0f, 2.0f * f);
                t81Var.Q = ((0.2f * fMin) + 1.0f) * t81Var.R;
                float f5 = 1.0f - fMin;
                t81Var.T = (int) (t81Var.r.c * f5 * 255.0f);
                Path path2 = t81Var.P;
                path2.reset();
                int[] iArr2 = t81Var.S;
                path2.addCircle(iArr2[0], iArr2[1], t81Var.Q, Path.Direction.CW);
                float f6 = 1.0f - f;
                float f7 = t81Var.g;
                t81Var.W = f6 * f7;
                t81Var.a0 = (int) (f6 * 255.0f);
                t81Var.U = (f + 1.0f) * f7;
                t81Var.V = (int) (f6 * t81Var.V);
                t81Var.b0 = (int) (f5 * 255.0f);
                t81Var.a();
                t81Var.d(t81Var.N);
                break;
            case 2:
                t81Var.j0.a(f);
                break;
            case 3:
                float f8 = f >= 0.5f ? (f - 0.5f) / 0.5f : 0.0f;
                float f9 = t81Var.g;
                t81Var.U = (f8 + 1.0f) * f9;
                t81Var.V = (int) ((1.0f - f8) * 255.0f);
                t81Var.W = ((f < 0.5f ? f / 0.5f : (1.0f - f) / 0.5f) * t81Var.h) + f9;
                float f10 = t81Var.Q;
                float f11 = t81Var.R;
                if (f10 != f11) {
                    t81Var.Q = f11;
                }
                t81Var.a();
                t81Var.d(t81Var.N);
                break;
            case 5:
                t81Var.j0.a(f);
                break;
        }
    }
}
