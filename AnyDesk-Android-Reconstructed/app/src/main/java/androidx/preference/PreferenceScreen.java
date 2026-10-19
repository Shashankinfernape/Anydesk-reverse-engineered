package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.hq;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hq.r(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
    }
}
