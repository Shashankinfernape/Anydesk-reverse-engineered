package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ly0 {
    public final Resources a;
    public final Resources.Theme b;

    public ly0(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ly0.class == obj.getClass()) {
            ly0 ly0Var = (ly0) obj;
            if (this.a.equals(ly0Var.a) && Objects.equals(this.b, ly0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
