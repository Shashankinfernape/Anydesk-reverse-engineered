package defpackage;

import android.view.View;
import android.widget.CheckBox;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class kz implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ lz d;

    public /* synthetic */ kz(lz lzVar, int i) {
        this.c = i;
        this.d = lzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        lz lzVar = this.d;
        switch (i) {
            case 0:
                JniAdExt.I0.post(new hc0(lzVar.q0, lzVar.r0, 3, lzVar.z0));
                lzVar.O0(false, false);
                break;
            case 1:
                JniAdExt.I0.post(new hc0(lzVar.q0, lzVar.r0, 2, lzVar.z0));
                lzVar.O0(false, false);
                break;
            default:
                CheckBox checkBox = lzVar.D0;
                if (checkBox != null) {
                    checkBox.setChecked(!checkBox.isChecked());
                    break;
                }
                break;
        }
    }
}
