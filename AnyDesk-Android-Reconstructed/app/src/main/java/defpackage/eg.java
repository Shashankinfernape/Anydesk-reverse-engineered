package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public eg(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        th1.b(context, attributeSet, i, i2);
        int[] iArr = ov0.d;
        th1.e(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = ec1.p(context, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        this.b = Math.min(ec1.p(context, typedArrayObtainStyledAttributes, 8, 0), this.a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c = new int[]{r71.t(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                id.q("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = r71.j(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g >= 0) {
            return;
        }
        id.q("indicatorTrackGapSize must be >= 0.");
    }
}
