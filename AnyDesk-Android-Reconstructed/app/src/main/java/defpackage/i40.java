package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class i40 implements LayoutInflater.Factory2 {
    public final t40 c;

    public i40(t40 t40Var) {
        this.c = t40Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        i50 i50VarF;
        boolean zEquals = g40.class.getName().equals(str);
        t40 t40Var = this.c;
        if (zEquals) {
            return new g40(context, attributeSet, t40Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uv0.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = c40.class.isAssignableFrom(n40.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    c40 c40VarA = resourceId != -1 ? t40Var.A(resourceId) : null;
                    if (c40VarA == null && string != null) {
                        c40VarA = t40Var.B(string);
                    }
                    if (c40VarA == null && id != -1) {
                        c40VarA = t40Var.A(id);
                    }
                    if (c40VarA == null) {
                        n40 n40VarE = t40Var.E();
                        context.getClassLoader();
                        c40VarA = n40VarE.a(attributeValue);
                        c40VarA.p = true;
                        c40VarA.y = resourceId != 0 ? resourceId : id;
                        c40VarA.z = id;
                        c40VarA.A = string;
                        c40VarA.q = true;
                        c40VarA.u = t40Var;
                        e40 e40Var = t40Var.u;
                        c40VarA.v = e40Var;
                        c40VarA.w0(e40Var.t, attributeSet, c40VarA.d);
                        i50VarF = t40Var.a(c40VarA);
                        if (t40.H(2)) {
                            Log.v("FragmentManager", "Fragment " + c40VarA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (c40VarA.q) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        c40VarA.q = true;
                        c40VarA.u = t40Var;
                        e40 e40Var2 = t40Var.u;
                        c40VarA.v = e40Var2;
                        c40VarA.w0(e40Var2.t, attributeSet, c40VarA.d);
                        i50VarF = t40Var.f(c40VarA);
                        if (t40.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + c40VarA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    j50 j50Var = k50.a;
                    k50.b(new g50(c40VarA, "Attempting to use <fragment> tag to add fragment " + c40VarA + " to container " + viewGroup));
                    k50.a(c40VarA).getClass();
                    c40VarA.G = viewGroup;
                    i50VarF.k();
                    i50VarF.j();
                    View view2 = c40VarA.H;
                    if (view2 == null) {
                        nh0.j(gr0.f("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (c40VarA.H.getTag() == null) {
                        c40VarA.H.setTag(string);
                    }
                    c40VarA.H.addOnAttachStateChangeListener(new h40(this, i50VarF));
                    return c40VarA.H;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
