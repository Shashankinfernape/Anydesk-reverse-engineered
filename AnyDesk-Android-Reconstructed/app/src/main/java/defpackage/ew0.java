package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements ef0 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ ew0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.ef0
    public final void i(gf0 gf0Var, ze0 ze0Var) {
        int iNextIndex;
        View view;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = null;
        switch (i) {
            case 0:
                g01 g01Var = (g01) obj;
                if (ze0Var != ze0.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                gf0Var.R().f(this);
                Bundle bundleG = g01Var.b().g("androidx.savedstate.Restarter");
                if (bundleG == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleG.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    nh0.j("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, ew0.class.getClassLoader()).asSubclass(d01.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(g01Var instanceof cf1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + g01Var).toString());
                                }
                                bf1 bf1VarK = ((cf1) g01Var).K();
                                ui0 ui0VarB = g01Var.b();
                                bf1VarK.getClass();
                                LinkedHashMap linkedHashMap = bf1VarK.a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    ve1 ve1Var = (ve1) linkedHashMap.get(str3);
                                    if (ve1Var != null) {
                                        hq.f(ve1Var, ui0VarB, g01Var.R());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    ui0VarB.y();
                                }
                            } catch (Exception e) {
                                nh0.m("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(gr0.f("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                qa qaVar = (qa) obj;
                if (qaVar.g == null) {
                    wn wnVar = (wn) qaVar.getLastNonConfigurationInstance();
                    if (wnVar != null) {
                        qaVar.g = wnVar.a;
                    }
                    if (qaVar.g == null) {
                        qaVar.g = new bf1();
                    }
                }
                qaVar.c.f(this);
                return;
            case 2:
                new HashMap();
                s60[] s60VarArr = (s60[]) obj;
                if (s60VarArr.length > 0) {
                    s60 s60Var = s60VarArr[0];
                    throw null;
                }
                if (s60VarArr.length <= 0) {
                    return;
                }
                s60 s60Var2 = s60VarArr[0];
                throw null;
            case 3:
                cu cuVar = (cu) obj;
                int i3 = bu.a[ze0Var.ordinal()];
                if (i3 == 1) {
                    xt xtVar = (xt) gf0Var;
                    Iterable iterable = (Iterable) cuVar.b().e.c.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (y90.e(((an0) it.next()).h, xtVar.A)) {
                                return;
                            }
                        }
                    }
                    xtVar.O0(false, false);
                    return;
                }
                if (i3 == 2) {
                    xt xtVar2 = (xt) gf0Var;
                    for (Object obj3 : (Iterable) cuVar.b().f.c.getValue()) {
                        if (y90.e(((an0) obj3).h, xtVar2.A)) {
                            obj2 = obj3;
                        }
                    }
                    an0 an0Var = (an0) obj2;
                    if (an0Var != null) {
                        cuVar.b().c(an0Var);
                        return;
                    }
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    xt xtVar3 = (xt) gf0Var;
                    for (Object obj4 : (Iterable) cuVar.b().f.c.getValue()) {
                        if (y90.e(((an0) obj4).h, xtVar3.A)) {
                            obj2 = obj4;
                        }
                    }
                    an0 an0Var2 = (an0) obj2;
                    if (an0Var2 != null) {
                        cuVar.b().c(an0Var2);
                    }
                    xtVar3.Q.f(this);
                    return;
                }
                xt xtVar4 = (xt) gf0Var;
                Dialog dialog = xtVar4.k0;
                if (dialog == null) {
                    nh0.o(xtVar4, " does not have a Dialog.", "DialogFragment ");
                    return;
                }
                if (dialog.isShowing()) {
                    return;
                }
                List list = (List) cuVar.b().e.c.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (y90.e(((an0) listIterator.previous()).h, xtVar4.A)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                an0 an0Var3 = (an0) tm.k0(iNextIndex, list);
                if (!y90.e(tm.p0(list), an0Var3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + xtVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (an0Var3 != null) {
                    cuVar.l(iNextIndex, an0Var3, false);
                    return;
                }
                return;
            case 4:
                if (ze0Var != ze0.ON_STOP || (view = ((c40) obj).H) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (ze0Var != ze0.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ze0Var).toString());
                }
                gf0Var.R().f(this);
                ((b01) obj).b();
                return;
        }
    }
}
