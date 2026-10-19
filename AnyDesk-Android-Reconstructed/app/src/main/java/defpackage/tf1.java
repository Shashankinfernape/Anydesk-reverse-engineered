package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends vf1 {
    public final int e;
    public final int f;

    public tf1(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.vf1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf1)) {
            return false;
        }
        tf1 tf1Var = (tf1) obj;
        return this.e == tf1Var.e && this.f == tf1Var.f && this.a == tf1Var.a && this.b == tf1Var.b && this.c == tf1Var.c && this.d == tf1Var.d;
    }

    @Override // defpackage.vf1
    public final int hashCode() {
        return super.hashCode() + this.e + this.f;
    }

    public final String toString() {
        return j71.M("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
    }
}
