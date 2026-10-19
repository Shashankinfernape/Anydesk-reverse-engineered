package defpackage;

import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public final class ch0 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ CheckBox d;

    public /* synthetic */ ch0(CheckBox checkBox, int i) {
        this.c = i;
        this.d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        CheckBox checkBox = this.d;
        switch (i) {
            case 0:
                checkBox.setChecked(!checkBox.isChecked());
                break;
            default:
                checkBox.setChecked(!checkBox.isChecked());
                break;
        }
    }
}
