package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class jh1 extends ih1 {
    @Override // defpackage.y90
    public final void T() {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
    }
}
