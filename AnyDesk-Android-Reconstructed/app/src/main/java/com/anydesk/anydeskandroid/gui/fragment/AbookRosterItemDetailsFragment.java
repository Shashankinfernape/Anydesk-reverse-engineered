package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import defpackage.bc;
import defpackage.bd0;
import defpackage.bu0;
import defpackage.c0;
import defpackage.c40;
import defpackage.hp;
import defpackage.jd0;
import defpackage.m80;
import defpackage.q0;
import defpackage.r0;
import defpackage.s0;
import defpackage.t0;
import defpackage.t70;
import defpackage.uj;
import defpackage.v;
import defpackage.v0;
import defpackage.wc0;
import defpackage.xt0;
import defpackage.zd;
import defpackage.zl0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AbookRosterItemDetailsFragment extends c40 implements bd0, wc0, jd0, v0 {
    public m80 Z;
    public bc a0;
    public View b0;
    public ImageView c0;
    public View d0;
    public TextView e0;
    public View f0;
    public TextView g0;
    public View h0;
    public TextView i0;
    public View j0;
    public TextView k0;
    public ImageView l0;
    public TextView m0;
    public View n0;
    public ChipGroup o0;
    public RosterItem p0;
    public String q0 = null;
    public String[] r0 = null;
    public final xt0 s0 = new xt0(this);
    public final r0 t0 = new r0(this, 2);

    public static void O0(AbookRosterItemDetailsFragment abookRosterItemDetailsFragment, String str) {
        ArrayList arrayListY2 = JniAdExt.y2();
        bc bcVar = abookRosterItemDetailsFragment.a0;
        if (!arrayListY2.isEmpty() && bcVar != null) {
            bcVar.m0((zl0) arrayListY2.get(0), str);
            return;
        }
        m80 m80Var = abookRosterItemDetailsFragment.Z;
        if (m80Var != null) {
            ((MainActivity) m80Var).k0(str);
        }
    }

    @Override // defpackage.c40
    public final void A0() {
        this.F = true;
        JniAdExt.q1(this);
        JniAdExt.p1(this);
        zd zdVar = JniAdExt.b0;
        synchronized (zdVar) {
            zdVar.add(this);
        }
        P0();
    }

    @Override // defpackage.wc0
    public final void B() {
    }

    @Override // defpackage.c40
    public final void B0() {
        this.F = true;
        zd zdVar = JniAdExt.b0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        JniAdExt.R3(this);
        JniAdExt.S3(this);
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.a0 = new bc(Z(), 19);
        this.b0 = view.findViewById(R.id.abook_roster_item_details_container);
        this.c0 = (ImageView) view.findViewById(R.id.abook_roster_item_details_remote_desk_image);
        this.d0 = view.findViewById(R.id.abook_roster_item_details_custom_name_container);
        this.e0 = (TextView) view.findViewById(R.id.abook_roster_item_details_custom_name);
        TextView textView = (TextView) view.findViewById(R.id.abook_roster_item_details_custom_name_description);
        this.f0 = view.findViewById(R.id.abook_roster_item_details_alias_container);
        this.g0 = (TextView) view.findViewById(R.id.abook_roster_item_details_alias);
        TextView textView2 = (TextView) view.findViewById(R.id.abook_roster_item_details_alias_description);
        this.h0 = view.findViewById(R.id.abook_roster_item_details_cid_container);
        this.i0 = (TextView) view.findViewById(R.id.abook_roster_item_details_cid);
        TextView textView3 = (TextView) view.findViewById(R.id.abook_roster_item_details_cid_description);
        this.j0 = view.findViewById(R.id.abook_roster_item_details_host_container);
        this.k0 = (TextView) view.findViewById(R.id.abook_roster_item_details_host);
        TextView textView4 = (TextView) view.findViewById(R.id.abook_roster_item_details_host_description);
        this.l0 = (ImageView) view.findViewById(R.id.abook_roster_item_details_online_status_icon);
        this.m0 = (TextView) view.findViewById(R.id.abook_roster_item_details_online_status_text);
        TextView textView5 = (TextView) view.findViewById(R.id.abook_roster_item_details_online_status_description);
        this.n0 = view.findViewById(R.id.abook_roster_item_details_tags_container);
        this.o0 = (ChipGroup) view.findViewById(R.id.abook_roster_item_details_tags);
        View viewFindViewById = view.findViewById(R.id.abook_roster_item_details_share);
        View viewFindViewById2 = view.findViewById(R.id.abook_roster_item_details_edit);
        textView.setText(JniAdExt.n1("ad.abook.item.custom_name"));
        textView2.setText(JniAdExt.n1("ad.abook.item.alias"));
        textView3.setText(JniAdExt.n1("ad.abook.item.cid"));
        textView4.setText(JniAdExt.n1("ad.abook.item.hostname"));
        textView5.setText(JniAdExt.n1("ad.abook.item.online_status"));
        bu0.D(viewFindViewById, JniAdExt.n1("ad.abook.item.share.tooltip"));
        bu0.D(viewFindViewById2, JniAdExt.n1("ad.abook.edit"));
        int i = 0;
        viewFindViewById.setOnClickListener(new r0(this, i));
        int i2 = 1;
        viewFindViewById2.setOnClickListener(new r0(this, i2));
        View view2 = this.d0;
        r0 r0Var = this.t0;
        view2.setOnClickListener(r0Var);
        this.d0.setOnLongClickListener(new t0(this, i2, i));
        this.f0.setOnClickListener(r0Var);
        this.f0.setOnLongClickListener(new t0(this, 2, i));
        this.h0.setOnClickListener(r0Var);
        this.h0.setOnLongClickListener(new t0(this, 3, i));
        this.j0.setOnClickListener(r0Var);
        this.j0.setOnLongClickListener(new t0(this, 4, i));
        this.n0.setOnLongClickListener(new s0(i, this));
        P0();
    }

    @Override // defpackage.bd0
    public final void M(Map map) {
        t70.Y(new c0(this, 1, map));
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    public final void P0() {
        ImageView imageView;
        View view;
        TextView textView;
        View view2;
        TextView textView2;
        View view3;
        TextView textView3;
        View view4;
        TextView textView4;
        ChipGroup chipGroup;
        RosterItem rosterItemQ2 = JniAdExt.Q2();
        this.p0 = rosterItemQ2;
        View view5 = this.b0;
        if (view5 == null || (imageView = this.c0) == null || (view = this.d0) == null || (textView = this.e0) == null || (view2 = this.f0) == null || (textView2 = this.g0) == null || (view3 = this.h0) == null || (textView3 = this.i0) == null || (view4 = this.j0) == null || (textView4 = this.k0) == null || this.n0 == null || (chipGroup = this.o0) == null) {
            return;
        }
        if (rosterItemQ2 == null) {
            view5.setVisibility(4);
            return;
        }
        String[] strArr = rosterItemQ2.b;
        view5.setVisibility(0);
        if (rosterItemQ2.mUserDefinedName.isEmpty()) {
            view.setVisibility(8);
        } else {
            textView.setText(rosterItemQ2.mUserDefinedName);
            view.setVisibility(0);
        }
        if (rosterItemQ2.mAlias.isEmpty()) {
            view2.setVisibility(8);
        } else {
            textView2.setText(rosterItemQ2.mAlias);
            view2.setVisibility(0);
        }
        long j = rosterItemQ2.mCid;
        if (j == 0) {
            view3.setVisibility(8);
        } else {
            textView3.setText(t70.f(j));
            view3.setVisibility(0);
        }
        if (rosterItemQ2.mHostname.isEmpty()) {
            view4.setVisibility(8);
        } else {
            textView4.setText(rosterItemQ2.mHostname);
            view4.setVisibility(0);
        }
        if (new File(rosterItemQ2.mThumbnailPath).exists()) {
            imageView.setImageResource(R.drawable.unknown_desktop);
            imageView.setImageURI(Uri.parse(rosterItemQ2.mThumbnailPath));
        } else {
            imageView.setBackground(t70.M(rosterItemQ2.mColor1, rosterItemQ2.mColor2));
            imageView.setImageResource(R.drawable.unknown_desktop);
        }
        Q0();
        chipGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        LayoutInflater layoutInflaterC0 = c0();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Chip chip = (Chip) layoutInflaterC0.inflate(R.layout.abook_tag_chip, (ViewGroup) chipGroup, false);
            chip.setText((String) obj);
            chipGroup.addView(chip);
        }
    }

    public final void Q0() {
        ImageView imageView;
        TextView textView;
        RosterItem rosterItem = this.p0;
        if (rosterItem == null || (imageView = this.l0) == null || (textView = this.m0) == null) {
            return;
        }
        int iOrdinal = rosterItem.mOnlineState.ordinal();
        if (iOrdinal == 1) {
            imageView.setImageResource(R.drawable.ic_online_off);
            textView.setText(JniAdExt.n1("ad.abook.item.online.off"));
        } else if (iOrdinal == 2) {
            imageView.setImageResource(R.drawable.ic_online_on);
            textView.setText(JniAdExt.n1("ad.abook.item.online.on"));
        } else if (iOrdinal != 3) {
            imageView.setImageResource(R.drawable.ic_online_na);
            textView.setText(JniAdExt.n1("ad.abook.item.online.na"));
        } else {
            imageView.setImageResource(R.drawable.ic_online_na);
            textView.setText(JniAdExt.n1("ad.abook.item.online.unmonitored"));
        }
    }

    @Override // defpackage.wc0
    public final void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
        if (z) {
            t70.Y(new q0(this, 2));
        }
    }

    @Override // defpackage.wc0
    public final void V() {
        t70.Z(new q0(this, 1), 500L);
    }

    @Override // defpackage.jd0
    public final void c(boolean z) {
        if (z) {
            t70.Y(new q0(this, 0));
        }
    }

    @Override // defpackage.wc0
    public final void f() {
    }

    @Override // defpackage.wc0
    public final void k() {
        t70.Y(new q0(this, 4));
    }

    @Override // defpackage.v0
    public final void l(long j, String str, long j2, String str2, String str3, String str4) {
        if (this.p0 == null) {
            return;
        }
        long jP2 = JniAdExt.P2();
        RosterItem rosterItem = this.p0;
        JniAdExt.I0.post(new hp(jP2, j, new RosterItem(rosterItem.mColor1, rosterItem.mColor2, j2, j, str3, str2, str, rosterItem.mThumbnailPath, str4, rosterItem.b)));
        this.q0 = str;
        uj.E(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.Z = (m80) context;
        } else {
            v.e(context);
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_abook_roster_item_details, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        bc bcVar = this.a0;
        if (bcVar != null) {
            bcVar.e = null;
            this.a0 = null;
        }
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
    }

    @Override // defpackage.c40
    public final void u0() {
        this.F = true;
        this.Z = null;
    }

    @Override // defpackage.wc0
    public final void w() {
        t70.Y(new q0(this, 3));
    }

    @Override // defpackage.wc0
    public final void O() {
    }
}
