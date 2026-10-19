package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.w3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static j1 a(Object[] objArr, int i, int i2) {
        s1.a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new j1(objArr, i, i2, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return w3.b0(a(tArr, 0, tArr.length), false);
    }
}
