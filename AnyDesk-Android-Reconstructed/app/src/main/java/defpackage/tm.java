package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tm extends zm {
    public static boolean h0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    um.b0();
                    throw null;
                }
                if (y90.e(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static Object i0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object j0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object k0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void l0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, z50 z50Var) {
        iterable.getClass();
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (z50Var != null) {
                sb.append((CharSequence) z50Var.h(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    public static String n0(Iterable iterable, String str, String str2, z50 z50Var, int i) {
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            z50Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        l0(iterable, sb, ", ", str3, str4, "...", z50Var);
        return sb.toString();
    }

    public static Object o0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object p0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable q0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList r0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            zm.d0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List s0(Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        if (z && ((Collection) iterable).size() <= 1) {
            return w0(iterable);
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            u0(iterable, arrayList);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static boolean[] t0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void u0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] v0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List w0(Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                u0(iterable, arrayList);
            }
            return um.a0(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return mx.c;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return y90.J(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList x0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }
}
