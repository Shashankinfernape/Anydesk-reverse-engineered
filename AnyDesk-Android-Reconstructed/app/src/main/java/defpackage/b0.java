package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbookRosterFragment d;

    public /* synthetic */ b0(AbookRosterFragment abookRosterFragment, int i) {
        this.c = i;
        this.d = abookRosterFragment;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        Object value;
        v1 v1Var;
        RecyclerView recyclerView;
        v1 v1Var2;
        v1 v1VarA;
        RecyclerView recyclerView2;
        List listAsList;
        bf0 bf0Var;
        in inVar;
        int i = this.c;
        AbookRosterFragment abookRosterFragment = this.d;
        switch (i) {
            case 0:
                vg0 vg0Var = (vg0) obj;
                if (vg0Var instanceof tg0) {
                    int iM0 = abookRosterFragment.f0.M0();
                    u1 u1Var = abookRosterFragment.a0;
                    u1Var.getClass();
                    e71 e71Var = u1Var.d;
                    do {
                        v1Var2 = (v1) e71Var.getValue();
                        v1VarA = v1.a(v1Var2, null, false, null, null, null, true, false, v1Var2.g && iM0 >= 400, null, null, 863);
                    } while (!e71Var.g(v1Var2, v1VarA));
                    if (v1VarA.h && (recyclerView2 = abookRosterFragment.e0) != null) {
                        recyclerView2.h0(0);
                        break;
                    }
                } else if (vg0Var instanceof ug0) {
                    u1 u1Var2 = abookRosterFragment.a0;
                    abookRosterFragment.d0.a();
                    u1Var2.getClass();
                    e71 e71Var2 = u1Var2.d;
                    do {
                        v1Var = (v1) e71Var2.getValue();
                    } while (!e71Var2.g(v1Var, v1.a(v1Var, null, false, null, v1Var.d, null, false, false, false, null, null, 789)));
                    if (v1Var.g && (recyclerView = abookRosterFragment.e0) != null) {
                        recyclerView.h0(0);
                        break;
                    }
                } else if (vg0Var instanceof sg0) {
                    u1 u1Var3 = abookRosterFragment.a0;
                    Throwable th = ((sg0) vg0Var).b;
                    u1Var3.getClass();
                    th.getClass();
                    e71 e71Var3 = u1Var3.d;
                    do {
                        value = e71Var3.getValue();
                    } while (!e71Var3.g(value, v1.a((v1) value, null, false, null, px.c, null, false, false, false, th, null, 533)));
                }
                break;
            case 1:
                v1 v1Var3 = (v1) obj;
                boolean z = v1Var3.b;
                View view = abookRosterFragment.g0;
                if (view != null) {
                    if (z) {
                        view.clearAnimation();
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                    } else if (view.getVisibility() == 0 && view.getAlpha() >= 1.0f) {
                        view.animate().alpha(0.0f).setDuration(250L).setListener(new h0(0, view));
                    }
                }
                RecyclerView recyclerView3 = abookRosterFragment.e0;
                if (recyclerView3 != null) {
                    recyclerView3.setDescendantFocusability(!z ? 262144 : 393216);
                    recyclerView3.setFocusable(false);
                }
                boolean z2 = v1Var3.h;
                m0 m0Var = abookRosterFragment.d0;
                if (m0Var != null) {
                    m0Var.k = z2;
                    m0Var.m();
                }
                Set set = v1Var3.d;
                he heVar = new he(1);
                set.getClass();
                if (set.size() <= 1) {
                    listAsList = tm.w0(set);
                } else {
                    Object[] array = set.toArray(new Object[0]);
                    array.getClass();
                    if (array.length > 1) {
                        Arrays.sort(array, heVar);
                    }
                    listAsList = Arrays.asList(array);
                    listAsList.getClass();
                }
                ArrayList arrayList = new ArrayList(vm.c0(listAsList, 10));
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n81((String) it.next(), true));
                }
                boolean zIsEmpty = arrayList.isEmpty();
                RecyclerView recyclerView4 = abookRosterFragment.k0;
                if (!zIsEmpty) {
                    recyclerView4.setVisibility(0);
                    m81 m81Var = abookRosterFragment.l0;
                    m81Var.d = arrayList;
                    m81Var.d();
                    abookRosterFragment.l0.e = new d0(abookRosterFragment);
                } else {
                    recyclerView4.setVisibility(8);
                }
                break;
            case 2:
                vs0 vs0Var = (vs0) obj;
                m0 m0Var2 = abookRosterFragment.d0;
                m50 m50VarH0 = abookRosterFragment.h0();
                m50VarH0.c();
                if0 if0Var = m50VarH0.f;
                m0Var2.getClass();
                if0Var.getClass();
                vs0Var.getClass();
                cf cfVar = m0Var2.e;
                cfVar.getClass();
                int iIncrementAndGet = cfVar.h.incrementAndGet();
                af1 af1Var = if0Var.a;
                while (true) {
                    bf0Var = (bf0) ((AtomicReference) af1Var.d).get();
                    if (bf0Var == null) {
                        br y71Var = new y71(null);
                        us usVar = su.a;
                        o70 o70Var = li0.a.g;
                        o70Var.getClass();
                        kx kxVar = kx.c;
                        if (o70Var != kxVar) {
                            br brVarQ = y71Var.q(o70Var.getKey());
                            if (brVarQ == kxVar) {
                                y71Var = o70Var;
                            } else {
                                fw fwVar = fw.d;
                                dr drVar = (dr) brVarQ.l(fwVar);
                                if (drVar == null) {
                                    inVar = new in(brVarQ, o70Var);
                                } else {
                                    br brVarQ2 = brVarQ.q(fwVar);
                                    if (brVarQ2 == kxVar) {
                                        y71Var = new in(o70Var, drVar);
                                    } else {
                                        inVar = new in(new in(brVarQ2, o70Var), drVar);
                                    }
                                }
                                y71Var = inVar;
                            }
                        }
                        bf0 bf0Var2 = new bf0(if0Var, y71Var);
                        AtomicReference atomicReference = (AtomicReference) af1Var.d;
                        do {
                            if (atomicReference.compareAndSet(null, bf0Var2)) {
                                us usVar2 = su.a;
                                th1.B(bf0Var2, li0.a.g, null, new s1(bf0Var2, (rq) null, 2), 2);
                                bf0Var = bf0Var2;
                            }
                        } while (atomicReference.get() == null);
                    }
                }
                th1.B(bf0Var, null, null, new bf(cfVar, iIncrementAndGet, vs0Var, null), 3);
                break;
            default:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    u1 u1Var4 = abookRosterFragment.a0;
                    u1Var4.e(false);
                }
                break;
        }
    }
}
