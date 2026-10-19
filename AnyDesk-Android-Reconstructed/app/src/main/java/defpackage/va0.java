package defpackage;

import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class va0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ va0(int i, long j) {
        this.c = i;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniDeleteRoster(this.d);
                return;
            case 1:
                MainApplication mainApplication = JniAdExt.s;
                if (mainApplication == null || this.d == 0) {
                    return;
                }
                t70.g0(mainApplication.getApplicationContext(), JniAdExt.n1("ad.status.tooltip.clipboard_files.android"), 1);
                return;
            case 2:
                zd zdVar = JniAdExt.d0;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            y21 y21Var = (y21) tdVar.next();
                            if (y21Var != null) {
                                String[] strArrJ3 = JniAdExt.J3(this.d, y21Var.v0);
                                AdEditText adEditText = y21Var.s0;
                                String text = adEditText != null ? adEditText.getText() : null;
                                boolean z = false;
                                if (text != null && !text.isEmpty()) {
                                    for (String str : strArrJ3) {
                                        if (text.equals(str)) {
                                            z = true;
                                        }
                                    }
                                }
                                y21Var.y0 = z;
                                t70.Y(new ap(y21Var, 5, z));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                JniAdExt.jniOnPanZoomCorrectionStep(this.d);
                return;
        }
    }
}
