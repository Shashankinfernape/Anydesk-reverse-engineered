package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class t5 extends yb implements x5 {
    public final /* synthetic */ w5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(w5 w5Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f = w5Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        bu0.D(this, getContentDescription());
        setOnTouchListener(new p5(this, this));
    }

    @Override // defpackage.x5
    public final boolean a() {
        return false;
    }

    @Override // defpackage.x5
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
