package com.anydesk.anydeskandroid.gui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.a91;
import defpackage.b91;
import defpackage.c91;
import defpackage.cd0;
import defpackage.d91;
import defpackage.e91;
import defpackage.t70;
import defpackage.uj;
import defpackage.xt0;
import defpackage.y6;
import defpackage.z6;
import defpackage.z81;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TcpTunnelFragment extends z6 implements cd0 {
    public TableLayout b0;
    public TableLayout c0;
    public TextView d0;
    public TextView e0;
    public final xt0 f0 = new xt0(this);

    public static void T0(Activity activity, boolean z, long j, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("RESOLVE", z);
        bundle.putLong("REMOTE_CID", j);
        bundle.putString("ALIAS", str);
        bundle.putString("DISPLAY_ADDRESS", str2);
        uj.w(activity, R.id.tcpTunnelFragment, bundle);
    }

    public static void V0(TableLayout tableLayout, ArrayList arrayList) {
        int childCount = tableLayout.getChildCount();
        for (int i = 1; i != childCount; i++) {
            e91 e91Var = (e91) tableLayout.getChildAt(i);
            if (arrayList.contains(Integer.valueOf(i - 1))) {
                EditText editText = e91Var.d;
                EditText editText2 = e91Var.e;
                boolean zIsEmpty = editText.getText().toString().isEmpty();
                boolean zIsEmpty2 = editText2.getText().toString().isEmpty();
                if (zIsEmpty && zIsEmpty2) {
                    Context context = e91Var.getContext();
                    Looper looper = t70.a;
                    ColorStateList colorStateListM = uj.m(context, R.color.colorDialogText);
                    e91Var.d.setBackgroundTintList(colorStateListM);
                    editText2.setBackgroundTintList(colorStateListM);
                } else {
                    Context context2 = e91Var.getContext();
                    Looper looper2 = t70.a;
                    ColorStateList colorStateListM2 = uj.m(context2, R.color.colorTextInputStateRed);
                    if (!zIsEmpty2) {
                        editText.setBackgroundTintList(colorStateListM2);
                    }
                    if (!zIsEmpty) {
                        editText2.setBackgroundTintList(colorStateListM2);
                    }
                }
            } else {
                Context context3 = e91Var.getContext();
                Looper looper3 = t70.a;
                ColorStateList colorStateListM3 = uj.m(context3, R.color.colorDialogText);
                e91Var.d.setBackgroundTintList(colorStateListM3);
                e91Var.e.setBackgroundTintList(colorStateListM3);
            }
        }
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        JniAdExt.s1(this);
        this.b0 = (TableLayout) view.findViewById(R.id.tcp_tunnel_forward_table);
        this.c0 = (TableLayout) view.findViewById(R.id.tcp_tunnel_reverse_table);
        this.d0 = (TextView) view.findViewById(R.id.tcp_tunnel_empty_ports_error);
        this.e0 = (TextView) view.findViewById(R.id.tcp_tunnel_duplicate_ports_error);
        this.d0.setText(JniAdExt.n1("ad.tcp_tunnel.empty_ports"));
        this.e0.setText(JniAdExt.n1("ad.tcp_tunnel.duplicates"));
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        a91[] a91VarArrY2;
        a91[] a91VarArrY3;
        boolean z;
        this.F = true;
        View viewK0 = K0();
        TextView textView = (TextView) viewK0.findViewById(R.id.tcp_tunnel_forward_title);
        TextView textView2 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_forward_local_port_title);
        TextView textView3 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_forward_remote_host_title);
        TextView textView4 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_forward_remote_port_title);
        Button button = (Button) viewK0.findViewById(R.id.tcp_tunnel_forward_add_button);
        TextView textView5 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_reverse_title);
        TextView textView6 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_reverse_local_host_title);
        TextView textView7 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_reverse_local_port_title);
        TextView textView8 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_reverse_remote_port_title);
        TextView textView9 = (TextView) viewK0.findViewById(R.id.tcp_tunnel_reverse_add_button);
        Button button2 = (Button) viewK0.findViewById(R.id.tcp_tunnel_save_button);
        Button button3 = (Button) viewK0.findViewById(R.id.tcp_tunnel_cancel_button);
        String strN1 = JniAdExt.n1("ad.tcp_tunnel.local_port");
        String strN2 = JniAdExt.n1("ad.tcp_tunnel.remote_port");
        Bundle bundleH0 = H0();
        boolean z2 = bundleH0.getBoolean("RESOLVE");
        G0().setTitle(z2 ? JniAdExt.n1("ad.tcp_tunnel.resolve") : JniAdExt.n1("ad.tcp_tunnel.setup"));
        long j = bundleH0.getLong("REMOTE_CID");
        String string = bundleH0.getString("ALIAS");
        String string2 = bundleH0.getString("DISPLAY_ADDRESS");
        int i = 0;
        textView.setText(String.format(JniAdExt.n1("ad.tcp_tunnel.rules_for_fwd"), string2));
        textView2.setText(strN1);
        textView3.setText(JniAdExt.n1("ad.tcp_tunnel.remote_host"));
        textView4.setText(strN2);
        button.setText(JniAdExt.n1("ad.tcp_tunnel.add_fwd"));
        textView5.setText(String.format(JniAdExt.n1("ad.tcp_tunnel.rules_for_bwd"), string2));
        textView6.setText(JniAdExt.n1("ad.tcp_tunnel.local_host"));
        textView7.setText(strN1);
        textView8.setText(strN2);
        textView9.setText(JniAdExt.n1("ad.tcp_tunnel.add_bwd"));
        button2.setText(JniAdExt.n1("ad.tcp_tunnel.save"));
        button3.setText(z2 ? JniAdExt.n1("ad.tcp_tunnel.proceed") : JniAdExt.n1("ad.tcp_tunnel.cancel"));
        TcpTunnelFragment tcpTunnelFragment = this;
        button.setOnClickListener(new b91(tcpTunnelFragment, i));
        textView9.setOnClickListener(new b91(tcpTunnelFragment, 1));
        button2.setOnClickListener(new b91(tcpTunnelFragment, 2));
        button3.setOnClickListener(new b91(tcpTunnelFragment, 3));
        JniAdExt.H3(string, j);
        if (bundle != null) {
            a91VarArrY2 = (a91[]) t70.A(bundle, "FORWARD", a91[].class);
            a91VarArrY3 = (a91[]) t70.A(bundle, "REVERSE", a91[].class);
            z = true;
        } else {
            a91VarArrY2 = JniAdExt.Y2(false);
            a91VarArrY3 = JniAdExt.Y2(true);
            z = false;
        }
        a91[] a91VarArr = a91VarArrY2;
        int length = a91VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            a91 a91Var = a91VarArr[i2];
            tcpTunnelFragment.R0(false, z, a91Var.c, a91Var.d, a91Var.e);
            i2++;
            tcpTunnelFragment = this;
        }
        for (a91 a91Var2 : a91VarArrY3) {
            R0(true, z, a91Var2.c, a91Var2.e, a91Var2.d);
        }
        if (a91VarArr.length == 0) {
            S0(false);
        }
        if (a91VarArrY3.length == 0) {
            S0(true);
        }
        if (z) {
            return;
        }
        U0(JniAdExt.a2());
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.z6
    public final boolean Q0() {
        return !(JniAdExt.s2(19) != 0);
    }

    public final void R0(boolean z, boolean z2, String str, String str2, String str3) {
        TableLayout tableLayout = z ? this.c0 : this.b0;
        boolean z3 = JniAdExt.s2(16) != 0;
        int childCount = tableLayout.getChildCount() - 1;
        int i = z ? 18 : 17;
        if (!z3 && childCount >= JniAdExt.s2(i)) {
            this.f0.u(a0(), JniAdExt.n1("ad.tcp_tunnel.reached_limit.needs_review_by_legal.android"));
            return;
        }
        e91 e91Var = new e91(I0(), z ? R.layout.tcp_tunnel_reverse_entry : R.layout.tcp_tunnel_forward_entry);
        EditText editText = e91Var.c;
        editText.setText(str);
        EditText editText2 = e91Var.d;
        editText2.setText(str2);
        EditText editText3 = e91Var.e;
        editText3.setText(str3);
        ((ImageButton) e91Var.findViewById(R.id.tcp_tunnel_remove_button)).setOnClickListener(new c91(this, z, tableLayout, e91Var));
        tableLayout.addView(e91Var);
        d91 d91Var = new d91(this, z, tableLayout, e91Var);
        editText.addTextChangedListener(d91Var);
        editText2.addTextChangedListener(d91Var);
        editText3.addTextChangedListener(d91Var);
        if (z2) {
            U0(JniAdExt.O3(z, tableLayout.indexOfChild(e91Var) - 1, str, str2, str3));
        }
    }

    public final void S0(boolean z) {
        R0(z, true, "localhost", "", "");
    }

    public final void U0(y6 y6Var) {
        TextView textView = this.d0;
        z81 z81Var = (z81) y6Var.d;
        textView.setVisibility((z81Var.c & 1) == 1 ? 0 : 8);
        this.e0.setVisibility((z81Var.c & 2) == 2 ? 0 : 8);
        V0(this.b0, (ArrayList) y6Var.e);
        V0(this.c0, (ArrayList) y6Var.f);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_tcp_tunnel, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.j4();
        JniAdExt.U3(this);
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a91[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a91[], java.io.Serializable] */
    @Override // defpackage.c40
    public final void z0(Bundle bundle) {
        ?? Y2 = JniAdExt.Y2(false);
        ?? Y3 = JniAdExt.Y2(true);
        bundle.putSerializable("FORWARD", Y2);
        bundle.putSerializable("REVERSE", Y3);
    }
}
