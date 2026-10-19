package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class f81 extends sq implements m60 {
    public final int f;

    public f81(int i, rq rqVar) {
        super(rqVar);
        this.f = i;
    }

    @Override // defpackage.m60
    public final int b() {
        return this.f;
    }

    @Override // defpackage.ag
    public final String toString() {
        if (this.c != null) {
            return super.toString();
        }
        nx0.a.getClass();
        return ox0.a(this);
    }
}
