package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gp implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public gp(iz izVar, LinearLayout linearLayout, String str) {
        this.a = 3;
        this.d = izVar;
        this.b = linearLayout;
        this.c = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        View view = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (z) {
                    JniAdExt.K4(8, 0);
                    ((RadioButton) view).setChecked(false);
                    ((RadioButton) obj2).setChecked(false);
                    ((CheckBox) obj).setChecked(false);
                }
                break;
            case 1:
                if (z) {
                    JniAdExt.K4(8, 1);
                    ((RadioButton) view).setChecked(false);
                    ((RadioButton) obj2).setChecked(false);
                    ((CheckBox) obj).setChecked(JniAdExt.S2(15));
                }
                break;
            case 2:
                if (z) {
                    JniAdExt.K4(8, 2);
                    ((RadioButton) view).setChecked(false);
                    ((RadioButton) obj2).setChecked(false);
                    ((CheckBox) obj).setChecked(JniAdExt.S2(15));
                }
                break;
            default:
                String str = (String) obj2;
                iz izVar = (iz) obj;
                if (z) {
                    r3.B(izVar.F0, false);
                    r3.B(izVar.G0, false);
                    ArrayList arrayList = izVar.E0;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        RadioButton radioButton = (RadioButton) obj3;
                        if (radioButton.hashCode() != compoundButton.hashCode() || !radioButton.getText().equals(compoundButton.getText())) {
                            radioButton.setChecked(false);
                        }
                    }
                    izVar.y0 = ((LinearLayout) view).indexOfChild(compoundButton);
                    r3.I(izVar.H0, 8);
                    r3.I(izVar.I0, 8);
                    iz.S0(izVar, str);
                    izVar.v0 = str;
                }
                break;
        }
    }

    public /* synthetic */ gp(RadioButton radioButton, RadioButton radioButton2, CheckBox checkBox, int i) {
        this.a = i;
        this.b = radioButton;
        this.c = radioButton2;
        this.d = checkBox;
    }
}
