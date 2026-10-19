package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class te {
    public static final se h = new se(0);
    public final af1 a;
    public final bc b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final se c = h;

    public te(af1 af1Var, bc bcVar) {
        this.a = af1Var;
        this.b = bcVar;
    }

    public final void a(List list) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((re) it.next()).a(list, this.f);
        }
    }
}
