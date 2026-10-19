package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class kg0 implements b51 {
    public static final Method C;
    public static final Method D;
    public static final Method E;
    public boolean A;
    public final ac B;
    public final Context c;
    public ListAdapter d;
    public uv e;
    public int h;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public hg0 p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public AdapterView.OnItemSelectedListener s;
    public final Handler x;
    public Rect z;
    public final int f = -2;
    public int g = -2;
    public final int j = 1002;
    public int n = 0;
    public final int o = Integer.MAX_VALUE;
    public final gg0 t = new gg0(this, 1);
    public final jg0 u = new jg0(this);
    public final ig0 v = new ig0(this);
    public final gg0 w = new gg0(this, 0);
    public final Rect y = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                D = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public kg0(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.c = context;
        this.x = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.p, i, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.k = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        ac acVar = new ac(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yv0.t, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            bu0.C(acVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        acVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : ec1.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.B = acVar;
        acVar.setInputMethodMode(1);
    }

    public uv a(Context context, boolean z) {
        return new uv(context, z);
    }

    @Override // defpackage.b51
    public final boolean b() {
        return this.B.isShowing();
    }

    public final int c() {
        return this.h;
    }

    @Override // defpackage.b51
    public final void d() {
        int i;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        uv uvVar;
        uv uvVar2 = this.e;
        int i2 = 3;
        Context context = this.c;
        ac acVar = this.B;
        if (uvVar2 == null) {
            uv uvVarA = a(context, !this.A);
            this.e = uvVarA;
            uvVarA.setAdapter(this.d);
            this.e.setOnItemClickListener(this.r);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new f3(i2, this));
            this.e.setOnScrollListener(this.v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.s;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            acVar.setContentView(this.e);
        }
        Drawable background = acVar.getBackground();
        Rect rect = this.y;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.k) {
                this.i = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = acVar.getInputMethodMode() == 2;
        View view = this.q;
        int i4 = this.i;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = D;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(acVar, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = acVar.getMaxAvailableHeight(view, i4);
                }
            } else {
                iA = acVar.getMaxAvailableHeight(view, i4);
            }
        } else {
            iA = eg0.a(acVar, view, i4, z);
        }
        int i5 = this.f;
        if (i5 == -1) {
            paddingBottom = iA + i;
        } else {
            int i6 = this.g;
            if (i6 != -2) {
                iMakeMeasureSpec = i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.e.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.e.getPaddingBottom() + this.e.getPaddingTop() + i : 0);
        }
        boolean z2 = acVar.getInputMethodMode() == 2;
        bu0.E(acVar, this.j);
        if (acVar.isShowing()) {
            if (this.q.isAttachedToWindow()) {
                int width = this.g;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.q.getWidth();
                }
                if (i5 == -1) {
                    i5 = z2 ? paddingBottom : -1;
                    int i7 = this.g;
                    if (z2) {
                        acVar.setWidth(i7 == -1 ? -1 : 0);
                        acVar.setHeight(0);
                    } else {
                        acVar.setWidth(i7 == -1 ? -1 : 0);
                        acVar.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                acVar.setOutsideTouchable(true);
                int i8 = width;
                acVar.update(this.q, this.h, this.i, i8 < 0 ? -1 : i8, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.g;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.q.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        acVar.setWidth(width2);
        acVar.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(acVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            fg0.b(acVar, true);
        }
        acVar.setOutsideTouchable(true);
        acVar.setTouchInterceptor(this.u);
        if (this.m) {
            bu0.C(acVar, this.l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = E;
            if (method3 != null) {
                try {
                    method3.invoke(acVar, this.z);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            fg0.a(acVar, this.z);
        }
        acVar.showAsDropDown(this.q, this.h, this.i, this.n);
        this.e.setSelection(-1);
        if ((!this.A || this.e.isInTouchMode()) && (uvVar = this.e) != null) {
            uvVar.setListSelectionHidden(true);
            uvVar.requestLayout();
        }
        if (this.A) {
            return;
        }
        this.x.post(this.w);
    }

    @Override // defpackage.b51
    public final void dismiss() {
        ac acVar = this.B;
        acVar.dismiss();
        acVar.setContentView(null);
        this.e = null;
        this.x.removeCallbacks(this.t);
    }

    public final Drawable e() {
        return this.B.getBackground();
    }

    public final void h(Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.b51
    public final uv i() {
        return this.e;
    }

    public final void k(int i) {
        this.i = i;
        this.k = true;
    }

    public final void m(int i) {
        this.h = i;
    }

    public final int o() {
        if (this.k) {
            return this.i;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        hg0 hg0Var = this.p;
        if (hg0Var == null) {
            this.p = new hg0(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(hg0Var);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        uv uvVar = this.e;
        if (uvVar != null) {
            uvVar.setAdapter(this.d);
        }
    }

    public final void r(int i) {
        Drawable background = this.B.getBackground();
        if (background == null) {
            this.g = i;
            return;
        }
        Rect rect = this.y;
        background.getPadding(rect);
        this.g = rect.left + rect.right + i;
    }
}
