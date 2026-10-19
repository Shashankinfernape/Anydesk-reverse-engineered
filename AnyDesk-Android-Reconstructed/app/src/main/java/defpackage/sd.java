package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sd extends AbstractSet {
    public final /* synthetic */ xd c;

    public sd(xd xdVar) {
        this.c = xdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vd(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.e;
    }
}
