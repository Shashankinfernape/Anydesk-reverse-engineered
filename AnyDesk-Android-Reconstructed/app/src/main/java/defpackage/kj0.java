package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends AbstractSet implements Set, zd0 {
    public final /* synthetic */ int c;
    public final jj0 d;

    public /* synthetic */ kj0(jj0 jj0Var, int i) {
        this.c = i;
        this.d = jj0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.c) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.c;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.c) {
            case 0:
                this.d.clear();
                break;
            default:
                this.d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        jj0 jj0Var = this.d;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                jj0Var.getClass();
                int iF = jj0Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                Object[] objArr = jj0Var.d;
                objArr.getClass();
                return y90.e(objArr[iF], entry.getValue());
            default:
                return jj0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                return this.d.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.c;
        jj0 jj0Var = this.d;
        switch (i) {
            case 0:
                jj0Var.getClass();
                return new gj0(jj0Var, 0);
            default:
                jj0Var.getClass();
                return new gj0(jj0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.c;
        jj0 jj0Var = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    jj0Var.getClass();
                    jj0Var.b();
                    int iF = jj0Var.f(entry.getKey());
                    if (iF >= 0) {
                        Object[] objArr = jj0Var.d;
                        objArr.getClass();
                        if (y90.e(objArr[iF], entry.getValue())) {
                            jj0Var.j(iF);
                            return true;
                        }
                    }
                }
                return false;
            default:
                jj0Var.b();
                int iF2 = jj0Var.f(obj);
                if (iF2 < 0) {
                    return false;
                }
                jj0Var.j(iF2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.c;
        jj0 jj0Var = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                jj0Var.b();
                break;
            default:
                jj0Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        jj0 jj0Var = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                jj0Var.b();
                break;
            default:
                jj0Var.b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.c) {
            case 0:
                break;
            default:
                break;
        }
        return this.d.k;
    }
}
