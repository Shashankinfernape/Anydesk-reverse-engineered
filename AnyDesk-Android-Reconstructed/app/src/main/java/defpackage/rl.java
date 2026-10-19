package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rl extends o3 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final fw p = new fw(17);
    public static final fw q = new fw(18);
    public final AccessibilityManager h;
    public final Chip i;
    public ky j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public rl(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = oe1.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.o3
    public final af1 b(View view) {
        if (this.j == null) {
            this.j = new ky(this);
        }
        return this.j;
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        tl tlVar = chip.g;
        accessibilityNodeInfo.setCheckable(tlVar != null && tlVar.S);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        w3Var.j(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            w3Var.q(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.n;
            chip.p = false;
            chip.refreshDrawableState();
        }
        p(i, 8);
        return true;
    }

    public final w3 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        w3 w3Var = new w3(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        w3Var.j("android.view.View");
        Rect rect = o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
        if (i == 1) {
            Chip chip2 = this.n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            w3Var.b(q3.g);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.z);
        }
        if (w3Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        w3Var.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        w3Var.b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            w3Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            w3Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            w3Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            w3Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            w3Var.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo.setVisibleToUser(true);
                    }
                }
            }
        }
        return w3Var;
    }

    public final void l(ArrayList arrayList) {
        tl tlVar;
        arrayList.add(0);
        Rect rect = Chip.z;
        Chip chip = this.n;
        if (!chip.c() || (tlVar = chip.g) == null || !tlVar.M || chip.j == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    public final boolean m(int i, Rect rect) {
        Object obj;
        w3 w3Var;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        x51 x51Var = new x51(0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            x51Var.e(((Integer) arrayList.get(i2)).intValue(), k(((Integer) arrayList.get(i2)).intValue()));
        }
        int i3 = this.l;
        int iD = Integer.MIN_VALUE;
        w3 w3Var2 = i3 == Integer.MIN_VALUE ? null : (w3) x51Var.c(i3);
        fw fwVar = p;
        fw fwVar2 = q;
        Chip chip = this.i;
        int i4 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = oe1.a;
            boolean z = chip.getLayoutDirection() == 1;
            fwVar2.getClass();
            int iF = x51Var.f();
            ArrayList arrayList2 = new ArrayList(iF);
            for (int i5 = 0; i5 < iF; i5++) {
                arrayList2.add((w3) x51Var.g(i5));
            }
            Collections.sort(arrayList2, new b30(fwVar, z));
            if (i == 1) {
                int size = arrayList2.size();
                if (w3Var2 != null) {
                    size = arrayList2.indexOf(w3Var2);
                }
                int i6 = size - 1;
                obj = i6 >= 0 ? arrayList2.get(i6) : null;
            } else {
                if (i != 2) {
                    id.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (w3Var2 == null ? -1 : arrayList2.lastIndexOf(w3Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
            }
            w3Var = (w3) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                id.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.l;
            if (i7 != Integer.MIN_VALUE) {
                n(i7).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    id.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            fwVar2.getClass();
            int iF2 = x51Var.f();
            Rect rect4 = new Rect();
            w3Var = null;
            for (int i8 = 0; i8 < iF2; i8++) {
                w3 w3Var3 = (w3) x51Var.g(i8);
                if (w3Var3 != w3Var2) {
                    fwVar.getClass();
                    w3Var3.f(rect4);
                    if (ec1.u(i, rect2, rect4)) {
                        if (!ec1.u(i, rect2, rect3) || ec1.e(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            w3Var = w3Var3;
                        } else if (!ec1.e(i, rect2, rect3, rect4)) {
                            int iY = ec1.y(i, rect2, rect4);
                            int iZ = ec1.z(i, rect2, rect4);
                            int i9 = (iZ * iZ) + (iY * 13 * iY);
                            int iY2 = ec1.y(i, rect2, rect3);
                            int iZ2 = ec1.z(i, rect2, rect3);
                            if (i9 < (iZ2 * iZ2) + (iY2 * 13 * iY2)) {
                                rect3.set(rect4);
                                w3Var = w3Var3;
                            }
                        }
                    }
                }
            }
        }
        w3 w3Var4 = w3Var;
        if (w3Var4 != null) {
            if (x51Var.c) {
                r71.b(x51Var);
            }
            int i10 = x51Var.f;
            for (int i11 = 0; i11 < i10; i11++) {
                if (x51Var.e[i11] == w3Var4) {
                    i4 = i11;
                    break;
                }
            }
            iD = x51Var.d(i4);
        }
        return o(iD);
    }

    public final w3 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        w3 w3Var = new w3(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = oe1.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w3Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return w3Var;
    }

    public final boolean o(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        if (i == 1) {
            Chip chip2 = this.n;
            chip2.p = true;
            chip2.refreshDrawableState();
        }
        p(i, 8);
        return true;
    }

    public final void p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            w3 w3VarN = n(i);
            accessibilityEventObtain.getText().add(w3VarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = w3VarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
