package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ic1 extends gc1 {
    public final Class E;
    public final Constructor F;
    public final Method G;
    public final Method H;
    public final Method I;
    public final Method J;
    public final Method K;

    public ic1() throws NoSuchMethodException {
        Method methodQ;
        Constructor<?> constructor;
        Method methodP;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodP = P(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodQ = Q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodQ = null;
            constructor = null;
            methodP = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.E = cls;
        this.F = constructor;
        this.G = methodP;
        this.H = method;
        this.I = method2;
        this.J = method3;
        this.K = methodQ;
    }

    public static Method P(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.G.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.E, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.K.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.I.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Q(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.gc1, defpackage.ds
    public final Typeface h(Context context, o30 o30Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.G;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, o30Var, resources, i);
        }
        try {
            objNewInstance = this.F.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            p30[] p30VarArr = o30Var.a;
            int length = p30VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                p30 p30Var = p30VarArr[i2];
                Context context2 = context;
                if (M(context2, objNewInstance, p30Var.a, p30Var.e, p30Var.b, p30Var.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(p30Var.d))) {
                    i2++;
                    context = context2;
                } else {
                    try {
                        this.J.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (O(objNewInstance)) {
                return N(objNewInstance);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // defpackage.gc1, defpackage.ds
    public final Typeface i(Context context, r30[] r30VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceN;
        boolean zBooleanValue;
        if (r30VarArr.length >= 1) {
            Method method = this.G;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (r30 r30Var : r30VarArr) {
                        if (r30Var.f == 0) {
                            Uri uri = r30Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, y90.L(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.F.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = r30VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.J;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!O(objNewInstance) || (typefaceN = N(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceN, i);
                            }
                            r30 r30Var2 = r30VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(r30Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.H.invoke(objNewInstance, byteBuffer, Integer.valueOf(r30Var2.b), null, Integer.valueOf(r30Var2.c), Integer.valueOf(r30Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                        }
                    }
                } else {
                    r30 r30VarM = ds.m(r30VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(r30VarM.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(r30VarM.c).setItalic(r30VarM.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.ds
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.G;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.F.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!M(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.J.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (O(objNewInstance)) {
                return N(objNewInstance);
            }
        }
        return null;
    }
}
