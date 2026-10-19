package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = 1;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                if (i2 == -3 || i2 == -2 || i2 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    break;
                } else if (i2 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (message.what == q51.d(13)) {
                    mj mjVar = (mj) ((f7) this.b).d;
                    if (mjVar.x) {
                        mj.a(mjVar);
                    }
                }
                break;
            case 2:
                mj mjVar2 = ((kj) this.b).c;
                if (message.what == q51.d(12) && mjVar2.j == 0) {
                    mjVar2.a.h("capture timeout: restarting...");
                    mjVar2.e(true);
                    break;
                }
                break;
            case 3:
                ConnectionFragment connectionFragment = (ConnectionFragment) this.b;
                if (message != null) {
                    if (message.what == q51.d(5)) {
                        lp lpVar = connectionFragment.d0;
                        if (lpVar != null) {
                            t70.Y(new fj(connectionFragment, i, lpVar.p()));
                        }
                    } else if (message.what == q51.d(6)) {
                        connectionFragment.n1(4);
                    } else if (message.what == q51.d(10)) {
                        connectionFragment.v1(4);
                    }
                }
                break;
            case 4:
                lu0 lu0Var = (lu0) this.b;
                if (message.what == q51.d(2) && lu0Var.b != null) {
                    t70.g0(MainApplication.v().getApplicationContext(), lu0Var.b, 0);
                    break;
                }
                break;
            case 5:
                if (message.what == q51.d(1)) {
                    nu0 nu0Var = (nu0) this.b;
                    nu0Var.b(nu0Var.l, nu0Var.m);
                }
                break;
            default:
                e21 e21Var = (e21) this.b;
                if (message != null) {
                    int i3 = 3;
                    if (message.what == q51.d(3)) {
                        String strS0 = e21Var.S0();
                        if (e21.T0(strS0)) {
                            JniAdExt.I0.post(new ua0(strS0, i3));
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ s7() {
        this.a = 0;
    }
}
