package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentGeneral;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = (AbookRosterItemDetailsFragment) obj;
                RosterItem rosterItemQ2 = JniAdExt.Q2();
                if (rosterItemQ2 != null) {
                    gi giVar = new gi(abookRosterItemDetailsFragment.I0(), view);
                    giVar.d = new bc(abookRosterItemDetailsFragment, 3, rosterItemQ2);
                    giVar.f(R.menu.menu_abook_roster_item_tags);
                    ((rk0) giVar.b).findItem(R.id.menu_abook_roster_item_tags_edit).setTitle(JniAdExt.n1("ad.abook.edit"));
                    giVar.k();
                }
                return true;
            case 1:
                w1 w1Var = (w1) obj;
                String string = ((Chip) view).getText().toString();
                gi giVar2 = new gi(w1Var.I0(), view);
                giVar2.d = new bc(w1Var, 4, string);
                giVar2.f(R.menu.menu_abook_tag);
                rk0 rk0Var = (rk0) giVar2.b;
                q51.j("ad.abook.menu.rename", rk0Var.findItem(R.id.menu_abook_roster_tag_rename), rk0Var, R.id.menu_abook_roster_tag_delete).setTitle(JniAdExt.n1("ad.abook.menu.remove"));
                giVar2.k();
                return true;
            case 2:
                return AccountRegistrationFragment.R0((AccountRegistrationFragment) obj);
            case 3:
                gi giVar3 = new gi(((ConnectionFragment) obj).I0(), view);
                giVar3.d = new af1(28, this);
                giVar3.f(R.menu.menu_keyboard_switch);
                rk0 rk0Var2 = (rk0) giVar3.b;
                q51.j("ad.menu.keyboard.unrestricted", q51.j("ad.menu.keyboard.restricted", rk0Var2.findItem(R.id.dial_keyboard_restricted), rk0Var2, R.id.dial_keyboard_unrestricted), rk0Var2, R.id.dial_keyboard_special).setTitle(JniAdExt.n1("ad.menu.keyboard.special"));
                cl0 cl0Var = (cl0) giVar3.c;
                cl0Var.g = true;
                al0 al0Var = cl0Var.i;
                if (al0Var != null) {
                    al0Var.q(true);
                }
                giVar3.k();
                return true;
            case 4:
                SettingsFragmentGeneral settingsFragmentGeneral = (SettingsFragmentGeneral) obj;
                gi giVar4 = new gi(settingsFragmentGeneral.I0(), view);
                giVar4.d = new ui0(settingsFragmentGeneral, 10, view);
                giVar4.f(R.menu.menu_settings_general_sound_options);
                ((rk0) giVar4.b).findItem(R.id.context_notificationsound_default).setTitle(JniAdExt.n1("ad.cfg.ui.notification_sound.default"));
                giVar4.k();
                return true;
            case 5:
                dj djVar = ((k61) obj).n;
                if (djVar == null) {
                    return false;
                }
                gi giVar5 = new gi(((MainFragment) djVar.d).I0(), view);
                giVar5.d = new vi0(djVar);
                giVar5.f(R.menu.menu_telemetry_tile);
                rk0 rk0Var3 = (rk0) giVar5.b;
                MenuItem menuItemFindItem = rk0Var3.findItem(R.id.telemetry_open);
                MenuItem menuItemFindItem2 = rk0Var3.findItem(R.id.telemetry_remove);
                menuItemFindItem.setTitle(JniAdExt.n1("ad.connect.motd.tile.open"));
                menuItemFindItem2.setTitle(JniAdExt.n1("ad.connect.motd.tile.remove"));
                djVar.m(giVar5);
                return true;
            default:
                t81 t81Var = (t81) obj;
                xt0 xt0Var = t81Var.h0;
                if (xt0Var == null || !t81Var.s.contains((int) t81Var.d0, (int) t81Var.e0)) {
                    return false;
                }
                xt0Var.g(t81Var);
                return true;
        }
    }
}
