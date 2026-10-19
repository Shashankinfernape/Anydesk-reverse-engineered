package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.AnynetAccountInfo;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AutoResizeTextView;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ qi0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    private final void a(View view) {
        boolean zBooleanValue;
        cj0 cj0Var = this.d.c0;
        if (cj0Var == null) {
            return;
        }
        synchronized (cj0Var) {
            Boolean bool = (Boolean) cj0Var.d.d();
            zBooleanValue = bool != null ? bool.booleanValue() : false;
        }
        if (zBooleanValue) {
            cj0Var.m(false);
            cj0Var.p(1);
            this.d.o1();
            RecyclerView recyclerView = this.d.A0;
            if (recyclerView != null) {
                recyclerView.h0(0);
                return;
            }
            return;
        }
        MainFragment mainFragment = this.d;
        cj0 cj0Var2 = mainFragment.c0;
        if (cj0Var2 == null) {
            return;
        }
        int iR = q51.r(cj0Var2.e());
        if (iR == 0) {
            cj0Var2.p(2);
        } else if (iR == 1) {
            cj0Var2.p(3);
        } else if (iR != 2) {
            mainFragment.b0.a("unhandled speed dial mode");
            cj0Var2.p(1);
        } else {
            cj0Var2.p(1);
        }
        mainFragment.o1();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z80 z80Var;
        boolean z = false;
        int i = 1;
        switch (this.c) {
            case 0:
                MainFragment.V0(this.d, view, MainApplication.v().D);
                return;
            case 1:
                MainFragment mainFragment = this.d;
                gi giVar = new gi(mainFragment.I0(), view);
                giVar.d = new ev(17, this);
                giVar.f(R.menu.menu_incoming_overflow_actions);
                rk0 rk0Var = (rk0) giVar.b;
                MenuItem menuItemJ = q51.j("ad.accept.permissions", rk0Var.findItem(R.id.menu_incoming_permissions), rk0Var, R.id.menu_incoming_sync_clipboard);
                menuItemJ.setTitle(JniAdExt.n1("ad.menu.clipboard"));
                if (Build.VERSION.SDK_INT >= 29) {
                    MainApplication mainApplicationV = MainApplication.v();
                    ev evVar = mainApplicationV.q;
                    synchronized (evVar) {
                        z80Var = (z80) evVar.d;
                    }
                    PermissionProfile permissionProfile = z80Var == null ? null : z80Var.l;
                    if (permissionProfile != null && mainApplicationV.o0 == 2) {
                        if (permissionProfile.m.contains(du0.pf_clipboard)) {
                            z = true;
                        }
                    }
                }
                menuItemJ.setVisible(z);
                MenuItem menuItemFindItem = rk0Var.findItem(R.id.menu_incoming_send_trace_file);
                menuItemFindItem.setTitle(JniAdExt.n1("ad.menu.incoming.send_trace_file"));
                menuItemFindItem.setVisible(MainApplication.v().m());
                giVar.k();
                mainFragment.n1 = giVar;
                return;
            case 2:
                MainFragment mainFragment2 = this.d;
                int i2 = MainApplication.v().D;
                if (mainFragment2.a0 != null) {
                    JniAdExt.I0.post(new cp(i2, 20));
                    return;
                }
                return;
            case 3:
                int i3 = MainApplication.v().n0;
                if (i3 == 2 || i3 == 3) {
                    uj.v(this.d.Y(), R.id.connectionFragment);
                    return;
                }
                return;
            case 4:
                MainFragment.S0(this.d, MainApplication.v().o);
                return;
            case 5:
                MainFragment.V0(this.d, view, 0);
                return;
            case 6:
                MainFragment mainFragment3 = this.d;
                MainFragment.X0(mainFragment3, mainFragment3.a1());
                return;
            case 7:
                MainFragment mainFragment4 = this.d;
                gi giVar2 = new gi(mainFragment4.I0(), view);
                giVar2.d = new ev(18, this);
                giVar2.f(R.menu.menu_addr_actions);
                rk0 rk0Var2 = (rk0) giVar2.b;
                MenuItem menuItemFindItem2 = rk0Var2.findItem(R.id.context_addr_action_vpn);
                if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
                    menuItemFindItem2.setTitle(JniAdExt.n1("ad.menu.action.vpn"));
                } else {
                    menuItemFindItem2.setVisible(false);
                    i = 0;
                }
                MenuItem menuItemFindItem3 = rk0Var2.findItem(R.id.context_addr_action_browse_files);
                if (JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER)) {
                    String strN1 = JniAdExt.n1("ad.abook.item.menu.file_manager");
                    if (JniAdExt.s2(12) != 0) {
                        menuItemFindItem3.setTitle(strN1);
                    } else {
                        Context contextA0 = mainFragment4.a0();
                        Looper looper = t70.a;
                        r3.w(menuItemFindItem3, strN1, uj.l(contextA0, R.color.colorMenuItemDisabled));
                    }
                    i++;
                } else {
                    menuItemFindItem3.setVisible(false);
                }
                if (i > 0) {
                    giVar2.k();
                    return;
                }
                return;
            case 8:
                a(view);
                return;
            case 9:
                this.d.j1(true);
                return;
            case 10:
                MainFragment mainFragment5 = this.d;
                cj0 cj0Var = mainFragment5.c0;
                if (cj0Var == null) {
                    return;
                }
                cj0Var.o(1);
                mainFragment5.n1();
                return;
            case 11:
                MainFragment mainFragment6 = this.d;
                cj0 cj0Var2 = mainFragment6.c0;
                if (cj0Var2 == null) {
                    return;
                }
                cj0Var2.o(2);
                mainFragment6.n1();
                return;
            case 12:
                MainFragment mainFragment7 = this.d;
                cj0 cj0Var3 = mainFragment7.c0;
                if (cj0Var3 == null) {
                    return;
                }
                cj0Var3.o(3);
                mainFragment7.n1();
                return;
            case 13:
                MainFragment mainFragment8 = this.d;
                cj0 cj0Var4 = mainFragment8.c0;
                if (cj0Var4 == null) {
                    return;
                }
                cj0Var4.o(4);
                mainFragment8.n1();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                MainFragment mainFragment9 = this.d;
                String str = JniAdExt.m;
                if (JniAdExt.l != 2) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - mainFragment9.p1 > 5000) {
                        JniAdExt.Q3();
                        mainFragment9.p1 = jUptimeMillis;
                    }
                }
                mainFragment9.o1.u(mainFragment9.a0(), str);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                t70.U(this.d.a0(), JniAdExt.o1("ad.cid.help.href"));
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                MainFragment mainFragment10 = this.d;
                if (view.isActivated()) {
                    nr0 nr0Var = mainFragment10.a1;
                    AutoResizeTextView autoResizeTextView = nr0Var.s ? nr0Var.e : nr0Var.f;
                    String string = autoResizeTextView == null ? "" : autoResizeTextView.getText().toString();
                    if (TextUtils.isEmpty(string) || mainFragment10.f0().getString(R.string.own_addr_default_value).equals(string)) {
                        return;
                    }
                    t70.e0(mainFragment10.Y(), string, JniAdExt.B2(), true);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                uj.v(this.d.Y(), R.id.setupFragment);
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                AnynetAccountInfo anynetAccountInfoD1 = JniAdExt.D1();
                uj.v(this.d.Y(), anynetAccountInfoD1.mStatus == g9.as_logged_in ? R.id.accountLoggedInFragment : R.id.accountLoginFragment);
                if (anynetAccountInfoD1.mStatus == g9.as_verification_pending) {
                    t70.V(new i7(9));
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                this.d.b1.scrollTo(0, 0);
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                MainFragment mainFragment11 = this.d;
                cj0 cj0Var5 = mainFragment11.c0;
                if (cj0Var5 != null) {
                    cj0Var5.l(8);
                }
                mainFragment11.m1();
                MainApplication.v().L();
                return;
            case 21:
                MainFragment mainFragment12 = this.d;
                if (er0.f() || r3.o(mainFragment12, mainFragment12.s1, mainFragment12.b0)) {
                    MainFragment.U0(mainFragment12);
                    return;
                }
                return;
            default:
                MainFragment mainFragment13 = this.d;
                if (!mainFragment13.F0.isActivated()) {
                    mainFragment13.o1.u(mainFragment13.a0(), JniAdExt.n1("ad.accept.file_transfer.text"));
                    return;
                } else {
                    if (er0.f() || r3.o(mainFragment13, mainFragment13.r1, mainFragment13.b0)) {
                        MainFragment.R0(mainFragment13);
                        return;
                    }
                    return;
                }
        }
    }
}
