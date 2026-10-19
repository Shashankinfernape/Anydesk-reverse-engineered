package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class yc1 implements se0, Serializable {
    public o50 c;
    public Object d;

    @Override // defpackage.se0
    public final Object getValue() {
        if (this.d == fw.i) {
            o50 o50Var = this.c;
            o50Var.getClass();
            this.d = o50Var.a();
            this.c = null;
        }
        return this.d;
    }

    public final String toString() {
        return this.d != fw.i ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
