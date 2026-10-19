package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class q41 extends ViewOutlineProvider {
    public final /* synthetic */ r41 a;

    public q41(r41 r41Var) {
        this.a = r41Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path = this.a.e;
        if (path.isEmpty()) {
            return;
        }
        outline.setPath(path);
    }
}
