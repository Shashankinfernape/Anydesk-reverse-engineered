package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                k3 k3Var = (k3) obj;
                vf vfVar = k3Var.B0;
                View view2 = k3Var.A0;
                if (vfVar != null && view2 != null) {
                    Rect rect = new Rect();
                    view2.getDrawingRect(rect);
                    vfVar.setBounds(rect);
                    vfVar.o(view2, null);
                    break;
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new l(4, carouselLayoutManager));
                }
                break;
            default:
                TextView textView = ((h61) obj).x;
                textView.setMaxLines(textView.getHeight() / textView.getLineHeight());
                textView.setEllipsize(TextUtils.TruncateAt.END);
                break;
        }
    }
}
