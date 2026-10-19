package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t9 extends j9 {
    public int l;
    public int m;
    public h51 n;
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final ArrayList k = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();

    @Override // defpackage.j9
    public final boolean b() {
        return !this.p.isEmpty();
    }

    @Override // defpackage.j9
    public final boolean c() {
        return !this.o.isEmpty();
    }

    @Override // defpackage.j9
    public final ArrayList d() {
        return this.p;
    }

    @Override // defpackage.j9
    public final ArrayList e() {
        return this.o;
    }

    public final void f(ea eaVar, Object... objArr) {
        this.p.add(new fa(eaVar, objArr));
    }

    public final void g(ea eaVar, Object... objArr) {
        this.o.add(new fa(eaVar, objArr));
    }
}
