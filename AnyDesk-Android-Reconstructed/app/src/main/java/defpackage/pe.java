package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pe extends r71 {
    public final /* synthetic */ qe j;

    public pe(qe qeVar) {
        this.j = qeVar;
    }

    @Override // defpackage.r71
    public final boolean c(int i, int i2) {
        qe qeVar = this.j;
        Object obj = ((List) qeVar.e).get(i);
        Object obj2 = ((List) qeVar.f).get(i2);
        if (obj != null && obj2 != null) {
            return ((k0) ((te) qeVar.g).b.e).L(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.r71
    public final boolean d(int i, int i2) {
        qe qeVar = this.j;
        Object obj = ((List) qeVar.e).get(i);
        Object obj2 = ((List) qeVar.f).get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((k0) ((te) qeVar.g).b.e).M(obj, obj2);
    }

    @Override // defpackage.r71
    public final Object s(int i, int i2) {
        qe qeVar = this.j;
        Object obj = ((List) qeVar.e).get(i);
        Object obj2 = ((List) qeVar.f).get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = ((te) qeVar.g).b.e;
        return null;
    }

    @Override // defpackage.r71
    public final int x() {
        return ((List) this.j.f).size();
    }

    @Override // defpackage.r71
    public final int y() {
        return ((List) this.j.e).size();
    }
}
