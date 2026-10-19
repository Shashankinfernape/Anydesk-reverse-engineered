package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class az extends yt implements ng0 {
    public View A0;
    public View B0;
    public final q4 C0 = new q4(this, 5);
    public int q0;
    public int r0;
    public int s0;
    public String t0;
    public boolean u0;
    public int v0;
    public ListenerScrollView w0;
    public View x0;
    public CheckBox y0;
    public TextView z0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.dlg.file.delete_confirm.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.v0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_delconfirm, (ViewGroup) null);
        if (viewInflate != null) {
            this.w0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_filemanager_delconfirm_scroll_view);
            this.x0 = viewInflate.findViewById(R.id.dialog_filemanager_delconfirm_content);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_delconfirm_text);
            this.y0 = (CheckBox) viewInflate.findViewById(R.id.fragment_dialog_filemanager_delconfirm_checkbox);
            this.z0 = (TextView) viewInflate.findViewById(R.id.fragment_dialog_filemanager_delconfirm_checkbox_description);
            this.A0 = viewInflate.findViewById(R.id.dialog_filemanager_delconfirm_scroll_hint_top);
            this.B0 = viewInflate.findViewById(R.id.dialog_filemanager_delconfirm_scroll_hint_bottom);
            String str = String.format(JniAdExt.n1("ad.dlg.file.delete_confirm.preamble"), Integer.valueOf(this.r0), Integer.valueOf(this.s0));
            r3.F(textView, lg.c().e(str) + "\n\n" + JniAdExt.n1("ad.dlg.file.delete_confirm.msg") + "\n\n" + lg.c().e(this.t0));
            r3.F(this.z0, JniAdExt.n1("ad.dlg.file.delete_confirm.repeat"));
            r3.B(this.y0, this.u0);
            this.w0.setListener(this);
            this.x0.addOnLayoutChangeListener(this.C0);
            this.y0.setOnCheckedChangeListener(new c3(3, this));
            this.z0.setOnClickListener(new b(13, this));
        }
        r7Var.q = viewInflate;
        v7Var.c(JniAdExt.n1("ad.dlg.cancel"), new zy(this, 0));
        v7Var.d(JniAdExt.n1("ad.dlg.file.delete_confirm.delete"), new zy(this, 1));
        v7Var.b(JniAdExt.n1("ad.dlg.file.delete_confirm.keep"), new zy(this, 2));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.A0, scrollY < this.v0 ? 4 : 0);
        r3.I(this.B0, bottom < this.v0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.I0.post(new cp(this.q0, 15));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getInt("skey_progress_id");
        this.r0 = bundle.getInt("skey_total_files");
        this.s0 = bundle.getInt("skey_total_folders");
        this.t0 = bundle.getString("skey_src_path");
        this.u0 = bundle.getBoolean("skey_do_check_all");
        if (this.t0 == null) {
            this.t0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.w0.setListener(null);
        this.x0.removeOnLayoutChangeListener(this.C0);
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_progress_id", this.q0);
        bundle.putInt("skey_total_files", this.r0);
        bundle.putInt("skey_total_folders", this.s0);
        bundle.putString("skey_src_path", this.t0);
        bundle.putBoolean("skey_do_check_all", this.u0);
    }
}
