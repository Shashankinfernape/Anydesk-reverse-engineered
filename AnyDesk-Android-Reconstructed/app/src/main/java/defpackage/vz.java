package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class vz extends FrameLayout {
    public ImageView c;
    public TextView d;

    public void setBadge(int i) {
        int iMax = Math.max(0, i);
        r3.F(this.d, iMax > 99 ? "99+" : String.valueOf(iMax));
        r3.I(this.d, iMax <= 0 ? 4 : 0);
    }

    public void setIcon(int i) {
        r3.D(this.c, i);
    }
}
