package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.lv0;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int j;
    public final int k;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lv0.i, R.attr.seekBarPreferenceStyle, 0);
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i2 = i2 < i ? i : i2;
        if (i2 != this.j) {
            this.j = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.k) {
            this.k = Math.min(this.j - i, Math.abs(i3));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
