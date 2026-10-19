package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class m30 {
    public static final yh0 a = new yh0(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final i51 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ey0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new i51(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((g30) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static l30 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceI;
        yh0 yh0Var = a;
        ec1.h("getFontSync");
        try {
            Typeface typeface = (Typeface) yh0Var.f(str);
            if (typeface != null) {
                l30 l30Var = new l30(typeface);
                Trace.endSection();
                return l30Var;
            }
            try {
                v7 v7VarA = f30.a(context, list);
                List list2 = (List) v7VarA.d;
                int i3 = v7VarA.c;
                if (i3 == 0) {
                    r30[] r30VarArr = (r30[]) list2.get(0);
                    if (r30VarArr == null || r30VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = r30VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = r30VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    l30 l30Var2 = new l30(i2);
                    Trace.endSection();
                    return l30Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    r30[] r30VarArr2 = (r30[]) list2.get(0);
                    ds dsVar = fc1.a;
                    ec1.h("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceI = fc1.a.i(context, r30VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    ds dsVar2 = fc1.a;
                    ec1.h("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceI = fc1.a.j(i, context, list2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceI == null) {
                    l30 l30Var3 = new l30(-3);
                    Trace.endSection();
                    return l30Var3;
                }
                yh0Var.j(str, typefaceI);
                l30 l30Var4 = new l30(typefaceI);
                Trace.endSection();
                return l30Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                l30 l30Var5 = new l30(-1);
                Trace.endSection();
                return l30Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
