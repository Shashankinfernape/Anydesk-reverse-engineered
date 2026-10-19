package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xw0 {
    public SparseArray a;
    public int b;
    public Set c;

    public final ww0 a(int i) {
        SparseArray sparseArray = this.a;
        ww0 ww0Var = (ww0) sparseArray.get(i);
        if (ww0Var != null) {
            return ww0Var;
        }
        ww0 ww0Var2 = new ww0();
        sparseArray.put(i, ww0Var2);
        return ww0Var2;
    }
}
