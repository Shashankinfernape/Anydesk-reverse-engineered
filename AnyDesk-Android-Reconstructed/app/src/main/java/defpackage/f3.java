package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f3(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        uv uvVar;
        int i2 = this.c;
        int i3 = 0;
        Object obj = this.d;
        switch (i2) {
            case 0:
                k3 k3Var = (k3) obj;
                if (!k3Var.J0) {
                    k3Var.J0 = true;
                    break;
                } else {
                    gu0 gu0Var = k3Var.D0;
                    if (gu0Var != null && i != gu0Var.c) {
                        gu0Var.c = i;
                        gu0Var.notifyDataSetChanged();
                    }
                    PermissionProfile permissionProfile = (PermissionProfile) k3Var.C0.get(i);
                    MainApplication mainApplicationV = MainApplication.v();
                    Boolean boolValueOf = Boolean.valueOf(permissionProfile.m.contains(du0.pf_input));
                    mainApplicationV.getClass();
                    t70.V(new c0(mainApplicationV, 13, boolValueOf));
                    if (!k3Var.I0) {
                        JniAdExt.I0.post(new cb0(k3Var.s0, permissionProfile.a, i3));
                        break;
                    }
                }
                break;
            case 1:
                ConnectionFragment connectionFragment = (ConnectionFragment) obj;
                lp lpVar = connectionFragment.d0;
                if (lpVar != null) {
                    lpVar.D(i);
                    JniAdExt.I0.post(new ic0(lpVar.j()));
                    connectionFragment.m1(!lpVar.q());
                    break;
                }
                break;
            case 2:
                s00 s00Var = (s00) obj;
                s00Var.t0 = q51.s(3)[i];
                Spinner spinner = s00Var.v0;
                if (spinner != null) {
                    spinner.setSelection(Math.max(0, Math.min(q51.s(3).length - 1, i)), false);
                    break;
                }
                break;
            case 3:
                if (i != -1 && (uvVar = ((kg0) obj).e) != null) {
                    uvVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                i91 i91Var = (i91) obj;
                if (i91Var.C0) {
                    i91Var.F0 = i;
                    AdEditText adEditText = i91Var.s0;
                    if (adEditText != null) {
                        adEditText.l((String) i91Var.D0.get(i), false);
                        adEditText.setEnabled(i == 0);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.c;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }

    private final void e(AdapterView adapterView) {
    }
}
