package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.AbookFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbookFragment d;

    public /* synthetic */ e(AbookFragment abookFragment, int i) {
        this.c = i;
        this.d = abookFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        AbookFragment abookFragment = this.d;
        switch (i) {
            case 0:
                abookFragment.T0();
                break;
            default:
                JniAdExt.i4();
                abookFragment.R0();
                break;
        }
    }
}
