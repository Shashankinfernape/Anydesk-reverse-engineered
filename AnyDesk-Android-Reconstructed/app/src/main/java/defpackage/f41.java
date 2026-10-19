package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends l41 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public f41(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.l41
    public final void a(Matrix matrix, b41 b41Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((l41) obj).a(this.d, b41Var, i, canvas);
        }
    }
}
