package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class t91 implements LeadingMarginSpan {
    public final int a = 1;
    public final int b;
    public final int c;
    public final String d;

    public t91(int i, String str, int i2) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = new Paint(paint);
            int i9 = this.a;
            int i10 = this.b;
            if (i2 > 0) {
                i8 = (i10 * i9) + i;
                paint2.setTextAlign(Paint.Align.RIGHT);
            } else {
                i8 = i - (i10 * i9);
                paint2.setTextAlign(Paint.Align.LEFT);
            }
            String str = this.d;
            canvas.drawText((CharSequence) str, 0, str.length(), i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.b * this.a) + this.c;
    }
}
