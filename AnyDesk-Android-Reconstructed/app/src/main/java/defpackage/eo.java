package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class eo extends Dialog implements gf0, g01 {
    public if0 c;
    public final ui0 d;
    public final wq0 e;

    public eo(Context context, int i) {
        super(context, i);
        this.d = new ui0(new f01(this, new y(8, this)), 8);
        this.e = new wq0(new l(7, this));
    }

    public static void a(eo eoVar) {
        super.onBackPressed();
    }

    @Override // defpackage.gf0
    public final if0 R() {
        if0 if0Var = this.c;
        if (if0Var != null) {
            return if0Var;
        }
        if0 if0Var2 = new if0(this);
        this.c = if0Var2;
        return if0Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.g01
    public final ui0 b() {
        return (ui0) this.d.d;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.e.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            wq0 wq0Var = this.e;
            wq0Var.getClass();
            wq0Var.e = onBackInvokedDispatcher;
            wq0Var.d(wq0Var.g);
        }
        this.d.p(bundle);
        if0 if0Var = this.c;
        if (if0Var == null) {
            if0Var = new if0(this);
            this.c = if0Var;
        }
        if0Var.d(ze0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.d.q(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if0 if0Var = this.c;
        if (if0Var == null) {
            if0Var = new if0(this);
            this.c = if0Var;
        }
        if0Var.d(ze0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        if0 if0Var = this.c;
        if (if0Var == null) {
            if0Var = new if0(this);
            this.c = if0Var;
        }
        if0Var.d(ze0.ON_DESTROY);
        this.c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
