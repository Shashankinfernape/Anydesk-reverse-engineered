package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ qa h;

    public zn(qa qaVar) {
        this.h = qaVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m6 m6Var = (m6) this.e.get(str);
        if ((m6Var != null ? m6Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                m6Var.a.c(m6Var.b.D(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new i6(intent, i2));
        return true;
    }

    public final void b(int i, hq hqVar, Object obj) {
        Bundle bundleExtra;
        int i2;
        qa qaVar = this.h;
        v3 v3VarV = hqVar.v(qaVar, obj);
        int i3 = 0;
        if (v3VarV != null) {
            new Handler(Looper.getMainLooper()).post(new yn(i, 0, this, v3VarV));
            return;
        }
        Intent intentN = hqVar.n(qaVar, obj);
        if (intentN.getExtras() != null) {
            Bundle extras = intentN.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentN.setExtrasClassLoader(qaVar.getClassLoader());
            }
        }
        if (intentN.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentN.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentN.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentN.getAction())) {
            String[] stringArrayExtra = intentN.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                    id.q(q51.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i4));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i5 = 0;
                for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                    if (!hashSet.contains(Integer.valueOf(i6))) {
                        strArr[i5] = stringArrayExtra[i6];
                        i5++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                nd0.C(qaVar, stringArrayExtra, i);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new c6(i, i3, strArr, qaVar));
                return;
            }
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentN.getAction())) {
            qaVar.startActivityForResult(intentN, i, bundle);
            return;
        }
        x90 x90Var = (x90) intentN.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            x90Var.getClass();
            i2 = i;
            try {
                qaVar.startIntentSenderForResult(x90Var.c, i2, x90Var.d, x90Var.e, x90Var.f, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new yn(i2, 1, this, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final p6 c(String str, hq hqVar, j6 j6Var) {
        e(str);
        this.e.put(str, new m6(j6Var, hqVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            j6Var.c(obj);
        }
        Bundle bundle = this.g;
        i6 i6Var = (i6) uj.q(str, bundle);
        if (i6Var != null) {
            bundle.remove(str);
            j6Var.c(hqVar.D(i6Var.d, i6Var.c));
        }
        return new p6(this, str, hqVar, 1);
    }

    public final p6 d(final String str, gf0 gf0Var, final hq hqVar, final j6 j6Var) {
        gf0Var.getClass();
        if0 if0VarR = gf0Var.R();
        if (if0VarR.d.compareTo(af0.f) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(gf0Var);
            af0 af0Var = if0VarR.d;
            sb.append(" is attempting to register while current state is ");
            sb.append(af0Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        n6 n6Var = (n6) linkedHashMap.get(str);
        if (n6Var == null) {
            n6Var = new n6(if0VarR);
        }
        ef0 ef0Var = new ef0() { // from class: l6
            @Override // defpackage.ef0
            public final void i(gf0 gf0Var2, ze0 ze0Var) {
                zn znVar = this.c;
                Bundle bundle = znVar.g;
                LinkedHashMap linkedHashMap2 = znVar.e;
                LinkedHashMap linkedHashMap3 = znVar.f;
                ze0 ze0Var2 = ze0.ON_START;
                String str2 = str;
                if (ze0Var2 != ze0Var) {
                    if (ze0.ON_STOP == ze0Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (ze0.ON_DESTROY == ze0Var) {
                            znVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                j6 j6Var2 = j6Var;
                hq hqVar2 = hqVar;
                linkedHashMap2.put(str2, new m6(j6Var2, hqVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    j6Var2.c(obj);
                }
                i6 i6Var = (i6) uj.q(str2, bundle);
                if (i6Var != null) {
                    bundle.remove(str2);
                    j6Var2.c(hqVar2.D(i6Var.d, i6Var.c));
                }
            }
        };
        n6Var.a.a(ef0Var);
        n6Var.b.add(ef0Var);
        linkedHashMap.put(str, n6Var);
        return new p6(this, str, hqVar, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new mp(new b10(o6.e, new a0(19), 1))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbN = q51.n("Dropping pending result for request ", str, ": ");
            sbN.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((i6) uj.q(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        n6 n6Var = (n6) linkedHashMap2.get(str);
        if (n6Var != null) {
            ArrayList arrayList = n6Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                n6Var.a.f((ef0) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
