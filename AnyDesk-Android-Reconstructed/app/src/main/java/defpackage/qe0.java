package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class qe0 implements m60, Serializable {
    public final int c;

    public qe0(int i) {
        this.c = i;
    }

    @Override // defpackage.m60
    public final int b() {
        return this.c;
    }

    public final String toString() {
        nx0.a.getClass();
        return ox0.a(this);
    }
}
