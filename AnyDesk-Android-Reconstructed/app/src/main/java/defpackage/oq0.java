package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends qe0 implements z50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ wq0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(wq0 wq0Var, int i) {
        super(1);
        this.d = i;
        this.e = wq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @Override // defpackage.z50
    public final Object h(Object obj) {
        int i = this.d;
        uc1 uc1Var = uc1.a;
        Object obj2 = null;
        wq0 wq0Var = this.e;
        switch (i) {
            case 0:
                ((rf) obj).getClass();
                qd qdVar = wq0Var.b;
                ListIterator listIterator = qdVar.listIterator(qdVar.e);
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((l40) objPrevious).a) {
                        obj2 = objPrevious;
                        l40 l40Var = (l40) obj2;
                        if (wq0Var.c != null) {
                            wq0Var.b();
                        }
                        wq0Var.c = l40Var;
                        break;
                    }
                }
                l40 l40Var2 = (l40) obj2;
                if (wq0Var.c != null) {
                    wq0Var.b();
                }
                wq0Var.c = l40Var2;
                break;
            default:
                ((rf) obj).getClass();
                if (wq0Var.c == null) {
                    qd qdVar2 = wq0Var.b;
                    ListIterator listIterator2 = qdVar2.listIterator(qdVar2.e);
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((l40) objPrevious2).a) {
                            obj2 = objPrevious2;
                            break;
                        }
                    }
                }
                break;
        }
        return uc1Var;
    }
}
