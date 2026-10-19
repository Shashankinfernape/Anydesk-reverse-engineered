package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ct {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public ct(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final ct f(ViewGroup viewGroup, t40 t40Var) {
        viewGroup.getClass();
        t40Var.getClass();
        t40Var.F().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ct) {
            return (ct) tag;
        }
        ct ctVar = new ct(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ctVar);
        return ctVar;
    }

    public final void a(int i, int i2, i50 i50Var) {
        synchronized (this.b) {
            aj ajVar = new aj();
            c40 c40Var = i50Var.c;
            c40Var.getClass();
            a61 a61VarD = d(c40Var);
            if (a61VarD != null) {
                a61VarD.c(i, i2);
                return;
            }
            final a61 a61Var = new a61(i, i2, i50Var, ajVar);
            this.b.add(a61Var);
            final int i3 = 0;
            a61Var.d.add(new Runnable(this) { // from class: z51
                public final /* synthetic */ ct d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    a61 a61Var2 = a61Var;
                    ct ctVar = this.d;
                    switch (i4) {
                        case 0:
                            if (ctVar.b.contains(a61Var2)) {
                                int i5 = a61Var2.a;
                                View view = a61Var2.c.H;
                                view.getClass();
                                gr0.a(view, i5);
                            }
                            break;
                        default:
                            ctVar.b.remove(a61Var2);
                            ctVar.c.remove(a61Var2);
                            break;
                    }
                }
            });
            final int i4 = 1;
            a61Var.d.add(new Runnable(this) { // from class: z51
                public final /* synthetic */ ct d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    a61 a61Var2 = a61Var;
                    ct ctVar = this.d;
                    switch (i5) {
                        case 0:
                            if (ctVar.b.contains(a61Var2)) {
                                int i6 = a61Var2.a;
                                View view = a61Var2.c.H;
                                view.getClass();
                                gr0.a(view, i6);
                            }
                            break;
                        default:
                            ctVar.b.remove(a61Var2);
                            ctVar.c.remove(a61Var2);
                            break;
                    }
                }
            });
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        int i;
        final ct ctVar = this;
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList3.get(i2);
            i2++;
            a61 a61Var = (a61) obj2;
            View view = a61Var.c.H;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        id.q(gr0.e(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (a61Var.a != 2) {
                    break;
                }
            }
        }
        a61 a61Var2 = (a61) obj2;
        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            a61 a61Var3 = (a61) objPrevious;
            View view2 = a61Var3.c.H;
            view2.getClass();
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    id.q(gr0.e(visibility2, "Unknown visibility "));
                    return;
                }
            }
            if (a61Var3.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        a61 a61Var4 = (a61) obj;
        if (t40.H(2)) {
            Log.v("FragmentManager", "Executing operations from " + a61Var2 + " to " + a61Var4);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        c40 c40Var = ((a61) tm.o0(arrayList3)).c;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            a40 a40Var = ((a61) obj3).c.K;
            a40 a40Var2 = c40Var.K;
            a40Var.b = a40Var2.b;
            a40Var.c = a40Var2.c;
            a40Var.d = a40Var2.d;
            a40Var.e = a40Var2.e;
        }
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList3.get(i4);
            i4++;
            a61 a61Var5 = (a61) obj4;
            aj ajVar = new aj();
            a61Var5.d();
            LinkedHashSet linkedHashSet = a61Var5.e;
            linkedHashSet.add(ajVar);
            arrayList4.add(new xs(a61Var5, ajVar, z));
            aj ajVar2 = new aj();
            a61Var5.d();
            linkedHashSet.add(ajVar2);
            boolean z2 = !z ? a61Var5 != a61Var4 : a61Var5 != a61Var2;
            c40 c40Var2 = a61Var5.c;
            ys ysVar = new ys(a61Var5, ajVar2);
            if (a61Var5.a == 2) {
                if (z) {
                    a40 a40Var3 = c40Var2.K;
                } else {
                    c40Var2.getClass();
                }
            } else if (z) {
                a40 a40Var4 = c40Var2.K;
            } else {
                c40Var2.getClass();
            }
            if (a61Var5.a == 2) {
                if (z) {
                    a40 a40Var5 = c40Var2.K;
                } else {
                    a40 a40Var6 = c40Var2.K;
                }
            }
            if (z2) {
                if (z) {
                    a40 a40Var7 = c40Var2.K;
                } else {
                    c40Var2.getClass();
                }
            }
            arrayList5.add(ysVar);
            a61Var5.d.add(new c0(arrayList6, a61Var5, ctVar));
            arrayList3 = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList5.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj5 = arrayList5.get(i5);
            i5++;
            if (!((ys) obj5).k()) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList7.get(i6);
            i6++;
            ((ys) obj6).getClass();
        }
        int size6 = arrayList8.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj7 = arrayList8.get(i7);
            i7++;
            ((ys) obj7).getClass();
        }
        int size7 = arrayList5.size();
        int i8 = 0;
        while (i8 < size7) {
            Object obj8 = arrayList5.get(i8);
            i8++;
            ys ysVar2 = (ys) obj8;
            linkedHashMap.put((a61) ysVar2.a, Boolean.FALSE);
            ysVar2.e();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = ctVar.a;
        Context context = viewGroup.getContext();
        ArrayList arrayList9 = new ArrayList();
        int size8 = arrayList4.size();
        boolean z3 = false;
        int i9 = 0;
        while (i9 < size8) {
            i9++;
            xs xsVar = (xs) arrayList4.get(i9);
            if (xsVar.k()) {
                xsVar.e();
            } else {
                context.getClass();
                bc bcVarR = xsVar.r(context);
                if (bcVarR == null) {
                    xsVar.e();
                } else {
                    final Animator animator = (Animator) bcVarR.e;
                    if (animator == null) {
                        arrayList9.add(xsVar);
                    } else {
                        arrayList2 = arrayList9;
                        final a61 a61Var6 = (a61) xsVar.a;
                        c40 c40Var3 = a61Var6.c;
                        i = size8;
                        if (y90.e(linkedHashMap.get(a61Var6), Boolean.TRUE)) {
                            if (t40.H(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + c40Var3 + " as this Fragment was involved in a Transition.");
                            }
                            xsVar.e();
                            ctVar = this;
                            arrayList9 = arrayList2;
                            size8 = i;
                            z3 = z3;
                        } else {
                            boolean z4 = a61Var6.a == 3;
                            if (z4) {
                                arrayList6.remove(a61Var6);
                            }
                            View view3 = c40Var3.H;
                            viewGroup.startViewTransition(view3);
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            ArrayList arrayList10 = arrayList4;
                            ctVar = this;
                            animator.addListener(new zs(ctVar, view3, z4, a61Var6, xsVar));
                            animator.setTarget(view3);
                            animator.start();
                            if (t40.H(2)) {
                                Log.v("FragmentManager", "Animator from operation " + a61Var6 + " has started.");
                            }
                            ((aj) xsVar.b).b(new zi() { // from class: vs
                                @Override // defpackage.zi
                                public final void onCancel() {
                                    animator.end();
                                    if (t40.H(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + a61Var6 + " has been canceled.");
                                    }
                                }
                            });
                            linkedHashMap = linkedHashMap2;
                            size8 = i;
                            arrayList9 = arrayList2;
                            arrayList4 = arrayList10;
                            z3 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList9;
            i = size8;
            ctVar = this;
            arrayList9 = arrayList2;
            size8 = i;
            z3 = z3;
        }
        ArrayList arrayList11 = arrayList9;
        boolean z5 = z3;
        int size9 = arrayList11.size();
        int i10 = 0;
        while (i10 < size9) {
            arrayList11 = arrayList11;
            Object obj9 = arrayList11.get(i10);
            i10++;
            final xs xsVar2 = (xs) obj9;
            final a61 a61Var7 = (a61) xsVar2.a;
            c40 c40Var4 = a61Var7.c;
            size9 = size9;
            if (zContainsValue) {
                if (t40.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + c40Var4 + " as Animations cannot run alongside Transitions.");
                }
                xsVar2.e();
            } else if (z5) {
                if (t40.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + c40Var4 + " as Animations cannot run alongside Animators.");
                }
                xsVar2.e();
            } else {
                final View view4 = c40Var4.H;
                context.getClass();
                bc bcVarR2 = xsVar2.r(context);
                if (bcVarR2 == null) {
                    nh0.j("Required value was null.");
                    return;
                }
                Animation animation = (Animation) bcVarR2.d;
                if (animation == null) {
                    nh0.j("Required value was null.");
                    return;
                }
                if (a61Var7.a != 1) {
                    view4.startAnimation(animation);
                    xsVar2.e();
                } else {
                    viewGroup.startViewTransition(view4);
                    f40 f40Var = new f40(animation, viewGroup, view4);
                    f40Var.setAnimationListener(new bt(xsVar2, ctVar, a61Var7, view4));
                    view4.startAnimation(f40Var);
                    if (t40.H(2)) {
                        Log.v("FragmentManager", "Animation from operation " + a61Var7 + " has started.");
                    }
                }
                ((aj) xsVar2.b).b(new zi() { // from class: ws
                    @Override // defpackage.zi
                    public final void onCancel() {
                        View view5 = view4;
                        view5.clearAnimation();
                        ctVar.a.endViewTransition(view5);
                        xsVar2.e();
                        if (t40.H(2)) {
                            Log.v("FragmentManager", "Animation from operation " + a61Var7 + " has been cancelled.");
                        }
                    }
                });
                i10 = i10;
            }
        }
        int size10 = arrayList6.size();
        int i11 = 0;
        while (i11 < size10) {
            Object obj10 = arrayList6.get(i11);
            i11++;
            a61 a61Var8 = (a61) obj10;
            View view5 = a61Var8.c.H;
            int i12 = a61Var8.a;
            view5.getClass();
            gr0.a(view5, i12);
        }
        arrayList6.clear();
        if (t40.H(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + a61Var2 + " to " + a61Var4);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = oe1.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayListX0 = tm.x0(this.c);
                    this.c.clear();
                    int size = arrayListX0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListX0.get(i);
                        i++;
                        a61 a61Var = (a61) obj;
                        if (t40.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a61Var);
                        }
                        a61Var.a();
                        if (!a61Var.g) {
                            this.c.add(a61Var);
                        }
                    }
                    g();
                    ArrayList arrayListX1 = tm.x0(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListX1);
                    if (t40.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayListX1.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListX1.get(i2);
                        i2++;
                        ((a61) obj2).d();
                    }
                    b(arrayListX1, this.d);
                    this.d = false;
                    if (t40.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a61 d(c40 c40Var) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            a61 a61Var = (a61) obj;
            if (y90.e(a61Var.c, c40Var) && !a61Var.f) {
                return (a61) obj;
            }
        }
        obj = null;
        return (a61) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (t40.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = oe1.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((a61) obj).d();
                }
                ArrayList arrayListX0 = tm.x0(this.c);
                int size2 = arrayListX0.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListX0.get(i3);
                    i3++;
                    a61 a61Var = (a61) obj2;
                    if (t40.H(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + a61Var);
                    }
                    a61Var.a();
                }
                ArrayList arrayListX1 = tm.x0(this.b);
                int size3 = arrayListX1.size();
                while (i < size3) {
                    Object obj3 = arrayListX1.get(i);
                    i++;
                    a61 a61Var2 = (a61) obj3;
                    if (t40.H(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + a61Var2);
                    }
                    a61Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a61 a61Var = (a61) obj;
            int i2 = 2;
            if (a61Var.b == 2) {
                int visibility = a61Var.c.K0().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            id.q(gr0.e(visibility, "Unknown visibility "));
                            return;
                        }
                        i2 = 3;
                    }
                }
                a61Var.c(i2, 1);
            }
        }
    }
}
