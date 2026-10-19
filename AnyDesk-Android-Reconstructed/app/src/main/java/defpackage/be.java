package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class be implements Iterable, yd0 {
    public final /* synthetic */ Object[] c;

    public be(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j2(this.c);
    }
}
