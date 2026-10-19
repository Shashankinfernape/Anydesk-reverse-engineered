package defpackage;

import android.view.MenuItem;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements wu0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ f1 e;

    public /* synthetic */ e1(f1 f1Var, String str, int i) {
        this.c = i;
        this.e = f1Var;
        this.d = str;
    }

    @Override // defpackage.wu0
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.c;
        String str = this.d;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                if (menuItem.getItemId() != R.id.menu_abook_roster_item_tag_remove) {
                    return false;
                }
                f1.T0(f1Var, str);
                return true;
            default:
                if (menuItem.getItemId() != R.id.menu_abook_roster_item_tag_add) {
                    return false;
                }
                f1Var.U0(str);
                return true;
        }
    }
}
