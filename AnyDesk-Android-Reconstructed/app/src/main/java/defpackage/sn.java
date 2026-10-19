package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements e01 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ sn(qa qaVar, int i) {
        this.a = i;
        this.b = qaVar;
    }

    @Override // defpackage.e01
    public final Bundle a() {
        int i = this.a;
        qa qaVar = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zn znVar = qaVar.k;
                znVar.getClass();
                LinkedHashMap linkedHashMap = znVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(znVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(znVar.g));
                return bundle;
        }
        while (qa.Z(qaVar.Y())) {
        }
        qaVar.x.d(ze0.ON_STOP);
        return new Bundle();
    }
}
