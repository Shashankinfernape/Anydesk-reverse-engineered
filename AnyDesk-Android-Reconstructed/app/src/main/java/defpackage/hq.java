package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.restriction.PhoneRestrictionPolicy;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hq implements ff1 {
    public static final int[] c = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] d = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] e = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] f = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] g = {R.attr.drawable};
    public static final int[] h = {R.attr.name, R.attr.animation};
    public static final int[] i = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] j = {R.attr.ordering};
    public static final int[] k = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] l = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] m = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final Object[] n = new Object[0];
    public static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] p = {112, 114, 111, 0};
    public static final byte[] q = {112, 114, 109, 0};
    public static final us0 r = new us0(17);

    public static int C(char c2) {
        switch (c2) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c2) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c2) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case PhoneRestrictionPolicy.ERROR_SIM_PIN_UNKNOWN /* 100 */:
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int[] E(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int I = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            I += (int) r71.I(byteArrayInputStream, 2);
            iArr[i3] = I;
        }
        return iArr;
    }

    public static rt[] F(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, rt[] rtVarArr) throws IOException {
        byte[] bArr3 = ds.o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ds.p)) {
                nh0.j("Unsupported meta version");
                return null;
            }
            int I = (int) r71.I(fileInputStream, 2);
            byte[] bArrH = r71.H(fileInputStream, (int) r71.I(fileInputStream, 4), (int) r71.I(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                nh0.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                rt[] rtVarArrH = H(byteArrayInputStream, bArr2, I, rtVarArr);
                byteArrayInputStream.close();
                return rtVarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ds.j, bArr2)) {
            nh0.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            nh0.j("Unsupported meta version");
            return null;
        }
        int I2 = (int) r71.I(fileInputStream, 1);
        byte[] bArrH2 = r71.H(fileInputStream, (int) r71.I(fileInputStream, 4), (int) r71.I(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            nh0.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            rt[] rtVarArrG = G(byteArrayInputStream2, I2, rtVarArr);
            byteArrayInputStream2.close();
            return rtVarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static rt[] G(ByteArrayInputStream byteArrayInputStream, int i2, rt[] rtVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new rt[0];
        }
        if (i2 != rtVarArr.length) {
            nh0.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int I = (int) r71.I(byteArrayInputStream, 2);
            iArr[i3] = (int) r71.I(byteArrayInputStream, 2);
            strArr[i3] = new String(r71.G(byteArrayInputStream, I), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            rt rtVar = rtVarArr[i4];
            if (!rtVar.b.equals(strArr[i4])) {
                nh0.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            rtVar.e = i5;
            rtVar.h = E(byteArrayInputStream, i5);
        }
        return rtVarArr;
    }

    public static rt[] H(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, rt[] rtVarArr) throws IOException {
        rt rtVar;
        if (byteArrayInputStream.available() == 0) {
            return new rt[0];
        }
        if (i2 != rtVarArr.length) {
            nh0.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            r71.I(byteArrayInputStream, 2);
            String str = new String(r71.G(byteArrayInputStream, (int) r71.I(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jI = r71.I(byteArrayInputStream, 4);
            int I = (int) r71.I(byteArrayInputStream, 2);
            if (rtVarArr.length <= 0) {
                rtVar = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= rtVarArr.length) {
                    rtVar = null;
                    break;
                }
                if (rtVarArr[i4].b.equals(strSubstring)) {
                    rtVar = rtVarArr[i4];
                    break;
                }
                i4++;
            }
            if (rtVar == null) {
                nh0.j("Missing profile key: ".concat(str));
                return null;
            }
            rtVar.d = jI;
            int[] iArrE = E(byteArrayInputStream, I);
            if (Arrays.equals(bArr, ds.n)) {
                rtVar.e = I;
                rtVar.h = iArrE;
            }
        }
        return rtVarArr;
    }

    public static rt[] I(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ds.k)) {
            nh0.j("Unsupported version");
            return null;
        }
        int I = (int) r71.I(fileInputStream, 1);
        byte[] bArrH = r71.H(fileInputStream, (int) r71.I(fileInputStream, 4), (int) r71.I(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            nh0.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            rt[] rtVarArrJ = J(byteArrayInputStream, str, I);
            byteArrayInputStream.close();
            return rtVarArrJ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static rt[] J(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new rt[0];
        }
        rt[] rtVarArr = new rt[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int I = (int) r71.I(byteArrayInputStream, 2);
            int I2 = (int) r71.I(byteArrayInputStream, 2);
            rtVarArr[i3] = new rt(str, new String(r71.G(byteArrayInputStream, I), StandardCharsets.UTF_8), r71.I(byteArrayInputStream, 4), I2, (int) r71.I(byteArrayInputStream, 4), (int) r71.I(byteArrayInputStream, 4), new int[I2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i2) {
            rt rtVar = rtVarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = rtVar.f;
            int i6 = rtVar.g;
            TreeMap treeMap = rtVar.i;
            int i7 = iAvailable - i5;
            int I3 = 0;
            while (byteArrayInputStream.available() > i7) {
                I3 += (int) r71.I(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(I3), 1);
                int I4 = (int) r71.I(byteArrayInputStream, 2);
                while (I4 > 0) {
                    r71.I(byteArrayInputStream, 2);
                    int I5 = (int) r71.I(byteArrayInputStream, 1);
                    if (I5 != 6 && I5 != 7) {
                        while (I5 > 0) {
                            r71.I(byteArrayInputStream, 1);
                            int i8 = i4;
                            for (int I6 = (int) r71.I(byteArrayInputStream, 1); I6 > 0; I6--) {
                                r71.I(byteArrayInputStream, 2);
                            }
                            I5--;
                            i4 = i8;
                        }
                    }
                    I4--;
                    i4 = i4;
                }
            }
            int i9 = i4;
            if (byteArrayInputStream.available() != i7) {
                nh0.j("Read too much data during profile line parse");
                return null;
            }
            rtVar.h = E(byteArrayInputStream, rtVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(r71.G(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = bitSetValueOf.get(i10) ? 2 : 0;
                if (bitSetValueOf.get(i10 + i6)) {
                    i11 |= 4;
                }
                if (i11 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i10), Integer.valueOf(i11 | num.intValue()));
                }
            }
            i4 = i9 + 1;
        }
        return rtVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void L(Resources.Theme theme) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            ld.j(theme);
            return;
        }
        if (i2 >= 23) {
            synchronized (y90.e) {
                if (y90.g) {
                    method = y90.f;
                    if (method != null) {
                        method.invoke(theme, null);
                    }
                } else {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        y90.f = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                    }
                    y90.g = true;
                    method = y90.f;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            y90.f = null;
                        }
                    }
                }
                throw th;
            }
        }
    }

    public static void M(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof d81) {
            ((d81) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            hb.k(menuItem, colorStateList);
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String N(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[PHI: r16
  0x006d: PHI (r16v3 long) = (r16v2 long), (r16v4 long) binds: [B:30:0x0060, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[LOOP:0: B:25:0x004f->B:39:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0083 A[EDGE_INSN: B:41:0x0083->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088 A[EDGE_INSN: B:42:0x0088->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079]] */
    /* JADX WARN: Code duplicated, block: B:56:0x008d A[EDGE_INSN: B:56:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008d A[EDGE_INSN: B:57:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x008d A[EDGE_INSN: B:58:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x008d A[EDGE_INSN: B:60:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:25:0x004f->B:39:0x0079], SYNTHETIC] */
    public static final long O(String str, long j2, long j3, long j4) {
        String property;
        boolean z;
        long j5;
        long j6;
        int iDigit;
        long j7;
        int i2;
        long j8;
        int i3 = k81.a;
        Long lValueOf = null;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        int i4 = 10;
        th1.d(10);
        int length = property.length();
        if (length != 0) {
            int i5 = 0;
            char cCharAt = property.charAt(0);
            long j9 = -9223372036854775807L;
            if (cCharAt >= '0') {
                z = false;
                j5 = 0;
                j6 = -256204778801521550L;
                while (true) {
                    if (i5 >= length) {
                        if (!z) {
                            lValueOf = Long.valueOf(-j5);
                            break;
                        }
                        lValueOf = Long.valueOf(j5);
                        break;
                    }
                    iDigit = Character.digit((int) property.charAt(i5), i4);
                    if (iDigit < 0) {
                        break;
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                            break;
                        }
                        j6 = j9 / 10;
                        if (j5 < j6) {
                            break;
                            break;
                        }
                        j7 = j5 * 10;
                        i2 = length;
                        j8 = iDigit;
                        if (j7 < j9 + j8) {
                            break;
                            break;
                        }
                        j5 = j7 - j8;
                        i5++;
                        length = i2;
                        i4 = 10;
                    } else {
                        j7 = j5 * 10;
                        i2 = length;
                        j8 = iDigit;
                        if (j7 < j9 + j8) {
                            break;
                            break;
                        }
                        j5 = j7 - j8;
                        i5++;
                        length = i2;
                        i4 = 10;
                    }
                }
            } else {
                z = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        i5 = 1;
                        z = false;
                        j5 = 0;
                        j6 = -256204778801521550L;
                        while (true) {
                            if (i5 >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j5);
                                    break;
                                }
                                lValueOf = Long.valueOf(j5);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i5), i4);
                            if (iDigit < 0) {
                                break;
                                break;
                            }
                            if (j5 < j6) {
                                if (j6 != -256204778801521550L) {
                                    break;
                                    break;
                                }
                                j6 = j9 / 10;
                                if (j5 < j6) {
                                    break;
                                    break;
                                }
                                j7 = j5 * 10;
                                i2 = length;
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    break;
                                    break;
                                }
                                j5 = j7 - j8;
                                i5++;
                                length = i2;
                                i4 = 10;
                            } else {
                                j7 = j5 * 10;
                                i2 = length;
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    break;
                                    break;
                                }
                                j5 = j7 - j8;
                                i5++;
                                length = i2;
                                i4 = 10;
                            }
                        }
                    } else if (cCharAt == '-') {
                        j9 = Long.MIN_VALUE;
                        i5 = 1;
                        j5 = 0;
                        j6 = -256204778801521550L;
                        while (true) {
                            if (i5 >= length) {
                                if (!z) {
                                    lValueOf = Long.valueOf(-j5);
                                    break;
                                }
                                lValueOf = Long.valueOf(j5);
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i5), i4);
                            if (iDigit < 0) {
                                break;
                            }
                            if (j5 < j6) {
                                if (j6 != -256204778801521550L) {
                                    break;
                                }
                                j6 = j9 / 10;
                                if (j5 < j6) {
                                    break;
                                }
                                j7 = j5 * 10;
                                i2 = length;
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    break;
                                    break;
                                }
                                j5 = j7 - j8;
                                i5++;
                                length = i2;
                                i4 = 10;
                            } else {
                                j7 = j5 * 10;
                                i2 = length;
                                j8 = iDigit;
                                if (j7 < j9 + j8) {
                                    break;
                                }
                                j5 = j7 - j8;
                                i5++;
                                length = i2;
                                i4 = 10;
                            }
                        }
                    }
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int P(int i2, String str, int i3) {
        return (int) O(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object[] Q(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return n;
    }

    public static final Object[] S(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static byte[] T(Object obj, oe oeVar, oe oeVar2) throws je {
        byte[] bArr;
        Class<?> cls = obj.getClass();
        if (le.class.equals(cls)) {
            ByteBuffer byteBufferSlice = ((le) obj).a.slice();
            byte[] bArr2 = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr2);
            return bArr2;
        }
        if (oeVar == null || oeVar == oe.c) {
            return ie.b(obj);
        }
        switch (oeVar.ordinal()) {
            case 1:
                ee eeVar = (ee) uj.n(cls);
                if (eeVar != null && eeVar.type() == oe.d) {
                    return ie.e(obj);
                }
                break;
            case 2:
                if (obj instanceof Integer) {
                    long jIntValue = ((Integer) obj).intValue();
                    int i2 = ie.a;
                    return ie.a(0, false, 2, BigInteger.valueOf(jIntValue).toByteArray());
                }
                if (obj instanceof Long) {
                    long jLongValue = ((Long) obj).longValue();
                    int i3 = ie.a;
                    return ie.a(0, false, 2, BigInteger.valueOf(jLongValue).toByteArray());
                }
                if (obj instanceof BigInteger) {
                    int i4 = ie.a;
                    return ie.a(0, false, 2, ((BigInteger) obj).toByteArray());
                }
                break;
            case 3:
                if (obj instanceof String) {
                    String str = (String) obj;
                    int i5 = ie.a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String[] strArrSplit = str.split("\\.");
                    if (strArrSplit.length < 2) {
                        throw new je("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
                    }
                    try {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        if (i6 > 6 || i6 < 0) {
                            throw new je(gr0.e(i6, "Invalid value for node #1: "));
                        }
                        try {
                            int i7 = Integer.parseInt(strArrSplit[1]);
                            if (i7 >= 40 || i7 < 0) {
                                throw new je(gr0.e(i7, "Invalid value for node #2: "));
                            }
                            int i8 = (i6 * 40) + i7;
                            if (i8 > 255) {
                                throw new je("First two nodes out of range: " + i6 + "." + i7);
                            }
                            byteArrayOutputStream.write(i8);
                            for (int i9 = 2; i9 < strArrSplit.length; i9++) {
                                String str2 = strArrSplit[i9];
                                try {
                                    int i10 = Integer.parseInt(str2);
                                    if (i10 < 0) {
                                        throw new je("Invalid value for node #" + (i9 + 1) + ": " + i10);
                                    }
                                    if (i10 <= 127) {
                                        byteArrayOutputStream.write(i10);
                                    } else if (i10 < 16384) {
                                        byteArrayOutputStream.write((i10 >> 7) | 128);
                                        byteArrayOutputStream.write(i10 & 127);
                                    } else {
                                        if (i10 >= 2097152) {
                                            throw new je("Node #" + (i9 + 1) + " too large: " + i10);
                                        }
                                        byteArrayOutputStream.write((i10 >> 14) | 128);
                                        byteArrayOutputStream.write((127 & (i10 >> 7)) | 128);
                                        byteArrayOutputStream.write(i10 & 127);
                                    }
                                } catch (NumberFormatException unused) {
                                    throw new je("Node #" + (i9 + 1) + " not numeric: " + str2);
                                }
                            }
                            return ie.a(0, false, 6, byteArrayOutputStream.toByteArray());
                        } catch (NumberFormatException unused2) {
                            throw new je("Node #2 not numeric: " + strArrSplit[1]);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new je("Node #1 not numeric: " + strArrSplit[0]);
                    }
                }
                break;
            case 4:
            case 8:
                if (obj instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.slice().get(bArr);
                } else {
                    bArr = obj instanceof byte[] ? (byte[]) obj : null;
                }
                if (bArr != null) {
                    return ie.a(0, false, r71.A(oeVar), bArr);
                }
                break;
            case 5:
                ee eeVar2 = (ee) uj.n(cls);
                if (eeVar2 != null && eeVar2.type() == oe.e) {
                    return ie.f(obj, false);
                }
                break;
            case 6:
                return ie.g((Collection) obj, oeVar2, false);
            case 7:
                return ie.g((Collection) obj, oeVar2, true);
            case 9:
            case 10:
                if (obj instanceof String) {
                    return ie.a(0, false, r71.A(oeVar), ((String) obj).getBytes());
                }
                break;
            case 11:
                if (obj instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    int i11 = ie.a;
                    byte[] bArr3 = new byte[1];
                    if (zBooleanValue) {
                        bArr3[0] = 1;
                    } else {
                        bArr3[0] = 0;
                    }
                    return ie.a(0, false, 1, bArr3);
                }
                break;
        }
        throw new je("Unsupported conversion: " + cls.getName() + " to ASN.1 " + oeVar);
    }

    public static final long U(int i2, aw awVar) {
        if (awVar.compareTo(aw.SECONDS) > 0) {
            return V(i2, awVar);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i2, awVar.c) << 1;
        int i3 = yv.e;
        int i4 = zv.a;
        return jConvert;
    }

    public static final long V(long j2, aw awVar) {
        TimeUnit timeUnit = awVar.c;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j2 || j2 > jConvert) {
            return o(th1.i(TimeUnit.MILLISECONDS.convert(j2, timeUnit)));
        }
        long jConvert2 = timeUnit2.convert(j2, timeUnit) << 1;
        int i2 = yv.e;
        int i3 = zv.a;
        return jConvert2;
    }

    public static boolean W(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, rt[] rtVarArr) throws IOException {
        long j2;
        int length;
        byte[] bArr2 = ds.n;
        byte[] bArr3 = ds.m;
        byte[] bArr4 = ds.j;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = ds.k;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM = m(rtVarArr, bArr5);
                r71.Q(byteArrayOutputStream, rtVarArr.length, 1);
                r71.Q(byteArrayOutputStream, bArrM.length, 4);
                byte[] bArrK = r71.k(bArrM);
                r71.Q(byteArrayOutputStream, bArrK.length, 4);
                byteArrayOutputStream.write(bArrK);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                r71.Q(byteArrayOutputStream, rtVarArr.length, 1);
                for (rt rtVar : rtVarArr) {
                    int size = rtVar.i.size() * 4;
                    String strQ = q(rtVar.a, bArr3, rtVar.b);
                    Charset charset = StandardCharsets.UTF_8;
                    r71.R(byteArrayOutputStream, strQ.getBytes(charset).length);
                    r71.R(byteArrayOutputStream, rtVar.h.length);
                    r71.Q(byteArrayOutputStream, size, 4);
                    r71.Q(byteArrayOutputStream, rtVar.c, 4);
                    byteArrayOutputStream.write(strQ.getBytes(charset));
                    Iterator it = rtVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        r71.R(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        r71.R(byteArrayOutputStream, 0);
                    }
                    for (int i3 : rtVar.h) {
                        r71.R(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = ds.l;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM2 = m(rtVarArr, bArr6);
                r71.Q(byteArrayOutputStream, rtVarArr.length, 1);
                r71.Q(byteArrayOutputStream, bArrM2.length, 4);
                byte[] bArrK2 = r71.k(bArrM2);
                r71.Q(byteArrayOutputStream, bArrK2.length, 4);
                byteArrayOutputStream.write(bArrK2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            r71.R(byteArrayOutputStream, rtVarArr.length);
            for (rt rtVar2 : rtVarArr) {
                String str = rtVar2.a;
                TreeMap treeMap = rtVar2.i;
                String strQ2 = q(str, bArr2, rtVar2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                r71.R(byteArrayOutputStream, strQ2.getBytes(charset2).length);
                r71.R(byteArrayOutputStream, treeMap.size());
                r71.R(byteArrayOutputStream, rtVar2.h.length);
                r71.Q(byteArrayOutputStream, rtVar2.c, 4);
                byteArrayOutputStream.write(strQ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    r71.R(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : rtVar2.h) {
                    r71.R(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            r71.R(byteArrayOutputStream2, rtVarArr.length);
            int i5 = 2;
            for (rt rtVar3 : rtVarArr) {
                r71.Q(byteArrayOutputStream2, rtVar3.c, 4);
                r71.Q(byteArrayOutputStream2, rtVar3.d, 4);
                r71.Q(byteArrayOutputStream2, rtVar3.g, 4);
                String strQ3 = q(rtVar3.a, bArr4, rtVar3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strQ3.getBytes(charset3).length;
                r71.R(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strQ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            ph1 ph1Var = new ph1(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList.add(ph1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < rtVarArr.length) {
                try {
                    rt rtVar4 = rtVarArr[i6];
                    r71.R(byteArrayOutputStream3, i6);
                    r71.R(byteArrayOutputStream3, rtVar4.e);
                    i7 = i7 + 4 + (rtVar4.e * 2);
                    int[] iArr = rtVar4.h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    while (i2 < length3) {
                        int i9 = iArr[i2];
                        r71.R(byteArrayOutputStream3, i9 - i8);
                        i2++;
                        i8 = i9;
                    }
                    i6++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            ph1 ph1Var2 = new ph1(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList.add(ph1Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i10 = 0;
            for (int i11 = 0; i11 < rtVarArr.length; i11++) {
                try {
                    rt rtVar5 = rtVarArr[i11];
                    Iterator it3 = rtVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        Z(byteArrayOutputStream5, iIntValue, rtVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            a0(byteArrayOutputStream6, rtVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            r71.R(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i12 = i10 + 6;
                            r71.Q(byteArrayOutputStream4, length4, 4);
                            r71.R(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i10 = i12 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i10 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
            }
            ph1 ph1Var3 = new ph1(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList.add(ph1Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            r71.Q(byteArrayOutputStream, arrayList.size(), 4);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ph1 ph1Var4 = (ph1) arrayList.get(i13);
                int i14 = ph1Var4.a;
                byte[] bArr7 = ph1Var4.b;
                if (i14 == 1) {
                    j2 = 0;
                } else if (i14 == 2) {
                    j2 = 1;
                } else if (i14 == 3) {
                    j2 = 2;
                } else if (i14 == 4) {
                    j2 = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                r71.Q(byteArrayOutputStream, j2, 4);
                r71.Q(byteArrayOutputStream, size2, 4);
                if (ph1Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrK3 = r71.k(bArr7);
                    arrayList2.add(bArrK3);
                    r71.Q(byteArrayOutputStream, bArrK3.length, 4);
                    r71.Q(byteArrayOutputStream, length5, 4);
                    length = bArrK3.length;
                } else {
                    arrayList2.add(bArr7);
                    r71.Q(byteArrayOutputStream, bArr7.length, 4);
                    r71.Q(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i15));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, rt rtVar) throws IOException {
        a0(byteArrayOutputStream, rtVar);
        int i2 = rtVar.g;
        int[] iArr = rtVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            r71.R(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : rtVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, rt rtVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        r71.R(byteArrayOutputStream, str.getBytes(charset).length);
        r71.R(byteArrayOutputStream, rtVar.e);
        r71.Q(byteArrayOutputStream, rtVar.f, 4);
        r71.Q(byteArrayOutputStream, rtVar.c, 4);
        r71.Q(byteArrayOutputStream, rtVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2, rt rtVar) throws IOException {
        int i3 = rtVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : rtVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, rt rtVar) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : rtVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                r71.R(byteArrayOutputStream, iIntValue - i2);
                r71.R(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void f(ve1 ve1Var, ui0 ui0Var, if0 if0Var) {
        ui0Var.getClass();
        if0Var.getClass();
        zz0 zz0Var = (zz0) ve1Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (zz0Var == null || zz0Var.e) {
            return;
        }
        zz0Var.b(if0Var, ui0Var);
        af0 af0Var = if0Var.d;
        if (af0Var == af0.d || af0Var.compareTo(af0.f) >= 0) {
            ui0Var.y();
        } else {
            if0Var.a(new ts(if0Var, ui0Var));
        }
    }

    public static final Bundle g(st0... st0VarArr) {
        Bundle bundle = new Bundle(st0VarArr.length);
        for (st0 st0Var : st0VarArr) {
            String str = (String) st0Var.c;
            Object obj = st0Var.d;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static String h(int i2, byte[] bArr) {
        String strConcat = "";
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b = bArr[i3];
            char[] cArr = o;
            char[] cArr2 = {cArr[(b & 255) >>> 4], cArr[b & 15]};
            if (strConcat.length() > 0 && i3 % i2 == 0) {
                strConcat = strConcat.concat(":");
            }
            strConcat = strConcat.concat(new String(cArr2));
        }
        return strConcat;
    }

    public static lo0 i(TypedValue typedValue, lo0 lo0Var, lo0 lo0Var2, String str, String str2) throws XmlPullParserException {
        if (lo0Var == null || lo0Var == lo0Var2) {
            return lo0Var == null ? lo0Var2 : lo0Var;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a A[RETURN] */
    public static int j(Context context, String str) {
        int iCheckOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            int i2 = Build.VERSION.SDK_INT;
            String strA = i2 >= 23 ? nd0.A(str) : null;
            if (strA != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                int iZ = 1;
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    if (i2 >= 29) {
                        AppOpsManager appOpsManagerF = ld.f(context);
                        iCheckOpNoThrow = appOpsManagerF == null ? 1 : appOpsManagerF.checkOpNoThrow(strA, Binder.getCallingUid(), packageName);
                        if (iCheckOpNoThrow == 0) {
                            String strE = ld.e(context);
                            if (appOpsManagerF != null) {
                                iZ = appOpsManagerF.checkOpNoThrow(strA, iMyUid, strE);
                            }
                        }
                        if (iCheckOpNoThrow == 0) {
                            return -2;
                        }
                    } else if (i2 >= 23) {
                        iZ = nd0.z((AppOpsManager) nd0.m(context), strA, packageName);
                    }
                } else if (i2 >= 23) {
                    iZ = nd0.z((AppOpsManager) nd0.m(context), strA, packageName);
                }
                iCheckOpNoThrow = iZ;
                if (iCheckOpNoThrow == 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String k(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final Object l(d60 d60Var, rq rqVar) {
        m01 m01Var = new m01(rqVar, rqVar.e());
        return bu0.L(m01Var, true, m01Var, d60Var);
    }

    public static byte[] m(rt[] rtVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (rt rtVar : rtVarArr) {
            length += ((((rtVar.g * 2) + 7) & (-8)) / 8) + (rtVar.e * 2) + q(rtVar.a, bArr, rtVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + rtVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ds.l)) {
            int length2 = rtVarArr.length;
            while (i2 < length2) {
                rt rtVar2 = rtVarArr[i2];
                Y(byteArrayOutputStream, rtVar2, q(rtVar2.a, bArr, rtVar2.b));
                X(byteArrayOutputStream, rtVar2);
                i2++;
            }
        } else {
            for (rt rtVar3 : rtVarArr) {
                Y(byteArrayOutputStream, rtVar3, q(rtVar3.a, bArr, rtVar3.b));
            }
            int length3 = rtVarArr.length;
            while (i2 < length3) {
                X(byteArrayOutputStream, rtVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final long o(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = yv.e;
        int i3 = zv.a;
        return j3;
    }

    public static int p(int i2) {
        for (int i3 : q51.s(3)) {
            if (q51.r(i3) == i2) {
                return i3;
            }
        }
        return 3;
    }

    public static String q(String str, byte[] bArr, String str2) {
        byte[] bArr2 = ds.m;
        byte[] bArr3 = ds.n;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return q51.m(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int r(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static y7 s(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        y7 y7VarB;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new y7((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                y7VarB = y7.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                y7VarB = null;
            }
            if (y7VarB != null) {
                return y7VarB;
            }
        }
        return new y7((Shader) null, (ColorStateList) null, 0);
    }

    public static String t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (x(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static String u(int i2) {
        switch (q51.r(q51.b(i2))) {
            case 0:
                return JniAdExt.n1("ad.file_manager.error.ok");
            case 1:
                return JniAdExt.n1("ad.file_manager.error.invalid_handle");
            case 2:
                return JniAdExt.n1("ad.file_manager.error.no_such_directory");
            case 3:
                return JniAdExt.n1("ad.file_manager.error.file_not_found");
            case 4:
                return JniAdExt.n1("ad.file_manager.error.access_denied");
            case 5:
                return JniAdExt.n1("ad.file_manager.error.invalid_parameter");
            case 6:
                return JniAdExt.n1("ad.file_manager.error.invalid_path");
            case 7:
                return JniAdExt.n1("ad.file_manager.error.file_busy");
            case 8:
            case 12:
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
            default:
                return JniAdExt.n1("ad.file_manager.error.unknown");
            case 9:
                return JniAdExt.n1("ad.file_manager.error.not_implemented");
            case 10:
                return JniAdExt.n1("ad.file_manager.error.already_exists");
            case 11:
                return JniAdExt.n1("ad.file_manager.error.end_of_file");
            case 13:
                return JniAdExt.n1("ad.file_manager.error.dir_not_empty");
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return JniAdExt.n1("ad.file_manager.error.filename_too_long");
        }
    }

    public static final nm w(u1 u1Var) {
        nm nmVar;
        br brVar;
        synchronized (r) {
            nmVar = (nm) u1Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (nmVar == null) {
                try {
                    us usVar = su.a;
                    brVar = li0.a.g;
                } catch (IllegalStateException unused) {
                    brVar = kx.c;
                }
                nm nmVar2 = new nm(brVar.j(new y71(null)));
                u1Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", nmVar2);
                nmVar = nmVar2;
            }
        }
        return nmVar;
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static byte[] y(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (C(str.charAt(i3 + 1)) | (C(str.charAt(i3)) << 4));
        }
        return bArr;
    }

    public static TypedArray z(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public abstract View A(int i2);

    public abstract boolean B();

    public abstract Object D(Intent intent, int i2);

    public abstract Intent n(qa qaVar, Object obj);

    public v3 v(qa qaVar, Object obj) {
        return null;
    }

    @Override // defpackage.ff1
    public void c() {
    }

    @Override // defpackage.ff1
    public void e() {
    }
}
