package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAudio;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentConnection;
import com.anydesk.anydeskandroid.gui.fragment.SupportFragment;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xt0 implements w6, r6, pk0, gv0, sl0, j6 {
    public final /* synthetic */ int c;
    public Object d;

    public xt0(View view) {
        this.c = 16;
        if (Build.VERSION.SDK_INT < 30) {
            this.d = new xt0(15, view);
            return;
        }
        p51 p51Var = new p51(15, view);
        p51Var.e = view;
        this.d = p51Var;
    }

    @Override // defpackage.sl0
    public void a() {
        SettingsFragmentAudio settingsFragmentAudio = (SettingsFragmentAudio) this.d;
        r3.B(settingsFragmentAudio.h0, false);
        r3.B(settingsFragmentAudio.i0, false);
        r3.B(settingsFragmentAudio.g0, true);
        SettingsFragmentAudio.O0(1);
        bc bcVar = settingsFragmentAudio.m0;
        if (bcVar != null) {
            bcVar.t0(12, JniAdExt.n1("ad.setup.microphone.title"));
        }
    }

    public void b() {
        View view = (View) this.d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        switch (this.c) {
            case 12:
                Map map = (Map) obj;
                if (map != null) {
                    Collection collectionValues = map.values();
                    CheckBox checkBox = ((SettingsFragmentConnection) this.d).f0;
                    if (checkBox != null && r3.b(collectionValues)) {
                        checkBox.setChecked(true);
                        JniAdExt.x4(io.KEY_ALLOW_DIRECT, true);
                        break;
                    }
                }
                break;
            default:
                ((SupportFragment) this.d).T0();
                JniAdExt.M4();
                break;
        }
    }

    public void d(t81 t81Var) {
        t81Var.b(false);
        ((a5) this.d).a();
    }

    @Override // defpackage.gv0
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.pk0
    public boolean f(rk0 rk0Var, MenuItem menuItem) {
        wu0 wu0Var = (wu0) ((gi) this.d).d;
        if (wu0Var != null) {
            return wu0Var.onMenuItemClick(menuItem);
        }
        return false;
    }

    public void g(t81 t81Var) {
        t81Var.b(true);
        a5 a5Var = (a5) this.d;
        a5.f++;
        a5Var.i();
    }

    @Override // defpackage.r6
    public void h(String str) {
        switch (this.c) {
            case 1:
                ju0 ju0Var = (ju0) this.d;
                TextView textView = ju0Var.u0;
                Button button = ju0Var.v0;
                String strE3 = JniAdExt.E3(str);
                if (textView != null) {
                    textView.setText(strE3);
                }
                if (button != null) {
                    button.setEnabled(strE3.isEmpty());
                }
                break;
            case 6:
            case 8:
                break;
            case 10:
                JniAdExt.g4();
                break;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                i91 i91Var = (i91) this.d;
                if (i91Var.C0 && i91Var.F0 == 0) {
                    i91Var.D0.set(0, str);
                    ArrayAdapter arrayAdapter = i91Var.E0;
                    if (arrayAdapter != null) {
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                TraceFragment traceFragment = (TraceFragment) this.d;
                traceFragment.U0(str);
                gb1 gb1Var = traceFragment.e0;
                if (gb1Var != null) {
                    gb1Var.e = str;
                    gb1Var.d();
                }
                break;
        }
    }

    @Override // defpackage.gv0
    public void i(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.d).setResultCode(i);
    }

    @Override // defpackage.r6
    public boolean k() {
        int i = 1;
        switch (this.c) {
            case 1:
                ju0 ju0Var = (ju0) this.d;
                Dialog dialog = ju0Var.k0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                ju0.S0(ju0Var);
                return true;
            case 6:
                dz0 dz0Var = (dz0) this.d;
                Dialog dialog2 = dz0Var.k0;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                dz0.S0(dz0Var);
                return true;
            case 8:
                t21 t21Var = (t21) this.d;
                Dialog dialog3 = t21Var.k0;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                t21Var.U0();
                return true;
            case 10:
                y21 y21Var = (y21) this.d;
                if (!y21Var.y0) {
                    return false;
                }
                JniAdExt.n4(y21Var.v0);
                SettingsFragmentAccess settingsFragmentAccess = y21Var.q0;
                if (settingsFragmentAccess != null) {
                    t70.Y(new b31(settingsFragmentAccess, i));
                }
                Dialog dialog4 = y21Var.k0;
                if (dialog4 == null) {
                    return true;
                }
                dialog4.dismiss();
                return true;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                i91 i91Var = (i91) this.d;
                Dialog dialog5 = i91Var.k0;
                if (dialog5 != null) {
                    dialog5.dismiss();
                }
                i91.S0(i91Var);
                return true;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                m80 m80Var = ((TraceFragment) this.d).c0;
                if (m80Var != null) {
                    ((MainActivity) m80Var).p0();
                }
                return true;
            default:
                cc1 cc1Var = (cc1) this.d;
                Dialog dialog6 = cc1Var.k0;
                if (dialog6 != null) {
                    dialog6.dismiss();
                }
                AdEditText adEditText = cc1Var.q0;
                if (adEditText != null) {
                    JniAdExt.I0.post(new ua0(adEditText.getText(), 10));
                }
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w6
    public boolean r() {
        CheckBox checkBox;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.c) {
            case 0:
                yt0 yt0Var = (yt0) this.d;
                Dialog dialog = yt0Var.k0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                AdEditTextSecure adEditTextSecure = yt0Var.u0;
                if (adEditTextSecure != null && (checkBox = yt0Var.v0) != null) {
                    JniAdExt.I0.post(new ap(adEditTextSecure.getText(), 2, checkBox.isChecked()));
                }
                return true;
            case 5:
                yx0 yx0Var = (yx0) this.d;
                Dialog dialog2 = yx0Var.k0;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                AdEditTextSecure adEditTextSecure2 = yx0Var.u0;
                t01 text = adEditTextSecure2 == null ? t01.e : adEditTextSecure2.getText();
                AdEditTextSecure adEditTextSecure3 = yx0Var.v0;
                JniAdExt.I0.post(new rc0(text, adEditTextSecure3 == null ? t01.e : adEditTextSecure3.getText(), objArr == true ? 1 : 0));
                return true;
            case 7:
                h21 h21Var = (h21) this.d;
                Button button = h21Var.z0;
                if (button == null || !button.isEnabled()) {
                    return false;
                }
                Dialog dialog3 = h21Var.k0;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                g21 g21Var = h21Var.q0;
                if (g21Var != null) {
                    AdEditTextSecure adEditTextSecure4 = h21Var.u0;
                    t01 text2 = adEditTextSecure4 == null ? t01.e : adEditTextSecure4.getText();
                    r21 r21Var = (r21) g21Var;
                    if (text2 != null) {
                        JniAdExt.I0.post(new d3(text2, r21Var.r0, 17, z));
                    }
                    r21Var.T0();
                    t70.Y(new n21(r21Var, objArr2 == true ? 1 : 0));
                }
                return true;
            default:
                w21 w21Var = (w21) this.d;
                Dialog dialog4 = w21Var.k0;
                if (dialog4 != null) {
                    dialog4.dismiss();
                }
                w21Var.U0();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(ft0 ft0Var, sq sqVar) {
        n51 n51Var;
        xt0 xt0Var;
        if (sqVar instanceof n51) {
            n51Var = (n51) sqVar;
            int i = n51Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n51Var.i = i - Integer.MIN_VALUE;
            } else {
                n51Var = new n51(this, sqVar);
            }
        } else {
            n51Var = new n51(this, sqVar);
        }
        Object obj = n51Var.g;
        int i2 = n51Var.i;
        rq rqVar = null;
        if (i2 == 0) {
            y90.V(obj);
            try {
                af afVar = new af(this, ft0Var, rqVar, 8);
                n51Var.f = this;
                n51Var.i = 1;
                Object objL = hq.l(afVar, n51Var);
                lr lrVar = lr.c;
                if (objL == lrVar) {
                    return lrVar;
                }
            } catch (k51 e) {
                e = e;
                xt0Var = this;
                if (e.c != xt0Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xt0Var = n51Var.f;
            try {
                y90.V(obj);
            } catch (k51 e2) {
                e = e2;
                if (e.c != xt0Var) {
                    throw e;
                }
            }
        }
        return uc1.a;
    }

    @Override // defpackage.w6
    public void t(t01 t01Var) {
        switch (this.c) {
            case 0:
            case 5:
                break;
            case 7:
                h21.S0((h21) this.d);
                break;
        }
    }

    public void u(Context context, String str) {
        t70.Y(new wh(this, context, str, 6));
    }

    public xt0(c40 c40Var) {
        this.c = 23;
        c40Var.Q.a(new sw(this));
    }

    public xt0(qa qaVar) {
        this.c = 23;
        qaVar.c.a(new sw(this));
    }

    public xt0(int i) {
        this.c = i;
        switch (i) {
            case 22:
                break;
            default:
                this.d = new y6(this);
                break;
        }
    }

    public /* synthetic */ xt0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public xt0(SideSheetBehavior sideSheetBehavior) {
        this.c = 13;
        this.d = sideSheetBehavior;
        new l(18, this);
    }

    private final void j(t01 t01Var) {
    }

    private final void l(t01 t01Var) {
    }

    private final void m(String str) {
    }

    private final void n(String str) {
    }

    private final void p(t01 t01Var) {
    }

    private final void q(String str) {
    }

    @Override // defpackage.pk0
    public void o(rk0 rk0Var) {
    }
}
