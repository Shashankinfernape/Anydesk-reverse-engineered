package defpackage;

import android.os.CountDownTimer;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 extends CountDownTimer {
    public final /* synthetic */ Button a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ n4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(n4 n4Var, long j, Button button, CharSequence charSequence) {
        super(j, 200L);
        this.c = n4Var;
        this.a = button;
        this.b = charSequence;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        t70.Y(new bc0(7, this));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        ((ih0) this.c.b).s0 = j;
        t70.Y(new eh0(this, j, 0));
    }
}
