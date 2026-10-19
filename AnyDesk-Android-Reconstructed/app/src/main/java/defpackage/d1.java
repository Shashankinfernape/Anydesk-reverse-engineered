package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements View.OnLongClickListener {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f1 d;

    public d1(f1 f1Var, boolean z) {
        this.d = f1Var;
        this.c = z;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String string = ((Chip) view).getText().toString();
        int i = 1;
        boolean z = this.c;
        f1 f1Var = this.d;
        if (z) {
            gi giVar = new gi(f1Var.I0(), view);
            giVar.d = new e1(f1Var, string, 0);
            giVar.f(R.menu.menu_abook_item_tag_new);
            ((rk0) giVar.b).findItem(R.id.menu_abook_roster_item_tag_remove).setTitle(JniAdExt.n1("ad.abook.tag.menu.remove"));
            giVar.k();
        } else {
            gi giVar2 = new gi(f1Var.I0(), view);
            giVar2.d = new e1(f1Var, string, i);
            giVar2.f(R.menu.menu_abook_item_tag_available);
            ((rk0) giVar2.b).findItem(R.id.menu_abook_roster_item_tag_add).setTitle(JniAdExt.n1("ad.abook.tag.menu.add"));
            giVar2.k();
        }
        return true;
    }
}
