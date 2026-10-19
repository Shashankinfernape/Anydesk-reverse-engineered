package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public class i00 extends yt implements ng0 {
    public LinearLayout A0;
    public TextView B0;
    public LinearLayout C0;
    public TextView D0;
    public View E0;
    public View F0;
    public boolean r0;
    public String s0;
    public boolean t0;
    public x00 u0;
    public int v0;
    public ListenerScrollView w0;
    public View x0;
    public TextView y0;
    public CircularProgressIndicator z0;
    public final Logging q0 = new Logging("FileManagerFilePropertiesDialogFragment");
    public final q4 G0 = new q4(this, 9);

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.h0 = this;
        T0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.h0 = null;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = String.format(JniAdExt.n1("ad.dlg.file.property.long_title"), this.s0).concat(this.t0 ? ", ..." : "");
        this.v0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_properties, (ViewGroup) null);
        if (viewInflate != null) {
            this.w0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_filemanager_properties_scroll_view);
            this.x0 = viewInflate.findViewById(R.id.dialog_filemanager_properties_layout);
            this.y0 = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_properties_counts);
            this.z0 = (CircularProgressIndicator) viewInflate.findViewById(R.id.dialog_filemanager_properties_indicator);
            this.A0 = (LinearLayout) viewInflate.findViewById(R.id.dialog_filemanager_properties_contents);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_properties_size_container_title);
            this.B0 = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_properties_size);
            this.C0 = (LinearLayout) viewInflate.findViewById(R.id.dialog_filemanager_properties_writetime_container);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_properties_writetime_container_title);
            this.D0 = (TextView) viewInflate.findViewById(R.id.dialog_filemanager_properties_writetime);
            this.E0 = viewInflate.findViewById(R.id.dialog_filemanager_properties_scroll_hint_top);
            this.F0 = viewInflate.findViewById(R.id.dialog_filemanager_properties_scroll_hint_bottom);
            r3.F(this.y0, JniAdExt.n1("ad.dlg.file.property.please_wait"));
            r3.F(textView, JniAdExt.n1("ad.dlg.file.property.size"));
            r3.F(textView2, JniAdExt.n1("ad.dlg.file.property.wtime"));
            this.w0.setListener(this);
            this.x0.addOnLayoutChangeListener(this.G0);
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.cfg.close"), new a(this, 6));
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
        r3.I(this.E0, scrollY < this.v0 ? 4 : 0);
        r3.I(this.F0, bottom < this.v0 ? 4 : 0);
    }

    public final void T0() {
        int i;
        x00 x00Var = this.u0;
        if (x00Var == null) {
            r3.I(this.z0, 0);
            r3.I(this.A0, 4);
            return;
        }
        boolean z = this.r0;
        synchronized (x00Var.b) {
            try {
                i = z ? x00Var.T : x00Var.S;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i != 0 && i != 1) {
            r3.I(this.z0, 8);
            r3.I(this.A0, 4);
            r3.F(this.y0, hq.u(q51.r(i)));
            return;
        }
        w00 w00VarS = x00Var.s(this.r0);
        CircularProgressIndicator circularProgressIndicator = this.z0;
        if (w00VarS == null) {
            r3.I(circularProgressIndicator, 0);
            r3.I(this.A0, 4);
            return;
        }
        r3.I(circularProgressIndicator, 8);
        r3.I(this.A0, 0);
        r3.F(this.y0, lg.c().e(String.format(JniAdExt.n1("ad.dlg.file.property.num_files_folders"), Integer.valueOf(w00VarS.a), Integer.valueOf(w00VarS.b))));
        r3.F(this.B0, lg.c().e(w00VarS.c));
        r3.I(this.C0, (w00VarS.b > 0 || w00VarS.a > 1) ? 8 : 0);
        r3.F(this.D0, lg.c().e(x00.k(w00VarS.d)));
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.I0.post(new fb0(9, this.r0));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getBoolean("skey_is_local");
        this.s0 = bundle.getString("skey_first_path");
        this.t0 = bundle.getBoolean("skey_ellipsize_title");
        if (this.s0 == null) {
            this.s0 = "";
        }
        x00 x00Var = MainApplication.v().s;
        this.u0 = x00Var;
        if (x00Var == null) {
            this.q0.c("no view model");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.w0.setListener(null);
        this.x0.removeOnLayoutChangeListener(this.G0);
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.u0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_is_local", this.r0);
        bundle.putString("skey_first_path", this.s0);
        bundle.putBoolean("skey_ellipsize_title", this.t0);
    }
}
