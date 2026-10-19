package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w90 extends u90 {
    public static final w90 f = new w90(1, 0, 1);

    @Override // defpackage.u90
    public final boolean equals(Object obj) {
        if (!(obj instanceof w90)) {
            return false;
        }
        if (isEmpty() && ((w90) obj).isEmpty()) {
            return true;
        }
        w90 w90Var = (w90) obj;
        return this.c == w90Var.c && this.d == w90Var.d;
    }

    @Override // defpackage.u90
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.c * 31) + this.d;
    }

    @Override // defpackage.u90
    public final boolean isEmpty() {
        return this.c > this.d;
    }

    @Override // defpackage.u90
    public final String toString() {
        return this.c + ".." + this.d;
    }
}
