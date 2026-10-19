package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.anydesk.jnilib.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y90 implements mu0 {
    public static Method f;
    public static boolean g;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] b = new int[0];
    public static final Object[] c = new Object[0];
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final Logging h = new Logging("WebSslCertificateVerifier");

    public static String A(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else {
            i = i2 >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static ArrayList B(ArrayList arrayList, int i, int i2, boolean z) throws up0 {
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            y9 y9Var = (y9) obj;
            e51 e51Var = y9Var.a;
            int i6 = z ? e51Var.h : e51Var.g;
            if (i6 <= i2) {
                if (i6 < i3) {
                    i3 = i6;
                }
                y9 y9Var2 = (y9) map.get(Integer.valueOf(i6));
                if (y9Var2 != null) {
                    e51 e51Var2 = y9Var2.a;
                    fq fqVar = e51Var.e;
                    fq fqVar2 = e51Var2.e;
                    int iOrdinal = fqVar.ordinal();
                    if (iOrdinal == 0) {
                        int iOrdinal2 = fqVar2.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            id.p(fqVar2, "Unknown alg2: ");
                            return null;
                        }
                    } else if (iOrdinal == 1) {
                        int iOrdinal3 = fqVar2.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 == 1) {
                                continue;
                            } else if (iOrdinal3 != 2) {
                                id.p(fqVar2, "Unknown alg2: ");
                                return null;
                            }
                        }
                    } else {
                        if (iOrdinal != 2) {
                            id.p(fqVar, "Unknown alg1: ");
                            return null;
                        }
                        int iOrdinal4 = fqVar2.ordinal();
                        if (iOrdinal4 != 0) {
                            if (iOrdinal4 != 1 && iOrdinal4 != 2) {
                                id.p(fqVar2, "Unknown alg2: ");
                                return null;
                            }
                        }
                    }
                }
                map.put(Integer.valueOf(i6), y9Var);
            }
        }
        if (i >= i3) {
            if (map.isEmpty()) {
                throw new up0("No supported signature");
            }
            ArrayList arrayList2 = new ArrayList(map.values());
            Collections.sort(arrayList2, new x9(i4));
            return arrayList2;
        }
        throw new up0("Minimum provided signature version " + i3 + " > minSdkVersion " + i);
    }

    public static File C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final uu E(pd0 pd0Var, boolean z, td0 td0Var) {
        return pd0Var instanceof wd0 ? ((wd0) pd0Var).O(z, td0Var) : pd0Var.m(td0Var.r(), z, new sd0(1, td0Var, td0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static boolean F(int i) {
        return i >= 28 && i <= 31;
    }

    public static boolean G(int i) {
        return (i & 32768) != 0;
    }

    public static boolean H(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean I(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }

    public static List J(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0219  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    public static ValueAnimator K(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayZ = hq.z(resources, theme, attributeSet, hq.i);
        TypedArray typedArrayZ2 = hq.z(resources, theme, attributeSet, hq.m);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = hq.x(xmlPullParser, "duration") ? typedArrayZ.getInt(1, 300) : 300;
        boolean z = false;
        long j2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayZ.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayZ.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayZ.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i3 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayZ.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i2 = ((z2 && F(i3)) || (z3 && F(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderW = w(typedArrayZ, i2, 5, 6, "");
            if (propertyValuesHolderW != null) {
                valueAnimator3.setValues(propertyValuesHolderW);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayZ.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayZ.getInt(4, 1) : 1);
        if (typedArrayZ2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strT = hq.t(typedArrayZ2, xmlPullParser, "pathData", 1);
            if (strT != null) {
                String strT2 = hq.t(typedArrayZ2, xmlPullParser, "propertyXName", 2);
                String strT3 = hq.t(typedArrayZ2, xmlPullParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (strT2 == null && strT3 == null) {
                    throw new InflateException(typedArrayZ2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    au0.b(uj.i(strT), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    while (true) {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        z = false;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, z);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f2 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    float f3 = 0.0f;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 >= iMin) {
                            break;
                        }
                        int i6 = iMin;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                        fArr[i4] = fArr3[0];
                        fArr2[i4] = fArr3[1];
                        int i7 = i5 + 1;
                        f3 += f2;
                        if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                            pathMeasure2.nextContour();
                            i5 = i7;
                        }
                        i4++;
                        iMin = i6;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strT2 != null ? PropertyValuesHolder.ofFloat(strT2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strT3 != null ? PropertyValuesHolder.ofFloat(strT3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                } catch (RuntimeException e2) {
                    throw new RuntimeException("Error in parsing ".concat(strT), e2);
                }
            } else {
                valueAnimator = valueAnimator3;
                i = 0;
                objectAnimator2.setPropertyName(hq.t(typedArrayZ2, xmlPullParser, "propertyName", 0));
            }
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
                resourceId = typedArrayZ.getResourceId(i, i);
            } else {
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArrayZ.recycle();
            if (typedArrayZ2 != null) {
                typedArrayZ2.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        i = 0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayZ.getResourceId(i, i);
        } else {
            resourceId = 0;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayZ.recycle();
        if (typedArrayZ2 != null) {
            typedArrayZ2.recycle();
        }
        return valueAnimator2;
    }

    public static MappedByteBuffer L(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] Q(ByteBuffer byteBuffer) throws i9 {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new i9("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new i9("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    public static final void R(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static void S(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void V(Object obj) {
        if (obj instanceof py0) {
            throw ((py0) obj).c;
        }
    }

    public static void W(String str) {
        pn pnVar = new pn(gr0.f("lateinit property ", str, " has not been initialized"));
        S(pnVar, y90.class.getName());
        throw pnVar;
    }

    public static String X(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b2 & 255) >>> 4]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }

    public static boolean Y(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static rd0 d() {
        return new rd0(null);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final int f(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int g(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static t10 h(t10 t10Var, int i) {
        oh ohVar;
        if (i < 0 && i != -2 && i != -1) {
            nh0.e(gr0.e(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        oh ohVar2 = oh.c;
        if (i == -1) {
            i = 0;
            ohVar = oh.d;
        } else {
            ohVar = ohVar2;
        }
        if (t10Var instanceof o60) {
            return ds.q((o60) t10Var, null, i, ohVar, 1);
        }
        kx kxVar = (2 & 2) != 0 ? kx.c : null;
        if ((2 & 4) != 0) {
            i = -3;
        }
        if ((2 & 8) == 0) {
            ohVar2 = ohVar;
        }
        return new jk(i, ohVar2, kxVar, t10Var);
    }

    public static final gk i(sh shVar) {
        return new gk(shVar, true);
    }

    public static boolean j(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zK;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x037f  */
    public static Animator l(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i3;
        PropertyValuesHolder propertyValuesHolderW;
        int size;
        int i4;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorK;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i5 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i6 = 1;
            if (next == 1) {
                break;
            }
            int i7 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    K(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorK = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorK = K(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        XmlPullParser xmlPullParser2 = xmlPullParser;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayZ = hq.z(resources2, theme2, attributeSet, hq.j);
                            l(context, resources2, theme2, xmlPullParser2, attributeSet, animatorSet2, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayZ.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayZ.recycle();
                            i2 = depth;
                            animator2 = animator;
                        } else {
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser2);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlPullParser2.getEventType();
                                if (eventType == i5 || eventType == i6) {
                                    break;
                                }
                                if (eventType != i7) {
                                    xmlPullParser2.next();
                                } else {
                                    if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                                        TypedArray typedArrayZ2 = hq.z(resources2, theme2, attributeSetAsAttributeSet, hq.k);
                                        String strT = hq.t(typedArrayZ2, xmlPullParser2, "propertyName", i5);
                                        int i8 = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayZ2.getInt(i7, 4) : 4;
                                        int[] iArr = hq.l;
                                        int i9 = i8;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlPullParser2.next();
                                            i3 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlPullParser2.getName().equals("keyframe")) {
                                                if (i9 == 4) {
                                                    TypedArray typedArrayZ3 = hq.z(resources2, theme2, Xml.asAttributeSet(xmlPullParser2), iArr);
                                                    TypedValue typedValuePeekValue = !hq.x(xmlPullParser2, "value") ? null : typedArrayZ3.peekValue(0);
                                                    int i10 = (typedValuePeekValue == null || !F(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayZ3.recycle();
                                                    i9 = i10;
                                                }
                                                TypedArray typedArrayZ4 = hq.z(resources2, theme2, Xml.asAttributeSet(xmlPullParser2), iArr);
                                                float f2 = hq.x(xmlPullParser2, "fraction") ? typedArrayZ4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !hq.x(xmlPullParser2, "value") ? null : typedArrayZ4.peekValue(0);
                                                boolean z2 = typedValuePeekValue2 != null;
                                                int i11 = i9 == 4 ? (z2 && F(typedValuePeekValue2.type)) ? 3 : 0 : i9;
                                                if (!z2) {
                                                    keyframeOfFloat = i11 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                                } else if (i11 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f2, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayZ4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i11 == 1 || i11 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f2, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayZ4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayZ4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayZ4.recycle();
                                                ArrayList arrayList4 = arrayList3;
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    arrayList4.add(keyframeOfFloat);
                                                    arrayList3 = arrayList4;
                                                }
                                                xmlPullParser2.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i3;
                                            iArr = iArr;
                                        }
                                        ArrayList arrayList5 = arrayList3;
                                        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                                            propertyValuesHolderW = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i12 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList5.add(arrayList5.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i12++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList5.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i12++;
                                                }
                                            }
                                            int i13 = i12;
                                            Keyframe[] keyframeArr = new Keyframe[i13];
                                            arrayList5.toArray(keyframeArr);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                Keyframe keyframe3 = keyframeArr[i14];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i4 = i13;
                                                } else {
                                                    if (i14 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i15 = i13 - 1;
                                                        if (i14 == i15) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i16 = i14;
                                                            for (int i17 = i14 + 1; i17 < i15 && keyframeArr[i17].getFraction() < 0.0f; i17++) {
                                                                i16 = i17;
                                                            }
                                                            float fraction3 = (keyframeArr[i16 + 1].getFraction() - keyframeArr[i14 - 1].getFraction()) / ((i16 - i14) + 2);
                                                            int i18 = i14;
                                                            while (i18 <= i16) {
                                                                float f3 = fraction3;
                                                                keyframeArr[i18].setFraction(keyframeArr[i18 - 1].getFraction() + f3);
                                                                i18++;
                                                                i13 = i13;
                                                                fraction3 = f3;
                                                            }
                                                            i4 = i13;
                                                        }
                                                    }
                                                    i4 = i13;
                                                }
                                                i14++;
                                                i13 = i4;
                                            }
                                            propertyValuesHolderW = PropertyValuesHolder.ofKeyframe(strT, keyframeArr);
                                            if (i9 == 3) {
                                                propertyValuesHolderW.setEvaluator(nd.a);
                                            }
                                        }
                                        if (propertyValuesHolderW == null) {
                                            propertyValuesHolderW = w(typedArrayZ2, i8, 0, 1, strT);
                                        }
                                        if (propertyValuesHolderW != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolderW);
                                        }
                                        typedArrayZ2.recycle();
                                    } else {
                                        i3 = depth;
                                    }
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlPullParser2 = xmlPullParser;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i3;
                                    i5 = 3;
                                    i6 = 1;
                                    i7 = 2;
                                }
                            }
                            i2 = depth;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i19 = 0; i19 < size2; i19++) {
                                    propertyValuesHolderArr[i19] = (PropertyValuesHolder) arrayList2.get(i19);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            z = true;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator2);
                    }
                    depth = i2;
                }
                animator = animatorK;
                i2 = depth;
                animator2 = animator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator2);
                }
                depth = i2;
            }
        }
        int i20 = 0;
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size3 = arrayList.size();
            int i21 = 0;
            while (i20 < size3) {
                Object obj = arrayList.get(i20);
                i20++;
                animatorArr[i21] = (Animator) obj;
                i21++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    public static final py0 m(Throwable th) {
        th.getClass();
        return new py0(th);
    }

    public static final void n(br brVar) {
        pd0 pd0Var = (pd0) brVar.l(fw.f);
        if (pd0Var != null && !pd0Var.a()) {
            throw pd0Var.n();
        }
    }

    public static gg1 o(bq bqVar, int i, ArrayList arrayList, gg1 gg1Var) {
        int i2;
        int i3 = i == 0 ? bqVar.n0 : bqVar.o0;
        if (i3 != -1 && (gg1Var == null || i3 != gg1Var.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                gg1 gg1Var2 = (gg1) arrayList.get(i4);
                if (gg1Var2.b == i3) {
                    if (gg1Var != null) {
                        gg1Var.c(i, gg1Var2);
                        arrayList.remove(gg1Var);
                    }
                    gg1Var = gg1Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return gg1Var;
        }
        if (gg1Var == null) {
            if (bqVar instanceof v70) {
                v70 v70Var = (v70) bqVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= v70Var.r0) {
                        i2 = -1;
                        break;
                    }
                    bq bqVar2 = v70Var.q0[i5];
                    if ((i == 0 && (i2 = bqVar2.n0) != -1) || (i == 1 && (i2 = bqVar2.o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        gg1 gg1Var3 = (gg1) arrayList.get(i6);
                        if (gg1Var3.b == i2) {
                            gg1Var = gg1Var3;
                            break;
                        }
                    }
                }
            }
            if (gg1Var == null) {
                gg1Var = new gg1();
                gg1Var.a = new ArrayList();
                gg1Var.d = null;
                gg1Var.e = -1;
                int i7 = gg1.f;
                gg1.f = i7 + 1;
                gg1Var.b = i7;
                gg1Var.c = i;
            }
            arrayList.add(gg1Var);
        }
        ArrayList arrayList2 = gg1Var.a;
        if (arrayList2.contains(bqVar)) {
            return gg1Var;
        }
        arrayList2.add(bqVar);
        if (bqVar instanceof k70) {
            k70 k70Var = (k70) bqVar;
            k70Var.t0.c(k70Var.u0 == 0 ? 1 : 0, gg1Var, arrayList);
        }
        int i8 = gg1Var.b;
        if (i == 0) {
            bqVar.n0 = i8;
            bqVar.I.c(i, gg1Var, arrayList);
            bqVar.K.c(i, gg1Var, arrayList);
        } else {
            bqVar.o0 = i8;
            bqVar.J.c(i, gg1Var, arrayList);
            bqVar.M.c(i, gg1Var, arrayList);
            bqVar.L.c(i, gg1Var, arrayList);
        }
        bqVar.P.c(i, gg1Var, arrayList);
        return gg1Var;
    }

    public static f51 p(vy vyVar, z9 z9Var, int i) throws g51 {
        try {
            aa aaVarK = bu0.k(vyVar, z9Var);
            long j = aaVarK.b;
            bs bsVar = (bs) aaVarK.c;
            ByteBuffer byteBufferA = bsVar.a((int) bsVar.size(), 0L);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.order() != byteOrder) {
                id.q("ByteBuffer byte order must be little endian");
                return null;
            }
            int iCapacity = byteBufferA.capacity() - 24;
            if (iCapacity < 8) {
                id.q(q51.k(iCapacity, "end < start: ", " < 8"));
                return null;
            }
            int iCapacity2 = byteBufferA.capacity();
            if (iCapacity > byteBufferA.capacity()) {
                v.f("end > capacity: ", iCapacity, " > ", iCapacity2);
                return null;
            }
            int iLimit = byteBufferA.limit();
            int iPosition = byteBufferA.position();
            int i2 = 0;
            try {
                byteBufferA.position(0);
                byteBufferA.limit(iCapacity);
                byteBufferA.position(8);
                ByteBuffer byteBufferSlice = byteBufferA.slice();
                byteBufferSlice.order(byteBufferA.order());
                byteBufferA.position(0);
                byteBufferA.limit(iLimit);
                byteBufferA.position(iPosition);
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new g51(gr0.e(i2, "Insufficient data to read size of APK Signing Block entry #"));
                    }
                    long j2 = byteBufferSlice.getLong();
                    if (j2 < 4 || j2 > 2147483647L) {
                        throw new g51("APK Signing Block entry #" + i2 + " size out of range: " + j2);
                    }
                    int i3 = (int) j2;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new g51("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == i) {
                        return new f51(t(i3 - 4, byteBufferSlice), j, z9Var.a, z9Var.d, z9Var.e);
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new g51(gr0.e(i, "No APK Signature Scheme block in APK Signing Block with ID: "));
            } catch (Throwable th) {
                byteBufferA.position(0);
                byteBufferA.limit(iLimit);
                byteBufferA.position(iPosition);
                throw th;
            }
        } catch (k9 e2) {
            throw new g51(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object q(w71 w71Var, v20 v20Var, sq sqVar) {
        s20 s20Var;
        mx0 mx0Var;
        x1 e2;
        r20 r20Var;
        Object obj;
        bx bxVar = ec1.d;
        if (sqVar instanceof s20) {
            s20Var = (s20) sqVar;
            int i = s20Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                s20Var.i = i - Integer.MIN_VALUE;
            } else {
                s20Var = new s20(sqVar);
            }
        } else {
            s20Var = new s20(sqVar);
        }
        Object obj2 = s20Var.h;
        int i2 = s20Var.i;
        if (i2 != 0) {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r20Var = s20Var.g;
            mx0Var = s20Var.f;
            try {
                V(obj2);
            } catch (x1 e3) {
                e2 = e3;
                if (e2.c == r20Var) {
                    throw e2;
                }
                br brVar = s20Var.d;
                brVar.getClass();
                n(brVar);
            }
            obj = mx0Var.c;
            if (obj != bxVar) {
                return obj;
            }
            throw new NoSuchElementException("Expected at least one element matching the predicate");
        }
        V(obj2);
        mx0 mx0Var2 = new mx0();
        mx0Var2.c = bxVar;
        r20 r20Var2 = new r20(v20Var, mx0Var2, 0);
        try {
            s20Var.f = mx0Var2;
            s20Var.g = r20Var2;
            s20Var.i = 1;
            w71Var.a(r20Var2, s20Var);
            return lr.c;
        } catch (x1 e4) {
            mx0Var = mx0Var2;
            e2 = e4;
            r20Var = r20Var2;
        }
        if (e2.c == r20Var) {
            throw e2;
        }
        br brVar2 = s20Var.d;
        brVar2.getClass();
        n(brVar2);
        obj = mx0Var.c;
        if (obj != bxVar) {
            return obj;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(t10 t10Var, d60 d60Var, sq sqVar) {
        u20 u20Var;
        mx0 mx0Var;
        x1 e2;
        r20 r20Var;
        if (sqVar instanceof u20) {
            u20Var = (u20) sqVar;
            int i = u20Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                u20Var.i = i - Integer.MIN_VALUE;
            } else {
                u20Var = new u20(sqVar);
            }
        } else {
            u20Var = new u20(sqVar);
        }
        Object obj = u20Var.h;
        int i2 = u20Var.i;
        int i3 = 1;
        if (i2 == 0) {
            V(obj);
            mx0 mx0Var2 = new mx0();
            r20 r20Var2 = new r20(d60Var, mx0Var2, i3);
            try {
                u20Var.f = mx0Var2;
                u20Var.g = r20Var2;
                u20Var.i = 1;
                Object objA = t10Var.a(r20Var2, u20Var);
                Object obj2 = lr.c;
                if (objA == obj2) {
                    return obj2;
                }
                mx0Var = mx0Var2;
            } catch (x1 e3) {
                mx0Var = mx0Var2;
                e2 = e3;
                r20Var = r20Var2;
                if (e2.c == r20Var) {
                    throw e2;
                }
                br brVar = u20Var.d;
                brVar.getClass();
                n(brVar);
            }
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r20Var = u20Var.g;
            mx0Var = u20Var.f;
            try {
                V(obj);
            } catch (x1 e4) {
                e2 = e4;
                if (e2.c == r20Var) {
                    throw e2;
                }
                br brVar2 = u20Var.d;
                brVar2.getClass();
                n(brVar2);
            }
        }
        return mx0Var.c;
    }

    public static int s(int i) {
        for (int i2 : q51.s(3)) {
            if (q51.r(i2) == i) {
                return i2;
            }
        }
        return 2;
    }

    public static ByteBuffer t(int i, ByteBuffer byteBuffer) {
        if (i < 0) {
            id.q(gr0.e(i, "size: "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static final String u(fm fmVar) {
        String strK;
        Map map = fm.b;
        Class cls = fmVar.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strK2 = hq.k(cls.getName());
            return strK2 == null ? cls.getCanonicalName() : strK2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strK = hq.k(componentType.getName())) != null) {
            strConcat = strK.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public static ByteBuffer v(ByteBuffer byteBuffer) throws i9 {
        if (byteBuffer.remaining() < 4) {
            throw new i9("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            id.q("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return t(i, byteBuffer);
        }
        throw new i9("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    public static PropertyValuesHolder w(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && F(i4)) || (z2 && F(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            au0[] au0VarArrI = uj.i(string);
            au0[] au0VarArrI2 = uj.i(string2);
            if (au0VarArrI != null || au0VarArrI2 != null) {
                if (au0VarArrI != null) {
                    z8 z8Var = new z8();
                    if (au0VarArrI2 == null) {
                        return PropertyValuesHolder.ofObject(str, z8Var, au0VarArrI);
                    }
                    if (uj.c(au0VarArrI, au0VarArrI2)) {
                        return PropertyValuesHolder.ofObject(str, z8Var, au0VarArrI, au0VarArrI2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (au0VarArrI2 != null) {
                    return PropertyValuesHolder.ofObject(str, new z8(), au0VarArrI2);
                }
            }
            return null;
        }
        nd ndVar = i == 3 ? nd.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = F(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = F(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else {
                color = F(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && ndVar != null) {
            propertyValuesHolderOfInt.setEvaluator(ndVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static String x(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static Intent y(qa qaVar) {
        Intent parentActivityIntent = qaVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strA = A(qaVar, qaVar.getComponentName());
            if (strA == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(qaVar, strA);
            try {
                return A(qaVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strA + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent z(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strA = A(context, componentName);
        if (strA == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strA);
        return A(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public abstract void D();

    public abstract void M(Throwable th);

    public abstract void N(int i);

    public abstract void O(Typeface typeface, boolean z);

    public abstract void P(ah ahVar);

    public void T() {
    }

    public void U() {
    }

    @Override // defpackage.mu0
    public void a() {
    }

    @Override // defpackage.mu0
    public void b() {
    }
}
