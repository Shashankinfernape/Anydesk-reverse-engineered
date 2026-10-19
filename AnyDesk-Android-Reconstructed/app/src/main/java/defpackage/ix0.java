package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 extends o3 {
    public final jx0 d;
    public final WeakHashMap e = new WeakHashMap();

    public ix0(jx0 jx0Var) {
        this.d = jx0Var;
    }

    @Override // defpackage.o3
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        o3 o3Var = (o3) this.e.get(view);
        return o3Var != null ? o3Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.o3
    public final af1 b(View view) {
        o3 o3Var = (o3) this.e.get(view);
        return o3Var != null ? o3Var.b(view) : super.b(view);
    }

    @Override // defpackage.o3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            o3Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
        jx0 jx0Var = this.d;
        RecyclerView recyclerView = jx0Var.d;
        RecyclerView recyclerView2 = jx0Var.d;
        boolean zO = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zO || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().X(view, w3Var);
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            o3Var.d(view, w3Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.o3
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            o3Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.o3
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        o3 o3Var = (o3) this.e.get(viewGroup);
        return o3Var != null ? o3Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.o3
    public final boolean g(View view, int i, Bundle bundle) {
        jx0 jx0Var = this.d;
        RecyclerView recyclerView = jx0Var.d;
        RecyclerView recyclerView2 = jx0Var.d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            if (o3Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        yw0 yw0Var = recyclerView2.getLayoutManager().b.e;
        return false;
    }

    @Override // defpackage.o3
    public final void h(View view, int i) {
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            o3Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.o3
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        o3 o3Var = (o3) this.e.get(view);
        if (o3Var != null) {
            o3Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
