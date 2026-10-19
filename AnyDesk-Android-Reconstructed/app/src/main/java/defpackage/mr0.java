package defpackage;

import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.anydesk.anydeskandroid.IncomingConnectionService;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class mr0 extends FrameLayout {
    public final Logging c;
    public su0 d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public mr0(IncomingConnectionService incomingConnectionService) {
        super(incomingConnectionService);
        this.c = new Logging("OverlayView");
        this.d = null;
        lr0 lr0Var = new lr0(this, 0);
        this.e = false;
        setContentDescription("pointer_overlay");
        Point pointerSize = getPointerSize();
        this.g = pointerSize.x;
        this.h = pointerSize.y;
        su0 su0Var = new su0(incomingConnectionService);
        this.d = su0Var;
        su0Var.setVisibility(4);
        addView(this.d, new FrameLayout.LayoutParams(this.g, this.h));
        this.d.setHideCallback(lr0Var);
    }

    private int getOverlayWindowType() {
        return Build.VERSION.SDK_INT >= 26 ? 2038 : 2006;
    }

    private Point getPointerSize() {
        float fC = er0.c();
        float fD = er0.d();
        Point point = new Point();
        point.x = (int) ((fC * 48.0f) / 160.0f);
        point.y = (int) ((fD * 48.0f) / 160.0f);
        return point;
    }

    public final void a() {
        try {
            Point pointerSize = getPointerSize();
            int i = pointerSize.x;
            if (i != this.g || pointerSize.y != this.h) {
                this.g = i;
                this.h = pointerSize.y;
                su0 su0Var = this.d;
                if (su0Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) su0Var.getLayoutParams();
                    layoutParams.width = this.g;
                    layoutParams.height = this.h;
                    su0Var.setLayoutParams(layoutParams);
                }
            }
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -1, 0, 0, getOverlayWindowType(), 792, -3);
            layoutParams2.alpha = 0.8f;
            layoutParams2.gravity = 51;
            layoutParams2.setTitle("AnyDeskPointer");
            this.f = true;
            ((WindowManager) getContext().getSystemService("window")).addView(this, layoutParams2);
            this.e = true;
        } catch (Exception e) {
            this.c.h("cannot create overlay: " + e.getMessage());
            this.e = false;
        }
    }

    public final void b() {
        try {
            ((WindowManager) getContext().getSystemService("window")).removeView(this);
        } catch (Exception e) {
            this.c.h("cannot remove overlay: " + e.getMessage());
        }
        this.e = false;
    }

    public final void c() {
        su0 su0Var = this.d;
        if (su0Var == null) {
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = this.i - iArr[0];
        int i2 = this.j - iArr[1];
        int width = su0Var.getWidth();
        int height = su0Var.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) su0Var.getLayoutParams();
        layoutParams.leftMargin = i - (width / 2);
        layoutParams.topMargin = i2 - (height / 2);
        layoutParams.rightMargin = -width;
        layoutParams.bottomMargin = -height;
        su0Var.setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f) {
            this.f = false;
            post(new lr0(this, 1));
        }
    }
}
