package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements View.OnClickListener {
    public final /* synthetic */ int c;

    public /* synthetic */ z1(int i) {
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                JniAdExt.I0.post(new ab0("", false, 4));
                break;
            case 1:
                JniAdExt.I0.post(new sc0(1));
                break;
            case 2:
                JniAdExt.V1();
                break;
            case 3:
                if (JniAdExt.g2(io.KEY_CFG_ENABLED) && JniAdExt.g2(io.KEY_CFG_ENABLE_SECURITY) && JniAdExt.g2(io.KEY_CFG_ENABLE_PERMISSION_PROFILES)) {
                    MainApplication.v().B(R.id.settingsFragmentPermissionsWrapper, v11.e);
                    break;
                }
                break;
            default:
                MainApplication.v().n();
                break;
        }
    }
}
