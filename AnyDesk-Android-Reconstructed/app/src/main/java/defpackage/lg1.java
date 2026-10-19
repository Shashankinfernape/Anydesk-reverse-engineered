package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lg1 extends hq {
    public final /* synthetic */ int s;
    public final /* synthetic */ ng1 t;

    public /* synthetic */ lg1(ng1 ng1Var, int i) {
        this.s = i;
        this.t = ng1Var;
    }

    @Override // defpackage.ff1
    public final void a() {
        View view;
        int i = this.s;
        ng1 ng1Var = this.t;
        switch (i) {
            case 0:
                if (ng1Var.x && (view = ng1Var.p) != null) {
                    view.setTranslationY(0.0f);
                    ng1Var.m.setTranslationY(0.0f);
                }
                ng1Var.m.setVisibility(8);
                ng1Var.m.setTransitioning(false);
                ng1Var.C = null;
                bc bcVar = ng1Var.t;
                if (bcVar != null) {
                    bcVar.b0(ng1Var.s);
                    ng1Var.s = null;
                    ng1Var.t = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ng1Var.l;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = oe1.a;
                    ee1.c(actionBarOverlayLayout);
                }
                break;
            default:
                ng1Var.C = null;
                ng1Var.m.requestLayout();
                break;
        }
    }
}
