package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yl implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener c;
    public final /* synthetic */ ChipGroup d;

    public yl(ChipGroup chipGroup) {
        this.d = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.d;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = oe1.a;
                view2.setId(View.generateViewId());
            }
            hl hlVar = chipGroup.j;
            Chip chip = (Chip) view2;
            hlVar.a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                hlVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new af1(26, hlVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.d;
        if (view == chipGroup && (view2 instanceof Chip)) {
            hl hlVar = chipGroup.j;
            Chip chip = (Chip) view2;
            hlVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            hlVar.a.remove(Integer.valueOf(chip.getId()));
            hlVar.b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
