package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm extends um {
    public static int c0(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
