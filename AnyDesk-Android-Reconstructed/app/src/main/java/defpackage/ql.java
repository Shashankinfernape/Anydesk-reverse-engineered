package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class ql extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ql(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tl tlVar = ((Chip) obj).g;
                if (tlVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    tlVar.getOutline(outline);
                }
                break;
            default:
                p41 p41Var = (p41) obj;
                if (p41Var.c != null && !p41Var.d.isEmpty()) {
                    RectF rectF = p41Var.d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, p41Var.g);
                    break;
                }
                break;
        }
    }
}
