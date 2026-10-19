package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 extends ReplacementSpan {
    public final mc1 d;
    public TextPaint g;
    public final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short e = -1;
    public float f = 1.0f;

    public nc1(mc1 mc1Var) {
        r71.i(mc1Var, "rasterizer cannot be null");
        this.d = mc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.g;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.g = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.e, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        rw.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        mc1 mc1Var = this.d;
        ah ahVar = mc1Var.b;
        Typeface typeface = (Typeface) ahVar.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) ahVar.b, mc1Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        mc1 mc1Var = this.d;
        pl0 pl0VarB = mc1Var.b();
        int iA = pl0VarB.a(14);
        this.f = fAbs / (iA != 0 ? ((ByteBuffer) pl0VarB.f).getShort(iA + pl0VarB.c) : (short) 0);
        pl0 pl0VarB2 = mc1Var.b();
        int iA2 = pl0VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) pl0VarB2.f).getShort(iA2 + pl0VarB2.c);
        }
        pl0 pl0VarB3 = mc1Var.b();
        int iA3 = pl0VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) pl0VarB3.f).getShort(iA3 + pl0VarB3.c) : (short) 0) * this.f);
        this.e = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
