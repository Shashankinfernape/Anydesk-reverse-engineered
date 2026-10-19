package defpackage;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz b;

    public /* synthetic */ gz(iz izVar, int i) {
        this.a = i;
        this.b = izVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object selectedItem;
        int i = this.a;
        String string = null;
        iz izVar = this.b;
        switch (i) {
            case 0:
                if (z) {
                    r3.B(izVar.G0, false);
                    ArrayList arrayList = izVar.E0;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        r3.B((RadioButton) obj, false);
                    }
                    LinearLayout linearLayout = izVar.D0;
                    if (linearLayout != null) {
                        izVar.y0 = linearLayout.indexOfChild(compoundButton);
                    }
                    r3.I(izVar.I0, 8);
                    r3.I(izVar.H0, 0);
                    AdEditText adEditText = izVar.H0;
                    iz.T0(izVar, adEditText != null ? adEditText.getText() : null);
                }
                break;
            default:
                if (z) {
                    r3.B(izVar.F0, false);
                    ArrayList arrayList2 = izVar.E0;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        r3.B((RadioButton) obj2, false);
                    }
                    LinearLayout linearLayout2 = izVar.D0;
                    if (linearLayout2 != null) {
                        izVar.y0 = linearLayout2.indexOfChild(compoundButton);
                    }
                    r3.I(izVar.H0, 8);
                    r3.I(izVar.I0, 0);
                    Spinner spinner = izVar.I0;
                    if (spinner != null && (selectedItem = spinner.getSelectedItem()) != null) {
                        string = selectedItem.toString();
                    }
                    iz.U0(izVar, string);
                }
                break;
        }
    }
}
