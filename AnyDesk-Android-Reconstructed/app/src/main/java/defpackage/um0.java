package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class um0 extends qr {
    public um0(qr qrVar) {
        qrVar.getClass();
        LinkedHashMap linkedHashMap = qrVar.a;
        linkedHashMap.getClass();
        this.a.putAll(linkedHashMap);
    }

    @Override // defpackage.qr
    public final Object a(us0 us0Var) {
        return this.a.get(us0Var);
    }

    public /* synthetic */ um0(int i) {
        this(pr.b);
    }
}
