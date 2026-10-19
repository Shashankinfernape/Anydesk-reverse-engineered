package defpackage;

import android.view.View;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt b;

    public /* synthetic */ q4(yt ytVar, int i) {
        this.a = i;
        this.b = ytVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        yt ytVar = this.b;
        switch (i9) {
            case 0:
                r4 r4Var = (r4) ytVar;
                r4Var.T0(r4Var.t0);
                break;
            case 1:
                s4 s4Var = (s4) ytVar;
                s4Var.S0(s4Var.r0);
                break;
            case 2:
                c5 c5Var = (c5) ytVar;
                c5Var.T0(c5Var.w0);
                break;
            case 3:
                d5 d5Var = (d5) ytVar;
                d5Var.S0(d5Var.r0);
                break;
            case 4:
                kw kwVar = (kw) ytVar;
                kwVar.T0(kwVar.w0);
                break;
            case 5:
                az azVar = (az) ytVar;
                azVar.S0(azVar.w0);
                break;
            case 6:
                cz czVar = (cz) ytVar;
                czVar.S0(czVar.y0);
                break;
            case 7:
                iz izVar = (iz) ytVar;
                izVar.V0(izVar.C0);
                break;
            case 8:
                lz lzVar = (lz) ytVar;
                lzVar.S0(lzVar.B0);
                break;
            case 9:
                i00 i00Var = (i00) ytVar;
                i00Var.S0(i00Var.w0);
                break;
            case 10:
                bv0 bv0Var = (bv0) ytVar;
                bv0Var.S0(bv0Var.r0);
                break;
            case 11:
                wx0 wx0Var = (wx0) ytVar;
                wx0Var.S0(wx0Var.u0);
                break;
            case 12:
                yx0 yx0Var = (yx0) ytVar;
                yx0Var.S0(yx0Var.q0);
                break;
            case 13:
                h21 h21Var = (h21) ytVar;
                h21Var.T0(h21Var.s0);
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                z31 z31Var = (z31) ytVar;
                z31Var.S0(z31Var.w0);
                break;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                i91 i91Var = (i91) ytVar;
                i91Var.T0(i91Var.q0);
                break;
            default:
                qc1 qc1Var = (qc1) ytVar;
                qc1Var.S0(qc1Var.r0);
                break;
        }
    }
}
