package defpackage;

import com.anydesk.anydeskandroid.IncomingConnectionService;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte[] g;

    public lb0(int i, int i2, int i3, byte[] bArr, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        byte[] bArr = this.g;
        int i2 = this.f;
        int i3 = this.e;
        int i4 = this.d;
        switch (i) {
            case 0:
                ev evVar = JniAdExt.H;
                if (evVar != null) {
                    nm0 nm0Var = new nm0(i2);
                    nd0.t(bArr);
                    ((IncomingConnectionService) evVar.d).f.post(new x80(evVar, nm0Var, i4, i3));
                }
                break;
            default:
                JniAdExt.o0.y(nd0.t(bArr), i4, i3, i2);
                break;
        }
    }

    public lb0(int i, int i2, int i3, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = bArr;
    }
}
