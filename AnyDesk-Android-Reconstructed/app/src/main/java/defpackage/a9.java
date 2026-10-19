package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class a9 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Resources resourcesF0 = ((e9) obj).f0();
                int i2 = z ? R.dimen.motd_dialog_close_clickable_area_focused_padding : R.dimen.motd_dialog_close_clickable_area_unfocused_padding;
                Looper looper = t70.a;
                int dimensionPixelSize = resourcesF0.getDimensionPixelSize(i2);
                view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                break;
            default:
                if (z) {
                    ((View) obj).requestFocus();
                }
                break;
        }
    }
}
