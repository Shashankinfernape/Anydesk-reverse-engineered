package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.anydesk.anydeskandroid.ConnectionService;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class ua0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ ua0(String str, int i) {
        this.c = i;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                JniAdExt.jniAnynetAccountResetPassword(nd0.T(this.d));
                return;
            case 1:
                JniAdExt.o0.q(this.d);
                return;
            case 2:
                JniAdExt.jniAddRoster(nd0.T(this.d));
                return;
            case 3:
                JniAdExt.jniQueryAlias(nd0.T(this.d));
                return;
            case 4:
                JniAdExt.jniRegisterAlias(nd0.T(this.d));
                return;
            case 5:
                JniAdExt.jniBrowseFiles(nd0.T(this.d));
                return;
            case 6:
                Context context = JniAdExt.d;
                String str = this.d;
                if (t70.d0(context, "AnyDesk remote", str, JniAdExt.b)) {
                    JniAdExt.e = SystemClock.uptimeMillis();
                    if (str.isEmpty()) {
                        return;
                    }
                    t70.g0(JniAdExt.d, JniAdExt.n1("ad.status.tooltip.clipboard_text.android"), 0);
                    return;
                }
                return;
            case 7:
                JniAdExt.L0.a();
                JniAdExt.jniConnectVpn(nd0.T(this.d));
                return;
            case 8:
                JniAdExt.jniConnect(nd0.T(this.d));
                return;
            case 9:
                String str2 = this.d;
                MainApplication mainApplication = JniAdExt.n;
                if (mainApplication != null) {
                    m11 m11Var = mainApplication.Z;
                    m11Var.getClass();
                    Intent intent = new Intent(m11Var.b, (Class<?>) ConnectionService.class);
                    intent.putExtra("filename", str2);
                    mainApplication.Z.b(ConnectionService.class, intent);
                    Looper looper = t70.a;
                    mainApplication.P = SystemClock.uptimeMillis();
                    mainApplication.n0 = 3;
                    mainApplication.p = str2;
                    mainApplication.s.C(false);
                    synchronized (mainApplication.V) {
                        try {
                            zd zdVar = mainApplication.V;
                            zdVar.getClass();
                            td tdVar = new td(zdVar);
                            while (tdVar.hasNext()) {
                                ki0 ki0Var = (ki0) tdVar.next();
                                if (ki0Var != null) {
                                    ki0Var.z();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                JniAdExt.jniPlayback(nd0.T(this.d));
                return;
            case 10:
                JniAdExt.jniHandleAuthenticationCode(nd0.T(this.d));
                return;
            case 11:
                JniAdExt.jniOnStringInput(nd0.T(this.d));
                return;
            case 12:
                JniAdExt.jniOnClipboardTextChanged(this.d.concat("\u0000").getBytes(StandardCharsets.UTF_16LE));
                return;
            case 13:
                JniAdExt.jniSendFileOffer(nd0.T(this.d));
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                JniAdExt.jniAnynetAccountRequestSsoAuthInfo(nd0.T(this.d));
                return;
            default:
                JniAdExt.jniAnynetAccountOtpLogin(nd0.T(this.d));
                return;
        }
    }
}
