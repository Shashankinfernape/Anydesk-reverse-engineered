package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class pl extends y90 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ pl(int i, Object obj) {
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.y90
    public final void N(int i) {
        switch (this.i) {
            case 0:
                break;
            default:
                o91 o91Var = (o91) this.j;
                o91Var.e = true;
                n91 n91Var = (n91) o91Var.f.get();
                if (n91Var != null) {
                    n91Var.a();
                }
                break;
        }
    }

    @Override // defpackage.y90
    public final void O(Typeface typeface, boolean z) {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                tl tlVar = chip.g;
                chip.setText(tlVar.E0 ? tlVar.G : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    o91 o91Var = (o91) obj;
                    o91Var.e = true;
                    n91 n91Var = (n91) o91Var.f.get();
                    if (n91Var != null) {
                        n91Var.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void Z(int i) {
    }
}
