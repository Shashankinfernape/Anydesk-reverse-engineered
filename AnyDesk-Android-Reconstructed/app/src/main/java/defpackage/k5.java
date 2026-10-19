package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ActionBarOverlayLayout d;

    public /* synthetic */ k5(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.c = i;
        this.d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.z);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(-actionBarOverlayLayout.f.getHeight()).setListener(actionBarOverlayLayout.z);
                break;
        }
    }
}
