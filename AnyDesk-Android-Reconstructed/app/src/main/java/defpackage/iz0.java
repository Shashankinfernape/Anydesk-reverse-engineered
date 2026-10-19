package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends r71 {
    @Override // defpackage.r71
    public final void v(zg0 zg0Var, float f, float f2) {
        zg0Var.e(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        i41 i41Var = new i41(0.0f, 0.0f, f3, f3);
        i41Var.f = 180.0f;
        i41Var.g = 90.0f;
        ((ArrayList) zg0Var.g).add(i41Var);
        g41 g41Var = new g41(i41Var);
        zg0Var.a(180.0f);
        ((ArrayList) zg0Var.h).add(g41Var);
        zg0Var.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        zg0Var.c = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        zg0Var.d = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
