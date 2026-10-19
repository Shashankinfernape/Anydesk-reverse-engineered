package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tc1 implements zq, ar {
    public static final tc1 c = new tc1();

    @Override // defpackage.br
    public final Object h(Object obj, d60 d60Var) {
        return d60Var.f(obj, this);
    }

    @Override // defpackage.br
    public final br j(br brVar) {
        brVar.getClass();
        return brVar == kx.c ? this : (br) brVar.h(this, new hn(1));
    }

    @Override // defpackage.br
    public final zq l(ar arVar) {
        arVar.getClass();
        if (y90.e(this, arVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.br
    public final br q(ar arVar) {
        arVar.getClass();
        return y90.e(this, arVar) ? kx.c : this;
    }

    @Override // defpackage.zq
    public final ar getKey() {
        return this;
    }
}
