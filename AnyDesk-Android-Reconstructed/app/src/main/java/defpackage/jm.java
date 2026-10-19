package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx b;

    public /* synthetic */ jm(sx sxVar, int i) {
        this.a = i;
        this.b = sxVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        sx sxVar = this.b;
        switch (i) {
            case 0:
                mm mmVar = (mm) sxVar;
                mmVar.s(mmVar.t());
                break;
            default:
                xv xvVar = (xv) sxVar;
                xvVar.l = z;
                xvVar.p();
                if (!z) {
                    xvVar.s(false);
                    xvVar.m = false;
                }
                break;
        }
    }
}
