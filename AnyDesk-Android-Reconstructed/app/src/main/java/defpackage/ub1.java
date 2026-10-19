package defpackage;

import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub1 {
    public static final pf a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        pf pfVar = new pf();
        pfVar.C = new ArrayList();
        pfVar.F = false;
        pfVar.G = 0;
        pfVar.D = false;
        pfVar.I(new ny(2));
        pfVar.I(new dk());
        pfVar.I(new ny(1));
        a = pfVar;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, qb1 qb1Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (qb1Var == null) {
            qb1Var = a;
        }
        qb1 qb1VarClone = qb1Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((qb1) obj).w(viewGroup);
            }
        }
        qb1VarClone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            id.c();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        tb1 tb1Var = new tb1();
        tb1Var.c = qb1VarClone;
        tb1Var.d = viewGroup;
        viewGroup.addOnAttachStateChangeListener(tb1Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(tb1Var);
    }

    public static xd b() {
        xd xdVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (xdVar = (xd) weakReference.get()) != null) {
            return xdVar;
        }
        xd xdVar2 = new xd(0);
        threadLocal.set(new WeakReference(xdVar2));
        return xdVar2;
    }
}
