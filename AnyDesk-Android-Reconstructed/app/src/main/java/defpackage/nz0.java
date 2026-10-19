package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nz0 extends sq implements v10 {
    public final v10 f;
    public final br g;
    public final int h;
    public br i;
    public rq j;

    public nz0(v10 v10Var, br brVar) {
        super(nn.e, kx.c);
        this.f = v10Var;
        this.g = brVar;
        this.h = ((Number) brVar.h(0, new hn(5))).intValue();
    }

    @Override // defpackage.ag, defpackage.mr
    public final mr d() {
        rq rqVar = this.j;
        if (rqVar instanceof mr) {
            return (mr) rqVar;
        }
        return null;
    }

    @Override // defpackage.sq, defpackage.rq
    public final br e() {
        br brVar = this.i;
        return brVar == null ? kx.c : brVar;
    }

    @Override // defpackage.v10
    public final Object i(Object obj, rq rqVar) {
        try {
            Object objO = o(rqVar, obj);
            return objO == lr.c ? objO : uc1.a;
        } catch (Throwable th) {
            this.i = new wu(rqVar.e(), th);
            throw th;
        }
    }

    @Override // defpackage.ag
    public final StackTraceElement l() {
        return null;
    }

    @Override // defpackage.ag
    public final Object m(Object obj) {
        Throwable thA = qy0.a(obj);
        if (thA != null) {
            this.i = new wu(e(), thA);
        }
        rq rqVar = this.j;
        if (rqVar != null) {
            rqVar.g(obj);
        }
        return lr.c;
    }

    public final Object o(rq rqVar, Object obj) {
        Comparable comparable;
        String strSubstring;
        br brVarE = rqVar.e();
        y90.n(brVarE);
        br brVar = this.i;
        if (brVar != brVarE) {
            int i = 0;
            if (brVar instanceof wu) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((wu) brVar).d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                List listQ = p71.Q(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listQ) {
                    if (!p71.P((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(vm.c0(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listQ.size();
                int size2 = listQ.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : listQ) {
                    int i3 = i + 1;
                    if (i < 0) {
                        um.b0();
                        throw null;
                    }
                    String str3 = (String) obj4;
                    if ((i == 0 || i == size2) && p71.P(str3)) {
                        strSubstring = null;
                    } else {
                        str3.getClass();
                        if (iIntValue < 0) {
                            nh0.e(q51.k(iIntValue, "Requested character count ", " is less than zero."));
                            return null;
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i = i3;
                }
                StringBuilder sb = new StringBuilder(length3);
                tm.l0(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) brVarE.h(0, new d60() { // from class: qz0
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // defpackage.d60
                public final Object f(Object obj5, Object obj6) {
                    int iIntValue2 = ((Integer) obj5).intValue();
                    zq zqVar = (zq) obj6;
                    ar key = zqVar.getKey();
                    zq zqVarL = this.c.g.l(key);
                    if (key == fw.f) {
                        pd0 pd0Var = (pd0) zqVarL;
                        pd0 parent = (pd0) zqVar;
                        while (true) {
                            if (parent != null) {
                                if (parent == pd0Var || !(parent instanceof m01)) {
                                    break;
                                }
                                ml mlVarI = ((m01) parent).I();
                                parent = mlVarI != null ? mlVarI.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != pd0Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + pd0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (pd0Var != null) {
                            iIntValue2++;
                        }
                    } else if (zqVar != zqVarL) {
                        iIntValue2 = Integer.MIN_VALUE;
                    } else {
                        iIntValue2++;
                    }
                    return Integer.valueOf(iIntValue2);
                }
            })).intValue() != this.h) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.g + ",\n\t\tbut emission happened in " + brVarE + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.i = brVarE;
        }
        this.j = rqVar;
        e60 e60Var = pz0.a;
        v10 v10Var = this.f;
        v10Var.getClass();
        Object objC = e60Var.c(v10Var, obj, this);
        if (!y90.e(objC, lr.c)) {
            this.j = null;
        }
        return objC;
    }
}
