package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends v40 {
    public static ye1 d;
    public static final us0 e = new us0(21);
    public final Application c;

    public ye1(Application application) {
        super(3);
        this.c = application;
    }

    @Override // defpackage.v40, defpackage.ze1
    public final ve1 a(Class cls) {
        Application application = this.c;
        if (application != null) {
            return d(cls, application);
        }
        id.m("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.v40, defpackage.ze1
    public final ve1 b(Class cls, um0 um0Var) {
        if (this.c != null) {
            return a(cls);
        }
        Application application = (Application) um0Var.a.get(e);
        if (application != null) {
            return d(cls, application);
        }
        if (!k8.class.isAssignableFrom(cls)) {
            return bu0.h(cls);
        }
        id.q("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final ve1 d(Class cls, Application application) {
        if (!k8.class.isAssignableFrom(cls)) {
            return bu0.h(cls);
        }
        try {
            ve1 ve1Var = (ve1) cls.getConstructor(Application.class).newInstance(application);
            ve1Var.getClass();
            return ve1Var;
        } catch (IllegalAccessException e2) {
            nh0.m("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            nh0.m("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            nh0.m("Cannot create an instance of ", cls, e4);
            return null;
        } catch (InvocationTargetException e5) {
            nh0.m("Cannot create an instance of ", cls, e5);
            return null;
        }
    }
}
