package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j90 {
    public final LinkedHashMap a;

    public j90(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(fm fmVar, z50 z50Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(fmVar)) {
            linkedHashMap.put(fmVar, new xe1(fmVar, z50Var));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + y90.u(fmVar) + '.').toString());
    }

    public i90 b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        xe1[] xe1VarArr = (xe1[]) collectionValues.toArray(new xe1[0]);
        return new i90((xe1[]) Arrays.copyOf(xe1VarArr, xe1VarArr.length));
    }
}
