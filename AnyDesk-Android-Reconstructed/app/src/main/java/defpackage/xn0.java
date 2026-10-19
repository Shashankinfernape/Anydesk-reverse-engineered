package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xn0 extends vn0 implements Iterable, yd0 {
    public static final /* synthetic */ int j = 0;
    public final xb i;

    public xn0(zn0 zn0Var) {
        super(zn0Var);
        xb xbVar = new xb();
        xbVar.d = this;
        xbVar.e = new x51(0);
        this.i = xbVar;
    }

    @Override // defpackage.vn0
    public final un0 e(y6 y6Var) {
        un0 un0VarE = super.e(y6Var);
        xb xbVar = this.i;
        xbVar.getClass();
        return xbVar.e(un0VarE, y6Var, false, (xn0) xbVar.d);
    }

    @Override // defpackage.vn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xn0) || !super.equals(obj)) {
            return false;
        }
        xb xbVar = this.i;
        int iF = ((x51) xbVar.e).f();
        xb xbVar2 = ((xn0) obj).i;
        if (iF != ((x51) xbVar2.e).f() || xbVar.c != xbVar2.c) {
            return false;
        }
        x51 x51Var = (x51) xbVar.e;
        x51Var.getClass();
        for (vn0 vn0Var : (mp) h11.b0(new j2(2, x51Var))) {
            if (!vn0Var.equals(((x51) xbVar2.e).c(vn0Var.d.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vn0
    public final void f(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, wv0.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        xb xbVar = this.i;
        xn0 xn0Var = (xn0) xbVar.d;
        if (resourceId == xn0Var.d.a) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + xn0Var).toString());
        }
        xbVar.c = resourceId;
        xbVar.f = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
                strValueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
        }
        xbVar.f = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void g(vn0 vn0Var) {
        vn0Var.getClass();
        xb xbVar = this.i;
        x51 x51Var = (x51) xbVar.e;
        xn0 xn0Var = (xn0) xbVar.d;
        m7 m7Var = xn0Var.d;
        m7 m7Var2 = vn0Var.d;
        int i = m7Var2.a;
        String str = (String) m7Var2.f;
        if (i == 0 && str == null) {
            id.q("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = (String) m7Var.f;
        if (str2 != null && y90.e(str, str2)) {
            throw new IllegalArgumentException(("Destination " + vn0Var + " cannot have the same route as graph " + xn0Var).toString());
        }
        if (i == m7Var.a) {
            throw new IllegalArgumentException(("Destination " + vn0Var + " cannot have the same id as graph " + xn0Var).toString());
        }
        vn0 vn0Var2 = (vn0) x51Var.c(i);
        if (vn0Var2 == vn0Var) {
            return;
        }
        if (vn0Var.e != null) {
            nh0.j("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (vn0Var2 != null) {
            vn0Var2.e = null;
        }
        vn0Var.e = xn0Var;
        x51Var.e(m7Var2.a, vn0Var);
    }

    public final vn0 h(int i) {
        xb xbVar = this.i;
        return xbVar.c(i, (xn0) xbVar.d, null, false);
    }

    @Override // defpackage.vn0
    public final int hashCode() {
        xb xbVar = this.i;
        int iD = xbVar.c;
        x51 x51Var = (x51) xbVar.e;
        int iF = x51Var.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + x51Var.d(i)) * 31) + ((vn0) x51Var.g(i)).hashCode();
        }
        return iD;
    }

    public final un0 i(y6 y6Var, vn0 vn0Var) {
        return this.i.e(super.e(y6Var), y6Var, true, vn0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        xb xbVar = this.i;
        xbVar.getClass();
        return new yn0(xbVar);
    }

    @Override // defpackage.vn0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        xb xbVar = this.i;
        xbVar.getClass();
        xbVar.getClass();
        vn0 vn0VarH = h(xbVar.c);
        sb.append(" startDestination=");
        if (vn0VarH == null) {
            String str = (String) xbVar.f;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(xbVar.c));
            }
        } else {
            sb.append("{");
            sb.append(vn0VarH.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
