package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class si0 implements View.OnLongClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ si0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        MainFragment mainFragment = this.d;
        switch (i) {
            case 0:
                gi giVar = new gi(mainFragment.I0(), view);
                giVar.d = new ev(19, this);
                giVar.f(R.menu.menu_speed_dial_size);
                rk0 rk0Var = (rk0) giVar.b;
                MenuItem menuItemFindItem = rk0Var.findItem(R.id.dial_size_tile_big);
                MenuItem menuItemJ = q51.j("ad.abook.view.big_tiles", menuItemFindItem, rk0Var, R.id.dial_size_tile_small);
                MenuItem menuItemJ2 = q51.j("ad.abook.view.small_tiles", menuItemJ, rk0Var, R.id.dial_size_list);
                menuItemJ2.setTitle(JniAdExt.n1("ad.abook.view.list"));
                cj0 cj0Var = mainFragment.c0;
                if (cj0Var != null) {
                    int iR = q51.r(cj0Var.e());
                    if (iR == 0) {
                        menuItemFindItem.setIcon(R.drawable.ic_view_tile_big_active);
                    } else if (iR == 1) {
                        menuItemJ.setIcon(R.drawable.ic_view_tile_small_active);
                    } else if (iR != 2) {
                        mainFragment.b0.a("unhandled speed dial mode");
                    } else {
                        menuItemJ2.setIcon(R.drawable.ic_view_list_active);
                    }
                }
                cl0 cl0Var = (cl0) giVar.c;
                cl0Var.g = true;
                al0 al0Var = cl0Var.i;
                if (al0Var != null) {
                    al0Var.q(true);
                }
                giVar.k();
                return false;
            case 1:
                gi giVar2 = new gi(mainFragment.I0(), view);
                giVar2.d = new ev(20, this);
                giVar2.f(R.menu.menu_speed_dial_category);
                rk0 rk0Var2 = (rk0) giVar2.b;
                MenuItem menuItemFindItem2 = rk0Var2.findItem(R.id.dial_category_all);
                MenuItem menuItemJ3 = q51.j("ad.menu.speed_dial.category.all", menuItemFindItem2, rk0Var2, R.id.dial_category_favorite);
                MenuItem menuItemJ4 = q51.j("ad.menu.speed_dial.category.favorite", menuItemJ3, rk0Var2, R.id.dial_category_recent);
                MenuItem menuItemJ5 = q51.j("ad.menu.speed_dial.category.recent", menuItemJ4, rk0Var2, R.id.dial_category_discover);
                menuItemJ5.setTitle(JniAdExt.n1("ad.menu.speed_dial.category.discover"));
                cj0 cj0Var2 = mainFragment.c0;
                if (cj0Var2 != null) {
                    int iR2 = q51.r(cj0Var2.d());
                    if (iR2 == 0) {
                        menuItemFindItem2.setIcon(R.drawable.ic_view_dial_all_devices_active);
                    } else if (iR2 == 1) {
                        menuItemJ3.setIcon(R.drawable.ic_view_dial_star_active);
                    } else if (iR2 == 2) {
                        menuItemJ4.setIcon(R.drawable.ic_view_dial_recent_active);
                    } else if (iR2 != 3) {
                        mainFragment.b0.a("unhandled speed dial category");
                    } else {
                        menuItemJ5.setIcon(R.drawable.ic_view_dial_discover_active);
                    }
                }
                cl0 cl0Var2 = (cl0) giVar2.c;
                cl0Var2.g = true;
                al0 al0Var2 = cl0Var2.i;
                if (al0Var2 != null) {
                    al0Var2.q(true);
                }
                giVar2.k();
                return false;
            default:
                boolean zG2 = JniAdExt.g2(io.KEY_SHOW_ID_INSTEAD_OF_ALIAS);
                gi giVar3 = new gi(mainFragment.I0(), view);
                rk0 rk0Var3 = (rk0) giVar3.b;
                giVar3.d = new dj(this, zG2);
                io ioVar = io.KEY_ALIAS;
                String strK2 = JniAdExt.k2(ioVar);
                boolean z = (strK2 == null || strK2.isEmpty()) ? false : true;
                boolean z2 = (z || JniAdExt.p3(ioVar)) ? false : true;
                giVar3.f(R.menu.menu_own_addr);
                MenuItem menuItemFindItem3 = rk0Var3.findItem(R.id.context_own_addr_setup_alias);
                menuItemFindItem3.setTitle(JniAdExt.n1("ad.alias.title"));
                if (!z2) {
                    menuItemFindItem3.setVisible(false);
                }
                MenuItem menuItemFindItem4 = rk0Var3.findItem(R.id.context_own_addr_show_alias_id);
                if (zG2) {
                    menuItemFindItem4.setTitle(JniAdExt.n1("ad.connect.share.show_alias"));
                } else {
                    menuItemFindItem4.setTitle(JniAdExt.n1("ad.connect.share.show_id"));
                }
                if (!z) {
                    menuItemFindItem4.setVisible(false);
                }
                rk0Var3.findItem(R.id.context_own_addr_copy_address).setTitle(JniAdExt.n1("ad.connect.share.clipboard"));
                giVar3.k();
                mainFragment.m1 = giVar3;
                return true;
        }
    }
}
