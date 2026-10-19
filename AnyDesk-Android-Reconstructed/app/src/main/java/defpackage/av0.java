package defpackage;

import android.view.View;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class av0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ bv0 d;

    public /* synthetic */ av0(bv0 bv0Var, int i) {
        this.c = i;
        this.d = bv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        bv0 bv0Var = this.d;
        switch (i) {
            case 0:
                t70.U(bv0Var.a0(), JniAdExt.o1("ad.link.imprint.href"));
                break;
            default:
                t70.U(bv0Var.a0(), JniAdExt.o1("ad.about.ver.privacy.href"));
                break;
        }
    }
}
