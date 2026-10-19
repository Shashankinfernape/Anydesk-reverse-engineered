package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ix implements a90 {
    public final boolean c;

    public ix(boolean z) {
        this.c = z;
    }

    @Override // defpackage.a90
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.a90
    public final vp0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.c ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
