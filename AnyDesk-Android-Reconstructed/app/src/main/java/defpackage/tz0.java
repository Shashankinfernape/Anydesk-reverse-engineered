package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tz0 extends uz0 implements Iterator {
    public sz0 c;
    public boolean d = true;
    public final /* synthetic */ vz0 e;

    public tz0(vz0 vz0Var) {
        this.e = vz0Var;
    }

    @Override // defpackage.uz0
    public final void a(sz0 sz0Var) {
        sz0 sz0Var2 = this.c;
        if (sz0Var == sz0Var2) {
            sz0 sz0Var3 = sz0Var2.f;
            this.c = sz0Var3;
            this.d = sz0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d) {
            return this.e.c != null;
        }
        sz0 sz0Var = this.c;
        return (sz0Var == null || sz0Var.e == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d) {
            this.d = false;
            this.c = this.e.c;
        } else {
            sz0 sz0Var = this.c;
            this.c = sz0Var != null ? sz0Var.e : null;
        }
        return this.c;
    }
}
