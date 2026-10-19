package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rz0 extends uz0 implements Iterator {
    public sz0 c;
    public sz0 d;
    public final /* synthetic */ int e;

    public rz0(sz0 sz0Var, sz0 sz0Var2, int i) {
        this.e = i;
        this.c = sz0Var2;
        this.d = sz0Var;
    }

    @Override // defpackage.uz0
    public final void a(sz0 sz0Var) {
        sz0 sz0Var2;
        sz0 sz0VarB = null;
        if (this.c == sz0Var && sz0Var == this.d) {
            this.d = null;
            this.c = null;
        }
        sz0 sz0Var3 = this.c;
        if (sz0Var3 == sz0Var) {
            switch (this.e) {
                case 0:
                    sz0Var2 = sz0Var3.f;
                    break;
                default:
                    sz0Var2 = sz0Var3.e;
                    break;
            }
            this.c = sz0Var2;
        }
        sz0 sz0Var4 = this.d;
        if (sz0Var4 == sz0Var) {
            sz0 sz0Var5 = this.c;
            if (sz0Var4 != sz0Var5 && sz0Var5 != null) {
                sz0VarB = b(sz0Var4);
            }
            this.d = sz0VarB;
        }
    }

    public final sz0 b(sz0 sz0Var) {
        switch (this.e) {
            case 0:
                return sz0Var.e;
            default:
                return sz0Var.f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        sz0 sz0Var = this.d;
        sz0 sz0Var2 = this.c;
        this.d = (sz0Var == sz0Var2 || sz0Var2 == null) ? null : b(sz0Var);
        return sz0Var;
    }
}
