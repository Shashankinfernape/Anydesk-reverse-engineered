package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends Thread {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(mj mjVar) {
        super("CaptureHandler");
        this.d = mjVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                h7 h7Var = (h7) obj;
                for (d80 d80VarA = h7.a(h7Var); d80VarA != null; d80VarA = h7.a(h7Var)) {
                    ((g7) h7Var.e).i(d80VarA);
                }
                break;
            default:
                Looper.prepare();
                ((mj) obj).v = new s7(this, Looper.getMainLooper(), 1);
                Looper.loop();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(h7 h7Var, String str) {
        super(str);
        this.d = h7Var;
    }
}
