package defpackage;

import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class ed1 {
    public static final String[] a = {"SHA-512", "SHA-384", "SHA-256", "SHA-1"};
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap(8);
        b = map;
        map.put("MD5", "MD5");
        map.put("SHA", "SHA-1");
        map.put("SHA1", "SHA-1");
        map.put("SHA-1", "SHA-1");
        map.put("SHA-256", "SHA-256");
        map.put("SHA-384", "SHA-384");
        map.put("SHA-512", "SHA-512");
        HashMap map2 = new HashMap(5);
        c = map2;
        map2.put("MD5", 0);
        map2.put("SHA-1", 0);
        map2.put("SHA-256", 0);
        map2.put("SHA-384", 9);
        map2.put("SHA-512", 9);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[LOOP:1: B:26:0x0078->B:34:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[EDGE_INSN: B:44:0x00cc->B:45:0x00d4 BREAK  A[LOOP:1: B:26:0x0078->B:34:0x00a3]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:2: B:36:0x00ae->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x008e, please report this as an issue */
    public static ArrayList a(ej0 ej0Var, String str, int i) {
        int i2;
        int i3;
        String str2;
        String strConcat;
        String strA;
        byte[] bArrDecode;
        int size;
        byte[] bArr;
        ad1 ad1Var;
        ArrayList arrayList = new ArrayList(1);
        if (i < 18) {
            String strA2 = ej0Var.a("Digest-Algorithms");
            if (strA2 == null) {
                strA2 = "SHA SHA1";
            }
            StringTokenizer stringTokenizer = new StringTokenizer(strA2);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                String strA3 = ej0Var.a(strNextToken + str);
                if (strA3 != null) {
                    Locale locale = Locale.US;
                    String str3 = (String) b.get(strNextToken.toUpperCase(locale));
                    if (str3 != null) {
                        Integer num = (Integer) c.get(str3.toUpperCase(locale));
                        if ((num != null ? num.intValue() : Integer.MAX_VALUE) <= i) {
                            arrayList.add(new ad1(str3, Base64.decode(strA3, 2)));
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                i2 = 0;
                for (i3 = 0; i3 < 4; i3++) {
                    str2 = a[i3];
                    if ("SHA-1".equalsIgnoreCase(str2)) {
                        strConcat = "SHA1".concat(str);
                    } else {
                        strConcat = str2 + str;
                    }
                    strA = ej0Var.a(strConcat);
                    if (strA == null) {
                        bArrDecode = Base64.decode(strA, 2);
                        size = arrayList.size();
                        while (true) {
                            if (i2 < size) {
                                bArr = null;
                                break;
                            }
                            Object obj = arrayList.get(i2);
                            i2++;
                            ad1Var = (ad1) obj;
                            if (ad1Var.a.equalsIgnoreCase(str2)) {
                                bArr = ad1Var.b;
                                break;
                            }
                        }
                        if (bArr != null) {
                            arrayList.add(new ad1(str2, bArrDecode));
                            break;
                        }
                        arrayList.add(new ad1(str2, bArrDecode));
                        break;
                    }
                }
            }
        } else {
            i2 = 0;
            while (i3 < 4) {
                str2 = a[i3];
                if ("SHA-1".equalsIgnoreCase(str2)) {
                    strConcat = "SHA1".concat(str);
                } else {
                    strConcat = str2 + str;
                }
                strA = ej0Var.a(strConcat);
                if (strA == null) {
                    bArrDecode = Base64.decode(strA, 2);
                    size = arrayList.size();
                    while (true) {
                        if (i2 < size) {
                            bArr = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        ad1Var = (ad1) obj2;
                        if (ad1Var.a.equalsIgnoreCase(str2)) {
                            bArr = ad1Var.b;
                            break;
                        }
                    }
                    if (bArr != null && Arrays.equals(bArr, bArrDecode)) {
                        break;
                    }
                    arrayList.add(new ad1(str2, bArrDecode));
                    break;
                }
            }
        }
        return arrayList;
    }

    public static List b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((dd1) obj).a);
        }
        return arrayList2;
    }

    public static ArrayList c(vy vyVar, z9 z9Var) {
        long j = z9Var.b;
        if (j > 2147483647L) {
            throw new i9("ZIP Central Directory too large: " + j);
        }
        long j2 = z9Var.a;
        ByteBuffer byteBufferA = vyVar.a((int) j, j2);
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        int i = z9Var.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int iPosition = byteBufferA.position();
            try {
                tj tjVarB = tj.b(byteBufferA);
                if (!tjVarB.g.endsWith("/")) {
                    arrayList.add(tjVarB);
                }
            } catch (sh1 e) {
                throw new i9("Malformed ZIP Central Directory record #" + (i2 + 1) + " at file offset " + (j2 + ((long) iPosition)), e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0372  */
    /* JADX WARN: Code duplicated, block: B:134:0x0389  */
    /* JADX WARN: Code duplicated, block: B:135:0x038b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0397  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x0403  */
    /* JADX WARN: Code duplicated, block: B:149:0x0410  */
    /* JADX WARN: Code duplicated, block: B:151:0x0417  */
    /* JADX WARN: Code duplicated, block: B:153:0x043c  */
    /* JADX WARN: Code duplicated, block: B:158:0x046c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0477 A[LOOP:8: B:159:0x0471->B:161:0x0477, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x048c  */
    /* JADX WARN: Code duplicated, block: B:167:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:174:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:176:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:179:0x0509  */
    /* JADX WARN: Code duplicated, block: B:180:0x0516  */
    /* JADX WARN: Code duplicated, block: B:182:0x051e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0535  */
    /* JADX WARN: Code duplicated, block: B:191:0x0544  */
    /* JADX WARN: Code duplicated, block: B:193:0x0569  */
    /* JADX WARN: Code duplicated, block: B:194:0x0593  */
    /* JADX WARN: Code duplicated, block: B:372:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x047b A[EDGE_INSN: B:373:0x047b->B:162:0x047b BREAK  A[LOOP:8: B:159:0x0471->B:161:0x0477], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x05aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x03fa A[SYNTHETIC] */
    public static cd1 d(vy vyVar, z9 z9Var, Map map, HashSet hashSet, int i) {
        String str;
        String str2;
        ea eaVar;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Set<dd1> hashSet2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        boolean z;
        int i3;
        HashMap map2;
        ArrayList arrayList5;
        long j;
        ArrayList arrayList6;
        boolean z2;
        String str4;
        ArrayList arrayListA;
        int size;
        int i4;
        boolean z3;
        String str5;
        byte[] bArrDigest;
        byte[] bArr;
        ArrayList arrayList7;
        ej0 ej0VarD;
        HashSet hashSet3;
        int size2;
        int i5;
        int i6;
        ej0 ej0Var;
        int i7;
        int i8;
        String str6;
        ej0 ej0Var2;
        ArrayList arrayList8;
        ea eaVar2;
        String str7;
        ArrayList arrayListA2;
        int i9;
        int i10;
        int i11;
        int i12;
        int size3;
        int i13;
        String str8;
        byte[] bArrDigest2;
        byte[] bArr2;
        int i14;
        ArrayList arrayListA3;
        int size4;
        int i15;
        String str9;
        byte[] bArrDigest3;
        byte[] bArr3;
        ArrayList arrayList9;
        if (i > Integer.MAX_VALUE) {
            id.q(q51.k(i, "minSdkVersion (", ") > maxSdkVersion (2147483647)"));
            return null;
        }
        cd1 cd1Var = new cd1();
        ArrayList arrayListC = c(vyVar, z9Var);
        HashSet hashSet4 = new HashSet(arrayListC.size());
        int size5 = arrayListC.size();
        HashSet hashSet5 = null;
        int i16 = 0;
        while (i16 < size5) {
            Object obj = arrayListC.get(i16);
            i16++;
            String str10 = ((tj) obj).g;
            if (!hashSet4.add(str10)) {
                if (hashSet5 == null) {
                    hashSet5 = new HashSet();
                }
                if (hashSet5.add(str10)) {
                    cd1.b(cd1Var, ea.g, new Object[]{str10});
                }
            }
        }
        if (!cd1.a(cd1Var)) {
            long j2 = z9Var.a;
            HashMap map3 = new HashMap(1);
            ArrayList arrayList10 = new ArrayList(1);
            int size6 = arrayListC.size();
            tj tjVar = null;
            int i17 = 0;
            String str11 = null;
            while (true) {
                str = ".SF";
                str2 = "META-INF/";
                if (i17 >= size6) {
                    break;
                }
                size6 = size6;
                tj tjVar2 = (tj) arrayListC.get(i17);
                i17++;
                String str12 = tjVar2.g;
                if (str12.startsWith("META-INF/")) {
                    if (tjVar == null && "META-INF/MANIFEST.MF".equals(str12)) {
                        tjVar = tjVar2;
                    } else if (str12.endsWith(".SF")) {
                        map3.put(str12, tjVar2);
                    } else if (str12.endsWith(".RSA") || str12.endsWith(".DSA") || str12.endsWith(".EC")) {
                        arrayList10.add(tjVar2);
                    }
                }
            }
            if (tjVar == null) {
                cd1.b(cd1Var, ea.k, new Object[0]);
                return cd1Var;
            }
            try {
                byte[] bArrA = bh0.a(vyVar, tjVar, j2);
                fj0 fj0Var = new fj0(bArrA);
                ej0 ej0VarD2 = fj0Var.d();
                ArrayList arrayList11 = new ArrayList();
                tj tjVar3 = tjVar;
                while (true) {
                    ej0 ej0VarD3 = fj0Var.d();
                    if (ej0VarD3 == null) {
                        break;
                    }
                    arrayList11.add(ej0VarD3);
                }
                String str13 = "Malformed ZIP entry: ";
                HashMap map4 = new HashMap(arrayList11.size());
                int size7 = arrayList11.size();
                int i18 = 0;
                int i19 = 0;
                while (i18 < size7) {
                    Object obj2 = arrayList11.get(i18);
                    int i20 = i18 + 1;
                    ej0 ej0Var3 = (ej0) obj2;
                    i19++;
                    int i21 = size7;
                    String str14 = ej0Var3.c;
                    if (str14 == null) {
                        cd1.b(cd1Var, ea.i, new Object[]{Integer.valueOf(i19)});
                        arrayList9 = arrayList11;
                    } else {
                        arrayList9 = arrayList11;
                        if (map4.put(str14, ej0Var3) != null) {
                            cd1.b(cd1Var, ea.h, new Object[]{str14});
                        } else if (!hashSet4.contains(str14)) {
                            cd1.b(cd1Var, ea.l, new Object[]{str14});
                        }
                    }
                    size7 = i21;
                    i18 = i20;
                    arrayList11 = arrayList9;
                }
                if (!cd1.a(cd1Var)) {
                    ArrayList arrayList12 = new ArrayList(arrayList10.size());
                    int size8 = arrayList10.size();
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList13 = cd1Var.d;
                        long j3 = j2;
                        if (i22 < size8) {
                            Object obj3 = arrayList10.get(i22);
                            int i23 = i22 + 1;
                            tj tjVar4 = (tj) obj3;
                            String str15 = tjVar4.g;
                            int i24 = size8;
                            int iLastIndexOf = str15.lastIndexOf(46);
                            if (iLastIndexOf == -1) {
                                throw new RuntimeException("Signature block file name does not contain extension: ".concat(str15));
                            }
                            String strConcat = str15.substring(0, iLastIndexOf).concat(str);
                            tj tjVar5 = (tj) map3.get(strConcat);
                            if (tjVar5 == null) {
                                arrayList13.add(new fa(ea.v, new Object[]{str15, strConcat}));
                            } else {
                                String strSubstring = str15.substring(9);
                                arrayList12.add(new dd1(strSubstring, tjVar4, tjVar5, new bd1(strSubstring, str15, tjVar5.g)));
                            }
                            j2 = j3;
                            size8 = i24;
                            i22 = i23;
                            str = str;
                        } else {
                            boolean zIsEmpty = arrayList12.isEmpty();
                            ea eaVar3 = ea.d;
                            if (zIsEmpty) {
                                cd1.b(cd1Var, eaVar3, new Object[0]);
                                return cd1Var;
                            }
                            if (arrayList12.size() > 10) {
                                cd1.b(cd1Var, ea.e, new Object[]{10, Integer.valueOf(arrayList12.size())});
                                return cd1Var;
                            }
                            int size9 = arrayList12.size();
                            int i25 = 0;
                            while (true) {
                                ArrayList arrayList14 = cd1Var.b;
                                if (i25 < size9) {
                                    ArrayList arrayList15 = arrayList12;
                                    ea eaVar4 = eaVar3;
                                    cd1 cd1Var2 = cd1Var;
                                    ArrayList arrayList16 = arrayListC;
                                    String str16 = str2;
                                    HashMap map5 = map4;
                                    String str17 = str13;
                                    tj tjVar6 = tjVar3;
                                    long j4 = j3;
                                    int i26 = i25 + 1;
                                    dd1 dd1Var = (dd1) arrayList15.get(i25);
                                    tj tjVar7 = dd1Var.c;
                                    bd1 bd1Var = dd1Var.b;
                                    int i27 = size9;
                                    tj tjVar8 = dd1Var.d;
                                    String str18 = tjVar8.g;
                                    try {
                                        byte[] bArrA2 = bh0.a(vyVar, tjVar8, j4);
                                        try {
                                            dd1Var.f = bh0.a(vyVar, tjVar7, j4);
                                            try {
                                                if (d6.w(ByteBuffer.wrap(bArrA2), hq.class) == null) {
                                                    throw null;
                                                }
                                                throw new ClassCastException();
                                            } catch (fe e) {
                                                e.printStackTrace();
                                                bd1.a(bd1Var, ea.w, new Object[]{str18, e});
                                                if (!bd1Var.d.isEmpty()) {
                                                    arrayList14.add(bd1Var);
                                                }
                                                j3 = j4;
                                                arrayList12 = arrayList15;
                                                size9 = i27;
                                                i25 = i26;
                                                map4 = map5;
                                                arrayListC = arrayList16;
                                                eaVar3 = eaVar4;
                                                cd1Var = cd1Var2;
                                                str13 = str17;
                                                tjVar3 = tjVar6;
                                                str2 = str16;
                                            }
                                        } catch (sh1 e2) {
                                            throw new i9(str17.concat(tjVar7.g), e2);
                                        }
                                    } catch (sh1 e3) {
                                        throw new i9(str17.concat(str18), e3);
                                    }
                                } else if (!cd1.a(cd1Var)) {
                                    ArrayList arrayList17 = new ArrayList(arrayList12.size());
                                    int size10 = arrayList12.size();
                                    int i28 = 0;
                                    while (true) {
                                        eaVar = ea.q;
                                        str3 = "-Digest";
                                        arrayList = arrayList13;
                                        arrayList2 = cd1Var.c;
                                        if (i28 >= size10) {
                                            break;
                                        }
                                        Object obj4 = arrayList12.get(i28);
                                        int i29 = i28 + 1;
                                        int i30 = size10;
                                        dd1 dd1Var2 = (dd1) obj4;
                                        String str19 = dd1Var2.c.g;
                                        bd1 bd1Var2 = dd1Var2.b;
                                        ArrayList arrayList18 = arrayList12;
                                        ArrayList arrayList19 = bd1Var2.d;
                                        String str20 = str2;
                                        fj0 fj0Var2 = new fj0(dd1Var2.f);
                                        ej0 ej0VarD4 = fj0Var2.d();
                                        Attributes.Name name = Attributes.Name.SIGNATURE_VERSION;
                                        ej0VarD4.getClass();
                                        if (ej0VarD4.a(name.toString()) != null) {
                                            String strA = ej0VarD4.a("X-Android-APK-Signed");
                                            if (strA != null) {
                                                arrayList6 = arrayListC;
                                                if (!map.isEmpty()) {
                                                    Set setKeySet = map.keySet();
                                                    HashSet hashSet6 = new HashSet(1);
                                                    StringTokenizer stringTokenizer = new StringTokenizer(strA, ",");
                                                    while (stringTokenizer.hasMoreTokens()) {
                                                        String strTrim = stringTokenizer.nextToken().trim();
                                                        if (!strTrim.isEmpty()) {
                                                            try {
                                                                int i31 = Integer.parseInt(strTrim);
                                                                if (setKeySet.contains(Integer.valueOf(i31))) {
                                                                    hashSet6.add(Integer.valueOf(i31));
                                                                } else {
                                                                    bd1.b(bd1Var2, ea.z, new Object[]{str19, Integer.valueOf(i31)});
                                                                }
                                                            } catch (Exception unused) {
                                                            }
                                                        }
                                                    }
                                                    for (Iterator it = hashSet6.iterator(); it.hasNext(); it = it) {
                                                        Integer num = (Integer) it.next();
                                                        num.getClass();
                                                        if (!hashSet.contains(num)) {
                                                            bd1.a(bd1Var2, ea.A, new Object[]{str19, num, (String) map.get(num)});
                                                        }
                                                    }
                                                }
                                                if (arrayList19.isEmpty()) {
                                                    String strA2 = ej0VarD4.a("Created-By");
                                                    z2 = strA2 == null && strA2.indexOf("signtool") != -1;
                                                    if (z2) {
                                                        str4 = "-Digest";
                                                    } else {
                                                        str4 = "-Digest-Manifest";
                                                    }
                                                    arrayListA = a(ej0VarD4, str4, i);
                                                    if (arrayListA.isEmpty()) {
                                                        bd1.b(bd1Var2, ea.t, new Object[]{str19});
                                                        z3 = false;
                                                    } else {
                                                        size = arrayListA.size();
                                                        i4 = 0;
                                                        z3 = true;
                                                        while (i4 < size) {
                                                            Object obj5 = arrayListA.get(i4);
                                                            int i32 = i4 + 1;
                                                            ad1 ad1Var = (ad1) obj5;
                                                            int i33 = size;
                                                            str5 = ad1Var.a;
                                                            bArrDigest = MessageDigest.getInstance(str5).digest(bArrA);
                                                            bArr = ad1Var.b;
                                                            if (!Arrays.equals(bArr, bArrDigest)) {
                                                                bd1.b(bd1Var2, eaVar, new Object[]{"META-INF/MANIFEST.MF", str5, str19, Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(bArr, 2)});
                                                                z3 = false;
                                                            }
                                                            size = i33;
                                                            i4 = i32;
                                                        }
                                                    }
                                                    if (z2 == 0) {
                                                        arrayListA3 = a(ej0VarD4, "-Digest-Manifest-Main-Attributes", i);
                                                        if (!arrayListA3.isEmpty()) {
                                                            size4 = arrayListA3.size();
                                                            i15 = 0;
                                                            while (i15 < size4) {
                                                                Object obj6 = arrayListA3.get(i15);
                                                                i15++;
                                                                ad1 ad1Var2 = (ad1) obj6;
                                                                str9 = ad1Var2.a;
                                                                int i34 = ej0VarD2.a;
                                                                ArrayList arrayList20 = arrayListA3;
                                                                int i35 = ej0VarD2.b;
                                                                int i36 = size4;
                                                                MessageDigest messageDigest = MessageDigest.getInstance(str9);
                                                                messageDigest.update(bArrA, i34, i35);
                                                                bArrDigest3 = messageDigest.digest();
                                                                bArr3 = ad1Var2.b;
                                                                if (!Arrays.equals(bArr3, bArrDigest3)) {
                                                                    bd1.a(bd1Var2, ea.r, new Object[]{str9, str19, Base64.encodeToString(bArrDigest3, 2), Base64.encodeToString(bArr3, 2)});
                                                                }
                                                                arrayListA3 = arrayList20;
                                                                size4 = i36;
                                                            }
                                                        }
                                                    }
                                                    if (arrayList19.isEmpty()) {
                                                        arrayList7 = new ArrayList();
                                                        while (true) {
                                                            ej0VarD = fj0Var2.d();
                                                            if (ej0VarD != null) {
                                                                break;
                                                            }
                                                            arrayList7.add(ej0VarD);
                                                        }
                                                        hashSet3 = new HashSet(arrayList7.size());
                                                        size2 = arrayList7.size();
                                                        i5 = 0;
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < size2) {
                                                                dd1Var2.g = hashSet3;
                                                                break;
                                                            }
                                                            Object obj7 = arrayList7.get(i6);
                                                            i6++;
                                                            ej0Var = (ej0) obj7;
                                                            i7 = size2;
                                                            i8 = i5 + 1;
                                                            str6 = ej0Var.c;
                                                            if (str6 == null) {
                                                                bd1.a(bd1Var2, ea.j, new Object[]{str19, Integer.valueOf(i8)});
                                                                dd1Var2.e = true;
                                                                break;
                                                            }
                                                            if (!hashSet3.add(str6)) {
                                                                bd1.a(bd1Var2, ea.x, new Object[]{str19, str6});
                                                                dd1Var2.e = true;
                                                                break;
                                                            }
                                                            if (z3) {
                                                                arrayList8 = arrayList7;
                                                            } else {
                                                                ej0Var2 = (ej0) map4.get(str6);
                                                                arrayList8 = arrayList7;
                                                                eaVar2 = ea.n;
                                                                if (ej0Var2 == null) {
                                                                    bd1.a(bd1Var2, eaVar2, new Object[]{str6, str19});
                                                                    dd1Var2.e = true;
                                                                } else {
                                                                    str7 = ej0Var.c;
                                                                    arrayListA2 = a(ej0Var, "-Digest", i);
                                                                    if (arrayListA2.isEmpty()) {
                                                                        bd1.a(bd1Var2, eaVar2, new Object[]{str7, str19});
                                                                    } else {
                                                                        i9 = ej0Var2.a;
                                                                        i10 = ej0Var2.b;
                                                                        if (z2) {
                                                                            i14 = i9 + i10;
                                                                            i11 = i10;
                                                                            if (bArrA[i14 - 1] != 10 && bArrA[i14 - 2] == 10) {
                                                                                i12 = i11 - 1;
                                                                            }
                                                                            size3 = arrayListA2.size();
                                                                            i13 = 0;
                                                                            while (i13 < size3) {
                                                                                Object obj8 = arrayListA2.get(i13);
                                                                                int i37 = i13 + 1;
                                                                                int i38 = size3;
                                                                                ad1 ad1Var3 = (ad1) obj8;
                                                                                str8 = ad1Var3.a;
                                                                                MessageDigest messageDigest2 = MessageDigest.getInstance(str8);
                                                                                messageDigest2.update(bArrA, i9, i12);
                                                                                bArrDigest2 = messageDigest2.digest();
                                                                                bArr2 = ad1Var3.b;
                                                                                if (!Arrays.equals(bArr2, bArrDigest2)) {
                                                                                    bd1.a(bd1Var2, ea.s, new Object[]{str7, str8, str19, Base64.encodeToString(bArrDigest2, 2), Base64.encodeToString(bArr2, 2)});
                                                                                }
                                                                                i13 = i37;
                                                                                size3 = i38;
                                                                                i12 = i12;
                                                                                i9 = i9;
                                                                            }
                                                                        } else {
                                                                            i11 = i10;
                                                                        }
                                                                        i12 = i11;
                                                                        size3 = arrayListA2.size();
                                                                        i13 = 0;
                                                                        while (i13 < size3) {
                                                                            Object obj9 = arrayListA2.get(i13);
                                                                            int i39 = i13 + 1;
                                                                            int i310 = size3;
                                                                            ad1 ad1Var4 = (ad1) obj9;
                                                                            str8 = ad1Var4.a;
                                                                            MessageDigest messageDigest3 = MessageDigest.getInstance(str8);
                                                                            messageDigest3.update(bArrA, i9, i12);
                                                                            bArrDigest2 = messageDigest3.digest();
                                                                            bArr2 = ad1Var4.b;
                                                                            if (!Arrays.equals(bArr2, bArrDigest2)) {
                                                                                bd1.a(bd1Var2, ea.s, new Object[]{str7, str8, str19, Base64.encodeToString(bArrDigest2, 2), Base64.encodeToString(bArr2, 2)});
                                                                            }
                                                                            i13 = i39;
                                                                            size3 = i310;
                                                                            i12 = i12;
                                                                            i9 = i9;
                                                                        }
                                                                    }
                                                                    size2 = i7;
                                                                    arrayList7 = arrayList8;
                                                                    i5 = i8;
                                                                }
                                                            }
                                                            size2 = i7;
                                                            arrayList7 = arrayList8;
                                                            i5 = i8;
                                                        }
                                                    }
                                                }
                                            } else {
                                                arrayList6 = arrayListC;
                                                if (!hashSet.isEmpty()) {
                                                    bd1.b(bd1Var2, ea.u, new Object[]{str19});
                                                }
                                            }
                                            if (arrayList19.isEmpty()) {
                                                String strA3 = ej0VarD4.a("Created-By");
                                                if (strA3 == null) {
                                                }
                                                if (z2) {
                                                    str4 = "-Digest";
                                                } else {
                                                    str4 = "-Digest-Manifest";
                                                }
                                                arrayListA = a(ej0VarD4, str4, i);
                                                if (arrayListA.isEmpty()) {
                                                    bd1.b(bd1Var2, ea.t, new Object[]{str19});
                                                    z3 = false;
                                                } else {
                                                    size = arrayListA.size();
                                                    i4 = 0;
                                                    z3 = true;
                                                    while (i4 < size) {
                                                        Object obj10 = arrayListA.get(i4);
                                                        int i311 = i4 + 1;
                                                        ad1 ad1Var5 = (ad1) obj10;
                                                        int i312 = size;
                                                        str5 = ad1Var5.a;
                                                        bArrDigest = MessageDigest.getInstance(str5).digest(bArrA);
                                                        bArr = ad1Var5.b;
                                                        if (!Arrays.equals(bArr, bArrDigest)) {
                                                            bd1.b(bd1Var2, eaVar, new Object[]{"META-INF/MANIFEST.MF", str5, str19, Base64.encodeToString(bArrDigest, 2), Base64.encodeToString(bArr, 2)});
                                                            z3 = false;
                                                        }
                                                        size = i312;
                                                        i4 = i311;
                                                    }
                                                }
                                                if (z2 == 0) {
                                                    arrayListA3 = a(ej0VarD4, "-Digest-Manifest-Main-Attributes", i);
                                                    if (!arrayListA3.isEmpty()) {
                                                        size4 = arrayListA3.size();
                                                        i15 = 0;
                                                        while (i15 < size4) {
                                                            Object obj11 = arrayListA3.get(i15);
                                                            i15++;
                                                            ad1 ad1Var6 = (ad1) obj11;
                                                            str9 = ad1Var6.a;
                                                            int i313 = ej0VarD2.a;
                                                            ArrayList arrayList21 = arrayListA3;
                                                            int i314 = ej0VarD2.b;
                                                            int i315 = size4;
                                                            MessageDigest messageDigest4 = MessageDigest.getInstance(str9);
                                                            messageDigest4.update(bArrA, i313, i314);
                                                            bArrDigest3 = messageDigest4.digest();
                                                            bArr3 = ad1Var6.b;
                                                            if (!Arrays.equals(bArr3, bArrDigest3)) {
                                                                bd1.a(bd1Var2, ea.r, new Object[]{str9, str19, Base64.encodeToString(bArrDigest3, 2), Base64.encodeToString(bArr3, 2)});
                                                            }
                                                            arrayListA3 = arrayList21;
                                                            size4 = i315;
                                                        }
                                                    }
                                                }
                                                if (arrayList19.isEmpty()) {
                                                    arrayList7 = new ArrayList();
                                                    while (true) {
                                                        ej0VarD = fj0Var2.d();
                                                        if (ej0VarD != null) {
                                                            break;
                                                            break;
                                                        }
                                                        arrayList7.add(ej0VarD);
                                                    }
                                                    hashSet3 = new HashSet(arrayList7.size());
                                                    size2 = arrayList7.size();
                                                    i5 = 0;
                                                    i6 = 0;
                                                    while (true) {
                                                        if (i6 < size2) {
                                                            dd1Var2.g = hashSet3;
                                                            break;
                                                        }
                                                        Object obj12 = arrayList7.get(i6);
                                                        i6++;
                                                        ej0Var = (ej0) obj12;
                                                        i7 = size2;
                                                        i8 = i5 + 1;
                                                        str6 = ej0Var.c;
                                                        if (str6 == null) {
                                                            bd1.a(bd1Var2, ea.j, new Object[]{str19, Integer.valueOf(i8)});
                                                            dd1Var2.e = true;
                                                            break;
                                                        }
                                                        if (!hashSet3.add(str6)) {
                                                            bd1.a(bd1Var2, ea.x, new Object[]{str19, str6});
                                                            dd1Var2.e = true;
                                                            break;
                                                        }
                                                        if (z3) {
                                                            arrayList8 = arrayList7;
                                                        } else {
                                                            ej0Var2 = (ej0) map4.get(str6);
                                                            arrayList8 = arrayList7;
                                                            eaVar2 = ea.n;
                                                            if (ej0Var2 == null) {
                                                                bd1.a(bd1Var2, eaVar2, new Object[]{str6, str19});
                                                                dd1Var2.e = true;
                                                            } else {
                                                                str7 = ej0Var.c;
                                                                arrayListA2 = a(ej0Var, "-Digest", i);
                                                                if (arrayListA2.isEmpty()) {
                                                                    bd1.a(bd1Var2, eaVar2, new Object[]{str7, str19});
                                                                } else {
                                                                    i9 = ej0Var2.a;
                                                                    i10 = ej0Var2.b;
                                                                    if (z2) {
                                                                        i14 = i9 + i10;
                                                                        i11 = i10;
                                                                        if (bArrA[i14 - 1] != 10) {
                                                                        }
                                                                        size3 = arrayListA2.size();
                                                                        i13 = 0;
                                                                        while (i13 < size3) {
                                                                            Object obj13 = arrayListA2.get(i13);
                                                                            int i316 = i13 + 1;
                                                                            int i317 = size3;
                                                                            ad1 ad1Var7 = (ad1) obj13;
                                                                            str8 = ad1Var7.a;
                                                                            MessageDigest messageDigest5 = MessageDigest.getInstance(str8);
                                                                            messageDigest5.update(bArrA, i9, i12);
                                                                            bArrDigest2 = messageDigest5.digest();
                                                                            bArr2 = ad1Var7.b;
                                                                            if (!Arrays.equals(bArr2, bArrDigest2)) {
                                                                                bd1.a(bd1Var2, ea.s, new Object[]{str7, str8, str19, Base64.encodeToString(bArrDigest2, 2), Base64.encodeToString(bArr2, 2)});
                                                                            }
                                                                            i13 = i316;
                                                                            size3 = i317;
                                                                            i12 = i12;
                                                                            i9 = i9;
                                                                        }
                                                                    } else {
                                                                        i11 = i10;
                                                                    }
                                                                    i12 = i11;
                                                                    size3 = arrayListA2.size();
                                                                    i13 = 0;
                                                                    while (i13 < size3) {
                                                                        Object obj14 = arrayListA2.get(i13);
                                                                        int i318 = i13 + 1;
                                                                        int i319 = size3;
                                                                        ad1 ad1Var8 = (ad1) obj14;
                                                                        str8 = ad1Var8.a;
                                                                        MessageDigest messageDigest6 = MessageDigest.getInstance(str8);
                                                                        messageDigest6.update(bArrA, i9, i12);
                                                                        bArrDigest2 = messageDigest6.digest();
                                                                        bArr2 = ad1Var8.b;
                                                                        if (!Arrays.equals(bArr2, bArrDigest2)) {
                                                                            bd1.a(bd1Var2, ea.s, new Object[]{str7, str8, str19, Base64.encodeToString(bArrDigest2, 2), Base64.encodeToString(bArr2, 2)});
                                                                        }
                                                                        i13 = i318;
                                                                        size3 = i319;
                                                                        i12 = i12;
                                                                        i9 = i9;
                                                                    }
                                                                }
                                                                size2 = i7;
                                                                arrayList7 = arrayList8;
                                                                i5 = i8;
                                                            }
                                                        }
                                                        size2 = i7;
                                                        arrayList7 = arrayList8;
                                                        i5 = i8;
                                                    }
                                                }
                                            }
                                        } else {
                                            bd1.a(bd1Var2, ea.y, new Object[]{str19});
                                            dd1Var2.e = true;
                                            arrayList17 = arrayList17;
                                            eaVar3 = eaVar3;
                                            cd1Var = cd1Var;
                                            arrayList6 = arrayListC;
                                        }
                                        if (dd1Var2.e) {
                                            arrayList2.add(bd1Var2);
                                        } else {
                                            if (arrayList19.isEmpty()) {
                                                arrayList17 = arrayList17;
                                                arrayList17.add(dd1Var2);
                                            } else {
                                                arrayList14.add(bd1Var2);
                                            }
                                            arrayList13 = arrayList;
                                            i28 = i29;
                                            size10 = i30;
                                            arrayList12 = arrayList18;
                                            str2 = str20;
                                            arrayListC = arrayList6;
                                            eaVar3 = eaVar3;
                                            cd1Var = cd1Var;
                                        }
                                        arrayList17 = arrayList17;
                                        arrayList13 = arrayList;
                                        i28 = i29;
                                        size10 = i30;
                                        arrayList12 = arrayList18;
                                        str2 = str20;
                                        arrayListC = arrayList6;
                                        eaVar3 = eaVar3;
                                        cd1Var = cd1Var;
                                    }
                                    ea eaVar5 = eaVar3;
                                    cd1 cd1Var3 = cd1Var;
                                    ArrayList arrayList22 = arrayListC;
                                    String str21 = str2;
                                    if (cd1.a(cd1Var3)) {
                                        return cd1Var3;
                                    }
                                    if (arrayList17.isEmpty()) {
                                        cd1.b(cd1Var3, eaVar5, new Object[0]);
                                        return cd1Var3;
                                    }
                                    ArrayList arrayList23 = new ArrayList(arrayList22);
                                    Collections.sort(arrayList23, tj.i);
                                    int size11 = arrayList23.size();
                                    ArrayList arrayList24 = null;
                                    int i40 = 0;
                                    while (i40 < size11) {
                                        Object obj15 = arrayList23.get(i40);
                                        int i41 = i40 + 1;
                                        tj tjVar9 = (tj) obj15;
                                        String str22 = tjVar9.g;
                                        ArrayList arrayList25 = arrayList23;
                                        str21 = str21;
                                        if (str22.startsWith(str21)) {
                                            i2 = 1;
                                            z = false;
                                        } else {
                                            i2 = 1;
                                            z = !str22.endsWith("/");
                                        }
                                        if (z) {
                                            ej0 ej0Var4 = (ej0) map4.get(str22);
                                            i3 = i41;
                                            ea eaVar6 = ea.m;
                                            if (ej0Var4 == null) {
                                                Object[] objArr = new Object[i2];
                                                objArr[0] = str22;
                                                cd1.b(cd1Var3, eaVar6, objArr);
                                            } else {
                                                map2 = map4;
                                                ArrayList arrayList26 = new ArrayList(arrayList17.size());
                                                int size12 = arrayList17.size();
                                                arrayList5 = arrayList2;
                                                int i42 = 0;
                                                while (i42 < size12) {
                                                    Object obj16 = arrayList17.get(i42);
                                                    int i43 = i42 + 1;
                                                    int i44 = size12;
                                                    dd1 dd1Var3 = (dd1) obj16;
                                                    if (dd1Var3.g.contains(str22)) {
                                                        arrayList26.add(dd1Var3);
                                                    }
                                                    i42 = i43;
                                                    size12 = i44;
                                                }
                                                if (arrayList26.isEmpty()) {
                                                    cd1.b(cd1Var3, ea.o, new Object[]{str22});
                                                } else {
                                                    if (arrayList24 == null) {
                                                        arrayList24 = arrayList26;
                                                        str11 = str22;
                                                    } else if (!arrayList26.equals(arrayList24)) {
                                                        cd1.b(cd1Var3, ea.p, new Object[]{str11, b(arrayList24), str22, b(arrayList26)});
                                                    }
                                                    ArrayList arrayList27 = new ArrayList(a(ej0Var4, str3, i));
                                                    if (arrayList27.isEmpty()) {
                                                        cd1.b(cd1Var3, eaVar6, new Object[]{str22});
                                                        j = j3;
                                                    } else {
                                                        MessageDigest[] messageDigestArr = new MessageDigest[arrayList27.size()];
                                                        for (int i45 = 0; i45 < arrayList27.size(); i45++) {
                                                            messageDigestArr[i45] = MessageDigest.getInstance(((ad1) arrayList27.get(i45)).a);
                                                        }
                                                        try {
                                                            j = j3;
                                                            bh0.b(vyVar, tjVar9, j, new ev(23, messageDigestArr));
                                                            int i46 = 0;
                                                            while (i46 < arrayList27.size()) {
                                                                ad1 ad1Var9 = (ad1) arrayList27.get(i46);
                                                                ArrayList arrayList28 = arrayList27;
                                                                byte[] bArrDigest4 = messageDigestArr[i46].digest();
                                                                MessageDigest[] messageDigestArr2 = messageDigestArr;
                                                                if (!Arrays.equals(ad1Var9.b, bArrDigest4)) {
                                                                    cd1.b(cd1Var3, eaVar, new Object[]{str22, ad1Var9.a, "META-INF/MANIFEST.MF", Base64.encodeToString(bArrDigest4, 2), Base64.encodeToString(ad1Var9.b, 2)});
                                                                }
                                                                i46++;
                                                                messageDigestArr = messageDigestArr2;
                                                                arrayList27 = arrayList28;
                                                            }
                                                        } catch (IOException e4) {
                                                            throw new IOException("Failed to read entry: ".concat(str22), e4);
                                                        } catch (sh1 e5) {
                                                            throw new i9(str13.concat(str22), e5);
                                                        }
                                                    }
                                                    long j5 = j;
                                                    arrayList24 = arrayList24;
                                                    j3 = j5;
                                                    str3 = str3;
                                                }
                                            }
                                            i40 = i3;
                                            map4 = map2;
                                            arrayList2 = arrayList5;
                                            arrayList23 = arrayList25;
                                        } else {
                                            i3 = i41;
                                        }
                                        map2 = map4;
                                        arrayList5 = arrayList2;
                                        i40 = i3;
                                        map4 = map2;
                                        arrayList2 = arrayList5;
                                        arrayList23 = arrayList25;
                                    }
                                    ArrayList arrayList29 = arrayList2;
                                    String str23 = str21;
                                    if (arrayList24 == null) {
                                        cd1.b(cd1Var3, ea.f, new Object[0]);
                                        hashSet2 = Collections.EMPTY_SET;
                                    } else {
                                        hashSet2 = new HashSet(arrayList24);
                                    }
                                    if (cd1.a(cd1Var3)) {
                                        return cd1Var3;
                                    }
                                    HashSet hashSet7 = new HashSet((arrayList14.size() * 2) + 1);
                                    hashSet7.add(tjVar3.g);
                                    for (dd1 dd1Var4 : hashSet2) {
                                        hashSet7.add(dd1Var4.d.g);
                                        hashSet7.add(dd1Var4.c.g);
                                    }
                                    int size13 = arrayList22.size();
                                    int i47 = 0;
                                    while (i47 < size13) {
                                        Object obj17 = arrayList22.get(i47);
                                        i47++;
                                        String str24 = ((tj) obj17).g;
                                        if (!str24.startsWith(str23) || str24.endsWith("/") || hashSet7.contains(str24)) {
                                            arrayList4 = arrayList;
                                        } else {
                                            arrayList4 = arrayList;
                                            arrayList4.add(new fa(ea.B, new Object[]{str24}));
                                        }
                                        arrayList = arrayList4;
                                    }
                                    int size14 = arrayList17.size();
                                    int i48 = 0;
                                    while (i48 < size14) {
                                        Object obj18 = arrayList17.get(i48);
                                        i48++;
                                        dd1 dd1Var5 = (dd1) obj18;
                                        if (hashSet2.contains(dd1Var5)) {
                                            arrayList14.add(dd1Var5.b);
                                            arrayList3 = arrayList29;
                                        } else {
                                            arrayList3 = arrayList29;
                                            arrayList3.add(dd1Var5.b);
                                        }
                                        arrayList29 = arrayList3;
                                    }
                                    cd1Var3.a = true;
                                    return cd1Var3;
                                }
                            }
                        }
                    }
                }
            } catch (sh1 e6) {
                throw new i9("Malformed ZIP entry: ".concat(tjVar.g), e6);
            }
        }
        return cd1Var;
    }
}
