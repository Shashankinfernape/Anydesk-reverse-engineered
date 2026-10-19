package defpackage;

import android.window.OnBackInvokedCallback;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((qb) this.b).E();
                break;
            case 1:
                GlowActivity.c((GlowActivity) this.b);
                break;
            case 2:
                ((rj0) this.b).a();
                break;
            case 3:
                ((o50) this.b).a();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
