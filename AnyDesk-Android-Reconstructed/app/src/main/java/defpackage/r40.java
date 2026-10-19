package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r40 implements q40 {
    public final String a;
    public final int b;
    public final /* synthetic */ t40 c;

    public r40(t40 t40Var, String str, int i) {
        this.c = t40Var;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.q40
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c40 c40Var = this.c.x;
        if (c40Var != null && this.b < 0 && this.a == null && c40Var.Z().Q(-1, 0)) {
            return false;
        }
        return this.c.R(arrayList, arrayList2, this.a, this.b, 1);
    }
}
