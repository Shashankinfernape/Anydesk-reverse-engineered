package defpackage;

import android.content.Intent;
import android.widget.EditText;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ro implements j6 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ConnectionFragment d;

    public /* synthetic */ ro(ConnectionFragment connectionFragment, int i) {
        this.c = i;
        this.d = connectionFragment;
    }

    public void a(int i, de0 de0Var) {
        this.d.v1(0);
        JniAdExt.I0.post(new qc0(i, de0Var, 0));
    }

    public void b(int i, de0 de0Var) {
        this.d.v1(0);
        JniAdExt.I0.post(new qc0(i, de0Var, 1));
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        int i = this.c;
        int i2 = 0;
        ConnectionFragment connectionFragment = this.d;
        switch (i) {
            case 0:
                i6 i6Var = (i6) obj;
                if (i6Var != null && i6Var.c == -1) {
                    Intent intent = i6Var.d;
                    t70.b(connectionFragment.a0(), intent != null ? intent.getData() : null, true, "content.tmp", connectionFragment.q0, JniAdExt.n1("ad.status.select_files.upload.title"), new oo(i2));
                }
                break;
            case 1:
                i6 i6Var2 = (i6) obj;
                if (i6Var2 != null) {
                    Intent intent2 = i6Var2.d;
                    if (i6Var2.c == -1 && intent2 != null) {
                        lp lpVar = connectionFragment.d0;
                        String str = intent2.getStringArrayListExtra("android.speech.extra.RESULTS").get(0);
                        if (!lpVar.p()) {
                            connectionFragment.n1.setText(str);
                            EditText editText = connectionFragment.n1;
                            editText.setSelection(editText.length());
                        } else {
                            connectionFragment.i1.setText(str);
                            EditText editText2 = connectionFragment.i1;
                            editText2.setSelection(editText2.length());
                        }
                        break;
                    }
                }
                break;
            case 2:
                Map map = (Map) obj;
                if (map != null) {
                    if (!r3.b(map.values())) {
                        t70.g0(connectionFragment.a0(), JniAdExt.n1("ad.msg.permission_files_missing.android"), 0);
                    } else {
                        MainApplication.q(connectionFragment.a0());
                        JniAdExt.I0.post(new tb0(27));
                        JniAdExt.M4();
                    }
                    break;
                }
                break;
            case 3:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    if (!r3.b(map2.values())) {
                        t70.g0(connectionFragment.a0(), JniAdExt.n1("ad.msg.permission_files_missing.android"), 0);
                    } else {
                        MainApplication.q(connectionFragment.a0());
                        JniAdExt.I0.post(new tb0(28));
                        JniAdExt.M4();
                    }
                    break;
                }
                break;
            case 4:
                ConnectionFragment.T0(connectionFragment);
                JniAdExt.M4();
                break;
            default:
                Map map3 = (Map) obj;
                if (map3 != null) {
                    if (!r3.b(map3.values())) {
                        t70.g0(connectionFragment.a0(), JniAdExt.n1("ad.msg.permission_files_missing.android"), 0);
                    } else {
                        JniAdExt.I0.post(new tb0(24));
                        JniAdExt.M4();
                    }
                    break;
                }
                break;
        }
    }

    public void d(int i, de0 de0Var) {
        this.d.v1(0);
        JniAdExt.I0.post(new qc0(i, de0Var, 2));
    }
}
