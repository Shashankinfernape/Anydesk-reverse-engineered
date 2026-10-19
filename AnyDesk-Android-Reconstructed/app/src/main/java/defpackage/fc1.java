package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class fc1 {
    public static final ds a;
    public static final yh0 b;
    public static Paint c;

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    static {
        ec1.h("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new lc1();
        } else if (i >= 29) {
            a = new kc1();
        } else if (i >= 28) {
            a = new jc1();
        } else if (i >= 26) {
            a = new ic1();
        } else if (i < 24) {
            a = new gc1();
        } else {
            Method method = hc1.B;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new hc1();
            } else {
                a = new gc1();
            }
        }
        b = new yh0(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, n30 n30Var, Resources resources, int i, String str, int i2, int i3, uj ujVar, boolean z) {
        Typeface typefaceH;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 14;
        int i5 = -3;
        if (n30Var instanceof q30) {
            q30 q30Var = (q30) n30Var;
            String str2 = q30Var.d;
            typefaceH = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = q30Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList.size()) {
                                        g30 g30Var = (g30) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(g30Var.f)) {
                                            customFallbackBuilder.setSystemFallback(g30Var.e);
                                        } else {
                                            String str3 = g30Var.e;
                                            String str4 = g30Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + g30Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(iq.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((g30) arrayList.get(i7)).e) != null) {
                                i7++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((g30) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (ujVar != null) {
                    new Handler(Looper.getMainLooper()).post(new c0(ujVar, i4, typefaceBuild));
                }
                b.j(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z3 = !z ? ujVar != null : q30Var.c != 0;
            int i9 = z ? q30Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            xt0 xt0Var = new xt0(22);
            xt0Var.d = ujVar;
            ArrayList arrayList2 = q30Var.a;
            se seVar = new se(handler, 4);
            bc bcVar = new bc(xt0Var, seVar, 11, z2);
            int i10 = 8;
            if (!z3) {
                String strA = m30.a(i3, arrayList2);
                Typeface typeface = (Typeface) m30.a.f(strA);
                if (typeface != null) {
                    seVar.execute(new d3(xt0Var, typeface, i10, objArr2 == true ? 1 : 0));
                    typefaceH = typeface;
                } else {
                    k30 k30Var = new k30(objArr == true ? 1 : 0, bcVar);
                    synchronized (m30.c) {
                        try {
                            i51 i51Var = m30.d;
                            ArrayList arrayList3 = (ArrayList) i51Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(k30Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(k30Var);
                                i51Var.put(strA, arrayList4);
                                j30 j30Var = new j30(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = m30.b;
                                k30 k30Var2 = new k30(i6, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                wh whVar = new wh();
                                whVar.d = j30Var;
                                whVar.e = k30Var2;
                                whVar.f = handler2;
                                threadPoolExecutor.execute(whVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    id.q("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                g30 g30Var2 = (g30) arrayList2.get(0);
                yh0 yh0Var = m30.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{g30Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = m30.a(i3, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) m30.a.f(strA2);
                if (typeface2 != null) {
                    seVar.execute(new d3(xt0Var, typeface2, i10, objArr4 == true ? 1 : 0));
                    typefaceH = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr5 = {g30Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    l30 l30VarB = m30.b(strA2, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    bcVar.d0(l30VarB);
                    typefaceH = l30VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    l30 l30Var = (l30) m30.b.submit(new j30(strA2, context, g30Var2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    bcVar.d0(l30Var);
                                    typefaceH = l30Var.a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((se) bcVar.e).execute(new qi(bcVar.d, i5, (int) (objArr3 == true ? 1 : 0)));
                    }
                }
            }
        } else {
            typefaceH = a.h(context, (o30) n30Var, resources, i3);
            if (ujVar != null) {
                if (typefaceH != null) {
                    new Handler(Looper.getMainLooper()).post(new c0(ujVar, i4, typefaceH));
                } else {
                    ujVar.b(-3);
                }
            }
        }
        if (typefaceH != null) {
            b.j(b(resources, i, str, i2, i3), typefaceH);
        }
        return typefaceH;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
