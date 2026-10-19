package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 implements Spannable {
    public boolean c = false;
    public Spannable d;

    public xc1(Spannable spannable) {
        this.d = spannable;
    }

    public final void a() {
        Spannable spannable = this.d;
        if (!this.c) {
            if ((Build.VERSION.SDK_INT < 28 ? new us0(19) : new wc1(19)).p(spannable)) {
                this.d = new SpannableString(spannable);
            }
        }
        this.c = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return j$.util.stream.IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.d.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.d.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.d.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return jf.b(this.d);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return jf.c(this.d);
    }
}
