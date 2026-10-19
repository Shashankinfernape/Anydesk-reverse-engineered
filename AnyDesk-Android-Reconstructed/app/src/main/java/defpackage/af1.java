package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoginFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class af1 implements r6, wu0, ez0, w6, hl0, pk0, g7, lg0, nq0, xc, le0, uk0, dk0 {
    public static final us0 e = new us0(23);
    public final /* synthetic */ int c;
    public final Object d;

    public af1(int i) {
        this.c = i;
        switch (i) {
            case 22:
                this.d = new AtomicReference(null);
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.d = new x3(this);
                } else {
                    this.d = new y3(this);
                }
                break;
        }
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.hl0
    public void a(rk0 rk0Var, boolean z) {
        if (rk0Var instanceof q71) {
            ((q71) rk0Var).z.k().c(false);
        }
        hl0 hl0Var = ((w5) this.d).g;
        if (hl0Var != null) {
            hl0Var.a(rk0Var, z);
        }
    }

    @Override // defpackage.lg0
    public void b(Object obj, int i, int i2) {
        ((iw0) this.d).a.d(obj, i, i2);
    }

    @Override // defpackage.lg0
    public void c(int i, int i2) {
        ((iw0) this.d).a.f(i, i2);
    }

    @Override // defpackage.lg0
    public void d(int i, int i2) {
        ((iw0) this.d).a.c(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[RETURN] */
    @Override // defpackage.pk0
    public boolean f(rk0 rk0Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        z5 z5Var = ((ActionMenuView) this.d).C;
        if (z5Var != null) {
            Toolbar toolbar = ((ka1) z5Var).c;
            Iterator it = ((CopyOnWriteArrayList) toolbar.I.e).iterator();
            while (it.hasNext()) {
                if (((jl0) it.next()).o(menuItem)) {
                    zOnMenuItemSelected = true;
                    if (zOnMenuItemSelected) {
                        return true;
                    }
                }
            }
            oa1 oa1Var = toolbar.K;
            zOnMenuItemSelected = oa1Var != null ? ((qa1) oa1Var).c.k.onMenuItemSelected(0, menuItem) : false;
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uk0
    public void g(rk0 rk0Var, MenuItem menuItem) {
        ((sj) this.d).h.removeCallbacksAndMessages(rk0Var);
    }

    @Override // defpackage.r6
    public void h(String str) {
        int i = this.c;
        boolean z = false;
        Object obj = this.d;
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
                break;
            case 2:
            case 3:
            case 8:
            case 9:
            default:
                c5 c5Var = (c5) obj;
                Button button = c5Var.F0;
                if (!c5Var.t0 && str != null && !str.trim().isEmpty()) {
                    z = true;
                }
                r3.C(button, z);
                break;
            case 7:
                f1 f1Var = (f1) obj;
                f1Var.F0.e(str);
                f1Var.E0.e(str);
                break;
            case 10:
                o4 o4Var = (o4) obj;
                Button button2 = o4Var.v0;
                if (!o4Var.r0 && str != null && !str.trim().isEmpty()) {
                    z = true;
                }
                r3.C(button2, z);
                break;
            case 11:
                Button button3 = ((r4) obj).z0;
                if (!TextUtils.isEmpty(str) && t70.J(str.trim().toCharArray(), true)) {
                    z = true;
                }
                r3.C(button3, z);
                break;
        }
    }

    @Override // defpackage.g7
    public void i(d80 d80Var) {
        boolean z;
        a70 a70Var = (a70) d80Var;
        a7 a7Var = (a7) this.d;
        ConnectionFragment connectionFragment = a7Var.a;
        if (connectionFragment == null) {
            return;
        }
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (q51.r(a70Var.a)) {
            case 0:
                float f = a70Var.c;
                float f2 = a70Var.d;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new mc0(f, f2, i3));
                return;
            case 1:
                float f3 = a70Var.c;
                float f4 = a70Var.d;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new mc0(f3, f4, i2));
                return;
            case 2:
                connectionFragment.v1(0);
                JniAdExt.I0.post(new tb0(16));
                return;
            case 3:
                float f5 = a70Var.c;
                float f6 = a70Var.d;
                int i4 = a70Var.e;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new nc0(f5, f6, i4, i3));
                return;
            case 4:
                float f7 = a70Var.c;
                float f8 = a70Var.d;
                int i5 = a70Var.e;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new nc0(f7, f8, i5, i2));
                return;
            case 5:
                float f9 = a70Var.c;
                float f10 = a70Var.d;
                float f11 = a70Var.f;
                connectionFragment.v1(0);
                t70.Y(new uo(connectionFragment, i3));
                connectionFragment.B1 = f11;
                JniAdExt.I0.post(new sb0(f9, f10, f11, i2));
                return;
            case 6:
                float f12 = a70Var.c;
                float f13 = a70Var.d;
                float f14 = a70Var.f;
                connectionFragment.v1(0);
                if (Build.VERSION.SDK_INT >= 26) {
                    int width = connectionFragment.w1.getWidth();
                    int height = connectionFragment.w1.getHeight();
                    if (f14 < connectionFragment.B1 / 2.0f && f12 > ((double) width) * 0.7d && f13 > ((double) height) * 0.7d) {
                        t70.Y(new uo(connectionFragment, i2));
                    }
                }
                JniAdExt.I0.post(new sb0(f12, f13, f14, i));
                return;
            case 7:
                connectionFragment.v1(0);
                JniAdExt.I0.post(new tb0(17));
                connectionFragment.v1(0);
                t70.Y(new uo(connectionFragment, i));
                return;
            case 8:
                a7.a(a7Var, a70Var);
                nm0 nm0Var = a70Var.b;
                float f15 = a70Var.c;
                float f16 = a70Var.d;
                connectionFragment.v1(0);
                lp lpVar = connectionFragment.d0;
                if (lpVar == null) {
                    return;
                }
                if (MainApplication.v().n0 == 3) {
                    int i6 = nm0Var.c;
                    if ((i6 & 1) == 1 || (i6 & 4) == 4) {
                        synchronized (lpVar) {
                            z = lpVar.e;
                        }
                        if (!z) {
                            lpVar.z(true);
                            lp lpVar2 = connectionFragment.d0;
                            if (lpVar2 != null) {
                                if (lpVar2.h() == 0) {
                                    connectionFragment.n1(4);
                                } else {
                                    connectionFragment.n1(0);
                                }
                            }
                        }
                    } else {
                        lpVar.z(false);
                    }
                }
                JniAdExt.I0.post(new pc0(nm0Var, f15, f16, i3));
                return;
            case 9:
                connectionFragment.v1(0);
                JniAdExt.I0.post(new tb0(19));
                return;
            case 10:
                a7.a(a7Var, a70Var);
                nm0 nm0Var2 = a70Var.b;
                float f17 = a70Var.c;
                float f18 = a70Var.d;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new pc0(nm0Var2, f17, f18, i2));
                return;
            case 11:
                e7 e7Var = a70Var.g;
                connectionFragment.v1(0);
                JniAdExt.I0.post(new bc0(i2, e7Var));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.uk0
    public void j(rk0 rk0Var, vk0 vk0Var) {
        sj sjVar = (sj) this.d;
        Handler handler = sjVar.h;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = sjVar.j;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (rk0Var == ((rj) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new l9(this, i2 < arrayList.size() ? (rj) arrayList.get(i2) : null, vk0Var, rk0Var), rk0Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.r6
    public boolean k() {
        String text;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                u uVar = (u) obj;
                Dialog dialog = uVar.k0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                u.S0(uVar);
                break;
            case 2:
            case 3:
            case 8:
            case 9:
            default:
                c5 c5Var = (c5) obj;
                Button button = c5Var.F0;
                if (button != null && button.isEnabled()) {
                    c5.S0(c5Var);
                }
                break;
            case 4:
                p0 p0Var = (p0) obj;
                Dialog dialog2 = p0Var.k0;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                p0.S0(p0Var);
                break;
            case 5:
                w0 w0Var = (w0) obj;
                Dialog dialog3 = w0Var.k0;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                w0.S0(w0Var);
                break;
            case 6:
                z0 z0Var = (z0) obj;
                Dialog dialog4 = z0Var.k0;
                if (dialog4 != null) {
                    dialog4.dismiss();
                }
                z0.S0(z0Var);
                break;
            case 7:
                f1 f1Var = (f1) obj;
                AdEditText adEditText = f1Var.s0;
                if (adEditText != null && (text = adEditText.getText()) != null && !text.isEmpty()) {
                    f1Var.U0(text);
                }
                break;
            case 10:
                o4 o4Var = (o4) obj;
                Button button2 = o4Var.v0;
                if (button2 != null && button2.isEnabled()) {
                    o4.S0(o4Var);
                }
                break;
            case 11:
                r4 r4Var = (r4) obj;
                Button button3 = r4Var.z0;
                if (button3 != null && button3.isEnabled()) {
                    r4.S0(r4Var);
                }
                break;
        }
        return true;
    }

    @Override // defpackage.nq0
    public gh1 l(View view, gh1 gh1Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.d;
        WeakHashMap weakHashMap = oe1.a;
        gh1 gh1Var2 = appBarLayout.getFitsSystemWindows() ? gh1Var : null;
        if (!Objects.equals(appBarLayout.g, gh1Var2)) {
            appBarLayout.g = gh1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.n != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return gh1Var;
    }

    @Override // defpackage.ez0
    public void m(String str) {
        AbookRosterFragment abookRosterFragment = ((m0) this.d).j;
        if (abookRosterFragment != null) {
            abookRosterFragment.a0.f(str);
        }
    }

    @Override // defpackage.lg0
    public void n(int i, int i2) {
        ((iw0) this.d).a.e(i, i2);
    }

    @Override // defpackage.pk0
    public void o(rk0 rk0Var) {
        pk0 pk0Var = ((ActionMenuView) this.d).x;
        if (pk0Var != null) {
            pk0Var.o(rk0Var);
        }
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        bc bcVar;
        Collection collection;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 2:
                AbookRosterFragment abookRosterFragment = ((e0) obj).d;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menu_abook_overflow_manage_abooks) {
                    bc bcVar2 = abookRosterFragment.c0;
                    if (bcVar2 != null) {
                        bcVar2.p0(new i(), "AbookManagementDialog", true);
                        return true;
                    }
                } else if (itemId == R.id.menu_abook_overflow_manage_tags) {
                    bc bcVar3 = abookRosterFragment.c0;
                    if (bcVar3 != null) {
                        bcVar3.p0(new w1(), "AbookTagManagementDialog", true);
                        return true;
                    }
                } else if (itemId == R.id.menu_abook_overflow_filter_tags && (bcVar = abookRosterFragment.c0) != null) {
                    v1 v1Var = (v1) abookRosterFragment.a0.e.d();
                    if (v1Var == null || (collection = v1Var.d) == null) {
                        collection = px.c;
                    }
                    d dVar = new d();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("skey_selected_tags", new ArrayList<>(collection));
                    dVar.N0(bundle);
                    bcVar.p0(dVar, "AbookFilterTagsDialog", true);
                    return true;
                }
                return false;
            default:
                ConnectionFragment connectionFragment = (ConnectionFragment) ((s0) obj).d;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.dial_keyboard_restricted) {
                    ConnectionFragment.U0(connectionFragment, ke0.d);
                } else if (itemId2 == R.id.dial_keyboard_unrestricted) {
                    ConnectionFragment.U0(connectionFragment, ke0.e);
                } else if (itemId2 == R.id.dial_keyboard_special) {
                    ConnectionFragment.U0(connectionFragment, ke0.f);
                }
                return true;
        }
    }

    @Override // defpackage.w6
    public boolean r() {
        boolean zJ;
        AccountLoginFragment accountLoginFragment = (AccountLoginFragment) this.d;
        AdEditTextSecure adEditTextSecure = accountLoginFragment.i0;
        AdEditTextSecure adEditTextSecure2 = accountLoginFragment.j0;
        if (adEditTextSecure == null || adEditTextSecure2 == null) {
            zJ = false;
        } else {
            t01 text = adEditTextSecure.getText();
            t01 text2 = adEditTextSecure2.getText();
            if (text.isEmpty() || text2.isEmpty()) {
                zJ = false;
            } else {
                t01 t01VarC = text.c();
                zJ = t70.J(t01VarC.c, true);
                t01VarC.b();
            }
            text.b();
            text2.b();
        }
        if (!zJ) {
            return false;
        }
        AccountLoginFragment.R0(accountLoginFragment);
        return true;
    }

    @Override // defpackage.w6
    public void t(t01 t01Var) {
        AccountLoginFragment accountLoginFragment = (AccountLoginFragment) this.d;
        Button button = accountLoginFragment.l0;
        AdEditTextSecure adEditTextSecure = accountLoginFragment.i0;
        AdEditTextSecure adEditTextSecure2 = accountLoginFragment.j0;
        boolean z = false;
        if (adEditTextSecure != null && adEditTextSecure2 != null) {
            t01 text = adEditTextSecure.getText();
            t01 text2 = adEditTextSecure2.getText();
            if (!text.isEmpty() && !text2.isEmpty()) {
                t01 t01VarC = text.c();
                boolean zJ = t70.J(t01VarC.c, true);
                t01VarC.b();
                z = zJ;
            }
            text.b();
            text2.b();
        }
        r3.C(button, z);
    }

    @Override // defpackage.le0
    public void u(int i, Throwable th) {
        String message = th != null ? th.getMessage() : "null";
        ((Logging) ((y6) this.d).d).e("report states result " + i + ": " + message);
    }

    @Override // defpackage.hl0
    public boolean v(rk0 rk0Var) {
        w5 w5Var = (w5) this.d;
        if (rk0Var == w5Var.e) {
            return false;
        }
        w5Var.A = ((q71) rk0Var).A.a;
        hl0 hl0Var = w5Var.g;
        if (hl0Var != null) {
            return hl0Var.v(rk0Var);
        }
        return false;
    }

    public w3 w(int i) {
        return null;
    }

    public w3 x(int i) {
        return null;
    }

    public af1(bf1 bf1Var, ze1 ze1Var, qr qrVar) {
        this.c = 0;
        bf1Var.getClass();
        ze1Var.getClass();
        qrVar.getClass();
        this.d = new ah(bf1Var, ze1Var, qrVar);
    }

    public /* synthetic */ af1(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public af1(m0 m0Var, fz0 fz0Var) {
        this.c = 3;
        this.d = m0Var;
    }

    public af1(j9 j9Var) {
        this.c = 18;
        ArrayList arrayList = j9Var.b;
        ArrayList arrayListA = ca.a(j9Var.d());
        this.d = arrayListA;
        ArrayList arrayListA2 = ca.a(j9Var.e());
        ca.a(j9Var.d);
        if (arrayListA.isEmpty()) {
            arrayListA2.isEmpty();
        }
    }

    private final void A(String str) {
    }

    private final void B(String str) {
    }

    private final void y(String str) {
    }

    private final void z(String str) {
    }

    @Override // defpackage.xc
    public void e(int i) {
    }

    @Override // defpackage.xc
    public void q(int i) {
    }

    public af1(BottomSheetBehavior bottomSheetBehavior) {
        this.c = 24;
        this.d = bottomSheetBehavior;
        new c(12, this);
    }

    @Override // defpackage.ez0
    public void p(View view, String str) {
    }

    @Override // defpackage.xc
    public void s(int i, float f) {
    }
}
