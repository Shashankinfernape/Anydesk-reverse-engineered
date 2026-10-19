package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    public final k0 a;
    public final af1 b;
    public final br c;
    public final e71 d;
    public int e;
    public final AtomicReference f;
    public final xe g;
    public final AtomicInteger h;
    public final AtomicReference i;
    public final CopyOnWriteArrayList j;
    public final ue k;
    public final g81 l;
    public final d3 m;

    public cf(k0 k0Var, af1 af1Var, br brVar, br brVar2) {
        brVar.getClass();
        brVar2.getClass();
        this.a = k0Var;
        this.b = af1Var;
        this.c = brVar2;
        this.d = ec1.b(Boolean.FALSE);
        this.f = new AtomicReference(null);
        xe xeVar = new xe(this, brVar);
        this.g = xeVar;
        int i = 0;
        this.h = new AtomicInteger(0);
        t10 jiVar = new ji(5, new af(y90.h(new ji(4, xeVar.k), -1), null, this));
        us usVar = su.a;
        o70 o70Var = li0.a;
        if (o70Var.l(fw.f) != null) {
            nh0.i(o70Var, "Flow context cannot contain job in it. Had ");
            throw null;
        }
        if (!o70Var.equals(kx.c) && (jiVar instanceof o60)) {
            ds.q((o60) jiVar, o70Var, 0, null, 6);
        }
        this.i = new AtomicReference(null);
        this.j = new CopyOnWriteArrayList();
        this.k = new ue(i, this);
        this.l = new g81(o6.f);
        this.m = new d3(this);
    }
}
