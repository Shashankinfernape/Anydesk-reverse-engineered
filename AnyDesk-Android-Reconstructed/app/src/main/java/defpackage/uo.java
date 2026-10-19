package defpackage;

import android.animation.TimeAnimator;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class uo implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ConnectionFragment d;

    public /* synthetic */ uo(ConnectionFragment connectionFragment, int i) {
        this.c = i;
        this.d = connectionFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int i = this.c;
        ConnectionFragment connectionFragment = this.d;
        switch (i) {
            case 0:
                ut0 ut0Var = connectionFragment.n0;
                if (ut0Var != null) {
                    ut0Var.a(true);
                }
                break;
            case 1:
                ConnectionFragment.R0(connectionFragment);
                break;
            case 2:
                ut0 ut0Var2 = connectionFragment.n0;
                if (ut0Var2 != null) {
                    ut0Var2.a(true);
                    JniAdExt.I0.post(new tb0(18));
                    TimeAnimator timeAnimator = ut0Var2.c;
                    timeAnimator.setCurrentPlayTime(0L);
                    timeAnimator.setTimeListener(ut0Var2);
                    timeAnimator.start();
                }
                break;
            case 3:
                connectionFragment.s1(false);
                break;
            case 4:
                connectionFragment.c1();
                break;
            case 5:
                connectionFragment.W0();
                break;
            case 6:
                connectionFragment.w1(true);
                break;
            case 7:
                connectionFragment.w1(true);
                break;
            case 8:
                lp lpVar = connectionFragment.d0;
                if (lpVar != null && (textView = connectionFragment.y0) != null) {
                    textView.setText(t70.O(lpVar.l()));
                }
                break;
            case 9:
                lp lpVar2 = connectionFragment.d0;
                if (lpVar2 != null) {
                    if (lpVar2.h() == 0) {
                        connectionFragment.z1();
                    }
                    if (lpVar2.k() == lpVar2.l()) {
                        connectionFragment.x1();
                        connectionFragment.n1(0);
                    }
                    break;
                }
                break;
            case 10:
                bc bcVar = connectionFragment.p0;
                if (bcVar != null) {
                    bcVar.F("RemoteRestart_" + MainApplication.v().k);
                }
                break;
            case 11:
                connectionFragment.f1();
                break;
            default:
                connectionFragment.u1();
                break;
        }
    }
}
