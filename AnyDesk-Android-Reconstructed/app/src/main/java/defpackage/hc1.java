package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 extends ds {
    public static final Constructor A;
    public static final Method B;
    public static final Method C;
    public static final Class z;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        A = constructor;
        z = cls;
        B = method2;
        C = method;
    }

    public static boolean K(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) B.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface L(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) z, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) C.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.ds
    public final Typeface h(Context context, o30 o30Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = A.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (p30 p30Var : o30Var.a) {
                int i2 = p30Var.f;
                File fileC = y90.C(context);
                if (fileC != null) {
                    try {
                        if (y90.j(fileC, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileC);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileC.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileC.delete();
                        }
                        if (map != null && K(objNewInstance, map, p30Var.e, p30Var.b, p30Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileC.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return L(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.ds
    public final Typeface i(Context context, r30[] r30VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = A.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            i51 i51Var = new i51(0);
            for (r30 r30Var : r30VarArr) {
                Uri uri = r30Var.a;
                ByteBuffer byteBufferL = (ByteBuffer) i51Var.get(uri);
                if (byteBufferL == null) {
                    byteBufferL = y90.L(context, uri);
                    i51Var.put(uri, byteBufferL);
                }
                if (byteBufferL != null && K(objNewInstance, byteBufferL, r30Var.b, r30Var.c, r30Var.d)) {
                }
            }
            Typeface typefaceL = L(objNewInstance);
            if (typefaceL != null) {
                return Typeface.create(typefaceL, i);
            }
        }
        return null;
    }
}
