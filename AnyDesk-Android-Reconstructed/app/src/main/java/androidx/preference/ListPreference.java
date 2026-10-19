package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.anydesk.anydeskandroid.R;
import defpackage.fw;
import defpackage.hq;
import defpackage.lv0;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] j;
    public final String k;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lv0.d, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.j = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (fw.k == null) {
                fw.k = new fw(23);
            }
            this.i = fw.k;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lv0.f, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.k = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        fw fwVar = this.i;
        if (fwVar != null) {
            return fwVar.g(this);
        }
        CharSequence charSequenceA = super.a();
        String str = this.k;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceA)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceA;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hq.r(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
