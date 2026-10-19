package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i51 {
    public int[] c;
    public Object[] d;
    public int e;

    public i51(int i) {
        this.c = i == 0 ? y90.b : new int[i];
        this.d = i == 0 ? y90.c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.e * 2;
        Object[] objArr = this.d;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.e;
        int[] iArr = this.c;
        if (iArr.length < i) {
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i * 2);
        }
        if (this.e != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.e;
        if (i2 == 0) {
            return -1;
        }
        int iF = y90.f(i2, i, this.c);
        if (iF < 0 || y90.e(obj, this.d[iF << 1])) {
            return iF;
        }
        int i3 = iF + 1;
        while (i3 < i2 && this.c[i3] == i) {
            if (y90.e(obj, this.d[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iF - 1; i4 >= 0 && this.c[i4] == i; i4--) {
            if (y90.e(obj, this.d[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.e > 0) {
            this.c = y90.b;
            this.d = y90.c;
            this.e = 0;
        }
        if (this.e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        int iF = y90.f(i, 0, this.c);
        if (iF < 0 || this.d[iF << 1] == null) {
            return iF;
        }
        int i2 = iF + 1;
        while (i2 < i && this.c[i2] == 0) {
            if (this.d[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iF - 1; i3 >= 0 && this.c[i3] == 0; i3--) {
            if (this.d[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i51) {
                int i = this.e;
                if (i != ((i51) obj).e) {
                    return false;
                }
                i51 i51Var = (i51) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objI = i(i2);
                    Object obj2 = i51Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !i51Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.e != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.e;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objI2 = i(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.e) {
            return this.d[i << 1];
        }
        nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.e)) {
            nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.d;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.c;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ae.N(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.d;
                ae.O(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.d;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.c = Arrays.copyOf(iArr, i7);
            this.d = Arrays.copyOf(this.d, i7 << 1);
            if (i2 != this.e) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ae.N(0, 0, i, iArr, this.c);
                ae.O(objArr, this.d, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                ae.N(i, i8, i2, iArr, this.c);
                ae.O(objArr, this.d, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.e) {
            throw new ConcurrentModificationException();
        }
        this.e = i4;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.d[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.d[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.e) {
            nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i = this.e;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.e) {
            return this.d[(i << 1) + 1];
        }
        nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        return this.e <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.e;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.d;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.c;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.c = Arrays.copyOf(iArr, i4);
            this.d = Arrays.copyOf(this.d, i4 << 1);
            if (i != this.e) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.c;
            int i5 = i3 + 1;
            ae.N(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.d;
            ae.O(objArr2, objArr2, i5 << 1, i3 << 1, this.e << 1);
        }
        int i6 = this.e;
        if (i == i6) {
            int[] iArr3 = this.c;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.d;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.e = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !y90.e(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !y90.e(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.e;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }
}
