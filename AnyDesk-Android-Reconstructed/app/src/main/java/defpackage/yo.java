package defpackage;

import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class yo implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ConnectionFragment e;

    public /* synthetic */ yo(ConnectionFragment connectionFragment, int i, int i2) {
        this.c = i2;
        this.e = connectionFragment;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        ImageView imageView;
        boolean z;
        switch (this.c) {
            case 0:
                int i = this.d;
                ConnectionFragment connectionFragment = this.e;
                lp lpVar = connectionFragment.d0;
                if (lpVar == null || (frameLayout = connectionFragment.s0) == null) {
                    return;
                }
                lpVar.A(i);
                frameLayout.setVisibility(i);
                if (i == 0) {
                    connectionFragment.z1();
                    connectionFragment.m1(!lpVar.q());
                    return;
                }
                return;
            case 1:
                Window windowO0 = this.e.O0();
                if (windowO0 == null) {
                    return;
                }
                windowO0.setSoftInputMode(this.d);
                return;
            case 2:
                ImageView imageView2 = this.e.y1;
                if (imageView2 != null) {
                    imageView2.setVisibility(this.d == 3 ? 0 : 4);
                    return;
                }
                return;
            default:
                ConnectionFragment connectionFragment2 = this.e;
                lp lpVar2 = connectionFragment2.d0;
                if (lpVar2 == null || (imageView = connectionFragment2.v1) == null) {
                    return;
                }
                connectionFragment2.f0.removeMessages(q51.d(10));
                synchronized (lpVar2) {
                    z = lpVar2.s;
                }
                if (!z) {
                    imageView.setVisibility(4);
                    return;
                }
                imageView.setVisibility(this.d);
                if (JniAdExt.g2(io.KEY_AUTO_HIDE_NUBSI) && this.d == 0) {
                    this.e.f0.sendEmptyMessageDelayed(q51.d(10), 8000L);
                    return;
                }
                return;
        }
    }
}
