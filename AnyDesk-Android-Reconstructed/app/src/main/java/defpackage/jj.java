package defpackage;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
public final class jj extends MediaProjection.Callback {
    public final /* synthetic */ mj a;

    public jj(mj mjVar) {
        this.a = mjVar;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onCapturedContentResize(int i, int i2) {
        mj mjVar = this.a;
        s7 s7Var = mjVar.m;
        if (s7Var != null) {
            s7Var.post(new ej(mjVar, i, i2, 0));
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onCapturedContentVisibilityChanged(boolean z) {
        mj mjVar = this.a;
        s7 s7Var = mjVar.m;
        if (s7Var != null) {
            s7Var.post(new fj(mjVar, 0, z));
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        mj mjVar = this.a;
        mjVar.a.e("stopping captured content");
        s7 s7Var = mjVar.v;
        if (s7Var != null) {
            s7Var.removeMessages(q51.d(13));
        }
        mj.a(mjVar);
    }
}
