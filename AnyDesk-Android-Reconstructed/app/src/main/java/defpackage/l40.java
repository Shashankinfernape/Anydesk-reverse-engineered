package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l40 {
    public boolean a;
    public final CopyOnWriteArrayList b;
    public o50 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public l40(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a() {
        NavHostFragment navHostFragment;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                t40 t40Var = (t40) obj;
                t40Var.x(true);
                if (!t40Var.h.a) {
                    t40Var.g.c();
                } else {
                    t40Var.P();
                }
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                DrawerLayout drawerLayout = mainActivity.L;
                if (drawerLayout != null) {
                    View viewF = drawerLayout.f(8388611);
                    if (!(viewF != null ? DrawerLayout.l(viewF) : false)) {
                        MainApplication.v();
                        bo0 bo0VarP = uj.p(mainActivity);
                        vn0 vn0VarF = bo0VarP == null ? null : bo0VarP.b.f();
                        if (vn0VarF != null && (navHostFragment = (NavHostFragment) mainActivity.Y().x) != null) {
                            gf0 gf0Var = navHostFragment.Z().x;
                            if (gf0Var instanceof n80) {
                                if (!((n80) gf0Var).x()) {
                                    if (vn0VarF.d.a == R.id.mainFragment) {
                                        mainActivity.finish();
                                    }
                                    break;
                                }
                            }
                        }
                        uj.x(mainActivity);
                    } else {
                        drawerLayout.d();
                    }
                    break;
                }
                break;
            case 2:
                mn0 mn0Var = ((bo0) obj).b;
                if (!mn0Var.f.isEmpty()) {
                    vn0 vn0VarF2 = mn0Var.f();
                    vn0VarF2.getClass();
                    if (mn0Var.l(vn0VarF2.d.a, true, false)) {
                        mn0Var.b();
                    }
                    break;
                }
                break;
            default:
                WebViewActivity webViewActivity = (WebViewActivity) obj;
                WebView webView = webViewActivity.D;
                if (webView != null) {
                    webViewActivity.i0(webView);
                } else {
                    webViewActivity.finish();
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l40(qa qaVar, int i) {
        this(true);
        this.d = i;
        this.e = qaVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l40(int i, Object obj) {
        this(false);
        this.d = i;
        this.e = obj;
    }
}
