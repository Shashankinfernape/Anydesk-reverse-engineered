package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ad;

/* JADX INFO: loaded from: classes.dex */
public class TightTextView extends ad {
    public TightTextView(Context context) {
        super(context, null);
    }

    @Override // defpackage.ad, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float lineWidth = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > lineWidth) {
                    lineWidth = layout.getLineWidth(i3);
                }
            }
            int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(lineWidth));
            if (compoundPaddingRight < getMeasuredWidth()) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(compoundPaddingRight, Integer.MIN_VALUE), i2);
            }
        }
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
