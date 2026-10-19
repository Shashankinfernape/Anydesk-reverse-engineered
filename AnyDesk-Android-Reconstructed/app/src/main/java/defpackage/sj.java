package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sj extends al0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public hl0 y;
    public ViewTreeObserver z;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final b3 k = new b3(3, this);
    public final qj l = new qj(0, this);
    public final af1 m = new af1(25, this);
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    public sj(Context context, View view, int i, boolean z) {
        this.d = context;
        this.p = view;
        this.f = i;
        this.g = z;
        this.r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (rk0Var == ((rj) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((rj) arrayList.get(i2)).b.c(false);
        }
        rj rjVar = (rj) arrayList.remove(i);
        rk0 rk0Var2 = rjVar.b;
        gl0 gl0Var = rjVar.a;
        ac acVar = gl0Var.B;
        rk0Var2.r(this);
        if (this.B) {
            if (Build.VERSION.SDK_INT >= 23) {
                dl0.b(acVar, null);
            }
            acVar.setAnimationStyle(0);
        }
        gl0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.r = ((rj) arrayList.get(size2 - 1)).c;
        } else {
            this.r = this.p.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((rj) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        hl0 hl0Var = this.y;
        if (hl0Var != null) {
            hl0Var.a(rk0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // defpackage.b51
    public final boolean b() {
        ArrayList arrayList = this.j;
        return arrayList.size() > 0 && ((rj) arrayList.get(0)).a.B.isShowing();
    }

    @Override // defpackage.b51
    public final void d() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((rk0) obj);
        }
        arrayList.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // defpackage.b51
    public final void dismiss() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        if (size > 0) {
            rj[] rjVarArr = (rj[]) arrayList.toArray(new rj[size]);
            for (int i = size - 1; i >= 0; i--) {
                rj rjVar = rjVarArr[i];
                if (rjVar.a.B.isShowing()) {
                    rjVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.il0
    public final void f(hl0 hl0Var) {
        this.y = hl0Var;
    }

    @Override // defpackage.il0
    public final void h() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((rj) obj).a.e.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ok0) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.b51
    public final uv i() {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((rj) arrayList.get(arrayList.size() - 1)).a.e;
    }

    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rj rjVar = (rj) obj;
            if (q71Var == rjVar.b) {
                rjVar.a.e.requestFocus();
                return true;
            }
        }
        if (!q71Var.hasVisibleItems()) {
            return false;
        }
        n(q71Var);
        hl0 hl0Var = this.y;
        if (hl0Var != null) {
            hl0Var.v(q71Var);
        }
        return true;
    }

    @Override // defpackage.il0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.il0
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.al0
    public final void n(rk0 rk0Var) {
        rk0Var.b(this, this.d);
        if (b()) {
            w(rk0Var);
        } else {
            this.i.add(rk0Var);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        rj rjVar;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                rjVar = null;
                break;
            }
            rjVar = (rj) arrayList.get(i);
            if (!rjVar.a.B.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (rjVar != null) {
            rjVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.al0
    public final void p(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = Gravity.getAbsoluteGravity(this.n, view.getLayoutDirection());
        }
    }

    @Override // defpackage.al0
    public final void q(boolean z) {
        this.w = z;
    }

    @Override // defpackage.al0
    public final void r(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = Gravity.getAbsoluteGravity(i, this.p.getLayoutDirection());
        }
    }

    @Override // defpackage.al0
    public final void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.al0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // defpackage.al0
    public final void u(boolean z) {
        this.x = z;
    }

    @Override // defpackage.al0
    public final void v(int i) {
        this.t = true;
        this.v = i;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    public final void w(rk0 rk0Var) {
        boolean z;
        char c;
        View childAt;
        rj rjVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        ok0 ok0Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ok0 ok0Var2 = new ok0(rk0Var, layoutInflaterFrom, this.g, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.w) {
            ok0Var2.c = true;
        } else if (b()) {
            int size = rk0Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = rk0Var.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            ok0Var2.c = z;
        }
        int iO = al0.o(ok0Var2, context, this.e);
        gl0 gl0Var = new gl0(context, null, this.f, 0);
        gl0Var.F = this.m;
        gl0Var.r = this;
        ac acVar = gl0Var.B;
        acVar.setOnDismissListener(this);
        gl0Var.q = this.p;
        gl0Var.n = this.o;
        gl0Var.A = true;
        acVar.setFocusable(true);
        acVar.setInputMethodMode(2);
        gl0Var.q(ok0Var2);
        gl0Var.r(iO);
        gl0Var.n = this.o;
        ArrayList arrayList = this.j;
        if (arrayList.size() > 0) {
            rjVar = (rj) arrayList.get(arrayList.size() - 1);
            rk0 rk0Var2 = rjVar.b;
            int size2 = rk0Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = rk0Var2.getItem(i5);
                if (item.hasSubMenu() && rk0Var == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                uv uvVar = rjVar.a.e;
                ListAdapter adapter = uvVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ok0Var = (ok0) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ok0Var = (ok0) adapter;
                    headersCount = 0;
                }
                int count = ok0Var.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == ok0Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - uvVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < uvVar.getChildCount()) ? uvVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            rjVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = gl0.G;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(acVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                el0.a(acVar, false);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                dl0.a(acVar, null);
            }
            uv uvVar2 = ((rj) arrayList.get(arrayList.size() - 1)).a.e;
            int[] iArr = new int[2];
            uvVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.q.getWindowVisibleDisplayFrame(rect);
            if (this.r == 1) {
                if (uvVar2.getWidth() + iArr[0] + iO > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.r = i;
            if (i7 >= 26) {
                gl0Var.q = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.p.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.o & 7) == 5) {
                    iArr2[0] = this.p.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i8 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i8;
            }
            if ((this.o & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iO;
            } else if (z2) {
                width = i3 + iO;
            } else {
                iO = childAt.getWidth();
            }
            gl0Var.h = width;
            gl0Var.m = true;
            gl0Var.l = true;
            gl0Var.k(i2);
        } else {
            if (this.s) {
                gl0Var.h = this.u;
            }
            if (this.t) {
                gl0Var.k(this.v);
            }
            Rect rect2 = this.c;
            gl0Var.z = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new rj(gl0Var, rk0Var, this.r));
        gl0Var.d();
        uv uvVar3 = gl0Var.e;
        uvVar3.setOnKeyListener(this);
        if (rjVar == null && this.x && rk0Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) uvVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(rk0Var.m);
            uvVar3.addHeaderView(frameLayout, null, false);
            gl0Var.d();
        }
    }

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
    }
}
