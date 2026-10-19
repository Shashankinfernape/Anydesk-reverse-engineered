package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class k00 implements mq0 {
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ CircularProgressIndicator e;

    public k00(FrameLayout frameLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.c = frameLayout;
        this.d = imageView;
        this.e = circularProgressIndicator;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        u00 u00Var = (u00) obj;
        boolean z = BigDecimal.valueOf((double) u00Var.a).compareTo(BigDecimal.valueOf(1.0d)) >= 0;
        this.c.setVisibility(z ? 8 : 0);
        r3.I(this.d, z ? 0 : 8);
        CircularProgressIndicator circularProgressIndicator = this.e;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setProgress((int) ((z ? 0.0f : u00Var.a) * 100.0f));
        }
    }
}
