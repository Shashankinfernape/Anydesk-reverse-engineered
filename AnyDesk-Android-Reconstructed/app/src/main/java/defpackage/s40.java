package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s40 implements q40 {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ t40 c;

    public /* synthetic */ s40(t40 t40Var, String str, int i) {
        this.a = i;
        this.c = t40Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    @Override // defpackage.q40
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i;
        int i2;
        int i3 = this.a;
        Throwable th = null;
        String str = this.b;
        t40 t40Var = this.c;
        switch (i3) {
            case 0:
                uf ufVar = (uf) t40Var.j.remove(str);
                if (ufVar == null) {
                    return false;
                }
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    sf sfVar = (sf) obj;
                    if (sfVar.t) {
                        ArrayList arrayList3 = sfVar.a;
                        int size2 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            c40 c40Var = ((l50) obj2).b;
                            if (c40Var != null) {
                                map.put(c40Var.g, c40Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = ufVar.c;
                HashMap map2 = new HashMap(arrayList4.size());
                int size3 = arrayList4.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList4.get(i6);
                    i6++;
                    String str2 = (String) obj3;
                    c40 c40Var2 = (c40) map.get(str2);
                    if (c40Var2 != null) {
                        map2.put(c40Var2.g, c40Var2);
                    } else {
                        Bundle bundleV = t40Var.c.v(str2, null);
                        if (bundleV != null) {
                            ClassLoader classLoader = t40Var.u.t.getClassLoader();
                            c40 c40VarA = ((h50) bundleV.getParcelable("state")).a(t40Var.E());
                            c40VarA.d = bundleV;
                            if (bundleV.getBundle("savedInstanceState") == null) {
                                c40VarA.d.putBundle("savedInstanceState", new Bundle());
                            }
                            Bundle bundle = bundleV.getBundle("arguments");
                            if (bundle != null) {
                                bundle.setClassLoader(classLoader);
                            }
                            c40VarA.N0(bundle);
                            map2.put(c40VarA.g, c40VarA);
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = ufVar.d;
                int size4 = arrayList6.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj4 = arrayList6.get(i7);
                    i7++;
                    tf tfVar = (tf) obj4;
                    ArrayList arrayList7 = tfVar.d;
                    sf sfVar2 = new sf(t40Var);
                    tfVar.a(sfVar2);
                    for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                        String str3 = (String) arrayList7.get(i8);
                        if (str3 != null) {
                            c40 c40Var3 = (c40) map2.get(str3);
                            if (c40Var3 == null) {
                                throw new IllegalStateException("Restoring FragmentTransaction " + tfVar.h + " failed due to missing saved state for Fragment (" + str3 + ")");
                            }
                            ((l50) sfVar2.a.get(i8)).b = c40Var3;
                        }
                    }
                    arrayList5.add(sfVar2);
                }
                int size5 = arrayList5.size();
                int i9 = 0;
                boolean z = false;
                while (i9 < size5) {
                    Object obj5 = arrayList5.get(i9);
                    i9++;
                    ((sf) obj5).a(arrayList, arrayList2);
                    z = true;
                }
                return z;
            default:
                int iZ = t40Var.z(str, true, -1);
                if (iZ < 0) {
                    return false;
                }
                for (int i10 = iZ; i10 < t40Var.d.size(); i10++) {
                    sf sfVar3 = (sf) t40Var.d.get(i10);
                    if (!sfVar3.p) {
                        t40Var.d0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + sfVar3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i11 = iZ;
                while (i11 < t40Var.d.size()) {
                    sf sfVar4 = (sf) t40Var.d.get(i11);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Throwable th2 = th;
                    ArrayList arrayList8 = sfVar4.a;
                    int size6 = arrayList8.size();
                    int i12 = 0;
                    while (i12 < size6) {
                        Object obj6 = arrayList8.get(i12);
                        i12++;
                        l50 l50Var = (l50) obj6;
                        c40 c40Var4 = l50Var.b;
                        if (c40Var4 != null) {
                            ArrayList arrayList9 = arrayList8;
                            if (l50Var.c) {
                                int i13 = l50Var.a;
                                i = i11;
                                if (i13 == 1 || i13 == 2 || i13 == 8) {
                                }
                                i2 = l50Var.a;
                                if (i2 != 1 || i2 == 2) {
                                    hashSet3.add(c40Var4);
                                }
                                arrayList8 = arrayList9;
                                i11 = i;
                            } else {
                                i = i11;
                            }
                            hashSet.add(c40Var4);
                            hashSet2.add(c40Var4);
                            i2 = l50Var.a;
                            if (i2 != 1) {
                                hashSet3.add(c40Var4);
                            } else {
                                hashSet3.add(c40Var4);
                            }
                            arrayList8 = arrayList9;
                            i11 = i;
                        }
                    }
                    int i14 = i11;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbN = q51.n("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbN.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbN.append(" in ");
                        sbN.append(sfVar4);
                        sbN.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        t40Var.d0(new IllegalArgumentException(sbN.toString()));
                        throw th2;
                    }
                    i11 = i14 + 1;
                    th = th2;
                }
                Throwable th3 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    c40 c40Var5 = (c40) arrayDeque.removeFirst();
                    if (c40Var5.D) {
                        StringBuilder sbN2 = q51.n("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        sbN2.append(hashSet.contains(c40Var5) ? "direct reference to retained " : "retained child ");
                        sbN2.append("fragment ");
                        sbN2.append(c40Var5);
                        t40Var.d0(new IllegalArgumentException(sbN2.toString()));
                        throw th3;
                    }
                    ArrayList arrayListG = c40Var5.w.c.g();
                    int size7 = arrayListG.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayListG.get(i15);
                        i15++;
                        c40 c40Var6 = (c40) obj7;
                        if (c40Var6 != null) {
                            arrayDeque.addLast(c40Var6);
                        }
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList10.add(((c40) it.next()).g);
                }
                ArrayList arrayList11 = new ArrayList(t40Var.d.size() - iZ);
                int i16 = iZ;
                while (i16 < t40Var.d.size()) {
                    arrayList11.add(th3);
                    i16++;
                    th3 = null;
                }
                uf ufVar2 = new uf(arrayList10, arrayList11);
                for (int size8 = t40Var.d.size() - 1; size8 >= iZ; size8--) {
                    sf sfVar5 = (sf) t40Var.d.remove(size8);
                    sf sfVar6 = new sf(sfVar5);
                    ArrayList arrayList12 = sfVar6.a;
                    int size9 = arrayList12.size() - 1;
                    while (size9 >= 0) {
                        l50 l50Var2 = (l50) arrayList12.get(size9);
                        if (l50Var2.c) {
                            if (l50Var2.a == 8) {
                                l50Var2.c = false;
                                arrayList12.remove(size9 - 1);
                                size9--;
                            } else {
                                int i17 = l50Var2.b.z;
                                l50Var2.a = 2;
                                l50Var2.c = false;
                                for (int i18 = size9 - 1; i18 >= 0; i18--) {
                                    l50 l50Var3 = (l50) arrayList12.get(i18);
                                    if (l50Var3.c && l50Var3.b.z == i17) {
                                        arrayList12.remove(i18);
                                        size9--;
                                    }
                                }
                            }
                        }
                        size9--;
                    }
                    arrayList11.set(size8 - iZ, new tf(sfVar6));
                    sfVar5.t = true;
                    arrayList.add(sfVar5);
                    arrayList2.add(Boolean.TRUE);
                }
                t40Var.j.put(str, ufVar2);
                return true;
        }
    }
}
