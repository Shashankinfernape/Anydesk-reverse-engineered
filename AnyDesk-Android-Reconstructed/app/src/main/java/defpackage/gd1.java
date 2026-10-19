package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gd1 {
    public final i70 a;
    public final e51 b;
    public final e51 c;
    public final byte[] d;
    public final int e;

    public gd1(i70 i70Var, e51 e51Var, e51 e51Var2, byte[] bArr, int i) {
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
        if (!(obj instanceof gd1)) {
            return false;
        }
        gd1 gd1Var = (gd1) obj;
        return this.a.equals(gd1Var.a) && this.b == gd1Var.b && this.c == gd1Var.c && Arrays.equals(this.d, gd1Var.d) && this.e == gd1Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.e)) * 31);
    }
}
