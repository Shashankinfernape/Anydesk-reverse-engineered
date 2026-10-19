package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class pj {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pj(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }

    public final int a() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.E0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    public pj(int i) {
        this.a = i;
    }
}
