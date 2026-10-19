package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 implements Map, Serializable, yd0 {
    public static final jj0 p;
    public Object[] c;
    public Object[] d;
    public int[] e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public kj0 l;
    public lj0 m;
    public kj0 n;
    public boolean o;

    static {
        jj0 jj0Var = new jj0(0);
        jj0Var.o = true;
        p = jj0Var;
    }

    public jj0(int i) {
        if (i < 0) {
            id.q("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.c = objArr;
        this.d = null;
        this.e = iArr;
        this.f = new int[iHighestOneBit];
        this.g = 2;
        this.h = 0;
        this.i = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iH = h(obj);
            int i = this.g * 2;
            int length = this.f.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                int i3 = iArr[iH];
                if (i3 <= 0) {
                    int i4 = this.h;
                    Object[] objArr = this.c;
                    if (i4 >= objArr.length) {
                        e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.h = i5;
                    objArr[i4] = obj;
                    this.e[i4] = iH;
                    iArr[iH] = i5;
                    this.k++;
                    this.j++;
                    if (i2 > this.g) {
                        this.g = i2;
                    }
                    return i4;
                }
                if (y90.e(this.c[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    i(this.f.length * 2);
                    break;
                }
                iH = iH == 0 ? this.f.length - 1 : iH - 1;
            }
        }
    }

    public final void b() {
        if (this.o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.h;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.e;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.c;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        y90.R(this.c, i3, i);
        if (objArr != null) {
            y90.R(objArr, i3, this.h);
        }
        this.h = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.h - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.e;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        y90.R(this.c, 0, this.h);
        Object[] objArr = this.d;
        if (objArr != null) {
            y90.R(objArr, 0, this.h);
        }
        this.k = 0;
        this.h = 0;
        this.j++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean zE;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zE = false;
                    } else {
                        Object[] objArr = this.d;
                        objArr.getClass();
                        zE = y90.e(objArr[iF], entry.getValue());
                    }
                    if (!zE) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.c;
        int length = objArr.length;
        int i2 = this.h;
        int i3 = length - i2;
        int i4 = i2 - this.k;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.c = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.d;
            this.d = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.e = Arrays.copyOf(this.e, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        kj0 kj0Var = this.n;
        if (kj0Var != null) {
            return kj0Var;
        }
        kj0 kj0Var2 = new kj0(this, 0);
        this.n = kj0Var2;
        return kj0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.k == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.g;
        while (true) {
            int i2 = this.f[iH];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (y90.e(this.c[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.f.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.h;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.e[i] >= 0) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (y90.e(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.i;
    }

    @Override // java.util.Map
    public final int hashCode() {
        gj0 gj0Var = new gj0(this, 0);
        int i = 0;
        while (gj0Var.hasNext()) {
            int i2 = gj0Var.c;
            jj0 jj0Var = (jj0) gj0Var.f;
            if (i2 >= jj0Var.h) {
                throw new NoSuchElementException();
            }
            gj0Var.c = i2 + 1;
            gj0Var.d = i2;
            Object obj = jj0Var.c[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = jj0Var.d;
            objArr.getClass();
            Object obj2 = objArr[gj0Var.d];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gj0Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        int[] iArr;
        this.j++;
        int i2 = 0;
        if (this.h > this.k) {
            c(false);
        }
        this.f = new int[i];
        this.i = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.h) {
            int i3 = i2 + 1;
            int iH = h(this.c[i2]);
            int i4 = this.g;
            while (true) {
                iArr = this.f;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    nh0.j("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
            iArr[iH] = i3;
            this.e[i2] = iH;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    public final void j(int i) {
        Object[] objArr = this.c;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.d;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.e[i];
        int i2 = this.g * 2;
        int length2 = this.f.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.f.length - 1 : length - 1;
            i4++;
            int i6 = this.g;
            int[] iArr = this.f;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iH = h(this.c[i8]) - length;
                        int[] iArr2 = this.f;
                        if ((iH & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.e[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.e[i] = -1;
            this.k--;
            this.j++;
        } while (i3 >= 0);
        this.f[i5] = -1;
        this.e[i] = -1;
        this.k--;
        this.j++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        kj0 kj0Var = this.l;
        if (kj0Var != null) {
            return kj0Var;
        }
        kj0 kj0Var2 = new kj0(this, 1);
        this.l = kj0Var2;
        return kj0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.d;
        if (objArr == null) {
            int length = this.c.length;
            if (length < 0) {
                id.q("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.d = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.d;
            if (objArr == null) {
                int length = this.c.length;
                if (length < 0) {
                    id.q("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.d = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!y90.e(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.k * 3) + 2);
        sb.append("{");
        int i = 0;
        gj0 gj0Var = new gj0(this, 0);
        while (gj0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = gj0Var.c;
            jj0 jj0Var = (jj0) gj0Var.f;
            if (i2 >= jj0Var.h) {
                throw new NoSuchElementException();
            }
            gj0Var.c = i2 + 1;
            gj0Var.d = i2;
            Object obj = jj0Var.c[i2];
            if (obj == jj0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = jj0Var.d;
            objArr.getClass();
            Object obj2 = objArr[gj0Var.d];
            if (obj2 == jj0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            gj0Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        lj0 lj0Var = this.m;
        if (lj0Var != null) {
            return lj0Var;
        }
        lj0 lj0Var2 = new lj0(this);
        this.m = lj0Var2;
        return lj0Var2;
    }
}
