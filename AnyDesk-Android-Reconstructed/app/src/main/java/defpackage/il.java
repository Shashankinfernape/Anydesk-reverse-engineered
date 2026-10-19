package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class il extends o3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public il(DrawerLayout drawerLayout) {
        this.d = 1;
        this.e = drawerLayout;
        new Rect();
    }

    @Override // defpackage.o3
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                DrawerLayout drawerLayout = (DrawerLayout) this.e;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewG = drawerLayout.g();
                if (viewG != null) {
                    int i = drawerLayout.i(viewG);
                    WeakHashMap weakHashMap = oe1.a;
                    Gravity.getAbsoluteGravity(i, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.o3
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f);
                break;
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        int i = this.d;
        View view2 = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.g);
                accessibilityNodeInfo.setChecked(checkableImageButton.f);
                break;
            case 1:
                int[] iArr = DrawerLayout.E;
                AccessibilityNodeInfo accessibilityNodeInfo2 = w3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                w3Var.j("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo2.setFocusable(false);
                accessibilityNodeInfo2.setFocused(false);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) q3.e.a);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) q3.f.a);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = w3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) view2).z);
                break;
        }
    }

    @Override // defpackage.o3
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                int[] iArr = DrawerLayout.E;
                return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    public /* synthetic */ il(View view, int i) {
        this.d = i;
        this.e = view;
    }
}
