package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends dr {
    public static final vc1 e = new vc1();

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        us.f.e.b(runnable, true, false);
    }

    @Override // defpackage.dr
    public final void f(br brVar, Runnable runnable) {
        us.f.e.b(runnable, true, true);
    }

    @Override // defpackage.dr
    public final dr k(int i) {
        ds.d(i);
        return i >= y81.d ? this : super.k(i);
    }

    @Override // defpackage.dr
    public final String toString() {
        return "Dispatchers.IO";
    }
}
