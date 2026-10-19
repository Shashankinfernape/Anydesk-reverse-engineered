package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class r41 extends n41 {
    public r41(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new q41(this));
    }

    @Override // defpackage.n41
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.a);
        if (this.a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // defpackage.n41
    public final boolean b() {
        return this.a;
    }
}
