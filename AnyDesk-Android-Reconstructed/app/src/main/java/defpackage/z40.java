package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z40 implements z50 {
    public final /* synthetic */ b50 c;
    public final /* synthetic */ c40 d;
    public final /* synthetic */ an0 e;

    public /* synthetic */ z40(b50 b50Var, c40 c40Var, an0 an0Var) {
        this.c = b50Var;
        this.d = c40Var;
        this.e = an0Var;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        gf0 gf0Var = (gf0) obj;
        b50 b50Var = this.c;
        ArrayList arrayList = b50Var.g;
        c40 c40Var = this.d;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (y90.e(((st0) obj2).c, c40Var.A)) {
                    z = true;
                    break;
                }
            }
        }
        if (gf0Var != null && !z) {
            m50 m50VarH0 = c40Var.h0();
            m50VarH0.c();
            if0 if0Var = m50VarH0.f;
            if (if0Var.d.compareTo(af0.e) >= 0) {
                if0Var.a((ff0) b50Var.i.h(this.e));
            }
        }
        return uc1.a;
    }
}
