package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class um extends y90 {
    public static int Z(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final List a0(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : y90.J(list.get(0));
        }
        return mx.c;
    }

    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
