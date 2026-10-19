package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements oc, DialogInterface.OnClickListener {
    public w7 c;
    public jc d;
    public CharSequence e;
    public final /* synthetic */ pc f;

    public ic(pc pcVar) {
        this.f = pcVar;
    }

    @Override // defpackage.oc
    public final boolean b() {
        w7 w7Var = this.c;
        if (w7Var != null) {
            return w7Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.oc
    public final int c() {
        return 0;
    }

    @Override // defpackage.oc
    public final void dismiss() {
        w7 w7Var = this.c;
        if (w7Var != null) {
            w7Var.dismiss();
            this.c = null;
        }
    }

    @Override // defpackage.oc
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.oc
    public final void f(CharSequence charSequence) {
        this.e = charSequence;
    }

    @Override // defpackage.oc
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.oc
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.oc
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.oc
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.oc
    public final void n(int i, int i2) {
        if (this.d == null) {
            return;
        }
        pc pcVar = this.f;
        v7 v7Var = new v7(pcVar.getPopupContext());
        r7 r7Var = (r7) v7Var.d;
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            r7Var.e = charSequence;
        }
        jc jcVar = this.d;
        int selectedItemPosition = pcVar.getSelectedItemPosition();
        r7Var.o = jcVar;
        r7Var.p = this;
        r7Var.s = selectedItemPosition;
        r7Var.r = true;
        w7 w7VarA = v7Var.a();
        this.c = w7VarA;
        AlertController$RecycleListView alertController$RecycleListView = w7VarA.h.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.c.show();
    }

    @Override // defpackage.oc
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        pc pcVar = this.f;
        pcVar.setSelection(i);
        if (pcVar.getOnItemClickListener() != null) {
            pcVar.performItemClick(null, i, this.d.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.oc
    public final CharSequence p() {
        return this.e;
    }

    @Override // defpackage.oc
    public final void q(ListAdapter listAdapter) {
        this.d = (jc) listAdapter;
    }
}
