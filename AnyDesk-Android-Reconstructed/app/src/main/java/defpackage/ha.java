package defpackage;

import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ha {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public ha(t9 t9Var) {
        this.a = t9Var.a;
        this.b = t9Var.b;
        this.c = t9Var.p;
        this.d = t9Var.g;
    }

    public final X509Certificate a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (X509Certificate) arrayList.get(0);
    }
}
