package defpackage;

import com.anydesk.jni.JniAdExt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;

    public /* synthetic */ fc0(boolean z, List list, int i) {
        this.c = i;
        this.d = z;
        this.e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        List list = this.e;
        boolean z = this.d;
        switch (i) {
            case 0:
                JniAdExt.jniFileManagerTransferFiles(z, nd0.T(nd0.f(list)));
                break;
            case 1:
                JniAdExt.jniFileManagerDeleteFiles(z, nd0.T(nd0.f(list)));
                break;
            default:
                JniAdExt.jniFileManagerRequestFileProperties(z, nd0.T(nd0.f(list)));
                break;
        }
    }
}
