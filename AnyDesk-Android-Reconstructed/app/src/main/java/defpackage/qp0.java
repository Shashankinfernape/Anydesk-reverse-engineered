package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp0 {
    public final boolean a;
    public final String b;
    public final String c;

    public qp0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qp0)) {
            return false;
        }
        qp0 qp0Var = (qp0) obj;
        return this.a == qp0Var.a && this.b.equals(qp0Var.b) && this.c.equals(qp0Var.c);
    }
}
