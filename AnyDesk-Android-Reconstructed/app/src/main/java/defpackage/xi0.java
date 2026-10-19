package defpackage;

import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ xi0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        MainFragment mainFragment = this.d;
        switch (i) {
            case 0:
                MainFragment.W0(mainFragment);
                break;
            case 1:
                gi giVar = mainFragment.m1;
                if (giVar != null) {
                    cl0 cl0Var = (cl0) giVar.c;
                    if (cl0Var.b()) {
                        cl0Var.i.dismiss();
                    }
                }
                gi giVar2 = mainFragment.n1;
                if (giVar2 != null) {
                    cl0 cl0Var2 = (cl0) giVar2.c;
                    if (cl0Var2.b()) {
                        cl0Var2.i.dismiss();
                    }
                }
                mainFragment.l1();
                mainFragment.k1();
                mainFragment.b1();
                break;
            case 2:
                Toast toast = (Toast) mainFragment.o1.d;
                Looper looper = t70.a;
                if (toast != null) {
                    try {
                        toast.cancel();
                        break;
                    } catch (Throwable unused) {
                    }
                }
                gi giVar3 = mainFragment.m1;
                if (giVar3 != null) {
                    cl0 cl0Var3 = (cl0) giVar3.c;
                    if (cl0Var3.b()) {
                        cl0Var3.i.dismiss();
                    }
                }
                gi giVar4 = mainFragment.n1;
                if (giVar4 != null) {
                    cl0 cl0Var4 = (cl0) giVar4.c;
                    if (cl0Var4.b()) {
                        cl0Var4.i.dismiss();
                    }
                }
                mainFragment.k1();
                break;
            case 3:
                mainFragment.d1();
                break;
            case 4:
                mainFragment.k1();
                break;
            case 5:
                mainFragment.l1();
                mainFragment.k1();
                if (MainApplication.v().n0 == 5 && JniAdExt.g2(io.KEY_FEATURE_VPN) && !JniAdExt.S2(10)) {
                    uj.v(mainFragment.Y(), R.id.connectionSettingsFragmentVpnWrapper);
                    break;
                }
                break;
            case 6:
                mainFragment.k1();
                break;
            case 7:
                mainFragment.u0 = JniAdExt.A2();
                mainFragment.Y0();
                break;
            case 8:
                mainFragment.x0.clear();
                ArrayList arrayListN2 = JniAdExt.n2();
                int size = arrayListN2.size();
                while (i2 < size) {
                    Object obj = arrayListN2.get(i2);
                    i2++;
                    nu nuVar = (nu) obj;
                    if (!mainFragment.y0.containsKey(Long.valueOf(nuVar.a))) {
                        mainFragment.x0.add(nuVar);
                    }
                }
                cj0 cj0Var = mainFragment.c0;
                if (cj0Var != null) {
                    int iD = cj0Var.d();
                    if (iD == 1 || iD == 4) {
                        mainFragment.Y0();
                    }
                    break;
                }
                break;
            case 9:
                mainFragment.F0.setActivated(true);
                break;
            case 10:
                mainFragment.m1();
                break;
            default:
                mainFragment.f1();
                mainFragment.Y0();
                ImageView imageView = mainFragment.Q0;
                boolean z = JniAdExt.s2(12) != 0;
                if (imageView != null) {
                    imageView.setActivated(z);
                }
                View view = mainFragment.R0;
                boolean z2 = JniAdExt.s2(13) != 0;
                if (view != null) {
                    view.setActivated(z2);
                }
                break;
        }
    }
}
