package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy extends dr {
    public long e;
    public boolean f;
    public qd g;

    public final void o() {
        long j = this.e - 4294967296L;
        this.e = j;
        if (j <= 0 && this.f) {
            shutdown();
        }
    }

    public final void p(ru ruVar) {
        qd qdVar = this.g;
        if (qdVar == null) {
            qdVar = new qd();
            this.g = qdVar;
        }
        qdVar.addLast(ruVar);
    }

    public final void r(boolean z) {
        this.e = (z ? 4294967296L : 1L) + this.e;
        if (z) {
            return;
        }
        this.f = true;
    }

    public abstract void shutdown();

    public final boolean t() {
        qd qdVar = this.g;
        if (qdVar == null) {
            return false;
        }
        ru ruVar = (ru) (qdVar.isEmpty() ? null : qdVar.removeFirst());
        if (ruVar == null) {
            return false;
        }
        ruVar.run();
        return true;
    }
}
