package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends f81 implements d60 {
    public final /* synthetic */ int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(dt0 dt0Var, cf cfVar, rq rqVar) {
        super(2, rqVar);
        this.g = 1;
        this.h = dt0Var;
        this.i = cfVar;
    }

    @Override // defpackage.d60
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        uc1 uc1Var = uc1.a;
        switch (i) {
            case 0:
                return ((s1) j((rq) obj2, (RosterItem) obj)).m(uc1Var);
            case 1:
                return ((s1) j((rq) obj2, (kr) obj)).m(uc1Var);
            case 2:
                ((s1) j((rq) obj2, (kr) obj)).m(uc1Var);
                return uc1Var;
            default:
                return ((s1) j((rq) obj2, (vf1) obj)).m(uc1Var);
        }
    }

    @Override // defpackage.ag
    public final rq j(rq rqVar, Object obj) {
        int i = this.g;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                s1 s1Var = new s1((v1) obj2, rqVar, 0);
                s1Var.h = obj;
                return s1Var;
            case 1:
                return new s1((dt0) this.h, (cf) obj2, rqVar);
            case 2:
                s1 s1Var2 = new s1((bf0) obj2, rqVar, 2);
                s1Var2.h = obj;
                return s1Var2;
            default:
                s1 s1Var3 = new s1((ns0) obj2, rqVar, 3);
                s1Var3.h = obj;
                return s1Var3;
        }
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        int i = this.g;
        boolean z = true;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                RosterItem rosterItem = (RosterItem) this.h;
                y90.V(obj);
                v1 v1Var = (v1) obj2;
                Map map = v1Var.j;
                long j = rosterItem.mCid;
                String[] strArr = rosterItem.b;
                br0 br0Var = (br0) map.get(new Long(j));
                RosterItem rosterItemA = br0Var != null ? rosterItem.a(rosterItem.mUserDefinedName, rosterItem.mThumbnailPath, strArr, br0Var) : rosterItem;
                strArr.getClass();
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    str.getClass();
                    arrayList.add(new n81(str, v1Var.d.contains(str)));
                }
                long j2 = rosterItem.mId;
                Long l = v1Var.e;
                return new fz0(rosterItemA, arrayList, l != null && j2 == l.longValue());
            case 1:
                y90.V(obj);
                dt0 dt0Var = (dt0) this.h;
                ss0 ss0Var = dt0Var.k;
                ss0 ss0Var2 = dt0Var.j;
                k0 k0Var = ((cf) obj2).a;
                ss0Var.getClass();
                h7 h7VarD = lk0.d(new pu0(ss0Var, ss0Var2, k0Var, ss0Var.b, ss0Var2.b));
                Iterable iterableY = th1.Y(0, ss0Var.b);
                if ((iterableY instanceof Collection) && ((Collection) iterableY).isEmpty()) {
                    z = false;
                } else {
                    Iterator it = iterableY.iterator();
                    while (((v90) it).e) {
                        if (h7VarD.c(((t90) it).nextInt()) != -1) {
                        }
                    }
                    z = false;
                }
                return new ou0(h7VarD, z);
            case 2:
                y90.V(obj);
                kr krVar = (kr) this.h;
                bf0 bf0Var = (bf0) obj2;
                if0 if0Var = bf0Var.c;
                if (if0Var.d.compareTo(af0.d) >= 0) {
                    if0Var.a(bf0Var);
                } else {
                    pd0 pd0Var = (pd0) krVar.f().l(fw.f);
                    if (pd0Var != null) {
                        pd0Var.b(null);
                    }
                }
                return uc1.a;
            default:
                y90.V(obj);
                vf1 vf1Var = (vf1) this.h;
                int i2 = vf1Var.a * (-1);
                fw fwVar = ((ns0) obj2).c;
                if (i2 <= 400 && vf1Var.b * (-1) <= 400) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(Object obj, rq rqVar, int i) {
        super(2, rqVar);
        this.g = i;
        this.i = obj;
    }
}
