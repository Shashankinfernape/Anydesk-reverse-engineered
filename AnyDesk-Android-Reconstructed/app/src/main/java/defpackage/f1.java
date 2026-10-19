package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends yt {
    public HashSet A0;
    public HashSet B0;
    public final y6 C0 = new y6(this, new f(5, this));
    public final af1 D0 = new af1(7, this);
    public final a1 E0 = new a1(this, 1);
    public final a1 F0 = new a1(this, 0);
    public AbookRosterItemDetailsFragment q0;
    public ChipGroup r0;
    public AdEditText s0;
    public View t0;
    public ChipGroup u0;
    public bc v0;
    public long w0;
    public String x0;
    public ArrayList y0;
    public ArrayList z0;

    public static void S0(f1 f1Var, boolean z) {
        ChipGroup chipGroup = z ? f1Var.r0 : f1Var.u0;
        if (chipGroup == null) {
            return;
        }
        chipGroup.removeAllViews();
        ArrayList arrayList = (z ? f1Var.E0 : f1Var.F0).c;
        if (arrayList == null) {
            return;
        }
        LayoutInflater layoutInflaterC0 = f1Var.c0();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Chip chip = (Chip) layoutInflaterC0.inflate(R.layout.abook_tag_chip_edit, (ViewGroup) chipGroup, false);
            chip.setText((String) obj);
            chip.setOnClickListener(new c1(f1Var, z));
            chip.setOnLongClickListener(new d1(f1Var, z));
            chipGroup.addView(chip);
        }
    }

    public static void T0(f1 f1Var, String str) {
        if (f1Var.A0.remove(str)) {
            f1Var.y0.remove(str);
            f1Var.E0.d();
        }
        if (f1Var.B0.add(str)) {
            f1Var.z0.add(str);
            Collections.sort(f1Var.z0);
            f1Var.F0.d();
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        this.F0.d();
        this.E0.d();
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        this.v0 = new bc(Z(), 19);
        String strN1 = JniAdExt.n1("ad.abook.item.menu.manage_tags");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_roster_item_tags_edit, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.abook_roster_item_tags_edit_new_tags_title);
        this.r0 = (ChipGroup) viewInflate.findViewById(R.id.abook_roster_item_tags_edit_new_tags);
        this.s0 = (AdEditText) viewInflate.findViewById(R.id.abook_roster_item_tags_edit_search_layout);
        this.t0 = viewInflate.findViewById(R.id.abook_roster_item_tags_edit_button_new_item);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.abook_roster_item_tags_edit_available_tags_title);
        this.u0 = (ChipGroup) viewInflate.findViewById(R.id.abook_roster_item_tags_edit_available_tags);
        bu0.D(this.t0, JniAdExt.n1("ad.abook.tag.new.tooltip"));
        this.t0.setOnClickListener(new b(2, this));
        textView.setText(String.format(JniAdExt.n1("ad.abook.dlg.manage_tags.hint.own"), this.x0));
        textView2.setText(JniAdExt.n1("ad.abook.dlg.manage_tags.hint.all"));
        this.s0.setFilter("[\r\n\t]");
        this.s0.setTextListener(this.D0);
        this.C0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new b1(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new b1(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(true);
        return w7VarA;
    }

    public final void U0(String str) {
        if (this.A0.add(str)) {
            this.y0.add(str);
            Collections.sort(this.y0, String.CASE_INSENSITIVE_ORDER);
            this.E0.d();
        }
        if (this.B0.remove(str)) {
            this.z0.remove(str);
            this.F0.d();
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (AbookRosterItemDetailsFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.w0 = bundle.getLong("skey_tag_roster_item_id");
        this.x0 = bundle.getString("skey_tag_roster_item_addr");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("skey_tag_roster_item_new_tags");
        this.y0 = stringArrayList;
        if (stringArrayList == null) {
            this.y0 = new ArrayList();
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("skey_tag_roster_item_available_tags");
        this.z0 = stringArrayList2;
        if (stringArrayList2 == null) {
            this.z0 = new ArrayList();
        }
        this.A0 = new HashSet(this.y0);
        this.B0 = new HashSet(this.z0);
        ArrayList arrayList = this.y0;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Collections.sort(arrayList, comparator);
        Collections.sort(this.z0, comparator);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        bc bcVar = this.v0;
        if (bcVar != null) {
            bcVar.e = null;
            this.v0 = null;
        }
        this.s0.b();
        this.t0.setOnClickListener(null);
        this.r0 = null;
        this.u0 = null;
        this.s0 = null;
        this.t0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putLong("skey_tag_roster_item_id", this.w0);
        bundle.putString("skey_tag_roster_item_addr", this.x0);
        bundle.putStringArrayList("skey_tag_roster_item_new_tags", this.y0);
        bundle.putStringArrayList("skey_tag_roster_item_available_tags", this.z0);
    }
}
