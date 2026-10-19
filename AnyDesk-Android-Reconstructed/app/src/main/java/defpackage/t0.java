package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements View.OnLongClickListener {
    public final /* synthetic */ int c;
    public final int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t0(Object obj, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String strF;
        int i = this.c;
        int i2 = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = (AbookRosterItemDetailsFragment) obj;
                RosterItem rosterItemQ2 = JniAdExt.Q2();
                if (rosterItemQ2 != null) {
                    int iR = q51.r(i2);
                    if (iR == 0) {
                        strF = rosterItemQ2.mUserDefinedName;
                    } else if (iR == 1) {
                        strF = rosterItemQ2.mAlias;
                    } else if (iR != 2) {
                        strF = iR != 3 ? rosterItemQ2.getDisplayName() : rosterItemQ2.mHostname;
                    } else {
                        strF = t70.f(rosterItemQ2.mCid);
                    }
                    gi giVar = new gi(abookRosterItemDetailsFragment.I0(), view);
                    rk0 rk0Var = (rk0) giVar.b;
                    giVar.d = new y6(abookRosterItemDetailsFragment, rosterItemQ2, strF);
                    giVar.f(R.menu.menu_abook_roster_item_details);
                    MenuItem menuItemJ = q51.j("ad.connect.sd.tile.connect", q51.j("ad.connect.sd.tile.drop_link", rk0Var.findItem(R.id.menu_abook_roster_item_details_install_shortcut), rk0Var, R.id.menu_abook_roster_item_details_connect), rk0Var, R.id.menu_abook_roster_item_details_browse_files);
                    if (JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER)) {
                        String strN1 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                        if (JniAdExt.s2(12) != 0) {
                            menuItemJ.setTitle(strN1);
                        } else {
                            Context contextA0 = abookRosterItemDetailsFragment.a0();
                            Looper looper = t70.a;
                            r3.w(menuItemJ, strN1, uj.l(contextA0, R.color.colorMenuItemDisabled));
                        }
                    } else {
                        menuItemJ.setVisible(false);
                    }
                    MenuItem menuItemFindItem = rk0Var.findItem(R.id.menu_abook_roster_item_details_vpn);
                    if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
                        menuItemFindItem.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                    } else {
                        menuItemFindItem.setVisible(false);
                    }
                    MenuItem menuItemFindItem2 = rk0Var.findItem(R.id.menu_abook_roster_item_details_tcp_tunneling);
                    if (JniAdExt.g2(io.KEY_FEATURE_TCP_TUNNELING)) {
                        menuItemFindItem2.setTitle(JniAdExt.n1("ad.menu.action.tcp_tunnel"));
                    } else {
                        menuItemFindItem2.setVisible(false);
                    }
                    MenuItem menuItemFindItem3 = rk0Var.findItem(R.id.menu_abook_roster_item_details_chat_history);
                    if (r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) == 1) {
                        menuItemFindItem3.setVisible(false);
                    } else {
                        menuItemFindItem3.setTitle(JniAdExt.n1("ad.chat.history"));
                        menuItemFindItem3.setEnabled(JniAdExt.g3(rosterItemQ2.mCid));
                    }
                    giVar.k();
                }
                return true;
            default:
                x11 x11Var = (x11) ((s) obj).f;
                if (x11Var == null) {
                    return false;
                }
                z11 z11Var = x11Var.c;
                gi giVar2 = new gi(z11Var.I0(), view);
                giVar2.d = new v7(z11Var, i2);
                giVar2.f(R.menu.menu_acl_item);
                rk0 rk0Var2 = (rk0) giVar2.b;
                q51.j("ad.cfg.sec.acl.edit", rk0Var2.findItem(R.id.acl_action_edit), rk0Var2, R.id.acl_action_remove).setTitle(JniAdExt.n1("ad.cfg.sec.acl.remove"));
                giVar2.k();
                return true;
        }
    }
}
