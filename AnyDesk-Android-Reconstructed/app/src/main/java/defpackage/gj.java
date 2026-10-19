package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class gj extends OrientationEventListener {
    public final /* synthetic */ wh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(wh whVar, Context context) {
        super(context);
        this.a = whVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        mj mjVar = (mj) this.a.f;
        mjVar.a.e("orientation changed: " + i);
        s7 s7Var = mjVar.m;
        if (s7Var != null) {
            s7Var.post(new ij(mjVar, 1));
        }
    }
}
