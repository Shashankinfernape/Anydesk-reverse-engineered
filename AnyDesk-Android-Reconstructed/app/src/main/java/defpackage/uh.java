package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uh {
    public static final sk a = new sk(-1, null, null, 0);
    public static final int b = hq.P(32, "kotlinx.coroutines.bufferedChannel.segmentSize", 12);
    public static final int c = hq.P(10000, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 12);
    public static final bx d = new bx("BUFFERED", 2);
    public static final bx e = new bx("SHOULD_BUFFER", 2);
    public static final bx f = new bx("S_RESUMING_BY_RCV", 2);
    public static final bx g = new bx("RESUMING_BY_EB", 2);
    public static final bx h = new bx("POISONED", 2);
    public static final bx i = new bx("DONE_RCV", 2);
    public static final bx j = new bx("INTERRUPTED_SEND", 2);
    public static final bx k = new bx("INTERRUPTED_RCV", 2);
    public static final bx l = new bx("CHANNEL_CLOSED", 2);
    public static final bx m = new bx("SUSPEND", 2);
    public static final bx n = new bx("SUSPEND_NO_WAITER", 2);
    public static final bx o = new bx("FAILED", 2);
    public static final bx p = new bx("NO_RECEIVE_RESULT", 2);
    public static final bx q = new bx("CLOSE_HANDLER_CLOSED", 2);
    public static final bx r = new bx("CLOSE_HANDLER_INVOKED", 2);
    public static final bx s = new bx("NO_CLOSE_CAUSE", 2);

    public static final boolean a(vi viVar, Object obj, e60 e60Var) {
        bx bxVarK = viVar.k(obj, e60Var);
        if (bxVarK == null) {
            return false;
        }
        viVar.t(bxVarK);
        return true;
    }
}
