package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class bp0 implements pk0, nq0 {
    public final /* synthetic */ NavigationView c;

    public /* synthetic */ bp0(NavigationView navigationView) {
        this.c = navigationView;
    }

    @Override // defpackage.pk0
    public boolean f(rk0 rk0Var, MenuItem menuItem) {
        cp0 cp0Var = this.c.l;
        if (cp0Var == null) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) cp0Var;
        Logging logging = mainActivity.C;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_address_book) {
            uj.v(mainActivity, R.id.abookFragment);
        } else if (itemId == R.id.nav_recordings) {
            if (r3.n(mainActivity, mainActivity.d0, logging)) {
                mainActivity.t0();
            }
        } else if (itemId == R.id.nav_downloads) {
            if (r3.n(mainActivity, mainActivity.e0, logging)) {
                MainApplication.v().L();
            }
        } else if (itemId == R.id.nav_settings) {
            MainApplication.v().B(R.id.settingsFragment, v11.c);
        } else if (itemId == R.id.nav_setup) {
            uj.v(mainActivity, R.id.setupFragment);
        } else if (itemId == R.id.nav_tutorial) {
            mainActivity.x0();
        } else if (itemId == R.id.nav_help) {
            Looper looper = t70.a;
            t70.U(mainActivity, JniAdExt.o1("ad.menu.help.android.href"));
        } else if (itemId == R.id.nav_plugin_ad1) {
            t70.P(mainActivity, logging);
        } else if (itemId == R.id.nav_about) {
            uj.v(mainActivity, R.id.aboutFragment);
        } else if (itemId == R.id.nav_privacy_statement) {
            bc bcVar = mainActivity.D;
            if (bcVar != null) {
                bcVar.p0(new bv0(), "PrivacyPolicyDialog", true);
            }
        } else if (itemId == R.id.nav_exit) {
            MainApplication mainApplicationV = MainApplication.v();
            mainApplicationV.N();
            ei0 ei0Var = mainApplicationV.m0;
            mainApplicationV.d.e("waiting for service termination...");
            new fi0(mainApplicationV, ei0Var).start();
        }
        DrawerLayout drawerLayout = mainActivity.L;
        if (drawerLayout != null) {
            drawerLayout.d();
        }
        return true;
    }

    @Override // defpackage.nq0
    public gh1 l(View view, gh1 gh1Var) {
        NavigationView navigationView = this.c;
        if (navigationView.d == null) {
            navigationView.d = new Rect();
        }
        Rect rect = navigationView.d;
        int iB = gh1Var.b();
        dh1 dh1Var = gh1Var.a;
        rect.set(iB, gh1Var.d(), gh1Var.c(), gh1Var.a());
        yo0 yo0Var = navigationView.k;
        yo0Var.getClass();
        int iD = gh1Var.d();
        if (yo0Var.B != iD) {
            yo0Var.B = iD;
            int i = (yo0Var.d.getChildCount() <= 0 && yo0Var.z) ? yo0Var.B : 0;
            NavigationMenuView navigationMenuView = yo0Var.c;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = yo0Var.c;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, gh1Var.a());
        oe1.b(yo0Var.d, gh1Var);
        navigationView.setWillNotDraw(dh1Var.j().equals(s90.e) || navigationView.c == null);
        navigationView.postInvalidateOnAnimation();
        return dh1Var.c();
    }

    @Override // defpackage.pk0
    public void o(rk0 rk0Var) {
    }
}
