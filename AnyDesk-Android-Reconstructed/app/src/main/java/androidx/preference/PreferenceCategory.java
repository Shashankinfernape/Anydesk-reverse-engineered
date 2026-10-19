package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.hq;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hq.r(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
