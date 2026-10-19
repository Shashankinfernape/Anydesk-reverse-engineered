package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v8 implements Choreographer.FrameCallback {
    public final /* synthetic */ y6 a;

    public v8(y6 y6Var) {
        this.a = y6Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0158  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173 A[LOOP:1: B:44:0x0167->B:48:0x0173, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        long j3;
        boolean z;
        float f;
        r61 r61Var;
        float f2;
        float f3;
        r61 r61Var2;
        boolean z2;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        w8 w8Var;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        w8 w8Var2 = (w8) ((af1) this.a.d).d;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = w8Var2.b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            q61 q61Var = (q61) arrayList3.get(i2);
            if (q61Var == null) {
                i2 = i2;
            } else {
                i51 i51Var = w8Var2.a;
                Long l = (Long) i51Var.get(q61Var);
                if (l == null) {
                    j2 = q61Var.g;
                    if (j2 == 0) {
                        q61Var.g = jUptimeMillis;
                        q61Var.a(q61Var.b);
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        q61Var.g = jUptimeMillis;
                        z = q61Var.m;
                        f = q61Var.l;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                q61Var.k.i = f;
                                q61Var.l = Float.MAX_VALUE;
                            }
                            q61Var.b = (float) q61Var.k.i;
                            q61Var.a = 0.0f;
                            q61Var.m = false;
                        } else {
                            i2 = i2;
                            r61Var = q61Var.k;
                            if (f != Float.MAX_VALUE) {
                                double d = r61Var.i;
                                long j4 = j3 / 2;
                                cw cwVarA = r61Var.a(q61Var.b, q61Var.a, j4);
                                r61 r61Var3 = q61Var.k;
                                r61Var3.i = q61Var.l;
                                q61Var.l = Float.MAX_VALUE;
                                cw cwVarA2 = r61Var3.a(cwVarA.a, cwVarA.b, j4);
                                q61Var.b = cwVarA2.a;
                                q61Var.a = cwVarA2.b;
                                f2 = -3.4028235E38f;
                            } else {
                                f2 = -3.4028235E38f;
                                cw cwVarA3 = r61Var.a(q61Var.b, q61Var.a, j3);
                                q61Var.b = cwVarA3.a;
                                q61Var.a = cwVarA3.b;
                            }
                            float fMax = Math.max(q61Var.b, f2);
                            q61Var.b = fMax;
                            float fMin = Math.min(fMax, Float.MAX_VALUE);
                            q61Var.b = fMin;
                            f3 = q61Var.a;
                            r61Var2 = q61Var.k;
                            r61Var2.getClass();
                            if (Math.abs(f3) < r61Var2.e) {
                            }
                            z2 = false;
                            float fMin2 = Math.min(q61Var.b, Float.MAX_VALUE);
                            q61Var.b = fMin2;
                            float fMax2 = Math.max(fMin2, -3.4028235E38f);
                            q61Var.b = fMax2;
                            q61Var.a(fMax2);
                            if (z2) {
                                arrayList = q61Var.i;
                                q61Var.f = false;
                                threadLocal = w8.f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new w8());
                                }
                                w8Var = (w8) threadLocal.get();
                                w8Var.a.remove(q61Var);
                                arrayList2 = w8Var.b;
                                iIndexOf = arrayList2.indexOf(q61Var);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    w8Var.e = true;
                                }
                                q61Var.g = 0L;
                                q61Var.c = false;
                                for (i = 0; i < arrayList.size(); i++) {
                                    if (arrayList.get(i) == null) {
                                        arrayList.get(i).getClass();
                                        id.c();
                                        return;
                                    }
                                }
                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z2 = true;
                        float fMin3 = Math.min(q61Var.b, Float.MAX_VALUE);
                        q61Var.b = fMin3;
                        float fMax3 = Math.max(fMin3, -3.4028235E38f);
                        q61Var.b = fMax3;
                        q61Var.a(fMax3);
                        if (z2) {
                            arrayList = q61Var.i;
                            q61Var.f = false;
                            threadLocal = w8.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new w8());
                            }
                            w8Var = (w8) threadLocal.get();
                            w8Var.a.remove(q61Var);
                            arrayList2 = w8Var.b;
                            iIndexOf = arrayList2.indexOf(q61Var);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                w8Var.e = true;
                            }
                            q61Var.g = 0L;
                            q61Var.c = false;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) == null) {
                                    arrayList.get(i).getClass();
                                    id.c();
                                    return;
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l.longValue() < jUptimeMillis2) {
                    i51Var.remove(q61Var);
                    j2 = q61Var.g;
                    if (j2 == 0) {
                        q61Var.g = jUptimeMillis;
                        q61Var.a(q61Var.b);
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        q61Var.g = jUptimeMillis;
                        z = q61Var.m;
                        f = q61Var.l;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                q61Var.k.i = f;
                                q61Var.l = Float.MAX_VALUE;
                            }
                            q61Var.b = (float) q61Var.k.i;
                            q61Var.a = 0.0f;
                            q61Var.m = false;
                        } else {
                            i2 = i2;
                            r61Var = q61Var.k;
                            if (f != Float.MAX_VALUE) {
                                double d2 = r61Var.i;
                                long j5 = j3 / 2;
                                cw cwVarA4 = r61Var.a(q61Var.b, q61Var.a, j5);
                                r61 r61Var4 = q61Var.k;
                                r61Var4.i = q61Var.l;
                                q61Var.l = Float.MAX_VALUE;
                                cw cwVarA5 = r61Var4.a(cwVarA4.a, cwVarA4.b, j5);
                                q61Var.b = cwVarA5.a;
                                q61Var.a = cwVarA5.b;
                                f2 = -3.4028235E38f;
                            } else {
                                f2 = -3.4028235E38f;
                                cw cwVarA6 = r61Var.a(q61Var.b, q61Var.a, j3);
                                q61Var.b = cwVarA6.a;
                                q61Var.a = cwVarA6.b;
                            }
                            float fMax4 = Math.max(q61Var.b, f2);
                            q61Var.b = fMax4;
                            float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                            q61Var.b = fMin4;
                            f3 = q61Var.a;
                            r61Var2 = q61Var.k;
                            r61Var2.getClass();
                            if (Math.abs(f3) < r61Var2.e || Math.abs(fMin4 - ((float) r61Var2.i)) >= r61Var2.d) {
                                z2 = false;
                            } else {
                                q61Var.b = (float) q61Var.k.i;
                                q61Var.a = 0.0f;
                            }
                            float fMin5 = Math.min(q61Var.b, Float.MAX_VALUE);
                            q61Var.b = fMin5;
                            float fMax5 = Math.max(fMin5, -3.4028235E38f);
                            q61Var.b = fMax5;
                            q61Var.a(fMax5);
                            if (z2) {
                                arrayList = q61Var.i;
                                q61Var.f = false;
                                threadLocal = w8.f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new w8());
                                }
                                w8Var = (w8) threadLocal.get();
                                w8Var.a.remove(q61Var);
                                arrayList2 = w8Var.b;
                                iIndexOf = arrayList2.indexOf(q61Var);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    w8Var.e = true;
                                }
                                q61Var.g = 0L;
                                q61Var.c = false;
                                while (i < arrayList.size()) {
                                    if (arrayList.get(i) == null) {
                                        arrayList.get(i).getClass();
                                        id.c();
                                        return;
                                    }
                                }
                                while (size >= 0) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z2 = true;
                        float fMin6 = Math.min(q61Var.b, Float.MAX_VALUE);
                        q61Var.b = fMin6;
                        float fMax6 = Math.max(fMin6, -3.4028235E38f);
                        q61Var.b = fMax6;
                        q61Var.a(fMax6);
                        if (z2) {
                            arrayList = q61Var.i;
                            q61Var.f = false;
                            threadLocal = w8.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new w8());
                            }
                            w8Var = (w8) threadLocal.get();
                            w8Var.a.remove(q61Var);
                            arrayList2 = w8Var.b;
                            iIndexOf = arrayList2.indexOf(q61Var);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                w8Var.e = true;
                            }
                            q61Var.g = 0L;
                            q61Var.c = false;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) == null) {
                                    arrayList.get(i).getClass();
                                    id.c();
                                    return;
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i2 = i2;
                }
            }
            i2++;
        }
        if (w8Var2.e) {
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            w8Var2.e = false;
        }
        if (arrayList3.size() > 0) {
            if (w8Var2.d == null) {
                w8Var2.d = new y6(w8Var2.c);
            }
            y6 y6Var = w8Var2.d;
            ((Choreographer) y6Var.e).postFrameCallback((v8) y6Var.f);
        }
    }
}
