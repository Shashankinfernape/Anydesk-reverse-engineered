package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b10 implements f11 {
    public final /* synthetic */ int a;
    public final Object b;
    public final z50 c;

    public /* synthetic */ b10(Object obj, z50 z50Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = z50Var;
    }

    @Override // defpackage.f11
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new a10(this);
            default:
                return new u60(this);
        }
    }
}
