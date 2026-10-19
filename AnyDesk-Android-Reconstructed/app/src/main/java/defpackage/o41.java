package defpackage;

import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class o41 extends n41 {
    @Override // defpackage.n41
    public final void a(NavigationView navigationView) {
        if (this.c == null || this.d.isEmpty()) {
            return;
        }
        navigationView.invalidate();
    }

    @Override // defpackage.n41
    public final boolean b() {
        return true;
    }
}
