package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends o3 {
    public final /* synthetic */ int d;

    public /* synthetic */ gv(int i) {
        this.d = i;
    }

    @Override // defpackage.o3
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        int scrollRange;
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int[] iArr = DrawerLayout.E;
                WeakHashMap weakHashMap = oe1.a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    accessibilityNodeInfo.setParent(null);
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = w3Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                w3Var.j(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo2.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        w3Var.b(q3.i);
                        w3Var.b(q3.l);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        w3Var.b(q3.h);
                        w3Var.b(q3.m);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // defpackage.o3
    public boolean g(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.d) {
            case 1:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
