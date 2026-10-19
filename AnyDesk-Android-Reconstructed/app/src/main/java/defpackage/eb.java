package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class eb extends hq {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ eb(int i, Object obj) {
        this.s = i;
        this.t = obj;
    }

    @Override // defpackage.ff1
    public final void a() {
        int i = this.s;
        Object obj = this.t;
        switch (i) {
            case 0:
                qb qbVar = ((cb) obj).d;
                qbVar.w.setAlpha(1.0f);
                qbVar.z.d(null);
                qbVar.z = null;
                break;
            case 1:
                qb qbVar2 = (qb) obj;
                qbVar2.w.setAlpha(1.0f);
                qbVar2.z.d(null);
                qbVar2.z = null;
                break;
            default:
                qb qbVar3 = (qb) ((bc) obj).e;
                qbVar3.w.setVisibility(8);
                PopupWindow popupWindow = qbVar3.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qbVar3.w.getParent() instanceof View) {
                    View view = (View) qbVar3.w.getParent();
                    WeakHashMap weakHashMap = oe1.a;
                    ee1.c(view);
                }
                qbVar3.w.e();
                qbVar3.z.d(null);
                qbVar3.z = null;
                ViewGroup viewGroup = qbVar3.B;
                WeakHashMap weakHashMap2 = oe1.a;
                ee1.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.hq, defpackage.ff1
    public void e() {
        int i = this.s;
        Object obj = this.t;
        switch (i) {
            case 0:
                ((cb) obj).d.w.setVisibility(0);
                break;
            case 1:
                qb qbVar = (qb) obj;
                qbVar.w.setVisibility(0);
                if (qbVar.w.getParent() instanceof View) {
                    View view = (View) qbVar.w.getParent();
                    WeakHashMap weakHashMap = oe1.a;
                    ee1.c(view);
                }
                break;
        }
    }
}
