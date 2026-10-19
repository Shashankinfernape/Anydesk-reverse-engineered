package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class kk0 extends ad {
    @Override // defpackage.ad, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (bu0.z(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, ov0.x);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iP = -1;
            for (int i2 = 0; i2 < 2 && iP < 0; i2++) {
                iP = ec1.p(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iP >= 0) {
                setLineHeight(iP);
            }
        }
    }
}
