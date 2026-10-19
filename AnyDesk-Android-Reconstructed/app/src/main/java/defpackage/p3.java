package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final tk a;

    public p3(tk tkVar) {
        this.a = tkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p3) {
            return this.a.equals(((p3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        xv xvVar = (xv) this.a.c;
        AutoCompleteTextView autoCompleteTextView = xvVar.h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = xvVar.d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = oe1.a;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
