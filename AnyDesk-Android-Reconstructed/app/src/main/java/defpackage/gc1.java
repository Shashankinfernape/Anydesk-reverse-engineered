package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class gc1 extends ds {
    public static Constructor A = null;
    public static Method B = null;
    public static Method C = null;
    public static boolean D = false;
    public static Class z;

    public static boolean K(Object obj, String str, int i, boolean z2) throws NoSuchMethodException {
        L();
        try {
            try {
                return ((Boolean) B.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
            } catch (InvocationTargetException e) {
                e = e;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
    }

    public static void L() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (D) {
            return;
        }
        D = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        A = constructor;
        z = cls;
        B = method2;
        C = method;
    }

    @Override // defpackage.ds
    public Typeface h(Context context, o30 o30Var, Resources resources, int i) throws NoSuchMethodException {
        L();
        try {
            Object objNewInstance = A.newInstance(null);
            for (p30 p30Var : o30Var.a) {
                File fileC = y90.C(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    if (!y90.j(fileC, resources, p30Var.f)) {
                        return null;
                    }
                    if (!K(objNewInstance, fileC.getPath(), p30Var.b, p30Var.c)) {
                        return null;
                    }
                    fileC.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileC.delete();
                }
            }
            L();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) z, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) C.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ds
    public Typeface i(Context context, r30[] r30VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (r30VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(ds.m(r30VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileC = y90.C(context);
                        if (fileC == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (y90.k(fileC, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
                                    fileC.delete();
                                } else {
                                    fileC.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileC.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
