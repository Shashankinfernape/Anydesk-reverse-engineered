package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class q implements View.OnLongClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ iw0 e;

    public /* synthetic */ q(iw0 iw0Var, Object obj, int i) {
        this.c = i;
        this.e = iw0Var;
        this.d = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        io ioVar = io.KEY_CHAT_PATH_CFG;
        io ioVar2 = io.KEY_FEATURE_TCP_TUNNELING;
        io ioVar3 = io.KEY_FEATURE_VPN;
        io ioVar4 = io.KEY_FEATURE_FILEMANAGER;
        Object obj = this.d;
        iw0 iw0Var = this.e;
        int i2 = 0;
        switch (i) {
            case 0:
                g gVar = (g) ((s) iw0Var).f;
                if (gVar == null) {
                    return false;
                }
                Roster roster = (Roster) obj;
                if (!roster.isPersonal()) {
                    gi giVar = new gi(gVar.c.I0(), view);
                    giVar.d = new bc(gVar, 1, roster);
                    giVar.f(R.menu.menu_abook_roster);
                    rk0 rk0Var = (rk0) giVar.b;
                    q51.j("ad.abook.menu.rename", rk0Var.findItem(R.id.menu_abook_roster_rename), rk0Var, R.id.menu_abook_roster_delete).setTitle(JniAdExt.n1("ad.abook.menu.remove"));
                    giVar.k();
                }
                return true;
            case 1:
                AbookRosterFragment abookRosterFragment = ((m0) iw0Var).j;
                if (abookRosterFragment == null) {
                    return false;
                }
                RosterItem rosterItem = ((fz0) obj).a;
                gi giVar2 = new gi(abookRosterFragment.I0(), view);
                giVar2.d = new bc(abookRosterFragment, 2, rosterItem);
                giVar2.f(R.menu.menu_abook_roster_item);
                rk0 rk0Var2 = (rk0) giVar2.b;
                MenuItem menuItemJ = q51.j("ad.connect.sd.tile.connect", q51.j("ad.connect.sd.tile.drop_link", rk0Var2.findItem(R.id.menu_abook_roster_item_install_shortcut), rk0Var2, R.id.menu_abook_roster_item_connect), rk0Var2, R.id.menu_abook_roster_item_browse_files);
                if (JniAdExt.g2(ioVar4)) {
                    String strN1 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                    if (JniAdExt.s2(12) != 0) {
                        menuItemJ.setTitle(strN1);
                    } else {
                        Context contextA0 = abookRosterFragment.a0();
                        Looper looper = t70.a;
                        r3.w(menuItemJ, strN1, uj.l(contextA0, R.color.colorMenuItemDisabled));
                    }
                } else {
                    menuItemJ.setVisible(false);
                }
                MenuItem menuItemFindItem = rk0Var2.findItem(R.id.menu_abook_roster_item_vpn);
                if (JniAdExt.g2(ioVar3)) {
                    menuItemFindItem.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                } else {
                    menuItemFindItem.setVisible(false);
                }
                MenuItem menuItemFindItem2 = rk0Var2.findItem(R.id.menu_abook_roster_item_tcp_tunneling);
                if (JniAdExt.g2(ioVar2)) {
                    menuItemFindItem2.setTitle(JniAdExt.n1("ad.menu.action.tcp_tunnel"));
                } else {
                    menuItemFindItem2.setVisible(false);
                }
                MenuItem menuItemFindItem3 = rk0Var2.findItem(R.id.menu_abook_roster_item_chat_history);
                if (r71.q(JniAdExt.h2(ioVar)) == 1) {
                    menuItemFindItem3.setVisible(false);
                } else {
                    menuItemFindItem3.setTitle(JniAdExt.n1("ad.chat.history"));
                    menuItemFindItem3.setEnabled(JniAdExt.g3(rosterItem.mCid));
                }
                q51.j("ad.abook.menu.remove", rk0Var2.findItem(R.id.menu_abook_roster_item_delete), rk0Var2, R.id.menu_abook_roster_item_edit).setTitle(JniAdExt.n1("ad.abook.edit"));
                giVar2.k();
                return true;
            case 2:
                i21 i21Var = (i21) ((s) iw0Var).f;
                if (i21Var == null) {
                    return false;
                }
                PermissionProfile permissionProfile = (PermissionProfile) obj;
                if (permissionProfile.d || permissionProfile.c) {
                    j21 j21Var = i21Var.c;
                    gi giVar3 = new gi(j21Var.I0(), view);
                    giVar3.d = new ui0(j21Var, 9, permissionProfile);
                    giVar3.f(R.menu.menu_permission_profile_item);
                    rk0 rk0Var3 = (rk0) giVar3.b;
                    MenuItem menuItemFindItem4 = rk0Var3.findItem(R.id.permission_profile_action_rename);
                    menuItemFindItem4.setTitle(JniAdExt.n1("ad.cfg.sec.perm.profile.rename.button"));
                    menuItemFindItem4.setVisible(permissionProfile.d);
                    MenuItem menuItemFindItem5 = rk0Var3.findItem(R.id.permission_profile_action_remove);
                    menuItemFindItem5.setTitle(JniAdExt.n1("ad.cfg.sec.perm.profile.remove.button"));
                    menuItemFindItem5.setVisible(permissionProfile.c);
                    giVar3.k();
                }
                return true;
            case 3:
                dj djVar = ((k61) iw0Var).n;
                if (djVar == null) {
                    return false;
                }
                nu nuVar = (nu) obj;
                MainFragment mainFragment = (MainFragment) djVar.d;
                gi giVar4 = new gi(mainFragment.I0(), view);
                giVar4.d = new ui0(djVar, 1, nuVar);
                giVar4.f(R.menu.menu_discovery);
                rk0 rk0Var4 = (rk0) giVar4.b;
                MenuItem menuItemFindItem6 = rk0Var4.findItem(R.id.discovery_alias);
                String str = nuVar.e;
                if (str.isEmpty()) {
                    menuItemFindItem6.setVisible(false);
                } else {
                    menuItemFindItem6.setTitle(str);
                }
                rk0Var4.findItem(R.id.discovery_id).setTitle(t70.f(nuVar.a));
                MenuItem menuItemFindItem7 = rk0Var4.findItem(R.id.discovery_browse_files);
                if (JniAdExt.g2(ioVar4)) {
                    String strN2 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                    if (JniAdExt.s2(12) != 0) {
                        menuItemFindItem7.setTitle(strN2);
                    } else {
                        r3.w(menuItemFindItem7, strN2, uj.l(mainFragment.a0(), R.color.colorMenuItemDisabled));
                    }
                } else {
                    menuItemFindItem7.setVisible(false);
                }
                MenuItem menuItemFindItem8 = rk0Var4.findItem(R.id.discovery_vpn);
                if (JniAdExt.g2(ioVar3)) {
                    menuItemFindItem8.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                } else {
                    menuItemFindItem8.setVisible(false);
                }
                MenuItem menuItemFindItem9 = rk0Var4.findItem(R.id.discovery_tcp_tunneling);
                if (JniAdExt.g2(ioVar2)) {
                    menuItemFindItem9.setTitle(JniAdExt.n1("ad.menu.action.tcp_tunnel"));
                } else {
                    menuItemFindItem9.setVisible(false);
                }
                djVar.m(giVar4);
                return true;
            case 4:
                dj djVar2 = ((k61) iw0Var).n;
                if (djVar2 == null) {
                    return false;
                }
                RosterItem rosterItem2 = (RosterItem) obj;
                MainFragment mainFragment2 = (MainFragment) djVar2.d;
                gi giVar5 = new gi(mainFragment2.I0(), view);
                giVar5.d = new bc(djVar2, 29, rosterItem2);
                giVar5.f(R.menu.menu_speed_dial);
                rk0 rk0Var5 = (rk0) giVar5.b;
                MenuItem menuItemFindItem10 = rk0Var5.findItem(R.id.dial_alias);
                if (rosterItem2.mAlias.isEmpty()) {
                    menuItemFindItem10.setVisible(false);
                } else {
                    menuItemFindItem10.setTitle(rosterItem2.mAlias);
                }
                rk0Var5.findItem(R.id.dial_id).setTitle(t70.f(rosterItem2.mCid));
                rk0Var5.findItem(R.id.dial_delete).setVisible(false);
                rk0Var5.findItem(R.id.dial_rename).setVisible(false);
                rk0Var5.findItem(R.id.dial_favorite).setVisible(false);
                MenuItem menuItemJ2 = q51.j("ad.connect.sd.tile.drop_link", rk0Var5.findItem(R.id.dial_install_shortcut), rk0Var5, R.id.dial_browse_files);
                if (JniAdExt.g2(ioVar4)) {
                    String strN3 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                    if (JniAdExt.s2(12) != 0) {
                        menuItemJ2.setTitle(strN3);
                    } else {
                        r3.w(menuItemJ2, strN3, uj.l(mainFragment2.a0(), R.color.colorMenuItemDisabled));
                    }
                } else {
                    menuItemJ2.setVisible(false);
                }
                MenuItem menuItemFindItem11 = rk0Var5.findItem(R.id.dial_vpn);
                if (JniAdExt.g2(ioVar3)) {
                    menuItemFindItem11.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                } else {
                    menuItemFindItem11.setVisible(false);
                }
                MenuItem menuItemFindItem12 = rk0Var5.findItem(R.id.dial_tcp_tunneling);
                if (JniAdExt.g2(ioVar2)) {
                    menuItemFindItem12.setTitle(JniAdExt.n1("ad.menu.action.tcp_tunnel"));
                } else {
                    menuItemFindItem12.setVisible(false);
                }
                MenuItem menuItemFindItem13 = rk0Var5.findItem(R.id.dial_chat_history);
                if (r71.q(JniAdExt.h2(ioVar)) == 1) {
                    menuItemFindItem13.setVisible(false);
                } else {
                    menuItemFindItem13.setTitle(JniAdExt.n1("ad.chat.history"));
                    menuItemFindItem13.setEnabled(JniAdExt.g3(rosterItem2.mCid));
                }
                djVar2.m(giVar5);
                return true;
            case 5:
                dj djVar3 = ((k61) iw0Var).n;
                if (djVar3 == null) {
                    return false;
                }
                SpeedDialItem speedDialItem = (SpeedDialItem) obj;
                MainFragment mainFragment3 = (MainFragment) djVar3.d;
                gi giVar6 = new gi(mainFragment3.I0(), view);
                giVar6.d = new ui0(djVar3, i2, speedDialItem);
                giVar6.f(R.menu.menu_speed_dial);
                rk0 rk0Var6 = (rk0) giVar6.b;
                MenuItem menuItemFindItem14 = rk0Var6.findItem(R.id.dial_alias);
                if (speedDialItem.mAlias.isEmpty()) {
                    menuItemFindItem14.setVisible(false);
                } else {
                    menuItemFindItem14.setTitle(speedDialItem.mAlias);
                }
                rk0Var6.findItem(R.id.dial_id).setTitle(t70.f(speedDialItem.mCid));
                MenuItem menuItemJ3 = q51.j("ad.connect.sd.tile.rename", q51.j("ad.connect.sd.tile.remove", rk0Var6.findItem(R.id.dial_delete), rk0Var6, R.id.dial_rename), rk0Var6, R.id.dial_favorite);
                if (speedDialItem.mIsFavorite) {
                    menuItemJ3.setTitle(JniAdExt.n1("ad.abook.item.menu.favorite.remove"));
                } else {
                    menuItemJ3.setTitle(JniAdExt.n1("ad.abook.item.menu.favorite.add"));
                }
                MenuItem menuItemJ4 = q51.j("ad.connect.sd.tile.drop_link", rk0Var6.findItem(R.id.dial_install_shortcut), rk0Var6, R.id.dial_browse_files);
                if (JniAdExt.g2(ioVar4)) {
                    String strN4 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                    if (JniAdExt.s2(12) != 0) {
                        menuItemJ4.setTitle(strN4);
                    } else {
                        r3.w(menuItemJ4, strN4, uj.l(mainFragment3.a0(), R.color.colorMenuItemDisabled));
                    }
                } else {
                    menuItemJ4.setVisible(false);
                }
                MenuItem menuItemFindItem15 = rk0Var6.findItem(R.id.dial_vpn);
                if (JniAdExt.g2(ioVar3)) {
                    menuItemFindItem15.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                } else {
                    menuItemFindItem15.setVisible(false);
                }
                MenuItem menuItemFindItem16 = rk0Var6.findItem(R.id.dial_tcp_tunneling);
                if (JniAdExt.g2(ioVar2)) {
                    menuItemFindItem16.setTitle(JniAdExt.n1("ad.menu.action.tcp_tunnel"));
                } else {
                    menuItemFindItem16.setVisible(false);
                }
                MenuItem menuItemFindItem17 = rk0Var6.findItem(R.id.dial_chat_history);
                if (r71.q(JniAdExt.h2(ioVar)) == 1) {
                    menuItemFindItem17.setVisible(false);
                } else {
                    menuItemFindItem17.setTitle(JniAdExt.n1("ad.chat.history"));
                    menuItemFindItem17.setEnabled(JniAdExt.g3(speedDialItem.mCid));
                }
                djVar3.m(giVar6);
                return true;
            case 6:
                dj djVar4 = ((k61) iw0Var).n;
                if (djVar4 == null) {
                    return false;
                }
                am0 am0Var = (am0) obj;
                djVar4.h(view, am0Var.a, am0Var.b, am0Var.g);
                return true;
            case 7:
                dj djVar5 = ((k61) iw0Var).n;
                if (djVar5 == null) {
                    return false;
                }
                yl0 yl0Var = (yl0) obj;
                djVar5.h(view, yl0Var.a, yl0Var.b, yl0Var.g);
                return true;
            case 8:
                dj djVar6 = ((k61) iw0Var).n;
                if (djVar6 == null) {
                    return false;
                }
                wl0 wl0Var = (wl0) obj;
                djVar6.h(view, wl0Var.a, wl0Var.b, wl0Var.g);
                return true;
            case 9:
                ez0 ez0Var = ((m81) iw0Var).e;
                if (ez0Var == null) {
                    return false;
                }
                ez0Var.p(view, ((n81) obj).a);
                return true;
            default:
                TraceFragment traceFragment = ((gb1) iw0Var).f;
                if (traceFragment == null) {
                    return false;
                }
                traceFragment.S0((String) obj);
                return true;
        }
    }
}
