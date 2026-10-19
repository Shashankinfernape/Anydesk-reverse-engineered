package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class rq0 implements OnBackAnimationCallback {
    public final /* synthetic */ z50 a;
    public final /* synthetic */ z50 b;
    public final /* synthetic */ o50 c;
    public final /* synthetic */ o50 d;

    public rq0(z50 z50Var, z50 z50Var2, o50 o50Var, o50 o50Var2) {
        this.a = z50Var;
        this.b = z50Var2;
        this.c = o50Var;
        this.d = o50Var2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.h(new rf(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.h(new rf(backEvent));
    }
}
