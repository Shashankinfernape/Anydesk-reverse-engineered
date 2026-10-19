package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bd1 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public bd1(String str, String str2, String str3) {
        this.a = str;
    }

    public static void a(bd1 bd1Var, ea eaVar, Object[] objArr) {
        bd1Var.d.add(new fa(eaVar, objArr));
    }

    public static void b(bd1 bd1Var, ea eaVar, Object[] objArr) {
        bd1Var.c.add(new fa(eaVar, objArr));
    }
}
