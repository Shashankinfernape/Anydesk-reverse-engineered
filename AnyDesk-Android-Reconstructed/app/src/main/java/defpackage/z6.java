package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class z6 extends c40 implements l80, View.OnApplyWindowInsetsListener {
    public i80 Z;
    public m80 a0;

    @Override // defpackage.c40
    public void A0() {
        DrawerLayout drawerLayout;
        ImageView imageView;
        this.F = true;
        i80 i80Var = this.Z;
        if (i80Var != null) {
            boolean zP0 = P0();
            MainActivity mainActivity = (MainActivity) i80Var;
            th1 th1VarX = mainActivity.X();
            if (th1VarX != null) {
                if (zP0) {
                    th1VarX.V();
                } else {
                    th1VarX.w();
                }
            }
            boolean z = this instanceof MainFragment;
            th1 th1VarX2 = mainActivity.X();
            if (th1VarX2 != null && (drawerLayout = mainActivity.L) != null && (imageView = mainActivity.O) != null) {
                if (z) {
                    Bitmap bitmapR = MainApplication.v().r();
                    if (bitmapR != null) {
                        new BitmapDrawable(mainActivity.getResources(), bitmapR);
                        imageView.setImageDrawable(new BitmapDrawable(mainActivity.getResources(), bitmapR));
                    } else {
                        imageView.setImageResource(R.drawable.about_logo_anydesk_tint);
                    }
                    Drawable navigationIcon = mainActivity.N.getNavigationIcon();
                    Looper looper = t70.a;
                    r3.t(navigationIcon, uj.l(mainActivity, R.color.colorToolbarBurger));
                    th1VarX2.R(false);
                    th1VarX2.Q(true);
                    drawerLayout.setDrawerLockMode(0);
                } else {
                    imageView.setImageDrawable(null);
                    Drawable navigationIcon2 = mainActivity.N.getNavigationIcon();
                    Looper looper2 = t70.a;
                    r3.t(navigationIcon2, uj.l(mainActivity, R.color.colorToolBarText));
                    th1VarX2.R(true);
                    th1VarX2.Q(false);
                    drawerLayout.setDrawerLockMode(1);
                }
            }
        }
        Window windowO0 = O0();
        if (windowO0 == null) {
            return;
        }
        windowO0.getDecorView().setOnApplyWindowInsetsListener(this);
    }

    @Override // defpackage.c40
    public void B0() {
        this.F = true;
        Window windowO0 = O0();
        if (windowO0 == null) {
            return;
        }
        windowO0.getDecorView().setOnApplyWindowInsetsListener(null);
    }

    @Override // defpackage.c40
    public void C0(View view, Bundle bundle) {
        i80 i80Var = this.Z;
        if (i80Var != null) {
            boolean zP0 = P0();
            th1 th1VarX = ((MainActivity) i80Var).X();
            if (th1VarX != null) {
                if (zP0) {
                    th1VarX.V();
                } else {
                    th1VarX.w();
                }
            }
        }
        m80 m80Var = this.a0;
        if (m80Var != null) {
            boolean zQ0 = Q0();
            dj djVar = ((MainActivity) m80Var).U;
            if (djVar != null) {
                djVar.c = zQ0;
                djVar.p();
            }
        }
    }

    public final Window O0() {
        qa qaVarY = Y();
        if (qaVarY == null) {
            return null;
        }
        return qaVarY.getWindow();
    }

    public abstract boolean P0();

    public boolean Q0() {
        return this instanceof MainFragment;
    }

    public boolean h(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (keyCode != 111) {
            return false;
        }
        if (action == 1) {
            uj.x(Y());
        }
        return true;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!t70.I()) {
            return view.onApplyWindowInsets(windowInsets);
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        view.setBackgroundColor(uj.l(a0(), R.color.colorMainBackground));
        return WindowInsets.CONSUMED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public void p0(Context context) {
        super.p0(context);
        if (!(context instanceof i80)) {
            cb1.d(context, " must implement IDrawerControl");
            return;
        }
        this.Z = (i80) context;
        if (context instanceof m80) {
            this.a0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.c40
    public void u0() {
        this.F = true;
        this.a0 = null;
        this.Z = null;
    }

    @Override // defpackage.c40
    public void x0() {
        this.F = true;
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).s0(this);
        }
    }

    @Override // defpackage.c40
    public void y0() {
        this.F = true;
        if (this.a0 != null) {
            zd zdVar = MainActivity.j0;
            synchronized (zdVar) {
                zdVar.add(this);
            }
        }
    }
}
