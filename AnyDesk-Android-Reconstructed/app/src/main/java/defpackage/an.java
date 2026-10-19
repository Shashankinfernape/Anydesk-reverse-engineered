package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class an implements f11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ an(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.f11
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            default:
                return (Iterator) this.b;
        }
    }
}
