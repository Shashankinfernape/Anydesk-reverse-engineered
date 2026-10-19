package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends hq {
    public final /* synthetic */ int s;

    public /* synthetic */ i4(int i) {
        this.s = i;
    }

    @Override // defpackage.hq
    public final Object D(Intent intent, int i) {
        switch (this.s) {
            case 0:
                return Integer.valueOf(i);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListR = ae.R(stringArrayExtra);
                        Iterator it = arrayListR.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(vm.c0(arrayListR, 10), vm.c0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new st0(it.next(), it2.next()));
                        }
                        return mj0.Q(arrayList2);
                    }
                }
                return nx.c;
            case 2:
                return new i6(intent, i);
            default:
                return new i6(intent, i);
        }
    }

    @Override // defpackage.hq
    public final Intent n(qa qaVar, Object obj) {
        Bundle bundleExtra;
        switch (this.s) {
            case 0:
                Intent intent = (Intent) t70.n(qaVar, true).d;
                intent.setData(Uri.parse((String) obj));
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 2:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
            default:
                x90 x90Var = (x90) obj;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent4 = x90Var.d;
                if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        x90Var = new x90(x90Var.c, null, x90Var.e, x90Var.f);
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", x90Var);
                if (t40.H(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent3);
                }
                return intent3;
        }
    }

    @Override // defpackage.hq
    public v3 v(qa qaVar, Object obj) {
        switch (this.s) {
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new v3(nx.c);
                }
                for (String str : strArr) {
                    if (uj.d(qaVar, str) != 0) {
                        return null;
                    }
                }
                int iP = mj0.P(strArr.length);
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new v3(linkedHashMap);
            default:
                return super.v(qaVar, obj);
        }
    }
}
