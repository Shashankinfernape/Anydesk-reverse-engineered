package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k30 implements eq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.eq
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                l30 l30Var = (l30) obj;
                if (l30Var == null) {
                    l30Var = new l30(-3);
                }
                ((bc) this.b).d0(l30Var);
                return;
            default:
                l30 l30Var2 = (l30) obj;
                synchronized (m30.c) {
                    try {
                        i51 i51Var = m30.d;
                        ArrayList arrayList = (ArrayList) i51Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        i51Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((eq) arrayList.get(i)).accept(l30Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
