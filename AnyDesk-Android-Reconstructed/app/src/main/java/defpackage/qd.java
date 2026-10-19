package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class qd extends AbstractList implements List, zd0 {
    public static final Object[] f = new Object[0];
    public int c;
    public Object[] d;
    public int e;

    public qd(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f;
        } else {
            if (i <= 0) {
                id.q(gr0.e(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.d = objArr;
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.e = collection.size() + this.e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.e;
        if (i < 0 || i > i2) {
            id.h("index: ", i, ", size: ", i2);
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        h();
        b(this.e + 1);
        int iG = g(this.c + i);
        int i3 = this.e;
        if (i < ((i3 + 1) >> 1)) {
            if (iG == 0) {
                Object[] objArr = this.d;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iG - 1;
            }
            int length2 = this.c;
            if (length2 == 0) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.c;
            Object[] objArr3 = this.d;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                ae.O(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                ae.O(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.d;
                objArr4[objArr4.length - 1] = objArr4[0];
                ae.O(objArr4, objArr4, 0, 1, length + 1);
            }
            this.d[length] = obj;
            this.c = i4;
        } else {
            int iG2 = g(this.c + i3);
            Object[] objArr5 = this.d;
            if (iG < iG2) {
                ae.O(objArr5, objArr5, iG + 1, iG, iG2);
            } else {
                ae.O(objArr5, objArr5, 1, 0, iG2);
                Object[] objArr6 = this.d;
                objArr6[0] = objArr6[objArr6.length - 1];
                ae.O(objArr6, objArr6, iG + 1, iG, objArr6.length - 1);
            }
            this.d[iG] = obj;
        }
        this.e++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.e;
        if (i < 0 || i > i2) {
            id.h("index: ", i, ", size: ", i2);
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.e) {
            return addAll(collection);
        }
        h();
        b(collection.size() + this.e);
        int iG = g(this.c + this.e);
        int iG2 = g(this.c + i);
        int size = collection.size();
        if (i >= ((this.e + 1) >> 1)) {
            int i3 = iG2 + size;
            Object[] objArr = this.d;
            if (iG2 < iG) {
                int i4 = size + iG;
                if (i4 <= objArr.length) {
                    ae.O(objArr, objArr, i3, iG2, iG);
                } else if (i3 >= objArr.length) {
                    ae.O(objArr, objArr, i3 - objArr.length, iG2, iG);
                } else {
                    int length = iG - (i4 - objArr.length);
                    ae.O(objArr, objArr, 0, length, iG);
                    Object[] objArr2 = this.d;
                    ae.O(objArr2, objArr2, i3, iG2, length);
                }
            } else {
                ae.O(objArr, objArr, size, 0, iG);
                Object[] objArr3 = this.d;
                if (i3 >= objArr3.length) {
                    ae.O(objArr3, objArr3, i3 - objArr3.length, iG2, objArr3.length);
                } else {
                    ae.O(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.d;
                    ae.O(objArr4, objArr4, i3, iG2, objArr4.length - size);
                }
            }
            a(iG2, collection);
            return true;
        }
        int i5 = this.c;
        int length2 = i5 - size;
        Object[] objArr5 = this.d;
        if (iG2 < i5) {
            ae.O(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.d;
            if (size >= iG2) {
                ae.O(objArr6, objArr6, objArr6.length - size, 0, iG2);
            } else {
                ae.O(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.d;
                ae.O(objArr7, objArr7, 0, size, iG2);
            }
        } else if (length2 >= 0) {
            ae.O(objArr5, objArr5, length2, i5, iG2);
        } else {
            length2 += objArr5.length;
            int i6 = iG2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                ae.O(objArr5, objArr5, length2, i5, iG2);
            } else {
                ae.O(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.d;
                ae.O(objArr8, objArr8, 0, this.c + length3, iG2);
            }
        }
        this.c = length2;
        a(e(iG2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        h();
        b(this.e + 1);
        int length = this.c;
        if (length == 0) {
            Object[] objArr = this.d;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.c = i;
        this.d[i] = obj;
        this.e++;
    }

    public final void addLast(Object obj) {
        h();
        b(this.e + 1);
        this.d[g(this.c + this.e)] = obj;
        this.e++;
    }

    public final void b(int i) {
        if (i < 0) {
            nh0.j("Deque is too big.");
            return;
        }
        Object[] objArr = this.d;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f) {
            if (i < 10) {
                i = 10;
            }
            this.d = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ae.O(objArr, objArr2, 0, this.c, objArr.length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i3 = this.c;
        ae.O(objArr3, objArr2, length2 - i3, 0, i3);
        this.c = 0;
        this.d = objArr2;
    }

    public final int c(int i) {
        Object[] objArr = this.d;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.c, g(this.c + this.e));
        }
        this.c = 0;
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d() {
        if (isEmpty()) {
            return null;
        }
        return this.d[g((this.e - 1) + this.c)];
    }

    public final int e(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    public final void f(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            ae.Q(objArr, null, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            ae.Q(this.d, null, 0, i2);
        }
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    public final int g(int i) {
        Object[] objArr = this.d;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        if (i >= 0 && i < i2) {
            return this.d[g(this.c + i)];
        }
        id.h("index: ", i, ", size: ", i2);
        return null;
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    public final Object i(int i) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            id.h("index: ", i, ", size: ", i2);
            return null;
        }
        if (i == i2 - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        h();
        int iG = g(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iG];
        int i3 = this.e;
        int i4 = i3 >> 1;
        int i5 = this.c;
        if (i < i4) {
            if (iG >= i5) {
                ae.O(objArr, objArr, i5 + 1, i5, iG);
            } else {
                ae.O(objArr, objArr, 1, 0, iG);
                Object[] objArr2 = this.d;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.c;
                ae.O(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.d;
            int i7 = this.c;
            objArr3[i7] = null;
            this.c = c(i7);
        } else {
            int iG2 = g((i3 - 1) + i5);
            Object[] objArr4 = this.d;
            if (iG <= iG2) {
                ae.O(objArr4, objArr4, iG, iG + 1, iG2 + 1);
            } else {
                ae.O(objArr4, objArr4, iG, iG + 1, objArr4.length);
                Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                ae.O(objArr5, objArr5, 0, 1, iG2 + 1);
            }
            this.d[iG2] = null;
        }
        this.e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iG = g(this.c + this.e);
        int length = this.c;
        if (length < iG) {
            while (length < iG) {
                if (y90.e(obj, this.d[length])) {
                    i = this.c;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (y90.e(obj, this.d[length])) {
                i = this.c;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iG; i2++) {
            if (y90.e(obj, this.d[i2])) {
                length = i2 + this.d.length;
                i = this.c;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[g((size() - 1) + this.c)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iG = g(this.c + this.e);
        int i2 = this.c;
        if (i2 < iG) {
            length = iG - 1;
            if (i2 <= length) {
                while (!y90.e(obj, this.d[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.c;
                return length - i;
            }
            return -1;
        }
        if (i2 > iG) {
            do {
                iG--;
                objArr = this.d;
                if (-1 >= iG) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.c;
                    if (i3 <= length) {
                        while (!y90.e(obj, this.d[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.c;
                    }
                }
                return length - i;
            } while (!y90.e(obj, objArr[iG]));
            length = iG + this.d.length;
            i = this.c;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iG;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int iG2 = g(this.c + this.e);
            int i = this.c;
            if (i < iG2) {
                iG = i;
                while (true) {
                    objArr = this.d;
                    if (i >= iG2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.d[iG] = obj;
                        iG++;
                    }
                    i++;
                }
                ae.Q(objArr, null, iG, iG2);
            } else {
                int length = this.d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.d[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iG = g(i2);
                for (int i3 = 0; i3 < iG2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.d[iG] = obj3;
                        iG = c(iG);
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.e = e(iG - this.c);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = c(i);
        this.e--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        int iG = g((size() - 1) + this.c);
        Object[] objArr = this.d;
        Object obj = objArr[iG];
        objArr[iG] = null;
        this.e--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        bu0.g(i, i2, this.e);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.e) {
            clear();
            return;
        }
        if (i3 == 1) {
            i(i);
            return;
        }
        h();
        int i4 = this.e - i2;
        int i5 = this.c;
        if (i < i4) {
            int iG = g((i - 1) + i5);
            int iG2 = g(this.c + (i2 - 1));
            while (i > 0) {
                int i6 = iG + 1;
                int iMin = Math.min(i, Math.min(i6, iG2 + 1));
                Object[] objArr = this.d;
                int i7 = iG2 - iMin;
                int i8 = iG - iMin;
                ae.O(objArr, objArr, i7 + 1, i8 + 1, i6);
                iG = e(i8);
                iG2 = e(i7);
                i -= iMin;
            }
            int iG3 = g(this.c + i3);
            f(this.c, iG3);
            this.c = iG3;
        } else {
            int iG4 = g(i5 + i2);
            int iG5 = g(this.c + i);
            int i9 = this.e;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.d;
                i2 = Math.min(i9, Math.min(objArr2.length - iG4, objArr2.length - iG5));
                Object[] objArr3 = this.d;
                int i10 = iG4 + i2;
                ae.O(objArr3, objArr3, iG5, iG4, i10);
                iG4 = g(i10);
                iG5 = g(iG5 + i2);
            }
            int iG6 = g(this.c + this.e);
            f(e(iG6 - i3), iG6);
        }
        this.e -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iG;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int iG2 = g(this.c + this.e);
            int i = this.c;
            if (i < iG2) {
                iG = i;
                while (true) {
                    objArr = this.d;
                    if (i >= iG2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.d[iG] = obj;
                        iG++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ae.Q(objArr, null, iG, iG2);
            } else {
                int length = this.d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iG = g(i2);
                for (int i3 = 0; i3 < iG2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.d[iG] = obj3;
                        iG = c(iG);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.e = e(iG - this.c);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            id.h("index: ", i, ", size: ", i2);
            return null;
        }
        int iG = g(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.e;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iG = g(this.c + this.e);
        int i2 = this.c;
        if (i2 < iG) {
            ae.P(this.d, objArr, i2, iG, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            ae.O(objArr2, objArr, 0, this.c, objArr2.length);
            Object[] objArr3 = this.d;
            ae.O(objArr3, objArr, objArr3.length - this.c, 0, iG);
        }
        int i3 = this.e;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return i(i);
    }

    public qd() {
        this.d = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.e]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        h();
        b(collection.size() + this.e);
        a(g(this.c + this.e), collection);
        return true;
    }
}
