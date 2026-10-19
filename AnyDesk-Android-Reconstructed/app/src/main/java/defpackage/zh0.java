package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zh0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    public /* synthetic */ zh0(MainActivity mainActivity, int i) {
        this.c = i;
        this.d = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View viewF;
        int i = this.c;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                bc bcVar = mainActivity.D;
                if (bcVar != null) {
                    bcVar.p0(new tp0(), "NetworkInfoDialog", true);
                }
                break;
            default:
                bo0 bo0VarP = uj.p(mainActivity);
                vn0 vn0VarF = bo0VarP == null ? null : bo0VarP.b.f();
                if (vn0VarF != null && vn0VarF.d.a == R.id.mainFragment) {
                    DrawerLayout drawerLayout = mainActivity.L;
                    boolean zL = false;
                    if (drawerLayout != null && (viewF = drawerLayout.f(8388611)) != null) {
                        zL = DrawerLayout.l(viewF);
                    }
                    if (!zL) {
                        DrawerLayout drawerLayout2 = mainActivity.L;
                        if (drawerLayout2 != null) {
                            drawerLayout2.o();
                        }
                    }
                }
                mainActivity.g0.a();
                break;
        }
    }
}
