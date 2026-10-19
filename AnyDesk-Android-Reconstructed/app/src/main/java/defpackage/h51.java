package defpackage;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h51 {
    public final int a;
    public final ArrayList b;

    public h51(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public static h51 a(ArrayList arrayList) {
        h51 h51Var;
        h51 h51Var2;
        if (arrayList.isEmpty()) {
            return null;
        }
        h51 h51Var3 = (h51) arrayList.get(0);
        int i = 1;
        while (i < arrayList.size()) {
            h51 h51Var4 = (h51) arrayList.get(i);
            i70 i70Var = ((gd1) h51Var3.b.get(0)).a;
            ArrayList arrayList2 = h51Var4.b;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    h51Var = h51Var3;
                    h51Var2 = h51Var4;
                    break;
                }
                if (((gd1) arrayList2.get(i2)).a.equals(i70Var)) {
                    h51Var2 = h51Var3;
                    h51Var = h51Var4;
                    break;
                }
                i2++;
            }
            ArrayList arrayList3 = h51Var.b;
            ArrayList arrayList4 = h51Var2.b;
            gd1 gd1Var = (gd1) arrayList4.get(0);
            ArrayList arrayList5 = new ArrayList();
            int i3 = 0;
            while (i3 < arrayList3.size()) {
                int i4 = i3 + 1;
                gd1 gd1Var2 = (gd1) arrayList3.get(i3);
                if (gd1Var2.a.equals(gd1Var.a)) {
                    i3 = i4;
                    break;
                }
                arrayList5.add(gd1Var2);
                i3 = i4;
            }
            if (i3 == arrayList5.size()) {
                id.q("The provided lineage is not a descendant or an ancestor of this lineage");
                return null;
            }
            arrayList5.add(gd1Var);
            int i5 = 1;
            while (i3 < arrayList3.size() && i5 < arrayList4.size()) {
                int i6 = i3 + 1;
                gd1 gd1Var3 = (gd1) arrayList3.get(i3);
                int i7 = i5 + 1;
                gd1 gd1Var4 = (gd1) arrayList4.get(i5);
                if (!gd1Var3.a.equals(gd1Var4.a)) {
                    id.q("The provided lineage diverges from this lineage");
                    return null;
                }
                arrayList5.add(gd1Var4);
                i3 = i6;
                i5 = i7;
            }
            while (i3 < arrayList3.size()) {
                arrayList5.add((gd1) arrayList3.get(i3));
                i3++;
            }
            while (i5 < arrayList4.size()) {
                arrayList5.add((gd1) arrayList4.get(i5));
                i5++;
            }
            i++;
            h51Var3 = new h51(Math.min(h51Var3.a, h51Var4.a), arrayList5);
        }
        return h51Var3;
    }

    public static h51 c(byte[] bArr) throws IOException {
        h51 h51Var;
        int i;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (byteBufferOrder == null || !byteBufferOrder.hasRemaining()) {
            h51Var = null;
            arrayList = null;
        } else {
            if (byteBufferOrder.order() != byteOrder) {
                id.q("ByteBuffer byte order must be little endian");
                return null;
            }
            try {
                try {
                    if (byteBufferOrder.getInt() != 1) {
                        throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                    }
                    HashSet hashSet = new HashSet();
                    int i3 = 0;
                    int i4 = 0;
                    i70 i70Var = null;
                    while (byteBufferOrder.hasRemaining()) {
                        try {
                            i3++;
                            ByteBuffer byteBufferV = y90.v(byteBufferOrder);
                            ByteBuffer byteBufferV2 = y90.v(byteBufferV);
                            int i5 = byteBufferV.getInt();
                            int i6 = byteBufferV.getInt();
                            e51 e51VarA = e51.a(i4);
                            byte[] bArrQ = y90.Q(byteBufferV);
                            if (i70Var != null) {
                                rt0 rt0Var = e51VarA.f;
                                String str = (String) rt0Var.a;
                                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) rt0Var.b;
                                try {
                                    PublicKey publicKey = i70Var.c.getPublicKey();
                                    Signature signature = Signature.getInstance(str);
                                    signature.initVerify(publicKey);
                                    if (algorithmParameterSpec != null) {
                                        signature.setParameter(algorithmParameterSpec);
                                    }
                                    signature.update(byteBufferV2);
                                    if (!signature.verify(bArrQ)) {
                                        throw new SecurityException("Unable to verify signature of certificate #" + i3 + " using " + str + " when verifying V3SigningCertificateLineage object");
                                    }
                                } catch (BufferUnderflowException e) {
                                    e = e;
                                    throw new IOException("Failed to parse V3SigningCertificateLineage object", e);
                                }
                            }
                            byteBufferV2.rewind();
                            byte[] bArrQ2 = y90.Q(byteBufferV2);
                            int i7 = byteBufferV2.getInt();
                            if (i70Var != null && i4 != i7) {
                                throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferV + " when verifying V3SigningCertificateLineage object");
                            }
                            i70 i70Var2 = new i70(qh1.a(bArrQ2), bArrQ2);
                            if (hashSet.contains(i70Var2)) {
                                throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i3 + ".  All signing certificates should be unique");
                            }
                            hashSet.add(i70Var2);
                            arrayList.add(new gd1(i70Var2, e51.a(i7), e51.a(i6), bArrQ, i5));
                            i70Var = i70Var2;
                            i4 = i6;
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            i2 = i3;
                            throw new SecurityException(q51.k(i2, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            i2 = i3;
                            throw new SecurityException(q51.k(i2, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                        } catch (NoSuchAlgorithmException e4) {
                            e = e4;
                            i2 = i3;
                            throw new SecurityException(q51.k(i2, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                        } catch (SignatureException e5) {
                            e = e5;
                            i2 = i3;
                            throw new SecurityException(q51.k(i2, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                        } catch (CertificateException e6) {
                            e = e6;
                            i2 = i3;
                            throw new SecurityException(q51.k(i2, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e);
                        }
                    }
                    h51Var = null;
                } catch (i9 | BufferUnderflowException e7) {
                    e = e7;
                }
            } catch (InvalidAlgorithmParameterException e8) {
                e = e8;
            } catch (InvalidKeyException e9) {
                e = e9;
            } catch (NoSuchAlgorithmException e10) {
                e = e10;
            } catch (SignatureException e11) {
                e = e11;
            } catch (CertificateException e12) {
                e = e12;
            }
        }
        if (arrayList == null) {
            id.q("Can't calculate minimum SDK version of null nodes");
            return h51Var;
        }
        int size = arrayList.size();
        int i8 = 28;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e51 e51Var = ((gd1) obj).c;
            if (e51Var != null && (i = e51Var.g) > i8) {
                i8 = i;
            }
        }
        return new h51(i8, arrayList);
    }

    public final h51 b(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                id.q("Certificate not found in SigningCertificateLineage");
                return null;
            }
            if (((gd1) arrayList.get(i)).a.equals(x509Certificate)) {
                return new h51(this.a, new ArrayList(arrayList.subList(0, i + 1)));
            }
            i++;
        }
    }
}
