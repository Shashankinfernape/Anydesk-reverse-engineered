package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class i71 {
    public static final int l;
    public static boolean m;
    public static Constructor n;
    public static TextDirectionHeuristic o;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean j;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 1.0f;
    public int h = l;
    public boolean i = true;
    public TextUtils.TruncateAt k = null;

    static {
        l = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public i71(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() throws h71 {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.d);
        this.d = iMin;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.j && this.f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(this.e);
            builderObtain.setIncludePad(this.i);
            builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.k;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f);
            float f = this.g;
            if (f != 1.0f) {
                builderObtain.setLineSpacing(0.0f, f);
            }
            if (this.f > 1) {
                builderObtain.setHyphenationFrequency(this.h);
            }
            return builderObtain.build();
        }
        if (!m) {
            try {
                o = this.j && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                m = true;
            } catch (Exception e) {
                throw new h71(e);
            }
        }
        try {
            Constructor constructor = n;
            constructor.getClass();
            Integer numValueOf = Integer.valueOf(this.d);
            Integer numValueOf2 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.e;
            TextDirectionHeuristic textDirectionHeuristic = o;
            textDirectionHeuristic.getClass();
            return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, numValueOf, textPaint, numValueOf2, alignment, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.i), null, Integer.valueOf(iMax), Integer.valueOf(this.f));
        } catch (Exception e2) {
            throw new h71(e2);
        }
    }
}
