package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r2 extends j2 implements e2 {
    @Override // j$.util.stream.e2
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            i2.b("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) j);
        f(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.e2
    public final void f(int i, Object obj) {
        f2 f2Var = this.a;
        ((e2) f2Var).f(i, obj);
        ((e2) this.b).f(i + ((int) ((e2) f2Var).count()), obj);
    }

    @Override // j$.util.stream.e2
    public final void g(Object obj) {
        ((e2) this.a).g(obj);
        ((e2) this.b).g(obj);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return w3.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
