package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.ad;
import defpackage.bu0;
import defpackage.kl0;
import defpackage.p5;
import defpackage.q5;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.vk0;
import defpackage.x5;
import defpackage.yv0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends ad implements kl0, View.OnClickListener, x5 {
    public vk0 j;
    public CharSequence k;
    public Drawable l;
    public qk0 m;
    public p5 n;
    public q5 o;
    public boolean p;
    public boolean q;
    public final int r;
    public int s;
    public final int t;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.p = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.c, i, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.s = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.x5
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.x5
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.j.getIcon() == null;
    }

    @Override // defpackage.kl0
    public final void c(vk0 vk0Var) {
        this.j = vk0Var;
        setIcon(vk0Var.getIcon());
        setTitle(vk0Var.getTitleCondensed());
        setId(vk0Var.a);
        setVisibility(vk0Var.isVisible() ? 0 : 8);
        setEnabled(vk0Var.isEnabled());
        if (vk0Var.hasSubMenu() && this.n == null) {
            this.n = new p5(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.kl0
    public vk0 getItemData() {
        return this.j;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.k);
        if (this.l != null && ((this.j.y & 4) != 4 || (!this.p && !this.q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.k : null);
        CharSequence charSequence = this.j.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.j.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.j.r;
        if (TextUtils.isEmpty(charSequence2)) {
            bu0.D(this, z3 ? null : this.j.e);
        } else {
            bu0.D(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qk0 qk0Var = this.m;
        if (qk0Var != null) {
            qk0Var.a(this.j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.p = g();
        h();
    }

    @Override // defpackage.ad, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.r;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p5 p5Var;
        if (this.j.hasSubMenu() && (p5Var = this.n) != null && p5Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.q != z) {
            this.q = z;
            vk0 vk0Var = this.j;
            if (vk0Var != null) {
                rk0 rk0Var = vk0Var.n;
                rk0Var.k = true;
                rk0Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(qk0 qk0Var) {
        this.m = qk0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(q5 q5Var) {
        this.o = q5Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
