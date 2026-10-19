package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class da {
    public final byte[] a;
    public final int b;

    public da(byte[] bArr) {
        this.a = bArr;
        this.b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.b == daVar.b && Arrays.equals(this.a, daVar.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
