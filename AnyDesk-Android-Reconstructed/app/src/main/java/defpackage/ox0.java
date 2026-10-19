package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ox0 {
    public static String a(m60 m60Var) {
        String string = m60Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
