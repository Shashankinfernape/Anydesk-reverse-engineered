package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n7 implements yq {
    public final yq a;
    public final float b;

    public n7(float f, yq yqVar) {
        while (yqVar instanceof n7) {
            yqVar = ((n7) yqVar).a;
            f += ((n7) yqVar).b;
        }
        this.a = yqVar;
        this.b = f;
    }

    @Override // defpackage.yq
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        return this.a.equals(n7Var.a) && this.b == n7Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
