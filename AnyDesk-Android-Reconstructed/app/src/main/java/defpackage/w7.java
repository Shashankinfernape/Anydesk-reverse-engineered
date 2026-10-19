package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.anydesk.anydeskandroid.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w7 extends eo implements DialogInterface, sa {
    public qb f;
    public final rb g;
    public final u7 h;

    /* JADX WARN: Type inference failed for: r2v2, types: [rb] */
    public w7(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(contextThemeWrapper, i2);
        this.g = new ce0() { // from class: rb
            @Override // defpackage.ce0
            public final boolean a(KeyEvent keyEvent) {
                return this.c.i(keyEvent);
            }
        };
        bb bbVarE = e();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((qb) bbVarE).U = iG;
        bbVarE.d();
        this.h = new u7(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.eo, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        qb qbVar = (qb) e();
        qbVar.w();
        ((ViewGroup) qbVar.B.findViewById(android.R.id.content)).addView(view, layoutParams);
        qbVar.o.a(qbVar.n.getCallback());
    }

    public final Button d(int i) {
        u7 u7Var = this.h;
        if (i == -3) {
            return u7Var.o;
        }
        if (i == -2) {
            return u7Var.l;
        }
        if (i == -1) {
            return u7Var.i;
        }
        u7Var.getClass();
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return r71.p(this.g, getWindow().getDecorView(), this, keyEvent);
    }

    public final bb e() {
        if (this.f == null) {
            za zaVar = bb.c;
            this.f = new qb(getContext(), getWindow(), this, this);
        }
        return this.f;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        qb qbVar = (qb) e();
        qbVar.w();
        return qbVar.n.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eo, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View view;
        View viewFindViewById;
        f(bundle);
        u7 u7Var = this.h;
        u7Var.b.setContentView(u7Var.A);
        Context context = u7Var.a;
        Window window = u7Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view2 = u7Var.g;
        if (view2 == null) {
            view2 = null;
        }
        boolean z = false;
        Object[] objArr = 0;
        boolean z2 = view2 != null;
        if (!z2 || !u7.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (u7Var.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (u7Var.f != null) {
                ((LinearLayout.LayoutParams) ((pf0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupC = u7.c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupC2 = u7.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC3 = u7.c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        u7Var.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        u7Var.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(android.R.id.message);
        u7Var.w = textView;
        if (textView != null) {
            CharSequence charSequence = u7Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                u7Var.r.removeView(u7Var.w);
                if (u7Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) u7Var.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(u7Var.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(u7Var.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupC2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupC3.findViewById(android.R.id.button1);
        u7Var.i = button;
        b bVar = u7Var.G;
        button.setOnClickListener(bVar);
        boolean zIsEmpty = TextUtils.isEmpty(u7Var.j);
        Button button2 = u7Var.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(u7Var.j);
            u7Var.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupC3.findViewById(android.R.id.button2);
        u7Var.l = button3;
        button3.setOnClickListener(bVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(u7Var.m);
        Button button4 = u7Var.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(u7Var.m);
            u7Var.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupC3.findViewById(android.R.id.button3);
        u7Var.o = button5;
        button5.setOnClickListener(bVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(u7Var.p);
        Button button6 = u7Var.o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(u7Var.p);
            u7Var.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = u7Var.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = u7Var.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = u7Var.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupC3.setVisibility(8);
        }
        if (u7Var.x != null) {
            viewGroupC.addView(u7Var.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            u7Var.u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(u7Var.d) || !u7Var.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                u7Var.u.setVisibility(8);
                viewGroupC.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                u7Var.v = textView2;
                textView2.setText(u7Var.d);
                int i2 = u7Var.s;
                if (i2 != 0) {
                    u7Var.u.setImageResource(i2);
                } else {
                    Drawable drawable = u7Var.t;
                    if (drawable != null) {
                        u7Var.u.setImageDrawable(drawable);
                    } else {
                        u7Var.v.setPadding(u7Var.u.getPaddingLeft(), u7Var.u.getPaddingTop(), u7Var.u.getPaddingRight(), u7Var.u.getPaddingBottom());
                        u7Var.u.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupC3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupC2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = u7Var.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (u7Var.e == null && u7Var.f == null) ? null : viewGroupC.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupC2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = u7Var.f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z4 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.c, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.d);
            }
        }
        if (!z3) {
            View view3 = u7Var.f;
            if (view3 == null) {
                view3 = u7Var.r;
            }
            if (view3 != null) {
                int i4 = i3 | (z4 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 23) {
                    WeakHashMap weakHashMap = oe1.a;
                    if (i5 >= 23) {
                        he1.b(view3, i4, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupC2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupC2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i4 & 1) == 0) {
                        viewGroupC2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 == null || (i4 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupC2.removeView(viewFindViewById12);
                        view = null;
                    }
                    if (viewFindViewById11 != null || view != null) {
                        if (u7Var.e != null) {
                            u7Var.r.setOnScrollChangeListener(new bc(viewFindViewById11, view, 5, z));
                            u7Var.r.post(new o7(u7Var, viewFindViewById11, view, objArr == true ? 1 : 0));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = u7Var.f;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new p7(viewFindViewById11, view));
                                u7Var.f.post(new o7(u7Var, viewFindViewById11, view, 1));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupC2.removeView(viewFindViewById11);
                                }
                                if (view != null) {
                                    viewGroupC2.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = u7Var.f;
        if (alertController$RecycleListView3 == null || (listAdapter = u7Var.y) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i6 = u7Var.z;
        if (i6 > -1) {
            alertController$RecycleListView3.setItemChecked(i6, true);
            alertController$RecycleListView3.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.eo, android.app.Dialog
    public final void onStop() {
        super.onStop();
        qb qbVar = (qb) e();
        qbVar.B();
        th1 th1Var = qbVar.p;
        if (th1Var != null) {
            th1Var.T(false);
        }
    }

    @Override // defpackage.eo, android.app.Dialog
    public final void setContentView(int i) {
        c();
        e().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().l(getContext().getString(i));
    }

    @Override // defpackage.eo, android.app.Dialog
    public final void setContentView(View view) {
        c();
        e().j(view);
    }

    @Override // defpackage.eo, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        u7 u7Var = this.h;
        u7Var.d = charSequence;
        TextView textView = u7Var.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
