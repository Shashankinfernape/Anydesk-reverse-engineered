package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class g81 implements se0, Serializable {
    public o50 c;
    public volatile Object d = fw.i;
    public final Object e = this;

    public g81(o50 o50Var) {
        this.c = o50Var;
    }

    @Override // defpackage.se0
    public final Object getValue() {
        Object objA;
        Object obj = this.d;
        fw fwVar = fw.i;
        if (obj != fwVar) {
            return obj;
        }
        synchronized (this.e) {
            objA = this.d;
            if (objA == fwVar) {
                o50 o50Var = this.c;
                o50Var.getClass();
                objA = o50Var.a();
                this.d = objA;
                this.c = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.d != fw.i ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
