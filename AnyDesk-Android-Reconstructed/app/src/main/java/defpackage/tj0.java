package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 implements OnBackAnimationCallback {
    public final /* synthetic */ rj0 a;
    public final /* synthetic */ uj0 b;

    public tj0(uj0 uj0Var, rj0 rj0Var) {
        this.b = uj0Var;
        this.a = rj0Var;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new rf(backEvent));
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new rf(backEvent));
        }
    }
}
