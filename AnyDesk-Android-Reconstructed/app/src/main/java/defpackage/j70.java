package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j70 extends View {
    public boolean c;

    public j70(Context context) {
        super(context);
        this.c = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.c = z;
    }

    public void setGuidelineBegin(int i) {
        rp rpVar = (rp) getLayoutParams();
        if (this.c && rpVar.a == i) {
            return;
        }
        rpVar.a = i;
        setLayoutParams(rpVar);
    }

    public void setGuidelineEnd(int i) {
        rp rpVar = (rp) getLayoutParams();
        if (this.c && rpVar.b == i) {
            return;
        }
        rpVar.b = i;
        setLayoutParams(rpVar);
    }

    public void setGuidelinePercent(float f) {
        rp rpVar = (rp) getLayoutParams();
        if (this.c && rpVar.c == f) {
            return;
        }
        rpVar.c = f;
        setLayoutParams(rpVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
