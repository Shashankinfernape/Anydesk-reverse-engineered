package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ks implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ qs e;

    public /* synthetic */ ks(qs qsVar, ArrayList arrayList, int i) {
        this.c = i;
        this.e = qsVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    qs qsVar = this.e;
                    if (i2 >= size) {
                        arrayList.clear();
                        qsVar.m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ps psVar = (ps) obj;
                        hx0 hx0Var = psVar.a;
                        int i3 = psVar.b;
                        int i4 = psVar.c;
                        int i5 = psVar.d;
                        int i6 = psVar.e;
                        qsVar.getClass();
                        View view = hx0Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        qsVar.p.add(hx0Var);
                        viewPropertyAnimatorAnimate.setDuration(qsVar.e).setListener(new ms(qsVar, hx0Var, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    qs qsVar2 = this.e;
                    if (i2 >= size2) {
                        arrayList.clear();
                        qsVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        os osVar = (os) obj2;
                        ArrayList arrayList2 = qsVar2.r;
                        long j = qsVar2.f;
                        hx0 hx0Var2 = osVar.a;
                        View view2 = hx0Var2 == null ? null : hx0Var2.a;
                        hx0 hx0Var3 = osVar.b;
                        View view3 = hx0Var3 != null ? hx0Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(osVar.a);
                            duration.translationX(osVar.e - osVar.c);
                            duration.translationY(osVar.f - osVar.d);
                            duration.alpha(0.0f).setListener(new ns(qsVar2, osVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(osVar.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new ns(qsVar2, osVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                int size3 = arrayList.size();
                while (true) {
                    qs qsVar3 = this.e;
                    if (i2 >= size3) {
                        arrayList.clear();
                        qsVar3.l.remove(arrayList);
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        hx0 hx0Var4 = (hx0) obj3;
                        qsVar3.getClass();
                        View view4 = hx0Var4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        qsVar3.o.add(hx0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(qsVar3.c).setListener(new ls(qsVar3, hx0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
