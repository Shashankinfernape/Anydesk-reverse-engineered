package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z30 extends b40 {
    public final /* synthetic */ ev a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ hq c;
    public final /* synthetic */ j6 d;
    public final /* synthetic */ c40 e;

    public z30(c40 c40Var, ev evVar, AtomicReference atomicReference, hq hqVar, j6 j6Var) {
        this.e = c40Var;
        this.a = evVar;
        this.b = atomicReference;
        this.c = hqVar;
        this.d = j6Var;
    }

    @Override // defpackage.b40
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        c40 c40Var = this.e;
        sb.append(c40Var.g);
        sb.append("_rq#");
        sb.append(c40Var.V.getAndIncrement());
        String string = sb.toString();
        c40 c40Var2 = (c40) this.a.d;
        e40 e40Var = c40Var2.v;
        this.b.set((e40Var != null ? e40Var.w : c40Var2.G0()).k.d(string, c40Var, this.c, this.d));
    }
}
