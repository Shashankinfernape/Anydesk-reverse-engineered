package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.FileObserver;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.ap;
import defpackage.bu0;
import defpackage.cb0;
import defpackage.cb1;
import defpackage.d6;
import defpackage.db1;
import defpackage.eb1;
import defpackage.f;
import defpackage.gb1;
import defpackage.gr0;
import defpackage.hb1;
import defpackage.ib1;
import defpackage.j0;
import defpackage.jb1;
import defpackage.ji0;
import defpackage.jl0;
import defpackage.m80;
import defpackage.r3;
import defpackage.rk0;
import defpackage.t70;
import defpackage.xt0;
import defpackage.y11;
import defpackage.y6;
import defpackage.z00;
import defpackage.z6;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TraceFragment extends z6 implements jl0, ji0 {
    public m80 c0;
    public gb1 e0;
    public RecyclerView f0;
    public AdEditText h0;
    public View i0;
    public View j0;
    public MenuItem k0;
    public final Logging b0 = new Logging("TraceFragment");
    public final ArrayList d0 = new ArrayList();
    public final jb1 g0 = new jb1();
    public final xt0 l0 = new xt0(this);
    public final y6 m0 = new y6(this, new f(19, this));
    public final xt0 n0 = new xt0(19, this);
    public final y11 o0 = new y11(1, this);

    public static void R0(TraceFragment traceFragment, int i) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        xt0 xt0Var = traceFragment.l0;
        y11 y11Var = traceFragment.o0;
        AdEditText adEditText = traceFragment.h0;
        if (adEditText == null) {
            return;
        }
        String text = adEditText.getText();
        if (TextUtils.isEmpty(text) || (recyclerView = traceFragment.f0) == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null) {
            return;
        }
        int iN0 = i != 1 ? linearLayoutManager.N0() + 1 : linearLayoutManager.M0() - 1;
        ArrayList arrayList = y11Var.c;
        while (gr0.b(arrayList, i, iN0)) {
            String str = (String) arrayList.get(iN0);
            if (!TextUtils.isEmpty(str) && z00.b(str.toLowerCase(), text.toLowerCase().split(" +"))) {
                break;
            } else {
                iN0 = i != 1 ? iN0 + 1 : iN0 - 1;
            }
        }
        if (!gr0.b(arrayList, i, iN0)) {
            xt0Var.u(traceFragment.I0(), JniAdExt.n1("ad.about.support.anydesk_trace.end_of_search"));
            return;
        }
        recyclerView.h0(iN0);
        Toast toast = (Toast) xt0Var.d;
        Looper looper = t70.a;
        if (toast == null) {
            return;
        }
        try {
            toast.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        Window windowO0;
        super.A0();
        if (Build.VERSION.SDK_INT < 30 && (windowO0 = O0()) != null) {
            windowO0.setSoftInputMode(18);
        }
        jb1 jb1Var = this.g0;
        synchronized (jb1Var) {
            try {
                FileObserver fileObserver = jb1Var.c;
                if (fileObserver != null) {
                    fileObserver.startWatching();
                }
                jb1Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        Window windowO0;
        super.B0();
        if (Build.VERSION.SDK_INT < 30 && (windowO0 = O0()) != null) {
            windowO0.setSoftInputMode(34);
        }
        jb1 jb1Var = this.g0;
        synchronized (jb1Var) {
            FileObserver fileObserver = jb1Var.c;
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        G0().O(this, this);
        this.h0 = (AdEditText) view.findViewById(R.id.trace_searchbar);
        this.i0 = view.findViewById(R.id.trace_search_btn_up);
        this.j0 = view.findViewById(R.id.trace_search_btn_down);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.trace_lines_view);
        r3.a(recyclerView);
        this.f0 = recyclerView;
        gb1 gb1Var = new gb1(I0(), this.o0.c);
        this.e0 = gb1Var;
        gb1Var.f = this;
        this.f0.setItemAnimator(null);
        this.f0.setAdapter(this.e0);
        this.h0.setFilter("[\r\n\t]");
        this.h0.setTextListener(this.n0);
        this.m0.g();
        bu0.D(this.i0, JniAdExt.n1("ad.about.support.anydesk_trace.search.direction.up"));
        bu0.D(this.j0, JniAdExt.n1("ad.about.support.anydesk_trace.search.direction.down"));
        this.i0.setOnClickListener(new db1(this, 0));
        this.j0.setOnClickListener(new db1(this, 1));
        MainApplication.v().j(this);
        jb1 jb1Var = this.g0;
        Context applicationContext = G0().getApplicationContext();
        synchronized (jb1Var) {
            try {
                MainApplication.q(applicationContext);
                String strW2 = JniAdExt.w2();
                if (strW2 != null) {
                    jb1Var.b = new File(strW2);
                    if (Build.VERSION.SDK_INT >= 29) {
                        jb1Var.c = new hb1(jb1Var, jb1Var.b);
                    } else {
                        jb1Var.c = new ib1(jb1Var, strW2);
                    }
                }
                jb1Var.g = this;
                jb1Var.c(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ji0
    public final void E() {
        t70.Y(new eb1(this, 0));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final void S0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context contextI0 = I0();
        if (t70.d0(contextI0, JniAdExt.n1("ad.about.support.anydesk_trace"), str, this.b0)) {
            this.l0.u(contextI0, JniAdExt.n1("ad.status.tooltip.clipboard_text.android"));
        }
    }

    @Override // defpackage.ji0
    public final void T() {
    }

    public final void T0() {
        AdEditText adEditText = this.h0;
        if (adEditText == null) {
            return;
        }
        U0(adEditText.getText());
        SharedPreferences sharedPreferences = MainApplication.v().T;
        Looper looper = t70.a;
        boolean z = true;
        try {
            z = sharedPreferences.getBoolean("trace_filter_search", true);
        } catch (Throwable unused) {
        }
        adEditText.setHint(z ? JniAdExt.n1("ad.about.support.anydesk_trace.filter.hint") : JniAdExt.n1("ad.about.support.anydesk_trace.search.hint"));
    }

    @Override // defpackage.ji0
    public final void U() {
        t70.Y(new eb1(this, 1));
    }

    public final void U0(String str) {
        boolean z;
        SharedPreferences sharedPreferences = MainApplication.v().T;
        Looper looper = t70.a;
        try {
            z = sharedPreferences.getBoolean("trace_filter_search", true);
        } catch (Throwable unused) {
            z = true;
        }
        this.o0.e((!z || TextUtils.isEmpty(str)) ? "" : str);
        boolean z2 = (z || TextUtils.isEmpty(str)) ? false : true;
        r3.I(this.i0, z2 ? 0 : 8);
        r3.I(this.j0, z2 ? 0 : 8);
    }

    public final void V0() {
        MenuItem menuItem = this.k0;
        if (menuItem != null) {
            menuItem.setVisible(MainApplication.v().m());
        }
    }

    @Override // defpackage.jl0
    public final boolean o(MenuItem menuItem) {
        MainApplication mainApplicationV = MainApplication.v();
        int itemId = menuItem.getItemId();
        boolean z = true;
        if (itemId == R.id.menu_trace_filter_search) {
            boolean z2 = !menuItem.isChecked();
            menuItem.setChecked(z2);
            t70.b0(mainApplicationV.T, "trace_filter_search", z2);
            T0();
            return true;
        }
        if (itemId == R.id.menu_trace_live_updates) {
            boolean zIsChecked = menuItem.isChecked();
            boolean z3 = !zIsChecked;
            menuItem.setChecked(z3);
            t70.b0(mainApplicationV.T, "trace_instant_updates", z3);
            if (!zIsChecked) {
                t70.Y(new ap(this, 6, z));
            }
            return true;
        }
        if (itemId == R.id.menu_trace_auto_scroll) {
            boolean z4 = !menuItem.isChecked();
            menuItem.setChecked(z4);
            t70.b0(mainApplicationV.T, "trace_auto_scroll", z4);
            return true;
        }
        if (itemId == R.id.menu_trace_copy_to_clipboard) {
            S0((String) Collection$EL.stream(this.o0.c).map(new j0(4)).collect(Collectors.joining("\n")));
            return true;
        }
        if (itemId != R.id.menu_trace_send_file) {
            return false;
        }
        JniAdExt.I0.post(new cb0(mainApplicationV.D, JniAdExt.w2(), 2));
        this.l0.u(I0(), JniAdExt.n1("ad.menu.incoming.send_trace_file.result"));
        return true;
    }

    @Override // defpackage.z6, android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        RecyclerView recyclerView = this.f0;
        if (Build.VERSION.SDK_INT < 30 || recyclerView == null) {
            return super.onApplyWindowInsets(view, windowInsets);
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        int i = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        if (i > 0) {
            i -= insets.bottom;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
        layoutParams.bottomMargin = i;
        recyclerView.setLayoutParams(layoutParams);
        return super.onApplyWindowInsets(view, windowInsets);
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void p(Menu menu) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z6, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.c0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.ji0
    public final void r() {
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        G0().setTitle(JniAdExt.n1("ad.about.support.anydesk_trace"));
        return layoutInflater.inflate(R.layout.fragment_trace, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        MainApplication.v().O(this);
        jb1 jb1Var = this.g0;
        synchronized (jb1Var) {
            jb1Var.b();
            jb1Var.g = null;
            jb1Var.b = null;
            jb1Var.d = null;
            jb1Var.c = null;
        }
        AdEditText adEditText = this.h0;
        if (adEditText != null) {
            adEditText.b();
            this.h0 = null;
        }
        RecyclerView recyclerView = this.f0;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            this.f0 = null;
        }
        gb1 gb1Var = this.e0;
        if (gb1Var != null) {
            gb1Var.f = null;
            this.e0 = null;
        }
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void u0() {
        super.u0();
        this.c0 = null;
    }

    @Override // defpackage.jl0
    public final void v(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        menuInflater.inflate(R.menu.menu_trace, menu);
        boolean z3 = true;
        if (menu instanceof rk0) {
            ((rk0) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            d6.C(menu);
        }
        SharedPreferences sharedPreferences = MainApplication.v().T;
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_trace_filter_search);
        menuItemFindItem.setTitle(JniAdExt.n1("ad.about.support.anydesk_trace.menu.filter_search"));
        Looper looper = t70.a;
        try {
            z = sharedPreferences.getBoolean("trace_filter_search", true);
        } catch (Throwable unused) {
            z = true;
        }
        menuItemFindItem.setChecked(z);
        T0();
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_trace_live_updates);
        menuItemFindItem2.setTitle(JniAdExt.n1("ad.about.support.anydesk_trace.menu.live_updates"));
        try {
            z2 = sharedPreferences.getBoolean("trace_instant_updates", true);
        } catch (Throwable unused2) {
            z2 = true;
        }
        menuItemFindItem2.setChecked(z2);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_trace_auto_scroll);
        menuItemFindItem3.setTitle(JniAdExt.n1("ad.about.support.anydesk_trace.menu.auto_scroll"));
        try {
            z3 = sharedPreferences.getBoolean("trace_auto_scroll", true);
        } catch (Throwable unused3) {
        }
        menuItemFindItem3.setChecked(z3);
        menu.findItem(R.id.menu_trace_copy_to_clipboard).setTitle(JniAdExt.n1("ad.sys_info.copy_to_clipboard"));
        MenuItem menuItemFindItem4 = menu.findItem(R.id.menu_trace_send_file);
        this.k0 = menuItemFindItem4;
        menuItemFindItem4.setTitle(JniAdExt.n1("ad.menu.incoming.send_trace_file"));
        V0();
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void y(Menu menu) {
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        super.y0();
        AdEditText adEditText = this.h0;
        if (adEditText != null) {
            adEditText.i(false);
        }
    }
}
