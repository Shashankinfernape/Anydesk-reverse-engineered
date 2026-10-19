package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class vx {
    public static final Method g;
    public final MotionEvent.PointerProperties a;
    public final MotionEvent.PointerProperties[] b;
    public final MotionEvent.PointerCoords c;
    public final MotionEvent.PointerCoords[] d;
    public final MotionEvent.PointerCoords[] e;
    public final MotionEvent.PointerProperties[] f;

    static {
        Method method;
        try {
            method = MotionEvent.class.getMethod("setActionButton", Integer.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        g = method;
    }

    public vx() {
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        this.a = pointerProperties;
        this.b = new MotionEvent.PointerProperties[]{pointerProperties};
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        this.c = pointerCoords;
        this.d = new MotionEvent.PointerCoords[]{pointerCoords};
        this.e = new MotionEvent.PointerCoords[16];
        this.f = new MotionEvent.PointerProperties[16];
        for (int i = 0; i < 16; i++) {
            this.e[i] = new MotionEvent.PointerCoords();
            this.f[i] = new MotionEvent.PointerProperties();
        }
    }

    public static void a(MotionEvent.PointerCoords pointerCoords, float f, float f2) {
        if (f != 0.0f) {
            pointerCoords.setAxisValue(10, f);
        }
        if (f2 != 0.0f) {
            pointerCoords.setAxisValue(9, f2);
        }
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return KeyEvent.changeTimeRepeat(keyEvent, SystemClock.uptimeMillis(), keyEvent.getRepeatCount());
    }

    public static void h(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerProperties pointerProperties, int i, float f, float f2) {
        i(pointerCoords, pointerProperties, 0, 3, f, f2, (i == 0 || i == 10 || i == 11) ? 1.0f : 0.0f);
    }

    public static void i(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerProperties pointerProperties, int i, int i2, float f, float f2, float f3) {
        pointerProperties.clear();
        pointerProperties.id = i;
        pointerProperties.toolType = i2;
        pointerCoords.clear();
        pointerCoords.x = f;
        pointerCoords.y = f2;
        pointerCoords.pressure = f3;
        pointerCoords.size = 1.0f;
    }

    public final synchronized MotionEvent c(long j, long j2, int i, int i2, int i3, int i4, float f, float f2, int i5, int[] iArr, float[] fArr, float[] fArr2) {
        int i6;
        int i7;
        int i8;
        float f3;
        i6 = i4 > 16 ? 16 : i4;
        i7 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            float f4 = 1.0f;
            if ((i & 8194) == 8194) {
                if (i2 != 0 && i2 != 10 && i2 != 11) {
                    f4 = 0.0f;
                }
                f3 = f4;
                i8 = 3;
            } else {
                i8 = 1;
                f3 = 1.0f;
            }
            try {
                i(this.e[i9], this.f[i9], iArr[i9], i8, fArr != null ? fArr[i9] : 0.0f, fArr2 != null ? fArr2[i9] : 0.0f, f3);
                a(this.e[i9], f, f2);
                if (iArr[i9] == i3) {
                    i7 = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return MotionEvent.obtain(j, j2, (i2 & 255) | ((i7 << 8) & 65280), i6, this.f, this.e, 0, i5, 1.0f, 1.0f, 0, 0, i, 0);
    }

    public final synchronized MotionEvent d(boolean z, long j, long j2, float f, float f2, int i, int i2) {
        MotionEvent.PointerCoords pointerCoords = this.c;
        MotionEvent.PointerProperties pointerProperties = this.a;
        try {
            if (z) {
                i(pointerCoords, pointerProperties, 0, 1, f, f2, 1.0f);
                return g(i, i2, j, j2);
            }
            h(pointerCoords, pointerProperties, i, f, f2);
            return f(i, i2, j, j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized MotionEvent e(boolean z, long j, long j2, float f, float f2, int i, int i2, int i3) {
        MotionEvent motionEventF;
        MotionEvent.PointerCoords pointerCoords = this.c;
        MotionEvent.PointerProperties pointerProperties = this.a;
        try {
            if (z) {
                i(pointerCoords, pointerProperties, 0, 1, f, f2, 1.0f);
                motionEventF = g(i, i3, j, j2);
            } else {
                h(pointerCoords, pointerProperties, i, f, f2);
                motionEventF = f(i, i3, j, j2);
            }
            if (motionEventF != null) {
                try {
                    Method method = g;
                    if (method != null) {
                        method.invoke(motionEventF, Integer.valueOf(i2));
                    } else {
                        motionEventF.recycle();
                        motionEventF = null;
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return motionEventF;
    }

    public final MotionEvent f(int i, int i2, long j, long j2) {
        return MotionEvent.obtain(j, j2, i, 1, this.b, this.d, 0, i2, 1.0f, 1.0f, 0, 0, 8194, 0);
    }

    public final MotionEvent g(int i, int i2, long j, long j2) {
        return MotionEvent.obtain(j, j2, i, 1, this.b, this.d, 0, i2, 1.0f, 1.0f, 0, 0, 4098, 0);
    }
}
