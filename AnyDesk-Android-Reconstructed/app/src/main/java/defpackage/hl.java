package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class hl {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public ul c;
    public boolean d;
    public boolean e;

    public final boolean a(ek0 ek0Var) {
        int id = ek0Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        ek0 ek0Var2 = (ek0) this.a.get(Integer.valueOf(c()));
        if (ek0Var2 != null) {
            e(ek0Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!ek0Var.isChecked()) {
            ek0Var.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ek0) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ul ulVar = this.c;
        if (ulVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = ulVar.a;
            xl xlVar = chipGroup.i;
            if (xlVar != null) {
                chipGroup.j.b(chipGroup);
                ChipGroup chipGroup2 = ((ul) xlVar).a;
                if (chipGroup2.j.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(ek0 ek0Var, boolean z) {
        int id = ek0Var.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            ek0Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (ek0Var.isChecked()) {
            ek0Var.setChecked(false);
        }
        return zRemove;
    }
}
