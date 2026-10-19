package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class cg {
    public l8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ cg(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                dg dgVar = (dg) view;
                dgVar.setIndeterminate(false);
                dgVar.b(dgVar.d);
                break;
            case 1:
                dg dgVar2 = (dg) view;
                if (!dgVar2.h) {
                    dgVar2.setVisibility(dgVar2.i);
                }
                break;
            default:
                ColorStateList colorStateList = ((ck0) view).q;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                ck0 ck0Var = (ck0) this.c;
                ColorStateList colorStateList = ck0Var.q;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(ck0Var.u, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
