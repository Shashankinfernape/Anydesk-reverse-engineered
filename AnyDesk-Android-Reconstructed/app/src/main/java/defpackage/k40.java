package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k40 implements e01 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e01
    public final Bundle a() {
        Bundle bundleG;
        st0[] st0VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((t40) obj).V();
            case 1:
                bo0 bo0Var = (bo0) obj;
                mn0 mn0Var = bo0Var.b;
                LinkedHashMap linkedHashMap = mn0Var.l;
                qd<an0> qdVar = mn0Var.f;
                LinkedHashMap linkedHashMap2 = mn0Var.k;
                ArrayList arrayList = new ArrayList();
                Bundle bundleG2 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                for (Map.Entry entry : mj0.R(mn0Var.r.a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleH = ((fp0) entry.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str);
                        str.getClass();
                        bundleG2.putBundle(str, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundleG = null;
                } else {
                    bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    ec1.E(bundleG2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleG.putBundle("android-support-nav:controller:navigatorState", bundleG2);
                }
                if (!qdVar.isEmpty()) {
                    if (bundleG == null) {
                        bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (an0 an0Var : qdVar) {
                        an0Var.getClass();
                        int i2 = an0Var.d.d.a;
                        String str2 = an0Var.h;
                        dn0 dn0Var = an0Var.j;
                        Bundle bundleB = dn0Var.b();
                        Bundle bundleG3 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                        ((ui0) dn0Var.k).q(bundleG3);
                        Bundle bundleG4 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                        str2.getClass();
                        bundleG4.putString("nav-entry-state:id", str2);
                        bundleG4.putInt("nav-entry-state:destination-id", i2);
                        if (bundleB == null) {
                            bundleB = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                        }
                        bundleG4.putBundle("nav-entry-state:args", bundleB);
                        bundleG4.putBundle("nav-entry-state:saved-state", bundleG3);
                        arrayList2.add(bundleG4);
                    }
                    bundleG.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleG == null) {
                        bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = iIntValue;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i3 = i4;
                    }
                    bundleG.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    ec1.E(bundleG, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleG == null) {
                        bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        qd qdVar2 = (qd) entry3.getValue();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = qdVar2.iterator();
                        while (it.hasNext()) {
                            xb xbVar = ((en0) it.next()).a;
                            xbVar.getClass();
                            Bundle bundleG5 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                            String str5 = (String) xbVar.d;
                            str5.getClass();
                            bundleG5.putString("nav-entry-state:id", str5);
                            bundleG5.putInt("nav-entry-state:destination-id", xbVar.c);
                            Bundle bundleG6 = (Bundle) xbVar.e;
                            if (bundleG6 == null) {
                                bundleG6 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                            }
                            bundleG5.putBundle("nav-entry-state:args", bundleG6);
                            Bundle bundle = (Bundle) xbVar.f;
                            bundle.getClass();
                            bundleG5.putBundle("nav-entry-state:saved-state", bundle);
                            arrayList5.add(bundleG5);
                        }
                        bundleG.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    ec1.E(bundleG, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (bo0Var.e) {
                    if (bundleG == null) {
                        bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                    }
                    bundleG.putBoolean("android-support-nav:controller:deepLinkHandled", bo0Var.e);
                }
                if (bundleG != null) {
                    return bundleG;
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            case 2:
                int i5 = ((NavHostFragment) obj).b0;
                if (i5 != 0) {
                    return hq.g(new st0("android-support-nav:fragment:graphId", Integer.valueOf(i5)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                bundle3.getClass();
                return bundle3;
            default:
                gi giVar = (gi) obj;
                for (Map.Entry entry4 : mj0.R((LinkedHashMap) giVar.d).entrySet()) {
                    giVar.g(((e71) entry4.getValue()).getValue(), (String) entry4.getKey());
                }
                for (Map.Entry entry5 : mj0.R((LinkedHashMap) giVar.b).entrySet()) {
                    giVar.g(((e01) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) giVar.a;
                if (linkedHashMap3.isEmpty()) {
                    st0VarArr = new st0[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList6.add(new st0((String) entry6.getKey(), entry6.getValue()));
                    }
                    st0VarArr = (st0[]) arrayList6.toArray(new st0[0]);
                }
                return hq.g((st0[]) Arrays.copyOf(st0VarArr, st0VarArr.length));
        }
    }
}
