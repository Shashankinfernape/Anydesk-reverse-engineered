package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum em0 {
    mbtn_none(fm0.d, 0),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_primary(fm0.e, 1),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_secondary(fm0.f, 2),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_tertiary(fm0.g, 4),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_back(fm0.h, 8),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_forward(fm0.i, 16),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_stylus_primary(fm0.j, 32),
    /* JADX INFO: Fake field, exist only in values array */
    mbtn_stylus_secondary(fm0.k, 64);

    public final int c;
    public final int d;

    em0(fm0 fm0Var, int i) {
        this.c = fm0Var.c;
        this.d = i;
    }
}
