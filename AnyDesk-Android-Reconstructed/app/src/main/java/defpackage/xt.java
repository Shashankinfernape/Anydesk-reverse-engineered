package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class xt extends c40 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Z;
    public boolean i0;
    public Dialog k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final c a0 = new c(15, this);
    public final tt b0 = new tt(this);
    public final ut c0 = new ut(this);
    public int d0 = 0;
    public int e0 = 0;
    public boolean f0 = true;
    public boolean g0 = true;
    public int h0 = -1;
    public final vt j0 = new vt(0, this);
    public boolean o0 = false;

    @Override // defpackage.c40
    public void A0() {
        this.F = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = false;
            dialog.show();
            View decorView = this.k0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.c40
    public void B0() {
        this.F = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        Bundle bundle2;
        this.F = true;
        if (this.k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.k0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.c40
    public final void E0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E0(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.k0.onRestoreInstanceState(bundle2);
    }

    public final void O0(boolean z, boolean z2) {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        this.n0 = false;
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.k0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Z.getLooper()) {
                    onDismiss(this.k0);
                } else {
                    this.Z.post(this.a0);
                }
            }
        }
        this.l0 = true;
        if (this.h0 >= 0) {
            t40 t40VarE0 = e0();
            int i = this.h0;
            if (i < 0) {
                id.q(gr0.e(i, "Bad id: "));
                return;
            } else {
                t40VarE0.v(new r40(t40VarE0, null, i), z);
                this.h0 = -1;
                return;
            }
        }
        sf sfVar = new sf(e0());
        sfVar.p = true;
        sfVar.g(this);
        if (z) {
            sfVar.d(true);
        } else {
            sfVar.d(false);
        }
    }

    public Dialog P0(Bundle bundle) {
        if (t40.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new eo(I0(), this.e0);
    }

    public final void Q0(t40 t40Var, String str) {
        this.m0 = false;
        this.n0 = true;
        sf sfVar = new sf(t40Var);
        sfVar.p = true;
        sfVar.e(0, this, str, 1);
        sfVar.d(false);
    }

    @Override // defpackage.c40
    public final hq W() {
        return new wt(this, new y30(this));
    }

    @Override // defpackage.c40
    public final void n0() {
        this.F = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.l0) {
            return;
        }
        if (t40.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        O0(true, true);
    }

    @Override // defpackage.c40
    public void p0(Context context) {
        super.p0(context);
        this.S.f(this.j0);
        if (this.n0) {
            return;
        }
        this.m0 = false;
    }

    @Override // defpackage.c40
    public void q0(Bundle bundle) {
        super.q0(bundle);
        this.Z = new Handler();
        this.g0 = this.z == 0;
        if (bundle != null) {
            this.d0 = bundle.getInt("android:style", 0);
            this.e0 = bundle.getInt("android:theme", 0);
            this.f0 = bundle.getBoolean("android:cancelable", true);
            this.g0 = bundle.getBoolean("android:showsDialog", this.g0);
            this.h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.c40
    public void t0() {
        this.F = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = true;
            dialog.setOnDismissListener(null);
            this.k0.dismiss();
            if (!this.m0) {
                onDismiss(this.k0);
            }
            this.k0 = null;
            this.o0 = false;
        }
    }

    @Override // defpackage.c40
    public void u0() {
        this.F = true;
        if (!this.n0 && !this.m0) {
            this.m0 = true;
        }
        this.S.j(this.j0);
    }

    @Override // defpackage.c40
    public final LayoutInflater v0(Bundle bundle) {
        LayoutInflater layoutInflaterV0 = super.v0(bundle);
        boolean z = this.g0;
        if (z && !this.i0) {
            if (z && !this.o0) {
                try {
                    this.i0 = true;
                    Dialog dialogP0 = P0(bundle);
                    this.k0 = dialogP0;
                    if (this.g0) {
                        int i = this.d0;
                        if (i == 1 || i == 2) {
                            dialogP0.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogP0.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogP0.requestWindowFeature(1);
                        }
                        Context contextA0 = a0();
                        if (q51.p(contextA0)) {
                            this.k0.setOwnerActivity((Activity) contextA0);
                        }
                        this.k0.setCancelable(this.f0);
                        this.k0.setOnCancelListener(this.b0);
                        this.k0.setOnDismissListener(this.c0);
                        this.o0 = true;
                    } else {
                        this.k0 = null;
                    }
                    this.i0 = false;
                } catch (Throwable th) {
                    this.i0 = false;
                    throw th;
                }
            }
            if (t40.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.k0;
            if (dialog != null) {
                return layoutInflaterV0.cloneInContext(dialog.getContext());
            }
        } else if (t40.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.g0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterV0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterV0;
    }

    @Override // defpackage.c40
    public void z0(Bundle bundle) {
        Dialog dialog = this.k0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.d0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.e0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.h0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
