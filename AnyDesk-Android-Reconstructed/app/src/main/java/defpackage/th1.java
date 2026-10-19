package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.anydesk.anydeskandroid.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class th1 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final bx e = new bx("REMOVED_TASK", 2);
    public static final bx f = new bx("CLOSED_EMPTY", 2);
    public static final boolean[] g = new boolean[3];
    public static final int[] h = {R.attr.colorPrimary};
    public static final int[] i = {R.attr.colorPrimaryVariant};

    public static boolean A(Context context) {
        KeyguardManager keyguardManagerS = s(context);
        if (keyguardManagerS == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 ? oe0.b(keyguardManagerS) : ne0.a(keyguardManagerS);
    }

    public static z61 B(kr krVar, zq zqVar, nr nrVar, d60 d60Var, int i2) {
        br brVar = zqVar;
        if ((i2 & 1) != 0) {
            brVar = kx.c;
        }
        if ((i2 & 2) != 0) {
            nrVar = nr.c;
        }
        br brVarK = ec1.k(krVar.f(), brVar, true);
        us usVar = su.a;
        if (brVarK != usVar && brVarK.l(fw.d) == null) {
            brVarK = brVarK.j(usVar);
        }
        nrVar.getClass();
        z61 te0Var = nrVar == nr.d ? new te0(brVarK, d60Var) : new z61(brVarK, true);
        te0Var.i0(nrVar, te0Var, d60Var);
        return te0Var;
    }

    public static float C(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final nk0 D(vm0 vm0Var, z50 z50Var) {
        vm0Var.getClass();
        nk0 nk0Var = vm0Var.e != vm0.k ? new nk0(z50Var.h(vm0Var.d())) : new nk0();
        nk0Var.m(vm0Var, new e50(new m70(nk0Var, 3, z50Var), 1));
        return nk0Var;
    }

    public static TypedArray E(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        b(context, attributeSet, i2, i3);
        e(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static n30 K(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i2;
        ?? r3;
        Throwable th;
        ?? r4;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            W(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sv0.b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sv0.c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            W(xmlResourceParser);
                        }
                        arrayList.add(new p30(string7, i5, z, string6, i7, resourceId2));
                    } else {
                        W(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new o30((p30[]) arrayList.toArray(new p30[0]));
        }
        List listM = M(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sv0.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            try {
                                W(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                            }
                        }
                        r3 = typedArrayObtainAttributes3;
                        try {
                            g30 g30Var = new g30(string, string2, string8, listM, string9, string10);
                            if (r3 instanceof AutoCloseable) {
                                ((AutoCloseable) r3).close();
                            } else if (r3 instanceof ExecutorService) {
                                d30.b((ExecutorService) r3);
                            } else {
                                r3.recycle();
                            }
                            arrayList2.add(g30Var);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th3;
                    } catch (Throwable th4) {
                        th = th4;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 == 0) {
                        throw th;
                    }
                    try {
                        if (r4 instanceof AutoCloseable) {
                            ((AutoCloseable) r4).close();
                        } else if (r4 instanceof ExecutorService) {
                            d30.b((ExecutorService) r4);
                        } else {
                            r4.recycle();
                        }
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                        throw th;
                    }
                }
                W(xmlResourceParser);
                integer = integer;
                i2 = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i9 = integer;
        if (!arrayList2.isEmpty()) {
            return new q30(arrayList2, i9, integer2, string5);
        }
        if (string3 == null) {
            id.q("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new g30(string, string2, string3, listM, null, null));
        if (string4 != null) {
            arrayList2.add(new g30(string, string2, string4, listM, null, null));
        }
        return new q30(arrayList2, i9, integer2, string5);
    }

    public static final Object L(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static List M(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void N(byte[] bArr, i70 i70Var, j9 j9Var) {
        ArrayList arrayList;
        try {
            ArrayList arrayListF = ec1.F(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
            int i2 = 0;
            while (true) {
                int size = arrayListF.size();
                arrayList = j9Var.c;
                if (i2 >= size) {
                    break;
                }
                arrayList.add(((s51) arrayListF.get(i2)).a);
                i2++;
            }
            if (i70Var.equals(arrayList.get(arrayList.size() - 1))) {
                return;
            }
            j9Var.a(34, new Object[0]);
        } catch (IllegalArgumentException unused) {
            j9Var.a(34, new Object[0]);
        } catch (SecurityException unused2) {
            j9Var.a(35, new Object[0]);
        } catch (Exception unused3) {
            j9Var.a(33, new Object[0]);
        }
    }

    public static final void O(xi xiVar, rq rqVar, boolean z) {
        Object objU = xiVar.u();
        Throwable thF = xiVar.f(objU);
        Object py0Var = thF != null ? new py0(thF) : xiVar.h(objU);
        if (!z) {
            rqVar.g(py0Var);
            return;
        }
        rqVar.getClass();
        pu puVar = (pu) rqVar;
        sq sqVar = puVar.g;
        Object obj = puVar.i;
        br brVarE = sqVar.e();
        Object objJ = uj.J(brVarE, obj);
        sc1 sc1VarJ = objJ != uj.e ? ec1.J(sqVar, brVarE, objJ) : null;
        try {
            sqVar.g(py0Var);
        } finally {
            if (sc1VarJ == null || sc1VarJ.k0()) {
                uj.B(brVarE, objJ);
            }
        }
    }

    public static void S(View view, hk0 hk0Var) {
        lw lwVar = hk0Var.c.b;
        if (lwVar == null || !lwVar.a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = oe1.a;
            fE += ge1.e((View) parent);
        }
        gk0 gk0Var = hk0Var.c;
        if (gk0Var.l != fE) {
            gk0Var.l = fE;
            hk0Var.r();
        }
    }

    public static void W(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static w90 Y(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new w90(i2, i3 - 1, 1);
        }
        w90 w90Var = w90.f;
        return w90.f;
    }

    public static z7 Z(vy vyVar, z9 z9Var, byte[] bArr, HashMap map, int i2) {
        z7 z7Var = new z7(0);
        ByteBuffer byteBuffer = y90.p(vyVar, z9Var, 1845461005).a;
        j9 j9Var = new j9();
        ((ArrayList) z7Var.c).add(j9Var);
        try {
            b0(y90.v(byteBuffer), CertificateFactory.getInstance("X.509"), j9Var, t(map), bArr, i2);
            z7Var.b = (z7Var.a() || z7Var.b()) ? false : true;
            return z7Var;
        } catch (i9 | BufferUnderflowException unused) {
            j9Var.a(20, new Object[0]);
            return z7Var;
        } catch (CertificateException e2) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e2);
        }
    }

    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = fa0.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = qu0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void a0(byte[] bArr, int i2, i70 i70Var, ByteBuffer byteBuffer, j9 j9Var) {
        ArrayList arrayList = new ArrayList(1);
        int i3 = 0;
        while (byteBuffer.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferV = y90.v(byteBuffer);
                int i4 = byteBufferV.getInt();
                byte[] bArrQ = y90.Q(byteBufferV);
                e51 e51VarA = e51.a(i4);
                if (e51VarA == null) {
                    j9Var.d.add(new ba(19, Integer.valueOf(i4)));
                } else {
                    arrayList.add(new y9(e51VarA, bArrQ));
                }
            } catch (i9 | BufferUnderflowException unused) {
                j9Var.a(20, Integer.valueOf(i3));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            j9Var.a(17, new Object[0]);
            return;
        }
        try {
            ArrayList arrayListB = y90.B(arrayList, i2, Integer.MAX_VALUE, true);
            int size = arrayListB.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayListB.get(i5);
                i5++;
                y9 y9Var = (y9) obj;
                e51 e51Var = y9Var.a;
                rt0 rt0Var = e51Var.f;
                String str = (String) rt0Var.a;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) rt0Var.b;
                PublicKey publicKey = i70Var.c.getPublicKey();
                try {
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(publicKey);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(bArr);
                    if (!signature.verify(y9Var.b)) {
                        j9Var.a(21, e51Var);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    j9Var.a(22, e51Var, e);
                    return;
                } catch (InvalidKeyException e3) {
                    e = e3;
                    j9Var.a(22, e51Var, e);
                    return;
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                    j9Var.a(22, e51Var, e);
                    return;
                } catch (SignatureException e5) {
                    e = e5;
                    j9Var.a(22, e51Var, e);
                    return;
                }
            }
        } catch (up0 e6) {
            StringBuilder sb = new StringBuilder();
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                y9 y9Var2 = (y9) obj2;
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(y9Var2.a);
            }
            j9Var.a(26, sb.toString(), e6);
        }
    }

    public static void b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.G, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                f(context, i, "Theme.MaterialComponents");
            }
        }
        f(context, h, "Theme.AppCompat");
    }

    public static void b0(ByteBuffer byteBuffer, CertificateFactory certificateFactory, j9 j9Var, HashMap map, byte[] bArr, int i2) throws i9, NoSuchAlgorithmException {
        byte[] bArrQ = y90.Q(byteBuffer);
        i70 i70Var = null;
        try {
            i70 i70Var2 = new i70((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrQ)), bArrQ);
            j9Var.b.add(i70Var2);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrQ);
            byte[] bArrDigest = messageDigest.digest();
            if (Arrays.equals(bArr, bArrDigest)) {
                i70Var = i70Var2;
            } else {
                j9Var.a(27, y90.X(bArrDigest), y90.X(bArr));
            }
        } catch (CertificateException e2) {
            j9Var.a(18, e2);
        }
        if (j9Var.c() || j9Var.b()) {
            return;
        }
        ByteBuffer byteBufferV = y90.v(byteBuffer);
        HashMap map2 = new HashMap();
        while (byteBufferV.hasRemaining()) {
            ByteBuffer byteBufferV2 = y90.v(byteBufferV);
            map2.put(Integer.valueOf(byteBufferV2.getInt()), y90.v(byteBufferV2));
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 31) {
                if (!map2.containsKey(entry.getKey())) {
                    j9Var.a(17, new Object[0]);
                    return;
                }
                a0((byte[]) entry.getValue(), i2, i70Var, (ByteBuffer) map2.get(entry.getKey()), j9Var);
                if (j9Var.c() || j9Var.b()) {
                    return;
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferV3 = y90.v(byteBuffer);
            ByteBuffer byteBufferV4 = y90.v(byteBuffer);
            byte[] bArr2 = new byte[byteBufferV3.remaining()];
            byteBufferV3.get(bArr2);
            byteBufferV3.flip();
            a0(bArr2, i2, i70Var, byteBufferV4, j9Var);
            if (j9Var.b() || j9Var.c()) {
                return;
            }
            ByteBuffer byteBufferV5 = y90.v(byteBufferV3);
            int i3 = 0;
            while (byteBufferV5.hasRemaining()) {
                i3++;
                try {
                    ByteBuffer byteBufferV6 = y90.v(byteBufferV5);
                    int i4 = byteBufferV6.getInt();
                    byte[] bArr3 = new byte[byteBufferV6.remaining()];
                    byteBufferV6.get(bArr3);
                    if (i4 == -1654455305) {
                        N(bArr3, i70Var, j9Var);
                    } else if (i4 == -465807034) {
                        long j = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN).getLong();
                        if (j <= 0) {
                            j9Var.a(38, Long.valueOf(j));
                        }
                    } else {
                        j9Var.d.add(new ba(32, Integer.valueOf(i4)));
                    }
                } catch (i9 | BufferUnderflowException unused) {
                    j9Var.a(31, Integer.valueOf(i3));
                    return;
                }
            }
        }
    }

    public static void c(cq cqVar, xf0 xf0Var, bq bqVar) {
        bqVar.o = -1;
        np npVar = bqVar.M;
        int[] iArr = bqVar.p0;
        np npVar2 = bqVar.L;
        np npVar3 = bqVar.J;
        np npVar4 = bqVar.K;
        np npVar5 = bqVar.I;
        bqVar.p = -1;
        int[] iArr2 = cqVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = npVar5.g;
            int iQ = cqVar.q() - npVar4.g;
            npVar5.i = xf0Var.k(npVar5);
            npVar4.i = xf0Var.k(npVar4);
            xf0Var.d(npVar5.i, i2);
            xf0Var.d(npVar4.i, iQ);
            bqVar.o = 2;
            bqVar.Y = i2;
            int i3 = iQ - i2;
            bqVar.U = i3;
            int i4 = bqVar.b0;
            if (i3 < i4) {
                bqVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = npVar3.g;
        int iK = cqVar.k() - npVar2.g;
        npVar3.i = xf0Var.k(npVar3);
        npVar2.i = xf0Var.k(npVar2);
        xf0Var.d(npVar3.i, i5);
        xf0Var.d(npVar2.i, iK);
        if (bqVar.a0 > 0 || bqVar.g0 == 8) {
            r51 r51VarK = xf0Var.k(npVar);
            npVar.i = r51VarK;
            xf0Var.d(r51VarK, bqVar.a0 + i5);
        }
        bqVar.p = 2;
        bqVar.Z = i5;
        int i6 = iK - i5;
        bqVar.V = i6;
        int i7 = bqVar.c0;
        if (i6 < i7) {
            bqVar.V = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c0(br brVar, d60 d60Var, rq rqVar) throws Throwable {
        br brVarE = rqVar.e();
        br brVarJ = !((Boolean) brVar.h(Boolean.FALSE, new hn(2))).booleanValue() ? brVarE.j(brVar) : ec1.k(brVarE, brVar, false);
        y90.n(brVarJ);
        if (brVarJ == brVarE) {
            m01 m01Var = new m01(rqVar, brVarJ);
            return bu0.L(m01Var, true, m01Var, d60Var);
        }
        fw fwVar = fw.d;
        if (y90.e(brVarJ.l(fwVar), brVarE.l(fwVar))) {
            sc1 sc1Var = new sc1(rqVar, brVarJ);
            br brVar2 = sc1Var.g;
            Object objJ = uj.J(brVar2, null);
            try {
                return bu0.L(sc1Var, true, sc1Var, d60Var);
            } finally {
                uj.B(brVar2, objJ);
            }
        }
        qu quVar = new qu(rqVar, brVarJ);
        try {
            r71.K(ds.u(((ag) d60Var).j(quVar, quVar)), uc1.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qu.i;
            do {
                int i2 = atomicIntegerFieldUpdater.get(quVar);
                if (i2 != 0) {
                    if (i2 != 2) {
                        nh0.j("Already suspended");
                        return null;
                    }
                    Object objG = ds.G(quVar.J());
                    if (objG instanceof on) {
                        throw ((on) objG).a;
                    }
                    return objG;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(quVar, 0, 1));
            return lr.c;
        } catch (Throwable th) {
            th = th;
            if (th instanceof ou) {
                th = ((ou) th).c;
            }
            quVar.g(y90.m(th));
            throw th;
        }
    }

    public static void d(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new w90(2, 36, 1));
        }
    }

    public static float d0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void e(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.G, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        id.q("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void f(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                id.q(gr0.f("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int h(int i2, w90 w90Var) {
        w90Var.getClass();
        int i3 = w90Var.d;
        int i4 = w90Var.c;
        if (!w90Var.isEmpty()) {
            if (i2 < i4) {
                return i4;
            }
            return i2 > i3 ? i3 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + w90Var + '.');
    }

    public static long i(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static int k(dx0 dx0Var, ow owVar, View view, View view2, rw0 rw0Var, boolean z) {
        if (rw0Var.v() == 0 || dx0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(rw0.G(view) - rw0.G(view2)) + 1;
        }
        return Math.min(owVar.l(), owVar.b(view2) - owVar.e(view));
    }

    public static int l(dx0 dx0Var, ow owVar, View view, View view2, rw0 rw0Var, boolean z, boolean z2) {
        if (rw0Var.v() == 0 || dx0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (dx0Var.b() - Math.max(rw0.G(view), rw0.G(view2))) - 1) : Math.max(0, Math.min(rw0.G(view), rw0.G(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(owVar.b(view2) - owVar.e(view)) / (Math.abs(rw0.G(view) - rw0.G(view2)) + 1))) + (owVar.k() - owVar.e(view)));
        }
        return iMax;
    }

    public static int m(dx0 dx0Var, ow owVar, View view, View view2, rw0 rw0Var, boolean z) {
        if (rw0Var.v() == 0 || dx0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return dx0Var.b();
        }
        return (int) (((owVar.b(view2) - owVar.e(view)) / (Math.abs(rw0.G(view) - rw0.G(view2)) + 1)) * dx0Var.b());
    }

    public static r71 n(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new iz0() : new wr();
        }
        return new iz0();
    }

    public static final boolean p(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static vn0 q(xn0 xn0Var) {
        Iterator it = h11.c0(xn0Var, new a0(16)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (vn0) next;
    }

    public static KeyguardManager s(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return oe0.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static HashMap t(HashMap map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Map map3 = (Map) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList.add(new rt0(Integer.valueOf(((fq) entry2.getKey()).c), (byte[]) entry2.getValue()));
            }
            Collections.sort(arrayList, new he(7));
            Integer num = (Integer) entry.getKey();
            int size = arrayList.size();
            int i2 = 0;
            int length = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                length += ((byte[]) ((rt0) obj).b).length + 12;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                rt0 rt0Var = (rt0) obj2;
                byte[] bArr = (byte[]) rt0Var.b;
                byteBufferAllocate.putInt(bArr.length + 8);
                byteBufferAllocate.putInt(((Integer) rt0Var.a).intValue());
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            map2.put(num, byteBufferAllocate.array());
        }
        return map2;
    }

    public static final void v(br brVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = er.a.iterator();
        while (it.hasNext()) {
            try {
                ((j8) it.next()).e(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            a(th, new st(brVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final int x(zd zdVar, Object obj, int i2) {
        int i3 = zdVar.e;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iF = y90.f(i3, i2, zdVar.c);
            if (iF < 0 || y90.e(obj, zdVar.d[iF])) {
                return iF;
            }
            int i4 = iF + 1;
            while (i4 < i3 && zdVar.c[i4] == i2) {
                if (y90.e(obj, zdVar.d[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iF - 1; i5 >= 0 && zdVar.c[i5] == i2; i5--) {
                if (y90.e(obj, zdVar.d[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int y(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return cn.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public abstract void F();

    public abstract boolean H(int i2, KeyEvent keyEvent);

    public boolean I(KeyEvent keyEvent) {
        return false;
    }

    public boolean J() {
        return false;
    }

    public abstract void P(boolean z);

    public abstract void Q(boolean z);

    public abstract void R(boolean z);

    public abstract void T(boolean z);

    public abstract void U(CharSequence charSequence);

    public abstract void V();

    public a6 X(bc bcVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public abstract boolean j();

    public abstract void o(boolean z);

    public abstract int r();

    public abstract Context u();

    public abstract void w();

    public boolean z() {
        return false;
    }

    public void G() {
    }
}
