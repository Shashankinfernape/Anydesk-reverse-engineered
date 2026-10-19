package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class tp0 extends yt {
    public View A0;
    public View B0;
    public TextView F0;
    public w7 q0;
    public Button r0;
    public View s0;
    public TextView t0;
    public TextView u0;
    public TextView v0;
    public TextView w0;
    public TextView x0;
    public View y0;
    public TextView z0;
    public final rp0 C0 = new rp0();
    public final rp0 D0 = new rp0();
    public final rp0 E0 = new rp0();
    public final ArrayDeque G0 = new ArrayDeque();
    public final vy0 H0 = new vy0(new pp0(this, 0));
    public final vy0 I0 = new vy0(new pp0(this, 1));

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarY = Y();
        if (qaVarY == null) {
            return super.P0(bundle);
        }
        v7 v7Var = new v7(qaVarY);
        View viewInflate = qaVarY.getLayoutInflater().inflate(R.layout.fragment_dialog_network_info, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.network_info_conn);
        this.s0 = viewFindViewById;
        this.t0 = (TextView) viewFindViewById.findViewById(R.id.network_info_conn_relay);
        this.u0 = (TextView) this.s0.findViewById(R.id.network_info_conn_method);
        this.v0 = (TextView) this.s0.findViewById(R.id.network_info_conn_proxy);
        this.w0 = (TextView) this.s0.findViewById(R.id.network_info_conn_proxy_auth);
        this.x0 = (TextView) this.s0.findViewById(R.id.network_info_conn_encryption);
        ((TextView) this.s0.findViewById(R.id.network_info_conn_relay_label)).setText(JniAdExt.n1("ad.dlg.netinfo.cur_relay"));
        ((TextView) this.s0.findViewById(R.id.network_info_conn_method_label)).setText(JniAdExt.n1("ad.dlg.netinfo.cur_method"));
        ((TextView) this.s0.findViewById(R.id.network_info_conn_proxy_label)).setText(JniAdExt.n1("ad.dlg.netinfo.cur_proxy"));
        ((TextView) this.s0.findViewById(R.id.network_info_conn_proxy_auth_label)).setText(JniAdExt.n1("ad.dlg.netinfo.cur_proxy_auth"));
        ((TextView) this.s0.findViewById(R.id.network_info_conn_encryption_label)).setText(JniAdExt.n1("ad.dlg.netinfo.cur_cipher"));
        View viewFindViewById2 = viewInflate.findViewById(R.id.network_info_busy);
        this.y0 = viewFindViewById2;
        this.z0 = (TextView) viewFindViewById2.findViewById(R.id.network_info_busy_activity);
        this.A0 = this.y0.findViewById(R.id.network_info_busy_proxy_section);
        ((RecyclerView) this.y0.findViewById(R.id.network_info_busy_relays)).setAdapter(this.C0);
        ((RecyclerView) this.y0.findViewById(R.id.network_info_busy_methods)).setAdapter(this.D0);
        ((RecyclerView) this.y0.findViewById(R.id.network_info_busy_proxies)).setAdapter(this.E0);
        ((TextView) this.y0.findViewById(R.id.network_info_busy_relay_header)).setText(JniAdExt.n1("ad.dlg.netinfo.relay_section_header"));
        ((TextView) this.y0.findViewById(R.id.network_info_busy_method_header)).setText(JniAdExt.n1("ad.dlg.netinfo.method_section_header"));
        ((TextView) this.y0.findViewById(R.id.network_info_busy_proxy_header)).setText(JniAdExt.n1("ad.dlg.netinfo.proxy_section_header"));
        View viewFindViewById3 = this.y0.findViewById(R.id.network_info_busy_proxy_discovering);
        this.B0 = viewFindViewById3;
        ((TextView) viewFindViewById3.findViewById(R.id.network_info_busy_item_name)).setText(JniAdExt.n1("ad.dlg.netinfo.discovering_proxy"));
        this.F0 = (TextView) viewInflate.findViewById(R.id.network_info_err);
        r7 r7Var = (r7) v7Var.d;
        r7Var.q = viewInflate;
        r7Var.e = "-";
        v7Var.c(JniAdExt.n1("ad.dlg.netinfo.reconnect"), null);
        w7 w7VarA = v7Var.a();
        this.q0 = w7VarA;
        w7VarA.setCanceledOnTouchOutside(true);
        this.q0.setOnShowListener(new k(this, 1));
        return this.q0;
    }

    public final void S0(sx0 sx0Var) {
        String strN1;
        int i = sx0Var.a;
        String str = sx0Var.l;
        String str2 = sx0Var.j;
        String str3 = sx0Var.k;
        int iR = q51.r(i);
        if (iR == 3) {
            w7 w7Var = this.q0;
            if (w7Var != null) {
                w7Var.setTitle(JniAdExt.n1("ad.dlg.netinfo.fatal_header"));
            }
            r3.I(this.r0, 8);
            r3.I(this.s0, 8);
            r3.I(this.y0, 8);
            r3.I(this.F0, 0);
            r3.F(this.F0, sx0Var.i);
            return;
        }
        if (iR == 4) {
            w7 w7Var2 = this.q0;
            if (w7Var2 != null) {
                w7Var2.setTitle(JniAdExt.n1("ad.dlg.netinfo.connected_header"));
            }
            r3.I(this.r0, 0);
            r3.I(this.s0, 0);
            r3.I(this.y0, 8);
            r3.I(this.F0, 8);
            TextView textView = this.t0;
            String strN2 = sx0Var.n;
            String strN3 = sx0Var.m;
            r3.F(textView, str3);
            r3.F(this.u0, str2);
            r3.F(this.v0, str);
            TextView textView2 = this.w0;
            if (strN3.isEmpty()) {
                strN3 = JniAdExt.n1("ad.dlg.netinfo.no_proxy_auth");
            }
            r3.F(textView2, strN3);
            TextView textView3 = this.x0;
            if (strN2.isEmpty()) {
                strN2 = JniAdExt.n1("ad.dlg.netinfo.no_cipher");
            }
            r3.F(textView3, strN2);
            return;
        }
        w7 w7Var3 = this.q0;
        if (w7Var3 != null) {
            w7Var3.setTitle(JniAdExt.n1("ad.dlg.netinfo.connecting_header"));
        }
        r3.I(this.r0, 0);
        r3.I(this.s0, 8);
        r3.I(this.y0, 0);
        r3.I(this.F0, 8);
        TextView textView4 = this.z0;
        int i2 = sx0Var.c;
        boolean z = sx0Var.b;
        String[] strArr = sx0Var.e;
        String[] strArr2 = sx0Var.f;
        String[] strArr3 = sx0Var.g;
        String str4 = sx0Var.d;
        boolean z2 = true;
        switch (q51.r(i2)) {
            case 0:
                strN1 = String.format(JniAdExt.n1("ad.dlg.netinfo.step.waiting"), str4);
                break;
            case 1:
                strN1 = String.format(JniAdExt.n1("ad.dlg.netinfo.step.dns_resolve"), str4);
                break;
            case 2:
                strN1 = String.format(JniAdExt.n1("ad.dlg.netinfo.step.connect_to_server"), str4);
                break;
            case 3:
                strN1 = String.format(JniAdExt.n1("ad.dlg.netinfo.step.connect_to_proxy"), str4);
                break;
            case 4:
                strN1 = String.format(JniAdExt.n1("ad.dlg.netinfo.step.connect_through_proxy"), str4);
                break;
            case 5:
                strN1 = JniAdExt.n1("ad.dlg.netinfo.step.tls_handshake");
                break;
            case 6:
                strN1 = JniAdExt.n1("ad.dlg.netinfo.step.proto_handshake");
                break;
            case 7:
                strN1 = JniAdExt.n1("ad.dlg.netinfo.step.connected");
                break;
            default:
                strN1 = "";
                break;
        }
        r3.F(textView4, strN1);
        boolean z3 = sx0Var.a != 3;
        ArrayList arrayList = new ArrayList(strArr2.length);
        int length = strArr2.length;
        int i3 = 0;
        while (i3 < length) {
            String str5 = strArr2[i3];
            if (!z3 || !str5.equals(str3)) {
                z2 = false;
            }
            boolean z4 = z3;
            arrayList.add(new qp0(z2, str5, ""));
            i3++;
            z3 = z4;
            z2 = true;
        }
        boolean z5 = z3;
        rp0 rp0Var = this.C0;
        if (!arrayList.equals(rp0Var.d)) {
            rp0Var.d = arrayList;
            rp0Var.d();
        }
        ArrayList arrayList2 = new ArrayList(strArr.length);
        for (String str6 : strArr) {
            boolean z6 = z5 && str6.equals(str2);
            String str7 = (String) sx0Var.h.get(str6);
            if (str7 == null) {
                str7 = "-";
            }
            arrayList2.add(new qp0(z6, str6, str7));
        }
        rp0 rp0Var2 = this.D0;
        if (!arrayList2.equals(rp0Var2.d)) {
            rp0Var2.d = arrayList2;
            rp0Var2.d();
        }
        if (!z && strArr3.length <= 0) {
            r3.I(this.A0, 8);
            return;
        }
        r3.I(this.A0, 0);
        r3.I(this.B0, z ? 0 : 8);
        ArrayList arrayList3 = new ArrayList(strArr3.length);
        for (String str8 : strArr3) {
            arrayList3.add(new qp0(z5 && str8.equals(str), str8, ""));
        }
        rp0 rp0Var3 = this.E0;
        if (arrayList3.equals(rp0Var3.d)) {
            return;
        }
        rp0Var3.d = arrayList3;
        rp0Var3.d();
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.F0 = null;
    }
}
