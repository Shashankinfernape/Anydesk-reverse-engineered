package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn implements xq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ tn(qa qaVar, int i) {
        this.a = i;
        this.b = qaVar;
    }

    @Override // defpackage.xq0
    public final void a(co coVar) {
        int i = this.a;
        qa qaVar = this.b;
        switch (i) {
            case 0:
                coVar.getClass();
                Bundle bundleG = ((ui0) qaVar.f.d).g("android:support:activity-result");
                if (bundleG != null) {
                    zn znVar = qaVar.k;
                    LinkedHashMap linkedHashMap = znVar.b;
                    LinkedHashMap linkedHashMap2 = znVar.a;
                    Bundle bundle = znVar.g;
                    ArrayList<Integer> integerArrayList = bundleG.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            znVar.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleG.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    ec1.d(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            znVar.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                e40 e40Var = (e40) qaVar.w.d;
                e40Var.v.b(e40Var, e40Var, null);
                break;
        }
    }
}
