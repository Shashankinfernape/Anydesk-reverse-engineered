package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.adcontrol.AdDeviceAdminReceiver;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.dex.DexManager;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yw0 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Cloneable e;
    public final Object f;
    public Object g;
    public Object h;

    public yw0(Context context) {
        int aPILevel;
        this.c = new Logging("SamsungHelper");
        this.g = null;
        this.h = null;
        this.b = 1;
        this.d = context;
        this.e = new ComponentName(context, (Class<?>) AdDeviceAdminReceiver.class);
        this.f = (DevicePolicyManager) context.getSystemService("device_policy");
        try {
            aPILevel = EnterpriseDeviceManager.getAPILevel();
        } catch (Throwable unused) {
            aPILevel = 0;
        }
        this.a = aPILevel;
        ((Logging) this.c).e("KNOX API level " + aPILevel);
    }

    public synchronized void a() {
        if (this.a > 0) {
            ((Logging) this.c).e("activating license for KNOX API level " + this.a);
            String str = (String) this.g;
            if (str == null) {
                this.b = 2;
                ((Logging) this.c).e("deferring license activation");
                return;
            }
            try {
                if (this.a > 5) {
                    ((Logging) this.c).e("activating license");
                    KnoxEnterpriseLicenseManager.getInstance((Context) this.d).activateLicense(str, ((Context) this.d).getPackageName());
                } else {
                    b();
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                ((Logging) this.c).a("failed to activate license: " + message);
            }
        }
    }

    public void b() {
        Context context = (Context) this.d;
        int i = this.a;
        Logging logging = (Logging) this.c;
        if (i > 0) {
            logging.e("activating support license for KNOX API level " + i);
            String str = (String) this.h;
            if (str == null) {
                logging.a("no support license key available");
                return;
            }
            if (i <= 21) {
                try {
                    logging.e("activating legacy license");
                    EnterpriseLicenseManager enterpriseLicenseManager = EnterpriseLicenseManager.getInstance(context);
                    if (i < 11) {
                        enterpriseLicenseManager.activateLicense(str);
                    } else {
                        enterpriseLicenseManager.activateLicense(str, context.getPackageName());
                    }
                } catch (Throwable th) {
                    logging.a("failed to activate license: " + th.getMessage());
                }
            }
        }
    }

    public void c(hx0 hx0Var, boolean z) {
        RecyclerView.l(hx0Var);
        View view = hx0Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        jx0 jx0Var = recyclerView.o0;
        if (jx0Var != null) {
            ix0 ix0Var = jx0Var.e;
            oe1.n(view, ix0Var != null ? (o3) ix0Var.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.q;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                id.c();
                return;
            }
            iw0 iw0Var = recyclerView.o;
            if (iw0Var != null) {
                iw0Var.g(hx0Var);
            }
            if (recyclerView.h0 != null) {
                recyclerView.i.v(hx0Var);
            }
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + hx0Var);
            }
        }
        hx0Var.s = null;
        hx0Var.r = null;
        xw0 xw0VarF = f();
        xw0VarF.getClass();
        int i = hx0Var.f;
        ArrayList arrayList2 = xw0VarF.a(i).a;
        if (((ww0) xw0VarF.a.get(i)).b <= arrayList2.size()) {
            lk0.g(view);
        } else if (RecyclerView.C0 && arrayList2.contains(hx0Var)) {
            id.q("this scrap item already exists");
        } else {
            hx0Var.n();
            arrayList2.add(hx0Var);
        }
    }

    public int d(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        dx0 dx0Var = recyclerView.h0;
        if (i >= 0 && i < dx0Var.b()) {
            return !dx0Var.g ? i : recyclerView.g.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + dx0Var.b() + recyclerView.B());
    }

    public synchronized void e() {
        int i = this.a;
        if (i > 0) {
            String str = (String) this.g;
            if (str == null) {
                this.b = 3;
                ((Logging) this.c).e("deferring license deactivation");
                return;
            }
            try {
                if (i > 5) {
                    ((Logging) this.c).e("deactivating license");
                    KnoxEnterpriseLicenseManager.getInstance((Context) this.d).deActivateLicense(str);
                } else {
                    ((Logging) this.c).a("failed to deactivate license: no api available");
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                ((Logging) this.c).a("failed to deactivate license: " + message);
            }
        }
    }

    public xw0 f() {
        if (((xw0) this.g) == null) {
            xw0 xw0Var = new xw0();
            xw0Var.a = new SparseArray();
            xw0Var.b = 0;
            xw0Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = xw0Var;
            h();
        }
        return (xw0) this.g;
    }

    public boolean g() {
        DexManager dexManager;
        if (this.a < 25) {
            return false;
        }
        try {
            EnterpriseDeviceManager enterpriseDeviceManager = EnterpriseDeviceManager.getInstance((Context) this.d);
            if (enterpriseDeviceManager != null && (dexManager = enterpriseDeviceManager.getDexManager()) != null) {
                return dexManager.isDexActivated();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void h() {
        RecyclerView recyclerView;
        iw0 iw0Var;
        xw0 xw0Var = (xw0) this.g;
        if (xw0Var == null || (iw0Var = (recyclerView = (RecyclerView) this.h).o) == null || !recyclerView.u) {
            return;
        }
        xw0Var.c.add(iw0Var);
    }

    public void i(iw0 iw0Var, boolean z) {
        xw0 xw0Var = (xw0) this.g;
        if (xw0Var != null) {
            SparseArray sparseArray = xw0Var.a;
            Set set = xw0Var.c;
            set.remove(iw0Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((ww0) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    lk0.g(((hx0) arrayList.get(i2)).a);
                }
            }
        }
    }

    public synchronized void j() {
        try {
            if (((String) this.g) != null && ((String) this.h) != null) {
                int i = this.b;
                if (i == 2) {
                    a();
                } else if (i == 3) {
                    e();
                }
                this.b = 1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l(size);
        }
        arrayList.clear();
        if (RecyclerView.H0) {
            p60 p60Var = ((RecyclerView) this.h).g0;
            int[] iArr = p60Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            p60Var.d = 0;
        }
    }

    public void l(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (RecyclerView.D0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        hx0 hx0Var = (hx0) arrayList.get(i);
        if (RecyclerView.D0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + hx0Var);
        }
        c(hx0Var, true);
        arrayList.remove(i);
    }

    public void m(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        hx0 hx0VarM = RecyclerView.M(view);
        if (hx0VarM.k()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (hx0VarM.j()) {
            hx0VarM.n.r(hx0VarM);
        } else if (hx0VarM.q()) {
            hx0VarM.j &= -33;
        }
        n(hx0VarM);
        if (recyclerView.N == null || hx0VarM.h()) {
            return;
        }
        recyclerView.N.d(hx0VarM);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3 A[LOOP:2: B:51:0x00a8->B:55:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b6 A[EDGE_INSN: B:83:0x00b6->B:56:0x00b6 BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b6 A[EDGE_INSN: B:84:0x00b6->B:56:0x00b6 BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b0, LOOP_LABEL: LOOP:1: B:47:0x0095->B:54:0x00b0], SYNTHETIC] */
    public void n(hx0 hx0Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        p60 p60Var = recyclerView.g0;
        boolean zJ = hx0Var.j();
        View view = hx0Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zJ || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(hx0Var.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (hx0Var.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(hx0Var);
            nh0.n(sb2, recyclerView.B());
            return;
        }
        if (hx0Var.p()) {
            id.q("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.B()));
            return;
        }
        if ((hx0Var.j & 16) == 0) {
            WeakHashMap weakHashMap = oe1.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (RecyclerView.C0 && arrayList.contains(hx0Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(hx0Var);
            nh0.n(sb3, recyclerView.B());
            return;
        }
        if (hx0Var.h()) {
            if (this.b <= 0 || (hx0Var.j & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.b && size > 0) {
                    l(0);
                    size--;
                }
                if (RecyclerView.H0 && size > 0) {
                    int i5 = hx0Var.c;
                    if (p60Var.c != null) {
                        int i6 = p60Var.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((hx0) arrayList.get(i)).c;
                                    if (p60Var.c != null) {
                                        break;
                                    }
                                    i3 = p60Var.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (p60Var.c[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (p60Var.c[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((hx0) arrayList.get(i)).c;
                            if (p60Var.c != null) {
                                break;
                                break;
                            }
                            i3 = p60Var.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (p60Var.c[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, hx0Var);
                z2 = true;
            }
            if (z2) {
                z3 = z2;
            } else {
                c(hx0Var, true);
                z3 = z2;
            }
            recyclerView.i.v(hx0Var);
            if (z3 && !z4 && z) {
                lk0.g(view);
                hx0Var.s = null;
                hx0Var.r = null;
                return;
            }
            return;
        }
        if (RecyclerView.D0) {
            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.B()));
        }
        z4 = false;
        recyclerView.i.v(hx0Var);
        if (z3) {
        }
    }

    public void o(View view) {
        nw0 nw0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        hx0 hx0VarM = RecyclerView.M(view);
        if ((hx0VarM.j & 12) == 0 && hx0VarM.l() && (nw0Var = recyclerView.N) != null) {
            qs qsVar = (qs) nw0Var;
            if (hx0VarM.d().isEmpty() && qsVar.g && !hx0VarM.g()) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                hx0VarM.n = this;
                hx0VarM.o = true;
                ((ArrayList) this.d).add(hx0VarM);
                return;
            }
        }
        if (hx0VarM.g() && !hx0VarM.i() && !recyclerView.o.b) {
            id.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
            return;
        }
        hx0VarM.n = this;
        hx0VarM.o = false;
        ((ArrayList) this.c).add(hx0VarM);
    }

    public synchronized void p(String str) {
        this.h = str;
        j();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01df  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x022d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239  */
    /* JADX WARN: Code duplicated, block: B:137:0x0257  */
    /* JADX WARN: Code duplicated, block: B:138:0x0259  */
    /* JADX WARN: Code duplicated, block: B:141:0x0266  */
    /* JADX WARN: Code duplicated, block: B:195:0x037a A[EDGE_INSN: B:195:0x037a->B:196:0x037b BREAK  A[LOOP:3: B:190:0x0362->B:194:0x0377]] */
    /* JADX WARN: Code duplicated, block: B:237:0x044e  */
    /* JADX WARN: Code duplicated, block: B:244:0x045e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0466  */
    /* JADX WARN: Code duplicated, block: B:252:0x0489  */
    /* JADX WARN: Code duplicated, block: B:254:0x048f  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:271:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:278:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:281:0x0507  */
    /* JADX WARN: Code duplicated, block: B:282:0x0509  */
    /* JADX WARN: Code duplicated, block: B:284:0x050c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0512  */
    /* JADX WARN: Code duplicated, block: B:289:0x0526  */
    /* JADX WARN: Code duplicated, block: B:290:0x053c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0544  */
    /* JADX WARN: Code duplicated, block: B:295:0x054a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0587  */
    /* JADX WARN: Code duplicated, block: B:308:0x059e  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:313:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:320:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:323:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:344:0x061f  */
    /* JADX WARN: Code duplicated, block: B:347:0x0624  */
    /* JADX WARN: Code duplicated, block: B:351:0x062d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0637  */
    /* JADX WARN: Code duplicated, block: B:354:0x063d  */
    /* JADX WARN: Code duplicated, block: B:355:0x0647  */
    /* JADX WARN: Code duplicated, block: B:358:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x0651  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[EDGE_INSN: B:36:0x0094->B:37:0x0098 BREAK  A[LOOP:0: B:14:0x002f->B:20:0x004e]] */
    /* JADX WARN: Code duplicated, block: B:372:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a A[EDGE_INSN: B:81:0x014a->B:101:0x01bd BREAK  A[LOOP:1: B:44:0x00aa->B:56:0x00d6]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:84:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
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
    public hx0 q(int i, long j) {
        View view;
        hx0 hx0Var;
        boolean z;
        View view2;
        hx0 hx0Var2;
        hx0 hx0Var3;
        hx0 hx0VarF;
        long j2;
        View view3;
        int iG;
        int i2;
        boolean z2;
        iw0 iw0Var;
        boolean z3;
        long nanoTime;
        long j3;
        AccessibilityManager accessibilityManager;
        boolean z4;
        o3 o3Var;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j4;
        ViewGroup.LayoutParams layoutParams2;
        sw0 sw0Var;
        boolean z5;
        int i3;
        int iG2;
        String str;
        hx0 hx0Var4;
        String str2;
        RecyclerView recyclerViewG;
        hx0 hx0Var5;
        hx0 hx0Var6;
        hx0 hx0Var7;
        int size;
        int i4;
        ArrayList arrayList2;
        int size2;
        int i5;
        View view4;
        hx0 hx0Var8;
        View view5;
        int size3;
        int i6;
        hx0 hx0Var9;
        hx0 hx0Var10;
        hx0 hx0VarM;
        ol olVar;
        aa aaVar;
        int iIndexOfChild;
        aa aaVar2;
        int iIndexOfChild2;
        int iC;
        hx0 hx0VarM2;
        View view6;
        hx0 hx0Var11;
        int i7;
        boolean z6;
        hx0 hx0Var12;
        int size4;
        int iG3;
        ArrayList arrayList3 = (ArrayList) this.c;
        ArrayList arrayList4 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        dx0 dx0Var = recyclerView.h0;
        if (i < 0 || i >= dx0Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + dx0Var.b() + recyclerView.B());
        }
        if (dx0Var.g) {
            ArrayList arrayList5 = (ArrayList) this.d;
            if (arrayList5 != null && (size4 = arrayList5.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        if (recyclerView.o.b && (iG3 = recyclerView.g.g(i, 0)) > 0 && iG3 < recyclerView.o.a()) {
                            long jB = recyclerView.o.b(iG3);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size4) {
                                    view = null;
                                    hx0Var = null;
                                    break;
                                }
                                hx0 hx0Var13 = (hx0) ((ArrayList) this.d).get(i9);
                                if (!hx0Var13.q()) {
                                    view = null;
                                    if (hx0Var13.e == jB) {
                                        hx0Var13.a(32);
                                        hx0Var = hx0Var13;
                                        break;
                                    }
                                }
                                i9++;
                            }
                        } else {
                            view = null;
                            hx0Var = null;
                            break;
                        }
                    } else {
                        hx0 hx0Var14 = (hx0) ((ArrayList) this.d).get(i8);
                        if (!hx0Var14.q() && hx0Var14.c() == i) {
                            hx0Var14.a(32);
                            view = null;
                            hx0Var = hx0Var14;
                            break;
                        }
                        i8++;
                    }
                }
            } else {
                view = null;
                hx0Var = null;
                break;
            }
            if (hx0Var != null) {
                z = true;
                hx0Var2 = hx0Var;
                view2 = view;
            }
            String str3 = "RecyclerView";
            if (hx0Var2 == null) {
                size = arrayList3.size();
                i4 = 0;
                while (true) {
                    if (i4 < size) {
                        arrayList2 = recyclerView.h.c;
                        size2 = arrayList2.size();
                        i5 = 0;
                        view4 = view2;
                        while (true) {
                            if (i5 < size2) {
                                hx0Var8 = view4;
                                view5 = view4;
                                break;
                            }
                            View view7 = (View) arrayList2.get(i5);
                            hx0VarM2 = RecyclerView.M(view7);
                            view6 = view4;
                            if (hx0VarM2.c() != i && !hx0VarM2.g() && !hx0VarM2.i()) {
                                view5 = view7;
                                hx0Var8 = view6;
                                break;
                            }
                            i5++;
                            view4 = view6;
                        }
                        if (view5 != null) {
                            size3 = arrayList4.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size3) {
                                    hx0Var9 = hx0Var8;
                                    hx0Var11 = hx0Var8;
                                    break;
                                }
                                hx0Var10 = (hx0) arrayList4.get(i6);
                                if (hx0Var10.g() && hx0Var10.c() == i && !hx0Var10.e()) {
                                    arrayList4.remove(i6);
                                    hx0Var9 = hx0Var10;
                                    hx0Var11 = hx0Var8;
                                    if (!RecyclerView.D0) {
                                        break;
                                    }
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + hx0Var10);
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            hx0VarM = RecyclerView.M(view5);
                            olVar = recyclerView.h;
                            aaVar = olVar.b;
                            iIndexOfChild = olVar.a.c.indexOfChild(view5);
                            if (iIndexOfChild >= 0) {
                                id.p(view5, "view is not a child, cannot hide ");
                                return hx0Var8;
                            }
                            if (aaVar.e(iIndexOfChild)) {
                                nh0.p(view5, "trying to unhide a view that was not hidden");
                                return hx0Var8;
                            }
                            aaVar.b(iIndexOfChild);
                            olVar.j(view5);
                            ol olVar2 = recyclerView.h;
                            aaVar2 = olVar2.b;
                            iIndexOfChild2 = olVar2.a.c.indexOfChild(view5);
                            if (iIndexOfChild2 == -1 && !aaVar2.e(iIndexOfChild2)) {
                                iC = iIndexOfChild2 - aaVar2.c(iIndexOfChild2);
                            } else {
                                iC = -1;
                            }
                            if (iC != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(hx0VarM);
                                nh0.s(sb, recyclerView.B());
                                return hx0Var8;
                            }
                            recyclerView.h.c(iC);
                            o(view5);
                            hx0VarM.a(8224);
                            hx0Var9 = hx0VarM;
                            break;
                        }
                    } else {
                        hx0Var12 = (hx0) arrayList3.get(i4);
                        if (hx0Var12.q() && hx0Var12.c() == i && !hx0Var12.g() && (dx0Var.g || !hx0Var12.i())) {
                            hx0Var12.a(32);
                            hx0Var11 = view2;
                            hx0Var9 = hx0Var12;
                            break;
                        }
                        i4++;
                    }
                }
                if (hx0Var9 != null) {
                    hx0Var9 = hx0Var10;
                    hx0Var11 = hx0Var8;
                    hx0Var11 = hx0Var8;
                    if (hx0Var9.i()) {
                        i7 = hx0Var9.c;
                        if (i7 >= 0 || i7 >= recyclerView.o.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + hx0Var9 + recyclerView.B());
                        }
                        if (dx0Var.g || recyclerView.o.c(hx0Var9.c) == hx0Var9.f) {
                            iw0 iw0Var2 = recyclerView.o;
                            if (!iw0Var2.b || hx0Var9.e == iw0Var2.b(hx0Var9.c)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            z6 = false;
                        }
                    } else {
                        if (!RecyclerView.C0 && !dx0Var.g) {
                            nh0.j("should not receive a removed view unless it is pre layout".concat(recyclerView.B()));
                            return hx0Var11;
                        }
                        z6 = dx0Var.g;
                    }
                    if (z6) {
                        hx0VarF = hx0Var9;
                        z = true;
                        hx0Var3 = hx0Var11;
                    } else {
                        hx0Var9.a(4);
                        if (hx0Var9.j()) {
                            recyclerView.removeDetachedView(hx0Var9.a, false);
                            hx0Var9.n.r(hx0Var9);
                        } else if (hx0Var9.q()) {
                            hx0Var9.j &= -33;
                        }
                        n(hx0Var9);
                        hx0VarF = hx0Var11;
                        hx0Var3 = hx0Var11;
                    }
                } else {
                    hx0Var9 = hx0Var10;
                    hx0Var11 = hx0Var8;
                    hx0Var11 = hx0Var8;
                    hx0VarF = hx0Var9;
                    hx0Var3 = hx0Var11;
                }
            } else {
                hx0Var3 = view2;
                hx0VarF = hx0Var2;
            }
            if (hx0VarF == null) {
                iG2 = recyclerView.g.g(i, 0);
                if (iG2 >= 0 || iG2 >= recyclerView.o.a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iG2 + ").state:" + dx0Var.b() + recyclerView.B());
                }
                int iC2 = recyclerView.o.c(iG2);
                iw0 iw0Var3 = recyclerView.o;
                j2 = 3;
                if (iw0Var3.b) {
                    long jB2 = iw0Var3.b(iG2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            hx0Var6 = hx0Var3;
                            str = str3;
                            int size6 = arrayList4.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    hx0Var7 = (hx0) arrayList4.get(size6);
                                    long j5 = jB2;
                                    if (hx0Var7.e != j5 || hx0Var7.e()) {
                                        size6--;
                                        jB2 = j5;
                                    } else {
                                        if (iC2 == hx0Var7.f) {
                                            arrayList4.remove(size6);
                                            break;
                                        }
                                        l(size6);
                                    }
                                }
                                hx0Var7 = null;
                                break;
                            }
                        }
                        hx0 hx0Var15 = (hx0) arrayList3.get(size5);
                        str = str3;
                        long j6 = hx0Var15.e;
                        View view8 = hx0Var15.a;
                        if (j6 != jB2 || hx0Var15.q()) {
                            hx0Var6 = hx0Var3;
                            hx0Var6 = hx0Var3;
                        } else {
                            if (iC2 == hx0Var15.f) {
                                hx0Var6 = hx0Var3;
                                hx0Var15.a(32);
                                if (hx0Var15.i() && !dx0Var.g) {
                                    hx0Var15.j = (hx0Var15.j & (-15)) | 2;
                                }
                                hx0Var7 = hx0Var15;
                                break;
                            }
                            hx0Var6 = hx0Var3;
                            arrayList3.remove(size5);
                            recyclerView.removeDetachedView(view8, false);
                            hx0 hx0VarM3 = RecyclerView.M(view8);
                            hx0VarM3.n = hx0Var6;
                            hx0VarM3.o = false;
                            hx0VarM3.j &= -33;
                            n(hx0VarM3);
                        }
                        size5--;
                        str3 = str;
                        hx0Var6 = null;
                    }
                    if (hx0Var7 != null) {
                        hx0Var7.c = iG2;
                        hx0Var4 = hx0Var7;
                        z = true;
                    } else {
                        hx0Var4 = hx0Var7;
                    }
                } else {
                    str = "RecyclerView";
                }
                if (hx0Var4 == null) {
                    hx0Var4 = hx0VarF;
                    if (RecyclerView.D0) {
                        str2 = str;
                        Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                    } else {
                        str2 = str;
                    }
                    ww0 ww0Var = (ww0) f().a.get(iC2);
                    if (ww0Var == null) {
                        hx0Var5 = null;
                        break;
                    }
                    ArrayList arrayList6 = ww0Var.a;
                    if (!arrayList6.isEmpty()) {
                        int size7 = arrayList6.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                hx0Var5 = null;
                                break;
                            }
                            if (!((hx0) arrayList6.get(size7)).e()) {
                                hx0Var5 = (hx0) arrayList6.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        hx0Var5 = null;
                        break;
                    }
                    if (hx0Var5 != null) {
                        hx0Var5.n();
                        boolean z7 = RecyclerView.C0;
                    }
                    hx0VarF = hx0Var5;
                } else {
                    hx0Var4 = hx0VarF;
                    str2 = str;
                }
                if (hx0VarF == null) {
                    hx0VarF = hx0Var4;
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j7 = ((xw0) this.g).a(iC2).c;
                        if (j7 != 0 && j7 + nanoTime2 >= j) {
                            return null;
                        }
                    }
                    iw0 iw0Var4 = recyclerView.o;
                    iw0Var4.getClass();
                    try {
                        if (bb1.a()) {
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC2)));
                        }
                        hx0VarF = iw0Var4.f(recyclerView, iC2);
                        if (hx0VarF.a.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        hx0VarF.f = iC2;
                        Trace.endSection();
                        if (RecyclerView.H0 && (recyclerViewG = RecyclerView.G(hx0VarF.a)) != null) {
                            hx0VarF.b = new WeakReference(recyclerViewG);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        ww0 ww0VarA = ((xw0) this.g).a(iC2);
                        long j8 = ww0VarA.c;
                        if (j8 != 0) {
                            nanoTime3 = (nanoTime3 / 4) + ((j8 / 4) * 3);
                        }
                        ww0VarA.c = nanoTime3;
                        if (RecyclerView.D0) {
                            Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            } else {
                j2 = 3;
            }
            hx0VarF = hx0Var4;
            view3 = hx0VarF.a;
            if (z && !dx0Var.g) {
                i3 = hx0VarF.j;
                if ((i3 & 8192) != 0) {
                    hx0VarF.j = i3 & (-8193);
                    if (dx0Var.j) {
                        nw0.b(hx0VarF);
                        nw0 nw0Var = recyclerView.N;
                        hx0VarF.d();
                        nw0Var.getClass();
                        vl0 vl0Var = new vl0();
                        vl0Var.a(hx0VarF);
                        recyclerView.Z(hx0VarF, vl0Var);
                    }
                }
            }
            if (dx0Var.g || !hx0VarF.f()) {
                if (hx0VarF.f() || (hx0VarF.j & 2) != 0 || hx0VarF.g()) {
                    if (!RecyclerView.C0 && hx0VarF.i()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(hx0VarF);
                        nh0.s(sb2, recyclerView.B());
                        return null;
                    }
                    iG = recyclerView.g.g(i, 0);
                    hx0VarF.s = null;
                    hx0VarF.r = recyclerView;
                    i2 = hx0VarF.f;
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j4 = ((xw0) this.g).a(i2).d;
                        if (j4 != 0 || j4 + nanoTime4 < j) {
                        }
                    }
                    if (hx0VarF.k()) {
                        recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    iw0Var = recyclerView.o;
                    iw0Var.getClass();
                    if (hx0VarF.s == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        hx0VarF.c = iG;
                        if (iw0Var.b) {
                            hx0VarF.e = iw0Var.b(iG);
                        }
                        hx0VarF.j = (hx0VarF.j & (-520)) | 1;
                        if (bb1.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(hx0VarF.f)));
                        }
                    }
                    hx0VarF.s = iw0Var;
                    if (RecyclerView.C0) {
                        if (view3.getParent() != null && view3.isAttachedToWindow() != hx0VarF.k()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + hx0VarF.k() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + hx0VarF);
                        }
                        if (view3.getParent() == null && view3.isAttachedToWindow()) {
                            id.l(hx0VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    hx0VarF.d();
                    iw0Var.e(hx0VarF, iG);
                    if (z3) {
                        arrayList = hx0VarF.k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        hx0VarF.j &= -1025;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams instanceof sw0) {
                            ((sw0) layoutParams).c = true;
                        }
                        Trace.endSection();
                    }
                    if (z2) {
                        recyclerView.detachViewFromParent(view3);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    ww0 ww0VarA2 = ((xw0) this.g).a(hx0VarF.f);
                    j3 = ww0VarA2.d;
                    if (j3 != 0) {
                        nanoTime = (nanoTime / 4) + ((j3 / 4) * j2);
                    }
                    ww0VarA2.d = nanoTime;
                    accessibilityManager = recyclerView.D;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        if (view3.getImportantForAccessibility() == 0) {
                            view3.setImportantForAccessibility(1);
                        }
                        jx0 jx0Var = recyclerView.o0;
                        if (jx0Var != null) {
                            ix0 ix0Var = jx0Var.e;
                            if (ix0Var != null) {
                                View.AccessibilityDelegate accessibilityDelegateD = oe1.d(view3);
                                if (accessibilityDelegateD == null) {
                                    o3Var = null;
                                } else {
                                    o3Var = accessibilityDelegateD instanceof n3 ? ((n3) accessibilityDelegateD).a : new o3(accessibilityDelegateD);
                                }
                                if (o3Var != null && o3Var != ix0Var) {
                                    ix0Var.e.put(view3, o3Var);
                                }
                            }
                            oe1.n(view3, ix0Var);
                        }
                    }
                    if (dx0Var.g) {
                        hx0VarF.g = i;
                    }
                    z4 = true;
                }
                layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    sw0Var = (sw0) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(sw0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    sw0Var = (sw0) layoutParams2;
                } else {
                    sw0Var = (sw0) recyclerView.generateLayoutParams(layoutParams2);
                    view3.setLayoutParams(sw0Var);
                }
                sw0Var.a = hx0VarF;
                if (z || !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                sw0Var.d = z5;
                return hx0VarF;
            }
            hx0VarF.g = i;
            z4 = false;
            layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                sw0Var = (sw0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(sw0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                sw0Var = (sw0) recyclerView.generateLayoutParams(layoutParams2);
                view3.setLayoutParams(sw0Var);
            } else {
                sw0Var = (sw0) layoutParams2;
            }
            sw0Var.a = hx0VarF;
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            sw0Var.d = z5;
            return hx0VarF;
        }
        view = null;
        hx0Var = null;
        z = false;
        hx0Var2 = hx0Var;
        view2 = view;
        String str4 = "RecyclerView";
        if (hx0Var2 == null) {
            size = arrayList3.size();
            i4 = 0;
            while (true) {
                if (i4 < size) {
                    arrayList2 = recyclerView.h.c;
                    size2 = arrayList2.size();
                    i5 = 0;
                    view4 = view2;
                    while (true) {
                        if (i5 < size2) {
                            hx0Var8 = view4;
                            view5 = view4;
                            break;
                        }
                        View view9 = (View) arrayList2.get(i5);
                        hx0VarM2 = RecyclerView.M(view9);
                        view6 = view4;
                        if (hx0VarM2.c() != i) {
                        }
                        i5++;
                        view4 = view6;
                    }
                    if (view5 != null) {
                        size3 = arrayList4.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size3) {
                                hx0Var9 = hx0Var8;
                                hx0Var11 = hx0Var8;
                                break;
                            }
                            hx0Var10 = (hx0) arrayList4.get(i6);
                            if (hx0Var10.g()) {
                            }
                            i6++;
                        }
                    } else {
                        hx0VarM = RecyclerView.M(view5);
                        olVar = recyclerView.h;
                        aaVar = olVar.b;
                        iIndexOfChild = olVar.a.c.indexOfChild(view5);
                        if (iIndexOfChild >= 0) {
                            id.p(view5, "view is not a child, cannot hide ");
                            return hx0Var8;
                        }
                        if (aaVar.e(iIndexOfChild)) {
                            nh0.p(view5, "trying to unhide a view that was not hidden");
                            return hx0Var8;
                        }
                        aaVar.b(iIndexOfChild);
                        olVar.j(view5);
                        ol olVar3 = recyclerView.h;
                        aaVar2 = olVar3.b;
                        iIndexOfChild2 = olVar3.a.c.indexOfChild(view5);
                        if (iIndexOfChild2 == -1) {
                            iC = -1;
                        } else {
                            iC = iIndexOfChild2 - aaVar2.c(iIndexOfChild2);
                        }
                        if (iC != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(hx0VarM);
                            nh0.s(sb3, recyclerView.B());
                            return hx0Var8;
                        }
                        recyclerView.h.c(iC);
                        o(view5);
                        hx0VarM.a(8224);
                        hx0Var9 = hx0VarM;
                        break;
                    }
                } else {
                    hx0Var12 = (hx0) arrayList3.get(i4);
                    if (hx0Var12.q()) {
                    }
                    i4++;
                }
            }
            if (hx0Var9 != null) {
                hx0Var9 = hx0Var10;
                hx0Var11 = hx0Var8;
                hx0Var11 = hx0Var8;
                if (hx0Var9.i()) {
                    i7 = hx0Var9.c;
                    if (i7 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + hx0Var9 + recyclerView.B());
                }
                if (!RecyclerView.C0) {
                }
                z6 = dx0Var.g;
                if (z6) {
                    hx0Var9.a(4);
                    if (hx0Var9.j()) {
                        recyclerView.removeDetachedView(hx0Var9.a, false);
                        hx0Var9.n.r(hx0Var9);
                    } else if (hx0Var9.q()) {
                        hx0Var9.j &= -33;
                    }
                    n(hx0Var9);
                    hx0VarF = hx0Var11;
                    hx0Var3 = hx0Var11;
                } else {
                    hx0VarF = hx0Var9;
                    z = true;
                    hx0Var3 = hx0Var11;
                }
            } else {
                hx0Var9 = hx0Var10;
                hx0Var11 = hx0Var8;
                hx0Var11 = hx0Var8;
                hx0VarF = hx0Var9;
                hx0Var3 = hx0Var11;
            }
        } else {
            hx0Var3 = view2;
            hx0VarF = hx0Var2;
        }
        if (hx0VarF == null) {
            iG2 = recyclerView.g.g(i, 0);
            if (iG2 >= 0) {
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iG2 + ").state:" + dx0Var.b() + recyclerView.B());
        }
        j2 = 3;
        hx0VarF = hx0Var4;
        view3 = hx0VarF.a;
        if (z) {
            i3 = hx0VarF.j;
            if ((i3 & 8192) != 0) {
                hx0VarF.j = i3 & (-8193);
                if (dx0Var.j) {
                    nw0.b(hx0VarF);
                    nw0 nw0Var2 = recyclerView.N;
                    hx0VarF.d();
                    nw0Var2.getClass();
                    vl0 vl0Var2 = new vl0();
                    vl0Var2.a(hx0VarF);
                    recyclerView.Z(hx0VarF, vl0Var2);
                }
            }
        }
        if (dx0Var.g) {
            if (hx0VarF.f()) {
                if (!RecyclerView.C0) {
                }
                iG = recyclerView.g.g(i, 0);
                hx0VarF.s = null;
                hx0VarF.r = recyclerView;
                i2 = hx0VarF.f;
                long nanoTime5 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j4 = ((xw0) this.g).a(i2).d;
                    if (j4 != 0) {
                    }
                }
                if (hx0VarF.k()) {
                    recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                    z2 = true;
                } else {
                    z2 = false;
                }
                iw0Var = recyclerView.o;
                iw0Var.getClass();
                if (hx0VarF.s == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    hx0VarF.c = iG;
                    if (iw0Var.b) {
                        hx0VarF.e = iw0Var.b(iG);
                    }
                    hx0VarF.j = (hx0VarF.j & (-520)) | 1;
                    if (bb1.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(hx0VarF.f)));
                    }
                }
                hx0VarF.s = iw0Var;
                if (RecyclerView.C0) {
                    if (view3.getParent() != null) {
                    }
                    if (view3.getParent() == null) {
                        id.l(hx0VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                hx0VarF.d();
                iw0Var.e(hx0VarF, iG);
                if (z3) {
                    arrayList = hx0VarF.k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    hx0VarF.j &= -1025;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams instanceof sw0) {
                        ((sw0) layoutParams).c = true;
                    }
                    Trace.endSection();
                }
                if (z2) {
                    recyclerView.detachViewFromParent(view3);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                ww0 ww0VarA3 = ((xw0) this.g).a(hx0VarF.f);
                j3 = ww0VarA3.d;
                if (j3 != 0) {
                    nanoTime = (nanoTime / 4) + ((j3 / 4) * j2);
                }
                ww0VarA3.d = nanoTime;
                accessibilityManager = recyclerView.D;
                if (accessibilityManager == null) {
                }
                if (dx0Var.g) {
                    hx0VarF.g = i;
                }
                z4 = true;
            } else {
                if (!RecyclerView.C0) {
                }
                iG = recyclerView.g.g(i, 0);
                hx0VarF.s = null;
                hx0VarF.r = recyclerView;
                i2 = hx0VarF.f;
                long nanoTime6 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j4 = ((xw0) this.g).a(i2).d;
                    if (j4 != 0) {
                    }
                }
                if (hx0VarF.k()) {
                    recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                    z2 = true;
                } else {
                    z2 = false;
                }
                iw0Var = recyclerView.o;
                iw0Var.getClass();
                if (hx0VarF.s == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    hx0VarF.c = iG;
                    if (iw0Var.b) {
                        hx0VarF.e = iw0Var.b(iG);
                    }
                    hx0VarF.j = (hx0VarF.j & (-520)) | 1;
                    if (bb1.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(hx0VarF.f)));
                    }
                }
                hx0VarF.s = iw0Var;
                if (RecyclerView.C0) {
                    if (view3.getParent() != null) {
                    }
                    if (view3.getParent() == null) {
                        id.l(hx0VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                hx0VarF.d();
                iw0Var.e(hx0VarF, iG);
                if (z3) {
                    arrayList = hx0VarF.k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    hx0VarF.j &= -1025;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams instanceof sw0) {
                        ((sw0) layoutParams).c = true;
                    }
                    Trace.endSection();
                }
                if (z2) {
                    recyclerView.detachViewFromParent(view3);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                ww0 ww0VarA4 = ((xw0) this.g).a(hx0VarF.f);
                j3 = ww0VarA4.d;
                if (j3 != 0) {
                    nanoTime = (nanoTime / 4) + ((j3 / 4) * j2);
                }
                ww0VarA4.d = nanoTime;
                accessibilityManager = recyclerView.D;
                if (accessibilityManager == null) {
                }
                if (dx0Var.g) {
                    hx0VarF.g = i;
                }
                z4 = true;
            }
        } else if (hx0VarF.f()) {
            if (!RecyclerView.C0) {
            }
            iG = recyclerView.g.g(i, 0);
            hx0VarF.s = null;
            hx0VarF.r = recyclerView;
            i2 = hx0VarF.f;
            long nanoTime7 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j4 = ((xw0) this.g).a(i2).d;
                if (j4 != 0) {
                }
            }
            if (hx0VarF.k()) {
                recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                z2 = true;
            } else {
                z2 = false;
            }
            iw0Var = recyclerView.o;
            iw0Var.getClass();
            if (hx0VarF.s == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                hx0VarF.c = iG;
                if (iw0Var.b) {
                    hx0VarF.e = iw0Var.b(iG);
                }
                hx0VarF.j = (hx0VarF.j & (-520)) | 1;
                if (bb1.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(hx0VarF.f)));
                }
            }
            hx0VarF.s = iw0Var;
            if (RecyclerView.C0) {
                if (view3.getParent() != null) {
                }
                if (view3.getParent() == null) {
                    id.l(hx0VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return null;
                }
            }
            hx0VarF.d();
            iw0Var.e(hx0VarF, iG);
            if (z3) {
                arrayList = hx0VarF.k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                hx0VarF.j &= -1025;
                layoutParams = view3.getLayoutParams();
                if (layoutParams instanceof sw0) {
                    ((sw0) layoutParams).c = true;
                }
                Trace.endSection();
            }
            if (z2) {
                recyclerView.detachViewFromParent(view3);
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime7;
            ww0 ww0VarA5 = ((xw0) this.g).a(hx0VarF.f);
            j3 = ww0VarA5.d;
            if (j3 != 0) {
                nanoTime = (nanoTime / 4) + ((j3 / 4) * j2);
            }
            ww0VarA5.d = nanoTime;
            accessibilityManager = recyclerView.D;
            if (accessibilityManager == null) {
            }
            if (dx0Var.g) {
                hx0VarF.g = i;
            }
            z4 = true;
        } else {
            if (!RecyclerView.C0) {
            }
            iG = recyclerView.g.g(i, 0);
            hx0VarF.s = null;
            hx0VarF.r = recyclerView;
            i2 = hx0VarF.f;
            long nanoTime8 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j4 = ((xw0) this.g).a(i2).d;
                if (j4 != 0) {
                }
            }
            if (hx0VarF.k()) {
                recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                z2 = true;
            } else {
                z2 = false;
            }
            iw0Var = recyclerView.o;
            iw0Var.getClass();
            if (hx0VarF.s == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                hx0VarF.c = iG;
                if (iw0Var.b) {
                    hx0VarF.e = iw0Var.b(iG);
                }
                hx0VarF.j = (hx0VarF.j & (-520)) | 1;
                if (bb1.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(hx0VarF.f)));
                }
            }
            hx0VarF.s = iw0Var;
            if (RecyclerView.C0) {
                if (view3.getParent() != null) {
                }
                if (view3.getParent() == null) {
                    id.l(hx0VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return null;
                }
            }
            hx0VarF.d();
            iw0Var.e(hx0VarF, iG);
            if (z3) {
                arrayList = hx0VarF.k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                hx0VarF.j &= -1025;
                layoutParams = view3.getLayoutParams();
                if (layoutParams instanceof sw0) {
                    ((sw0) layoutParams).c = true;
                }
                Trace.endSection();
            }
            if (z2) {
                recyclerView.detachViewFromParent(view3);
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime8;
            ww0 ww0VarA6 = ((xw0) this.g).a(hx0VarF.f);
            j3 = ww0VarA6.d;
            if (j3 != 0) {
                nanoTime = (nanoTime / 4) + ((j3 / 4) * j2);
            }
            ww0VarA6.d = nanoTime;
            accessibilityManager = recyclerView.D;
            if (accessibilityManager == null) {
            }
            if (dx0Var.g) {
                hx0VarF.g = i;
            }
            z4 = true;
        }
        layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 == null) {
            sw0Var = (sw0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(sw0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            sw0Var = (sw0) recyclerView.generateLayoutParams(layoutParams2);
            view3.setLayoutParams(sw0Var);
        } else {
            sw0Var = (sw0) layoutParams2;
        }
        sw0Var.a = hx0VarF;
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        sw0Var.d = z5;
        return hx0VarF;
    }

    public void r(hx0 hx0Var) {
        if (hx0Var.o) {
            ((ArrayList) this.d).remove(hx0Var);
        } else {
            ((ArrayList) this.c).remove(hx0Var);
        }
        hx0Var.n = null;
        hx0Var.o = false;
        hx0Var.j &= -33;
    }

    public void s() {
        ArrayList arrayList = (ArrayList) this.e;
        rw0 rw0Var = ((RecyclerView) this.h).p;
        this.b = this.a + (rw0Var != null ? rw0Var.j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            l(size);
        }
    }

    public yw0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }
}
