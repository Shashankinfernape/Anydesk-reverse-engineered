package defpackage;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class tu {
    public final DisplayCutout a;

    public tu(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
