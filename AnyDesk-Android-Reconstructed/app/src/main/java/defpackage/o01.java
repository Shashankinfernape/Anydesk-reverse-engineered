package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class o01 implements p01 {
    public final ScrollFeedbackProvider c;

    public o01(NestedScrollView nestedScrollView) {
        this.c = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.p01
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.c.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.p01
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.c.onScrollProgress(i, i2, i3, i4);
    }
}
