package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x3 extends AccessibilityNodeProvider {
    public final af1 a;

    public x3(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        w3 w3VarW = this.a.w(i);
        if (w3VarW == null) {
            return null;
        }
        return w3VarW.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        w3 w3VarX = this.a.x(i);
        if (w3VarX == null) {
            return null;
        }
        return w3VarX.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.C(i, i2, bundle);
    }
}
