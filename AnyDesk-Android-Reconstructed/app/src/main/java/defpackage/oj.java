package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oj extends ow0 {
    public final Paint a;
    public final List b;

    public oj() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.ow0
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iE;
        int iC;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((pe0) it.next()).getClass();
            int i = cn.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iD = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).D0()) {
                pj pjVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (pjVar.b) {
                    case 0:
                        break;
                    default:
                        iD = pjVar.c.F();
                        break;
                }
                float f2 = iD;
                pj pjVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (pjVar2.b) {
                    case 0:
                        iC = pjVar2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = pjVar2.c;
                        iC = carouselLayoutManager.o - carouselLayoutManager.C();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, iC, paint);
            } else {
                canvas2 = canvas;
                pj pjVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (pjVar3.b) {
                    case 0:
                        iD = pjVar3.c.D();
                        break;
                }
                float f3 = iD;
                pj pjVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (pjVar4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = pjVar4.c;
                        iE = carouselLayoutManager2.n - carouselLayoutManager2.E();
                        break;
                    default:
                        iE = pjVar4.c.n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, iE, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
