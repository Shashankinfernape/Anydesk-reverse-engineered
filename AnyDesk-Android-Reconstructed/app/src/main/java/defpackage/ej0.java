package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 {
    public final int a;
    public final int b;
    public final String c;
    public final List d;

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public ej0(ArrayList arrayList, int i, int i2) {
        String str;
        this.a = i;
        this.b = i2;
        if (arrayList.isEmpty()) {
            str = null;
        } else {
            dj0 dj0Var = (dj0) arrayList.get(0);
            if ("Name".equalsIgnoreCase(dj0Var.a)) {
                str = dj0Var.b;
            } else {
                str = null;
            }
        }
        this.c = str;
        this.d = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
    }

    public final String a(String str) {
        for (dj0 dj0Var : this.d) {
            if (dj0Var.a.equalsIgnoreCase(str)) {
                return dj0Var.b;
            }
        }
        return null;
    }
}
