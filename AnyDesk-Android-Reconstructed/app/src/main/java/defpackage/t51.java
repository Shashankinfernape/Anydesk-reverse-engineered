package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t51 extends ClickableSpan {
    public final /* synthetic */ Runnable c;

    public t51(Runnable runnable) {
        this.c = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.run();
    }
}
