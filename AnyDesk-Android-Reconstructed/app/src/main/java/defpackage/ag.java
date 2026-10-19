package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ag implements rq, mr, Serializable {
    public final rq c;

    public ag(rq rqVar) {
        this.c = rqVar;
    }

    @Override // defpackage.mr
    public mr d() {
        rq rqVar = this.c;
        if (rqVar instanceof mr) {
            return (mr) rqVar;
        }
        return null;
    }

    @Override // defpackage.rq
    public final void g(Object obj) {
        rq rqVar = this;
        while (true) {
            ag agVar = (ag) rqVar;
            rq rqVar2 = agVar.c;
            rqVar2.getClass();
            try {
                obj = agVar.m(obj);
                if (obj == lr.c) {
                    return;
                }
            } catch (Throwable th) {
                obj = new py0(th);
            }
            agVar.n();
            if (!(rqVar2 instanceof ag)) {
                rqVar2.g(obj);
                return;
            }
            rqVar = rqVar2;
        }
    }

    public rq j(rq rqVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement l() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        cs csVar = (cs) getClass().getAnnotation(cs.class);
        String str = null;
        if (csVar == null) {
            return null;
        }
        int iV = csVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? csVar.l()[iIntValue] : -1;
        y6 y6Var = bu0.d;
        y6 y6Var2 = bu0.e;
        if (y6Var2 == null) {
            try {
                y6 y6Var3 = new y6(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 17);
                bu0.e = y6Var3;
                y6Var2 = y6Var3;
            } catch (Exception unused2) {
                bu0.e = y6Var;
                y6Var2 = y6Var;
            }
        }
        if (y6Var2 != y6Var && (method = (Method) y6Var2.d) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) y6Var2.e) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) y6Var2.f;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = csVar.c();
        } else {
            strC = str + '/' + csVar.c();
        }
        return new StackTraceElement(strC, csVar.m(), csVar.f(), i);
    }

    public abstract Object m(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objL = l();
        if (objL == null) {
            objL = getClass().getName();
        }
        sb.append(objL);
        return sb.toString();
    }

    public void n() {
    }
}
