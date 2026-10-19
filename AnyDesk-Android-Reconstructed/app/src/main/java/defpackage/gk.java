package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class gk extends hk {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(gk.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final fk f;
    public final boolean g;

    public /* synthetic */ gk(fk fkVar, boolean z) {
        this(fkVar, z, kx.c, -3, oh.c);
    }

    @Override // defpackage.hk, defpackage.t10
    public final Object a(v10 v10Var, rq rqVar) throws Throwable {
        int i = this.d;
        lr lrVar = lr.c;
        if (i == -3) {
            boolean z = this.g;
            if (z && h.getAndSet(this, 1) == 1) {
                nh0.j("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objL = lk0.l(v10Var, this.f, z, rqVar);
            if (objL == lrVar) {
                return objL;
            }
        } else {
            Object objA = super.a(v10Var, rqVar);
            if (objA == lrVar) {
                return objA;
            }
        }
        return uc1.a;
    }

    @Override // defpackage.hk
    public final String c() {
        return "channel=" + this.f;
    }

    @Override // defpackage.hk
    public final Object d(ev0 ev0Var, ih ihVar) throws Throwable {
        Object objL = lk0.l(new e11(ev0Var), this.f, this.g, ihVar);
        return objL == lr.c ? objL : uc1.a;
    }

    @Override // defpackage.hk
    public final hk e(br brVar, int i, oh ohVar) {
        return new gk(this.f, this.g, brVar, i, ohVar);
    }

    @Override // defpackage.hk
    public final t10 f() {
        return new gk(this.f, this.g);
    }

    @Override // defpackage.hk
    public final fk g(kr krVar) {
        if (!this.g || h.getAndSet(this, 1) != 1) {
            return this.d == -3 ? this.f : super.g(krVar);
        }
        nh0.j("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public gk(fk fkVar, boolean z, br brVar, int i, oh ohVar) {
        super(brVar, i, ohVar);
        this.f = fkVar;
        this.g = z;
    }
}
