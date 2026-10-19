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
public class lz extends yt implements ng0 {
    public int A0;
    public ListenerScrollView B0;
    public View C0;
    public CheckBox D0;
    public View E0;
    public View F0;
    public final q4 G0 = new q4(this, 8);
    public int q0;
    public int r0;
    public long s0;
    public String t0;
    public long u0;
    public String v0;
    public long w0;
    public long x0;
    public String y0;
    public boolean z0;

    public static String T0(long j, long j2, String str) {
        return j2 < j ? gr0.f(" (", str, ")") : "";
    }

    public static View U0(View view, int i) {
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        int i;
        View view;
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.dlg.file.conflict.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.A0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_conflict_file, (ViewGroup) null);
        if (viewInflate == null) {
            view = viewInflate;
            i = 5;
        } else {
            this.B0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_scroll_view);
            this.C0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_content);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_message);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_srcname);
            View viewFindViewById = viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_replacebtn);
            View viewU0 = U0(viewFindViewById, R.id.dialog_filemanager_conflict_file_button_content);
            TextView textView3 = (TextView) U0(viewFindViewById, R.id.dialog_filemanager_conflict_file_button_title);
            TextView textView4 = (TextView) U0(viewFindViewById, R.id.dialog_filemanager_conflict_file_button_hint);
            View viewFindViewById2 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_skipbtn);
            View viewU1 = U0(viewFindViewById2, R.id.dialog_filemanager_conflict_file_button_content);
            TextView textView5 = (TextView) U0(viewFindViewById2, R.id.dialog_filemanager_conflict_file_button_title);
            TextView textView6 = (TextView) U0(viewFindViewById2, R.id.dialog_filemanager_conflict_file_button_hint);
            this.D0 = (CheckBox) viewInflate.findViewById(R.id.fragment_dialog_filemanager_conflict_file_checkbox);
            TextView textView7 = (TextView) viewInflate.findViewById(R.id.fragment_dialog_filemanager_conflict_file_checkbox_description);
            this.E0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_scroll_hint_top);
            this.F0 = viewInflate.findViewById(R.id.dialog_filemanager_conflict_file_scroll_hint_bottom);
            String strN2 = JniAdExt.n1("ad.dlg.file.conflict.format.android");
            String strN3 = JniAdExt.n1("ad.dlg.file.conflict.newer");
            String strN4 = JniAdExt.n1("ad.dlg.file.conflict.larger");
            String strT0 = T0(this.s0, this.w0, strN3);
            String strT1 = T0(this.u0, this.x0, strN4);
            String strT2 = T0(this.w0, this.s0, strN3);
            String strT3 = T0(this.x0, this.u0, strN4);
            r3.F(textView, JniAdExt.n1("ad.dlg.file.conflict.file.title"));
            r3.F(textView2, lg.c().e(this.t0));
            r3.F(textView3, JniAdExt.n1("ad.dlg.file.conflict.file.copy_replace.title"));
            r3.F(textView4, lg.c().e(String.format(strN2, x00.k(this.s0), strT0, this.v0, strT1)));
            r3.F(textView5, JniAdExt.n1("ad.dlg.file.conflict.file.copy_cancel.title"));
            r3.F(textView6, lg.c().e(String.format(strN2, x00.k(this.w0), strT2, this.y0, strT3)));
            r3.F(textView7, JniAdExt.n1("ad.dlg.file.conflict.repeat"));
            r3.B(this.D0, this.z0);
            this.B0.setListener(this);
            this.C0.addOnLayoutChangeListener(this.G0);
            viewU0.setOnClickListener(new kz(this, 0));
            viewU1.setOnClickListener(new kz(this, 1));
            i = 5;
            this.D0.setOnCheckedChangeListener(new c3(5, this));
            textView7.setOnClickListener(new kz(this, 2));
            view = viewInflate;
        }
        r7Var.q = view;
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new a(this, i));
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
        r3.I(this.E0, scrollY < this.A0 ? 4 : 0);
        r3.I(this.F0, bottom < this.A0 ? 4 : 0);
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
        this.t0 = bundle.getString("skey_src_name");
        this.u0 = bundle.getLong("skey_src_file_size");
        this.v0 = bundle.getString("skey_src_file_size_str");
        this.w0 = bundle.getLong("skey_dst_write_time");
        this.x0 = bundle.getLong("skey_dst_file_size");
        this.y0 = bundle.getString("skey_dst_file_size_str");
        this.z0 = bundle.getBoolean("skey_do_check_all");
        if (this.t0 == null) {
            this.t0 = "";
        }
        if (this.v0 == null) {
            this.v0 = "";
        }
        if (this.y0 == null) {
            this.y0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.B0.setListener(null);
        this.C0.removeOnLayoutChangeListener(this.G0);
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putInt("skey_progress_id", this.q0);
        bundle.putInt("skey_progress_conflict_handler_id", this.r0);
        bundle.putLong("skey_src_write_time", this.s0);
        bundle.putString("skey_src_name", this.t0);
        bundle.putLong("skey_src_file_size", this.u0);
        bundle.putString("skey_src_file_size_str", this.v0);
        bundle.putLong("skey_dst_write_time", this.w0);
        bundle.putLong("skey_dst_file_size", this.x0);
        bundle.putString("skey_dst_file_size_str", this.y0);
        bundle.putBoolean("skey_do_check_all", this.z0);
    }
}
