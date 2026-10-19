package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qj implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qj(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                rx rxVar = (rx) obj;
                AccessibilityManager accessibilityManager = rxVar.v;
                if (rxVar.w != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = oe1.a;
                    if (rxVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new p3(rxVar.w));
                    }
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = oe1.a;
                ee1.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                sj sjVar = (sj) obj;
                ViewTreeObserver viewTreeObserver = sjVar.z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        sjVar.z = view.getViewTreeObserver();
                    }
                    sjVar.z.removeGlobalOnLayoutListener(sjVar.k);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                rx rxVar = (rx) obj;
                tk tkVar = rxVar.w;
                if (tkVar != null && (accessibilityManager = rxVar.v) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new p3(tkVar));
                    break;
                }
                break;
            case 2:
                break;
            default:
                a71 a71Var = (a71) obj;
                ViewTreeObserver viewTreeObserver2 = a71Var.q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        a71Var.q = view.getViewTreeObserver();
                    }
                    a71Var.q.removeGlobalOnLayoutListener(a71Var.k);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
