package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class my0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(ly0 ly0Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(ly0Var);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(ly0Var, sparseArray);
                }
                sparseArray.append(i, new ky0(colorStateList, ly0Var.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, uj ujVar, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            yh0 yh0Var = fc1.b;
            Typeface typeface = (Typeface) yh0Var.f(fc1.b(resources, i, string, i3, i2));
            int i4 = 14;
            if (typeface != null) {
                if (ujVar != null) {
                    new Handler(Looper.getMainLooper()).post(new c0(ujVar, i4, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        n30 n30VarK = th1.K(resources.getXml(i), resources);
                        if (n30VarK == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (ujVar != null) {
                                ujVar.b(-3);
                            }
                        } else {
                            typefaceA = fc1.a(context, n30VarK, resources, i, string, typedValue.assetCookie, i2, ujVar, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceK = fc1.a.k(context, resources, i, string, i2);
                        if (typefaceK != null) {
                            yh0Var.j(fc1.b(resources, i, string, i5, i2), typefaceK);
                        }
                        if (ujVar != null) {
                            if (typefaceK != null) {
                                new Handler(Looper.getMainLooper()).post(new c0(ujVar, i4, typefaceK));
                            } else {
                                ujVar.b(-3);
                            }
                        }
                        typefaceA = typefaceK;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (ujVar != null) {
                        ujVar.b(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (ujVar != null) {
                        ujVar.b(-3);
                    }
                }
            }
        } else if (ujVar != null) {
            ujVar.b(-3);
        }
        if (typefaceA != null || ujVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
