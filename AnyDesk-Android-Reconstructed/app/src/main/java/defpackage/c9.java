package defpackage;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes.dex */
public final class c9 extends CountDownTimer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(Object obj, long j, int i) {
        super(j, 200L);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.a) {
            case 0:
                t70.Y(((e9) ((n4) this.b).b).F0);
                break;
            default:
                t70.Y(new bc0(8, this));
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.a) {
            case 0:
                e9 e9Var = (e9) ((n4) this.b).b;
                e9Var.s0 = j;
                t70.Y(e9Var.E0);
                break;
            default:
                t70.Y(new eh0(this, j, 1));
                break;
        }
    }
}
