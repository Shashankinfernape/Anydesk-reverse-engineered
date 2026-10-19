package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.anydesk.anydeskandroid.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kb implements Window.Callback {
    public final Window.Callback c;
    public qa1 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ qb h;

    public kb(qb qbVar, Window.Callback callback) {
        this.h = qbVar;
        if (callback != null) {
            this.c = callback;
        } else {
            id.q("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
        } finally {
            this.e = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.c.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.c.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        jg1.a(this.c, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f;
        Window.Callback callback = this.c;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.h.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.c.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            qb qbVar = this.h;
            qbVar.B();
            th1 th1Var = qbVar.p;
            if (th1Var == null || !th1Var.H(keyCode, keyEvent)) {
                pb pbVar = qbVar.N;
                if (pbVar == null || !qbVar.G(pbVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (qbVar.N == null) {
                        pb pbVarA = qbVar.A(0);
                        qbVar.H(pbVarA, keyEvent);
                        boolean zG = qbVar.G(pbVarA, keyEvent.getKeyCode(), keyEvent);
                        pbVarA.k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                pb pbVar2 = qbVar.N;
                if (pbVar2 != null) {
                    pbVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.c.dispatchTrackballEvent(motionEvent);
    }

    public final z71 e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        qb qbVar = this.h;
        Context context = qbVar.m;
        ah ahVar = new ah(context, callback);
        a6 a6Var = qbVar.v;
        if (a6Var != null) {
            a6Var.a();
        }
        bc bcVar = new bc(qbVar, 7, ahVar);
        qbVar.B();
        th1 th1Var = qbVar.p;
        if (th1Var != null) {
            qbVar.v = th1Var.X(bcVar);
        }
        if (qbVar.v == null) {
            df1 df1Var = qbVar.z;
            if (df1Var != null) {
                df1Var.b();
            }
            a6 a6Var2 = qbVar.v;
            if (a6Var2 != null) {
                a6Var2.a();
            }
            int i = 1;
            if (qbVar.w == null) {
                if (qbVar.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        qq qqVar = new qq(context, 0);
                        qqVar.getTheme().setTo(themeNewTheme);
                        context = qqVar;
                    }
                    qbVar.w = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    qbVar.x = popupWindow;
                    bu0.E(popupWindow, 2);
                    qbVar.x.setContentView(qbVar.w);
                    qbVar.x.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    qbVar.w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    qbVar.x.setHeight(-2);
                    qbVar.y = new cb(qbVar, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) qbVar.B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        qbVar.B();
                        th1 th1Var2 = qbVar.p;
                        Context contextU = th1Var2 != null ? th1Var2.u() : null;
                        if (contextU != null) {
                            context = contextU;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        qbVar.w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (qbVar.w != null) {
                df1 df1Var2 = qbVar.z;
                if (df1Var2 != null) {
                    df1Var2.b();
                }
                qbVar.w.e();
                Context context2 = qbVar.w.getContext();
                ActionBarContextView actionBarContextView = qbVar.w;
                y61 y61Var = new y61();
                y61Var.e = context2;
                y61Var.f = actionBarContextView;
                y61Var.g = bcVar;
                rk0 rk0Var = new rk0(actionBarContextView.getContext());
                rk0Var.l = 1;
                y61Var.j = rk0Var;
                rk0Var.e = y61Var;
                if (((ah) bcVar.d).u(y61Var, rk0Var)) {
                    y61Var.h();
                    qbVar.w.c(y61Var);
                    qbVar.v = y61Var;
                    boolean z = qbVar.A && (viewGroup = qbVar.B) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = qbVar.w;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        df1 df1VarA = oe1.a(qbVar.w);
                        df1VarA.a(1.0f);
                        qbVar.z = df1VarA;
                        df1VarA.d(new eb(i, qbVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        qbVar.w.setVisibility(0);
                        if (qbVar.w.getParent() instanceof View) {
                            View view = (View) qbVar.w.getParent();
                            WeakHashMap weakHashMap = oe1.a;
                            ee1.c(view);
                        }
                    }
                    if (qbVar.x != null) {
                        qbVar.n.getDecorView().post(qbVar.y);
                    }
                } else {
                    qbVar.v = null;
                }
            }
            qbVar.J();
            qbVar.v = qbVar.v;
        }
        qbVar.J();
        a6 a6Var3 = qbVar.v;
        if (a6Var3 != null) {
            return ahVar.e(a6Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.c.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.c.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.c.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.e) {
            this.c.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof rk0)) {
            return this.c.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        qa1 qa1Var = this.d;
        if (qa1Var != null) {
            View view = i == 0 ? new View(qa1Var.c.j.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.c.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.c.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            qb qbVar = this.h;
            qbVar.B();
            th1 th1Var = qbVar.p;
            if (th1Var != null) {
                th1Var.o(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.g) {
            this.c.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        qb qbVar = this.h;
        if (i == 108) {
            qbVar.B();
            th1 th1Var = qbVar.p;
            if (th1Var != null) {
                th1Var.o(false);
                return;
            }
            return;
        }
        if (i == 0) {
            pb pbVarA = qbVar.A(i);
            if (pbVarA.m) {
                qbVar.s(pbVarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        kg1.a(this.c, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        rk0 rk0Var = menu instanceof rk0 ? (rk0) menu : null;
        if (i == 0 && rk0Var == null) {
            return false;
        }
        if (rk0Var != null) {
            rk0Var.x = true;
        }
        qa1 qa1Var = this.d;
        if (qa1Var != null && i == 0) {
            ra1 ra1Var = qa1Var.c;
            if (!ra1Var.m) {
                ra1Var.j.l = true;
                ra1Var.m = true;
            }
        }
        boolean zOnPreparePanel = this.c.onPreparePanel(i, view, menu);
        if (rk0Var != null) {
            rk0Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        rk0 rk0Var = this.h.A(0).h;
        if (rk0Var != null) {
            d(list, rk0Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return ig1.a(this.c, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.c.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.c.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return i != 0 ? ig1.b(this.c, callback, i) : e(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return e(callback);
    }
}
