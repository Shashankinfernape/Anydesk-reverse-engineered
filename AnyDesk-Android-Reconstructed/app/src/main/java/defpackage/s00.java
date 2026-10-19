package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class s00 extends yt {
    public FileManagerFileListFragment q0;
    public boolean r0;
    public int s0;
    public int t0;
    public ImageView u0;
    public Spinner v0;

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.file_browser.sort");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_sort, (ViewGroup) null);
        int i = 1;
        int i2 = 0;
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_sort_title);
            this.u0 = (ImageView) viewInflate.findViewById(R.id.dialog_filemanager_sort_order);
            this.v0 = (Spinner) viewInflate.findViewById(R.id.dialog_filemanager_sort_type);
            int i3 = 2;
            CharSequence[] charSequenceArr = {JniAdExt.n1("ad.file_browser.sort_header_file_name"), JniAdExt.n1("ad.file_browser.sort_header_file_size"), JniAdExt.n1("ad.file_browser.sort_header_last_modified_date")};
            r3.F(textView, this.r0 ? JniAdExt.n1("ad.file_manager.this_device") : JniAdExt.n1("ad.file_manager.remote_device"));
            S0();
            this.u0.setOnClickListener(new b(16, this));
            ArrayAdapter arrayAdapter = new ArrayAdapter(a0(), R.layout.dialog_simple_spinner_text, charSequenceArr);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            this.v0.setAdapter((SpinnerAdapter) arrayAdapter);
            int iR = q51.r(this.t0);
            Spinner spinner = this.v0;
            if (spinner != null) {
                spinner.setSelection(Math.max(0, Math.min(q51.s(3).length - 1, iR)), false);
            }
            this.v0.setOnItemSelectedListener(new f3(i3, this));
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new r00(this, i2));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new r00(this, i));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0() {
        ImageView imageView = this.u0;
        boolean z = this.s0 == 2;
        r3.D(imageView, z ? R.drawable.ic_filemanager_sort_descending : R.drawable.ic_filemanager_sort_ascending);
        if (imageView != null) {
            bu0.D(imageView, z ? JniAdExt.n1("ad.file_browser.sort.descending") : JniAdExt.n1("ad.file_browser.sort.ascending"));
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (FileManagerFileListFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getBoolean("skey_is_local");
        this.s0 = bu0.m(bundle.getInt("skey_sort_order"));
        this.t0 = q51.s(3)[bundle.getInt("skey_sort_type_local")];
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = null;
        this.v0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_is_local", this.r0);
        int i = this.s0;
        if (i == 0) {
            i = 3;
        }
        bundle.putInt("skey_sort_order", gr0.d(i));
        int i2 = this.t0;
        if (i2 == 0) {
            i2 = 1;
        }
        bundle.putInt("skey_sort_type_local", q51.r(i2));
    }
}
