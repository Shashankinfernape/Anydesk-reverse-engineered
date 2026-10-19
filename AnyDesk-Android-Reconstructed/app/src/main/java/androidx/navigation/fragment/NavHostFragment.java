package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anydesk.anydeskandroid.R;
import defpackage.bo0;
import defpackage.c40;
import defpackage.g40;
import defpackage.g81;
import defpackage.lk0;
import defpackage.nh0;
import defpackage.q51;
import defpackage.sf;
import defpackage.vv0;
import defpackage.xt;
import defpackage.xv0;
import defpackage.y;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends c40 {
    public final g81 Z = new g81(new y(6, this));
    public View a0;
    public int b0;
    public boolean c0;

    public static final bo0 O0(c40 c40Var) {
        Dialog dialog;
        Window window;
        c40Var.getClass();
        for (c40 c40Var2 = c40Var; c40Var2 != null; c40Var2 = c40Var2.x) {
            if (c40Var2 instanceof NavHostFragment) {
                return ((NavHostFragment) c40Var2).P0();
            }
            c40 c40Var3 = c40Var2.e0().x;
            if (c40Var3 instanceof NavHostFragment) {
                return ((NavHostFragment) c40Var3).P0();
            }
        }
        View view = c40Var.H;
        if (view != null) {
            return lk0.o(view);
        }
        xt xtVar = c40Var instanceof xt ? (xt) c40Var : null;
        View decorView = (xtVar == null || (dialog = xtVar.k0) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return lk0.o(decorView);
        }
        nh0.j(q51.l("Fragment ", c40Var, " does not have a NavController set"));
        return null;
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            nh0.t(view, " is not a ViewGroup", "created host view ");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, P0());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.a0 = view2;
            if (view2.getId() == this.y) {
                View view3 = this.a0;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, P0());
            }
        }
    }

    public final bo0 P0() {
        return (bo0) this.Z.getValue();
    }

    @Override // defpackage.c40
    public final void p0(Context context) {
        context.getClass();
        super.p0(context);
        if (this.c0) {
            sf sfVar = new sf(e0());
            sfVar.i(this);
            sfVar.d(false);
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        P0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.c0 = true;
            sf sfVar = new sf(e0());
            sfVar.i(this);
            sfVar.d(false);
        }
        super.q0(bundle);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        g40 g40Var = new g40(context);
        int i = this.y;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        g40Var.setId(i);
        return g40Var;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        View view = this.a0;
        if (view != null && lk0.o(view) == P0()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.a0 = null;
    }

    @Override // defpackage.c40
    public final void w0(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.w0(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vv0.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.b0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, xv0.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.c0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // defpackage.c40
    public final void z0(Bundle bundle) {
        if (this.c0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
