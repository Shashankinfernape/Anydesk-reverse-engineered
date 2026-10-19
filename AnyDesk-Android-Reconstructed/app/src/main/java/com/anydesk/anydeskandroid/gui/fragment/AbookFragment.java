package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.jni.JniAdExt;
import defpackage.e;
import defpackage.hd0;
import defpackage.i7;
import defpackage.qa;
import defpackage.t70;
import defpackage.uj;
import defpackage.wc0;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class AbookFragment extends z6 implements wc0, hd0 {
    public boolean b0;

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.z1(this);
        JniAdExt.q1(this);
        R0();
        T0();
    }

    @Override // defpackage.wc0
    public final void B() {
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.S3(this);
        JniAdExt.X3(this);
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        R0();
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new e(this, 1));
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final void R0() {
        if (JniAdExt.Z1()) {
            return;
        }
        t70.V(new i7(13));
        synchronized (this) {
            if (!S0()) {
                uj.x(Y());
            }
        }
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
    }

    public final synchronized boolean S0() {
        boolean z;
        z = this.b0;
        this.b0 = true;
        return z;
    }

    public final void T0() {
        long jP2 = JniAdExt.P2();
        Roster[] rosterArrO2 = JniAdExt.O2();
        if (rosterArrO2 != null) {
            for (Roster roster : rosterArrO2) {
                if (roster.mId == jP2) {
                    String str = roster.mName;
                    qa qaVarY = Y();
                    if (qaVarY != null) {
                        qaVarY.setTitle(str);
                        return;
                    }
                    return;
                }
            }
        }
        qa qaVarY2 = Y();
        if (qaVarY2 != null) {
            qaVarY2.setTitle("");
        }
    }

    @Override // defpackage.wc0
    public final void V() {
    }

    @Override // defpackage.wc0
    public final void f() {
        t70.Y(new e(this, 0));
    }

    @Override // defpackage.wc0
    public final void k() {
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b0 = false;
        return layoutInflater.inflate(R.layout.fragment_abook, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        S0();
    }

    @Override // defpackage.wc0
    public final void w() {
        t70.Y(new e(this, 0));
    }

    @Override // defpackage.wc0
    public final void O() {
    }
}
