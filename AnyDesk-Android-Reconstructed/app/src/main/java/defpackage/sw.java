package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class sw implements rs {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    public sw(xt0 xt0Var) {
        this.d = xt0Var;
    }

    private final void b(gf0 gf0Var) {
    }

    private final void f(gf0 gf0Var) {
    }

    private final void j(gf0 gf0Var) {
    }

    private final void k(gf0 gf0Var) {
    }

    private final void l(gf0 gf0Var) {
    }

    private final void m(gf0 gf0Var) {
    }

    private final void n(gf0 gf0Var) {
    }

    private final void o(gf0 gf0Var) {
    }

    private final void p(gf0 gf0Var) {
    }

    private final void q(gf0 gf0Var) {
    }

    @Override // defpackage.rs
    public final void a(gf0 gf0Var) {
        int i = this.c;
    }

    @Override // defpackage.rs
    public final void c(gf0 gf0Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                xt0 xt0Var = (xt0) this.d;
                Toast toast = (Toast) xt0Var.d;
                Looper looper = t70.a;
                if (toast != null) {
                    try {
                        toast.cancel();
                        break;
                    } catch (Throwable unused) {
                    }
                }
                xt0Var.d = null;
                break;
        }
    }

    @Override // defpackage.rs
    public final void d(gf0 gf0Var) {
        int i = this.c;
    }

    @Override // defpackage.rs
    public final void e(gf0 gf0Var) {
        int i = this.c;
    }

    @Override // defpackage.rs
    public final void g(gf0 gf0Var) {
        switch (this.c) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? go.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i7(3), 500L);
                ((if0) this.d).f(this);
                break;
        }
    }

    @Override // defpackage.rs
    public final void h(gf0 gf0Var) {
        int i = this.c;
    }

    public sw(EmojiCompatInitializer emojiCompatInitializer, if0 if0Var) {
        this.d = if0Var;
    }
}
