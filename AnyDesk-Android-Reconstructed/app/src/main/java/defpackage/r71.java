package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class r71 {
    public static final bx b;
    public static final bx c;
    public static final bx d;
    public static boolean f = false;
    public static Method g = null;
    public static boolean h = false;
    public static Field i;
    public static final byte[] a = new byte[0];
    public static final Object e = new Object();

    static {
        int i2 = 2;
        b = new bx("UNDEFINED", i2);
        c = new bx("REUSABLE_CLAIMED", i2);
        d = new bx("NO_OWNER", i2);
    }

    public static int A(oe oeVar) {
        switch (oeVar.ordinal()) {
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 4;
            case 5:
            case 6:
                return 16;
            case 7:
                return 17;
            case 8:
                return 3;
            case 9:
                return 23;
            case 10:
                return 24;
            case 11:
                return 1;
            default:
                id.p(oeVar, "Unsupported data type: ");
                return 0;
        }
    }

    public static int B(int i2, int i3, float f2) {
        return cn.b(cn.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static void C(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void D(Context context, Uri uri) {
        Ringtone ringtone;
        if (context == null || uri == null || (ringtone = RingtoneManager.getRingtone(context, uri)) == null) {
            return;
        }
        ringtone.play();
    }

    public static byte[] G(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                nh0.j(gr0.e(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] H(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long I(InputStream inputStream, int i2) throws IOException {
        byte[] bArrG = G(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += ((long) (bArrG[i3] & 255)) << (i3 * 8);
        }
        return j;
    }

    public static String J(String str, String str2) {
        if (str.startsWith(str2)) {
            return str.length() > str2.length() ? str.substring(str2.length()) : "";
        }
        return null;
    }

    public static final void K(rq rqVar, Object obj) throws ou {
        if (!(rqVar instanceof pu)) {
            rqVar.g(obj);
            return;
        }
        pu puVar = (pu) rqVar;
        dr drVar = puVar.f;
        sq sqVar = puVar.g;
        Throwable thA = qy0.a(obj);
        Object onVar = thA == null ? obj : new on(thA, false);
        if (M(drVar, sqVar.e())) {
            puVar.h = onVar;
            puVar.e = 1;
            L(drVar, sqVar.e(), puVar);
            return;
        }
        dy dyVarA = x91.a();
        if (dyVarA.e >= 4294967296L) {
            puVar.h = onVar;
            puVar.e = 1;
            dyVarA.p(puVar);
            return;
        }
        dyVarA.r(true);
        try {
            pd0 pd0Var = (pd0) sqVar.e().l(fw.f);
            if (pd0Var == null || pd0Var.a()) {
                Object obj2 = puVar.i;
                br brVarE = sqVar.e();
                Object objJ = uj.J(brVarE, obj2);
                sc1 sc1VarJ = objJ != uj.e ? ec1.J(sqVar, brVarE, objJ) : null;
                try {
                    sqVar.g(obj);
                    if (sc1VarJ == null || sc1VarJ.k0()) {
                        uj.B(brVarE, objJ);
                    }
                } catch (Throwable th) {
                    if (sc1VarJ == null || sc1VarJ.k0()) {
                        uj.B(brVarE, objJ);
                    }
                    throw th;
                }
            } else {
                puVar.g(y90.m(pd0Var.n()));
            }
            while (dyVarA.t()) {
            }
        } catch (Throwable th2) {
            try {
                puVar.i(th2);
            } finally {
                dyVarA.o();
            }
        }
    }

    public static final void L(dr drVar, br brVar, Runnable runnable) throws ou {
        try {
            drVar.e(brVar, runnable);
        } catch (Throwable th) {
            throw new ou(th, drVar, brVar);
        }
    }

    public static final boolean M(dr drVar, br brVar) throws ou {
        try {
            return drVar.g(brVar);
        } catch (Throwable th) {
            throw new ou(th, drVar, brVar);
        }
    }

    public static String N(int i2, int i3) {
        String str;
        String strO = O(i2);
        if (i3 == 16) {
            str = "SEQUENCE";
        } else if (i3 == 17) {
            str = "SET";
        } else if (i3 == 23) {
            str = "UTC TIME";
        } else if (i3 != 24) {
            switch (i3) {
                case 1:
                    str = "BOOLEAN";
                    break;
                case 2:
                    str = "INTEGER";
                    break;
                case 3:
                    str = "BIT STRING";
                    break;
                case 4:
                    str = "OCTET STRING";
                    break;
                case 5:
                    str = "NULL";
                    break;
                case 6:
                    str = "OBJECT IDENTIFIER";
                    break;
                default:
                    str = "0x" + Integer.toHexString(i3);
                    break;
            }
        } else {
            str = "GENERALIZED TIME";
        }
        if (strO.isEmpty()) {
            return str;
        }
        return strO + " " + str;
    }

    public static String O(int i2) {
        if (i2 == 0) {
            return "UNIVERSAL";
        }
        if (i2 == 1) {
            return "APPLICATION";
        }
        if (i2 == 2) {
            return "";
        }
        if (i2 == 3) {
            return "PRIVATE";
        }
        id.q(gr0.e(i2, "Unsupported type class: "));
        return null;
    }

    public static final Object P(br brVar, Object obj, Object obj2, d60 d60Var, rq rqVar) {
        Object objF;
        Object objJ = uj.J(brVar, obj2);
        try {
            s61 s61Var = new s61(rqVar, brVar);
            if (q51.p(d60Var)) {
                ec1.g(2, d60Var);
                objF = d60Var.f(obj, s61Var);
            } else {
                objF = ds.J(d60Var, obj, s61Var);
            }
            uj.B(brVar, objJ);
            if (objF == lr.c) {
                rqVar.getClass();
            }
            return objF;
        } catch (Throwable th) {
            uj.B(brVar, objJ);
            throw th;
        }
    }

    public static void Q(ByteArrayOutputStream byteArrayOutputStream, long j, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void R(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        Q(byteArrayOutputStream, i2, 2);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void b(x51 x51Var) {
        int i2 = x51Var.f;
        int[] iArr = x51Var.d;
        Object[] objArr = x51Var.e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        x51Var.c = false;
        x51Var.f = i3;
    }

    public static gr e(t10 t10Var) {
        ih ihVar = new ih(t10Var, (rq) null, 7);
        gr grVar = new gr();
        fw fwVar = fw.f;
        y71 y71Var = new y71(null);
        us usVar = su.a;
        o70 o70Var = li0.a.g;
        o70Var.getClass();
        br brVarJ = o70Var.j(y71Var);
        if (brVarJ.l(fwVar) == null) {
            brVarJ = brVarJ.j(y90.d());
        }
        grVar.m = new sb(grVar, ihVar, new pq(brVarJ), new y(3, grVar));
        if (t10Var instanceof c71) {
            if (md.K().L()) {
                grVar.l(((c71) t10Var).getValue());
                return grVar;
            }
            grVar.i(((c71) t10Var).getValue());
        }
        return grVar;
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int j(int i2, int i3) {
        return cn.d(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static byte[] k(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final boolean l(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !y90.e(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!l((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!ae.M((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int m(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = m((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i2 = (i2 * 31) + iHashCode;
        }
        return i2;
    }

    public static Object n(oe oeVar, fj0 fj0Var, Class cls) throws fe {
        if (ByteBuffer.class.equals(cls)) {
            return ((ByteBuffer) fj0Var.d).slice();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer byteBufferSlice = ((ByteBuffer) fj0Var.d).slice();
            if (!byteBufferSlice.hasRemaining()) {
                return a;
            }
            byte[] bArr = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr);
            return bArr;
        }
        if (le.class.equals(cls)) {
            return new le(((ByteBuffer) fj0Var.c).slice());
        }
        ByteBuffer byteBufferSlice2 = ((ByteBuffer) fj0Var.d).slice();
        int iOrdinal = oeVar.ordinal();
        if (iOrdinal == 1) {
            ee eeVar = (ee) uj.n(cls);
            if (eeVar != null && eeVar.type() == oe.d) {
                return d6.x(fj0Var, cls);
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 5) {
                    switch (iOrdinal) {
                        case 9:
                        case 10:
                            if (String.class.equals(cls)) {
                                byte[] bArr2 = new byte[byteBufferSlice2.remaining()];
                                byteBufferSlice2.get(bArr2);
                                return new String(bArr2);
                            }
                            break;
                        case 11:
                            if (Boolean.TYPE.equals(cls)) {
                                if (byteBufferSlice2.remaining() == 1) {
                                    return new Boolean(byteBufferSlice2.get() != 0);
                                }
                                throw new fe("Incorrect encoded size of boolean value: " + byteBufferSlice2.remaining());
                            }
                            break;
                    }
                } else {
                    ee eeVar2 = (ee) uj.n(cls);
                    if (eeVar2 != null && eeVar2.type() == oe.e) {
                        return d6.y(fj0Var, cls, false);
                    }
                }
            } else if (String.class.equals(cls)) {
                if (!byteBufferSlice2.hasRemaining()) {
                    throw new fe("Empty OBJECT IDENTIFIER");
                }
                long jG = d6.g(byteBufferSlice2);
                int iMin = (int) Math.min(jG / 40, 2L);
                StringBuilder sb = new StringBuilder();
                sb.append(Long.toString(iMin));
                sb.append('.');
                sb.append(Long.toString(jG - ((long) (iMin * 40))));
                while (byteBufferSlice2.hasRemaining()) {
                    long jG2 = d6.g(byteBufferSlice2);
                    sb.append('.');
                    sb.append(Long.toString(jG2));
                }
                return sb.toString();
            }
        } else {
            if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                BigInteger bigIntegerU = d6.u(byteBufferSlice2);
                if (bigIntegerU.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || bigIntegerU.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
                    throw new fe(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerU));
                }
                return Integer.valueOf(bigIntegerU.intValue());
            }
            if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                BigInteger bigIntegerU2 = d6.u(byteBufferSlice2);
                if (bigIntegerU2.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || bigIntegerU2.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                    throw new fe(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerU2));
                }
                return Long.valueOf(bigIntegerU2.longValue());
            }
            if (BigInteger.class.equals(cls)) {
                return d6.u(byteBufferSlice2);
            }
        }
        StringBuilder sb2 = new StringBuilder("Unsupported conversion: ASN.1 ");
        sb2.append(oeVar);
        String name = cls.getName();
        sb2.append(" to ");
        sb2.append(name);
        throw new fe(sb2.toString());
    }

    public static boolean o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = oe1.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = ne1.d;
            ne1 ne1Var = (ne1) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (ne1Var == null) {
                ne1Var = new ne1();
                ne1Var.a = null;
                ne1Var.b = null;
                ne1Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, ne1Var);
            }
            WeakReference weakReference2 = ne1Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                ne1Var.c = new WeakReference(keyEvent);
                if (ne1Var.b == null) {
                    ne1Var.b = new SparseArray();
                }
                SparseArray sparseArray = ne1Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    id.c();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean p(ce0 ce0Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (ce0Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ce0Var.a(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f) {
                            try {
                                g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f = true;
                        }
                        Method method = g;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (oe1.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!h) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        i = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    h = true;
                }
                Field field = i;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (oe1.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && oe1.c(view, keyEvent)) || ce0Var.a(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static int q(int i2) {
        for (int i3 : q51.s(3)) {
            if (q51.r(i3) == i2) {
                return i3;
            }
        }
        return 1;
    }

    public static int r(int i2) {
        for (int i3 : q51.s(3)) {
            if (q51.r(i3) == i2) {
                return i3;
            }
        }
        return 2;
    }

    public static int t(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueY = bu0.y(context, i2);
        if (typedValueY != null) {
            int i4 = typedValueY.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? uj.l(context, i4) : typedValueY.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int u(View view, int i2) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueY = bu0.y(context2, i2);
        if (typedValueY == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i2)));
        }
        int i3 = typedValueY.resourceId;
        return i3 != 0 ? uj.l(context, i3) : typedValueY.data;
    }

    public static nn0 w(bf1 bf1Var) {
        i90 i90Var = on0.a;
        pr prVar = pr.b;
        i90Var.getClass();
        prVar.getClass();
        ah ahVar = new ah(bf1Var, i90Var, prVar);
        fm fmVarA = nx0.a(nn0.class);
        String strU = y90.u(fmVarA);
        if (strU != null) {
            return (nn0) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        }
        id.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static int z(me meVar) {
        int iOrdinal = meVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                id.p(meVar, "Unsupported tag class: ");
                return 0;
            }
        }
        return i2;
    }

    public abstract void E(t2 t2Var, t2 t2Var2);

    public abstract void F(t2 t2Var, Thread thread);

    public abstract boolean c(int i2, int i3);

    public abstract boolean d(int i2, int i3);

    public abstract boolean f(u2 u2Var, q2 q2Var);

    public abstract boolean g(u2 u2Var, Object obj, Object obj2);

    public abstract boolean h(u2 u2Var, t2 t2Var, t2 t2Var2);

    public abstract Object s(int i2, int i3);

    public abstract void v(zg0 zg0Var, float f2, float f3);

    public abstract int x();

    public abstract int y();
}
