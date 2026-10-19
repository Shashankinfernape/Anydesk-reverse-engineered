package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe1 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static ThreadLocal d;
    public static final be1 e = new be1();
    public static final de1 f = new de1();

    public static df1 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        df1 df1Var = (df1) a.get(view);
        if (df1Var != null) {
            return df1Var;
        }
        df1 df1Var2 = new df1(view);
        a.put(view, df1Var2);
        return df1Var2;
    }

    public static void b(View view, gh1 gh1Var) {
        WindowInsets windowInsetsF = gh1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? le1.a(view, windowInsetsF) : ee1.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            gh1.g(windowInsetsA, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = ne1.d;
        ne1 ne1Var = (ne1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (ne1Var == null) {
            ne1Var = new ne1();
            ne1Var.a = null;
            ne1Var.b = null;
            ne1Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, ne1Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = ne1Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = ne1.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (ne1Var.a == null) {
                            ne1Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = ne1.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                ne1Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    ne1Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = ne1Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (ne1Var.b == null) {
                    ne1Var.b = new SparseArray();
                }
                ne1Var.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ke1.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static Rect f() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(vb vbVar) {
        return Build.VERSION.SDK_INT >= 31 ? me1.a(vbVar) : (String[]) vbVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i2 >= 28) {
                tag = je1.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i2 >= 28) {
                        objA = je1.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i2 >= 28) {
                objA = je1.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void i(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectF = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectF.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            p(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                p((View) parent2);
            }
        }
        if (z && rectF.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectF);
        }
    }

    public static void j(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectF = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectF.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            p(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                p((View) parent2);
            }
        }
        if (z && rectF.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nq k(View view, nq nqVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + nqVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return me1.b(view, nqVar);
        }
        v91 v91Var = (v91) view.getTag(R.id.tag_on_receive_content_listener);
        zq0 zq0Var = e;
        if (v91Var == null) {
            if (view instanceof zq0) {
                zq0Var = (zq0) view;
            }
            return zq0Var.a(nqVar);
        }
        nq nqVarA = v91.a(view, nqVar);
        if (nqVarA == null) {
            return null;
        }
        if (view instanceof zq0) {
            zq0Var = (zq0) view;
        }
        return zq0Var.a(nqVarA);
    }

    public static void l(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            if (((q3) arrayListE.get(i2)).a() == i) {
                arrayListE.remove(i2);
                return;
            }
        }
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ke1.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, o3 o3Var) {
        if (o3Var == null && (d(view) instanceof n3)) {
            o3Var = new o3();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(o3Var == null ? null : o3Var.b);
    }

    public static void o(View view, CharSequence charSequence) {
        new ce1(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        de1 de1Var = f;
        if (charSequence == null) {
            de1Var.c.remove(view);
            view.removeOnAttachStateChangeListener(de1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(de1Var);
        } else {
            de1Var.c.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(de1Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(de1Var);
            }
        }
    }

    public static void p(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
