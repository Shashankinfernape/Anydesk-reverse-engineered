package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e30 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return Objects.equals(this.a, e30Var.a) && Objects.equals(this.b, e30Var.b) && Objects.equals(this.c, e30Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
