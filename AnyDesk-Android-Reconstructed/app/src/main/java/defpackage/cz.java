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
public class cz extends yt implements ng0 {
    public CheckBox A0;
    public TextView B0;
    public View C0;
    public View D0;
    public final q4 E0 = new q4(this, 6);
    public int q0;
    public int r0;
    public long s0;
    public String t0;
    public long u0;
    public String v0;
    public boolean w0;
    public int x0;
    public ListenerScrollView y0;
    public View z0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.dlg.file.conflict.dir.title_short");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.x0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_conflict_dir, (ViewGroup) null);
        if (viewInflate != null) {
            this.y0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_filemanager_conflict_dir_scroll_view);
            this.z0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_dir_content);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_conflict_dir_message);
            this.A0 = (CheckBox) viewInflate.findViewById(R.id.fragment_dialog_filemanager_conflict_dir_checkbox);
            this.B0 = (TextView) viewInflate.findViewById(R.id.fragment_dialog_filemanager_conflict_dir_checkbox_description);
            this.C0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_dir_scroll_hint_top);
            this.D0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_dir_scroll_hint_bottom);
            lg lgVarC = lg.c();
            String strN2 = JniAdExt.n1("ad.dlg.file.conflict.dir.msg");
            String str = this.t0;
            r3.F(textView, lgVarC.e(String.format(strN2, str, str, x00.k(this.s0), this.v0, x00.k(this.u0))));
            r3.F(this.B0, JniAdExt.n1("ad.dlg.file.conflict.repeat"));
            r3.B(this.A0, this.w0);
            this.y0.setListener(this);
            this.z0.addOnLayoutChangeListener(this.E0);
            this.A0.setOnCheckedChangeListener(new c3(4, this));
            this.B0.setOnClickListener(new b(14, this));
        }
        r7Var.q = viewInflate;
        v7Var.c(JniAdExt.n1("ad.dlg.cancel"), new bz(this, 0));
        v7Var.d(JniAdExt.n1("ad.dlg.yes"), new bz(this, 1));
        v7Var.b(JniAdExt.n1("ad.dlg.no"), new bz(this, 2));
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
        r3.I(this.C0, scrollY < this.x0 ? 4 : 0);
        r3.I(this.D0, bottom < this.x0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.I0.post(new cp(this.q0, 16));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.q0 = bundle.getInt("skey_progress_id");
        this.r0 = bundle.getInt("skey_progress_conflict_handler_id");
        this.s0 = bundle.getLong("skey_src_write_time");
        this.t0 = bundle.getString("skey_src_path");
        this.u0 = bundle.getLong("skey_dst_write_time");
        this.v0 = bundle.getString("skey_dst_path");
        this.w0 = bundle.getBoolean("skey_do_check_all");
        if (this.t0 == null) {
            this.t0 = "";
        }
        if (this.v0 == null) {
            this.v0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.y0.setListener(null);
        this.z0.removeOnLayoutChangeListener(this.E0);
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_progress_id", this.q0);
        bundle.putInt("skey_progress_conflict_handler_id", this.r0);
        bundle.putLong("skey_src_write_time", this.s0);
        bundle.putString("skey_src_path", this.t0);
        bundle.putLong("skey_dst_write_time", this.u0);
        bundle.putString("skey_dst_path", this.v0);
        bundle.putBoolean("skey_do_check_all", this.w0);
    }
}
