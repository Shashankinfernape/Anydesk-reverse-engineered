package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import defpackage.nv0;
import defpackage.r3;

/* JADX INFO: loaded from: classes.dex */
public class AccountAsteriskLabelledText extends LinearLayout {
    public final Logging c;
    public TextView d;
    public TextView e;

    public AccountAsteriskLabelledText(Context context) {
        super(context);
        this.c = new Logging("AccountAsteriskLabelledText");
        a(null, 0);
    }

    public final void a(AttributeSet attributeSet, int i) {
        View.inflate(getContext(), R.layout.account_asterisk_labelled_text, this);
        this.d = (TextView) findViewById(R.id.account_asterisk_labelled_text);
        this.e = (TextView) findViewById(R.id.account_asterisk_label);
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.a, i, 0);
                setText(typedArrayObtainStyledAttributes.getString(1));
                boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
                TextView textView = this.e;
                if (z) {
                    r3.I(textView, 0);
                } else {
                    r3.I(textView, 8);
                }
                TypedValue typedValue = new TypedValue();
                if (typedArrayObtainStyledAttributes.getValue(2, typedValue) && typedValue.type == 5) {
                    setTextSizePixel(typedValue.getDimension(Resources.getSystem().getDisplayMetrics()));
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                this.c.d(th);
            }
        }
    }

    public void setText(String str) {
        r3.F(this.d, str);
    }

    public void setTextSizePixel(float f) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextSize(0, f);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextSize(0, f);
        }
    }

    public AccountAsteriskLabelledText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("AccountAsteriskLabelledText");
        a(attributeSet, 0);
    }

    public AccountAsteriskLabelledText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("AccountAsteriskLabelledText");
        a(attributeSet, i);
    }
}
