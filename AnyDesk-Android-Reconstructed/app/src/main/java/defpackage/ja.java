package defpackage;

import j$.util.Collection$EL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ja {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public ja(t9 t9Var) {
        int i = t9Var.a;
        this.a = t9Var.b;
        this.b = t9Var.p;
        this.c = t9Var.g;
        Collection$EL.stream(t9Var.k).mapToInt(new i0(2)).anyMatch(new ia(0));
    }

    public final X509Certificate a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (X509Certificate) arrayList.get(0);
    }
}
