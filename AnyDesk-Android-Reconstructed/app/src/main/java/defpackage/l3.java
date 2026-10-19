package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends ve1 {
    public final z80 b;
    public boolean c;

    public l3(z80 z80Var) {
        this.b = z80Var;
        synchronized (this) {
            this.c = false;
        }
    }

    public final synchronized boolean e() {
        return this.c;
    }
}
