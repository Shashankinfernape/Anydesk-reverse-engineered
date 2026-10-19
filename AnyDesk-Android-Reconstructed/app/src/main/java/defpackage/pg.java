package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.anydesk.anydeskandroid.R;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pg implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vg d;

    public /* synthetic */ pg(vg vgVar, int i) {
        this.c = i;
        this.d = vgVar;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x015e  */
    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.c;
        int i2 = 0;
        int i3 = 1;
        String strG0 = null;
        vg vgVar = this.d;
        switch (i) {
            case 0:
                zg zgVar = (zg) obj;
                if (zgVar != null) {
                    vgVar.W0(zgVar);
                    gh ghVar = vgVar.a0;
                    if (ghVar.p == null) {
                        ghVar.p = new vm0();
                    }
                    gh.j(ghVar.p, null);
                }
                break;
            case 1:
                mg mgVar = (mg) obj;
                if (mgVar != null) {
                    int i4 = mgVar.a;
                    CharSequence charSequenceT = mgVar.b;
                    switch (i4) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                        case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                            break;
                        case 6:
                        default:
                            i4 = 8;
                            break;
                    }
                    Context contextA0 = vgVar.a0();
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 < 29 && ((i4 == 7 || i4 == 9) && contextA0 != null && th1.A(contextA0) && y90.G(vgVar.a0.e()))) {
                        vgVar.T0();
                    } else if (vgVar.S0()) {
                        if (charSequenceT == null) {
                            charSequenceT = ec1.t(vgVar.a0(), i4);
                        }
                        gh ghVar2 = vgVar.a0;
                        if (i4 == 5) {
                            int i6 = ghVar2.j;
                            if (i6 == 0 || i6 == 3) {
                                vgVar.V0(i4, charSequenceT);
                            }
                            vgVar.P0();
                        } else {
                            if (ghVar2.u) {
                                vgVar.U0(i4, charSequenceT);
                            } else {
                                vgVar.X0(charSequenceT);
                                Handler handler = vgVar.Z;
                                ng ngVar = new ng(vgVar, i4, charSequenceT, i3);
                                Context contextA1 = vgVar.a0();
                                if (contextA1 != null) {
                                    String str = Build.MODEL;
                                    if (i5 == 28 && str != null) {
                                        String[] stringArray = contextA1.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        int length = stringArray.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                i2 = 2000;
                                            } else if (!str.startsWith(stringArray[i7])) {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        i2 = 2000;
                                    }
                                } else {
                                    i2 = 2000;
                                }
                                handler.postDelayed(ngVar, i2);
                            }
                            vgVar.a0.u = true;
                        }
                    } else {
                        if (charSequenceT == null) {
                            charSequenceT = vgVar.g0(R.string.default_error_msg) + " " + i4;
                        }
                        vgVar.U0(i4, charSequenceT);
                    }
                    vgVar.a0.f(null);
                }
                break;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (vgVar.S0()) {
                        vgVar.X0(charSequence);
                    }
                    vgVar.a0.f(null);
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    if (vgVar.S0()) {
                        vgVar.X0(vgVar.g0(R.string.fingerprint_not_recognized));
                    }
                    gh ghVar3 = vgVar.a0;
                    if (ghVar3.l) {
                        Executor seVar = ghVar3.b;
                        if (seVar == null) {
                            seVar = new se(2);
                        }
                        seVar.execute(new og(vgVar, i2));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    gh ghVar4 = vgVar.a0;
                    if (ghVar4.s == null) {
                        ghVar4.s = new vm0();
                    }
                    gh.j(ghVar4.s, Boolean.FALSE);
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    if (vgVar.R0()) {
                        vgVar.T0();
                    } else {
                        gh ghVar5 = vgVar.a0;
                        String str2 = ghVar5.i;
                        if (str2 != null) {
                            strG0 = str2;
                        } else if (ghVar5.d != null) {
                            strG0 = "";
                        }
                        if (strG0 == null) {
                            strG0 = vgVar.g0(R.string.default_error_msg);
                        }
                        vgVar.U0(13, strG0);
                        vgVar.O0(2);
                    }
                    vgVar.a0.i(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    vgVar.O0(1);
                    vgVar.P0();
                    gh ghVar6 = vgVar.a0;
                    if (ghVar6.v == null) {
                        ghVar6.v = new vm0();
                    }
                    gh.j(ghVar6.v, Boolean.FALSE);
                }
                break;
        }
    }
}
