package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j9 {
    public int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public final void a(int i, Object... objArr) {
        this.e.add(new ba(i, objArr));
    }

    public boolean b() {
        return !this.f.isEmpty();
    }

    public boolean c() {
        return !this.e.isEmpty();
    }

    public ArrayList d() {
        return this.f;
    }

    public ArrayList e() {
        return this.e;
    }
}
