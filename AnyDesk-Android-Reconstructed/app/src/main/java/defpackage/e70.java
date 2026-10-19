package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;

/* JADX INFO: loaded from: classes.dex */
public final class e70 extends SurfaceView {
    public final int c;
    public boolean d;
    public final /* synthetic */ GlowActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(GlowActivity glowActivity, Context context, int i) {
        super(context);
        this.e = glowActivity;
        this.c = i;
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            GlowActivity.jniOnSurfaceMoved(this.e.mNativeActivityPtr, this.c, i, i2);
        }
    }

    @Override // android.view.View
    public final void onPointerCaptureChange(boolean z) {
        super.onPointerCaptureChange(z);
        GlowActivity.jniOnMouseCaptureChanged(this.e.mNativeActivityPtr, this.c, this.d && z);
    }
}
