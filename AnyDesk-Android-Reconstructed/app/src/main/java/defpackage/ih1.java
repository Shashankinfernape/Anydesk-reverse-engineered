package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ih1 extends hh1 {
    @Override // defpackage.y90
    public final void U() {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }
}
