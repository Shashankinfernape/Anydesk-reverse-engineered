package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zd implements Collection, Set, zd0 {
    public int[] c;
    public Object[] d;
    public int e;

    public zd(int i) {
        this.c = y90.b;
        this.d = y90.c;
        if (i > 0) {
            this.c = new int[i];
            this.d = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.e;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.c;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ae.N(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.d;
                ae.O(objArr2, objArr2, i, i4, i2);
            }
            this.d[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.c = iArr2;
            this.d = new Object[i5];
            if (i > 0) {
                ae.N(0, 0, i, iArr, iArr2);
                ae.P(objArr, this.d, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                ae.N(i, i6, i2, iArr, this.c);
                ae.O(objArr, this.d, i, i6, i2);
            }
        }
        if (i2 != this.e) {
            throw new ConcurrentModificationException();
        }
        this.e = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iX;
        int i2 = this.e;
        if (obj == null) {
            iX = th1.x(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iX = th1.x(this, obj, iHashCode);
        }
        if (iX >= 0) {
            return false;
        }
        int i3 = ~iX;
        int[] iArr = this.c;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.d;
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = new Object[i4];
            if (i2 != this.e) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                ae.N(0, 0, iArr.length, iArr, iArr2);
                ae.P(objArr, this.d, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.c;
            int i5 = i3 + 1;
            ae.N(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.d;
            ae.O(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.e;
        if (i2 == i6) {
            int[] iArr4 = this.c;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.d[i3] = obj;
                this.e = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.e;
        int i = this.e;
        int[] iArr = this.c;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.d;
            int[] iArr2 = new int[size];
            this.c = iArr2;
            this.d = new Object[size];
            if (i > 0) {
                ae.N(0, 0, i, iArr, iArr2);
                ae.P(objArr, this.d, 0, this.e, 6);
            }
        }
        if (this.e != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.e != 0) {
            this.c = y90.b;
            this.d = y90.c;
            this.e = 0;
        }
        if (this.e != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? th1.x(this, null, 0) : th1.x(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.e != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.e;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.d[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.c;
        int i = this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new td(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iX = obj == null ? th1.x(this, null, 0) : th1.x(this, obj, obj.hashCode());
        if (iX < 0) {
            return false;
        }
        a(iX);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.e - 1; -1 < i; i--) {
            if (!tm.h0(collection, this.d[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.d;
        int i = this.e;
        objArr.getClass();
        int length = objArr.length;
        if (i <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 14);
        sb.append('{');
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ae.O(this.d, objArr, 0, 0, this.e);
        return objArr;
    }
}
