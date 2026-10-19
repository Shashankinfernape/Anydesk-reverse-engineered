package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class s91 extends d2 {
    public static final Parcelable.Creator<s91> CREATOR = new c2(8);
    public CharSequence e;
    public boolean f;

    public s91(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.e) + "}";
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.e, parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
