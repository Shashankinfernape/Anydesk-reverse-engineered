package defpackage;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class vt implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vt(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                xt xtVar = (xt) obj2;
                if (((gf0) obj) != null && xtVar.g0) {
                    View viewK0 = xtVar.K0();
                    if (viewK0.getParent() != null) {
                        nh0.j("DialogFragment can not be attached to a container view");
                    } else if (xtVar.k0 != null) {
                        if (t40.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + xtVar.k0);
                        }
                        xtVar.k0.setContentView(viewK0);
                    }
                    break;
                }
                break;
            case 1:
                r3.F((TextView) obj2, (String) obj);
                break;
            default:
                t70.V(new d3(this, 22, (Boolean) obj));
                break;
        }
    }
}
