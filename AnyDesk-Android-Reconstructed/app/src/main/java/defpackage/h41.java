package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class h41 extends l41 {
    public final j41 c;
    public final float d;
    public final float e;

    public h41(j41 j41Var, float f, float f2) {
        this.c = j41Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.l41
    public final void a(Matrix matrix, b41 b41Var, int i, Canvas canvas) {
        j41 j41Var = this.c;
        float f = j41Var.c;
        float f2 = this.e;
        float f3 = j41Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        b41Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = b41Var.f;
        int[] iArr = b41.i;
        iArr[0] = i2;
        iArr[1] = b41Var.e;
        iArr[2] = b41Var.d;
        Paint paint = b41Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, b41.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        j41 j41Var = this.c;
        return (float) Math.toDegrees(Math.atan((j41Var.c - this.e) / (j41Var.b - this.d)));
    }
}
