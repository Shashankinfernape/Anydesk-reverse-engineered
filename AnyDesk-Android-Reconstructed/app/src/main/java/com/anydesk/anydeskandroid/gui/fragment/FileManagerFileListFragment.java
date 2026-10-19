package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.FileManagerAttrsDetailed;
import com.anydesk.anydeskandroid.gui.element.FileManagerAttrsTab;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.button.MaterialButton;
import defpackage.a00;
import defpackage.ab0;
import defpackage.bc;
import defpackage.c;
import defpackage.c00;
import defpackage.c40;
import defpackage.cb1;
import defpackage.cj0;
import defpackage.cl0;
import defpackage.d00;
import defpackage.d3;
import defpackage.e00;
import defpackage.er0;
import defpackage.f;
import defpackage.f00;
import defpackage.fb0;
import defpackage.fc0;
import defpackage.g00;
import defpackage.gi;
import defpackage.gq0;
import defpackage.h;
import defpackage.hq;
import defpackage.i00;
import defpackage.i4;
import defpackage.io;
import defpackage.ki0;
import defpackage.lg;
import defpackage.m80;
import defpackage.mz;
import defpackage.nv0;
import defpackage.q51;
import defpackage.r3;
import defpackage.s;
import defpackage.sz;
import defpackage.t70;
import defpackage.uf0;
import defpackage.uj;
import defpackage.uz;
import defpackage.v00;
import defpackage.vz;
import defpackage.w30;
import defpackage.x00;
import defpackage.xt0;
import defpackage.y2;
import defpackage.y6;
import defpackage.yz;
import defpackage.zd;
import defpackage.zz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class FileManagerFileListFragment extends c40 implements ki0 {
    public TextView A0;
    public TextView B0;
    public LinearLayout C0;
    public LinearLayout D0;
    public AdEditText E0;
    public ImageView F0;
    public View G0;
    public View H0;
    public CardView I0;
    public Button J0;
    public CardView K0;
    public Button L0;
    public m80 a0;
    public x00 b0;
    public bc e0;
    public gq0 f0;
    public s g0;
    public RecyclerView h0;
    public uz j0;
    public RecyclerView k0;
    public LinearLayoutManager l0;
    public g00 m0;
    public FileManagerAttrsTab n0;
    public FileManagerAttrsTab o0;
    public FileManagerAttrsDetailed p0;
    public ImageView q0;
    public MaterialButton r0;
    public gi s0;
    public gi t0;
    public MenuItem u0;
    public MenuItem v0;
    public LinearLayout w0;
    public TextView x0;
    public CheckBox y0;
    public View z0;
    public final Logging Z = new Logging("FileManagerFileListFragment");
    public boolean c0 = true;
    public boolean d0 = true;
    public final ArrayList i0 = new ArrayList();
    public final xt0 M0 = new xt0(this);
    public final y6 N0 = new y6(this, new f(10, this));
    public final w30 O0 = (w30) F0(new a00(this), new i4(2));
    public final a00 P0 = new a00(this);
    public final h Q0 = new h(1, this);
    public final e00 R0 = new e00(this, 0);
    public final e00 S0 = new e00(this, 1);
    public final e00 T0 = new e00(this, 2);

    public static void O0(FileManagerFileListFragment fileManagerFileListFragment, f00 f00Var, boolean z) {
        mz mzVar = f00Var.b;
        if (mzVar != null) {
            if (mzVar.e()) {
                fileManagerFileListFragment.U0(z);
                return;
            }
            JniAdExt.I0.post(new fc0(!z, Collections.singletonList(mzVar.b), 0));
        }
    }

    public static void P0(FileManagerFileListFragment fileManagerFileListFragment, Uri uri) {
        t70.b(fileManagerFileListFragment.a0(), uri, false, UUID.randomUUID().toString() + ".tmp", fileManagerFileListFragment.f0, JniAdExt.n1("ad.status.file_transfer.title"), new d00(0, fileManagerFileListFragment));
    }

    public static void Q0(FileManagerFileListFragment fileManagerFileListFragment) {
        LinearLayout linearLayout = fileManagerFileListFragment.D0;
        AdEditText adEditText = fileManagerFileListFragment.E0;
        View view = fileManagerFileListFragment.H0;
        LinearLayout linearLayout2 = fileManagerFileListFragment.C0;
        if (linearLayout == null || adEditText == null || view == null || linearLayout2 == null) {
            return;
        }
        if (linearLayout.getVisibility() == 0) {
            fileManagerFileListFragment.X0();
            adEditText.l("", false);
            linearLayout.setVisibility(8);
            view.setVisibility(4);
            linearLayout2.setVisibility(0);
        } else {
            linearLayout2.setVisibility(8);
            view.setVisibility(0);
            linearLayout.setVisibility(0);
            AdEditText adEditText2 = fileManagerFileListFragment.E0;
            if (adEditText2 != null) {
                adEditText2.i(true);
            }
        }
        x00 x00Var = fileManagerFileListFragment.b0;
        if (x00Var == null) {
            return;
        }
        boolean z = fileManagerFileListFragment.c0;
        boolean z2 = linearLayout.getVisibility() == 0;
        synchronized (x00Var.b) {
            try {
                if (z) {
                    x00Var.n = z2;
                } else {
                    x00Var.o = z2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void R0(FileManagerFileListFragment fileManagerFileListFragment, v00 v00Var) {
        xt0 xt0Var = fileManagerFileListFragment.M0;
        g00 g00Var = fileManagerFileListFragment.m0;
        if (g00Var == null) {
            return;
        }
        mz mzVar = g00Var.i;
        int i = 22;
        if (mzVar == null) {
            t70.V(new c(i, g00Var));
            return;
        }
        boolean zContains = fileManagerFileListFragment.Q0.c.contains(mzVar);
        if (!mzVar.e()) {
            if (zContains) {
                return;
            }
            xt0Var.u(fileManagerFileListFragment.a0(), JniAdExt.n1("ad.file_browser.drag.msg.file_deleted.android"));
            t70.V(new c(i, g00Var));
            return;
        }
        if (v00Var != null) {
            ArrayList arrayList = v00Var.a;
            if (!arrayList.isEmpty()) {
                v00 v00Var2 = g00Var.k;
                if (v00Var2 != null && v00Var2.a.size() != arrayList.size()) {
                    xt0Var.u(fileManagerFileListFragment.a0(), JniAdExt.n1("ad.file_browser.drag.msg.files_changed.android"));
                }
                g00Var.k = v00Var;
                g00Var.d();
                g00Var.g = zContains ? 2 : 3;
                return;
            }
        }
        if (g00Var.g != 3) {
            xt0Var.u(fileManagerFileListFragment.a0(), JniAdExt.n1("ad.file_browser.drag.msg.file_deleted.android"));
        }
        t70.V(new c(i, g00Var));
    }

    public static void S0(FileManagerFileListFragment fileManagerFileListFragment, ArrayList arrayList) {
        MenuItem menuItem = fileManagerFileListFragment.u0;
        MenuItem menuItem2 = fileManagerFileListFragment.v0;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(z);
        }
    }

    @Override // defpackage.c40
    public final void A0() {
        RecyclerView recyclerView;
        this.F = true;
        zd zdVar = JniAdExt.i0;
        synchronized (zdVar) {
            zdVar.add(this);
        }
        JniAdExt.t1(this);
        x00 x00Var = this.b0;
        if (x00Var != null) {
            W0(x00Var.u());
        }
        a1(this.c0, true);
        s sVar = this.g0;
        if (sVar != null) {
            ArrayList arrayList = (ArrayList) sVar.e;
            if (arrayList.size() > 0 && (recyclerView = this.h0) != null) {
                recyclerView.h0(arrayList.size() - 1);
            }
        }
    }

    @Override // defpackage.c40
    public final void B0() {
        this.F = true;
        zd zdVar = JniAdExt.f0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        JniAdExt.V3(this);
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        String strE;
        boolean z;
        this.e0 = new bc(Z(), 19);
        this.f0 = new gq0(a0());
        this.h0 = (RecyclerView) view.findViewById(R.id.filemanager_dirpath);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.filemanager_roster);
        r3.a(recyclerView);
        this.k0 = recyclerView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.file_transfer_card_content);
        this.n0 = (FileManagerAttrsTab) view.findViewById(R.id.file_transfer_card_attrs_tab_local);
        this.o0 = (FileManagerAttrsTab) view.findViewById(R.id.file_transfer_card_attrs_tab_remote);
        this.p0 = (FileManagerAttrsDetailed) view.findViewById(R.id.file_transfer_card_attrs_detailed);
        this.q0 = (ImageView) view.findViewById(R.id.file_transfer_card_overflow);
        this.r0 = (MaterialButton) view.findViewById(R.id.file_transfer_card_transfer);
        this.w0 = (LinearLayout) view.findViewById(R.id.filemanager_filelist_wrapper);
        this.x0 = (TextView) view.findViewById(R.id.filemanager_permission_text);
        this.C0 = (LinearLayout) view.findViewById(R.id.filemanager_dirpath_container);
        this.D0 = (LinearLayout) view.findViewById(R.id.filemanager_searchbar);
        this.E0 = (AdEditText) view.findViewById(R.id.filemanager_ad_edit_text);
        this.F0 = (ImageView) view.findViewById(R.id.filemanager_home);
        this.G0 = view.findViewById(R.id.filemanager_clear_shares_btn);
        this.y0 = (CheckBox) view.findViewById(R.id.filemanager_selectallfiles_checkbox);
        this.z0 = view.findViewById(R.id.filemanager_selectallfiles_checkbox_padding_right);
        this.H0 = view.findViewById(R.id.filemanager_searchbar_separator);
        ImageView imageView = (ImageView) view.findViewById(R.id.filemanager_searchbar_hide_button);
        this.A0 = (TextView) view.findViewById(R.id.filemanager_result_text);
        this.B0 = (TextView) view.findViewById(R.id.filemanager_roster_drop_overlay);
        this.I0 = (CardView) view.findViewById(R.id.filemanager_snackbar_preparetransfer);
        this.J0 = (Button) view.findViewById(R.id.filemanager_snackbar_button_selectdest);
        this.K0 = (CardView) view.findViewById(R.id.filemanager_snackbar_completetransfer);
        Button button = (Button) view.findViewById(R.id.filemanager_snackbar_button_cancel);
        this.L0 = (Button) view.findViewById(R.id.filemanager_snackbar_button_transfer);
        x00 x00Var = this.b0;
        int i = 1;
        int i2 = 0;
        boolean z2 = this.J0 != null;
        this.d0 = z2;
        int i3 = 8;
        if (x00Var != null) {
            if (z2) {
                synchronized (x00Var.b) {
                    z = x00Var.h;
                }
                this.c0 = z;
            }
            if (x00Var.v(this.c0)) {
                this.E0.l(x00Var.r(this.c0), true);
                this.D0.setVisibility(0);
                this.H0.setVisibility(0);
                this.C0.setVisibility(8);
            }
        }
        if (this.d0) {
            FileManagerAttrsTab fileManagerAttrsTab = this.n0;
            if (fileManagerAttrsTab != null) {
                fileManagerAttrsTab.setDir(JniAdExt.n1("ad.file_manager.this_device"));
                this.n0.setLayoutOnClickListener(new yz(this, i3));
                this.n0.setLayoutOnDragListener(this.S0);
            }
            FileManagerAttrsTab fileManagerAttrsTab2 = this.o0;
            if (fileManagerAttrsTab2 != null) {
                fileManagerAttrsTab2.setDir(JniAdExt.n1("ad.file_manager.remote_device"));
                this.o0.setLayoutOnClickListener(new yz(this, 9));
                this.o0.setLayoutOnDragListener(this.S0);
            }
            f1();
            r3.F(this.J0, JniAdExt.n1("ad.file_browser.select_destination"));
            r3.F(this.L0, JniAdExt.n1("ad.file_browser.transfer"));
            r3.F(button, JniAdExt.n1("ad.dlg.cancel"));
            Button button2 = this.J0;
            if (button2 != null) {
                button2.setOnClickListener(new yz(this, 10));
                this.J0.setOnDragListener(this.T0);
            }
            if (button != null) {
                button.setOnClickListener(new yz(this, i2));
            }
            Button button3 = this.L0;
            if (button3 != null) {
                button3.setOnClickListener(new yz(this, i));
            }
        } else {
            if (this.p0 != null) {
                MainApplication mainApplicationV = MainApplication.v();
                FileManagerAttrsDetailed fileManagerAttrsDetailed = this.p0;
                if (this.c0) {
                    strE = lg.c().e(JniAdExt.B2());
                } else {
                    strE = mainApplicationV.j + " (" + t70.f(mainApplicationV.m) + ")";
                }
                fileManagerAttrsDetailed.setAddr(strE);
                this.p0.setDir(this.c0 ? JniAdExt.n1("ad.file_manager.this_device") : JniAdExt.n1("ad.file_manager.remote_device"));
            }
            if (constraintLayout != null && !this.c0) {
                constraintLayout.setLayoutDirection(!f0().getBoolean(R.bool.is_rtl) ? 1 : 0);
            }
            MaterialButton materialButton = this.r0;
            if (materialButton != null) {
                materialButton.setText(this.c0 ? JniAdExt.n1("ad.file_manager.upload") : JniAdExt.n1("ad.file_manager.download"));
                this.r0.setIconResource(this.c0 ? R.drawable.ic_filemanager_upload : R.drawable.ic_filemanager_download);
                this.r0.setOnClickListener(new yz(this, 2));
            }
        }
        this.q0.setOnClickListener(new yz(this, 3));
        int i4 = 4;
        this.F0.setOnClickListener(new yz(this, i4));
        this.G0.setOnClickListener(new yz(this, 5));
        imageView.setOnClickListener(new yz(this, 6));
        this.y0.setOnClickListener(new yz(this, 7));
        s sVar = new s(3, new ArrayList());
        this.g0 = sVar;
        if (x00Var != null) {
            sVar.i(x00Var.j(this.c0));
        }
        s sVar2 = this.g0;
        sVar2.f = this;
        this.h0.setAdapter(sVar2);
        this.h0.setLayoutManager(new LinearLayoutManager(a0(), 0, false));
        uz uzVar = new uz(a0(), this.Q0.c);
        this.j0 = uzVar;
        uzVar.f = this;
        this.k0.setAdapter(uzVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a0());
        this.l0 = linearLayoutManager;
        this.k0.setLayoutManager(linearLayoutManager);
        Context contextA0 = a0();
        boolean z3 = this.c0;
        vz vzVar = new vz(I0());
        View.inflate(vzVar.getContext(), R.layout.filemanager_roster_item_drag_shadow, vzVar);
        vzVar.c = (ImageView) vzVar.findViewById(R.id.filemanager_roster_item_drag_shadow_icon);
        vzVar.d = (TextView) vzVar.findViewById(R.id.filemanager_roster_item_drag_shadow_badge);
        vzVar.measure(0, 0);
        vzVar.layout(0, 0, vzVar.getMeasuredWidth(), vzVar.getMeasuredHeight());
        g00 g00Var = new g00(contextA0, z3, vzVar, er0.c(), er0.d());
        this.m0 = g00Var;
        g00Var.q = this;
        this.k0.setOnTouchListener(g00Var);
        this.k0.setOnGenericMotionListener(this.m0);
        this.B0.setOnDragListener(this.R0);
        this.B0.setText(JniAdExt.n1("ad.file_browser.drop.msg.android"));
        e1();
        this.E0.setFilter("[\r\n\t]");
        this.E0.setTextListener(this.P0);
        this.N0.g();
        MainApplication.v().k(this);
        MainApplication.v().u.g.e(h0(), new y2(i4, this));
        if (x00Var != null) {
            x00Var.E.e(h0(), new zz(this, 0));
            x00Var.G.e(h0(), new zz(this, 1));
        }
    }

    @Override // defpackage.ki0
    public final void G() {
        t70.Y(new c00(this, 2));
    }

    public final void T0(boolean z, String str, boolean z2) {
        String str2;
        x00 x00Var = this.b0;
        if (x00Var == null || str == null) {
            return;
        }
        int i = 1;
        if (!z2) {
            if (str.equals(x00Var.j(z))) {
                return;
            }
            x00Var.I(z, false);
            JniAdExt.I0.post(new ab0(z, str, i));
            return;
        }
        s sVar = this.g0;
        if (sVar == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) sVar.e;
        if (arrayList == null) {
            str2 = null;
        } else {
            str2 = arrayList.size() <= 1 ? "/" : (String) arrayList.get(arrayList.size() - 2);
        }
        if (str2 == null || str2.equals(x00Var.j(z))) {
            return;
        }
        x00Var.I(z, false);
        JniAdExt.I0.post(new ab0(z, str2, i));
    }

    public final void U0(boolean z) {
        x00 x00Var = this.b0;
        if (x00Var == null) {
            return;
        }
        v00 v00Var = (v00) (z ? x00Var.E : x00Var.G).d();
        if (v00Var == null) {
            return;
        }
        boolean z2 = !z;
        JniAdExt.I0.post(new fc0(z2, v00Var.a, 0));
        x00Var.x(z2, v00Var.b, false);
        JniAdExt.I0.post(new fb0(5, z2));
        x00Var.h(z2);
        if (z || !x00Var.k) {
            return;
        }
        cj0 cj0Var = MainApplication.v().u;
        ArrayList arrayList = (ArrayList) cj0Var.g.d();
        if (arrayList != null) {
            arrayList.clear();
            cj0Var.g.l(arrayList);
        }
    }

    public final void V0() {
        gi giVar = this.s0;
        if (giVar != null) {
            cl0 cl0Var = (cl0) giVar.c;
            if (cl0Var.b()) {
                cl0Var.i.dismiss();
            }
            this.s0 = null;
        }
        gi giVar2 = this.t0;
        if (giVar2 != null) {
            cl0 cl0Var2 = (cl0) giVar2.c;
            if (cl0Var2.b()) {
                cl0Var2.i.dismiss();
            }
            this.t0 = null;
        }
    }

    public final void W0(boolean z) {
        String str;
        v00 v00Var;
        boolean z2;
        FileManagerAttrsTab fileManagerAttrsTab;
        x00 x00Var = this.b0;
        if (x00Var == null) {
            return;
        }
        boolean z3 = (this.c0 || z) ? false : true;
        r3.I(this.w0, z3 ? 4 : 0);
        r3.I(this.x0, z3 ? 0 : 4);
        TextView textView = this.x0;
        if (z3) {
            str = String.format(JniAdExt.n1("ad.dlg.availability.message"), JniAdExt.n1("ad.common.file_transfer"), " (" + JniAdExt.n1("ad.dlg.availability.disallowed_remotely") + ")");
        } else {
            str = "";
        }
        r3.F(textView, str);
        r3.I(this.L0, z3 ? 8 : 0);
        r3.C(this.q0, !z3);
        if (z3) {
            c1();
            ImageView imageView = this.q0;
            Context contextA0 = a0();
            Looper looper = t70.a;
            r3.u(imageView, uj.l(contextA0, R.color.colorFileManagerCardTextSecondary));
            V0();
            Y0();
        } else {
            r3.e(this.q0);
        }
        if (z) {
            if (this.c0 && (fileManagerAttrsTab = this.o0) != null) {
                Context contextA1 = a0();
                Looper looper2 = t70.a;
                fileManagerAttrsTab.setLayoutBackground(contextA1.getDrawable(R.drawable.filemanager_card_button_drag_handling_background));
            }
            Button button = this.J0;
            if (button != null) {
                synchronized (x00Var.b) {
                    z2 = x00Var.i;
                }
                if (z2) {
                    button.setText(JniAdExt.n1("ad.file_browser.drop.msg.android.single_column"));
                }
                Context contextA2 = a0();
                Looper looper3 = t70.a;
                button.setBackgroundTintList(uj.m(contextA2, R.color.filemanager_snackbar_button_drag_handling_background_color));
            }
        } else {
            v00 v00Var2 = (v00) x00Var.E.d();
            if (v00Var2 != null) {
                x00Var.x(false, v00Var2.b, false);
            }
            if (this.c0) {
                FileManagerAttrsTab fileManagerAttrsTab2 = this.o0;
                if (fileManagerAttrsTab2 != null) {
                    fileManagerAttrsTab2.setBadge(0);
                    Context contextA3 = a0();
                    Looper looper4 = t70.a;
                    fileManagerAttrsTab2.setLayoutBackground(contextA3.getDrawable(R.drawable.filemanager_card_button_background));
                }
            } else {
                a1(false, true);
            }
            x00Var.h(false);
            Button button2 = this.J0;
            if (button2 != null) {
                button2.setText(JniAdExt.n1("ad.file_browser.select_destination"));
                Context contextA4 = a0();
                Looper looper5 = t70.a;
                button2.setBackgroundTintList(uj.m(contextA4, R.color.filemanager_snackbar_button_drag_ignoring_background_color));
            }
        }
        if (!this.c0 || (v00Var = (v00) x00Var.G.d()) == null) {
            return;
        }
        r3.C(this.r0, z && !v00Var.a.isEmpty());
    }

    public final void X0() {
        m80 m80Var = this.a0;
        if (m80Var != null) {
            ((MainActivity) m80Var).p0();
        }
    }

    public final void Y0() {
        bc bcVar = this.e0;
        if (bcVar != null) {
            bcVar.F("FileManagerDirCreateDialog");
            bcVar.F("FileManagerFileItemRenameDialog");
            bcVar.F("FileManagerSortFileListDialog");
            bcVar.F("FileManagerFilePropertiesDialog");
            bcVar.F("FileManagerDirGotoDialog");
        }
    }

    public final void Z0(mz mzVar, boolean z, boolean z2) {
        uz uzVar;
        RecyclerView recyclerView;
        x00 x00Var = this.b0;
        if (mzVar == null || x00Var == null) {
            return;
        }
        x00Var.A(mzVar.a, mzVar.a(), z);
        j1();
        l1();
        if (this.d0 && z2 && (uzVar = this.j0) != null) {
            ArrayList arrayList = uzVar.e;
            if (arrayList.size() > 0 && (recyclerView = this.k0) != null) {
                recyclerView.h0(arrayList.size() - 1);
            }
        }
    }

    public final void a1(boolean z, boolean z2) {
        x00 x00Var;
        ArrayList arrayList;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        boolean z3 = this.c0;
        if (z == z3 && (x00Var = this.b0) != null) {
            String strJ = x00Var.j(z3);
            boolean z4 = this.c0;
            synchronized (x00Var.d) {
                try {
                    arrayList = z4 ? x00Var.v : x00Var.w;
                } catch (Throwable th) {
                    throw th;
                }
            }
            s sVar = this.g0;
            uz uzVar = this.j0;
            if (sVar == null || uzVar == null) {
                return;
            }
            if (z2) {
                sVar.i(strJ);
                sVar.d();
                s sVar2 = this.g0;
                if (sVar2 != null) {
                    ArrayList arrayList2 = (ArrayList) sVar2.e;
                    if (arrayList2.size() > 0 && (recyclerView2 = this.h0) != null) {
                        recyclerView2.h0(arrayList2.size() - 1);
                    }
                }
            }
            this.i0.clear();
            this.i0.addAll(arrayList);
            if (!this.i0.isEmpty() && ((mz) this.i0.get(0)).d() && !JniAdExt.g2(io.KEY_FILES_ENABLE_PARENT_FOLDER)) {
                this.i0.remove(0);
            }
            this.Q0.d();
            uzVar.d();
            TextView textView = this.B0;
            if (textView != null) {
                textView.bringToFront();
            }
            j1();
            l1();
            e1();
            if (!z2 || (recyclerView = this.k0) == null) {
                return;
            }
            recyclerView.requestFocus();
        }
    }

    public final void b1(List list, long j, long j2, boolean z) {
        x00 x00Var = this.b0;
        bc bcVar = this.e0;
        if (x00Var == null || bcVar == null) {
            return;
        }
        boolean z2 = this.c0;
        synchronized (x00Var.b) {
            try {
                if (z2) {
                    x00Var.I = null;
                } else {
                    x00Var.H = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x00Var.E(!z ? 1 : 0, this.c0);
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z3 = this.c0;
        if (z) {
            JniAdExt.I0.post(new fc0(z3, list, 2));
        } else {
            int size = list.size();
            Looper looper = t70.a;
            x00Var.H(z3, size, 0, JniAdExt.p2(j), j2);
        }
        boolean z4 = this.c0;
        String str = (String) list.get(0);
        boolean z5 = z || list.size() > 1;
        i00 i00Var = new i00();
        Bundle bundle = new Bundle();
        bundle.putBoolean("skey_is_local", z4);
        bundle.putString("skey_first_path", str);
        bundle.putBoolean("skey_ellipsize_title", z5);
        i00Var.N0(bundle);
        bcVar.p0(i00Var, "FileManagerFilePropertiesDialog", true);
    }

    public final void c1() {
        g00 g00Var = this.m0;
        if (g00Var != null) {
            g00Var.e = false;
            t70.V(new c(22, g00Var));
        }
    }

    public final void d1() {
        uf0 uf0Var;
        x00 x00Var = this.b0;
        LinearLayoutManager linearLayoutManager = this.l0;
        if (x00Var == null || linearLayoutManager == null) {
            return;
        }
        boolean z = this.c0;
        synchronized (x00Var.b) {
            try {
                uf0Var = z ? x00Var.J : x00Var.K;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uf0Var == null) {
            return;
        }
        linearLayoutManager.f0(uf0Var);
    }

    public final void e1() {
        x00 x00Var = this.b0;
        if (x00Var == null) {
            return;
        }
        int iM = x00Var.m(this.c0);
        r3.I(this.A0, (iM == 0 || iM == 1) ? 4 : 0);
        r3.F(this.A0, iM == 0 ? "" : hq.u(q51.r(iM)));
    }

    public final void f1() {
        FileManagerAttrsTab fileManagerAttrsTab = this.n0;
        int i = R.color.colorFileManagerCardTextSecondary;
        if (fileManagerAttrsTab != null) {
            fileManagerAttrsTab.setLayoutEnabled(!this.c0);
            Context contextA0 = a0();
            int i2 = this.c0 ? R.color.colorPrimary : R.color.colorFileManagerCardTextSecondary;
            Looper looper = t70.a;
            fileManagerAttrsTab.setTextColor(uj.l(contextA0, i2));
        }
        FileManagerAttrsTab fileManagerAttrsTab2 = this.o0;
        if (fileManagerAttrsTab2 != null) {
            fileManagerAttrsTab2.setLayoutEnabled(this.c0);
            Context contextA1 = a0();
            if (!this.c0) {
                i = R.color.colorPrimary;
            }
            Looper looper2 = t70.a;
            fileManagerAttrsTab2.setTextColor(uj.l(contextA1, i));
        }
    }

    public final void g1() {
        if (this.d0) {
            x00 x00Var = this.b0;
            LinearLayoutManager linearLayoutManager = this.l0;
            if (x00Var != null && linearLayoutManager != null) {
                Parcelable parcelableG0 = linearLayoutManager.g0();
                boolean z = this.c0;
                synchronized (x00Var.b) {
                    try {
                        if (z) {
                            x00Var.J = (uf0) parcelableG0;
                        } else {
                            x00Var.K = (uf0) parcelableG0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        this.c0 = !this.c0;
        c1();
        g00 g00Var = this.m0;
        if (g00Var != null) {
            g00Var.d = this.c0;
        }
        x00 x00Var2 = this.b0;
        if (x00Var2 != null) {
            if (this.d0) {
                x00Var2.B(this.c0);
                x00Var2.J(this.c0);
                i1((v00) (this.c0 ? x00Var2.E : x00Var2.G).d());
            }
            boolean zU = x00Var2.u();
            boolean z2 = (this.c0 || zU) ? false : true;
            W0(zU);
            if (!z2) {
                a1(this.c0, true);
            }
        }
        if (this.d0) {
            d1();
            h1();
        }
        f1();
    }

    public final void h1() {
        x00 x00Var = this.b0;
        if (x00Var == null) {
            return;
        }
        int i = 0;
        boolean z = this.c0 && x00Var.k;
        r3.I(this.q0, z ? 8 : 0);
        r3.D(this.F0, z ? R.drawable.ic_share : R.drawable.ic_filemanager_home);
        r3.C(this.F0, !z);
        r3.I(this.h0, z ? 4 : 0);
        r3.I(this.G0, z ? 0 : 8);
        MaterialButton materialButton = this.r0;
        if (!this.c0 && x00Var.k) {
            i = 8;
        }
        r3.I(materialButton, i);
    }

    public final void i1(v00 v00Var) {
        v00 v00Var2;
        if (v00Var == null) {
            return;
        }
        int size = v00Var.a.size();
        boolean z = false;
        if (this.d0) {
            r3.I(this.K0, size > 0 ? 0 : 8);
            FileManagerAttrsTab fileManagerAttrsTab = this.n0;
            if (fileManagerAttrsTab != null) {
                fileManagerAttrsTab.setVisibility(0);
            }
            FileManagerAttrsTab fileManagerAttrsTab2 = this.o0;
            if (fileManagerAttrsTab2 != null) {
                if (this.c0) {
                    x00 x00Var = this.b0;
                    if (x00Var != null && (v00Var2 = (v00) x00Var.G.d()) != null && v00Var2.a.isEmpty()) {
                        fileManagerAttrsTab2.setVisibility(0);
                    }
                } else {
                    fileManagerAttrsTab2.setVisibility(0);
                }
            }
        }
        uz uzVar = this.j0;
        if (uzVar == null) {
            return;
        }
        x00 x00Var2 = this.b0;
        boolean z2 = (this.c0 || x00Var2 == null || !x00Var2.k) ? false : true;
        r3.I(this.y0, (z2 || size > 0) ? 8 : 0);
        r3.I(this.z0, (z2 || size > 0) ? 0 : 8);
        if (!z2 && size <= 0) {
            z = true;
        }
        uzVar.g = z;
        uzVar.d();
    }

    public final void j1() {
        ArrayList arrayList = this.Q0.c;
        boolean z = false;
        boolean z2 = true;
        if (arrayList.size() <= 1 && (arrayList.size() != 1 || ((mz) arrayList.get(0)).d())) {
            z2 = false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mz mzVar = (mz) obj;
            if (mzVar != null && !mzVar.d() && !mzVar.e()) {
                r3.C(this.y0, z2);
                r3.B(this.y0, z);
            }
        }
        z = z2;
        r3.C(this.y0, z2);
        r3.B(this.y0, z);
    }

    public final void k1(String str) {
        x00 x00Var = this.b0;
        if (x00Var != null) {
            synchronized (x00Var.b) {
                x00Var.l.i(str);
            }
        }
    }

    public final void l1() {
        ArrayList arrayList;
        int i;
        x00 x00Var = this.b0;
        if (x00Var == null) {
            return;
        }
        ArrayList arrayList2 = this.Q0.c;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            mz mzVar = (mz) obj;
            if (mzVar == null || mzVar.d() || !mzVar.e()) {
                arrayList = arrayList2;
                i = size;
            } else {
                arrayList3.add(mzVar.b);
                arrayList4.add(Long.valueOf(mzVar.a()));
                arrayList = arrayList2;
                i = size;
                j += mzVar.g;
                if (!z2) {
                    j2 = mzVar.i;
                    z2 = true;
                }
                if (mzVar.c()) {
                    z = true;
                }
            }
            arrayList2 = arrayList;
            size = i;
        }
        v00 v00Var = new v00(arrayList3, arrayList4, j, j2, z);
        if (this.d0) {
            r3.I(this.I0, arrayList3.size() > 0 ? 0 : 8);
            t70.V(new d3(this, 15, v00Var));
            FileManagerAttrsTab fileManagerAttrsTab = this.c0 ? this.n0 : this.o0;
            if (fileManagerAttrsTab != null) {
                fileManagerAttrsTab.setBadge(arrayList3.size());
            }
        } else {
            r3.C(this.r0, !this.c0 ? arrayList3.isEmpty() : !x00Var.u() || arrayList3.isEmpty());
            FileManagerAttrsDetailed fileManagerAttrsDetailed = this.p0;
            if (fileManagerAttrsDetailed != null) {
                fileManagerAttrsDetailed.setBadge(arrayList3.size());
            }
            k1(JniAdExt.n1("ad.connect.browse_files.btn"));
        }
        boolean z3 = this.c0;
        synchronized (x00Var.b) {
            try {
                (z3 ? x00Var.F : x00Var.D).i(v00Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.a0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.b0 = MainApplication.v().s;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_filemanager_filelist, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.b0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        x00 x00Var = this.b0;
        if (x00Var != null) {
            x00Var.E.k(this);
            x00Var.G.k(this);
        }
        MainApplication.v().P(this);
        this.g0.f = null;
        this.h0.setAdapter(null);
        this.h0.setLayoutManager(null);
        uz uzVar = this.j0;
        uzVar.d = null;
        uzVar.f = null;
        sz szVar = uzVar.h;
        if (szVar != null) {
            szVar.c = null;
            uzVar.h = null;
        }
        sz szVar2 = uzVar.i;
        if (szVar2 != null) {
            szVar2.c = null;
            uzVar.i = null;
        }
        g00 g00Var = this.m0;
        g00Var.i = null;
        g00Var.j = null;
        g00Var.k = null;
        g00Var.g = 1;
        vz vzVar = g00Var.h;
        if (vzVar != null) {
            vzVar.c = null;
            vzVar.d = null;
            g00Var.h = null;
        }
        g00Var.q = null;
        g00Var.f = null;
        this.k0.setAdapter(null);
        this.k0.setLayoutManager(null);
        this.k0.setOnTouchListener(null);
        this.k0.setOnGenericMotionListener(null);
        this.B0.setOnDragListener(null);
        this.E0.b();
        V0();
        bc bcVar = this.e0;
        if (bcVar != null) {
            bcVar.e = null;
            this.e0 = null;
        }
        gq0 gq0Var = this.f0;
        if (gq0Var != null) {
            gq0Var.b();
            this.f0 = null;
        }
        FileManagerAttrsTab fileManagerAttrsTab = this.n0;
        if (fileManagerAttrsTab != null) {
            fileManagerAttrsTab.n();
            this.n0 = null;
        }
        FileManagerAttrsTab fileManagerAttrsTab2 = this.o0;
        if (fileManagerAttrsTab2 != null) {
            fileManagerAttrsTab2.n();
            this.o0 = null;
        }
        FileManagerAttrsDetailed fileManagerAttrsDetailed = this.p0;
        if (fileManagerAttrsDetailed != null) {
            fileManagerAttrsDetailed.s = null;
            fileManagerAttrsDetailed.t = null;
            fileManagerAttrsDetailed.u = null;
            this.p0 = null;
        }
        r3.E(this.L0, null);
        r3.E(this.r0, null);
        this.q0 = null;
        this.r0 = null;
        this.g0 = null;
        this.h0 = null;
        this.l0 = null;
        this.j0 = null;
        this.k0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.y0 = null;
        this.z0 = null;
        this.H0 = null;
        this.A0 = null;
        this.B0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
    }

    @Override // defpackage.c40
    public final void u0() {
        this.F = true;
        this.a0 = null;
    }

    @Override // defpackage.c40
    public final void w0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.w0(context, attributeSet, bundle);
        try {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nv0.d);
            this.c0 = typedArrayObtainStyledAttributes.getBoolean(0, this.c0);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            this.Z.d(th);
        }
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        LinearLayout linearLayout = this.D0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            RecyclerView recyclerView = this.k0;
            if (recyclerView == null) {
                return;
            }
            recyclerView.requestFocus();
            return;
        }
        AdEditText adEditText = this.E0;
        if (adEditText != null) {
            adEditText.i(false);
        }
    }

    @Override // defpackage.ki0
    public final void z() {
        t70.Y(new c00(this, 1));
    }
}
