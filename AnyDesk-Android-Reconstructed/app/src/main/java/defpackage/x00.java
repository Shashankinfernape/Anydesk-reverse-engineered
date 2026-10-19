package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.anydesk.jnilib.Logging;
import j$.util.Collection$EL;
import j$.util.function.Predicate$CC;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class x00 {
    public static final SimpleDateFormat Y = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final List Z = Arrays.asList("aux", "con", "nul", "prn", "com0", "com1", "com2", "com3", "com4", "com5", "com6", "com7", "com8", "com9", "lpt0", "lpt1", "lpt2", "lpt3", "lpt4", "lpt5", "lpt6", "lpt7", "lpt8", "lpt9");
    public final HashMap A;
    public final HashMap B;
    public final HashMap C;
    public final vm0 D;
    public final vm0 E;
    public final vm0 F;
    public final vm0 G;
    public w00 H;
    public w00 I;
    public uf0 J;
    public uf0 K;
    public final LinkedHashMap L;
    public final vm0 M;
    public final vm0 N;
    public final SharedPreferences O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final Logging a = new Logging("FileManagerViewModel");
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final vm0 l;
    public final vm0 m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public final ArrayList t;
    public final ArrayList u;
    public final ArrayList v;
    public final ArrayList w;
    public final aa x;
    public final aa y;
    public final HashMap z;

    public x00(SharedPreferences sharedPreferences) {
        vm0 vm0Var = new vm0("");
        this.l = vm0Var;
        this.m = vm0Var;
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new aa(2);
        this.y = new aa(2);
        this.z = new HashMap();
        this.A = new HashMap();
        this.B = new HashMap();
        this.C = new HashMap();
        vm0 vm0Var2 = new vm0(new v00());
        this.D = vm0Var2;
        this.E = vm0Var2;
        vm0 vm0Var3 = new vm0(new v00());
        this.F = vm0Var3;
        this.G = vm0Var3;
        this.L = new LinkedHashMap();
        vm0 vm0Var4 = new vm0(new u00());
        this.M = vm0Var4;
        this.N = vm0Var4;
        this.O = sharedPreferences;
        e();
    }

    public static String k(long j) {
        try {
            return Y.format(new Date(j / 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void A(boolean z, long j, boolean z2) {
        synchronized (this.d) {
            try {
                mz mzVar = (mz) (z ? this.z : this.A).get(Long.valueOf(j));
                if (mzVar != null) {
                    mzVar.g(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(boolean z) {
        synchronized (this.b) {
            this.h = z;
        }
    }

    public final void C(boolean z) {
        synchronized (this.b) {
            this.f = z;
        }
    }

    public final void D() {
        n00 n00Var;
        synchronized (this.L) {
            try {
                int size = this.L.size();
                if (size == 0) {
                    this.M.i(new u00());
                    return;
                }
                Iterator it = this.L.keySet().iterator();
                boolean z = false;
                long j = 0;
                long j2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) it.next();
                    if (num == null || (n00Var = (n00) this.L.get(num)) == null || n00Var.a()) {
                        size--;
                    } else {
                        j2 += n00Var.d;
                        j += n00Var.e;
                        int i = n00Var.b;
                        if (i == 0 || i == 1 || i == 3) {
                            z = true;
                        }
                    }
                }
                if (size != 0 && j != 0) {
                    this.M.i(new u00(3, j2 / j));
                    return;
                }
                this.M.i(new u00(z ? 2 : 3, 1.0f));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(int i, boolean z) {
        synchronized (this.b) {
            try {
                if (z) {
                    this.T = i;
                } else {
                    this.S = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(int i) {
        synchronized (this.b) {
            this.P = ec1.l(i);
        }
    }

    public final void G(boolean z) {
        synchronized (this.b) {
            this.g = z;
        }
    }

    public final void H(boolean z, int i, int i2, String str, long j) {
        synchronized (this.b) {
            try {
                w00 w00Var = new w00(i, i2, j, str);
                if (z) {
                    this.I = w00Var;
                } else {
                    this.H = w00Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(boolean z, boolean z2) {
        synchronized (this.c) {
            try {
                if (z) {
                    this.r = z2;
                } else {
                    this.s = z2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(boolean z) {
        synchronized (this.b) {
            try {
                if (z) {
                    this.n = this.o;
                    this.p = this.q;
                } else {
                    this.o = this.n;
                    this.q = this.p;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(mz mzVar) {
        synchronized (this.d) {
            try {
                boolean z = mzVar.a;
                ArrayList arrayList = z ? this.v : this.w;
                mz mzVar2 = (mz) (z ? this.B : this.C).get(mzVar.b);
                if (mzVar2 != null) {
                    mzVar.f(mzVar2.a());
                    mzVar.g(mzVar2.e());
                    arrayList.remove(mzVar2);
                    a(mzVar, Integer.valueOf(c(mzVar)));
                    return;
                }
                this.a.h("no item with path " + mzVar.b(mzVar.b) + " found in list when updating");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(mz mzVar, Integer num) {
        synchronized (this.d) {
            try {
                boolean z = mzVar.a;
                ArrayList arrayList = z ? this.v : this.w;
                HashMap map = z ? this.z : this.A;
                HashMap map2 = z ? this.B : this.C;
                if (num == null) {
                    arrayList.add(mzVar);
                } else {
                    arrayList.add(num.intValue(), mzVar);
                }
                map.put(Long.valueOf(mzVar.a()), mzVar);
                map2.put(mzVar.b, mzVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(mz mzVar) {
        synchronized (this.d) {
            try {
                long jF = (mzVar.a ? this.x : this.y).f(mzVar.b(mzVar.b));
                if (jF == -1) {
                    return;
                }
                mzVar.f(jF);
                a(mzVar, Integer.valueOf(c(mzVar)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(mz mzVar) {
        int iBinarySearch;
        synchronized (this.d) {
            try {
                boolean z = mzVar.a;
                iBinarySearch = Arrays.binarySearch((mz[]) (z ? this.v : this.w).toArray(new mz[0]), mzVar, l(z));
                if (iBinarySearch < 0) {
                    iBinarySearch = -(iBinarySearch + 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iBinarySearch;
    }

    public final void d(ArrayList arrayList, boolean z) {
        synchronized (this.d) {
            try {
                ArrayList arrayList2 = z ? this.v : this.w;
                aa aaVar = z ? this.x : this.y;
                f(z);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mz mzVar = (mz) obj;
                    if (mzVar != null) {
                        long jF = aaVar.f(mzVar.b(mzVar.b));
                        if (jF != -1) {
                            mzVar.f(jF);
                            a(mzVar, null);
                        }
                    }
                }
                Collections.sort(arrayList2, l(z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void e() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        this.e = false;
        this.f = false;
        this.P = 1;
        this.g = true;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l.i("");
        this.n = false;
        this.o = false;
        this.p = "";
        this.q = "";
        this.r = false;
        this.s = false;
        this.t.clear();
        this.u.clear();
        this.Q = 0;
        this.R = 0;
        this.v.clear();
        this.w.clear();
        this.x.a();
        this.y.a();
        this.z.clear();
        this.A.clear();
        this.B.clear();
        this.C.clear();
        this.D.i(new v00());
        this.F.i(new v00());
        this.S = 0;
        this.T = 0;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        int[] iArrS = q51.s(3);
        SharedPreferences sharedPreferences = this.O;
        Looper looper = t70.a;
        try {
            i = sharedPreferences.getInt("fm_sort_type_local", 0);
        } catch (Throwable unused) {
            i = 0;
        }
        this.U = iArrS[i];
        int[] iArrS2 = q51.s(3);
        try {
            i2 = this.O.getInt("fm_sort_type_remote", 0);
        } catch (Throwable unused2) {
            i2 = 0;
        }
        this.V = iArrS2[i2];
        try {
            i3 = this.O.getInt("fm_sort_order_local", 0);
        } catch (Throwable unused3) {
            i3 = 0;
        }
        this.W = bu0.m(i3);
        try {
            i4 = this.O.getInt("fm_sort_order_remote", 0);
        } catch (Throwable unused4) {
        }
        this.X = bu0.m(i4);
        this.L.clear();
        this.M.i(new u00());
    }

    public final void f(boolean z) {
        synchronized (this.d) {
            try {
                ArrayList arrayList = z ? this.v : this.w;
                HashMap map = z ? this.z : this.A;
                HashMap map2 = z ? this.B : this.C;
                arrayList.clear();
                map.clear();
                map2.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.L) {
            this.L.clear();
            D();
        }
    }

    public final void h(boolean z) {
        synchronized (this.b) {
            try {
                (z ? this.F : this.D).i(new v00());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i(String str, boolean z) {
        synchronized (this.d) {
            try {
                ArrayList arrayList = z ? this.v : this.w;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mz mzVar = (mz) obj;
                    if (mzVar != null) {
                        if (uj.a(this.P, str, mzVar.b, z)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String j(boolean z) {
        String str;
        synchronized (this.c) {
            try {
                ArrayList arrayList = z ? this.t : this.u;
                str = arrayList.isEmpty() ? "" : (String) arrayList.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final m00 l(boolean z) {
        m00 m00Var;
        synchronized (this.d) {
            try {
                m00Var = new m00(z ? this.U : this.V, z ? this.W : this.X);
            } catch (Throwable th) {
                throw th;
            }
        }
        return m00Var;
    }

    public final int m(boolean z) {
        int i;
        synchronized (this.d) {
            try {
                i = z ? this.Q : this.R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final String n(boolean z) {
        synchronized (this.b) {
            try {
                if (z) {
                    return "[\\\\/:*?\"<>|\r\n\t\b\u0000]";
                }
                int iR = q51.r(this.P);
                if (iR == 1) {
                    return "[\\\\/:*?\"<>|\r\n\t\b\u0000]";
                }
                if (iR == 2 || iR == 3) {
                    return "[\\\\/\r\n\t\b\u0000]";
                }
                if (iR != 4) {
                    return iR != 6 ? "[\\\\/\r\n\t\b\u0000]" : "[\\\\/:*?\"<>|\r\n\t\b\u0000]";
                }
                return "[\\\\/:\r\n\t\b\u0000]";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int o(boolean z) {
        int i;
        synchronized (this.d) {
            try {
                i = z ? this.W : this.X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final ArrayList p() {
        ArrayList arrayList;
        synchronized (this.L) {
            arrayList = new ArrayList(this.L.values());
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public final ArrayList q(boolean z) {
        ArrayList arrayList;
        synchronized (this.c) {
            try {
                arrayList = z ? this.t : this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final String r(boolean z) {
        String str;
        synchronized (this.b) {
            try {
                str = z ? this.p : this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final w00 s(boolean z) {
        w00 w00Var;
        synchronized (this.b) {
            try {
                w00Var = z ? this.I : this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w00Var;
    }

    public final boolean t(String str, boolean z) {
        synchronized (this.d) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if (str.equals(".")) {
                    return false;
                }
                if (!z && this.P == 2) {
                    if (str.matches(".*[. ]$")) {
                        return false;
                    }
                    int iLastIndexOf = str.lastIndexOf(".");
                    final String strSubstring = iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
                    if (Collection$EL.stream(Z).anyMatch(new Predicate() { // from class: t00
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        public /* synthetic */ Predicate negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return strSubstring.equalsIgnoreCase((String) obj);
                        }
                    })) {
                        return false;
                    }
                }
                return !i(str, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u() {
        boolean z;
        synchronized (this.b) {
            z = this.g;
        }
        return z;
    }

    public final boolean v(boolean z) {
        boolean z2;
        synchronized (this.b) {
            try {
                z2 = z ? this.n : this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final void w(boolean z, String str, String str2) {
        synchronized (this.d) {
            try {
                ArrayList arrayList = z ? this.v : this.w;
                HashMap map = z ? this.z : this.A;
                HashMap map2 = z ? this.B : this.C;
                mz mzVar = (mz) map2.get(str);
                if (mzVar != null) {
                    map.remove(Long.valueOf(mzVar.a()));
                    map2.remove(mzVar.b);
                    arrayList.remove(mzVar);
                    return;
                }
                this.a.h("no item with path " + str2 + "/" + str + " found in list when removing");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z, ArrayList arrayList, boolean z2) {
        synchronized (this.d) {
            try {
                if (arrayList == null) {
                    return;
                }
                HashMap map = z ? this.z : this.A;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Long l = (Long) obj;
                    l.getClass();
                    mz mzVar = (mz) map.get(l);
                    if (mzVar != null) {
                        mzVar.g(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(String str, boolean z) {
        synchronized (this.c) {
            try {
                ArrayList arrayList = z ? this.t : this.u;
                if (!arrayList.remove(str) && arrayList.size() >= 10) {
                    arrayList.remove(arrayList.size() - 1);
                }
                arrayList.add(0, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, boolean z) {
        synchronized (this.d) {
            try {
                if (z) {
                    this.Q = i;
                } else {
                    this.R = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
