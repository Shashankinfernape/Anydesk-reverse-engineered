package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.il;
import defpackage.jl;
import defpackage.oe1;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] i = {R.attr.state_checked};
    public boolean f;
    public boolean g;
    public boolean h;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = true;
        this.h = true;
        oe1.n(this, new il(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), i) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jl jlVar = (jl) parcelable;
        super.onRestoreInstanceState(jlVar.c);
        setChecked(jlVar.e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        jl jlVar = new jl(super.onSaveInstanceState());
        jlVar.e = this.f;
        return jlVar;
    }

    public void setCheckable(boolean z) {
        if (this.g != z) {
            this.g = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.g || this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.h) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
