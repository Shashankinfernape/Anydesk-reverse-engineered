package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum j7 {
    ACTION_NONE(0, null),
    ACTION_CLOSE_PANEL(1, new i7(0)),
    ACTION_WOL_RECONNECT(2, new i7(1)),
    ACTION_WOL_WAKE(3, new i7(2));

    public final int c;
    public final Runnable d;

    j7(int i2, Runnable runnable) {
        this.c = i2;
        this.d = runnable;
    }

    public static j7 a(int i2) {
        for (j7 j7Var : values()) {
            if (j7Var.c == i2) {
                return j7Var;
            }
        }
        return ACTION_NONE;
    }
}
