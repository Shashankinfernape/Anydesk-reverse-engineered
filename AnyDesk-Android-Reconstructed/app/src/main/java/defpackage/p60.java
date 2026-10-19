package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p60 {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            id.q("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            id.q("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        rw0 rw0Var = recyclerView.p;
        if (recyclerView.o == null || rw0Var == null || !rw0Var.i) {
            return;
        }
        if (z) {
            if (!recyclerView.g.j()) {
                rw0Var.i(recyclerView.o.a(), this);
            }
        } else if (!recyclerView.O()) {
            rw0Var.h(this.a, this.b, recyclerView.h0, this);
        }
        int i = this.d;
        if (i > rw0Var.j) {
            rw0Var.j = i;
            rw0Var.k = z;
            recyclerView.e.s();
        }
    }
}
