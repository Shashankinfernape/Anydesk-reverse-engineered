package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class yg1 extends xg1 {
    public yg1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var, windowInsets);
    }

    @Override // defpackage.dh1
    public gh1 a() {
        return gh1.g(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.dh1
    public tu e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tu(displayCutout);
    }

    @Override // defpackage.wg1, defpackage.dh1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg1)) {
            return false;
        }
        yg1 yg1Var = (yg1) obj;
        return Objects.equals(this.c, yg1Var.c) && Objects.equals(this.g, yg1Var.g) && wg1.A(this.h, yg1Var.h);
    }

    @Override // defpackage.dh1
    public int hashCode() {
        return this.c.hashCode();
    }
}
