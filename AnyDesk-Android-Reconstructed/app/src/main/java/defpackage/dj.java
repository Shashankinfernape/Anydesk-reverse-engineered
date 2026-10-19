package defpackage;

import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class dj implements ad0, wu0, hl0 {
    public boolean c;
    public Object d;

    public /* synthetic */ dj(Object obj, boolean z) {
        this.d = obj;
        this.c = z;
    }

    @Override // defpackage.hl0
    public void a(rk0 rk0Var, boolean z) {
        w5 w5Var;
        ra1 ra1Var = (ra1) this.d;
        if (this.c) {
            return;
        }
        this.c = true;
        ActionMenuView actionMenuView = ra1Var.j.a.c;
        if (actionMenuView != null && (w5Var = actionMenuView.v) != null) {
            w5Var.d();
            r5 r5Var = w5Var.w;
            if (r5Var != null && r5Var.b()) {
                r5Var.i.dismiss();
            }
        }
        ra1Var.k.onPanelClosed(108, rk0Var);
        this.c = false;
    }

    @Override // defpackage.ad0
    public boolean b(int i, int i2, nm0 nm0Var, int i3) {
        if (e()) {
            return ((ad0) this.d).b(i, i2, nm0Var, i3);
        }
        return false;
    }

    @Override // defpackage.ad0
    public boolean c(String str) {
        if (e()) {
            return ((ad0) this.d).c(str);
        }
        return false;
    }

    public boolean d() {
        return this.c;
    }

    public synchronized boolean e() {
        return this.c;
    }

    public synchronized boolean f() {
        return Boolean.TRUE.equals((Boolean) this.d);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    public boolean g(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((fw) this.d) == null) {
            return d();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            dj djVar = m91.a;
            if (directionality == 0) {
                c = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                        c = 1;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                        c = 0;
                        break;
                    default:
                        c = 2;
                        break;
                }
            } else {
                c = 0;
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return d();
        }
        return false;
    }

    public void h(View view, int i, bm0 bm0Var, String str) {
        gi giVar = new gi(((MainFragment) this.d).I0(), view);
        giVar.d = new y7(this, i, str);
        giVar.f(R.menu.menu_motd);
        rk0 rk0Var = (rk0) giVar.b;
        MenuItem menuItemJ = q51.j("ad.connect.motd.tile.open", rk0Var.findItem(R.id.motd_open), rk0Var, R.id.motd_remove);
        if ((bm0Var.c & 2) == 2) {
            menuItemJ.setTitle(JniAdExt.n1("ad.connect.motd.tile.remove"));
            menuItemJ.setVisible(true);
        } else {
            menuItemJ.setVisible(false);
        }
        m(giVar);
    }

    public void i(SpeedDialItem speedDialItem) {
        boolean z = !speedDialItem.mIsFavorite;
        speedDialItem.mIsFavorite = z;
        JniAdExt.E4(speedDialItem.mId, z);
        final String prettyAddr = speedDialItem.getPrettyAddr();
        boolean z2 = speedDialItem.mIsFavorite;
        MainFragment mainFragment = (MainFragment) this.d;
        if (z2) {
            final int i = speedDialItem.mColor1;
            final int i2 = speedDialItem.mColor2;
            final String str = speedDialItem.mThumbnailPath;
            final String displayName = speedDialItem.getDisplayName();
            m80 m80Var = mainFragment.a0;
            if (m80Var != null) {
                final MainActivity mainActivity = (MainActivity) m80Var;
                final a51 a51Var = mainActivity.F;
                a51Var.getClass();
                if (Build.VERSION.SDK_INT >= 25) {
                    w81.b.a(new Runnable() { // from class: z41
                        @Override // java.lang.Runnable
                        public final void run() {
                            a51.b(a51Var, mainActivity, prettyAddr, i, i2, str, displayName);
                        }
                    });
                }
            }
        } else {
            m80 m80Var2 = mainFragment.a0;
            if (m80Var2 != null) {
                MainActivity mainActivity2 = (MainActivity) m80Var2;
                mainActivity2.F.g(mainActivity2, prettyAddr);
            }
        }
        mainFragment.d1();
    }

    public void j(int i, String str) {
        t70.Q(((MainFragment) this.d).a0(), str, false);
        JniAdExt.d4(i, 2);
    }

    public synchronized void k(Boolean bool) {
        this.c = true;
        this.d = bool;
    }

    public synchronized void l(boolean z) {
        try {
            if (this.c && !z) {
                t();
                x();
            }
            this.c = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void m(gi giVar) {
        giVar.e = new vi0(this);
        giVar.k();
        this.c = true;
    }

    public void n() {
        String strN1;
        int iQ2 = JniAdExt.q2();
        if (q51.f(iQ2, 2)) {
            strN1 = JniAdExt.n1("ad.banner.expired.needs_review_by_legal.android");
        } else {
            strN1 = q51.f(iQ2, 4) ? JniAdExt.n1("ad.banner.expires.needs_review_by_legal.android") : JniAdExt.n1("ad.banner.free.needs_review_by_legal.android");
        }
        r3.F((TextView) this.d, strN1);
    }

    @Override // defpackage.ad0
    public boolean o(byte b, int i, de0 de0Var, int i2) {
        if (e()) {
            return ((ad0) this.d).o(b, i, de0Var, i2);
        }
        return false;
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        boolean z = this.c;
        MainFragment mainFragment = ((si0) this.d).d;
        int itemId = menuItem.getItemId();
        int i = 0;
        io ioVar = io.KEY_SHOW_ID_INSTEAD_OF_ALIAS;
        int i2 = 1;
        if (itemId == R.id.context_own_addr_setup_alias) {
            bc bcVar = mainFragment.d0;
            if (bcVar != null) {
                bcVar.p0(new e21(), "AliasSettingsDialog", false);
            }
            JniAdExt.x4(ioVar, !z);
            t70.Y(new ti0(this, JniAdExt.B2(), i));
            return true;
        }
        if (itemId == R.id.context_own_addr_show_alias_id) {
            JniAdExt.x4(ioVar, !z);
            t70.Y(new ti0(this, JniAdExt.B2(), i2));
            return true;
        }
        if (itemId != R.id.context_own_addr_copy_address) {
            return false;
        }
        t70.d0(mainFragment.I0(), "AnyDesk address", JniAdExt.B2(), mainFragment.b0);
        return true;
    }

    public void p() {
        int i = 8;
        if (this.c && !q51.f(JniAdExt.q2(), 1)) {
            i = 0;
        }
        r3.I((TextView) this.d, i);
    }

    @Override // defpackage.ad0
    public void t() {
        if (e()) {
            ((ad0) this.d).t();
        }
    }

    @Override // defpackage.ad0
    public boolean u(e7 e7Var) {
        if (e()) {
            return ((ad0) this.d).u(e7Var);
        }
        return false;
    }

    @Override // defpackage.hl0
    public boolean v(rk0 rk0Var) {
        ((ra1) this.d).k.onMenuOpened(108, rk0Var);
        return true;
    }

    @Override // defpackage.ad0
    public void x() {
        if (e()) {
            ((ad0) this.d).x();
        }
    }

    public /* synthetic */ dj(Object obj) {
        this.d = obj;
    }

    public dj(fw fwVar, boolean z) {
        this(fwVar);
        this.c = z;
    }
}
