package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b3(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        Activity activity;
        Rect rect;
        int i = this.c;
        boolean z = true;
        int i2 = 0;
        Object obj = this.d;
        switch (i) {
            case 0:
                k3 k3Var = (k3) obj;
                View view = k3Var.x0;
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    Rect rect2 = k3Var.v0;
                    int i3 = iArr[0];
                    rect2.set(i3, iArr[1], view.getWidth() + i3, view.getHeight() + iArr[1]);
                    k3Var.S0();
                    break;
                }
                break;
            case 1:
                pc pcVar = (pc) obj;
                if (!pcVar.getInternalPopup().b()) {
                    pcVar.h.n(pcVar.getTextDirection(), pcVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver2 = pcVar.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
                break;
            case 2:
                mc mcVar = (mc) obj;
                pc pcVar2 = mcVar.J;
                if (pcVar2.isAttachedToWindow() && pcVar2.getGlobalVisibleRect(mcVar.H)) {
                    mcVar.s();
                    mcVar.d();
                } else {
                    mcVar.dismiss();
                }
                break;
            case 3:
                sj sjVar = (sj) obj;
                ArrayList arrayList = sjVar.j;
                if (sjVar.b() && arrayList.size() > 0 && !((rj) arrayList.get(0)).a.A) {
                    View view2 = sjVar.q;
                    if (view2 != null && view2.isShown()) {
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((rj) obj2).a.d();
                        }
                    } else {
                        sjVar.dismiss();
                    }
                    break;
                }
                break;
            case 4:
                MainFragment mainFragment = (MainFragment) obj;
                View view3 = mainFragment.H;
                if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(mainFragment.C1);
                    t70.V(new bc0(10, this));
                    break;
                }
                break;
            case 5:
                NavigationView navigationView = (NavigationView) obj;
                int[] iArr2 = navigationView.n;
                navigationView.getLocationOnScreen(iArr2);
                boolean z2 = iArr2[1] == 0;
                yo0 yo0Var = navigationView.k;
                if (yo0Var.z != z2) {
                    yo0Var.z = z2;
                    int i4 = (yo0Var.d.getChildCount() <= 0 && yo0Var.z) ? yo0Var.B : 0;
                    NavigationMenuView navigationMenuView = yo0Var.c;
                    navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2 && navigationView.q);
                int i5 = iArr2[0];
                navigationView.setDrawLeftInsetForeground(i5 == 0 || navigationView.getWidth() + i5 == 0);
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = r3.h(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr2[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.r);
                    if (rect.width() != iArr2[0] && rect.width() - navigationView.getWidth() != iArr2[0]) {
                        z = false;
                    }
                    navigationView.setDrawRightInsetForeground(z);
                }
                break;
            default:
                a71 a71Var = (a71) obj;
                gl0 gl0Var = a71Var.j;
                if (a71Var.b() && !gl0Var.A) {
                    View view4 = a71Var.o;
                    if (view4 != null && view4.isShown()) {
                        gl0Var.d();
                    } else {
                        a71Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
