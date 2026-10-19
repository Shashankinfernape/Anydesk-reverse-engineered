package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class mm0 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm0)) {
            return false;
        }
        mm0 mm0Var = (mm0) obj;
        if (this.a != mm0Var.a || this.b != mm0Var.b || this.d != mm0Var.d || this.e != mm0Var.e) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = x8.b;
        }
        Class<?> cls = obj2.getClass();
        Object obj3 = mm0Var.c;
        if (obj3 == null) {
            obj3 = x8.b;
        }
        return cls.equals(obj3.getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Object obj = this.c;
        if (obj == null) {
            obj = x8.b;
        }
        return ((((obj.getClass().hashCode() + i) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(mm0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        Object obj = this.c;
        if (obj == null) {
            obj = x8.b;
        }
        sb.append(obj.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        sb.append(this.e);
        sb.append("}\n");
        return sb.toString();
    }
}
