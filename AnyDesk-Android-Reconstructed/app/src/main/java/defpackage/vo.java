package defpackage;

import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class vo extends y90 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ConnectionFragment j;

    public vo(ConnectionFragment connectionFragment, int i) {
        this.j = connectionFragment;
        this.i = i;
    }

    @Override // defpackage.mu0
    public final void c() {
        this.j.b1();
        JniAdExt.I0.post(new cp(this.i, 1));
        JniAdExt.J4(15, false);
    }
}
