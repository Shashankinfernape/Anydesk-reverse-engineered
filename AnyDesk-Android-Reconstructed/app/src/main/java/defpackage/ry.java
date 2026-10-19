package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ry extends vz0 {
    public final HashMap g = new HashMap();

    @Override // defpackage.vz0
    public final sz0 a(Object obj) {
        return (sz0) this.g.get(obj);
    }

    @Override // defpackage.vz0
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.g.remove(obj);
        return objB;
    }
}
