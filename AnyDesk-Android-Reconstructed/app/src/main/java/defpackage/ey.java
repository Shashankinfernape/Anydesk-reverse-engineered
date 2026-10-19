package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey extends gy {
    public final xi e;
    public final /* synthetic */ iy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(iy iyVar, long j, xi xiVar) {
        super(j);
        this.f = iyVar;
        this.e = xiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.F(this.f);
    }

    @Override // defpackage.gy
    public final String toString() {
        return super.toString() + this.e;
    }
}
