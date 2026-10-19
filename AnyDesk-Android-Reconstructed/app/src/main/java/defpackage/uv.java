package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.anydesk.anydeskandroid.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class uv extends ListView {
    public final Rect c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public sv i;
    public boolean j;
    public final boolean k;
    public boolean l;
    public mg0 m;
    public c n;

    public uv(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:81:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017c  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        mg0 mg0Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
                if (z || z2) {
                    this.l = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.h - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                mg0Var = this.m;
                if (z) {
                    if (mg0Var == null) {
                        this.m = new mg0(this);
                    }
                    mg0 mg0Var2 = this.m;
                    boolean z3 = mg0Var2.r;
                    mg0Var2.r = true;
                    mg0Var2.onTouch(this, motionEvent);
                } else if (mg0Var != null) {
                    if (mg0Var.r) {
                        mg0Var.d();
                    }
                    mg0Var.r = false;
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.l = true;
                pv.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.h;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.h = iPointToPosition;
                pv.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.c;
                rect.set(left, top, right, bottom);
                rect.left -= this.d;
                rect.top -= this.e;
                rect.right += this.f;
                rect.bottom += this.g;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = rv.a(this);
                } else {
                    Field field = tv.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z5 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        rv.b(this, z5);
                    } else {
                        Field field2 = tv.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                sv svVar = this.i;
                if (svVar != null) {
                    svVar.d = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        mg0Var = this.m;
        if (z) {
            if (mg0Var == null) {
                this.m = new mg0(this);
            }
            mg0 mg0Var3 = this.m;
            boolean z6 = mg0Var3.r;
            mg0Var3.r = true;
            mg0Var3.onTouch(this, motionEvent);
        } else if (mg0Var != null) {
            if (mg0Var.r) {
                mg0Var.d();
            }
            mg0Var.r = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.n != null) {
            return;
        }
        super.drawableStateChanged();
        sv svVar = this.i;
        if (svVar != null) {
            svVar.d = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            c cVar = new c(18, this);
            this.n = cVar;
            post(cVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !qv.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        qv.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        qv.b.invoke(this, Integer.valueOf(iPointToPosition));
                        qv.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.l && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        c cVar = this.n;
        if (cVar != null) {
            uv uvVar = (uv) cVar.d;
            uvVar.n = null;
            uvVar.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        sv svVar = null;
        if (drawable != null) {
            sv svVar2 = new sv();
            Drawable drawable2 = svVar2.c;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            svVar2.c = drawable;
            drawable.setCallback(svVar2);
            svVar2.d = true;
            svVar = svVar2;
        }
        this.i = svVar;
        super.setSelector(svVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
