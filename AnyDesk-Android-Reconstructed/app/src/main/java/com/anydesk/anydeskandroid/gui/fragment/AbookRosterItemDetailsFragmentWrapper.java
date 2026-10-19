package com.anydesk.anydeskandroid.gui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.jni.JniAdExt;
import defpackage.c;
import defpackage.hd0;
import defpackage.i7;
import defpackage.qa;
import defpackage.t70;
import defpackage.uj;
import defpackage.wc0;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class AbookRosterItemDetailsFragmentWrapper extends z6 implements wc0, hd0 {
    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.z1(this);
        JniAdExt.q1(this);
        RosterItem rosterItemQ2 = JniAdExt.Q2();
        if (rosterItemQ2 == null) {
            qa qaVarY = Y();
            if (qaVarY != null) {
                qaVarY.setTitle("");
            }
        } else {
            String displayName = rosterItemQ2.getDisplayName();
            qa qaVarY2 = Y();
            if (qaVarY2 != null) {
                qaVarY2.setTitle(displayName);
            }
        }
        if (JniAdExt.Z1()) {
            return;
        }
        t70.V(new i7(13));
        uj.v(Y(), R.id.mainFragment);
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

    @Override // defpackage.hd0
    public final void F() {
        JniAdExt.i4();
        if (JniAdExt.Z1()) {
            uj.x(Y());
        } else {
            t70.V(new i7(13));
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
    }

    @Override // defpackage.wc0
    public final void V() {
    }

    @Override // defpackage.wc0
    public final void f() {
    }

    @Override // defpackage.wc0
    public final void k() {
        t70.Y(new c(2, this));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_abook_roster_item_details_wrapper, viewGroup, false);
    }

    @Override // defpackage.wc0
    public final void w() {
    }

    @Override // defpackage.wc0
    public final void O() {
    }
}
