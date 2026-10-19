package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.fw;
import defpackage.hq;
import defpackage.lv0;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iR = hq.r(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iR);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lv0.c, iR, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (fw.j == null) {
                fw.j = new fw(13);
            }
            this.i = fw.j;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
