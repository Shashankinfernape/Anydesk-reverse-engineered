package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class if0 {
    public final af1 a = new af1(22);
    public final boolean b = true;
    public ry c = new ry();
    public af0 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final e71 j;

    public if0(gf0 gf0Var) {
        af0 af0Var = af0.d;
        this.d = af0Var;
        this.i = new ArrayList();
        this.e = new WeakReference(gf0Var);
        this.j = ec1.b(af0Var);
    }

    public final void a(ff0 ff0Var) {
        ef0 tsVar;
        Object obj;
        gf0 gf0Var;
        ze0 ze0Var;
        ff0Var.getClass();
        c("addObserver");
        af0 af0Var = this.d;
        af0 af0Var2 = af0.c;
        if (af0Var != af0Var2) {
            af0Var2 = af0.d;
        }
        hf0 hf0Var = new hf0();
        HashMap map = jf0.a;
        boolean z = ff0Var instanceof ef0;
        boolean z2 = ff0Var instanceof rs;
        int i = 2;
        if (z && z2) {
            tsVar = new ts((rs) ff0Var, (ef0) ff0Var);
        } else if (z2) {
            tsVar = new ts((rs) ff0Var, (ef0) null);
        } else if (z) {
            tsVar = (ef0) ff0Var;
        } else {
            Class<?> cls = ff0Var.getClass();
            if (jf0.b(cls) == 2) {
                Object obj2 = jf0.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    jf0.a((Constructor) list.get(0), ff0Var);
                    throw null;
                }
                int size = list.size();
                s60[] s60VarArr = new s60[size];
                if (size > 0) {
                    jf0.a((Constructor) list.get(0), ff0Var);
                    throw null;
                }
                tsVar = new ew0(i, s60VarArr);
            } else {
                tsVar = new ts(ff0Var);
            }
        }
        hf0Var.b = tsVar;
        hf0Var.a = af0Var2;
        ry ryVar = this.c;
        sz0 sz0VarA = ryVar.a(ff0Var);
        if (sz0VarA != null) {
            obj = sz0VarA.d;
        } else {
            HashMap map2 = ryVar.g;
            sz0 sz0Var = new sz0(ff0Var, hf0Var);
            ryVar.f++;
            sz0 sz0Var2 = ryVar.d;
            if (sz0Var2 == null) {
                ryVar.c = sz0Var;
                ryVar.d = sz0Var;
            } else {
                sz0Var2.e = sz0Var;
                sz0Var.f = sz0Var2;
                ryVar.d = sz0Var;
            }
            map2.put(ff0Var, sz0Var);
            obj = null;
        }
        if (((hf0) obj) == null && (gf0Var = (gf0) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            af0 af0VarB = b(ff0Var);
            this.f++;
            while (hf0Var.a.compareTo(af0VarB) < 0 && this.c.g.containsKey(ff0Var)) {
                af0 af0Var3 = hf0Var.a;
                ArrayList arrayList = this.i;
                arrayList.add(af0Var3);
                xe0 xe0Var = ze0.Companion;
                af0 af0Var4 = hf0Var.a;
                xe0Var.getClass();
                af0Var4.getClass();
                int iOrdinal = af0Var4.ordinal();
                if (iOrdinal == 1) {
                    ze0Var = ze0.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ze0Var = iOrdinal != 3 ? null : ze0.ON_RESUME;
                } else {
                    ze0Var = ze0.ON_START;
                }
                if (ze0Var == null) {
                    id.u(hf0Var.a, "no event up from ");
                    return;
                } else {
                    hf0Var.a(gf0Var, ze0Var);
                    arrayList.remove(arrayList.size() - 1);
                    af0VarB = b(ff0Var);
                }
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    public final af0 b(ff0 ff0Var) {
        HashMap map = this.c.g;
        sz0 sz0Var = map.containsKey(ff0Var) ? ((sz0) map.get(ff0Var)).f : null;
        af0 af0Var = sz0Var != null ? ((hf0) sz0Var.d).a : null;
        ArrayList arrayList = this.i;
        af0 af0Var2 = arrayList.isEmpty() ? null : (af0) arrayList.get(arrayList.size() - 1);
        af0 af0Var3 = this.d;
        af0Var3.getClass();
        if (af0Var == null || af0Var.compareTo(af0Var3) >= 0) {
            af0Var = af0Var3;
        }
        return (af0Var2 == null || af0Var2.compareTo(af0Var) >= 0) ? af0Var : af0Var2;
    }

    public final void c(String str) {
        if (this.b && !md.K().L()) {
            throw new IllegalStateException(gr0.f("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void d(ze0 ze0Var) {
        ze0Var.getClass();
        c("handleLifecycleEvent");
        e(ze0Var.a());
    }

    public final void e(af0 af0Var) {
        if (this.d == af0Var) {
            return;
        }
        gf0 gf0Var = (gf0) this.e.get();
        af0 af0Var2 = this.d;
        af0Var2.getClass();
        af0Var.getClass();
        af0 af0Var3 = af0.d;
        af0 af0Var4 = af0.c;
        if (af0Var2 == af0Var3 && af0Var == af0Var4) {
            throw new IllegalStateException(("State must be at least '" + af0.e + "' to be moved to '" + af0Var + "' in component " + gf0Var).toString());
        }
        if (af0Var2 == af0Var4 && af0Var2 != af0Var) {
            throw new IllegalStateException(("State is '" + af0Var4 + "' and cannot be moved to `" + af0Var + "` in component " + gf0Var).toString());
        }
        this.d = af0Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == af0Var4) {
            this.c = new ry();
        }
    }

    public final void f(ff0 ff0Var) {
        ff0Var.getClass();
        c("removeObserver");
        this.c.b(ff0Var);
    }

    public final void g(af0 af0Var) {
        af0Var.getClass();
        c("setCurrentState");
        e(af0Var);
    }

    public final void h() {
        ze0 ze0Var;
        ze0 ze0Var2;
        gf0 gf0Var = (gf0) this.e.get();
        if (gf0Var == null) {
            nh0.j("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            ry ryVar = this.c;
            if (ryVar.f != 0) {
                sz0 sz0Var = ryVar.c;
                sz0Var.getClass();
                af0 af0Var = ((hf0) sz0Var.d).a;
                sz0 sz0Var2 = this.c.d;
                sz0Var2.getClass();
                af0 af0Var2 = ((hf0) sz0Var2.d).a;
                if (af0Var == af0Var2 && this.d == af0Var2) {
                    break;
                }
                this.h = false;
                af0 af0Var3 = this.d;
                sz0 sz0Var3 = this.c.c;
                sz0Var3.getClass();
                int iCompareTo = af0Var3.compareTo(((hf0) sz0Var3.d).a);
                ArrayList arrayList = this.i;
                if (iCompareTo < 0) {
                    ry ryVar2 = this.c;
                    rz0 rz0Var = new rz0(ryVar2.d, ryVar2.c, 1);
                    ryVar2.e.put(rz0Var, Boolean.FALSE);
                    while (rz0Var.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) rz0Var.next();
                        entry.getClass();
                        ff0 ff0Var = (ff0) entry.getKey();
                        hf0 hf0Var = (hf0) entry.getValue();
                        while (hf0Var.a.compareTo(this.d) > 0 && !this.h && this.c.g.containsKey(ff0Var)) {
                            xe0 xe0Var = ze0.Companion;
                            af0 af0Var4 = hf0Var.a;
                            xe0Var.getClass();
                            af0Var4.getClass();
                            int iOrdinal = af0Var4.ordinal();
                            if (iOrdinal == 2) {
                                ze0Var2 = ze0.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                ze0Var2 = iOrdinal != 4 ? null : ze0.ON_PAUSE;
                            } else {
                                ze0Var2 = ze0.ON_STOP;
                            }
                            if (ze0Var2 == null) {
                                id.u(hf0Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(ze0Var2.a());
                                hf0Var.a(gf0Var, ze0Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                sz0 sz0Var4 = this.c.d;
                if (!this.h && sz0Var4 != null && this.d.compareTo(((hf0) sz0Var4.d).a) > 0) {
                    ry ryVar3 = this.c;
                    ryVar3.getClass();
                    tz0 tz0Var = new tz0(ryVar3);
                    ryVar3.e.put(tz0Var, Boolean.FALSE);
                    while (tz0Var.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) tz0Var.next();
                        ff0 ff0Var2 = (ff0) entry2.getKey();
                        hf0 hf0Var2 = (hf0) entry2.getValue();
                        while (hf0Var2.a.compareTo(this.d) < 0 && !this.h && this.c.g.containsKey(ff0Var2)) {
                            arrayList.add(hf0Var2.a);
                            xe0 xe0Var2 = ze0.Companion;
                            af0 af0Var5 = hf0Var2.a;
                            xe0Var2.getClass();
                            af0Var5.getClass();
                            int iOrdinal2 = af0Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                ze0Var = ze0.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                ze0Var = iOrdinal2 != 3 ? null : ze0.ON_RESUME;
                            } else {
                                ze0Var = ze0.ON_START;
                            }
                            if (ze0Var == null) {
                                id.u(hf0Var2.a, "no event up from ");
                                return;
                            } else {
                                hf0Var2.a(gf0Var, ze0Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.h(this.d);
    }
}
