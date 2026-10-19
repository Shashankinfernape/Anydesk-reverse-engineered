package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 {
    public static ExecutorService b;
    public static long h;
    public static Method i;
    public static final Object a = new Object();
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final bx d = new bx("NULL", 2);
    public static final bx e = new bx("UNINITIALIZED", 2);
    public static final bx f = new bx("NONE", 2);
    public static final bx g = new bx("PENDING", 2);

    public static void D(ByteBuffer byteBuffer, CertificateFactory certificateFactory, t9 t9Var, HashSet hashSet, Map map, HashSet hashSet2, int i2) throws i9, NoSuchAlgorithmException {
        byte[] encoded;
        ByteBuffer byteBufferV = y90.v(byteBuffer);
        byteBufferV.get(new byte[byteBufferV.remaining()]);
        byteBufferV.flip();
        ArrayList arrayList = t9Var.g;
        ArrayList arrayList2 = t9Var.b;
        ArrayList arrayList3 = t9Var.i;
        ByteBuffer byteBufferV2 = y90.v(byteBuffer);
        byte[] bArrQ = y90.Q(byteBuffer);
        ArrayList arrayList4 = new ArrayList(1);
        int i3 = 0;
        while (byteBufferV2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferV3 = y90.v(byteBufferV2);
                int i4 = byteBufferV3.getInt();
                byte[] bArrQ2 = y90.Q(byteBufferV3);
                arrayList3.add(new s9(i4));
                e51 e51VarA = e51.a(i4);
                if (e51VarA == null) {
                    t9Var.g(ea.R, Integer.valueOf(i4));
                } else {
                    arrayList4.add(new w9(e51VarA, bArrQ2));
                }
            } catch (i9 | BufferUnderflowException unused) {
                t9Var.f(ea.K, Integer.valueOf(i3));
                return;
            }
        }
        if (arrayList3.isEmpty()) {
            t9Var.f(ea.V, new Object[0]);
            return;
        }
        try {
            ArrayList arrayListB = y90.B(arrayList4, i2, Integer.MAX_VALUE, false);
            int size = arrayListB.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayListB.get(i5);
                i5++;
                w9 w9Var = (w9) obj;
                e51 e51Var = w9Var.a;
                rt0 rt0Var = e51Var.f;
                String str = (String) rt0Var.a;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) rt0Var.b;
                try {
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
                            t9Var.f(ea.U, e51Var);
                            return;
                        } else {
                            t9Var.j.put(e51Var, bArr);
                            hashSet.add(e51Var.e);
                        }
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        t9Var.f(ea.T, e51Var, e);
                        return;
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        t9Var.f(ea.T, e51Var, e);
                        return;
                    } catch (SignatureException e4) {
                        e = e4;
                        t9Var.f(ea.T, e51Var, e);
                        return;
                    }
                } catch (Exception e5) {
                    t9Var.f(ea.I, e5);
                    return;
                }
            }
            byteBufferV.position(0);
            ByteBuffer byteBufferV4 = y90.v(byteBufferV);
            ByteBuffer byteBufferV5 = y90.v(byteBufferV);
            ByteBuffer byteBufferV6 = y90.v(byteBufferV);
            int i6 = -1;
            while (byteBufferV5.hasRemaining()) {
                int i7 = i6 + 1;
                byte[] bArrQ3 = y90.Q(byteBufferV5);
                try {
                    arrayList2.add(new i70(qh1.b(bArrQ3, certificateFactory), bArrQ3));
                    i6 = i7;
                } catch (CertificateException e6) {
                    t9Var.f(ea.J, Integer.valueOf(i7), Integer.valueOf(i6 + 2), e6);
                    return;
                }
            }
            if (arrayList2.isEmpty()) {
                t9Var.f(ea.X, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) arrayList2.get(0);
            try {
                encoded = ds.l(x509Certificate.getPublicKey());
            } catch (InvalidKeyException e7) {
                System.out.println("Caught an exception encoding the public key: " + e7);
                e7.printStackTrace();
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(bArrQ, encoded)) {
                t9Var.f(ea.Y, y90.X(encoded), y90.X(bArrQ));
                return;
            }
            int i8 = 0;
            while (byteBufferV4.hasRemaining()) {
                i8++;
                try {
                    ByteBuffer byteBufferV7 = y90.v(byteBufferV4);
                    arrayList.add(new r9(byteBufferV7.getInt(), y90.Q(byteBufferV7)));
                } catch (i9 | BufferUnderflowException unused2) {
                    t9Var.f(ea.L, Integer.valueOf(i8));
                    return;
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                arrayList5.add(Integer.valueOf(((s9) obj2).a));
            }
            ArrayList arrayList6 = new ArrayList(arrayList.size());
            int size3 = arrayList.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj3 = arrayList.get(i10);
                i10++;
                arrayList6.add(Integer.valueOf(((r9) obj3).a));
            }
            if (!arrayList5.equals(arrayList6)) {
                t9Var.f(ea.Z, arrayList5, arrayList6);
                return;
            }
            int i11 = 1;
            Set setKeySet = map.keySet();
            HashSet<Integer> hashSet3 = new HashSet(1);
            int i12 = 0;
            while (byteBufferV6.hasRemaining()) {
                i12 += i11;
                try {
                    ByteBuffer byteBufferV8 = y90.v(byteBufferV6);
                    int i13 = byteBufferV8.getInt();
                    byte[] bArr2 = new byte[byteBufferV8.remaining()];
                    byteBufferV8.get(bArr2);
                    t9Var.k.add(new q9(i13, bArr2));
                    if (i13 != -1091571699) {
                        t9Var.g(ea.S, Integer.valueOf(i13));
                    } else {
                        int i14 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        if (setKeySet.contains(Integer.valueOf(i14))) {
                            hashSet3.add(Integer.valueOf(i14));
                        } else {
                            t9Var.g(ea.N, Integer.valueOf(t9Var.a), Integer.valueOf(i14));
                        }
                    }
                    i11 = 1;
                } catch (i9 | BufferUnderflowException unused3) {
                    t9Var.f(ea.M, Integer.valueOf(i12));
                    return;
                }
            }
            for (Integer num : hashSet3) {
                num.getClass();
                if (!hashSet2.contains(num)) {
                    t9Var.f(ea.O, Integer.valueOf(t9Var.a), (String) map.get(num));
                }
            }
        } catch (up0 e8) {
            try {
                throw new p9(e8.getMessage());
            } catch (p9 e9) {
                t9Var.f(ea.W, e9);
            }
        }
    }

    public static final void E(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static ArrayList F(ByteBuffer byteBuffer) throws IOException {
        ArrayList arrayList = new ArrayList();
        i70 i70Var = null;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    int i2 = 0;
                    try {
                        try {
                            if (byteBuffer.getInt() != 1) {
                                throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                            }
                            HashSet hashSet = new HashSet();
                            int i3 = 0;
                            while (byteBuffer.hasRemaining()) {
                                i2++;
                                ByteBuffer byteBufferV = y90.v(byteBuffer);
                                ByteBuffer byteBufferV2 = y90.v(byteBufferV);
                                int i4 = byteBufferV.getInt();
                                int i5 = byteBufferV.getInt();
                                e51 e51VarA = e51.a(i3);
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
                                            throw new SecurityException("Unable to verify signature of certificate #" + i2 + " using " + str + " when verifying SourceStampCertificateLineage object");
                                        }
                                    } catch (BufferUnderflowException e2) {
                                        e = e2;
                                        throw new IOException("Failed to parse SourceStampCertificateLineage object", e);
                                    }
                                }
                                byteBufferV2.rewind();
                                byte[] bArrQ2 = y90.Q(byteBufferV2);
                                int i6 = byteBufferV2.getInt();
                                if (i70Var != null && i3 != i6) {
                                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferV + " when verifying SourceStampCertificateLineage object");
                                }
                                i70 i70Var2 = new i70((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrQ2)), bArrQ2);
                                if (hashSet.contains(i70Var2)) {
                                    throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i2 + ".  All signing certificates should be unique");
                                }
                                hashSet.add(i70Var2);
                                arrayList.add(new s51(i70Var2, e51.a(i6), e51.a(i5), bArrQ, i4));
                                i70Var = i70Var2;
                                i3 = i5;
                            }
                            return arrayList;
                        } catch (i9 | BufferUnderflowException e3) {
                            e = e3;
                        }
                    } catch (InvalidAlgorithmParameterException e4) {
                        e = e4;
                        throw new SecurityException(q51.k(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
                    } catch (InvalidKeyException e5) {
                        e = e5;
                        throw new SecurityException(q51.k(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
                    } catch (NoSuchAlgorithmException e6) {
                        e = e6;
                        throw new SecurityException(q51.k(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
                    } catch (SignatureException e7) {
                        e = e7;
                        throw new SecurityException(q51.k(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
                    } catch (CertificateException e8) {
                        throw new SecurityException(q51.k(0, "Failed to decode certificate #", " when parsing SourceStampCertificateLineage object"), e8);
                    }
                } catch (CertificateException e9) {
                    throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e9);
                }
            } else {
                id.q("ByteBuffer byte order must be little endian");
            }
        }
        return null;
    }

    public static void G(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = uj.K(drawable).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void H(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = oe1.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void I(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        y90.S(classCastException, ec1.class.getName());
        throw classCastException;
    }

    public static final sc1 J(rq rqVar, br brVar, Object obj) {
        sc1 sc1Var = null;
        if ((rqVar instanceof mr) && brVar.l(tc1.c) != null) {
            mr mrVarD = (mr) rqVar;
            while (!(mrVarD instanceof qu) && (mrVarD = mrVarD.d()) != null) {
                if (mrVarD instanceof sc1) {
                    sc1Var = (sc1) mrVarD;
                    break;
                }
            }
            if (sc1Var != null) {
                sc1Var.m0(brVar, obj);
            }
        }
        return sc1Var;
    }

    public static u9 K(vy vyVar, z9 z9Var, Map map, HashSet hashSet, int i2) throws v9 {
        int i3 = mz0.b;
        u9 u9Var = new u9(2);
        try {
            f51 f51VarP = y90.p(vyVar, z9Var, 1896449818);
            bs bsVarE = vyVar.e(0L, f51VarP.b);
            long j = f51VarP.c;
            bs bsVarE2 = vyVar.e(j, f51VarP.d - j);
            ByteBuffer byteBuffer = f51VarP.e;
            ByteBuffer byteBuffer2 = f51VarP.a;
            HashSet hashSet2 = new HashSet(1);
            try {
                ByteBuffer byteBufferV = y90.v(byteBuffer2);
                if (byteBufferV.hasRemaining()) {
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        int i4 = 0;
                        while (byteBufferV.hasRemaining()) {
                            int i5 = i4 + 1;
                            t9 t9Var = new t9();
                            t9Var.a = i4;
                            u9Var.g.add(t9Var);
                            try {
                                D(y90.v(byteBufferV), certificateFactory, t9Var, hashSet2, map, hashSet, i2);
                                i4 = i5;
                            } catch (i9 | BufferUnderflowException unused) {
                                t9Var.f(ea.H, new Object[0]);
                            }
                        }
                        if (i4 > 10) {
                            u9Var.d(ea.P, 10, Integer.valueOf(i4));
                        }
                    } catch (CertificateException e2) {
                        throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e2);
                    }
                } else {
                    u9Var.d(ea.Q, new Object[0]);
                }
            } catch (i9 unused2) {
                u9Var.d(ea.G, new Object[0]);
            }
            if (!u9Var.a()) {
                ds.H(bsVarE, bsVarE2, byteBuffer, hashSet2, u9Var);
                if (!u9Var.a()) {
                    u9Var.b = true;
                }
            }
            return u9Var;
        } catch (g51 e3) {
            throw new v9(e3.getMessage());
        }
    }

    public static sh a(int i2, int i3, oh ohVar) {
        int i4 = i3 & 2;
        oh ohVar2 = oh.c;
        if (i4 != 0) {
            ohVar = ohVar2;
        }
        if (i2 == -2) {
            if (ohVar != ohVar2) {
                return new jo(1, ohVar);
            }
            fk.a.getClass();
            return new sh(ek.b);
        }
        if (i2 == -1) {
            if (ohVar == ohVar2) {
                return new jo(1, oh.d);
            }
            id.q("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return ohVar == ohVar2 ? new sh(0) : new jo(1, ohVar);
        }
        if (i2 != Integer.MAX_VALUE) {
            return ohVar == ohVar2 ? new sh(i2) : new jo(i2, ohVar);
        }
        return new sh(Integer.MAX_VALUE);
    }

    public static final e71 b(Object obj) {
        if (obj == null) {
            obj = d;
        }
        return new e71(obj);
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = uj.K(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static Map d(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof yd0)) {
            return linkedHashMap;
        }
        I(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean e(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iY;
        int i3;
        int i4;
        boolean zF = f(i2, rect, rect2);
        if (!f(i2, rect, rect3) && zF) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i2 != 17 && i2 != 66) {
                                iY = y(i2, rect, rect2);
                                if (i2 != 17) {
                                    i3 = rect.left;
                                    i4 = rect3.left;
                                } else if (i2 != 33) {
                                    i3 = rect.top;
                                    i4 = rect3.top;
                                } else if (i2 != 66) {
                                    i3 = rect3.right;
                                    i4 = rect.right;
                                } else {
                                    if (i2 == 130) {
                                        id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i3 = rect3.bottom;
                                    i4 = rect.bottom;
                                }
                                if (iY < Math.max(1, i3 - i4)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i2 != 17) {
                            iY = y(i2, rect, rect2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iY < Math.max(1, i3 - i4)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i2 != 17) {
                        iY = y(i2, rect, rect2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iY < Math.max(1, i3 - i4)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i2 != 17) {
                    iY = y(i2, rect, rect2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iY < Math.max(1, i3 - i4)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static void g(int i2, Object obj) {
        if (obj == null || x(i2, obj)) {
            return;
        }
        I(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void h(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static String i(int i2) {
        char[] chars;
        if (i2 != 0) {
            try {
                chars = Character.toChars(i2);
            } catch (Throwable unused) {
                chars = null;
            }
        } else {
            chars = null;
        }
        return chars == null ? "" : new String(chars);
    }

    public static ImageView.ScaleType j(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static final br k(br brVar, br brVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 2;
        boolean zBooleanValue = ((Boolean) brVar.h(bool, new hn(i2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) brVar2.h(bool, new hn(i2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return brVar.j(brVar2);
        }
        hn hnVar = new hn(3);
        kx kxVar = kx.c;
        br brVar3 = (br) brVar.h(kxVar, hnVar);
        Object objH = brVar2;
        if (zBooleanValue2) {
            objH = brVar2.h(kxVar, new hn(4));
        }
        return brVar3.j((br) objH);
    }

    public static int l(int i2) {
        int[] iArrS = q51.s(9);
        int length = iArrS.length;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                return 1;
            }
            int i5 = iArrS[i3];
            switch (i5) {
                case 1:
                    i4 = 0;
                    break;
                case 2:
                    break;
                case 3:
                    i4 = 2;
                    break;
                case 4:
                    i4 = 3;
                    break;
                case 5:
                    i4 = 4;
                    break;
                case 6:
                    i4 = 5;
                    break;
                case 7:
                    i4 = 6;
                    break;
                case 8:
                    i4 = 7;
                    break;
                case 9:
                    i4 = 9;
                    break;
                default:
                    throw null;
            }
            if (i4 == i2) {
                return i5;
            }
            i3++;
        }
    }

    public static ColorStateList m(Context context, y6 y6Var, int i2) {
        int resourceId;
        ColorStateList colorStateListM;
        TypedArray typedArray = (TypedArray) y6Var.e;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM = uj.m(context, resourceId)) == null) ? y6Var.s(i2) : colorStateListM;
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListM;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM = uj.m(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM;
    }

    public static SharedPreferences o(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public static int p(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static String q(yg ygVar, int i2) {
        ygVar.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            String resourceName = ygVar.a.getResources().getResourceName(i2);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static Drawable r(Context context, int i2) {
        return jy0.d().f(context, i2);
    }

    public static Drawable s(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableR = r(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableR;
    }

    public static String t(Context context, int i2) {
        if (context == null) {
            return "";
        }
        if (i2 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i2);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static boolean u(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean v() {
        if (Build.VERSION.SDK_INT >= 29) {
            return ab1.a();
        }
        try {
            if (i == null) {
                h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) i.invoke(null, Long.valueOf(h))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean w(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean x(int i2, Object obj) {
        int iB;
        if (obj instanceof k60) {
            if (obj instanceof m60) {
                iB = ((m60) obj).b();
            } else if (obj instanceof o50) {
                iB = 0;
            } else if (obj instanceof z50) {
                iB = 1;
            } else if (obj instanceof d60) {
                iB = 2;
            } else if (obj instanceof e60) {
                iB = 3;
            } else {
                iB = obj instanceof as0 ? 4 : -1;
            }
            if (iB == i2) {
                return true;
            }
        }
        return false;
    }

    public static int y(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int z(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public void B() {
    }

    public void C() {
    }

    public void A(int i2, CharSequence charSequence) {
    }
}
