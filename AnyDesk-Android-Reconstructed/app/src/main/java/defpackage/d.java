package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class d extends yt implements wc0, y0 {
    public HashSet q0;
    public ChipGroup r0;
    public bc s0;
    public AbookRosterFragment t0;

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.q1(this);
        S0();
    }

    @Override // defpackage.wc0
    public final void B() {
        t70.Y(new c(0, this));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.S3(this);
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        this.s0 = new bc(Z(), 19);
        String strN1 = JniAdExt.n1("ad.abook.item.menu.filter_tags");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_abook_tag_management, (ViewGroup) null);
        this.r0 = (ChipGroup) viewInflate.findViewById(R.id.abook_tag_management_tags);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.abook.filter.hint"), new a(this, 0));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(true);
        return w7VarA;
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
    }

    public final void S0() {
        ChipGroup chipGroup = this.r0;
        if (chipGroup == null) {
            return;
        }
        chipGroup.removeAllViews();
        String[] strArrN2 = JniAdExt.N2();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(strArrN2.length);
        int i = 0;
        for (String str : strArrN2) {
            arrayList.add(str);
        }
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        LayoutInflater layoutInflaterC0 = c0();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            Chip chip = (Chip) layoutInflaterC0.inflate(R.layout.abook_tag_chip_edit, (ViewGroup) chipGroup, false);
            chip.setText(str2);
            chip.setActivated(this.q0.contains(str2));
            chip.setOnClickListener(new b(i, this));
            chipGroup.addView(chip);
        }
    }

    @Override // defpackage.y0
    public final void j(String str, long j, String str2) {
        if (str == null || str2.isEmpty()) {
            return;
        }
        JniAdExt.I0.post(new za0(str, j, str2.trim()));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.t0 = (AbookRosterFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("skey_selected_tags");
        HashSet hashSet = new HashSet();
        this.q0 = hashSet;
        if (stringArrayList != null) {
            hashSet.addAll(stringArrayList);
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        bc bcVar = this.s0;
        if (bcVar != null) {
            bcVar.e = null;
            this.s0 = null;
        }
        this.q0.clear();
        this.r0 = null;
        this.t0 = null;
        this.q0 = null;
    }

    @Override // defpackage.wc0
    public final void O() {
    }

    @Override // defpackage.wc0
    public final void V() {
    }

    @Override // defpackage.wc0
    public final void f() {
    }

    @Override // defpackage.wc0
    public final void k() {
    }

    @Override // defpackage.wc0
    public final void w() {
    }
}
