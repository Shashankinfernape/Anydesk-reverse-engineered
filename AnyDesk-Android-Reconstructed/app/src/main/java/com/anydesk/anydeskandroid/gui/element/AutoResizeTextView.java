package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.widget.TextView;
import defpackage.ad;
import defpackage.af1;

/* JADX INFO: loaded from: classes.dex */
public class AutoResizeTextView extends ad {
    public final RectF j;
    public RectF k;
    public SparseIntArray l;
    public TextPaint m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public int s;
    public final boolean t;
    public boolean u;
    public final af1 v;

    public AutoResizeTextView(Context context) {
        super(context, null);
        this.j = new RectF();
        this.o = 1.0f;
        this.p = 0.0f;
        this.q = 20.0f;
        this.t = true;
        this.v = new af1(23, this);
        i();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[EDGE_INSN: B:35:0x00c8->B:33:0x00c8 BREAK  A[LOOP:0: B:3:0x0009->B:32:0x00c5], SYNTHETIC] */
    public static int h(int i, int i2, af1 af1Var, RectF rectF) {
        StaticLayout staticLayoutBuild;
        byte b;
        int i3 = 1;
        int i4 = i;
        int i5 = i2 - 1;
        int i6 = i4;
        while (i6 <= i5) {
            i4 = (i6 + i5) >>> i3;
            AutoResizeTextView autoResizeTextView = (AutoResizeTextView) af1Var.d;
            TextPaint textPaint = autoResizeTextView.m;
            RectF rectF2 = autoResizeTextView.j;
            textPaint.setTextSize(i4);
            String string = autoResizeTextView.getText().toString();
            int maxLines = autoResizeTextView.getMaxLines();
            AutoResizeTextView autoResizeTextView2 = (AutoResizeTextView) af1Var.d;
            if (maxLines == i3) {
                autoResizeTextView2.j.bottom = autoResizeTextView2.m.getFontSpacing();
                rectF2.right = autoResizeTextView.m.measureText(string);
            } else {
                TextPaint textPaint2 = autoResizeTextView2.m;
                int i7 = autoResizeTextView2.r;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                float f = autoResizeTextView2.o;
                float f2 = autoResizeTextView2.p;
                if (Build.VERSION.SDK_INT < 28) {
                    staticLayoutBuild = new StaticLayout(string, textPaint2, i7, alignment, f, f2, true);
                } else {
                    StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(string, 0, string.length(), textPaint2, i7);
                    builderObtain.setAlignment(alignment);
                    builderObtain.setLineSpacing(f2, f);
                    builderObtain.setIncludePad(true);
                    staticLayoutBuild = builderObtain.build();
                }
                if (autoResizeTextView.getMaxLines() == -1 || staticLayoutBuild.getLineCount() <= autoResizeTextView.getMaxLines()) {
                    rectF2.bottom = staticLayoutBuild.getHeight();
                    int lineWidth = -1;
                    for (int i8 = 0; i8 < staticLayoutBuild.getLineCount(); i8++) {
                        if (lineWidth < staticLayoutBuild.getLineWidth(i8)) {
                            lineWidth = (int) staticLayoutBuild.getLineWidth(i8);
                        }
                    }
                    rectF2.right = lineWidth;
                }
                if (b < 0) {
                    if (b > 0) {
                        break;
                    }
                    i4--;
                    i5 = i4;
                } else {
                    int i9 = i4 + 1;
                    i4 = i6;
                    i6 = i9;
                }
                i3 = 1;
            }
            rectF2.offsetTo(0.0f, 0.0f);
            b = rectF.contains(rectF2) ? (byte) -1 : (byte) 1;
            if (b < 0) {
                if (b > 0) {
                    break;
                    break;
                }
                i4--;
                i5 = i4;
            } else {
                int i10 = i4 + 1;
                i4 = i6;
                i6 = i10;
            }
            i3 = 1;
        }
        return i4;
    }

    public final void g() {
        int iH;
        if (this.u) {
            int i = (int) this.q;
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.r = measuredWidth;
            RectF rectF = this.k;
            rectF.right = measuredWidth;
            rectF.bottom = measuredHeight;
            int i2 = (int) this.n;
            boolean z = this.t;
            af1 af1Var = this.v;
            if (z) {
                String string = getText().toString();
                int length = string == null ? 0 : string.length();
                int i3 = this.l.get(length);
                if (i3 != 0) {
                    iH = i3;
                } else {
                    iH = h(i, i2, af1Var, rectF);
                    this.l.put(length, iH);
                }
            } else {
                iH = h(i, i2, af1Var, rectF);
            }
            super.setTextSize(0, iH);
        }
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.s;
    }

    public final void i() {
        this.m = new TextPaint(getPaint());
        this.n = getTextSize();
        this.k = new RectF();
        this.l = new SparseIntArray();
        if (this.s == 0) {
            this.s = -1;
        }
        this.u = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.l.clear();
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        g();
    }

    @Override // defpackage.ad, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.o = f2;
        this.p = f;
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        super.setLines(i);
        this.s = i;
        g();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.s = i;
        g();
    }

    public void setMinTextSize(float f) {
        this.q = f;
        g();
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        if (z) {
            this.s = 1;
        } else {
            this.s = -1;
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        g();
    }

    @Override // defpackage.ad, android.widget.TextView
    public final void setTextSize(int i, float f) {
        Context context = getContext();
        this.n = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        this.l.clear();
        g();
    }

    @Override // android.widget.TextView
    public final void setSingleLine() {
        super.setSingleLine();
        this.s = 1;
        g();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.n = f;
        this.l.clear();
        g();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new RectF();
        this.o = 1.0f;
        this.p = 0.0f;
        this.q = 20.0f;
        this.t = true;
        this.v = new af1(23, this);
        i();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new RectF();
        this.o = 1.0f;
        this.p = 0.0f;
        this.q = 20.0f;
        this.t = true;
        this.v = new af1(23, this);
        i();
    }
}
