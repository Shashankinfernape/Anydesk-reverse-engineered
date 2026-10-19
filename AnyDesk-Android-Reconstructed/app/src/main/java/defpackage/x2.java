package defpackage;

import android.content.Intent;
import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.HubActivity;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
        l3 l3Var;
        z80 z80Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k3 k3Var = (k3) obj;
                MainApplication mainApplicationV = MainApplication.v();
                mainApplicationV.getClass();
                t70.V(new c0(mainApplicationV, 13, (Object) null));
                if (!k3Var.I0 && (l3Var = k3Var.u0) != null && (z80Var = l3Var.b) != null && z80Var.l != null) {
                    JniAdExt.D4(z80Var.a, du0.pf_input, z);
                }
                break;
            case 1:
                Chip chip = (Chip) obj;
                dk0 dk0Var = chip.l;
                if (dk0Var != null) {
                    hl hlVar = (hl) ((af1) dk0Var).d;
                    if (!z ? hlVar.e(chip, hlVar.e) : hlVar.a(chip)) {
                        hlVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                zd zdVar = MainActivity.j0;
                JniAdExt.I0.post(new Runnable() { // from class: pa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        JniAdExt.jniEnableAnyDeskOne(z);
                    }
                });
                if (!z) {
                    HubActivity hubActivity = MainApplication.v().g0;
                    if (hubActivity != null) {
                        hubActivity.finish();
                    }
                } else {
                    mainActivity.finish();
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) HubActivity.class));
                }
                break;
        }
    }
}
