package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf1 extends pp {
    public boolean j;
    public boolean k;

    @Override // defpackage.pp
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // defpackage.pp
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rv0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.j = true;
                } else if (index == 22) {
                    this.k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void j(u10 u10Var, int i, int i2);

    @Override // defpackage.pp, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.d; i++) {
                    View view = (View) constraintLayout.c.get(this.c[i]);
                    if (view != null) {
                        if (this.j) {
                            view.setVisibility(visibility);
                        }
                        if (this.k && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
