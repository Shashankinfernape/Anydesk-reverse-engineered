package defpackage;

import j$.util.Collection$EL;
import j$.util.OptionalInt;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class fd1 {
    public final vy a;
    public final z9 b;
    public final u9 c;
    public final HashSet d;
    public final int e;
    public final int f;
    public final OptionalInt g;
    public ByteBuffer h;

    public fd1(vy vyVar, z9 z9Var, HashSet hashSet, u9 u9Var, int i, int i2, OptionalInt optionalInt) {
        int i3 = mz0.b;
        this.a = vyVar;
        this.b = z9Var;
        this.d = hashSet;
        this.c = u9Var;
        this.e = i;
        this.f = i2;
        this.g = optionalInt;
    }

    public final void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, t9 t9Var) throws i9, NoSuchAlgorithmException {
        int i;
        char c;
        byte[] encoded;
        OptionalInt optionalInt;
        int i2;
        char c2;
        ea eaVar = ea.B0;
        ByteBuffer byteBufferV = y90.v(byteBuffer);
        byteBufferV.get(new byte[byteBufferV.remaining()]);
        byteBufferV.flip();
        ArrayList arrayList = t9Var.g;
        ArrayList arrayList2 = t9Var.b;
        ArrayList arrayList3 = t9Var.i;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        t9Var.l = i3;
        t9Var.m = i4;
        int i5 = 1;
        if (i3 < 0 || i3 > i4) {
            t9Var.f(ea.p0, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        ByteBuffer byteBufferV2 = y90.v(byteBuffer);
        byte[] bArrQ = y90.Q(byteBuffer);
        ArrayList arrayList4 = new ArrayList(1);
        int i6 = 0;
        while (byteBufferV2.hasRemaining()) {
            i6 += i5;
            try {
                ByteBuffer byteBufferV3 = y90.v(byteBufferV2);
                int i7 = byteBufferV3.getInt();
                c2 = 0;
                try {
                    byte[] bArrQ2 = y90.Q(byteBufferV3);
                    arrayList3.add(new s9(i7));
                    e51 e51VarA = e51.a(i7);
                    if (e51VarA == null) {
                        t9Var.g(ea.m0, Integer.valueOf(i7));
                    } else {
                        arrayList4.add(new w9(e51VarA, bArrQ2));
                    }
                    i5 = 1;
                } catch (i9 | BufferUnderflowException unused) {
                    Object[] objArr = new Object[1];
                    objArr[c2] = Integer.valueOf(i6);
                    t9Var.f(ea.f0, objArr);
                    return;
                }
            } catch (i9 | BufferUnderflowException unused2) {
                c2 = 0;
            }
        }
        if (arrayList3.isEmpty()) {
            t9Var.f(ea.r0, new Object[0]);
            return;
        }
        try {
            try {
                ArrayList arrayListB = y90.B(arrayList4, t9Var.l, t9Var.m, false);
                int size = arrayListB.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayListB.get(i8);
                    i8++;
                    w9 w9Var = (w9) obj;
                    e51 e51Var = w9Var.a;
                    rt0 rt0Var = e51Var.f;
                    int i9 = size;
                    String str = (String) rt0Var.a;
                    AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) rt0Var.b;
                    try {
                        ArrayList arrayList5 = arrayListB;
                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(e51Var.d).generatePublic(new X509EncodedKeySpec(bArrQ));
                        try {
                            Signature signature = Signature.getInstance(str);
                            signature.initVerify(publicKeyGeneratePublic);
                            if (algorithmParameterSpec != null) {
                                signature.setParameter(algorithmParameterSpec);
                            }
                            byteBufferV.position(0);
                            signature.update(byteBufferV);
                            byte[] bArr = w9Var.b;
                            if (!signature.verify(bArr)) {
                                t9Var.f(ea.q0, e51Var);
                                return;
                            }
                            t9Var.j.put(e51Var, bArr);
                            this.d.add(e51Var.e);
                            size = i9;
                            arrayListB = arrayList5;
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            t9Var.f(ea.o0, e51Var, e);
                            return;
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            t9Var.f(ea.o0, e51Var, e);
                            return;
                        } catch (SignatureException e3) {
                            e = e3;
                            t9Var.f(ea.o0, e51Var, e);
                            return;
                        }
                    } catch (Exception e4) {
                        t9Var.f(ea.d0, e4);
                        return;
                    }
                }
                byteBufferV.position(0);
                ByteBuffer byteBufferV4 = y90.v(byteBufferV);
                ByteBuffer byteBufferV5 = y90.v(byteBufferV);
                int i10 = byteBufferV.getInt();
                if (i10 != i3) {
                    i = 2;
                    c = 1;
                    t9Var.f(ea.u0, Integer.valueOf(i3), Integer.valueOf(i10));
                } else {
                    i = 2;
                    c = 1;
                }
                int i11 = byteBufferV.getInt();
                if (i11 != i4) {
                    Object objValueOf = Integer.valueOf(i4);
                    Object objValueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = objValueOf;
                    objArr2[c] = objValueOf2;
                    t9Var.f(ea.v0, objArr2);
                }
                ByteBuffer byteBufferV6 = y90.v(byteBufferV);
                int i12 = -1;
                while (byteBufferV5.hasRemaining()) {
                    int i13 = i12 + 1;
                    byte[] bArrQ3 = y90.Q(byteBufferV5);
                    try {
                        arrayList2.add(new i70(qh1.b(bArrQ3, certificateFactory), bArrQ3));
                        i12 = i13;
                    } catch (CertificateException e5) {
                        t9Var.f(ea.e0, Integer.valueOf(i13), Integer.valueOf(i12 + 2), e5);
                        return;
                    }
                }
                if (arrayList2.isEmpty()) {
                    t9Var.f(ea.t0, new Object[0]);
                    return;
                }
                X509Certificate x509Certificate = (X509Certificate) arrayList2.get(0);
                try {
                    encoded = ds.l(x509Certificate.getPublicKey());
                } catch (InvalidKeyException e6) {
                    System.out.println("Caught an exception encoding the public key: " + e6);
                    e6.printStackTrace();
                    encoded = x509Certificate.getPublicKey().getEncoded();
                }
                if (!Arrays.equals(bArrQ, encoded)) {
                    t9Var.f(ea.w0, y90.X(encoded), y90.X(bArrQ));
                    return;
                }
                int i14 = 0;
                while (byteBufferV4.hasRemaining()) {
                    i14++;
                    try {
                        ByteBuffer byteBufferV7 = y90.v(byteBufferV4);
                        arrayList.add(new r9(byteBufferV7.getInt(), y90.Q(byteBufferV7)));
                    } catch (i9 | BufferUnderflowException unused3) {
                        t9Var.f(ea.g0, Integer.valueOf(i14));
                        return;
                    }
                }
                ArrayList arrayList6 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList3.get(i15);
                    i15++;
                    arrayList6.add(Integer.valueOf(((s9) obj2).a));
                }
                ArrayList arrayList7 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList.get(i16);
                    i16++;
                    arrayList7.add(Integer.valueOf(((r9) obj3).a));
                }
                if (!arrayList6.equals(arrayList7)) {
                    t9Var.f(ea.x0, arrayList6, arrayList7);
                    return;
                }
                int i17 = 0;
                boolean z = false;
                while (true) {
                    boolean zHasRemaining = byteBufferV6.hasRemaining();
                    optionalInt = this.g;
                    if (!zHasRemaining) {
                        break;
                    }
                    i17++;
                    try {
                        ByteBuffer byteBufferV8 = y90.v(byteBufferV6);
                        int i18 = byteBufferV8.getInt();
                        byte[] bArr2 = new byte[byteBufferV8.remaining()];
                        byteBufferV8.get(bArr2);
                        t9Var.k.add(new q9(i18, bArr2));
                        if (i18 == 1000370060) {
                            try {
                                try {
                                    h51 h51VarC = h51.c(bArr2);
                                    t9Var.n = h51VarC;
                                    i2 = 0;
                                    try {
                                        if (t9Var.n.b.size() != h51VarC.b((X509Certificate) arrayList2.get(0)).b.size()) {
                                            i2 = 0;
                                            t9Var.f(eaVar, new Object[0]);
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        t9Var.f(eaVar, new Object[i2]);
                                    }
                                } catch (IllegalArgumentException unused5) {
                                    i2 = 0;
                                }
                            } catch (SecurityException unused6) {
                                t9Var.f(ea.z0, new Object[0]);
                            } catch (Exception unused7) {
                                t9Var.f(ea.A0, new Object[0]);
                            }
                        } else if (i18 == 1436519170) {
                            int i19 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                            if (optionalInt.isPresent()) {
                                int asInt = optionalInt.getAsInt();
                                if (i19 != asInt) {
                                    t9Var.f(ea.G0, Integer.valueOf(i19), Integer.valueOf(asInt));
                                }
                            } else {
                                t9Var.f(ea.F0, Integer.valueOf(i19));
                            }
                            z = true;
                        } else if (i18 != -1029262406) {
                            t9Var.g(ea.n0, Integer.valueOf(i18));
                        } else if (this.f != 462663009) {
                            t9Var.g(ea.J0, new Object[0]);
                        }
                    } catch (i9 | BufferUnderflowException unused8) {
                        t9Var.f(ea.h0, Integer.valueOf(i17));
                        return;
                    }
                }
                if (!optionalInt.isPresent() || z) {
                    return;
                }
                t9Var.g(ea.H0, Integer.valueOf(optionalInt.getAsInt()));
            } catch (up0 e7) {
                throw new p9(e7.getMessage());
            }
        } catch (p9 unused9) {
            t9Var.f(ea.s0, new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    public final u9 b() {
        ea eaVar;
        int i = this.f;
        z9 z9Var = this.b;
        u9 u9Var = this.c;
        ArrayList arrayList = u9Var.g;
        vy vyVar = this.a;
        try {
            f51 f51VarP = y90.p(vyVar, z9Var, i);
            this.h = f51VarP.a;
            bs bsVarE = vyVar.e(0L, f51VarP.b);
            long j = f51VarP.c;
            bs bsVarE2 = vyVar.e(j, f51VarP.d - j);
            ByteBuffer byteBuffer = f51VarP.e;
            try {
                if (this.h == null) {
                    try {
                        this.h = y90.p(vyVar, z9Var, i).a;
                    } catch (g51 e) {
                        throw new v9(e.getMessage());
                    }
                }
                ByteBuffer byteBufferV = y90.v(this.h);
                if (byteBufferV.hasRemaining()) {
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        int i2 = 0;
                        while (byteBufferV.hasRemaining()) {
                            int i3 = i2 + 1;
                            t9 t9Var = new t9();
                            t9Var.a = i2;
                            arrayList.add(t9Var);
                            try {
                                a(y90.v(byteBufferV), certificateFactory, t9Var);
                                i2 = i3;
                            } catch (i9 | BufferUnderflowException unused) {
                                t9Var.f(ea.c0, new Object[0]);
                            }
                        }
                    } catch (CertificateException e2) {
                        throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e2);
                    }
                } else {
                    u9Var.d(ea.i0, new Object[0]);
                }
            } catch (i9 unused2) {
                u9Var.d(ea.b0, new Object[0]);
            }
            if (!u9Var.a()) {
                int i4 = mz0.b;
                ds.H(bsVarE, bsVarE2, byteBuffer, this.d, u9Var);
                TreeMap treeMap = new TreeMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    t9 t9Var2 = (t9) obj;
                    treeMap.put(Integer.valueOf(t9Var2.m), t9Var2);
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = treeMap.values().iterator();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    eaVar = ea.E0;
                    if (!zHasNext) {
                        break;
                    }
                    t9 t9Var3 = (t9) it.next();
                    int i9 = t9Var3.l;
                    int i10 = t9Var3.m;
                    if (i6 != 0) {
                        if (i9 != i7 + 1 && (i9 != i7 || !Collection$EL.stream(t9Var3.k).mapToInt(new i0(3)).anyMatch(new ia(1)))) {
                            u9Var.d(ea.C0, new Object[0]);
                            break;
                        }
                    } else {
                        i6 = i9;
                    }
                    h51 h51Var = t9Var3.n;
                    if (h51Var != null) {
                        int size2 = h51Var.b.size();
                        if (size2 < i8) {
                            u9Var.d(eaVar, new Object[0]);
                            i7 = i10;
                            break;
                        }
                        arrayList2.add(t9Var3.n);
                        i8 = size2;
                    }
                    i7 = i10;
                }
                if (i6 <= this.e) {
                    OptionalInt optionalInt = this.g;
                    if (i7 < (optionalInt.isPresent() ? optionalInt.getAsInt() - 1 : Integer.MAX_VALUE)) {
                        u9Var.d(ea.D0, Integer.valueOf(i6), Integer.valueOf(i7));
                    }
                } else {
                    u9Var.d(ea.D0, Integer.valueOf(i6), Integer.valueOf(i7));
                }
                try {
                    u9Var.f = h51.a(arrayList2);
                } catch (IllegalArgumentException unused3) {
                    u9Var.d(eaVar, new Object[0]);
                }
                if (!u9Var.a()) {
                    u9Var.b = true;
                }
            }
            return u9Var;
        } catch (g51 e3) {
            throw new v9(e3.getMessage());
        }
    }
}
