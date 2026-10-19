package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAudio;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                o oVar = (o) obj;
                String strO1 = JniAdExt.o1("ad.abook.sales.href");
                if (!TextUtils.isEmpty(strO1)) {
                    t70.U(oVar.a0(), strO1);
                }
                break;
            case 1:
                k3 k3Var = (k3) obj;
                t40 t40VarE0 = k3Var.e0();
                int i2 = k3Var.s0;
                xk xkVar = new xk();
                Bundle bundle = new Bundle();
                bundle.putInt("session_idx", i2);
                xkVar.N0(bundle);
                t70.Y(new eu(t40VarE0, true, "ChatDialog", xkVar));
                break;
            case 2:
                mm mmVar = (mm) obj;
                EditText editText = mmVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    mmVar.p();
                    break;
                }
                break;
            case 3:
                ((xv) obj).t();
                break;
            case 4:
                MainFragment mainFragment = (MainFragment) obj;
                if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
                    uj.v(mainFragment.Y(), R.id.connectionSettingsFragmentVpnWrapper);
                }
                break;
            case 5:
                tp0 tp0Var = (tp0) obj;
                r3.C(tp0Var.r0, false);
                JniAdExt.I0.sendEmptyMessage(q51.d(4));
                tp0Var.H0.c(2000L, 2000L);
                break;
            case 6:
                zt0 zt0Var = (zt0) obj;
                EditText editText2 = zt0Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = zt0Var.f;
                    boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText4 = zt0Var.f;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        zt0Var.f.setSelection(selectionEnd);
                    }
                    zt0Var.p();
                    break;
                }
                break;
            default:
                t70.g0(((SettingsFragmentAudio) obj).a0(), JniAdExt.n1("ad.cfg.audio.transmission.access_fail"), 0);
                break;
        }
    }
}
