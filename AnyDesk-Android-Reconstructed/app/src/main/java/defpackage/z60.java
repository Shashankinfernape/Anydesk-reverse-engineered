package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z60 implements j80 {
    public final int mColor1;
    public final int mColor2;
    public final int mType;

    public z60(int i, int i2, int i3) {
        this.mType = i;
        this.mColor1 = i2;
        this.mColor2 = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof z60) {
            z60 z60Var = (z60) obj;
            if (this.mType == z60Var.mType && this.mColor1 == z60Var.mColor1 && this.mColor2 == z60Var.mColor2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.mType * 31) + this.mColor1) * 31) + this.mColor2;
    }

    @Override // defpackage.j80
    public boolean matchesFilter(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!matchesFilter(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesFilter(String str) {
        return true;
    }
}
