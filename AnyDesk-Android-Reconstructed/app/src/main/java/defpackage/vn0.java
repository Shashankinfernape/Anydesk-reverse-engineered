package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class vn0 {
    public static final /* synthetic */ int h = 0;
    public final String c;
    public final m7 d;
    public xn0 e;
    public CharSequence f;
    public final x51 g;

    static {
        new LinkedHashMap();
    }

    public vn0(fp0 fp0Var) {
        LinkedHashMap linkedHashMap = gp0.b;
        this.c = bu0.r(fp0Var.getClass());
        this.d = new m7(this);
        this.g = new x51(0);
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d.e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            zm0 zm0Var = (zm0) entry.getValue();
            zm0Var.getClass();
            str.getClass();
            if (zm0Var.c && (obj = zm0Var.d) != null) {
                zm0Var.a.e(bundleG, str, obj);
            }
        }
        if (bundle != null) {
            bundleG.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                zm0 zm0Var2 = (zm0) entry2.getValue();
                zm0Var2.getClass();
                lo0 lo0Var = zm0Var2.a;
                str2.getClass();
                if (zm0Var2.b || !bundleG.containsKey(str2) || !lk0.B(str2, bundleG)) {
                    try {
                        lo0Var.a(str2, bundleG);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbN = q51.n("Wrong argument type for '", str2, "' in argument savedState. ");
                sbN.append(lo0Var.b());
                sbN.append(" expected.");
                throw new IllegalArgumentException(sbN.toString().toString());
            }
        }
        return bundleG;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public final int[] b(vn0 vn0Var) {
        qd qdVar = new qd();
        vn0 vn0Var2 = this;
        while (true) {
            m7 m7Var = vn0Var2.d;
            xn0 xn0Var = vn0Var2.e;
            if ((vn0Var != null ? vn0Var.e : null) != null) {
                xn0 xn0Var2 = vn0Var.e;
                xn0Var2.getClass();
                if (xn0Var2.h(m7Var.a) != vn0Var2) {
                    if (xn0Var != null || xn0Var.i.c != m7Var.a) {
                        qdVar.addFirst(vn0Var2);
                    }
                    if (!y90.e(xn0Var, vn0Var) || xn0Var == null) {
                        break;
                    }
                    vn0Var2 = xn0Var;
                } else {
                    qdVar.addFirst(vn0Var2);
                    break;
                }
            } else {
                if (xn0Var != null) {
                    qdVar.addFirst(vn0Var2);
                } else {
                    qdVar.addFirst(vn0Var2);
                }
                if (!y90.e(xn0Var, vn0Var)) {
                    break;
                }
                vn0Var2 = xn0Var;
            }
        }
        List listW0 = tm.w0(qdVar);
        ArrayList arrayList = new ArrayList(vm.c0(listW0, 10));
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((vn0) it.next()).d.a));
        }
        return tm.v0(arrayList);
    }

    public final ym0 c(int i) {
        x51 x51Var = this.g;
        ym0 ym0Var = x51Var.f() == 0 ? null : (ym0) x51Var.c(i);
        if (ym0Var != null) {
            return ym0Var;
        }
        xn0 xn0Var = this.e;
        if (xn0Var != null) {
            return xn0Var.c(i);
        }
        return null;
    }

    public final Map d() {
        return mj0.R((LinkedHashMap) this.d.e);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x0307  */
    /* JADX WARN: Code duplicated, block: B:132:0x0315  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a A[EDGE_INSN: B:137:0x032a->B:150:0x0364 BREAK  A[LOOP:3: B:130:0x030f->B:203:?]] */
    /* JADX WARN: Code duplicated, block: B:139:0x032d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0333 A[EDGE_INSN: B:141:0x0333->B:150:0x0364 BREAK  A[LOOP:3: B:130:0x030f->B:203:?]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0338 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x033a A[EDGE_INSN: B:143:0x033a->B:150:0x0364 BREAK  A[LOOP:3: B:130:0x030f->B:203:?]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0343  */
    /* JADX WARN: Code duplicated, block: B:147:0x0353  */
    /* JADX WARN: Code duplicated, block: B:152:0x037a  */
    /* JADX WARN: Code duplicated, block: B:153:0x037c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0383  */
    /* JADX WARN: Code duplicated, block: B:158:0x038a  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x038d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:17:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x040a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0411 A[PHI: r18 r19 r20
  0x0411: PHI (r18v2 java.util.ArrayList) = (r18v3 java.util.ArrayList), (r18v5 java.util.ArrayList), (r18v5 java.util.ArrayList) binds: [B:164:0x0393, B:183:0x03fb, B:177:0x03de] A[DONT_GENERATE, DONT_INLINE]
  0x0411: PHI (r19v2 int) = (r19v3 int), (r19v5 int), (r19v5 int) binds: [B:164:0x0393, B:183:0x03fb, B:177:0x03de] A[DONT_GENERATE, DONT_INLINE]
  0x0411: PHI (r20v2 int) = (r20v3 int), (r20v5 int), (r20v5 int) binds: [B:164:0x0393, B:183:0x03fb, B:177:0x03de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:194:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:202:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[LOOP:3: B:130:0x030f->B:203:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0360 A[EDGE_INSN: B:205:0x0360->B:149:0x0360 BREAK  A[LOOP:4: B:145:0x034d->B:206:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[LOOP:4: B:145:0x034d->B:206:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Throwable, un0] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    public un0 e(y6 y6Var) {
        boolean zMatches;
        ArrayList arrayList;
        int i;
        int i2;
        boolean zEquals;
        boolean zMatches2;
        g81 g81Var;
        ?? r24;
        int size;
        boolean z;
        int i3;
        un0 un0Var;
        final Bundle bundleG;
        final int i4;
        px0 px0Var;
        y6 y6VarA;
        List listJ;
        List listA0;
        int iNextIndex;
        String str;
        String str2;
        Matcher matcher;
        ArrayList arrayList2;
        int iEnd;
        List listJ2;
        String str3;
        String str4;
        ListIterator listIterator;
        ArrayList arrayList3;
        Iterator it;
        int i5;
        px0 px0Var2;
        ?? r6;
        y6 y6VarA2;
        y6 y6VarA3;
        ?? r11;
        String strDecode;
        m7 m7Var = this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) m7Var.e;
        String str5 = (String) y6Var.f;
        String str6 = (String) y6Var.e;
        Uri uri = (Uri) y6Var.d;
        ArrayList arrayList4 = (ArrayList) m7Var.c;
        ?? r8 = 0;
        if (arrayList4.isEmpty()) {
            return null;
        }
        int size2 = arrayList4.size();
        un0 un0Var2 = null;
        int i6 = 0;
        while (i6 < size2) {
            Object obj = arrayList4.get(i6);
            int i7 = i6 + 1;
            sn0 sn0Var = (sn0) obj;
            sn0Var.getClass();
            g81 g81Var2 = sn0Var.o;
            g81 g81Var3 = sn0Var.f;
            String str7 = sn0Var.c;
            ?? r30 = r8;
            String str8 = sn0Var.b;
            if (((px0) g81Var3.getValue()) == null) {
                zMatches = true;
            } else {
                if (uri == null) {
                    zMatches = false;
                } else {
                    px0 px0Var3 = (px0) g81Var3.getValue();
                    px0Var3.getClass();
                    String string = uri.toString();
                    string.getClass();
                    zMatches = px0Var3.c.matcher(string).matches();
                }
                if (zMatches) {
                    if (str8 == null) {
                        zEquals = true;
                    } else if (str6 == null) {
                        zEquals = false;
                    } else {
                        zEquals = str8.equals(str6);
                    }
                    if (zEquals) {
                        if (str7 == null) {
                            zMatches2 = true;
                        } else if (str5 == null) {
                            zMatches2 = false;
                        } else {
                            px0 px0Var4 = (px0) g81Var2.getValue();
                            px0Var4.getClass();
                            zMatches2 = px0Var4.c.matcher(str5).matches();
                        }
                        if (zMatches2) {
                            if (uri != null) {
                                uri.getClass();
                                linkedHashMap.getClass();
                                px0Var2 = (px0) sn0Var.f.getValue();
                                if (px0Var2 != null || (y6VarA2 = px0Var2.a(uri.toString())) == null) {
                                    arrayList = arrayList4;
                                } else {
                                    arrayList = arrayList4;
                                    final Bundle bundleG2 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                                    if (sn0Var.c(y6VarA2, bundleG2, linkedHashMap) && (!((Boolean) sn0Var.g.getValue()).booleanValue() || sn0Var.d(uri, bundleG2, linkedHashMap))) {
                                        String fragment = uri.getFragment();
                                        px0 px0Var5 = (px0) sn0Var.m.getValue();
                                        if (px0Var5 == null || (y6VarA3 = px0Var5.a(String.valueOf(fragment))) == null) {
                                            i = size2;
                                            i2 = i7;
                                            g81Var = g81Var2;
                                        } else {
                                            List list = (List) sn0Var.k.getValue();
                                            i = size2;
                                            i2 = i7;
                                            g81Var = g81Var2;
                                            ArrayList arrayList5 = new ArrayList(vm.c0(list, 10));
                                            Iterator it2 = list.iterator();
                                            int i8 = 0;
                                            while (it2.hasNext()) {
                                                Object next = it2.next();
                                                Iterator it3 = it2;
                                                int i9 = i8 + 1;
                                                if (i8 < 0) {
                                                    um.b0();
                                                    throw r30;
                                                }
                                                String str9 = (String) next;
                                                nj0 nj0VarB = ((oj0) y6VarA3.f).b(i9);
                                                if (nj0VarB != null) {
                                                    strDecode = Uri.decode(nj0VarB.a);
                                                    strDecode.getClass();
                                                } else {
                                                    r11 = r30;
                                                }
                                                if (r11 == 0) {
                                                    r11 = strDecode;
                                                    r11 = "";
                                                }
                                                r11 = strDecode;
                                                y6 y6Var2 = y6VarA3;
                                                try {
                                                    sn0.e(bundleG2, str9, r11, (zm0) linkedHashMap.get(str9));
                                                    arrayList5.add(uc1.a);
                                                    i8 = i9;
                                                    it2 = it3;
                                                    y6VarA3 = y6Var2;
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }
                                        }
                                        final int i10 = 0;
                                        boolean zIsEmpty = bu0.v(linkedHashMap, new z50() { // from class: qn0
                                            @Override // defpackage.z50
                                            public final Object h(Object obj2) {
                                                boolean zContainsKey;
                                                int i11 = i10;
                                                Bundle bundle = bundleG2;
                                                String str10 = (String) obj2;
                                                switch (i11) {
                                                    case 0:
                                                        str10.getClass();
                                                        zContainsKey = bundle.containsKey(str10);
                                                        break;
                                                    default:
                                                        str10.getClass();
                                                        zContainsKey = bundle.containsKey(str10);
                                                        break;
                                                }
                                                return Boolean.valueOf(!zContainsKey);
                                            }
                                        }).isEmpty();
                                        r6 = bundleG2;
                                        if (!zIsEmpty) {
                                        }
                                        r24 = r6;
                                    }
                                    r6 = r30;
                                    r24 = r6;
                                }
                                i = size2;
                                i2 = i7;
                                g81Var = g81Var2;
                                r6 = r30;
                                r24 = r6;
                            } else {
                                arrayList = arrayList4;
                                i = size2;
                                i2 = i7;
                                g81Var = g81Var2;
                                r24 = r30;
                            }
                            String str10 = sn0Var.a;
                            if (uri != null || str10 == null) {
                                size = 0;
                            } else {
                                List<String> pathSegments = uri.getPathSegments();
                                Uri uri2 = Uri.parse(str10);
                                uri2.getClass();
                                List<String> pathSegments2 = uri2.getPathSegments();
                                pathSegments.getClass();
                                pathSegments2.getClass();
                                LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
                                linkedHashSet.retainAll(pathSegments2);
                                size = linkedHashSet.size();
                            }
                            if (str6 == null && str6.equals(str8)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (str5 != null || str7 == null) {
                                i3 = -1;
                            } else {
                                px0 px0Var6 = (px0) g81Var.getValue();
                                px0Var6.getClass();
                                if (px0Var6.c.matcher(str5).matches()) {
                                    Pattern patternCompile = Pattern.compile("/");
                                    patternCompile.getClass();
                                    Matcher matcher2 = patternCompile.matcher(str7);
                                    if (matcher2.find()) {
                                        ArrayList arrayList6 = new ArrayList(10);
                                        int iEnd2 = 0;
                                        do {
                                            arrayList6.add(str7.subSequence(iEnd2, matcher2.start()).toString());
                                            iEnd2 = matcher2.end();
                                        } while (matcher2.find());
                                        arrayList6.add(str7.subSequence(iEnd2, str7.length()).toString());
                                        listJ = arrayList6;
                                    } else {
                                        listJ = y90.J(str7.toString());
                                    }
                                    boolean zIsEmpty2 = listJ.isEmpty();
                                    List listA1 = mx.c;
                                    if (zIsEmpty2) {
                                        listA0 = listA1;
                                        str = (String) listA0.get(0);
                                        str2 = (String) listA0.get(1);
                                        Pattern patternCompile2 = Pattern.compile("/");
                                        patternCompile2.getClass();
                                        matcher = patternCompile2.matcher(str5);
                                        if (matcher.find()) {
                                            arrayList2 = new ArrayList(10);
                                            iEnd = 0;
                                            do {
                                                arrayList2.add(str5.subSequence(iEnd, matcher.start()).toString());
                                                iEnd = matcher.end();
                                            } while (matcher.find());
                                            arrayList2.add(str5.subSequence(iEnd, str5.length()).toString());
                                            listJ2 = arrayList2;
                                        } else {
                                            listJ2 = y90.J(str5.toString());
                                        }
                                        if (!listJ2.isEmpty()) {
                                            listIterator = listJ2.listIterator(listJ2.size());
                                            while (listIterator.hasPrevious()) {
                                                if (((String) listIterator.previous()).length() == 0) {
                                                    iNextIndex = listIterator.nextIndex() + 1;
                                                    if (iNextIndex >= 0) {
                                                        if (iNextIndex != 0) {
                                                            break;
                                                        }
                                                        if (iNextIndex >= listJ2.size()) {
                                                            if (iNextIndex == 1) {
                                                                arrayList3 = new ArrayList(iNextIndex);
                                                                it = listJ2.iterator();
                                                                i5 = 0;
                                                                while (it.hasNext()) {
                                                                    arrayList3.add(it.next());
                                                                    i5++;
                                                                    if (i5 == iNextIndex) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                listA1 = um.a0(arrayList3);
                                                                break;
                                                            }
                                                            listA1 = y90.J(tm.i0(listJ2));
                                                            break;
                                                        }
                                                        listA1 = tm.w0(listJ2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        List list2 = listA1;
                                        str3 = (String) list2.get(0);
                                        str4 = (String) list2.get(1);
                                        if (y90.e(str, str3)) {
                                            i3 = 2;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (y90.e(str2, str4)) {
                                            i3++;
                                        }
                                    } else {
                                        ListIterator listIterator2 = listJ.listIterator(listJ.size());
                                        while (true) {
                                            if (listIterator2.hasPrevious()) {
                                                if (((String) listIterator2.previous()).length() != 0) {
                                                    iNextIndex = listIterator2.nextIndex() + 1;
                                                    if (iNextIndex >= 0) {
                                                        if (iNextIndex != 0) {
                                                            if (iNextIndex < listJ.size()) {
                                                                if (iNextIndex != 1) {
                                                                    ArrayList arrayList7 = new ArrayList(iNextIndex);
                                                                    Iterator it4 = listJ.iterator();
                                                                    int i11 = 0;
                                                                    while (it4.hasNext()) {
                                                                        arrayList7.add(it4.next());
                                                                        i11++;
                                                                        if (i11 == iNextIndex) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    listA0 = um.a0(arrayList7);
                                                                    break;
                                                                }
                                                                listA0 = y90.J(tm.i0(listJ));
                                                                break;
                                                            }
                                                            listA0 = tm.w0(listJ);
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                            listA0 = listA1;
                                            break;
                                        }
                                        str = (String) listA0.get(0);
                                        str2 = (String) listA0.get(1);
                                        Pattern patternCompile3 = Pattern.compile("/");
                                        patternCompile3.getClass();
                                        matcher = patternCompile3.matcher(str5);
                                        if (matcher.find()) {
                                            listJ2 = y90.J(str5.toString());
                                        } else {
                                            arrayList2 = new ArrayList(10);
                                            iEnd = 0;
                                            do {
                                                arrayList2.add(str5.subSequence(iEnd, matcher.start()).toString());
                                                iEnd = matcher.end();
                                            } while (matcher.find());
                                            arrayList2.add(str5.subSequence(iEnd, str5.length()).toString());
                                            listJ2 = arrayList2;
                                        }
                                        if (!listJ2.isEmpty()) {
                                            listIterator = listJ2.listIterator(listJ2.size());
                                            while (listIterator.hasPrevious()) {
                                                if (((String) listIterator.previous()).length() == 0) {
                                                    iNextIndex = listIterator.nextIndex() + 1;
                                                    if (iNextIndex >= 0) {
                                                        if (iNextIndex != 0) {
                                                            break;
                                                        }
                                                        if (iNextIndex >= listJ2.size()) {
                                                            if (iNextIndex == 1) {
                                                                arrayList3 = new ArrayList(iNextIndex);
                                                                it = listJ2.iterator();
                                                                i5 = 0;
                                                                while (it.hasNext()) {
                                                                    arrayList3.add(it.next());
                                                                    i5++;
                                                                    if (i5 == iNextIndex) {
                                                                        break;
                                                                    }
                                                                }
                                                                listA1 = um.a0(arrayList3);
                                                                break;
                                                            }
                                                            listA1 = y90.J(tm.i0(listJ2));
                                                            break;
                                                        }
                                                        listA1 = tm.w0(listJ2);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        List list3 = listA1;
                                        str3 = (String) list3.get(0);
                                        str4 = (String) list3.get(1);
                                        if (y90.e(str, str3)) {
                                            i3 = 2;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (y90.e(str2, str4)) {
                                            i3++;
                                        }
                                    }
                                    nh0.e(q51.k(iNextIndex, "Requested element count ", " is less than zero."));
                                    return r30;
                                }
                                i3 = -1;
                            }
                            if (r24 != 0) {
                                if (!z || i3 > -1) {
                                    linkedHashMap.getClass();
                                    bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                                    if (uri != null && (px0Var = (px0) g81Var3.getValue()) != null && (y6VarA = px0Var.a(uri.toString())) != null) {
                                        sn0Var.c(y6VarA, bundleG, linkedHashMap);
                                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                                            sn0Var.d(uri, bundleG, linkedHashMap);
                                        }
                                    }
                                    i4 = 1;
                                    if (bu0.v(linkedHashMap, new z50() { // from class: qn0
                                        @Override // defpackage.z50
                                        public final Object h(Object obj2) {
                                            boolean zContainsKey;
                                            int i12 = i4;
                                            Bundle bundle = bundleG;
                                            String str11 = (String) obj2;
                                            switch (i12) {
                                                case 0:
                                                    str11.getClass();
                                                    zContainsKey = bundle.containsKey(str11);
                                                    break;
                                                default:
                                                    str11.getClass();
                                                    zContainsKey = bundle.containsKey(str11);
                                                    break;
                                            }
                                            return Boolean.valueOf(!zContainsKey);
                                        }
                                    }).isEmpty()) {
                                    }
                                }
                            }
                            un0Var = new un0((vn0) m7Var.b, r24, sn0Var.p, size, z, i3);
                            if (un0Var2 != null || un0Var.compareTo(un0Var2) > 0) {
                                un0Var2 = un0Var;
                            }
                        } else {
                            arrayList = arrayList4;
                            i = size2;
                            i2 = i7;
                        }
                    } else {
                        arrayList = arrayList4;
                        i = size2;
                        i2 = i7;
                    }
                } else {
                    arrayList = arrayList4;
                    i = size2;
                    i2 = i7;
                }
                arrayList4 = arrayList;
                size2 = i;
                i6 = i2;
                r8 = r30;
            }
            if (zMatches) {
                arrayList = arrayList4;
                i = size2;
                i2 = i7;
            } else {
                if (str8 == null) {
                    zEquals = true;
                } else if (str6 == null) {
                    zEquals = false;
                } else {
                    zEquals = str8.equals(str6);
                }
                if (zEquals) {
                    arrayList = arrayList4;
                    i = size2;
                    i2 = i7;
                } else {
                    if (str7 == null) {
                        zMatches2 = true;
                    } else if (str5 == null) {
                        zMatches2 = false;
                    } else {
                        px0 px0Var7 = (px0) g81Var2.getValue();
                        px0Var7.getClass();
                        zMatches2 = px0Var7.c.matcher(str5).matches();
                    }
                    if (zMatches2) {
                        if (uri != null) {
                            uri.getClass();
                            linkedHashMap.getClass();
                            px0Var2 = (px0) sn0Var.f.getValue();
                            if (px0Var2 != null) {
                                arrayList = arrayList4;
                                i = size2;
                                i2 = i7;
                                g81Var = g81Var2;
                                r6 = r30;
                            } else {
                                arrayList = arrayList4;
                                i = size2;
                                i2 = i7;
                                g81Var = g81Var2;
                                r6 = r30;
                            }
                            r24 = r6;
                        } else {
                            arrayList = arrayList4;
                            i = size2;
                            i2 = i7;
                            g81Var = g81Var2;
                            r24 = r30;
                        }
                        String str11 = sn0Var.a;
                        if (uri != null) {
                            size = 0;
                        } else {
                            size = 0;
                        }
                        if (str6 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (str5 != null) {
                            i3 = -1;
                        } else {
                            i3 = -1;
                        }
                        if (r24 != 0) {
                            if (!z) {
                            }
                            linkedHashMap.getClass();
                            bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                            if (uri != null) {
                                sn0Var.c(y6VarA, bundleG, linkedHashMap);
                                if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                                    sn0Var.d(uri, bundleG, linkedHashMap);
                                }
                            }
                            i4 = 1;
                            if (bu0.v(linkedHashMap, new z50() { // from class: qn0
                                @Override // defpackage.z50
                                public final Object h(Object obj2) {
                                    boolean zContainsKey;
                                    int i12 = i4;
                                    Bundle bundle = bundleG;
                                    String str12 = (String) obj2;
                                    switch (i12) {
                                        case 0:
                                            str12.getClass();
                                            zContainsKey = bundle.containsKey(str12);
                                            break;
                                        default:
                                            str12.getClass();
                                            zContainsKey = bundle.containsKey(str12);
                                            break;
                                    }
                                    return Boolean.valueOf(!zContainsKey);
                                }
                            }).isEmpty()) {
                            }
                        }
                        un0Var = new un0((vn0) m7Var.b, r24, sn0Var.p, size, z, i3);
                        if (un0Var2 != null) {
                        }
                        un0Var2 = un0Var;
                    } else {
                        arrayList = arrayList4;
                        i = size2;
                        i2 = i7;
                    }
                }
            }
            arrayList4 = arrayList;
            size2 = i;
            i6 = i2;
            r8 = r30;
        }
        return un0Var2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof vn0)) {
                m7 m7Var = this.d;
                ArrayList arrayList = (ArrayList) m7Var.c;
                vn0 vn0Var = (vn0) obj;
                x51 x51Var = vn0Var.g;
                m7 m7Var2 = vn0Var.d;
                boolean zE = y90.e(arrayList, (ArrayList) m7Var2.c);
                x51 x51Var2 = this.g;
                if (x51Var2.f() != x51Var.f()) {
                    z = false;
                    break;
                }
                Iterator it = ((mp) h11.b0(new y51(x51Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!y90.e(x51Var2.c(iIntValue), x51Var.c(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (d().size() != vn0Var.d().size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = d().entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!vn0Var.d().containsKey(entry.getKey()) || !y90.e(vn0Var.d().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (m7Var.a != m7Var2.a || !y90.e((String) m7Var.f, (String) m7Var2.f) || !zE || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public void f(Context context, AttributeSet attributeSet) {
        String strValueOf;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, wv0.e);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(2);
        int i = 1;
        m7 m7Var = this.d;
        if (string == null) {
            m7Var.a = 0;
            m7Var.d = null;
        } else {
            m7Var.getClass();
            if (p71.P(string)) {
                id.q("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            ArrayList arrayListV = bu0.v((LinkedHashMap) m7Var.e, new wn0(new sn0(strConcat, null, null), i));
            if (!arrayListV.isEmpty()) {
                StringBuilder sbN = q51.n("Cannot set route \"", string, "\" for destination ");
                sbN.append((vn0) m7Var.b);
                sbN.append(". Following required arguments are missing: ");
                sbN.append(arrayListV);
                throw new IllegalArgumentException(sbN.toString().toString());
            }
            m7Var.a = strConcat.hashCode();
            m7Var.d = null;
        }
        m7Var.f = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            m7Var.a = resourceId;
            m7Var.d = null;
            if (resourceId <= 16777215) {
                strValueOf = String.valueOf(resourceId);
            } else {
                try {
                    strValueOf = context.getResources().getResourceName(resourceId);
                    strValueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    strValueOf = String.valueOf(resourceId);
                }
            }
            m7Var.d = strValueOf;
        }
        this.f = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public int hashCode() {
        m7 m7Var = this.d;
        int i = m7Var.a * 31;
        String str = (String) m7Var.f;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) m7Var.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sn0 sn0Var = (sn0) obj;
            int i3 = iHashCode * 31;
            String str2 = sn0Var.a;
            int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = sn0Var.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = sn0Var.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        x51 x51Var = this.g;
        x51Var.getClass();
        int i4 = 0;
        while (true) {
            if (!(i4 < x51Var.f())) {
                break;
            }
            int i5 = i4 + 1;
            ym0 ym0Var = (ym0) x51Var.g(i4);
            int i6 = ((iHashCode * 31) + ym0Var.a) * 31;
            eo0 eo0Var = ym0Var.b;
            iHashCode = i6 + (eo0Var != null ? eo0Var.hashCode() : 0);
            Bundle bundle = ym0Var.c;
            if (bundle != null) {
                iHashCode = r71.m(bundle) + (iHashCode * 31);
            }
            i4 = i5;
        }
        for (String str5 : d().keySet()) {
            int iHashCode4 = (str5.hashCode() + (iHashCode * 31)) * 31;
            Object obj2 = d().get(str5);
            iHashCode = (obj2 != null ? obj2.hashCode() : 0) + iHashCode4;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        m7 m7Var = this.d;
        String str = (String) m7Var.d;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(m7Var.a));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) m7Var.f;
        if (str2 != null && !p71.P(str2)) {
            sb.append(" route=");
            sb.append((String) m7Var.f);
        }
        if (this.f != null) {
            sb.append(" label=");
            sb.append(this.f);
        }
        return sb.toString();
    }
}
