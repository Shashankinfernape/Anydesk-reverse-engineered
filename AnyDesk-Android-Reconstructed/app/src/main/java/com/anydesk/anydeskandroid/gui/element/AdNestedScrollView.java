package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public class AdNestedScrollView extends NestedScrollView {
    public float I;
    public float J;
    public float K;
    public float L;

    public AdNestedScrollView(Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = 0.0f;
            this.J = 0.0f;
            this.K = motionEvent.getX();
            this.L = motionEvent.getY();
            computeScroll();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.I = Math.abs(x - this.K) + this.I;
            float fAbs = Math.abs(y - this.L) + this.J;
            this.J = fAbs;
            this.K = x;
            this.L = y;
            if (this.I > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public AdNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
