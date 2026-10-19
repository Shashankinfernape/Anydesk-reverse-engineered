package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class b11 extends w01 {
    public final /* synthetic */ AtomicReferenceArray g;

    public b11(long j, b11 b11Var, int i) {
        super(j, b11Var, i);
        this.g = new AtomicReferenceArray(a11.f);
    }

    @Override // defpackage.w01
    public final int k() {
        return a11.f;
    }

    @Override // defpackage.w01
    public final void l(int i, br brVar) {
        this.g.set(i, a11.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
