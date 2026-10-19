package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class mj {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ff n;
    public ImageReader o;
    public VirtualDisplay p;
    public gj q;
    public hj r;
    public DisplayManager s;
    public MediaProjectionManager u;
    public s7 v;
    public MediaProjection w;
    public final Context y;
    public MainApplication z;
    public final Logging a = new Logging("CaptureTool");
    public Point b = null;
    public boolean c = false;
    public s7 m = null;
    public int C = 1;
    public final Object t = new Object();
    public boolean x = false;
    public final Object A = new Object();
    public final jj B = new jj(this);
    public final n9 l = new n9();

    public mj(Context context) {
        this.y = context;
        new kj(this).start();
        JniAdExt.G = this;
    }

    public static void a(mj mjVar) {
        int i = 0;
        mjVar.x = false;
        s7 s7Var = mjVar.m;
        if (s7Var != null) {
            s7Var.post(new ij(mjVar, i));
        }
        ff ffVar = mjVar.n;
        if (ffVar != null) {
            ffVar.c();
        }
        MediaProjection mediaProjection = mjVar.w;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(mjVar.B);
        }
        synchronized (mjVar.A) {
            MainApplication mainApplication = mjVar.z;
            if (mainApplication != null) {
                t70.V(new ei0(mainApplication, 7));
            }
        }
        mjVar.w = null;
    }

    public final void b(int i, int i2, int i3) {
        n9 n9Var = this.l;
        s7 s7Var = this.m;
        if (n9Var == null || s7Var == null) {
            return;
        }
        j(i, i2, i3);
        try {
            int i4 = this.h;
            int i5 = this.i;
            n9Var.d();
            ImageReader imageReaderNewInstance = ImageReader.newInstance(i4, i5, 1, 5);
            this.o = imageReaderNewInstance;
            this.p = this.w.createVirtualDisplay("screencap", this.h, this.i, this.g, 9, imageReaderNewInstance.getSurface(), null, s7Var);
            s7 s7Var2 = this.m;
            if (s7Var2 != null) {
                this.j = 0;
                s7Var2.removeMessages(q51.d(12));
                s7Var2.sendEmptyMessageDelayed(q51.d(12), 3000L);
            }
            this.o.setOnImageAvailableListener(new lj(this), s7Var);
        } catch (Exception e) {
            this.a.a("error starting screencapture: " + e.getMessage());
            g();
            synchronized (this.A) {
                MainApplication mainApplication = this.z;
                if (mainApplication != null) {
                    t70.V(new l(14, mainApplication));
                }
            }
        }
    }

    public final int c() {
        int i;
        synchronized (this.t) {
            i = this.C;
        }
        return i;
    }

    public final void d() {
        boolean z = this.c;
        if (!z) {
            this.a.e("captured content is now invisible");
        } else if (this.b != null) {
            Point pointA = er0.a();
            Point point = this.b;
            if (point.x == pointA.x && point.y == pointA.y) {
                this.a.e("captured content is now visible");
            } else {
                this.a.e("captured content is now visible but does not have same size as display screen");
                Point point2 = this.b;
                if (point2.x > pointA.x || point2.y > pointA.y) {
                    this.a.h("captured content might have different resolution from display screen");
                }
                z = false;
            }
        }
        synchronized (this.A) {
            MainApplication mainApplication = this.z;
            if (mainApplication != null) {
                t70.V(new fj(mainApplication, 3, z));
            }
        }
    }

    public final void e(boolean z) {
        if (this.q != null) {
            Point pointA = this.b;
            if (pointA == null) {
                pointA = er0.a();
            }
            int iB = er0.b();
            if (!z && this.e == pointA.x && this.f == pointA.y && this.d == iB) {
                return;
            }
            int i = pointA.x;
            this.e = i;
            int i2 = pointA.y;
            this.f = i2;
            this.d = iB;
            if (!z) {
                VirtualDisplay virtualDisplay = this.p;
                n9 n9Var = this.l;
                s7 s7Var = this.m;
                if (virtualDisplay != null && n9Var != null && s7Var != null) {
                    ImageReader imageReader = this.o;
                    j(i, i2, iB);
                    virtualDisplay.resize(this.h, this.i, this.g);
                    int i3 = this.h;
                    int i4 = this.i;
                    synchronized (n9Var) {
                    }
                    this.o = ImageReader.newInstance(i3, i4, 1, 5);
                    s7 s7Var2 = this.m;
                    if (s7Var2 != null) {
                        this.j = 0;
                        s7Var2.removeMessages(q51.d(12));
                        s7Var2.sendEmptyMessageDelayed(q51.d(12), 3000L);
                    }
                    this.o.setOnImageAvailableListener(new lj(this), s7Var);
                    virtualDisplay.setSurface(this.o.getSurface());
                    f(imageReader);
                    return;
                }
            }
            g();
            b(pointA.x, pointA.y, iB);
        }
    }

    public final void f(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
        }
        JniAdExt.m4();
        n9 n9Var = this.l;
        if (n9Var != null) {
            synchronized (n9Var) {
                for (int i = 0; i < 5; i++) {
                    n9Var.c(i);
                }
            }
        }
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final void g() {
        f(this.o);
        this.o = null;
        VirtualDisplay virtualDisplay = this.p;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.p = null;
        }
    }

    public final void h(MainApplication mainApplication) {
        synchronized (this.A) {
            this.z = mainApplication;
        }
    }

    public final void i(int i) {
        synchronized (this.t) {
            this.C = i;
        }
    }

    public final void j(int i, int i2, int i3) {
        this.h = i;
        this.i = i2;
        this.g = i3;
        Logging logging = this.a;
        if (i3 <= 300 || Math.max(i, i2) <= 1920) {
            logging.e("native screencapture with " + this.h + "x" + this.i + "(" + this.g + " dpi)");
            return;
        }
        this.h /= 2;
        this.i /= 2;
        this.g /= 2;
        logging.e("scaled screencapture with " + this.h + "x" + this.i + "(" + this.g + " dpi)");
    }
}
