package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class ep implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ ep(int i) {
        this.a = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                JniAdExt.K4(4, (z ? new eu0(2 & (-5)) : new eu0(4)).c);
                return;
            case 1:
                JniAdExt.K4(1, (z ? new eu0(2 & (-5)) : new eu0(4)).c);
                return;
            case 2:
                JniAdExt.K4(3, (z ? new eu0(2 & (-5)) : new eu0(4)).c);
                return;
            case 3:
                JniAdExt.J4(5, z);
                return;
            case 4:
                JniAdExt.K4(20, (z ? new eu0(2 & (-5)) : new eu0(4)).c);
                return;
            case 5:
                JniAdExt.K4(16, (z ? new eu0(2 & (-5)) : new eu0(4)).c);
                return;
            case 6:
                JniAdExt.J4(18, z);
                return;
            case 7:
                JniAdExt.I0.post(new fb0(12, z));
                return;
            case 8:
                JniAdExt.J4(7, z);
                return;
            case 9:
                JniAdExt.J4(17, z);
                return;
            case 10:
                char c = z ? (char) 2 : (char) 1;
                if (c != 1) {
                    if (c != 2) {
                        throw null;
                    }
                    i = 1;
                }
                JniAdExt.y4(io.KEY_AUDIO_PLAYBACK_MODE, i);
                return;
            case 11:
                JniAdExt.y4(io.KEY_ONLINE_STATUS_RECEIVE, z ? 1 : 0);
                return;
            case 12:
                JniAdExt.I0.post(new fb0(0, z));
                return;
            case 13:
                JniAdExt.x4(io.KEY_SHOW_ID_INSTEAD_OF_ALIAS, z);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                JniAdExt.x4(io.KEY_AUTOMATIC_KEYBOARD, z);
                t70.b0(MainApplication.v().T, "ad.image.auto_keyboard", z);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                JniAdExt.x4(io.KEY_AUTOMATIC_TOUCH_TO_TOUCH_MODE, z);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                io ioVar = io.KEY_INJECT_MOUSE_AS_TOUCH;
                JniAdExt.y4(ioVar, z ? 1 : 0);
                q90 q90VarD = MainApplication.v().S.d();
                if (q90VarD != null) {
                    int iH2 = JniAdExt.h2(ioVar);
                    int[] iArrS = q51.s(2);
                    int length = iArrS.length;
                    while (i < length) {
                        int i3 = iArrS[i];
                        if (q51.r(i3) == iH2) {
                            i2 = i3;
                            q90VarD.s = i2;
                            return;
                        }
                        i++;
                    }
                    q90VarD.s = i2;
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                JniAdExt.y4(io.KEY_FRONTEND_CLIPBOARD_FILES, z ? 1 : 0);
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                JniAdExt.y4(io.KEY_FOLLOW_REMOTE_FOCUS, q51.r(z ? 2 : 1));
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                JniAdExt.x4(io.KEY_AUTO_HIDE_NUBSI, z);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                JniAdExt.x4(io.KEY_REMEMBER_SETTINGS, z);
                return;
            case 21:
                JniAdExt.x4(io.KEY_QUALITY_LOSSLESS, z);
                return;
            case 22:
                JniAdExt.x4(io.KEY_FOLLOW_REMOTE_CURSOR, z);
                return;
            default:
                JniAdExt.x4(io.KEY_VPN_AUTO_CONFIG, z);
                return;
        }
    }
}
