package defpackage;

import android.view.View;
import android.widget.ToggleButton;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ je0 e;

    public /* synthetic */ fe0(je0 je0Var, int i, int i2) {
        this.c = i2;
        this.e = je0Var;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        je0 je0Var = this.e;
        int i2 = this.d;
        switch (i) {
            case 0:
                ro roVar = je0Var.c;
                if (roVar != null) {
                    roVar.b(i2, je0Var.d);
                    roVar.d(i2, je0Var.d);
                }
                break;
            default:
                ro roVar2 = je0Var.c;
                if (roVar2 != null) {
                    roVar2.b(i2, je0Var.d);
                }
                qa qaVar = je0Var.b;
                de0 de0Var = de0.d;
                if (qaVar != null) {
                    ToggleButton toggleButton = (ToggleButton) qaVar.findViewById(R.id.kbs_extended_button_caps_lock);
                    ToggleButton toggleButton2 = (ToggleButton) qaVar.findViewById(R.id.kbs_extended_button_num_lock);
                    ToggleButton toggleButton3 = (ToggleButton) qaVar.findViewById(R.id.kbs_extended_button_roll);
                    if (toggleButton != null && toggleButton.isChecked()) {
                        de0Var = new de0(1);
                    }
                    if (toggleButton2 != null && toggleButton2.isChecked()) {
                        de0Var = new de0(de0Var.c | 2);
                    }
                    if (toggleButton3 != null && toggleButton3.isChecked()) {
                        de0Var = new de0(de0Var.c | 4);
                    }
                }
                je0Var.d = de0Var;
                if (roVar2 != null) {
                    roVar2.d(i2, de0Var);
                }
                break;
        }
    }
}
