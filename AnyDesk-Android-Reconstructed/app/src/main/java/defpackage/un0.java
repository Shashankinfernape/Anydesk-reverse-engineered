package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class un0 implements Comparable {
    public final vn0 c;
    public final Bundle d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;

    public un0(vn0 vn0Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.c = vn0Var;
        this.d = bundle;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(un0 un0Var) {
        un0Var.getClass();
        boolean z = un0Var.g;
        boolean z2 = un0Var.e;
        Bundle bundle = un0Var.d;
        boolean z3 = this.e;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.f - un0Var.f;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.d;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.g;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.h - un0Var.h;
        }
        return -1;
    }
}
