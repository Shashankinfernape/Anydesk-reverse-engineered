package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ RecyclerView d;

    public /* synthetic */ fw0(RecyclerView recyclerView, int i) {
        this.c = i;
        this.d = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.c;
        RecyclerView recyclerView = this.d;
        switch (i) {
            case 0:
                if (recyclerView.w && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.u) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.z) {
                        recyclerView.p();
                    } else {
                        recyclerView.y = true;
                    }
                    break;
                }
                break;
            default:
                nw0 nw0Var = recyclerView.N;
                if (nw0Var != null) {
                    qs qsVar = (qs) nw0Var;
                    ArrayList arrayList = qsVar.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = qsVar.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = qsVar.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = qsVar.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            hx0 hx0Var = (hx0) obj;
                            View view = hx0Var.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            qsVar.q.add(hx0Var);
                            viewPropertyAnimatorAnimate.setDuration(qsVar.d).alpha(0.0f).setListener(new ls(qsVar, hx0Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            qsVar.m.add(arrayList5);
                            arrayList2.clear();
                            ks ksVar = new ks(qsVar, arrayList5, 0);
                            if (z2) {
                                ksVar.run();
                            } else {
                                View view2 = ((ps) arrayList5.get(0)).a.a;
                                long j = qsVar.d;
                                WeakHashMap weakHashMap = oe1.a;
                                view2.postOnAnimationDelayed(ksVar, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            qsVar.n.add(arrayList6);
                            arrayList3.clear();
                            ks ksVar2 = new ks(qsVar, arrayList6, 1);
                            if (z2) {
                                ksVar2.run();
                            } else {
                                View view3 = ((os) arrayList6.get(0)).a.a;
                                long j2 = qsVar.d;
                                WeakHashMap weakHashMap2 = oe1.a;
                                view3.postOnAnimationDelayed(ksVar2, j2);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            qsVar.l.add(arrayList7);
                            arrayList4.clear();
                            ks ksVar3 = new ks(qsVar, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                ksVar3.run();
                                z = false;
                            } else {
                                long jMax = Math.max(!zIsEmpty2 ? qsVar.e : 0L, zIsEmpty3 ? 0L : qsVar.f) + (!z2 ? qsVar.d : 0L);
                                z = false;
                                View view4 = ((hx0) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = oe1.a;
                                view4.postOnAnimationDelayed(ksVar3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.n0 = z;
                break;
        }
    }
}
