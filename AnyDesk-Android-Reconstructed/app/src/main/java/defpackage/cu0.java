package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 {
    public final eu0 a;

    public cu0(int i) {
        this.a = new eu0(i);
        boolean zB = b();
        int i2 = this.a.c;
        if (zB) {
            this.a = new eu0((i2 | 2) & (-5));
        } else {
            this.a = new eu0((i2 & (-3)) | 4);
        }
    }

    public final boolean a() {
        return (this.a.c & 1) == 1;
    }

    public final boolean b() {
        return (this.a.c & 2) == 2;
    }

    public final boolean c() {
        return (this.a.c & 8) == 8;
    }
}
