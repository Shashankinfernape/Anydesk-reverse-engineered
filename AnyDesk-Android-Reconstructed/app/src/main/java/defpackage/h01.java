package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h01 implements ze1 {
    public final Application a;
    public final ye1 b;
    public final Bundle c;
    public final if0 d;
    public final ui0 e;

    public h01(Application application, g01 g01Var, Bundle bundle) {
        ye1 ye1Var;
        this.e = g01Var.b();
        this.d = g01Var.R();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (ye1.d == null) {
                ye1.d = new ye1(application);
            }
            ye1Var = ye1.d;
            ye1Var.getClass();
        } else {
            ye1Var = new ye1(null);
        }
        this.b = ye1Var;
    }

    @Override // defpackage.ze1
    public final ve1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        id.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.ze1
    public final ve1 b(Class cls, um0 um0Var) {
        LinkedHashMap linkedHashMap = um0Var.a;
        String str = (String) linkedHashMap.get(af1.e);
        if (str == null) {
            nh0.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(lk0.h) == null || linkedHashMap.get(lk0.i) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            nh0.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(ye1.e);
        boolean zIsAssignableFrom = k8.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? i01.a(cls, i01.b) : i01.a(cls, i01.a);
        if (constructorA == null) {
            return this.b.b(cls, um0Var);
        }
        return (!zIsAssignableFrom || application == null) ? i01.b(cls, constructorA, lk0.j(um0Var)) : i01.b(cls, constructorA, application, lk0.j(um0Var));
    }

    @Override // defpackage.ze1
    public final ve1 c(fm fmVar, um0 um0Var) {
        Class cls = fmVar.a;
        cls.getClass();
        return b(cls, um0Var);
    }

    public final ve1 d(String str, Class cls) {
        yz0 yz0Var;
        if0 if0Var = this.d;
        if (if0Var == null) {
            id.m("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = k8.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? i01.a(cls, i01.b) : i01.a(cls, i01.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (v40.b == null) {
                v40.b = new v40(3);
            }
            v40.b.getClass();
            return bu0.h(cls);
        }
        ui0 ui0Var = this.e;
        ui0Var.getClass();
        Bundle bundleG = ui0Var.g(str);
        if (bundleG == null) {
            bundleG = this.c;
        }
        if (bundleG == null) {
            yz0Var = new yz0();
        } else {
            ClassLoader classLoader = yz0.class.getClassLoader();
            classLoader.getClass();
            bundleG.setClassLoader(classLoader);
            yz0Var = new yz0(lk0.L(bundleG));
        }
        zz0 zz0Var = new zz0(str, yz0Var);
        zz0Var.b(if0Var, ui0Var);
        af0 af0Var = if0Var.d;
        if (af0Var == af0.d || af0Var.compareTo(af0.f) >= 0) {
            ui0Var.y();
        } else {
            if0Var.a(new ts(if0Var, ui0Var));
        }
        ve1 ve1VarB = (!zIsAssignableFrom || application == null) ? i01.b(cls, constructorA, yz0Var) : i01.b(cls, constructorA, application, yz0Var);
        ve1VarB.a("androidx.lifecycle.savedstate.vm.tag", zz0Var);
        return ve1VarB;
    }

    public h01() {
        this.b = new ye1(null);
    }
}
