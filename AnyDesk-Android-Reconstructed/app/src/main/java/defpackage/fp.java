package defpackage;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class fp implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RadioButton b;
    public final /* synthetic */ RadioButton c;

    public /* synthetic */ fp(RadioButton radioButton, RadioButton radioButton2, int i) {
        this.a = i;
        this.b = radioButton;
        this.c = radioButton2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        RadioButton radioButton = this.c;
        RadioButton radioButton2 = this.b;
        switch (i) {
            case 0:
                if (z) {
                    JniAdExt.K4(9, 1);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            case 1:
                if (z) {
                    JniAdExt.K4(9, 2);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            case 2:
                if (z) {
                    JniAdExt.K4(9, 0);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            case 3:
                if (z) {
                    JniAdExt.K4(6, 0);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            case 4:
                if (z) {
                    JniAdExt.K4(6, 1);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            case 5:
                if (z) {
                    JniAdExt.K4(6, 2);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(false);
                }
                break;
            default:
                JniAdExt.J4(15, z);
                if (z && radioButton2.isChecked()) {
                    radioButton.setChecked(true);
                    break;
                }
                break;
        }
    }
}
