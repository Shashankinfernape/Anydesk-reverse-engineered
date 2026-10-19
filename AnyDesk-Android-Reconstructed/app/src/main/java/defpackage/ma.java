package defpackage;

import android.R;
import j$.util.Collection$EL;
import j$.util.OptionalInt;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ma {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList(ea.A0, ea.E0, ea.z0, ea.B0));
        HashMap map = new HashMap(2);
        map.put(2, "APK Signature Scheme v2");
        map.put(3, "APK Signature Scheme v3");
        a = map;
    }

    public static void a(List list, List list2, la laVar) {
        try {
            if (Arrays.equals(((X509Certificate) list2.get(0)).getEncoded(), ((X509Certificate) list.get(0)).getEncoded())) {
                return;
            }
            laVar.c(ea.L0, new Object[0]);
        } catch (CertificateEncodingException e) {
            throw new RuntimeException("Failed to encode APK signer cert", e);
        }
    }

    public static void b(List list, List list2, byte[] bArr, la laVar) {
        if (list.size() != 1) {
            laVar.c(ea.K0, new Object[0]);
        }
        a(list2, ((ja) list.get(0)).a, laVar);
        if (Arrays.equals(bArr, f(((ja) list.get(0)).c))) {
            return;
        }
        laVar.c(ea.M0, new Object[0]);
    }

    public static void c(List list, HashMap map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r9 r9Var = (r9) it.next();
            e51 e51VarA = e51.a(r9Var.a);
            if (e51VarA != null) {
                map.put(e51VarA.e, r9Var.b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[Catch: sh1 -> 0x0041, TryCatch #0 {sh1 -> 0x0041, blocks: (B:3:0x0004, B:5:0x0015, B:10:0x0029, B:12:0x0039, B:13:0x0040), top: B:17:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0039 A[Catch: sh1 -> 0x0041, TryCatch #0 {sh1 -> 0x0041, blocks: (B:3:0x0004, B:5:0x0015, B:10:0x0029, B:12:0x0039, B:13:0x0040), top: B:17:0x0004 }] */
    public static ByteBuffer d(vy vyVar, z9 z9Var) throws i9 {
        tj tjVar;
        ArrayList arrayListC = ed1.c(vyVar, z9Var);
        try {
            bs bsVarE = vyVar.e(0L, z9Var.a);
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                tjVar = (tj) obj;
                if ("AndroidManifest.xml".equals(tjVar.g)) {
                    if (tjVar != null) {
                        return ByteBuffer.wrap(bh0.a(bsVarE, tjVar, ((vy) bsVarE).size()));
                    }
                    throw new i9("Missing AndroidManifest.xml");
                }
            }
            tjVar = null;
            if (tjVar != null) {
                return ByteBuffer.wrap(bh0.a(bsVarE, tjVar, ((vy) bsVarE).size()));
            }
            throw new i9("Missing AndroidManifest.xml");
        } catch (sh1 e) {
            throw new i9("Failed to read AndroidManifest.xml", e);
        }
    }

    public static HashMap e(u9 u9Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = u9Var.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c(((t9) obj).g, map);
        }
        return map;
    }

    public static byte[] f(List list) {
        HashMap map = new HashMap();
        c(list, map);
        fq[] fqVarArr = ds.a;
        for (int i = 0; i < 3; i++) {
            fq fqVar = fqVarArr[i];
            if (map.containsKey(fqVar)) {
                return (byte[]) map.get(fqVar);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0274 A[Catch: sh1 -> 0x0287, g51 -> 0x0289, TryCatch #27 {g51 -> 0x0289, sh1 -> 0x0287, blocks: (B:107:0x026d, B:109:0x0274, B:117:0x028f), top: B:351:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x028f A[Catch: sh1 -> 0x0287, g51 -> 0x0289, TRY_LEAVE, TryCatch #27 {g51 -> 0x0289, sh1 -> 0x0287, blocks: (B:107:0x026d, B:109:0x0274, B:117:0x028f), top: B:351:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f5 A[Catch: CertificateEncodingException -> 0x0307, TryCatch #5 {CertificateEncodingException -> 0x0307, blocks: (B:132:0x02e8, B:136:0x02fc, B:135:0x02f5), top: B:312:0x02e8 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0324  */
    /* JADX WARN: Code duplicated, block: B:152:0x0360  */
    /* JADX WARN: Code duplicated, block: B:155:0x0382 A[LOOP:3: B:150:0x035a->B:155:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x038c  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ae A[LOOP:4: B:157:0x0386->B:162:0x03ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:170:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:204:0x045e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0471  */
    /* JADX WARN: Code duplicated, block: B:209:0x0484  */
    /* JADX WARN: Code duplicated, block: B:211:0x0488  */
    /* JADX WARN: Code duplicated, block: B:212:0x048a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0492  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:227:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:231:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:242:0x0522  */
    /* JADX WARN: Code duplicated, block: B:244:0x0525  */
    /* JADX WARN: Code duplicated, block: B:246:0x0529  */
    /* JADX WARN: Code duplicated, block: B:263:0x0560  */
    /* JADX WARN: Code duplicated, block: B:265:0x0566  */
    /* JADX WARN: Code duplicated, block: B:266:0x057c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0582  */
    /* JADX WARN: Code duplicated, block: B:269:0x0596  */
    /* JADX WARN: Code duplicated, block: B:271:0x059a  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a1 A[LOOP:5: B:272:0x059f->B:273:0x05a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:274:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:276:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:278:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:280:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:281:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:284:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:328:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:351:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:362:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0245 A[EDGE_INSN: B:372:0x0245->B:97:0x0245 BREAK  A[LOOP:9: B:91:0x0227->B:95:0x023e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8 A[LOOP:7: B:85:0x01e6->B:86:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0202 A[LOOP:8: B:88:0x0200->B:89:0x0202, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x023e A[LOOP:9: B:91:0x0227->B:95:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0247  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    public static la g(vy vyVar) throws i9 {
        int i;
        int iOrElse;
        la laVar;
        long j;
        int i2;
        HashMap map;
        HashMap map2;
        ByteBuffer byteBufferD;
        int iQ;
        ArrayList arrayListC;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i3;
        ArrayList arrayList4;
        int size2;
        int i4;
        EnumMap enumMap;
        int size3;
        int i5;
        ByteBuffer byteBuffer;
        tj tjVar;
        long j2;
        boolean z;
        ArrayList arrayList5;
        boolean z2;
        ArrayList arrayList6;
        int i6;
        boolean z3;
        ArrayList arrayList7;
        ByteBuffer byteBufferSlice;
        int iW;
        int iQ2;
        int i7;
        boolean z4;
        ArrayList arrayList8;
        int size4;
        int i8;
        ArrayList arrayList9;
        X509Certificate x509Certificate;
        int size5;
        int i9;
        ArrayList arrayList10;
        int size6;
        ea eaVar;
        byte[] bArr;
        boolean z5;
        ea eaVar2;
        int i10;
        boolean z6;
        int i11;
        X509Certificate x509Certificate2;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        int size7;
        int i12;
        int size8;
        int i13;
        int i14;
        int i15;
        ha haVar;
        ga gaVar;
        ArrayList arrayList15;
        X509Certificate x509Certificate3;
        int size9;
        int i16;
        tj tjVar2;
        OptionalInt optionalIntEmpty;
        la laVar2;
        try {
            z9 z9VarP = lk0.p(vyVar);
            long j3 = z9VarP.a;
            int iW2 = lk0.w(d(vyVar, z9VarP).slice());
            if (iW2 > Integer.MAX_VALUE) {
                id.q(q51.k(iW2, "minSdkVersion from APK (", ") > maxSdkVersion (2147483647)"));
                return null;
            }
            la laVar3 = new la();
            HashMap map3 = new HashMap();
            HashSet hashSet = new HashSet(2);
            int i17 = mz0.b;
            HashSet hashSet2 = hashSet;
            try {
                Math.max(iW2, 33);
                map3 = map3;
                try {
                    try {
                        try {
                            hashSet2 = hashSet2;
                            i = 1;
                            try {
                                try {
                                    u9 u9VarB = new fd1(vyVar, z9VarP, new HashSet(1), new u9(31), Integer.MAX_VALUE, 462663009, OptionalInt.empty()).b();
                                    hashSet2.add(31);
                                    iOrElse = Collection$EL.stream(u9VarB.g).mapToInt(new i0(1)).min().orElse(0);
                                    laVar3 = laVar3;
                                    try {
                                        la.a(laVar3, u9VarB);
                                        map3 = map3;
                                        try {
                                            map3.put(31, e(u9VarB));
                                        } catch (v9 unused) {
                                        }
                                    } catch (v9 unused2) {
                                        map3 = map3;
                                    }
                                } catch (v9 unused3) {
                                    laVar3 = laVar3;
                                    map3 = map3;
                                    iOrElse = 0;
                                }
                            } catch (v9 unused4) {
                                laVar3 = laVar3;
                                map3 = map3;
                            }
                        } catch (v9 unused5) {
                            laVar3 = laVar3;
                            i = 1;
                            iOrElse = 0;
                            if (laVar3.d()) {
                                return laVar3;
                            }
                            try {
                                int iMax = Math.max(iW2, 28);
                                int i18 = mz0.b;
                                optionalIntEmpty = OptionalInt.empty();
                                if (iOrElse > 0) {
                                    try {
                                        optionalIntEmpty = OptionalInt.of(iOrElse);
                                    } catch (v9 unused6) {
                                        vyVar = vyVar;
                                        laVar = laVar3;
                                        j = j3;
                                        i2 = 28;
                                        map = map3;
                                        if (hashSet2.contains(31)) {
                                            laVar.c(ea.I0, new Object[0]);
                                        }
                                    }
                                }
                                int iMax2 = Math.max(iMax, 28);
                                map = map3;
                                try {
                                    u9 u9Var = new u9(3);
                                    laVar2 = laVar3;
                                    try {
                                        HashSet hashSet3 = new HashSet(i);
                                        laVar = laVar2;
                                        vyVar = vyVar;
                                        map = map;
                                        j = j3;
                                        i2 = 28;
                                        try {
                                            u9 u9VarB2 = new fd1(vyVar, z9VarP, hashSet3, u9Var, iMax2, -262969152, optionalIntEmpty).b();
                                            hashSet2.add(3);
                                            la.a(laVar, u9VarB2);
                                            map.put(3, e(u9VarB2));
                                        } catch (v9 unused7) {
                                            if (hashSet2.contains(31)) {
                                                laVar.c(ea.I0, new Object[0]);
                                            }
                                        }
                                    } catch (v9 unused8) {
                                        laVar = laVar2;
                                        j = j3;
                                        i2 = 28;
                                        if (hashSet2.contains(31)) {
                                            laVar.c(ea.I0, new Object[0]);
                                        }
                                        if (laVar.d()) {
                                            return laVar;
                                        }
                                        map2 = a;
                                        if (iW2 >= i2) {
                                            try {
                                                u9 u9VarK = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                                                hashSet2.add(2);
                                                la.a(laVar, u9VarK);
                                                map.put(2, e(u9VarK));
                                            } catch (v9 unused9) {
                                            }
                                            if (laVar.d()) {
                                                return laVar;
                                            }
                                        } else {
                                            u9 u9VarK2 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                                            hashSet2.add(2);
                                            la.a(laVar, u9VarK2);
                                            map.put(2, e(u9VarK2));
                                            if (laVar.d()) {
                                                return laVar;
                                            }
                                        }
                                        byteBufferD = d(vyVar, z9VarP);
                                        try {
                                            iQ = lk0.q(byteBufferD.slice(), "manifest", R.attr.targetSandboxVersion);
                                        } catch (i9 unused10) {
                                            iQ = 1;
                                        }
                                        if (iQ > 1) {
                                            laVar.c(ea.D, Integer.valueOf(iQ));
                                        }
                                        arrayListC = ed1.c(vyVar, z9VarP);
                                        arrayList = laVar.b;
                                        arrayList2 = laVar.d;
                                        if (iW2 >= 24) {
                                            cd1 cd1VarD = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                                            laVar.k = cd1VarD.a;
                                            laVar.a.addAll(cd1VarD.e);
                                            arrayList.addAll(cd1VarD.d);
                                            arrayList3 = cd1VarD.b;
                                            size = arrayList3.size();
                                            i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList3.get(i3);
                                                i3++;
                                                arrayList2.add(new ga((bd1) obj));
                                            }
                                            arrayList4 = cd1VarD.c;
                                            size2 = arrayList4.size();
                                            i4 = 0;
                                            while (i4 < size2) {
                                                Object obj2 = arrayList4.get(i4);
                                                i4++;
                                                laVar.e.add(new ga((bd1) obj2));
                                            }
                                            enumMap = new EnumMap(fq.class);
                                            size3 = arrayListC.size();
                                            i5 = 0;
                                            while (true) {
                                                if (i5 >= size3) {
                                                    byteBuffer = byteBufferD;
                                                    tjVar = null;
                                                    break;
                                                }
                                                Object obj3 = arrayListC.get(i5);
                                                i5++;
                                                tjVar = (tj) obj3;
                                                byteBuffer = byteBufferD;
                                                if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                                    break;
                                                }
                                                byteBufferD = byteBuffer;
                                            }
                                            if (tjVar == null) {
                                                j2 = j;
                                            } else {
                                                j2 = j;
                                                try {
                                                    byte[] bArrA = bh0.a(vyVar, tjVar, j2);
                                                    fq fqVar = fq.SHA256;
                                                    try {
                                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                                        messageDigest.update(bArrA);
                                                        enumMap.put(fqVar, messageDigest.digest());
                                                    } catch (NoSuchAlgorithmException e) {
                                                        throw new IllegalStateException("SHA-256 is not found", e);
                                                    }
                                                } catch (sh1 e2) {
                                                    throw new i9("Failed to read APK", e2);
                                                }
                                            }
                                            map.put(1, enumMap);
                                        } else {
                                            cd1 cd1VarD2 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                                            laVar.k = cd1VarD2.a;
                                            laVar.a.addAll(cd1VarD2.e);
                                            arrayList.addAll(cd1VarD2.d);
                                            arrayList3 = cd1VarD2.b;
                                            size = arrayList3.size();
                                            i3 = 0;
                                            while (i3 < size) {
                                                Object obj4 = arrayList3.get(i3);
                                                i3++;
                                                arrayList2.add(new ga((bd1) obj4));
                                            }
                                            arrayList4 = cd1VarD2.c;
                                            size2 = arrayList4.size();
                                            i4 = 0;
                                            while (i4 < size2) {
                                                Object obj5 = arrayList4.get(i4);
                                                i4++;
                                                laVar.e.add(new ga((bd1) obj5));
                                            }
                                            enumMap = new EnumMap(fq.class);
                                            size3 = arrayListC.size();
                                            i5 = 0;
                                            while (true) {
                                                if (i5 >= size3) {
                                                    byteBuffer = byteBufferD;
                                                    tjVar = null;
                                                    break;
                                                }
                                                Object obj6 = arrayListC.get(i5);
                                                i5++;
                                                tjVar = (tj) obj6;
                                                byteBuffer = byteBufferD;
                                                if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                                    break;
                                                    break;
                                                }
                                                byteBufferD = byteBuffer;
                                            }
                                            if (tjVar == null) {
                                                j2 = j;
                                            } else {
                                                j2 = j;
                                                byte[] bArrA2 = bh0.a(vyVar, tjVar, j2);
                                                fq fqVar2 = fq.SHA256;
                                                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                                                messageDigest2.update(bArrA2);
                                                enumMap.put(fqVar2, messageDigest2.digest());
                                            }
                                            map.put(1, enumMap);
                                        }
                                        if (laVar.d()) {
                                            return laVar;
                                        }
                                        try {
                                            size9 = arrayListC.size();
                                            i16 = 0;
                                            do {
                                                if (i16 < size9) {
                                                    tjVar2 = null;
                                                    break;
                                                }
                                                Object obj7 = arrayListC.get(i16);
                                                i16++;
                                                tjVar2 = (tj) obj7;
                                            } while (!"stamp-cert-sha256".equals(tjVar2.g));
                                            if (tjVar2 != null) {
                                                la.b(laVar, th1.Z(vyVar, z9VarP, bh0.a(vyVar, tjVar2, j2), map, Math.max(iW2, 30)));
                                            }
                                        } catch (g51 unused11) {
                                            arrayList.add(new fa(ea.O0, new Object[0]));
                                        } catch (sh1 e3) {
                                            throw new i9("Failed to read APK", e3);
                                        }
                                        if (laVar.d()) {
                                            return laVar;
                                        }
                                        z = laVar.k;
                                        arrayList5 = laVar.f;
                                        if (z) {
                                            arrayList11 = new ArrayList(arrayList2);
                                            arrayList12 = new ArrayList(arrayList5);
                                            arrayList13 = new ArrayList();
                                            arrayList14 = new ArrayList();
                                            size7 = arrayList11.size();
                                            i12 = 0;
                                            while (i12 < size7) {
                                                Object obj8 = arrayList11.get(i12);
                                                i12++;
                                                gaVar = (ga) obj8;
                                                try {
                                                    arrayList15 = gaVar.b;
                                                    if (arrayList15.isEmpty()) {
                                                        x509Certificate3 = null;
                                                    } else {
                                                        x509Certificate3 = (X509Certificate) arrayList15.get(0);
                                                    }
                                                    arrayList13.add(new da(x509Certificate3.getEncoded()));
                                                } catch (CertificateEncodingException e4) {
                                                    throw new IllegalStateException(q51.m(new StringBuilder("Failed to encode JAR signer "), gaVar.a, " certs"), e4);
                                                }
                                            }
                                            size8 = arrayList12.size();
                                            i13 = 0;
                                            while (i13 < size8) {
                                                Object obj9 = arrayList12.get(i13);
                                                i13++;
                                                haVar = (ha) obj9;
                                                try {
                                                    arrayList14.add(new da(haVar.a().getEncoded()));
                                                } catch (CertificateEncodingException e5) {
                                                    throw new IllegalStateException("Failed to encode APK Signature Scheme v2 signer (index: " + haVar.a + ") certs", e5);
                                                }
                                            }
                                            for (i14 = 0; i14 < arrayList13.size(); i14++) {
                                                if (!arrayList14.contains((da) arrayList13.get(i14))) {
                                                    ((ga) arrayList11.get(i14)).c.add(new fa(ea.F, new Object[0]));
                                                    break;
                                                }
                                            }
                                            for (i15 = 0; i15 < arrayList14.size(); i15++) {
                                                if (!arrayList13.contains((da) arrayList14.get(i15))) {
                                                    ((ha) arrayList12.get(i15)).c.add(new fa(ea.C, new Object[0]));
                                                    break;
                                                }
                                            }
                                        }
                                        z2 = laVar.m;
                                        arrayList6 = laVar.g;
                                        if (z2) {
                                            i6 = 0;
                                        } else {
                                            i6 = 0;
                                        }
                                        z3 = laVar.o;
                                        arrayList7 = laVar.h;
                                        if (z3) {
                                            arrayList10 = laVar.i;
                                            ArrayList arrayList16 = ((ka) arrayList10.get(i6)).b;
                                            size6 = arrayList16.size();
                                            eaVar = ea.M0;
                                            if (size6 != 1) {
                                                laVar.c(eaVar, new Object[i6]);
                                            }
                                            bArr = ((r9) arrayList16.get(i6)).b;
                                            z5 = laVar.m;
                                            eaVar2 = ea.K0;
                                            if (z5) {
                                                if (laVar.n) {
                                                    i10 = 2;
                                                } else {
                                                    i10 = 1;
                                                }
                                                if (arrayList10.size() != i10) {
                                                    laVar.c(eaVar2, new Object[0]);
                                                }
                                                b(arrayList6, ((ka) arrayList10.get(0)).a, bArr, laVar);
                                                if (laVar.n) {
                                                    b(arrayList7, ((ka) arrayList10.get(1)).a, bArr, laVar);
                                                }
                                            } else {
                                                if (laVar.l) {
                                                    throw new RuntimeException("V4 signature must be also verified with V2/V3");
                                                }
                                                if (arrayList10.size() != 1) {
                                                    laVar.c(eaVar2, new Object[0]);
                                                }
                                                if (arrayList5.size() != 1) {
                                                    laVar.c(eaVar2, new Object[0]);
                                                }
                                                a(((ka) arrayList10.get(0)).a, ((ha) arrayList5.get(0)).b, laVar);
                                                if (!Arrays.equals(bArr, f(((ha) arrayList5.get(0)).d))) {
                                                    laVar.c(eaVar, new Object[0]);
                                                }
                                            }
                                        }
                                        byteBufferSlice = byteBuffer.slice();
                                        try {
                                            iQ2 = lk0.q(byteBufferSlice, "uses-sdk", R.attr.targetSdkVersion);
                                        } catch (i9 unused12) {
                                            byteBufferSlice.rewind();
                                            try {
                                                iW = lk0.w(byteBufferSlice);
                                            } catch (i9 unused13) {
                                                iW = 1;
                                            }
                                            iQ2 = iW;
                                        }
                                        if (iQ2 >= 30) {
                                            i7 = 2;
                                        } else {
                                            i7 = 1;
                                        }
                                        if (i7 > 1) {
                                            laVar.c(ea.E, Integer.valueOf(iQ2), Integer.valueOf(i7));
                                        }
                                        if (laVar.d()) {
                                            return laVar;
                                        }
                                        z4 = laVar.n;
                                        arrayList8 = laVar.c;
                                        if (z4) {
                                            arrayList8.add(((ja) arrayList7.get(arrayList7.size() - 1)).a());
                                            return laVar;
                                        }
                                        if (laVar.m) {
                                            arrayList8.add(((ja) arrayList6.get(arrayList6.size() - 1)).a());
                                            return laVar;
                                        }
                                        if (laVar.l) {
                                            size5 = arrayList5.size();
                                            i9 = 0;
                                            while (i9 < size5) {
                                                Object obj10 = arrayList5.get(i9);
                                                i9++;
                                                arrayList8.add(((ha) obj10).a());
                                            }
                                            return laVar;
                                        }
                                        if (laVar.k) {
                                            throw new RuntimeException("APK verified, but has not verified using any of v1, v2 or v3 schemes");
                                        }
                                        size4 = arrayList2.size();
                                        i8 = 0;
                                        while (i8 < size4) {
                                            Object obj11 = arrayList2.get(i8);
                                            i8++;
                                            arrayList9 = ((ga) obj11).b;
                                            if (arrayList9.isEmpty()) {
                                                x509Certificate = null;
                                            } else {
                                                x509Certificate = (X509Certificate) arrayList9.get(0);
                                            }
                                            arrayList8.add(x509Certificate);
                                        }
                                        return laVar;
                                    }
                                } catch (v9 unused14) {
                                    j = j3;
                                    laVar = laVar3;
                                }
                            } catch (v9 unused15) {
                                vyVar = vyVar;
                                laVar = laVar3;
                                j = j3;
                                i2 = 28;
                                map = map3;
                            }
                            if (laVar.d()) {
                                return laVar;
                            }
                            map2 = a;
                            if (iW2 >= i2) {
                                u9 u9VarK3 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                                hashSet2.add(2);
                                la.a(laVar, u9VarK3);
                                map.put(2, e(u9VarK3));
                                if (laVar.d()) {
                                    return laVar;
                                }
                            } else {
                                u9 u9VarK4 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                                hashSet2.add(2);
                                la.a(laVar, u9VarK4);
                                map.put(2, e(u9VarK4));
                                if (laVar.d()) {
                                    return laVar;
                                }
                            }
                            byteBufferD = d(vyVar, z9VarP);
                            iQ = lk0.q(byteBufferD.slice(), "manifest", R.attr.targetSandboxVersion);
                            if (iQ > 1) {
                                laVar.c(ea.D, Integer.valueOf(iQ));
                            }
                            arrayListC = ed1.c(vyVar, z9VarP);
                            arrayList = laVar.b;
                            arrayList2 = laVar.d;
                            if (iW2 >= 24) {
                                cd1 cd1VarD3 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                                laVar.k = cd1VarD3.a;
                                laVar.a.addAll(cd1VarD3.e);
                                arrayList.addAll(cd1VarD3.d);
                                arrayList3 = cd1VarD3.b;
                                size = arrayList3.size();
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj12 = arrayList3.get(i3);
                                    i3++;
                                    arrayList2.add(new ga((bd1) obj12));
                                }
                                arrayList4 = cd1VarD3.c;
                                size2 = arrayList4.size();
                                i4 = 0;
                                while (i4 < size2) {
                                    Object obj13 = arrayList4.get(i4);
                                    i4++;
                                    laVar.e.add(new ga((bd1) obj13));
                                }
                                enumMap = new EnumMap(fq.class);
                                size3 = arrayListC.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        byteBuffer = byteBufferD;
                                        tjVar = null;
                                        break;
                                    }
                                    Object obj14 = arrayListC.get(i5);
                                    i5++;
                                    tjVar = (tj) obj14;
                                    byteBuffer = byteBufferD;
                                    if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                        break;
                                        break;
                                    }
                                    byteBufferD = byteBuffer;
                                }
                                if (tjVar == null) {
                                    j2 = j;
                                } else {
                                    j2 = j;
                                    byte[] bArrA3 = bh0.a(vyVar, tjVar, j2);
                                    fq fqVar3 = fq.SHA256;
                                    MessageDigest messageDigest3 = MessageDigest.getInstance("SHA-256");
                                    messageDigest3.update(bArrA3);
                                    enumMap.put(fqVar3, messageDigest3.digest());
                                }
                                map.put(1, enumMap);
                            } else {
                                cd1 cd1VarD4 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                                laVar.k = cd1VarD4.a;
                                laVar.a.addAll(cd1VarD4.e);
                                arrayList.addAll(cd1VarD4.d);
                                arrayList3 = cd1VarD4.b;
                                size = arrayList3.size();
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj15 = arrayList3.get(i3);
                                    i3++;
                                    arrayList2.add(new ga((bd1) obj15));
                                }
                                arrayList4 = cd1VarD4.c;
                                size2 = arrayList4.size();
                                i4 = 0;
                                while (i4 < size2) {
                                    Object obj16 = arrayList4.get(i4);
                                    i4++;
                                    laVar.e.add(new ga((bd1) obj16));
                                }
                                enumMap = new EnumMap(fq.class);
                                size3 = arrayListC.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        byteBuffer = byteBufferD;
                                        tjVar = null;
                                        break;
                                    }
                                    Object obj17 = arrayListC.get(i5);
                                    i5++;
                                    tjVar = (tj) obj17;
                                    byteBuffer = byteBufferD;
                                    if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                        break;
                                        break;
                                    }
                                    byteBufferD = byteBuffer;
                                }
                                if (tjVar == null) {
                                    j2 = j;
                                } else {
                                    j2 = j;
                                    byte[] bArrA4 = bh0.a(vyVar, tjVar, j2);
                                    fq fqVar4 = fq.SHA256;
                                    MessageDigest messageDigest4 = MessageDigest.getInstance("SHA-256");
                                    messageDigest4.update(bArrA4);
                                    enumMap.put(fqVar4, messageDigest4.digest());
                                }
                                map.put(1, enumMap);
                            }
                            if (laVar.d()) {
                                return laVar;
                            }
                            size9 = arrayListC.size();
                            i16 = 0;
                            do {
                                if (i16 < size9) {
                                    tjVar2 = null;
                                    break;
                                }
                                Object obj18 = arrayListC.get(i16);
                                i16++;
                                tjVar2 = (tj) obj18;
                            } while (!"stamp-cert-sha256".equals(tjVar2.g));
                            if (tjVar2 != null) {
                                la.b(laVar, th1.Z(vyVar, z9VarP, bh0.a(vyVar, tjVar2, j2), map, Math.max(iW2, 30)));
                            }
                            if (laVar.d()) {
                                return laVar;
                            }
                            z = laVar.k;
                            arrayList5 = laVar.f;
                            if (z) {
                                arrayList11 = new ArrayList(arrayList2);
                                arrayList12 = new ArrayList(arrayList5);
                                arrayList13 = new ArrayList();
                                arrayList14 = new ArrayList();
                                size7 = arrayList11.size();
                                i12 = 0;
                                while (i12 < size7) {
                                    Object obj19 = arrayList11.get(i12);
                                    i12++;
                                    gaVar = (ga) obj19;
                                    arrayList15 = gaVar.b;
                                    if (arrayList15.isEmpty()) {
                                        x509Certificate3 = null;
                                    } else {
                                        x509Certificate3 = (X509Certificate) arrayList15.get(0);
                                    }
                                    arrayList13.add(new da(x509Certificate3.getEncoded()));
                                }
                                size8 = arrayList12.size();
                                i13 = 0;
                                while (i13 < size8) {
                                    Object obj20 = arrayList12.get(i13);
                                    i13++;
                                    haVar = (ha) obj20;
                                    arrayList14.add(new da(haVar.a().getEncoded()));
                                }
                                while (i14 < arrayList13.size()) {
                                    if (!arrayList14.contains((da) arrayList13.get(i14))) {
                                        ((ga) arrayList11.get(i14)).c.add(new fa(ea.F, new Object[0]));
                                        break;
                                    }
                                }
                                while (i15 < arrayList14.size()) {
                                    if (!arrayList13.contains((da) arrayList14.get(i15))) {
                                        ((ha) arrayList12.get(i15)).c.add(new fa(ea.C, new Object[0]));
                                        break;
                                    }
                                }
                            }
                            z2 = laVar.m;
                            arrayList6 = laVar.g;
                            if (z2) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                            }
                            z3 = laVar.o;
                            arrayList7 = laVar.h;
                            if (z3) {
                                arrayList10 = laVar.i;
                                ArrayList arrayList17 = ((ka) arrayList10.get(i6)).b;
                                size6 = arrayList17.size();
                                eaVar = ea.M0;
                                if (size6 != 1) {
                                    laVar.c(eaVar, new Object[i6]);
                                }
                                bArr = ((r9) arrayList17.get(i6)).b;
                                z5 = laVar.m;
                                eaVar2 = ea.K0;
                                if (z5) {
                                    if (laVar.n) {
                                        i10 = 2;
                                    } else {
                                        i10 = 1;
                                    }
                                    if (arrayList10.size() != i10) {
                                        laVar.c(eaVar2, new Object[0]);
                                    }
                                    b(arrayList6, ((ka) arrayList10.get(0)).a, bArr, laVar);
                                    if (laVar.n) {
                                        b(arrayList7, ((ka) arrayList10.get(1)).a, bArr, laVar);
                                    }
                                } else {
                                    if (laVar.l) {
                                        throw new RuntimeException("V4 signature must be also verified with V2/V3");
                                    }
                                    if (arrayList10.size() != 1) {
                                        laVar.c(eaVar2, new Object[0]);
                                    }
                                    if (arrayList5.size() != 1) {
                                        laVar.c(eaVar2, new Object[0]);
                                    }
                                    a(((ka) arrayList10.get(0)).a, ((ha) arrayList5.get(0)).b, laVar);
                                    if (!Arrays.equals(bArr, f(((ha) arrayList5.get(0)).d))) {
                                        laVar.c(eaVar, new Object[0]);
                                    }
                                }
                            }
                            byteBufferSlice = byteBuffer.slice();
                            iQ2 = lk0.q(byteBufferSlice, "uses-sdk", R.attr.targetSdkVersion);
                            if (iQ2 >= 30) {
                                i7 = 2;
                            } else {
                                i7 = 1;
                            }
                            if (i7 > 1) {
                                laVar.c(ea.E, Integer.valueOf(iQ2), Integer.valueOf(i7));
                            }
                            if (laVar.d()) {
                                return laVar;
                            }
                            z4 = laVar.n;
                            arrayList8 = laVar.c;
                            if (z4) {
                                arrayList8.add(((ja) arrayList7.get(arrayList7.size() - 1)).a());
                                return laVar;
                            }
                            if (laVar.m) {
                                arrayList8.add(((ja) arrayList6.get(arrayList6.size() - 1)).a());
                                return laVar;
                            }
                            if (laVar.l) {
                                size5 = arrayList5.size();
                                i9 = 0;
                                while (i9 < size5) {
                                    Object obj110 = arrayList5.get(i9);
                                    i9++;
                                    arrayList8.add(((ha) obj110).a());
                                }
                                return laVar;
                            }
                            if (laVar.k) {
                                throw new RuntimeException("APK verified, but has not verified using any of v1, v2 or v3 schemes");
                            }
                            size4 = arrayList2.size();
                            i8 = 0;
                            while (i8 < size4) {
                                Object obj111 = arrayList2.get(i8);
                                i8++;
                                arrayList9 = ((ga) obj111).b;
                                if (arrayList9.isEmpty()) {
                                    x509Certificate = null;
                                } else {
                                    x509Certificate = (X509Certificate) arrayList9.get(0);
                                }
                                arrayList8.add(x509Certificate);
                            }
                            return laVar;
                        }
                    } catch (v9 unused16) {
                        laVar3 = laVar3;
                        i = 1;
                        iOrElse = 0;
                        if (laVar3.d()) {
                            return laVar3;
                        }
                        int iMax3 = Math.max(iW2, 28);
                        int i19 = mz0.b;
                        optionalIntEmpty = OptionalInt.empty();
                        if (iOrElse > 0) {
                            optionalIntEmpty = OptionalInt.of(iOrElse);
                        }
                        int iMax4 = Math.max(iMax3, 28);
                        map = map3;
                        u9 u9Var2 = new u9(3);
                        laVar2 = laVar3;
                        HashSet hashSet4 = new HashSet(i);
                        laVar = laVar2;
                        vyVar = vyVar;
                        map = map;
                        j = j3;
                        i2 = 28;
                        u9 u9VarB3 = new fd1(vyVar, z9VarP, hashSet4, u9Var2, iMax4, -262969152, optionalIntEmpty).b();
                        hashSet2.add(3);
                        la.a(laVar, u9VarB3);
                        map.put(3, e(u9VarB3));
                        if (laVar.d()) {
                            return laVar;
                        }
                        map2 = a;
                        if (iW2 >= i2) {
                            u9 u9VarK5 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                            hashSet2.add(2);
                            la.a(laVar, u9VarK5);
                            map.put(2, e(u9VarK5));
                            if (laVar.d()) {
                                return laVar;
                            }
                        } else {
                            u9 u9VarK6 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                            hashSet2.add(2);
                            la.a(laVar, u9VarK6);
                            map.put(2, e(u9VarK6));
                            if (laVar.d()) {
                                return laVar;
                            }
                        }
                        byteBufferD = d(vyVar, z9VarP);
                        iQ = lk0.q(byteBufferD.slice(), "manifest", R.attr.targetSandboxVersion);
                        if (iQ > 1) {
                            laVar.c(ea.D, Integer.valueOf(iQ));
                        }
                        arrayListC = ed1.c(vyVar, z9VarP);
                        arrayList = laVar.b;
                        arrayList2 = laVar.d;
                        if (iW2 >= 24) {
                            cd1 cd1VarD5 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                            laVar.k = cd1VarD5.a;
                            laVar.a.addAll(cd1VarD5.e);
                            arrayList.addAll(cd1VarD5.d);
                            arrayList3 = cd1VarD5.b;
                            size = arrayList3.size();
                            i3 = 0;
                            while (i3 < size) {
                                Object obj112 = arrayList3.get(i3);
                                i3++;
                                arrayList2.add(new ga((bd1) obj112));
                            }
                            arrayList4 = cd1VarD5.c;
                            size2 = arrayList4.size();
                            i4 = 0;
                            while (i4 < size2) {
                                Object obj113 = arrayList4.get(i4);
                                i4++;
                                laVar.e.add(new ga((bd1) obj113));
                            }
                            enumMap = new EnumMap(fq.class);
                            size3 = arrayListC.size();
                            i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    byteBuffer = byteBufferD;
                                    tjVar = null;
                                    break;
                                }
                                Object obj114 = arrayListC.get(i5);
                                i5++;
                                tjVar = (tj) obj114;
                                byteBuffer = byteBufferD;
                                if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                    break;
                                    break;
                                }
                                byteBufferD = byteBuffer;
                            }
                            if (tjVar == null) {
                                j2 = j;
                            } else {
                                j2 = j;
                                byte[] bArrA5 = bh0.a(vyVar, tjVar, j2);
                                fq fqVar5 = fq.SHA256;
                                MessageDigest messageDigest5 = MessageDigest.getInstance("SHA-256");
                                messageDigest5.update(bArrA5);
                                enumMap.put(fqVar5, messageDigest5.digest());
                            }
                            map.put(1, enumMap);
                        } else {
                            cd1 cd1VarD6 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                            laVar.k = cd1VarD6.a;
                            laVar.a.addAll(cd1VarD6.e);
                            arrayList.addAll(cd1VarD6.d);
                            arrayList3 = cd1VarD6.b;
                            size = arrayList3.size();
                            i3 = 0;
                            while (i3 < size) {
                                Object obj115 = arrayList3.get(i3);
                                i3++;
                                arrayList2.add(new ga((bd1) obj115));
                            }
                            arrayList4 = cd1VarD6.c;
                            size2 = arrayList4.size();
                            i4 = 0;
                            while (i4 < size2) {
                                Object obj116 = arrayList4.get(i4);
                                i4++;
                                laVar.e.add(new ga((bd1) obj116));
                            }
                            enumMap = new EnumMap(fq.class);
                            size3 = arrayListC.size();
                            i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    byteBuffer = byteBufferD;
                                    tjVar = null;
                                    break;
                                }
                                Object obj117 = arrayListC.get(i5);
                                i5++;
                                tjVar = (tj) obj117;
                                byteBuffer = byteBufferD;
                                if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                                    break;
                                    break;
                                }
                                byteBufferD = byteBuffer;
                            }
                            if (tjVar == null) {
                                j2 = j;
                            } else {
                                j2 = j;
                                byte[] bArrA6 = bh0.a(vyVar, tjVar, j2);
                                fq fqVar6 = fq.SHA256;
                                MessageDigest messageDigest6 = MessageDigest.getInstance("SHA-256");
                                messageDigest6.update(bArrA6);
                                enumMap.put(fqVar6, messageDigest6.digest());
                            }
                            map.put(1, enumMap);
                        }
                        if (laVar.d()) {
                            return laVar;
                        }
                        size9 = arrayListC.size();
                        i16 = 0;
                        do {
                            if (i16 < size9) {
                                tjVar2 = null;
                                break;
                            }
                            Object obj118 = arrayListC.get(i16);
                            i16++;
                            tjVar2 = (tj) obj118;
                        } while (!"stamp-cert-sha256".equals(tjVar2.g));
                        if (tjVar2 != null) {
                            la.b(laVar, th1.Z(vyVar, z9VarP, bh0.a(vyVar, tjVar2, j2), map, Math.max(iW2, 30)));
                        }
                        if (laVar.d()) {
                            return laVar;
                        }
                        z = laVar.k;
                        arrayList5 = laVar.f;
                        if (z) {
                            arrayList11 = new ArrayList(arrayList2);
                            arrayList12 = new ArrayList(arrayList5);
                            arrayList13 = new ArrayList();
                            arrayList14 = new ArrayList();
                            size7 = arrayList11.size();
                            i12 = 0;
                            while (i12 < size7) {
                                Object obj119 = arrayList11.get(i12);
                                i12++;
                                gaVar = (ga) obj119;
                                arrayList15 = gaVar.b;
                                if (arrayList15.isEmpty()) {
                                    x509Certificate3 = null;
                                } else {
                                    x509Certificate3 = (X509Certificate) arrayList15.get(0);
                                }
                                arrayList13.add(new da(x509Certificate3.getEncoded()));
                            }
                            size8 = arrayList12.size();
                            i13 = 0;
                            while (i13 < size8) {
                                Object obj21 = arrayList12.get(i13);
                                i13++;
                                haVar = (ha) obj21;
                                arrayList14.add(new da(haVar.a().getEncoded()));
                            }
                            while (i14 < arrayList13.size()) {
                                if (!arrayList14.contains((da) arrayList13.get(i14))) {
                                    ((ga) arrayList11.get(i14)).c.add(new fa(ea.F, new Object[0]));
                                    break;
                                }
                            }
                            while (i15 < arrayList14.size()) {
                                if (!arrayList13.contains((da) arrayList14.get(i15))) {
                                    ((ha) arrayList12.get(i15)).c.add(new fa(ea.C, new Object[0]));
                                    break;
                                }
                            }
                        }
                        z2 = laVar.m;
                        arrayList6 = laVar.g;
                        if (z2) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        z3 = laVar.o;
                        arrayList7 = laVar.h;
                        if (z3) {
                            arrayList10 = laVar.i;
                            ArrayList arrayList18 = ((ka) arrayList10.get(i6)).b;
                            size6 = arrayList18.size();
                            eaVar = ea.M0;
                            if (size6 != 1) {
                                laVar.c(eaVar, new Object[i6]);
                            }
                            bArr = ((r9) arrayList18.get(i6)).b;
                            z5 = laVar.m;
                            eaVar2 = ea.K0;
                            if (z5) {
                                if (laVar.n) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                if (arrayList10.size() != i10) {
                                    laVar.c(eaVar2, new Object[0]);
                                }
                                b(arrayList6, ((ka) arrayList10.get(0)).a, bArr, laVar);
                                if (laVar.n) {
                                    b(arrayList7, ((ka) arrayList10.get(1)).a, bArr, laVar);
                                }
                            } else {
                                if (laVar.l) {
                                    throw new RuntimeException("V4 signature must be also verified with V2/V3");
                                }
                                if (arrayList10.size() != 1) {
                                    laVar.c(eaVar2, new Object[0]);
                                }
                                if (arrayList5.size() != 1) {
                                    laVar.c(eaVar2, new Object[0]);
                                }
                                a(((ka) arrayList10.get(0)).a, ((ha) arrayList5.get(0)).b, laVar);
                                if (!Arrays.equals(bArr, f(((ha) arrayList5.get(0)).d))) {
                                    laVar.c(eaVar, new Object[0]);
                                }
                            }
                        }
                        byteBufferSlice = byteBuffer.slice();
                        iQ2 = lk0.q(byteBufferSlice, "uses-sdk", R.attr.targetSdkVersion);
                        if (iQ2 >= 30) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                        if (i7 > 1) {
                            laVar.c(ea.E, Integer.valueOf(iQ2), Integer.valueOf(i7));
                        }
                        if (laVar.d()) {
                            return laVar;
                        }
                        z4 = laVar.n;
                        arrayList8 = laVar.c;
                        if (z4) {
                            arrayList8.add(((ja) arrayList7.get(arrayList7.size() - 1)).a());
                            return laVar;
                        }
                        if (laVar.m) {
                            arrayList8.add(((ja) arrayList6.get(arrayList6.size() - 1)).a());
                            return laVar;
                        }
                        if (laVar.l) {
                            size5 = arrayList5.size();
                            i9 = 0;
                            while (i9 < size5) {
                                Object obj1110 = arrayList5.get(i9);
                                i9++;
                                arrayList8.add(((ha) obj1110).a());
                            }
                            return laVar;
                        }
                        if (laVar.k) {
                            throw new RuntimeException("APK verified, but has not verified using any of v1, v2 or v3 schemes");
                        }
                        size4 = arrayList2.size();
                        i8 = 0;
                        while (i8 < size4) {
                            Object obj1111 = arrayList2.get(i8);
                            i8++;
                            arrayList9 = ((ga) obj1111).b;
                            if (arrayList9.isEmpty()) {
                                x509Certificate = null;
                            } else {
                                x509Certificate = (X509Certificate) arrayList9.get(0);
                            }
                            arrayList8.add(x509Certificate);
                        }
                        return laVar;
                    }
                } catch (v9 unused17) {
                }
            } catch (v9 unused18) {
                hashSet2 = hashSet2;
                i = 1;
            }
            if (laVar3.d()) {
                return laVar3;
            }
            int iMax5 = Math.max(iW2, 28);
            int i110 = mz0.b;
            optionalIntEmpty = OptionalInt.empty();
            if (iOrElse > 0) {
                optionalIntEmpty = OptionalInt.of(iOrElse);
            }
            int iMax6 = Math.max(iMax5, 28);
            map = map3;
            u9 u9Var3 = new u9(3);
            laVar2 = laVar3;
            HashSet hashSet5 = new HashSet(i);
            laVar = laVar2;
            vyVar = vyVar;
            map = map;
            j = j3;
            i2 = 28;
            u9 u9VarB4 = new fd1(vyVar, z9VarP, hashSet5, u9Var3, iMax6, -262969152, optionalIntEmpty).b();
            hashSet2.add(3);
            la.a(laVar, u9VarB4);
            map.put(3, e(u9VarB4));
            if (laVar.d()) {
                return laVar;
            }
            map2 = a;
            if (iW2 >= i2 || hashSet2.isEmpty()) {
                u9 u9VarK7 = ec1.K(vyVar, z9VarP, map2, hashSet2, Math.max(iW2, 24));
                hashSet2.add(2);
                la.a(laVar, u9VarK7);
                map.put(2, e(u9VarK7));
                if (laVar.d()) {
                    return laVar;
                }
            }
            byteBufferD = d(vyVar, z9VarP);
            iQ = lk0.q(byteBufferD.slice(), "manifest", R.attr.targetSandboxVersion);
            if (iQ > 1 && hashSet2.isEmpty()) {
                laVar.c(ea.D, Integer.valueOf(iQ));
            }
            arrayListC = ed1.c(vyVar, z9VarP);
            arrayList = laVar.b;
            arrayList2 = laVar.d;
            if (iW2 >= 24 || hashSet2.isEmpty()) {
                cd1 cd1VarD7 = ed1.d(vyVar, z9VarP, map2, hashSet2, iW2);
                laVar.k = cd1VarD7.a;
                laVar.a.addAll(cd1VarD7.e);
                arrayList.addAll(cd1VarD7.d);
                arrayList3 = cd1VarD7.b;
                size = arrayList3.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj1112 = arrayList3.get(i3);
                    i3++;
                    arrayList2.add(new ga((bd1) obj1112));
                }
                arrayList4 = cd1VarD7.c;
                size2 = arrayList4.size();
                i4 = 0;
                while (i4 < size2) {
                    Object obj1113 = arrayList4.get(i4);
                    i4++;
                    laVar.e.add(new ga((bd1) obj1113));
                }
                enumMap = new EnumMap(fq.class);
                size3 = arrayListC.size();
                i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        byteBuffer = byteBufferD;
                        tjVar = null;
                        break;
                    }
                    Object obj1114 = arrayListC.get(i5);
                    i5++;
                    tjVar = (tj) obj1114;
                    byteBuffer = byteBufferD;
                    if ("META-INF/MANIFEST.MF".equals(tjVar.g)) {
                        break;
                        break;
                    }
                    byteBufferD = byteBuffer;
                }
                if (tjVar == null) {
                    j2 = j;
                } else {
                    j2 = j;
                    byte[] bArrA7 = bh0.a(vyVar, tjVar, j2);
                    fq fqVar7 = fq.SHA256;
                    MessageDigest messageDigest7 = MessageDigest.getInstance("SHA-256");
                    messageDigest7.update(bArrA7);
                    enumMap.put(fqVar7, messageDigest7.digest());
                }
                map.put(1, enumMap);
            } else {
                byteBuffer = byteBufferD;
                j2 = j;
            }
            if (laVar.d()) {
                return laVar;
            }
            size9 = arrayListC.size();
            i16 = 0;
            do {
                if (i16 < size9) {
                    tjVar2 = null;
                    break;
                }
                Object obj1115 = arrayListC.get(i16);
                i16++;
                tjVar2 = (tj) obj1115;
            } while (!"stamp-cert-sha256".equals(tjVar2.g));
            if (tjVar2 != null) {
                la.b(laVar, th1.Z(vyVar, z9VarP, bh0.a(vyVar, tjVar2, j2), map, Math.max(iW2, 30)));
            }
            if (laVar.d()) {
                return laVar;
            }
            z = laVar.k;
            arrayList5 = laVar.f;
            if (z && laVar.l) {
                arrayList11 = new ArrayList(arrayList2);
                arrayList12 = new ArrayList(arrayList5);
                arrayList13 = new ArrayList();
                arrayList14 = new ArrayList();
                size7 = arrayList11.size();
                i12 = 0;
                while (i12 < size7) {
                    Object obj1116 = arrayList11.get(i12);
                    i12++;
                    gaVar = (ga) obj1116;
                    arrayList15 = gaVar.b;
                    if (arrayList15.isEmpty()) {
                        x509Certificate3 = null;
                    } else {
                        x509Certificate3 = (X509Certificate) arrayList15.get(0);
                    }
                    arrayList13.add(new da(x509Certificate3.getEncoded()));
                }
                size8 = arrayList12.size();
                i13 = 0;
                while (i13 < size8) {
                    Object obj22 = arrayList12.get(i13);
                    i13++;
                    haVar = (ha) obj22;
                    arrayList14.add(new da(haVar.a().getEncoded()));
                }
                while (i14 < arrayList13.size()) {
                    if (!arrayList14.contains((da) arrayList13.get(i14))) {
                        ((ga) arrayList11.get(i14)).c.add(new fa(ea.F, new Object[0]));
                        break;
                    }
                }
                while (i15 < arrayList14.size()) {
                    if (!arrayList13.contains((da) arrayList14.get(i15))) {
                        ((ha) arrayList12.get(i15)).c.add(new fa(ea.C, new Object[0]));
                        break;
                    }
                }
            }
            z2 = laVar.m;
            arrayList6 = laVar.g;
            if (z2 || !((z6 = laVar.k) || laVar.l)) {
                i6 = 0;
            } else {
                h51 h51Var = laVar.p;
                ea eaVar3 = ea.k0;
                if (z6) {
                    i11 = 0;
                    if (arrayList2.size() != 1) {
                        laVar.c(eaVar3, new Object[0]);
                    }
                    x509Certificate2 = (X509Certificate) ((ga) arrayList2.get(0)).b.get(0);
                } else {
                    i11 = 0;
                    if (arrayList5.size() != 1) {
                        laVar.c(eaVar3, new Object[0]);
                    }
                    x509Certificate2 = (X509Certificate) ((ha) arrayList5.get(0)).b.get(0);
                }
                ea eaVar4 = ea.l0;
                if (h51Var == null) {
                    if (arrayList6.size() != 1) {
                        laVar.c(ea.j0, new Object[i11]);
                    }
                    try {
                        if (!Arrays.equals(x509Certificate2.getEncoded(), ((X509Certificate) ((ja) arrayList6.get(i11)).a.get(i11)).getEncoded())) {
                            laVar.c(eaVar4, new Object[i11]);
                        }
                    } catch (CertificateEncodingException e6) {
                        throw new RuntimeException("Failed to encode APK Signature Scheme v3 signer cert", e6);
                    }
                } else {
                    try {
                        if (h51Var.b(x509Certificate2).b.size() != 1) {
                            i6 = 0;
                            try {
                                laVar.c(eaVar4, new Object[0]);
                            } catch (IllegalArgumentException unused19) {
                                laVar.c(eaVar4, new Object[i6]);
                            }
                        }
                    } catch (IllegalArgumentException unused20) {
                        i6 = 0;
                    }
                }
                i6 = 0;
            }
            z3 = laVar.o;
            arrayList7 = laVar.h;
            if (z3) {
                arrayList10 = laVar.i;
                ArrayList arrayList19 = ((ka) arrayList10.get(i6)).b;
                size6 = arrayList19.size();
                eaVar = ea.M0;
                if (size6 != 1) {
                    laVar.c(eaVar, new Object[i6]);
                }
                bArr = ((r9) arrayList19.get(i6)).b;
                z5 = laVar.m;
                eaVar2 = ea.K0;
                if (z5) {
                    if (laVar.n) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    if (arrayList10.size() != i10) {
                        laVar.c(eaVar2, new Object[0]);
                    }
                    b(arrayList6, ((ka) arrayList10.get(0)).a, bArr, laVar);
                    if (laVar.n) {
                        b(arrayList7, ((ka) arrayList10.get(1)).a, bArr, laVar);
                    }
                } else {
                    if (laVar.l) {
                        throw new RuntimeException("V4 signature must be also verified with V2/V3");
                    }
                    if (arrayList10.size() != 1) {
                        laVar.c(eaVar2, new Object[0]);
                    }
                    if (arrayList5.size() != 1) {
                        laVar.c(eaVar2, new Object[0]);
                    }
                    a(((ka) arrayList10.get(0)).a, ((ha) arrayList5.get(0)).b, laVar);
                    if (!Arrays.equals(bArr, f(((ha) arrayList5.get(0)).d))) {
                        laVar.c(eaVar, new Object[0]);
                    }
                }
            }
            byteBufferSlice = byteBuffer.slice();
            iQ2 = lk0.q(byteBufferSlice, "uses-sdk", R.attr.targetSdkVersion);
            if (iQ2 >= 30) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (i7 > 1 && Integer.MAX_VALUE >= iQ2 && i7 == 2 && !laVar.l && !laVar.m && !laVar.n) {
                laVar.c(ea.E, Integer.valueOf(iQ2), Integer.valueOf(i7));
            }
            if (laVar.d()) {
                return laVar;
            }
            z4 = laVar.n;
            arrayList8 = laVar.c;
            if (z4) {
                arrayList8.add(((ja) arrayList7.get(arrayList7.size() - 1)).a());
                return laVar;
            }
            if (laVar.m) {
                arrayList8.add(((ja) arrayList6.get(arrayList6.size() - 1)).a());
                return laVar;
            }
            if (laVar.l) {
                size5 = arrayList5.size();
                i9 = 0;
                while (i9 < size5) {
                    Object obj1117 = arrayList5.get(i9);
                    i9++;
                    arrayList8.add(((ha) obj1117).a());
                }
                return laVar;
            }
            if (laVar.k) {
                throw new RuntimeException("APK verified, but has not verified using any of v1, v2 or v3 schemes");
            }
            size4 = arrayList2.size();
            i8 = 0;
            while (i8 < size4) {
                Object obj1118 = arrayList2.get(i8);
                i8++;
                arrayList9 = ((ga) obj1118).b;
                if (arrayList9.isEmpty()) {
                    x509Certificate = null;
                } else {
                    x509Certificate = (X509Certificate) arrayList9.get(0);
                }
                arrayList8.add(x509Certificate);
            }
            return laVar;
        } catch (sh1 e7) {
            throw new i9("Malformed APK: not a ZIP archive", e7);
        }
    }
}
