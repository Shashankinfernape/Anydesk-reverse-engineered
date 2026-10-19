package defpackage;

import android.content.Context;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class lw {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public lw(Context context) {
        boolean z = bu0.z(context, R.attr.elevationOverlayEnabled, false);
        int iT = r71.t(context, R.attr.elevationOverlayColor, 0);
        int iT2 = r71.t(context, R.attr.elevationOverlayAccentColor, 0);
        int iT3 = r71.t(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iT;
        this.c = iT2;
        this.d = iT3;
        this.e = f2;
    }
}
