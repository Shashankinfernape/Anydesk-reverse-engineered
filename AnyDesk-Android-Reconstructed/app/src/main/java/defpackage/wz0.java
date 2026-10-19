package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements se0, Serializable {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(wz0.class, Object.class, "d");
    public volatile o50 c;
    public volatile Object d;

    @Override // defpackage.se0
    public final Object getValue() {
        Object obj = this.d;
        fw fwVar = fw.i;
        if (obj != fwVar) {
            return obj;
        }
        o50 o50Var = this.c;
        if (o50Var != null) {
            Object objA = o50Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, fwVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != fwVar) {
                }
            }
            this.c = null;
            return objA;
        }
        return this.d;
    }

    public final String toString() {
        return this.d != fw.i ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
