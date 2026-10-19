package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements o50 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.o50
    public final Object a() throws Throwable {
        v1 v1Var;
        v1 v1VarA;
        h1 g1Var;
        Throwable th;
        Bundle bundle;
        if0 if0VarR;
        int i = this.c;
        int i2 = 0;
        uc1 uc1Var = uc1.a;
        Throwable th2 = null;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((AbookRosterFragment) obj).O0();
                return uc1Var;
            case 1:
                ((m0) obj).m();
                return uc1Var;
            case 2:
                u1 u1Var = (u1) obj;
                e71 e71Var = u1Var.d;
                do {
                    v1Var = (v1) e71Var.getValue();
                    v1VarA = v1.a(v1Var, null, false, null, null, null, false, false, false, null, null, 767);
                } while (!e71Var.g(v1Var, v1VarA));
                Long l = v1VarA.a;
                fw fwVar = u1Var.b;
                if (l != null) {
                    long jLongValue = l.longValue();
                    String str = v1VarA.c;
                    Set set = v1VarA.d;
                    boolean z = v1VarA.g;
                    fwVar.getClass();
                    set.getClass();
                    g1Var = new q1(jLongValue, str, set, z);
                } else {
                    fwVar.getClass();
                    g1Var = new g1();
                }
                u1Var.f = g1Var;
                return g1Var;
            case 3:
                ((gr) obj).m = null;
                return uc1Var;
            case 4:
                dn0 dn0Var = ((an0) obj).j;
                if (!dn0Var.b) {
                    nh0.j("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                } else if (((if0) dn0Var.l).d != af0.c) {
                    af1 af1VarM = us0.m((an0) dn0Var.c, (ze1) ((g81) dn0Var.m).getValue());
                    fm fmVarA = nx0.a(cn0.class);
                    ah ahVar = (ah) af1VarM.d;
                    String strU = y90.u(fmVarA);
                    if (strU != null) {
                        return ((cn0) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU))).b;
                    }
                    id.q("Local and anonymous classes can not be ViewModels");
                } else {
                    nh0.j("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return null;
            case 5:
                return new sn0((String) obj, null, null);
            case 6:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context contextA0 = navHostFragment.a0();
                if (contextA0 != null) {
                    bo0 bo0Var = new bo0(contextA0);
                    mn0 mn0Var = bo0Var.b;
                    x40 x40Var = mn0Var.q;
                    gp0 gp0Var = mn0Var.r;
                    gf0 gf0Var = mn0Var.m;
                    if (navHostFragment != gf0Var) {
                        if (gf0Var != null && (if0VarR = gf0Var.R()) != null) {
                            if0VarR.f(x40Var);
                        }
                        mn0Var.m = navHostFragment;
                        navHostFragment.Q.a(x40Var);
                    }
                    bf1 bf1VarK = navHostFragment.K();
                    if (!y90.e(mn0Var.n, r71.w(bf1VarK))) {
                        if (mn0Var.f.isEmpty()) {
                            mn0Var.n = r71.w(bf1VarK);
                        } else {
                            nh0.j("ViewModelStore should be set before setGraph call");
                        }
                    }
                    Context contextI0 = navHostFragment.I0();
                    t40 t40VarZ = navHostFragment.Z();
                    t40VarZ.getClass();
                    gp0Var.a(new cu(contextI0, t40VarZ));
                    Context contextI1 = navHostFragment.I0();
                    t40 t40VarZ2 = navHostFragment.Z();
                    t40VarZ2.getClass();
                    int i3 = navHostFragment.y;
                    if (i3 == 0 || i3 == -1) {
                        i3 = R.id.nav_host_fragment_container;
                    }
                    gp0Var.a(new b50(contextI1, t40VarZ2, i3));
                    Bundle bundleG = ((ui0) navHostFragment.U.d).g("android-support-nav:fragment:navControllerState");
                    if (bundleG != null) {
                        bundleG.setClassLoader(contextA0.getClassLoader());
                        LinkedHashMap linkedHashMap = mn0Var.l;
                        if (bundleG.containsKey("android-support-nav:controller:navigatorState")) {
                            bundle = bundleG.getBundle("android-support-nav:controller:navigatorState");
                            if (bundle == null) {
                                bu0.u("android-support-nav:controller:navigatorState");
                                throw null;
                            }
                        } else {
                            bundle = null;
                        }
                        mn0Var.d = bundle;
                        mn0Var.e = bundleG.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) lk0.y("android-support-nav:controller:backStack", bundleG).toArray(new Bundle[0]) : null;
                        linkedHashMap.clear();
                        if (bundleG.containsKey("android-support-nav:controller:backStackDestIds") && bundleG.containsKey("android-support-nav:controller:backStackIds")) {
                            int[] intArray = bundleG.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray == null) {
                                bu0.u("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                            ArrayList<String> stringArrayList = bundleG.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList == null) {
                                bu0.u("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                            int length = intArray.length;
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < length) {
                                int i6 = i5 + 1;
                                Throwable th3 = th2;
                                mn0Var.k.put(Integer.valueOf(intArray[i4]), !y90.e(stringArrayList.get(i5), "") ? (String) stringArrayList.get(i5) : th3);
                                i4++;
                                i5 = i6;
                                th2 = th3;
                            }
                        }
                        th = th2;
                        if (bundleG.containsKey("android-support-nav:controller:backStackStates")) {
                            ArrayList<String> stringArrayList2 = bundleG.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 == null) {
                                bu0.u("android-support-nav:controller:backStackStates");
                                throw th;
                            }
                            int size = stringArrayList2.size();
                            int i7 = 0;
                            while (i7 < size) {
                                String str2 = stringArrayList2.get(i7);
                                i7++;
                                String str3 = str2;
                                if (bundleG.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                    ArrayList arrayListY = lk0.y("android-support-nav:controller:backStackStates:" + str3, bundleG);
                                    qd qdVar = new qd(arrayListY.size());
                                    int size2 = arrayListY.size();
                                    int i8 = 0;
                                    while (i8 < size2) {
                                        Object obj2 = arrayListY.get(i8);
                                        i8++;
                                        qdVar.addLast(new en0((Bundle) obj2));
                                    }
                                    linkedHashMap.put(str3, qdVar);
                                }
                            }
                        }
                        boolean z2 = bundleG.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                        Boolean boolValueOf = (z2 || !bundleG.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z2) : th;
                        bo0Var.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                    } else {
                        th = null;
                    }
                    ((ui0) navHostFragment.U.d).s("android-support-nav:fragment:navControllerState", new k40(1, bo0Var));
                    Bundle bundleG2 = ((ui0) navHostFragment.U.d).g("android-support-nav:fragment:graphId");
                    if (bundleG2 != null) {
                        navHostFragment.b0 = bundleG2.getInt("android-support-nav:fragment:graphId");
                    }
                    ((ui0) navHostFragment.U.d).s("android-support-nav:fragment:graphId", new k40(2, navHostFragment));
                    int i9 = navHostFragment.b0;
                    g81 g81Var = bo0Var.h;
                    if (i9 != 0) {
                        mn0Var.q(((co0) g81Var.getValue()).b(i9), th);
                    } else {
                        Bundle bundle2 = navHostFragment.h;
                        int i10 = bundle2 != null ? bundle2.getInt("android-support-nav:fragment:graphId") : 0;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                        if (i10 != 0) {
                            mn0Var.q(((co0) g81Var.getValue()).b(i10), bundle3);
                        }
                    }
                    return bo0Var;
                }
                nh0.j("NavController cannot be created before the fragment is attached");
                return null;
            case 7:
                return lk0.x((cf1) obj);
            case 8:
                g01 g01Var = (g01) obj;
                g01Var.R().a(new ew0(i2, g01Var));
                return uc1Var;
            default:
                return obj;
        }
    }
}
