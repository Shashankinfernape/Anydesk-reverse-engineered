package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 implements zq {
    public final ar c;

    public h2(ar arVar) {
        this.c = arVar;
    }

    @Override // defpackage.zq
    public final ar getKey() {
        return this.c;
    }

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
    public zq l(ar arVar) {
        arVar.getClass();
        if (y90.e(getKey(), arVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.br
    public br q(ar arVar) {
        arVar.getClass();
        return y90.e(getKey(), arVar) ? kx.c : this;
    }
}
