package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cx {
    public int a = 1;
    public final rl0 b;
    public rl0 c;
    public rl0 d;
    public int e;
    public int f;

    public cx(rl0 rl0Var) {
        this.b = rl0Var;
        this.c = rl0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        pl0 pl0VarB = this.c.b.b();
        int iA = pl0VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) pl0VarB.f).get(iA + pl0VarB.c) == 0) || this.e == 65039;
    }
}
