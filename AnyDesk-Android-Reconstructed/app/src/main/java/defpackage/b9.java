package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public b9(ViewTreeObserver viewTreeObserver, View view, v31 v31Var) {
        this.c = 2;
        this.d = viewTreeObserver;
        this.e = view;
        this.f = v31Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int height;
        int width;
        int i = this.c;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Rect rect = new Rect();
                e9 e9Var = (e9) obj2;
                e9Var.x0.getWindowVisibleDisplayFrame(rect);
                Rect rect2 = e9Var.D0;
                if (rect2 == null || rect.top != rect2.top || rect.bottom != rect2.bottom || rect.left != rect2.left || rect.right != rect2.right) {
                    e9Var.D0 = rect;
                    w7 w7Var = (w7) obj3;
                    Bitmap bitmap = (Bitmap) obj;
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    if (bitmap.getHeight() * iWidth <= bitmap.getWidth() * iHeight) {
                        width = (int) (((double) iWidth) * 0.85d);
                        height = (bitmap.getHeight() * width) / bitmap.getWidth();
                    } else {
                        height = (int) (((double) iHeight) * 0.85d);
                        width = (bitmap.getWidth() * height) / bitmap.getHeight();
                    }
                    w7Var.getWindow().setLayout(width, height);
                    w7Var.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                break;
            case 1:
                t81 t81Var = (t81) obj2;
                if (!t81Var.d) {
                    int iMin = Math.min(t81Var.getWidth(), t81Var.k) - (t81Var.i * 2);
                    if (iMin > 0) {
                        String str = t81Var.z;
                        TextPaint textPaint = t81Var.t;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        t81Var.A = d6.f(str, textPaint, iMin);
                        CharSequence charSequence = t81Var.B;
                        if (charSequence != null) {
                            t81Var.C = d6.f(charSequence, t81Var.u, iMin);
                        } else {
                            t81Var.C = null;
                        }
                    }
                    ((p81) obj3).c(new bc0(19, this));
                    break;
                }
                break;
            default:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                if (!viewTreeObserver.isAlive()) {
                    viewTreeObserver = ((View) obj).getViewTreeObserver();
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                ((v31) obj2).run();
                break;
        }
    }

    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.f = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
