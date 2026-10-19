package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.gui.element.PermissionIcon;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class h3 {
    public du0 a;
    public PermissionIcon b;
    public View c;
    public PermissionIcon d;
    public TextView e;
    public CheckBox f;
    public final /* synthetic */ int g;
    public final /* synthetic */ k3 h;

    public /* synthetic */ h3(k3 k3Var, int i) {
        this.g = i;
        this.h = k3Var;
    }

    public void a() {
        int i = this.g;
        k3 k3Var = this.h;
        switch (i) {
            case 0:
                k3Var.L0.u(k3Var.a0(), JniAdExt.n1("ad.menu.unsupported"));
                break;
            case 1:
                bc bcVar = k3Var.K0;
                if (bcVar != null) {
                    bcVar.q0(0, JniAdExt.n1("ad.dlg.closed.no_capture_permissions.title"), JniAdExt.n1("ad.msg.locked.clipboard_files.android"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
                    break;
                }
                break;
            default:
                bc bcVar2 = k3Var.K0;
                if (bcVar2 != null) {
                    String str = String.format(JniAdExt.n1("ad.msg.modify_forbidden_windows.not_available.instruction.part2.android"), JniAdExt.n1("ad.menu.settings"), JniAdExt.n1("ad.cfg.sec.title"), JniAdExt.n1("ad.cfg.sec.perm.permissions"), JniAdExt.n1("ad.cfg.sec.perm.permission_profiles"));
                    String str2 = String.format(JniAdExt.n1("ad.msg.modify_forbidden_windows.not_available.instruction.part4.android"), JniAdExt.n1("ad.accept.auth.modify_forbidden_windows"));
                    String strN1 = JniAdExt.n1("ad.msg.modify_forbidden_windows.not_available.instruction.part1.android");
                    String strN2 = JniAdExt.n1("ad.msg.modify_forbidden_windows.not_available.instruction.part3.android");
                    StringBuilder sb = new StringBuilder();
                    sb.append(strN1);
                    sb.append("\n\n");
                    sb.append(str);
                    sb.append("\n\n");
                    sb.append(strN2);
                    bcVar2.q0(0, JniAdExt.n1("ad.dlg.closed.no_capture_permissions.title"), q51.m(sb, "\n\n", str2), null, true, JniAdExt.n1("ad.dlg.ok"), null);
                    break;
                }
                break;
        }
    }
}
