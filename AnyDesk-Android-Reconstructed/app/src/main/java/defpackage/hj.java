package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class hj implements DisplayManager.DisplayListener {
    public final /* synthetic */ wh a;

    public hj(wh whVar) {
        this.a = whVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        mj mjVar = (mj) this.a.f;
        mjVar.a.e("display changed: " + i);
        s7 s7Var = mjVar.m;
        if (s7Var != null) {
            s7Var.post(new ij(mjVar, 1));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
