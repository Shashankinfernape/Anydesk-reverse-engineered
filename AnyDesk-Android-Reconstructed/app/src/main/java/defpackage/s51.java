package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s51 {
    public final i70 a;
    public final e51 b;
    public final e51 c;
    public final byte[] d;
    public final int e;

    public s51(i70 i70Var, e51 e51Var, e51 e51Var2, byte[] bArr, int i) {
        this.a = i70Var;
        this.b = e51Var;
        this.c = e51Var2;
        this.d = bArr;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s51)) {
            return false;
        }
        s51 s51Var = (s51) obj;
        return this.a.equals(s51Var.a) && this.b == s51Var.b && this.c == s51Var.c && Arrays.equals(this.d, s51Var.d) && this.e == s51Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 31) * 31;
        e51 e51Var = this.b;
        int iHashCode2 = (iHashCode + (e51Var == null ? 0 : e51Var.hashCode())) * 31;
        e51 e51Var2 = this.c;
        return ((Arrays.hashCode(this.d) + ((iHashCode2 + (e51Var2 != null ? e51Var2.hashCode() : 0)) * 31)) * 31) + this.e;
    }
}
