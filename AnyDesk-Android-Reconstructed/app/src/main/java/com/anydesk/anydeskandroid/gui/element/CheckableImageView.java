package com.anydesk.anydeskandroid.gui.element;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageView extends yb implements Checkable {
    public static final int[] g = {R.attr.state_checked};
    public boolean f;

    public CheckableImageView(Context context) {
        super(context);
        this.f = false;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = false;
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = false;
    }
}
