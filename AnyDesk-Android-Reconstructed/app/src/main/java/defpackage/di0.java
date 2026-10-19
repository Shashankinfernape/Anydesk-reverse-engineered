package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class di0 implements j6 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    public /* synthetic */ di0(MainActivity mainActivity, int i) {
        this.c = i;
        this.d = mainActivity;
    }

    @Override // defpackage.j6
    public final void c(Object obj) {
        int i = this.c;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                i6 i6Var = (i6) obj;
                if (i6Var != null && i6Var.c == -1) {
                    Intent intent = i6Var.d;
                    Uri data = intent != null ? intent.getData() : null;
                    zd zdVar = MainActivity.j0;
                    MainActivity mainActivity2 = this.d;
                    t70.b(mainActivity2, data, true, "recording.tmp", mainActivity2.E, JniAdExt.n1("ad.status.select_files.replay.title"), new d00(2, mainActivity2));
                    break;
                }
                break;
            case 1:
                i6 i6Var2 = (i6) obj;
                if (i6Var2 != null && i6Var2.c == -1) {
                    MainApplication.v().W(mainActivity, "start");
                    break;
                }
                break;
            case 2:
                i6 i6Var3 = (i6) obj;
                if (i6Var3 != null && i6Var3.c == -1) {
                    MainApplication.v().W(mainActivity, "connect");
                    break;
                }
                break;
            case 3:
                i6 i6Var4 = (i6) obj;
                if (i6Var4 != null) {
                    if (i6Var4.c != -1 || !MainApplication.v().W(mainActivity, "incoming")) {
                        JniAdExt.P3(MainApplication.v().D, false);
                    }
                    break;
                }
                break;
            case 4:
                Map map = (Map) obj;
                if (map != null) {
                    MainApplication.q(mainActivity.getApplicationContext());
                    Boolean bool = Boolean.TRUE;
                    if (bool.equals(map.get("android.permission.RECORD_AUDIO")) && JniAdExt.h2(io.KEY_AUDIO_TRANSMIT_MODE) != 0) {
                        JniAdExt.k4();
                    }
                    if (bool.equals(map.get("android.permission.READ_EXTERNAL_STORAGE")) && bool.equals(map.get("android.permission.WRITE_EXTERNAL_STORAGE"))) {
                        JniAdExt.I0.post(new tb0(29));
                        JniAdExt.M4();
                        break;
                    }
                }
                break;
            case 5:
                zd zdVar2 = MainActivity.j0;
                mainActivity.t0();
                JniAdExt.M4();
                break;
            default:
                MainApplication.q(mainActivity.getApplicationContext());
                JniAdExt.M4();
                break;
        }
    }
}
