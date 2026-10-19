package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class fn extends f81 implements d60 {
    public int g;
    public final /* synthetic */ t10[] h;
    public final /* synthetic */ int i;
    public final /* synthetic */ AtomicInteger j;
    public final /* synthetic */ sh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(t10[] t10VarArr, int i, AtomicInteger atomicInteger, sh shVar, rq rqVar) {
        super(2, rqVar);
        this.h = t10VarArr;
        this.i = i;
        this.j = atomicInteger;
        this.k = shVar;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        return ((fn) j((rq) obj2, (kr) obj)).m(uc1.a);
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        return new fn(this.h, this.i, this.j, this.k, rqVar);
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        AtomicInteger atomicInteger = this.j;
        sh shVar = this.k;
        try {
            if (i == 0) {
                y90.V(obj);
                t10[] t10VarArr = this.h;
                int i2 = this.i;
                t10 t10Var = t10VarArr[i2];
                en enVar = new en(shVar, i2, 0);
                this.g = 1;
                Object objA = t10Var.a(enVar, this);
                lr lrVar = lr.c;
                if (objA == lrVar) {
                    return lrVar;
                }
            } else {
                if (i != 1) {
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y90.V(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                shVar.f(null);
            }
            return uc1.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                shVar.f(null);
            }
            throw th;
        }
    }
}
