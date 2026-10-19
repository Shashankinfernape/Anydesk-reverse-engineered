package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class g41 extends l41 {
    public final i41 c;

    public g41(i41 i41Var) {
        this.c = i41Var;
    }

    @Override // defpackage.l41
    public final void a(Matrix matrix, b41 b41Var, int i, Canvas canvas) {
        char c;
        i41 i41Var = this.c;
        float f = i41Var.f;
        float f2 = i41Var.g;
        RectF rectF = new RectF(i41Var.b, i41Var.c, i41Var.d, i41Var.e);
        Paint paint = b41Var.b;
        boolean z = f2 < 0.0f;
        Path path = b41Var.g;
        int[] iArr = b41.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = b41Var.f;
            iArr[2] = b41Var.e;
            iArr[3] = b41Var.d;
            c = 1;
        } else {
            path.rewind();
            c = 1;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = b41Var.d;
            iArr[2] = b41Var.e;
            iArr[3] = b41Var.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = b41.l;
        fArr[c] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, b41Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
