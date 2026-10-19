package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xe {
    public final br a;
    public w70 b;
    public oc1 c;
    public ss0 d;
    public final y6 e;
    public final CopyOnWriteArrayList f;
    public final xt0 g;
    public volatile boolean h;
    public volatile int i;
    public final e71 j;
    public final cw0 k;
    public final v41 l;
    public final /* synthetic */ cf m;

    public xe(cf cfVar, br brVar) {
        this.m = cfVar;
        brVar.getClass();
        this.a = brVar;
        this.c = new et0();
        ss0 ss0Var = ss0.e;
        ss0Var.getClass();
        this.d = ss0Var;
        y6 y6Var = new y6(19);
        this.e = y6Var;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f = copyOnWriteArrayList;
        this.g = new xt0(14);
        this.j = ec1.b(Boolean.FALSE);
        this.k = (cw0) y6Var.f;
        this.l = bu0.a(0, 64, oh.d);
        copyOnWriteArrayList.add(new sm0(2, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(xe xeVar, List list, int i, int i2, boolean z, wg0 wg0Var, wg0 wg0Var2, w70 w70Var, sq sqVar) {
        gt0 gt0Var;
        ss0 ss0Var;
        w70 w70Var2;
        List list2;
        List list3;
        xeVar.getClass();
        if (sqVar instanceof gt0) {
            gt0Var = (gt0) sqVar;
            int i3 = gt0Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gt0Var.q = i3 - Integer.MIN_VALUE;
            } else {
                gt0Var = new gt0(xeVar, sqVar);
            }
        } else {
            gt0Var = new gt0(xeVar, sqVar);
        }
        Object obj = gt0Var.o;
        lr lrVar = lr.c;
        int i4 = gt0Var.q;
        if (i4 == 0) {
            y90.V(obj);
            if (z && wg0Var == null) {
                id.q("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                return null;
            }
            xeVar.h = false;
            ss0Var = new ss0(list, i, i2);
            ss0 ss0Var2 = xeVar.d;
            ss0Var2.getClass();
            xeVar.d = ss0Var;
            xeVar.b = w70Var;
            dt0 dt0Var = new dt0(ss0Var, ss0Var2);
            gt0Var.f = xeVar;
            gt0Var.g = list;
            gt0Var.h = wg0Var;
            gt0Var.i = wg0Var2;
            gt0Var.j = w70Var;
            gt0Var.k = ss0Var;
            gt0Var.l = i;
            gt0Var.m = i2;
            gt0Var.n = z;
            gt0Var.q = 1;
            if (xeVar.c(dt0Var, gt0Var) == lrVar) {
                return lrVar;
            }
        } else {
            if (i4 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = gt0Var.n;
            i2 = gt0Var.m;
            i = gt0Var.l;
            ss0 ss0Var3 = gt0Var.k;
            w70Var = gt0Var.j;
            wg0Var2 = gt0Var.i;
            wg0Var = gt0Var.h;
            list = gt0Var.g;
            xe xeVar2 = gt0Var.f;
            y90.V(obj);
            ss0Var = ss0Var3;
            xeVar = xeVar2;
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
            mb1 mb1Var = (mb1) tm.j0(list);
            sb.append((mb1Var == null || (list3 = mb1Var.b) == null) ? null : tm.j0(list3));
            sb.append("\n                            |   last item: ");
            mb1 mb1Var2 = (mb1) tm.p0(list);
            sb.append((mb1Var2 == null || (list2 = mb1Var2.b) == null) ? null : tm.p0(list2));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i2);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(w70Var);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(wg0Var);
            sb.append("\n                        ");
            String string = sb.toString();
            if (wg0Var2 != null) {
                string = string + "|   mediatorLoadStates: " + wg0Var2 + '\n';
            }
            Log.d("Paging", j71.M(string.concat("|)")), null);
        }
        if (z) {
            y6 y6Var = xeVar.e;
            wg0Var.getClass();
            y6Var.K(wg0Var, wg0Var2);
        }
        if (ss0Var.e() == 0 && (w70Var2 = xeVar.b) != null) {
            int i5 = ss0Var.b / 2;
            w70Var2.l(new uf1(i5, i5, ss0Var.c(), ss0Var.d()));
        }
        return uc1.a;
    }

    public final Object b(int i) {
        Object value;
        Object value2;
        e71 e71Var = this.j;
        do {
            value = e71Var.getValue();
            ((Boolean) value).getClass();
        } while (!e71Var.g(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        Object objB = null;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']', null);
        }
        w70 w70Var = this.b;
        if (w70Var != null) {
            w70Var.l(this.d.a(i));
        }
        ss0 ss0Var = this.d;
        if (i < 0) {
            ss0Var.getClass();
        } else if (i < ss0Var.e()) {
            int i2 = i - ss0Var.c;
            if (i2 >= 0 && i2 < ss0Var.b) {
                objB = ss0Var.b(i2);
            }
            Object obj = objB;
            e71 e71Var2 = this.j;
            do {
                value2 = e71Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!e71Var2.g(value2, Boolean.FALSE));
            return obj;
        }
        id.n("Index: ", i, ", Size: ", ss0Var.e());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object c(th1 th1Var, sq sqVar) {
        we weVar;
        int i;
        dt0 dt0Var;
        xe xeVar;
        int iH;
        int iC;
        cf cfVar = this.m;
        af1 af1Var = cfVar.b;
        if (sqVar instanceof we) {
            weVar = (we) sqVar;
            int i2 = weVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                weVar.k = i2 - Integer.MIN_VALUE;
            } else {
                weVar = new we(this, sqVar);
            }
        } else {
            weVar = new we(this, sqVar);
        }
        Object objC0 = weVar.i;
        int i3 = weVar.k;
        try {
            if (i3 == 0) {
                y90.V(objC0);
                if (th1Var instanceof dt0) {
                    dt0Var = (dt0) th1Var;
                    ss0 ss0Var = dt0Var.j;
                    ss0 ss0Var2 = dt0Var.k;
                    if (ss0Var2.e() == 0) {
                        if (ss0Var.e() > 0) {
                            af1Var.n(0, ss0Var.e());
                        }
                    } else if (ss0Var.e() != 0) {
                        cfVar.f.set(ss0Var2);
                        br brVar = cfVar.c;
                        s1 s1Var = new s1(dt0Var, cfVar, (rq) null);
                        weVar.f = this;
                        weVar.g = cfVar;
                        weVar.h = dt0Var;
                        weVar.k = 1;
                        objC0 = th1.c0(brVar, s1Var, weVar);
                        lr lrVar = lr.c;
                        if (objC0 == lrVar) {
                            return lrVar;
                        }
                        xeVar = this;
                    } else if (ss0Var2.e() > 0) {
                        af1Var.c(0, ss0Var2.e());
                    }
                } else if (th1Var instanceof ct0) {
                    ct0 ct0Var = (ct0) th1Var;
                    int i4 = ct0Var.l;
                    int size = ct0Var.j.size();
                    int iMin = Math.min(i4, size);
                    int i5 = i4 - iMin;
                    int i6 = size - iMin;
                    if (iMin > 0) {
                        af1Var.b(null, i5, iMin);
                    }
                    if (i6 > 0) {
                        af1Var.n(0, i6);
                    }
                    int i7 = (ct0Var.k - i4) + iMin;
                    if (i7 > 0) {
                        af1Var.n(0, i7);
                    } else if (i7 < 0) {
                        af1Var.c(0, -i7);
                    }
                } else if (th1Var instanceof zs0) {
                    zs0 zs0Var = (zs0) th1Var;
                    int i8 = zs0Var.j;
                    int i9 = zs0Var.m;
                    int size2 = zs0Var.k.size();
                    int iMin2 = Math.min(i9, size2);
                    int i10 = size2 - iMin2;
                    int i11 = i8 + iMin2;
                    if (iMin2 > 0) {
                        af1Var.b(null, i8, iMin2);
                    }
                    if (i10 > 0) {
                        af1Var.n(i11, i10);
                    }
                    int i12 = zs0Var.l;
                    int i13 = (i12 - i9) + iMin2;
                    int i14 = i8 + size2 + i12;
                    if (i13 > 0) {
                        af1Var.n(i14 - i13, i13);
                    } else if (i13 < 0) {
                        af1Var.c(i14, -i13);
                    }
                } else if (th1Var instanceof bt0) {
                    bt0 bt0Var = (bt0) th1Var;
                    int i15 = bt0Var.l;
                    int i16 = bt0Var.k;
                    int i17 = (i16 - bt0Var.j) - i15;
                    if (i17 > 0) {
                        i = 0;
                        af1Var.n(0, i17);
                    } else {
                        i = 0;
                        if (i17 < 0) {
                            af1Var.c(0, -i17);
                        }
                    }
                    int iMax = Math.max(i, i15 + i17);
                    int i18 = i16 - iMax;
                    if (i18 > 0) {
                        af1Var.b(null, iMax, i18);
                    }
                } else if (th1Var instanceof at0) {
                    at0 at0Var = (at0) th1Var;
                    int i19 = at0Var.j;
                    int i20 = at0Var.l;
                    int i21 = at0Var.m;
                    int i22 = (i20 - at0Var.k) - i21;
                    int i23 = i19 + i20;
                    if (i22 > 0) {
                        af1Var.n(i23 - i22, i22);
                    } else if (i22 < 0) {
                        af1Var.c(i23, -i22);
                    }
                    int iMin3 = (i20 - i21) + (i22 < 0 ? Math.min(i21, -i22) : 0);
                    if (iMin3 > 0) {
                        af1Var.b(null, i19, iMin3);
                    }
                }
                return uc1.a;
            }
            if (i3 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt0Var = weVar.h;
            cfVar = weVar.g;
            xeVar = weVar.f;
            y90.V(objC0);
            ou0 ou0Var = (ou0) objC0;
            cfVar.f.set(null);
            ss0 ss0Var3 = dt0Var.k;
            ss0 ss0Var4 = dt0Var.j;
            af1 af1Var2 = cfVar.b;
            ss0Var3.getClass();
            ou0Var.getClass();
            h7 h7Var = ou0Var.a;
            boolean z = ou0Var.b;
            if (z) {
                kr0 kr0Var = new kr0(ss0Var3, ss0Var4, af1Var2);
                h7Var.d(kr0Var);
                int iMin4 = Math.min(ss0Var3.c, kr0Var.e);
                int i24 = ss0Var4.c - kr0Var.e;
                lu luVar = lu.e;
                if (i24 > 0) {
                    if (iMin4 > 0) {
                        af1Var2.b(luVar, 0, iMin4);
                    }
                    af1Var2.n(0, i24);
                } else if (i24 < 0) {
                    af1Var2.c(0, -i24);
                    int i25 = iMin4 + i24;
                    if (i25 > 0) {
                        af1Var2.b(luVar, 0, i25);
                    }
                }
                kr0Var.e = ss0Var4.c;
                int iMin5 = Math.min(ss0Var3.d, kr0Var.f);
                int i26 = ss0Var4.d;
                int i27 = kr0Var.f;
                int i28 = i26 - i27;
                int i29 = kr0Var.e + kr0Var.g + i27;
                int i30 = i29 - iMin5;
                boolean z2 = i30 != ss0Var3.e() - iMin5;
                if (i28 > 0) {
                    af1Var2.n(i29, i28);
                } else if (i28 < 0) {
                    af1Var2.c(i29 + i28, -i28);
                    iMin5 += i28;
                }
                if (iMin5 > 0 && z2) {
                    af1Var2.b(luVar, i30, iMin5);
                }
                kr0Var.f = ss0Var4.d;
            } else {
                int iMax2 = Math.max(ss0Var3.c, ss0Var4.c);
                int iMin6 = Math.min(ss0Var3.c + ss0Var3.b, ss0Var4.c + ss0Var4.b);
                int i31 = iMin6 - iMax2;
                if (i31 > 0) {
                    af1Var2.c(iMax2, i31);
                    af1Var2.n(iMax2, i31);
                }
                int iMin7 = Math.min(iMax2, iMin6);
                int iMax3 = Math.max(iMax2, iMin6);
                int i32 = ss0Var3.c;
                int iE = ss0Var4.e();
                if (i32 > iE) {
                    i32 = iE;
                }
                int i33 = ss0Var3.c + ss0Var3.b;
                int iE2 = ss0Var4.e();
                if (i33 > iE2) {
                    i33 = iE2;
                }
                int i34 = iMin7 - i32;
                lu luVar2 = lu.c;
                if (i34 > 0) {
                    af1Var2.b(luVar2, i32, i34);
                }
                int i35 = i33 - iMax3;
                if (i35 > 0) {
                    af1Var2.b(luVar2, iMax3, i35);
                }
                int i36 = ss0Var4.c;
                int iE3 = ss0Var3.e();
                if (i36 > iE3) {
                    i36 = iE3;
                }
                int i37 = ss0Var4.c + ss0Var4.b;
                int iE4 = ss0Var3.e();
                if (i37 > iE4) {
                    i37 = iE4;
                }
                int i38 = iMin7 - i36;
                lu luVar3 = lu.d;
                if (i38 > 0) {
                    af1Var2.b(luVar3, i36, i38);
                }
                int i39 = i37 - iMax3;
                if (i39 > 0) {
                    af1Var2.b(luVar3, iMax3, i39);
                }
                int iE5 = ss0Var4.e() - ss0Var3.e();
                if (iE5 > 0) {
                    af1Var2.n(ss0Var3.e(), iE5);
                } else if (iE5 < 0) {
                    af1Var2.c(ss0Var3.e() + iE5, -iE5);
                }
            }
            ss0 ss0Var5 = dt0Var.k;
            int i40 = cfVar.e;
            ss0Var5.getClass();
            if (z) {
                int i41 = i40 - ss0Var5.c;
                int i42 = ss0Var5.b;
                if (i41 >= 0 && i41 < i42) {
                    int i43 = 0;
                    while (true) {
                        if (i43 >= 30) {
                            iH = th1.h(i40, th1.Y(0, ss0Var4.e()));
                            break;
                        }
                        int i44 = ((i43 / 2) * (i43 % 2 == 1 ? -1 : 1)) + i41;
                        if (i44 >= 0 && i44 < ss0Var5.b && (iC = h7Var.c(i44)) != -1) {
                            iH = ss0Var4.c + iC;
                            break;
                        }
                        i43++;
                    }
                } else {
                    iH = th1.h(i40, th1.Y(0, ss0Var4.e()));
                    break;
                }
            } else {
                iH = th1.h(i40, th1.Y(0, ss0Var4.e()));
            }
            cfVar.e = iH;
            xeVar.b(iH);
            return uc1.a;
        } catch (Throwable th) {
            cfVar.f.set(null);
            throw th;
        }
    }
}
