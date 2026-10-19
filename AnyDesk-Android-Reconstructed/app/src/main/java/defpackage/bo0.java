package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 {
    public final Context a;
    public final mn0 b = new mn0(this, new fn0(this, 0));
    public final yg c;
    public final Activity d;
    public boolean e;
    public final l40 f;
    public final boolean g;
    public final g81 h;

    /* JADX WARN: Multi-variable type inference failed */
    public bo0(Context context) {
        this.a = context;
        this.c = new yg(context, 0 == true ? 1 : 0);
        for (Object obj : h11.c0(context, new a0(8))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new l40(2, this);
                this.g = true;
                gp0 gp0Var = this.b.r;
                gp0Var.a(new zn0(gp0Var));
                this.b.r.a(new f6(this.a));
                this.h = new g81(new fn0(this, 1));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new l40(2, this);
        this.g = true;
        gp0 gp0Var2 = this.b.r;
        gp0Var2.a(new zn0(gp0Var2));
        this.b.r.a(new f6(this.a));
        this.h = new g81(new fn0(this, 1));
    }

    public final void a(hn0 hn0Var) {
        mn0 mn0Var = this.b;
        mn0Var.getClass();
        mn0Var.o.add(hn0Var);
        qd qdVar = mn0Var.f;
        if (qdVar.isEmpty()) {
            return;
        }
        an0 an0Var = (an0) qdVar.last();
        hn0Var.m(mn0Var.a, an0Var.d, an0Var.j.b());
    }

    public final int b() {
        qd qdVar = this.b.f;
        int i = 0;
        if (qdVar != null && qdVar.isEmpty()) {
            return 0;
        }
        Iterator it = qdVar.iterator();
        while (it.hasNext()) {
            if (!(((an0) it.next()).d instanceof xn0) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void c(int i, Bundle bundle) {
        int i2;
        eo0 eo0Var;
        Bundle bundleG;
        mn0 mn0Var = this.b;
        vn0 vn0Var = mn0Var.f.isEmpty() ? mn0Var.c : ((an0) mn0Var.f.last()).d;
        if (vn0Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        ym0 ym0VarC = vn0Var.c(i);
        if (ym0VarC != null) {
            eo0Var = ym0VarC.b;
            i2 = ym0VarC.a;
            Bundle bundle2 = ym0VarC.c;
            if (bundle2 != null) {
                bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                bundleG.putAll(bundle2);
            } else {
                bundleG = null;
            }
        } else {
            i2 = i;
            eo0Var = null;
            bundleG = null;
        }
        if (bundle != null) {
            if (bundleG == null) {
                bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
            }
            bundleG.putAll(bundle);
        }
        if (i2 == 0 && eo0Var != null) {
            boolean z = eo0Var.d;
            int i3 = eo0Var.c;
            if (i3 != -1) {
                if (i3 == -1 || !mn0Var.l(i3, z, false)) {
                    return;
                }
                mn0Var.b();
                return;
            }
        }
        if (i2 == 0) {
            id.q("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        vn0 vn0VarC = mn0Var.c(i2, null);
        if (vn0VarC != null) {
            mn0Var.k(vn0VarC, bundleG, eo0Var);
            return;
        }
        int i4 = vn0.h;
        yg ygVar = this.c;
        String strQ = ec1.q(ygVar, i2);
        if (ym0VarC == null) {
            nh0.k("Navigation action/destination ", strQ, " cannot be found from the current destination ", vn0Var);
            return;
        }
        StringBuilder sbN = q51.n("Navigation destination ", strQ, " referenced from action ");
        sbN.append(ec1.q(ygVar, i));
        sbN.append(" cannot be found from the current destination ");
        sbN.append(vn0Var);
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final boolean d() {
        Bundle bundleA;
        Intent intent;
        int iB = b();
        mn0 mn0Var = this.b;
        int i = 0;
        if (iB != 1) {
            if (!mn0Var.f.isEmpty()) {
                vn0 vn0VarF = mn0Var.f();
                vn0VarF.getClass();
                if (mn0Var.l(vn0VarF.d.a, true, false) && mn0Var.b()) {
                    return true;
                }
            }
            return false;
        }
        Activity activity = this.d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            vn0 vn0VarF2 = mn0Var.f();
            vn0VarF2.getClass();
            int i2 = vn0VarF2.d.a;
            for (xn0 xn0Var = vn0VarF2.e; xn0Var != null; xn0Var = xn0Var.e) {
                m7 m7Var = xn0Var.d;
                if (xn0Var.i.c != i2) {
                    Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        xn0 xn0VarI = mn0Var.i();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        un0 un0VarI = xn0VarI.i(new y6(intent3.getData(), intent3.getAction(), intent3.getType(), 21), xn0VarI);
                        if ((un0VarI != null ? un0VarI.d : null) != null && (bundleA = un0VarI.c.a(un0VarI.d)) != null) {
                            bundleG.putAll(bundleA);
                        }
                    }
                    gi giVar = new gi(this);
                    int i3 = m7Var.a;
                    ArrayList arrayList = (ArrayList) giVar.e;
                    arrayList.clear();
                    arrayList.add(new tn0(i3, null));
                    if (((xn0) giVar.d) != null) {
                        giVar.l();
                    }
                    ((Intent) giVar.c).putExtra("android-support-nav:controller:deepLinkExtras", bundleG);
                    giVar.a().b();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i2 = m7Var.a;
            }
        } else if (this.e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray.getClass();
            ArrayList arrayList2 = new ArrayList(intArray.length);
            for (int i4 : intArray) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() >= 2) {
                int iIntValue = ((Number) zm.g0(arrayList2)).intValue();
                if (parcelableArrayList != null) {
                }
                vn0 vn0VarD = mn0.d(iIntValue, mn0Var.g(), null, false);
                if (vn0VarD instanceof xn0) {
                    int i5 = xn0.j;
                    iIntValue = th1.q((xn0) vn0VarD).d.a;
                }
                vn0 vn0VarF3 = mn0Var.f();
                if (vn0VarF3 != null && iIntValue == vn0VarF3.d.a) {
                    gi giVar2 = new gi(this);
                    Bundle bundleG2 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    bundleG2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleG2.putAll(bundle);
                    }
                    ((Intent) giVar2.c).putExtra("android-support-nav:controller:deepLinkExtras", bundleG2);
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        int i7 = i + 1;
                        if (i < 0) {
                            um.b0();
                            throw null;
                        }
                        ((ArrayList) giVar2.e).add(new tn0(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                        if (((xn0) giVar2.d) != null) {
                            giVar2.l();
                        }
                        i = i7;
                    }
                    giVar2.a().b();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }
}
