package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ki extends f81 implements e60 {
    public final /* synthetic */ int g;
    public int h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki(rq rqVar, Object obj, int i) {
        super(3, rqVar);
        this.g = i;
        this.k = obj;
    }

    @Override // defpackage.e60
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ki kiVar = new ki((rq) obj3, (nm) obj4, 0);
                kiVar.i = (v10) obj;
                kiVar.j = obj2;
                return kiVar.m(uc1Var);
            case 1:
                ki kiVar2 = new ki((d60) obj4, (rq) obj3, 1);
                kiVar2.i = (v10) obj;
                kiVar2.j = obj2;
                return kiVar2.m(uc1Var);
            case 2:
                ki kiVar3 = new ki(obj4, (rq) obj3, 2);
                kiVar3.i = (v10) obj;
                kiVar3.j = (Object[]) obj2;
                return kiVar3.m(uc1Var);
            case 3:
                ((Boolean) obj2).getClass();
                ki kiVar4 = new ki((bs0) obj4, (rq) obj3, 3);
                kiVar4.j = (xr0) obj;
                return kiVar4.m(uc1Var);
            default:
                ki kiVar5 = new ki((rq) obj3, (bs0) obj4, 4);
                kiVar5.i = (v10) obj;
                kiVar5.j = obj2;
                return kiVar5.m(uc1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    @Override // defpackage.ag
    public final Object m(Object obj) {
        v10 v10Var;
        Object objF;
        v10 v10Var2;
        Object objC;
        xr0 xr0Var;
        Object objA;
        h1 h1Var;
        pt0 pt0Var;
        Object objE;
        xr0 xr0Var2;
        h1 h1Var2;
        List list;
        pt0 pt0Var2;
        Integer num;
        pt0 pt0Var3;
        Object objB;
        Object obj2;
        Integer num2;
        pt0 pt0Var4;
        int i = this.g;
        uc1 uc1Var = uc1.a;
        int i2 = 2;
        lr lrVar = lr.c;
        Object obj3 = this.k;
        int i3 = 1;
        rq rqVar = null;
        switch (i) {
            case 0:
                int i4 = this.h;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
                v10 v10Var3 = (v10) this.i;
                tm0 tm0Var = new tm0((nm) obj3, (vs0) this.j);
                this.h = 1;
                return v10Var3.i(tm0Var, this) == lrVar ? lrVar : uc1Var;
            case 1:
                int i5 = this.h;
                if (i5 == 0) {
                    y90.V(obj);
                    v10Var = (v10) this.i;
                    Object obj4 = this.j;
                    this.i = v10Var;
                    this.h = 1;
                    objF = ((d60) obj3).f(obj4, this);
                    if (objF != lrVar) {
                    }
                    return lrVar;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v10Var = (v10) this.i;
                y90.V(obj);
                objF = obj;
                this.i = null;
                this.h = 2;
                if (v10Var.i(objF, this) != lrVar) {
                    return uc1Var;
                }
                return lrVar;
            case 2:
                int i6 = this.h;
                if (i6 == 0) {
                    y90.V(obj);
                    v10Var2 = (v10) this.i;
                    Object[] objArr = (Object[]) this.j;
                    Object obj5 = objArr[0];
                    Object obj6 = objArr[1];
                    this.i = v10Var2;
                    this.h = 1;
                    objC = ((t1) obj3).c(obj5, obj6, this);
                    if (objC != lrVar) {
                    }
                    return lrVar;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v10Var2 = (v10) this.i;
                y90.V(obj);
                objC = obj;
                this.i = null;
                this.h = 2;
                if (v10Var2.i(objC, this) != lrVar) {
                    return uc1Var;
                }
                return lrVar;
            case 3:
                bs0 bs0Var = (bs0) obj3;
                int i7 = this.h;
                if (i7 != 0) {
                    if (i7 == 1) {
                        xr0Var = (xr0) this.j;
                        y90.V(obj);
                        objA = obj;
                    } else {
                        if (i7 != 2) {
                            nh0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h1Var2 = (h1) this.i;
                        xr0Var2 = (xr0) this.j;
                        y90.V(obj);
                        objE = obj;
                    }
                    pt0Var = (pt0) objE;
                    xr0 xr0Var3 = xr0Var2;
                    h1Var = h1Var2;
                    xr0Var = xr0Var3;
                    if (pt0Var != null) {
                        list = pt0Var.a;
                    } else {
                        list = null;
                    }
                    if ((list != null || list.isEmpty()) && xr0Var != null && (pt0Var2 = xr0Var.b) != null && (!pt0Var2.a.isEmpty())) {
                    }
                    if (pt0Var != null) {
                        num = pt0Var.b;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        if (xr0Var != null || (pt0Var4 = xr0Var.b) == null) {
                            num2 = null;
                        } else {
                            num2 = pt0Var4.b;
                        }
                        if (num2 != null) {
                            pt0Var = xr0Var.b;
                        }
                    }
                    pt0Var3 = pt0Var;
                    if (pt0Var3 == null) {
                        obj2 = null;
                    } else {
                        objB = h1Var.b(pt0Var3);
                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                            Log.d("Paging", "Refresh key " + objB + " returned from PagingSource " + h1Var, null);
                        }
                        obj2 = objB;
                    }
                    if (xr0Var != null) {
                        xr0Var.a.j.b(null);
                    }
                    if (xr0Var != null) {
                        xr0Var.c.b(null);
                    }
                    return new xr0(new ns0(obj2, h1Var, bs0Var.b, (ji) bs0Var.d.e, pt0Var3, new vq0(0, bs0Var, bs0.class, "refresh", "refresh()V", 0, 0, 2)), pt0Var3, y90.d());
                }
                y90.V(obj);
                xr0Var = (xr0) this.j;
                h1 h1Var3 = xr0Var != null ? xr0Var.a.b : null;
                this.j = xr0Var;
                this.h = 1;
                objA = bs0.a(bs0Var, h1Var3, this);
                if (objA == lrVar) {
                    return lrVar;
                }
                h1Var = (h1) objA;
                if (xr0Var != null) {
                    ns0 ns0Var = xr0Var.a;
                    this.j = xr0Var;
                    this.i = h1Var;
                    this.h = 2;
                    objE = ns0Var.e(this);
                    if (objE == lrVar) {
                        return lrVar;
                    }
                    xr0Var2 = xr0Var;
                    h1Var2 = h1Var;
                    pt0Var = (pt0) objE;
                    xr0 xr0Var4 = xr0Var2;
                    h1Var = h1Var2;
                    xr0Var = xr0Var4;
                } else {
                    pt0Var = null;
                }
                if (pt0Var != null) {
                    list = pt0Var.a;
                } else {
                    list = null;
                }
                pt0Var = list != null ? pt0Var2 : pt0Var2;
                if (pt0Var != null) {
                    num = pt0Var.b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (xr0Var != null) {
                        num2 = null;
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        pt0Var = xr0Var.b;
                    }
                }
                pt0Var3 = pt0Var;
                if (pt0Var3 == null) {
                    obj2 = null;
                } else {
                    objB = h1Var.b(pt0Var3);
                    if (Build.ID != null) {
                        Log.d("Paging", "Refresh key " + objB + " returned from PagingSource " + h1Var, null);
                    }
                    obj2 = objB;
                }
                if (xr0Var != null) {
                    xr0Var.a.j.b(null);
                }
                if (xr0Var != null) {
                    xr0Var.c.b(null);
                }
                return new xr0(new ns0(obj2, h1Var, bs0Var.b, (ji) bs0Var.d.e, pt0Var3, new vq0(0, bs0Var, bs0.class, "refresh", "refresh()V", 0, 0, 2)), pt0Var3, y90.d());
            default:
                bs0 bs0Var2 = (bs0) obj3;
                int i8 = this.h;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y90.V(obj);
                        return uc1Var;
                    }
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
                v10 v10Var4 = (v10) this.i;
                xr0 xr0Var5 = (xr0) this.j;
                vs0 vs0Var = new vs0(new i20(xr0Var5.a.k, new bi(i2, rqVar, i3), i2), new ui0(bs0Var2, bs0Var2.d), new ev(29, xr0Var5.a), o6.h);
                this.h = 1;
                return v10Var4.i(vs0Var, this) == lrVar ? lrVar : uc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki(Object obj, rq rqVar, int i) {
        super(3, rqVar);
        this.g = i;
        this.k = obj;
    }
}
