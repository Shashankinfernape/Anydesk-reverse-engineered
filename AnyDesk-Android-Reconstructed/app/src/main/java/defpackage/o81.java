package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o81 implements f11 {
    public final /* synthetic */ int a;
    public final f11 b;
    public final z50 c;

    public /* synthetic */ o81(f11 f11Var, z50 z50Var, int i) {
        this.a = i;
        this.b = f11Var;
        this.c = z50Var;
    }

    @Override // defpackage.f11
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new a10(this);
            default:
                return new nb1(this);
        }
    }
}
