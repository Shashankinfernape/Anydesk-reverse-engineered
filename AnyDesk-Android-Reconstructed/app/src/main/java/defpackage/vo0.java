package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends jx0 {
    public final /* synthetic */ yo0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(yo0 yo0Var, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f = yo0Var;
    }

    @Override // defpackage.jx0, defpackage.o3
    public final void d(View view, w3 w3Var) {
        super.d(view, w3Var);
        yo0 yo0Var = this.f.g.g;
        int i = 0;
        for (int i2 = 0; i2 < yo0Var.g.d.size(); i2++) {
            int iC = yo0Var.g.c(i2);
            if (iC == 0 || iC == 1) {
                i++;
            }
        }
        w3Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
