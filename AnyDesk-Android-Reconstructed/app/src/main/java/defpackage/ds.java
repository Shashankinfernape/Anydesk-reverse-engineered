package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public abstract class ds {
    public static final bx b;
    public static final bx c;
    public static final bx d;
    public static final bx e;
    public static final bx f;
    public static final bx g;
    public static Field r;
    public static boolean s;
    public static Class t;
    public static boolean u;
    public static Field v;
    public static boolean w;
    public static Field x;
    public static boolean y;
    public static final fq[] a = {fq.CHUNKED_SHA512, fq.VERITY_CHUNKED_SHA256, fq.CHUNKED_SHA256};
    public static final ix h = new ix(false);
    public static final ix i = new ix(true);
    public static final byte[] j = {48, 49, 53, 0};
    public static final byte[] k = {48, 49, 48, 0};
    public static final byte[] l = {48, 48, 57, 0};
    public static final byte[] m = {48, 48, 53, 0};
    public static final byte[] n = {48, 48, 49, 0};
    public static final byte[] o = {48, 48, 49, 0};
    public static final byte[] p = {48, 48, 50, 0};
    public static final int[] q = {R.attr.stateListAnimator};

    static {
        int i2 = 2;
        b = new bx("CLOSED", i2);
        c = new bx("COMPLETING_ALREADY", i2);
        d = new bx("COMPLETING_WAITING_CHILDREN", i2);
        e = new bx("COMPLETING_RETRY", i2);
        f = new bx("TOO_LATE_TO_CANCEL", i2);
        g = new bx("SEALED", i2);
    }

    public ds() {
        new ConcurrentHashMap();
    }

    public static ql0 A(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    ql0 ql0Var = new ql0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ql0Var.f = byteBufferDuplicate;
                    ql0Var.c = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ql0Var.d = i7;
                    ql0Var.e = ((ByteBuffer) ql0Var.f).getShort(i7);
                    return ql0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void C(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.anydesk.anydeskandroid.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.anydesk.anydeskandroid.R.attr.state_liftable, -com.anydesk.anydeskandroid.R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final String F(rq rqVar) {
        Object py0Var;
        if (rqVar instanceof pu) {
            return ((pu) rqVar).toString();
        }
        try {
            py0Var = rqVar + '@' + s(rqVar);
        } catch (Throwable th) {
            py0Var = new py0(th);
        }
        if (qy0.a(py0Var) != null) {
            py0Var = rqVar.getClass().getName() + '@' + s(rqVar);
        }
        return (String) py0Var;
    }

    public static final Object G(Object obj) {
        a90 a90Var;
        b90 b90Var = obj instanceof b90 ? (b90) obj : null;
        return (b90Var == null || (a90Var = b90Var.a) == null) ? obj : a90Var;
    }

    public static void H(bs bsVar, bs bsVar2, ByteBuffer byteBuffer, HashSet hashSet, u9 u9Var) {
        int i2 = mz0.b;
        if (hashSet.isEmpty()) {
            throw new RuntimeException("No content digests found");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        int iPosition = byteBuffer.position();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        byteBuffer.position(iPosition);
        bu0.F(byteBufferAllocate, bsVar.size());
        try {
            HashMap mapF = f(hashSet, bsVar, bsVar2, new ai(byteBufferAllocate, true));
            if (mapF.containsKey(fq.VERITY_CHUNKED_SHA256)) {
                if (bsVar.size() % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block is not aligned on 4k boundary: " + bsVar.size());
                }
                bu0.e(byteBuffer);
                long j2 = (((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L) - bsVar.size();
                if (j2 % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block size is not multiple of page size: " + j2);
                }
            }
            if (!hashSet.equals(mapF.keySet())) {
                StringBuilder sb = new StringBuilder("Mismatch between sets of requested and computed content digests . Requested: ");
                sb.append(hashSet);
                Set setKeySet = mapF.keySet();
                sb.append(", computed: ");
                sb.append(setKeySet);
                throw new RuntimeException(sb.toString());
            }
            ArrayList arrayList = u9Var.g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                t9 t9Var = (t9) obj;
                ArrayList arrayList2 = t9Var.g;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    r9 r9Var = (r9) obj2;
                    e51 e51VarA = e51.a(r9Var.a);
                    if (e51VarA != null) {
                        fq fqVar = e51VarA.e;
                        if (hashSet.contains(fqVar)) {
                            byte[] bArr = r9Var.b;
                            byte[] bArr2 = (byte[]) mapF.get(fqVar);
                            if (Arrays.equals(bArr, bArr2)) {
                                t9Var.h.put(fqVar, bArr2);
                            } else {
                                int i5 = u9Var.a;
                                if (i5 == 2) {
                                    t9Var.f(ea.a0, fqVar, y90.X(bArr), y90.X(bArr2));
                                } else if (i5 == 3) {
                                    t9Var.f(ea.y0, fqVar, y90.X(bArr), y90.X(bArr2));
                                }
                            }
                        }
                    }
                }
            }
        } catch (DigestException e2) {
            throw new RuntimeException("Failed to compute content digests", e2);
        }
    }

    public static BiometricPrompt.CryptoObject I(ah ahVar) {
        IdentityCredential identityCredential;
        if (ahVar == null) {
            return null;
        }
        Cipher cipher = (Cipher) ahVar.b;
        if (cipher != null) {
            return sr.b(cipher);
        }
        Signature signature = (Signature) ahVar.a;
        if (signature != null) {
            return sr.a(signature);
        }
        Mac mac = (Mac) ahVar.c;
        if (mac != null) {
            return sr.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) ahVar.d) == null) {
            return null;
        }
        return tr.a(identityCredential);
    }

    public static Object J(d60 d60Var, Object obj, rq rqVar) {
        d60Var.getClass();
        br brVarE = rqVar.e();
        Object z90Var = brVarE == kx.c ? new z90(rqVar) : new aa0(rqVar, brVarE);
        ec1.g(2, d60Var);
        return d60Var.f(obj, z90Var);
    }

    public static void a(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >> 8) & 255);
        bArr[3] = (byte) ((i2 >> 16) & 255);
        bArr[4] = (byte) ((i2 >> 24) & 255);
    }

    public static final Object b(ss0 ss0Var, int i2) {
        if (i2 < 0 || i2 >= ss0Var.e()) {
            id.n("Index: ", i2, ", Size: ", ss0Var.e());
            return null;
        }
        int i3 = i2 - ss0Var.c;
        if (i3 < 0 || i3 >= ss0Var.b) {
            return null;
        }
        return ss0Var.b(i3);
    }

    public static final void d(int i2) {
        if (i2 >= 1) {
            return;
        }
        nh0.e(gr0.e(i2, "Expected positive parallelism level, but got "));
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static HashMap f(HashSet hashSet, bs bsVar, bs bsVar2, ai aiVar) throws DigestException {
        int i2 = mz0.b;
        HashMap map = new HashMap();
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fq fqVar = (fq) it.next();
            if (fqVar == fq.CHUNKED_SHA256 || fqVar == fq.CHUNKED_SHA512) {
                hashSet2.add(fqVar);
            }
        }
        int i3 = 0;
        bs[] bsVarArr = {bsVar, bsVar2, aiVar};
        long size = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            size += (bsVarArr[i4].size() + 1048575) / 1048576;
        }
        if (size > 2147483647L) {
            throw new DigestException("Input too long: " + size + " chunks");
        }
        int i5 = (int) size;
        ArrayList arrayList = new ArrayList(hashSet2.size());
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new m9((fq) it2.next(), i5));
        }
        o9 o9Var = new o9(bsVarArr);
        int i6 = lz0.a;
        new l9(o9Var, arrayList).run();
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            m9 m9Var = (m9) obj;
            map.put(m9Var.a, MessageDigest.getInstance(m9Var.a.d).digest(m9Var.c));
        }
        fq fqVar2 = fq.VERITY_CHUNKED_SHA256;
        if (!hashSet.contains(fqVar2)) {
            return map;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(40);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        vd1 vd1Var = new vd1(new byte[8]);
        try {
            byteBufferAllocate.put(vd1Var.b(bsVar, bsVar2, aiVar));
            byteBufferAllocate.putLong(bsVar.size() + bsVar2.size() + ((long) aiVar.b));
            map.put(fqVar2, byteBufferAllocate.array());
            vd1Var.close();
            return map;
        } catch (Throwable th) {
            try {
                vd1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static ah g() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = rr.b("androidxBiometric", 3);
            rr.d(builderB);
            rr.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            rr.c(keyGenerator, rr.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new ah(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e2) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e2);
            return null;
        }
    }

    public static byte[] l(PublicKey publicKey) throws InvalidKeyException {
        byte[] encoded = null;
        if ("X.509".equals(publicKey.getFormat())) {
            byte[] encoded2 = publicKey.getEncoded();
            String algorithm = publicKey.getAlgorithm();
            if ("RSA".equals(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
                try {
                    if (d6.w(ByteBuffer.wrap(encoded2), r71.class) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (fe | je e2) {
                    System.out.println("Caught a exception encoding the public key: " + e2);
                    e2.printStackTrace();
                }
            } else {
                encoded = encoded2;
            }
        }
        if (encoded == null) {
            try {
                encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            } catch (InvalidKeySpecException e3) {
                StringBuilder sb = new StringBuilder("Failed to obtain X.509 encoded form of public key ");
                sb.append(publicKey);
                String name = publicKey.getClass().getName();
                sb.append(" of class ");
                sb.append(name);
                throw new InvalidKeyException(sb.toString(), e3);
            }
        }
        if (encoded != null && encoded.length != 0) {
            return encoded;
        }
        StringBuilder sb2 = new StringBuilder("Failed to obtain X.509 encoded form of public key ");
        sb2.append(publicKey);
        String name2 = publicKey.getClass().getName();
        sb2.append(" of class ");
        sb2.append(name2);
        throw new InvalidKeyException(sb2.toString());
    }

    public static r30 m(r30[] r30VarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        r30 r30Var = null;
        int i4 = Integer.MAX_VALUE;
        for (r30 r30Var2 : r30VarArr) {
            int iAbs = (Math.abs(r30Var2.c - i3) * 2) + (r30Var2.d == z ? 0 : 1);
            if (r30Var == null || i4 > iAbs) {
                r30Var = r30Var2;
                i4 = iAbs;
            }
        }
        return r30Var;
    }

    public static final Object n(w01 w01Var, long j2, d60 d60Var) {
        while (true) {
            if (w01Var.e >= j2 && !w01Var.f()) {
                return w01Var;
            }
            Object objD = w01Var.d();
            bx bxVar = b;
            if (objD == bxVar) {
                return bxVar;
            }
            w01 w01Var2 = (w01) ((ho) objD);
            if (w01Var2 == null) {
                w01Var2 = (w01) d60Var.f(Long.valueOf(w01Var.e + 1), w01Var);
                if (w01Var.i(w01Var2)) {
                    if (w01Var.f()) {
                        w01Var.h();
                    }
                }
            }
            w01Var = w01Var2;
        }
    }

    public static void o(Object obj) {
        LongSparseArray longSparseArray;
        if (!u) {
            try {
                t = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            u = true;
        }
        Class cls = t;
        if (cls == null) {
            return;
        }
        if (!w) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                v = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            w = true;
        }
        Field field = v;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static lo0 p(String str, String str2) {
        lo0 lo0Var;
        boolean zEquals = "integer".equals(str);
        lh lhVar = lo0.o;
        if (zEquals) {
            lo0Var = lo0.b;
        } else if ("integer[]".equals(str)) {
            lo0Var = lo0.d;
        } else if ("List<Int>".equals(str)) {
            lo0Var = lo0.e;
        } else if ("long".equals(str)) {
            lo0Var = lo0.f;
        } else if ("long[]".equals(str)) {
            lo0Var = lo0.g;
        } else if ("List<Long>".equals(str)) {
            lo0Var = lo0.h;
        } else if ("boolean".equals(str)) {
            lo0Var = lo0.l;
        } else if ("boolean[]".equals(str)) {
            lo0Var = lo0.m;
        } else if ("List<Boolean>".equals(str)) {
            lo0Var = lo0.n;
        } else if ("string".equals(str)) {
            lo0Var = lhVar;
        } else if ("string[]".equals(str)) {
            lo0Var = lo0.p;
        } else if ("List<String>".equals(str)) {
            lo0Var = lo0.q;
        } else if ("float".equals(str)) {
            lo0Var = lo0.i;
        } else if ("float[]".equals(str)) {
            lo0Var = lo0.j;
        } else {
            lo0Var = "List<Float>".equals(str) ? lo0.k : null;
        }
        if (lo0Var != null) {
            return lo0Var;
        }
        if ("reference".equals(str)) {
            return lo0.c;
        }
        if (str.length() == 0) {
            return lhVar;
        }
        try {
            String strConcat = (!str.startsWith(".") || str2 == null) ? str : str2.concat(str);
            boolean zEndsWith = str.endsWith("[]");
            if (zEndsWith) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
            }
            lo0 lo0VarY = y(Class.forName(strConcat), zEndsWith);
            if (lo0VarY != null) {
                return lo0VarY;
            }
            throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ t10 q(o60 o60Var, o70 o70Var, int i2, oh ohVar, int i3) {
        br brVar = o70Var;
        if ((i3 & 1) != 0) {
            brVar = kx.c;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            ohVar = oh.c;
        }
        return o60Var.b(brVar, i2, ohVar);
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ew.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final xi t(rq rqVar) {
        if (!(rqVar instanceof pu)) {
            return new xi(1, rqVar);
        }
        xi xiVarM = ((pu) rqVar).m();
        if (xiVarM != null) {
            if (!xiVarM.C()) {
                xiVarM = null;
            }
            if (xiVarM != null) {
                return xiVarM;
            }
        }
        return new xi(2, rqVar);
    }

    public static rq u(rq rqVar) {
        rqVar.getClass();
        sq sqVar = rqVar instanceof sq ? (sq) rqVar : null;
        if (sqVar == null || (rqVar = sqVar.e) != null) {
            return rqVar;
        }
        dr drVar = (dr) sqVar.e().l(fw.d);
        rq puVar = drVar != null ? new pu(drVar, sqVar) : sqVar;
        sqVar.e = puVar;
        return puVar;
    }

    public static boolean v(View view) {
        WeakHashMap weakHashMap = oe1.a;
        return view.getLayoutDirection() == 1;
    }

    public static lu0 w(Context context, String str, int i2, String str2, y90 y90Var) {
        lu0 lu0Var = new lu0(str, y90Var);
        lu0Var.b = str2;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Looper looper = t70.a;
        imageView.setColorFilter(uj.l(context, com.anydesk.anydeskandroid.R.color.colorPieText));
        lu0Var.a = imageView;
        return lu0Var;
    }

    public static float x(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ew.c(edgeEffect, f2, f3);
        }
        dw.a(edgeEffect, f2, f3);
        return f2;
    }

    public static lo0 y(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new ho0(cls) : new io0(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new go0(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new jo0(cls) : new ko0(cls);
        }
        return null;
    }

    public static PorterDuff.Mode z(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public abstract void D();

    public abstract void E();

    public boolean c() {
        return false;
    }

    public abstract Typeface h(Context context, o30 o30Var, Resources resources, int i2);

    public abstract Typeface i(Context context, r30[] r30VarArr, int i2);

    public Typeface j(int i2, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i2, String str, int i3) {
        File fileC = y90.C(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (y90.j(fileC, resources, i2)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public void B() {
    }
}
