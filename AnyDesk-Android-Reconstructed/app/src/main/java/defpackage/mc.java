package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class mc extends kg0 implements oc {
    public CharSequence F;
    public jc G;
    public final Rect H;
    public int I;
    public final /* synthetic */ pc J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(pc pcVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.J = pcVar;
        this.H = new Rect();
        this.q = pcVar;
        this.A = true;
        this.B.setFocusable(true);
        this.r = new kc(0, this);
    }

    @Override // defpackage.oc
    public final void f(CharSequence charSequence) {
        this.F = charSequence;
    }

    @Override // defpackage.oc
    public final void l(int i) {
        this.I = i;
    }

    @Override // defpackage.oc
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ac acVar = this.B;
        boolean zIsShowing = acVar.isShowing();
        s();
        int i3 = 2;
        acVar.setInputMethodMode(2);
        d();
        uv uvVar = this.e;
        uvVar.setChoiceMode(1);
        uvVar.setTextDirection(i);
        uvVar.setTextAlignment(i2);
        pc pcVar = this.J;
        int selectedItemPosition = pcVar.getSelectedItemPosition();
        uv uvVar2 = this.e;
        if (acVar.isShowing() && uvVar2 != null) {
            uvVar2.setListSelectionHidden(false);
            uvVar2.setSelection(selectedItemPosition);
            if (uvVar2.getChoiceMode() != 0) {
                uvVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = pcVar.getViewTreeObserver()) == null) {
            return;
        }
        b3 b3Var = new b3(i3, this);
        viewTreeObserver.addOnGlobalLayoutListener(b3Var);
        acVar.setOnDismissListener(new lc(this, b3Var));
    }

    @Override // defpackage.oc
    public final CharSequence p() {
        return this.F;
    }

    @Override // defpackage.kg0, defpackage.oc
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.G = (jc) listAdapter;
    }

    public final void s() {
        int i;
        ac acVar = this.B;
        Drawable background = acVar.getBackground();
        pc pcVar = this.J;
        Rect rect = pcVar.j;
        if (background != null) {
            background.getPadding(rect);
            boolean z = kf1.a;
            i = pcVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = pcVar.getPaddingLeft();
        int paddingRight = pcVar.getPaddingRight();
        int width = pcVar.getWidth();
        int i2 = pcVar.i;
        if (i2 == -2) {
            int iA = pcVar.a(this.G, acVar.getBackground());
            int i3 = (pcVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = kf1.a;
        this.h = pcVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.g) - this.I) + i : paddingLeft + this.I + i;
    }
}
