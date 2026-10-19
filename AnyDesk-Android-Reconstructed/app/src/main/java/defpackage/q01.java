package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class q01 {
    public final p01 a;

    public q01(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new o01(nestedScrollView);
        } else {
            this.a = new us0(10);
        }
    }
}
