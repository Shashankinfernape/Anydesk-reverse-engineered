package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class d61 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SpeedDialItem d;
    public final /* synthetic */ k61 e;

    public /* synthetic */ d61(k61 k61Var, SpeedDialItem speedDialItem, int i) {
        this.c = i;
        this.e = k61Var;
        this.d = speedDialItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SpeedDialItem speedDialItem = this.d;
        k61 k61Var = this.e;
        switch (i) {
            case 0:
                dj djVar = k61Var.n;
                if (djVar != null) {
                    MainFragment.X0((MainFragment) djVar.d, speedDialItem.getAddr());
                }
                break;
            default:
                dj djVar2 = k61Var.n;
                if (djVar2 != null) {
                    djVar2.i(speedDialItem);
                }
                break;
        }
    }
}
