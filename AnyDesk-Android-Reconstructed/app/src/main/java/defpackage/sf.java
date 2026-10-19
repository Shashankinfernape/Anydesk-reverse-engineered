package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sf implements q40 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final t40 q;
    public boolean r;
    public int s;
    public boolean t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sf(sf sfVar) {
        this();
        sfVar.q.E();
        e40 e40Var = sfVar.q.u;
        if (e40Var != null) {
            e40Var.t.getClassLoader();
        }
        ArrayList arrayList = sfVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l50 l50Var = (l50) obj;
            ArrayList arrayList2 = this.a;
            l50 l50Var2 = new l50();
            l50Var2.a = l50Var.a;
            l50Var2.b = l50Var.b;
            l50Var2.c = l50Var.c;
            l50Var2.d = l50Var.d;
            l50Var2.e = l50Var.e;
            l50Var2.f = l50Var.f;
            l50Var2.g = l50Var.g;
            l50Var2.h = l50Var.h;
            l50Var2.i = l50Var.i;
            arrayList2.add(l50Var2);
        }
        this.b = sfVar.b;
        this.c = sfVar.c;
        this.d = sfVar.d;
        this.e = sfVar.e;
        this.f = sfVar.f;
        this.g = sfVar.g;
        this.h = sfVar.h;
        this.i = sfVar.i;
        this.l = sfVar.l;
        this.m = sfVar.m;
        this.j = sfVar.j;
        this.k = sfVar.k;
        if (sfVar.n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.n = arrayList3;
            arrayList3.addAll(sfVar.n);
        }
        if (sfVar.o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.o = arrayList4;
            arrayList4.addAll(sfVar.o);
        }
        this.p = sfVar.p;
        this.s = -1;
        this.t = false;
        this.q = sfVar.q;
        this.r = sfVar.r;
        this.s = sfVar.s;
        this.t = sfVar.t;
    }

    @Override // defpackage.q40
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (t40.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        t40 t40Var = this.q;
        if (t40Var.d == null) {
            t40Var.d = new ArrayList();
        }
        t40Var.d.add(this);
        return true;
    }

    public final void b(l50 l50Var) {
        this.a.add(l50Var);
        l50Var.d = this.b;
        l50Var.e = this.c;
        l50Var.f = this.d;
        l50Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                l50 l50Var = (l50) arrayList.get(i2);
                c40 c40Var = l50Var.b;
                if (c40Var != null) {
                    c40Var.t += i;
                    if (t40.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + l50Var.b + " to " + l50Var.b.t);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            nh0.j("commit already called");
            return 0;
        }
        if (t40.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new wh0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        t40 t40Var = this.q;
        if (z2) {
            this.s = t40Var.i.getAndIncrement();
        } else {
            this.s = -1;
        }
        t40Var.v(this, z);
        return this.s;
    }

    public final void e(int i, c40 c40Var, String str, int i2) {
        String str2 = c40Var.O;
        if (str2 != null) {
            k50.c(c40Var, str2);
        }
        Class<?> cls = c40Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = c40Var.A;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(c40Var);
                String str4 = c40Var.A;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            c40Var.A = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + c40Var + " with tag " + str + " to container view with no id");
            }
            int i3 = c40Var.y;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(c40Var);
                int i4 = c40Var.y;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            c40Var.y = i;
            c40Var.z = i;
        }
        b(new l50(i2, c40Var));
        c40Var.u = this.q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l50 l50Var = (l50) arrayList.get(i);
            switch (l50Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + l50Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(l50Var.b);
            if (z) {
                if (l50Var.d != 0 || l50Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(l50Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(l50Var.e));
                }
                if (l50Var.f != 0 || l50Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(l50Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(l50Var.g));
                }
            }
        }
    }

    public final void g(c40 c40Var) {
        t40 t40Var = c40Var.u;
        if (t40Var == null || t40Var == this.q) {
            b(new l50(3, c40Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + c40Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void h(int i, c40 c40Var, String str) {
        if (i != 0) {
            e(i, c40Var, str, 2);
        } else {
            id.q("Must use non-zero containerViewId");
        }
    }

    public final void i(c40 c40Var) {
        t40 t40Var = c40Var.u;
        if (t40Var == null || t40Var == this.q) {
            b(new l50(8, c40Var));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + c40Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sf(t40 t40Var) {
        this();
        t40Var.E();
        e40 e40Var = t40Var.u;
        if (e40Var != null) {
            e40Var.t.getClassLoader();
        }
        this.s = -1;
        this.t = false;
        this.q = t40Var;
    }

    public sf() {
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
