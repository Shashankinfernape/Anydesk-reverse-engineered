package defpackage;

import android.os.CountDownTimer;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class j01 extends CountDownTimer {
    public final /* synthetic */ Button a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ qa c;
    public final /* synthetic */ n4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(n4 n4Var, long j, Button button, CharSequence charSequence, qa qaVar) {
        super(j, 200L);
        this.d = n4Var;
        this.a = button;
        this.b = charSequence;
        this.c = qaVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        t70.Y(new bc0(12, this));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        ((l01) this.d.b).s0 = j;
        t70.Y(new eh0(this, j, 2));
    }
}
