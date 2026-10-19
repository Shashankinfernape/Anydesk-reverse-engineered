package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.anydesk.anydeskandroid.R;
import defpackage.fw;
import defpackage.hq;
import defpackage.lv0;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final Context c;
    public final int d;
    public final CharSequence e;
    public final CharSequence f;
    public final String g;
    public final Object h;
    public fw i;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.d = Integer.MAX_VALUE;
        this.c = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lv0.f, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.g = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.e = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.d = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (typedArrayObtainStyledAttributes.getString(22) == null) {
            typedArrayObtainStyledAttributes.getString(13);
        }
        typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.getString(19) == null) {
            typedArrayObtainStyledAttributes.getString(10);
        }
        typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.h = c(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.h = c(typedArrayObtainStyledAttributes, 11);
        }
        typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        fw fwVar = this.i;
        return fwVar != null ? fwVar.g(this) : this.f;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.d;
        CharSequence charSequence = preference2.e;
        int i2 = this.d;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence2 = this.e;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.e;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb.append(charSequenceA);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hq.r(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
