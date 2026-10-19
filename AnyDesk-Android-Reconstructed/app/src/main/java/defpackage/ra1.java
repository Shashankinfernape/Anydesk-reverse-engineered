package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ra1 extends th1 {
    public final va1 j;
    public final Window.Callback k;
    public final qa1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final ArrayList p = new ArrayList();
    public final bc0 q = new bc0(22, this);

    public ra1(Toolbar toolbar, CharSequence charSequence, kb kbVar) {
        qa1 qa1Var = new qa1(this);
        toolbar.getClass();
        va1 va1Var = new va1(toolbar, false);
        this.j = va1Var;
        kbVar.getClass();
        this.k = kbVar;
        va1Var.k = kbVar;
        toolbar.setOnMenuItemClickListener(qa1Var);
        boolean z = va1Var.g;
        if (!z) {
            va1Var.h = charSequence;
            if ((va1Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    oe1.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.l = new qa1(this);
    }

    @Override // defpackage.th1
    public final void G() {
        this.j.a.removeCallbacks(this.q);
    }

    @Override // defpackage.th1
    public final boolean H(int i, KeyEvent keyEvent) {
        Menu menuE0 = e0();
        if (menuE0 == null) {
            return false;
        }
        menuE0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuE0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.th1
    public final boolean I(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            J();
        }
        return true;
    }

    @Override // defpackage.th1
    public final boolean J() {
        return this.j.a.v();
    }

    @Override // defpackage.th1
    public final void Q(boolean z) {
        int i = z ? 2 : 0;
        va1 va1Var = this.j;
        va1Var.a((i & 2) | (va1Var.b & (-3)));
    }

    @Override // defpackage.th1
    public final void R(boolean z) {
        int i = z ? 8 : 0;
        va1 va1Var = this.j;
        va1Var.a((i & 8) | (va1Var.b & (-9)));
    }

    @Override // defpackage.th1
    public final void U(CharSequence charSequence) {
        va1 va1Var = this.j;
        if (va1Var.g) {
            return;
        }
        Toolbar toolbar = va1Var.a;
        va1Var.h = charSequence;
        if ((va1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (va1Var.g) {
                oe1.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.th1
    public final void V() {
        this.j.a.setVisibility(0);
    }

    public final Menu e0() {
        boolean z = this.n;
        va1 va1Var = this.j;
        if (!z) {
            dj djVar = new dj(this);
            qa1 qa1Var = new qa1(this);
            Toolbar toolbar = va1Var.a;
            toolbar.P = djVar;
            toolbar.Q = qa1Var;
            ActionMenuView actionMenuView = toolbar.c;
            if (actionMenuView != null) {
                actionMenuView.w = djVar;
                actionMenuView.x = qa1Var;
            }
            this.n = true;
        }
        return va1Var.a.getMenu();
    }

    @Override // defpackage.th1
    public final boolean g() {
        w5 w5Var;
        ActionMenuView actionMenuView = this.j.a.c;
        return (actionMenuView == null || (w5Var = actionMenuView.v) == null || !w5Var.d()) ? false : true;
    }

    @Override // defpackage.th1
    public final boolean j() {
        vk0 vk0Var;
        ma1 ma1Var = this.j.a.O;
        if (ma1Var == null || (vk0Var = ma1Var.d) == null) {
            return false;
        }
        if (ma1Var == null) {
            vk0Var = null;
        }
        if (vk0Var == null) {
            return true;
        }
        vk0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.th1
    public final void o(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        ArrayList arrayList = this.p;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        id.c();
    }

    @Override // defpackage.th1
    public final int r() {
        return this.j.b;
    }

    @Override // defpackage.th1
    public final Context u() {
        return this.j.a.getContext();
    }

    @Override // defpackage.th1
    public final void w() {
        this.j.a.setVisibility(8);
    }

    @Override // defpackage.th1
    public final boolean z() {
        va1 va1Var = this.j;
        Toolbar toolbar = va1Var.a;
        bc0 bc0Var = this.q;
        toolbar.removeCallbacks(bc0Var);
        Toolbar toolbar2 = va1Var.a;
        WeakHashMap weakHashMap = oe1.a;
        toolbar2.postOnAnimation(bc0Var);
        return true;
    }

    @Override // defpackage.th1
    public final void P(boolean z) {
    }

    @Override // defpackage.th1
    public final void T(boolean z) {
    }

    @Override // defpackage.th1
    public final void F() {
    }
}
