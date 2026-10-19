package defpackage;

import android.os.Bundle;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class qo extends y90 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ConnectionFragment j;

    public /* synthetic */ qo(ConnectionFragment connectionFragment, int i) {
        this.i = i;
        this.j = connectionFragment;
    }

    private final void Z() {
        ConnectionFragment connectionFragment = this.j;
        lp lpVar = connectionFragment.d0;
        synchronized (lpVar) {
            lpVar.G.i(null);
        }
        boolean zH4 = JniAdExt.h4();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SYSINFO_SUPPORTED", zH4);
        uj.w(connectionFragment.Y(), R.id.sessionInfoFragment, bundle);
    }

    @Override // defpackage.mu0
    public final void c() {
        int i = 5;
        switch (this.i) {
            case 0:
                this.j.b1();
                ConnectionFragment connectionFragment = this.j;
                lp lpVar = connectionFragment.d0;
                if (lpVar != null) {
                    boolean z = !lpVar.p();
                    synchronized (lpVar) {
                        lpVar.t = z;
                    }
                    t70.Y(new fj(connectionFragment, 1, lpVar.p()));
                    connectionFragment.p1();
                    if (lpVar.p()) {
                        String string = connectionFragment.n1.getText().toString();
                        connectionFragment.n1.getText().clear();
                        connectionFragment.i1.append(string);
                        return;
                    } else {
                        String string2 = connectionFragment.i1.getText().toString();
                        connectionFragment.i1.getText().clear();
                        connectionFragment.n1.append(string2);
                        return;
                    }
                }
                return;
            case 1:
                ConnectionFragment connectionFragment2 = this.j;
                connectionFragment2.b1();
                lu0 lu0Var = connectionFragment2.H0;
                if (lu0Var != null) {
                    if (!lu0Var.f) {
                        connectionFragment2.C1.u(connectionFragment2.a0(), JniAdExt.s2(9) != 0 ? JniAdExt.n1("ad.dlg.remote_function_not_supported.msg") : JniAdExt.r2(2));
                        return;
                    }
                    lp lpVar2 = connectionFragment2.d0;
                    if (lpVar2 == null) {
                        return;
                    }
                    if (lpVar2.n() == 1) {
                        lpVar2.H(JniAdExt.J2());
                    }
                    boolean z2 = lpVar2.n() == 5;
                    MainApplication mainApplicationV = MainApplication.v();
                    int i2 = mainApplicationV.k;
                    String str = mainApplicationV.o;
                    if (!z2 || !JniAdExt.x3()) {
                        bc bcVar = connectionFragment2.p0;
                        bcVar.getClass();
                        wx0 wx0Var = new wx0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("skey_session_idx", i2);
                        bundle.putString("skey_remote_addr", str);
                        bundle.putBoolean("skey_is_safemode_possible", !z2);
                        wx0Var.N0(bundle);
                        bcVar.p0(wx0Var, "RemoteRestart_" + i2, false);
                        return;
                    }
                    bc bcVar2 = connectionFragment2.p0;
                    bcVar2.getClass();
                    yx0 yx0Var = new yx0();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("skey_session_idx", i2);
                    bundle2.putString("skey_remote_addr", str);
                    t01 t01Var = t01.e;
                    bundle2.putSerializable("skey_username", t01Var);
                    bundle2.putSerializable("skey_password", t01Var);
                    yx0Var.N0(bundle2);
                    bcVar2.p0(yx0Var, "RemoteRestart_" + i2, false);
                    return;
                }
                return;
            case 2:
                ConnectionFragment connectionFragment3 = this.j;
                if (!connectionFragment3.R0.f) {
                    connectionFragment3.C1.u(connectionFragment3.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                    return;
                }
                qa qaVarY = connectionFragment3.Y();
                long j = MainApplication.v().m;
                String str2 = MainApplication.v().n;
                MainApplication mainApplicationV2 = MainApplication.v();
                TcpTunnelFragment.T0(qaVarY, false, j, str2, t70.y(mainApplicationV2.n, mainApplicationV2.m, mainApplicationV2.j));
                return;
            case 3:
                ConnectionFragment connectionFragment4 = this.j;
                connectionFragment4.b1();
                lu0 lu0Var2 = connectionFragment4.I0;
                if (lu0Var2 != null) {
                    if (lu0Var2.f) {
                        JniAdExt.I0.post(new tb0(21));
                        return;
                    } else {
                        connectionFragment4.C1.u(connectionFragment4.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                        return;
                    }
                }
                return;
            case 4:
                ConnectionFragment connectionFragment5 = this.j;
                connectionFragment5.b1();
                lu0 lu0Var3 = connectionFragment5.J0;
                if (lu0Var3 != null) {
                    if (lu0Var3.f) {
                        JniAdExt.I0.post(new fb0(12, !lu0Var3.g));
                        return;
                    } else {
                        connectionFragment5.C1.u(connectionFragment5.a0(), JniAdExt.s2(8) != 0 ? JniAdExt.n1("ad.dlg.remote_function_not_supported.msg") : JniAdExt.r2(1));
                        return;
                    }
                }
                return;
            case 5:
                ConnectionFragment connectionFragment6 = this.j;
                connectionFragment6.b1();
                lu0 lu0Var4 = connectionFragment6.K0;
                if (lu0Var4 != null) {
                    if (!lu0Var4.f) {
                        connectionFragment6.C1.u(connectionFragment6.a0(), JniAdExt.s2(15) != 0 ? JniAdExt.n1("ad.dlg.remote_function_not_supported.msg") : JniAdExt.r2(9));
                        return;
                    }
                    if (lu0Var4.g) {
                        JniAdExt.I0.post(new tb0(25));
                        return;
                    } else {
                        if (er0.f() || r3.o(connectionFragment6, connectionFragment6.I1, connectionFragment6.b0)) {
                            JniAdExt.I0.post(new tb0(24));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                ConnectionFragment connectionFragment7 = this.j;
                connectionFragment7.b1();
                lu0 lu0Var5 = connectionFragment7.L0;
                if (lu0Var5 != null) {
                    if (!lu0Var5.f) {
                        connectionFragment7.C1.u(connectionFragment7.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                        return;
                    }
                    m80 m80Var = connectionFragment7.a0;
                    if (m80Var != null) {
                        int i3 = JniAdExt.L0.a;
                        if (i3 == 2 || i3 == 1) {
                            JniAdExt.I0.post(new tb0(23));
                            if (MainApplication.v().o0 == 1) {
                                MainApplication.v().X();
                                return;
                            }
                            return;
                        }
                        MainActivity mainActivity = (MainActivity) m80Var;
                        if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
                            mainActivity.r0("start");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Z();
                return;
            case 8:
                ConnectionFragment connectionFragment8 = this.j;
                connectionFragment8.b1();
                lu0 lu0Var6 = connectionFragment8.M0;
                if (lu0Var6 != null) {
                    if (!lu0Var6.f) {
                        connectionFragment8.C1.u(connectionFragment8.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                        return;
                    }
                    boolean zY3 = JniAdExt.y3();
                    boolean zZ3 = JniAdExt.z3();
                    if (!zZ3) {
                        if (zY3) {
                            JniAdExt.I0.post(new tb0(26));
                            return;
                        }
                        return;
                    }
                    bc bcVar3 = connectionFragment8.p0;
                    bcVar3.getClass();
                    kw kwVar = new kw();
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("skey_elevate_show_direct", zY3);
                    bundle3.putBoolean("skey_elevate_show_with_credentials", zZ3);
                    kwVar.N0(bundle3);
                    bcVar3.s0(kwVar);
                    t70.Y(new uo(connectionFragment8, i));
                    return;
                }
                return;
            case 9:
                ConnectionFragment connectionFragment9 = this.j;
                connectionFragment9.b1();
                if (er0.f() || r3.o(connectionFragment9, connectionFragment9.F1, connectionFragment9.b0)) {
                    MainApplication.q(connectionFragment9.a0());
                    JniAdExt.I0.post(new tb0(27));
                    return;
                }
                return;
            case 10:
                ConnectionFragment connectionFragment10 = this.j;
                connectionFragment10.b1();
                lu0 lu0Var7 = connectionFragment10.O0;
                if (lu0Var7 != null) {
                    if (!lu0Var7.f) {
                        connectionFragment10.C1.u(connectionFragment10.a0(), JniAdExt.n1("ad.accept.file_transfer.text"));
                        return;
                    } else {
                        if (er0.f() || r3.o(connectionFragment10, connectionFragment10.G1, connectionFragment10.b0)) {
                            MainApplication.q(connectionFragment10.a0());
                            JniAdExt.I0.post(new tb0(28));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 11:
                ConnectionFragment connectionFragment11 = this.j;
                connectionFragment11.b1();
                lu0 lu0Var8 = connectionFragment11.P0;
                if (lu0Var8 != null) {
                    if (!lu0Var8.f) {
                        connectionFragment11.C1.u(connectionFragment11.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                        return;
                    } else {
                        if (er0.f() || r3.o(connectionFragment11, connectionFragment11.H1, connectionFragment11.b0)) {
                            ConnectionFragment.T0(connectionFragment11);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 12:
                uj.v(this.j.Y(), R.id.connectionSettingsFragment);
                return;
            case 13:
                ConnectionFragment connectionFragment12 = this.j;
                connectionFragment12.b1();
                ConnectionFragment.U0(connectionFragment12, ke0.d);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                ConnectionFragment connectionFragment13 = this.j;
                connectionFragment13.b1();
                ConnectionFragment.U0(connectionFragment13, ke0.e);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                ConnectionFragment connectionFragment14 = this.j;
                connectionFragment14.b1();
                ConnectionFragment.U0(connectionFragment14, ke0.f);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                this.j.b1();
                w81.b.a(new cp(2));
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                this.j.b1();
                w81.b.a(new cp(3));
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                ConnectionFragment connectionFragment15 = this.j;
                connectionFragment15.b1();
                lu0 lu0Var9 = connectionFragment15.d1;
                if (lu0Var9 != null) {
                    if (lu0Var9.f) {
                        w81.b.a(new cp(1));
                        return;
                    } else {
                        connectionFragment15.C1.u(connectionFragment15.a0(), JniAdExt.n1("ad.dlg.remote_function_not_supported.msg"));
                        return;
                    }
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                ConnectionFragment connectionFragment16 = this.j;
                connectionFragment16.a1();
                connectionFragment16.b1();
                JniAdExt.hideDialog();
                JniAdExt.V1();
                connectionFragment16.V0();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                this.j.e1();
                return;
            default:
                ConnectionFragment connectionFragment17 = this.j;
                lu0 lu0Var10 = connectionFragment17.U0;
                if (lu0Var10 != null) {
                    if (!lu0Var10.f) {
                        connectionFragment17.C1.u(connectionFragment17.a0(), JniAdExt.r2(6));
                        return;
                    }
                    bc bcVar4 = connectionFragment17.p0;
                    if (bcVar4 != null) {
                        bcVar4.o0(0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
