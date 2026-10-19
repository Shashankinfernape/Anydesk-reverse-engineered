package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends lk0 {
    public final /* synthetic */ int k;

    public /* synthetic */ oo(int i) {
        this.k = i;
    }

    @Override // defpackage.lk0
    public final void D(String str, boolean z) {
        switch (this.k) {
            case 0:
                JniAdExt.I0.post(new ua0(str, 13));
                break;
            default:
                JniAdExt.I0.post(new cb0(MainApplication.v().D, str, 2));
                break;
        }
    }
}
