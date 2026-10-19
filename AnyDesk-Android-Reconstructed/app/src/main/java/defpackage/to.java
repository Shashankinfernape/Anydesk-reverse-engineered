package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class to implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ ConnectionFragment a;

    public to(ConnectionFragment connectionFragment) {
        this.a = connectionFragment;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        ConnectionFragment connectionFragment = this.a;
        lp lpVar = connectionFragment.d0;
        if (lpVar != null) {
            t70.Y(new fj(connectionFragment, 1, lpVar.p()));
        }
    }
}
