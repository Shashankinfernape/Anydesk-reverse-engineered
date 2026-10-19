package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbookRosterFragment d;

    public /* synthetic */ e0(AbookRosterFragment abookRosterFragment, int i) {
        this.c = i;
        this.d = abookRosterFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bc bcVar;
        int i = this.c;
        AbookRosterFragment abookRosterFragment = this.d;
        switch (i) {
            case 0:
                gi giVar = new gi(abookRosterFragment.I0(), view);
                giVar.d = new af1(2, this);
                giVar.f(R.menu.menu_abook_overflow);
                rk0 rk0Var = (rk0) giVar.b;
                q51.j("ad.abook.item.menu.manage_tags", q51.j("ad.abook.combo.tooltip", rk0Var.findItem(R.id.menu_abook_overflow_manage_abooks), rk0Var, R.id.menu_abook_overflow_manage_tags), rk0Var, R.id.menu_abook_overflow_filter_tags).setTitle(JniAdExt.n1("ad.abook.item.menu.filter_tags"));
                giVar.k();
                break;
            default:
                if (JniAdExt.R2() != 1 && (bcVar = abookRosterFragment.c0) != null) {
                    p0 p0Var = new p0();
                    Bundle bundle = new Bundle();
                    bundle.putString("skey_edit_roster_item_name", "");
                    bundle.putString("skey_edit_roster_item_addr", "");
                    bundle.putString("skey_edit_roster_item_comment", "");
                    p0Var.N0(bundle);
                    bcVar.p0(p0Var, "AbookRosterItemCreateDialog", true);
                }
                break;
        }
    }
}
