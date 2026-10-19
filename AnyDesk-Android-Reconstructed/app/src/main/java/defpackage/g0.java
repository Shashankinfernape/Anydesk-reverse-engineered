package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vw0
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    ((AbookRosterFragment) this.b).O0();
                }
                break;
        }
    }

    @Override // defpackage.vw0
    public final void b(RecyclerView recyclerView, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 0) {
                    ((AbookRosterFragment) obj).O0();
                }
                break;
            case 1:
                ((m0) obj).m();
                break;
            case 2:
                ty tyVar = (ty) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i3 = tyVar.j;
                int i4 = tyVar.a;
                int iComputeVerticalScrollRange = tyVar.s.computeVerticalScrollRange();
                int i5 = tyVar.r;
                int i6 = iComputeVerticalScrollRange - i5;
                tyVar.t = i6 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = tyVar.s.computeHorizontalScrollRange();
                int i7 = tyVar.q;
                int i8 = iComputeHorizontalScrollRange - i7;
                boolean z = i8 > 0 && i7 >= i4;
                tyVar.u = z;
                boolean z2 = tyVar.t;
                if (z2 || z) {
                    if (z2) {
                        int iMin = Math.min(i5, Math.max(i3, (i5 * i5) / iComputeVerticalScrollRange));
                        tyVar.k = iMin;
                        tyVar.l = (int) ((iComputeVerticalScrollOffset / i6) * (i5 - iMin));
                    }
                    if (tyVar.u) {
                        int iMin2 = Math.min(i7, Math.max(i3, (i7 * i7) / iComputeHorizontalScrollRange));
                        tyVar.n = iMin2;
                        tyVar.o = (int) ((iComputeHorizontalScrollOffset / i8) * (i7 - iMin2));
                    }
                    int i9 = tyVar.v;
                    if (i9 == 0 || i9 == 1) {
                        tyVar.i(1);
                    }
                } else if (tyVar.v != 0) {
                    tyVar.i(0);
                }
                break;
            default:
                uy uyVar = (uy) obj;
                int iComputeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                int i10 = uyVar.a;
                int iComputeVerticalScrollRange2 = uyVar.s.computeVerticalScrollRange();
                int i11 = uyVar.r;
                uyVar.t = iComputeVerticalScrollRange2 - i11 > 0 && i11 >= i10;
                int iComputeHorizontalScrollRange2 = uyVar.s.computeHorizontalScrollRange();
                int i12 = uyVar.q;
                boolean z3 = iComputeHorizontalScrollRange2 - i12 > 0 && i12 >= i10;
                uyVar.u = z3;
                boolean z4 = uyVar.t;
                if (z4 || z3) {
                    if (z4) {
                        float f = i11;
                        uyVar.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset2) * f) / iComputeVerticalScrollRange2);
                        uyVar.k = Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange2);
                    }
                    if (uyVar.u) {
                        float f2 = iComputeHorizontalScrollOffset2;
                        float f3 = i12;
                        uyVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange2);
                        uyVar.n = Math.min(i12, (i12 * i12) / iComputeHorizontalScrollRange2);
                    }
                    int i13 = uyVar.v;
                    if (i13 == 0 || i13 == 1) {
                        uyVar.h(1);
                    }
                } else if (uyVar.v != 0) {
                    uyVar.h(0);
                }
                break;
        }
    }
}
