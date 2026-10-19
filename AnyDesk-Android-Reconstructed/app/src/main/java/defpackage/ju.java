package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ju {
    public final Context a;
    public final ku b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public ju(Context context, ku kuVar) {
        this.a = context;
        this.b = kuVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    public final void a(MotionEvent motionEvent, int i) {
        char c;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i2;
        float f2;
        float fSqrt;
        float[] fArr;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i3 = this.f;
        int[] iArr = this.h;
        if (i3 == source && this.g == deviceId && this.e == i) {
            z = false;
            c = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i4 = Build.VERSION.SDK_INT;
            c = 0;
            if (i4 >= 34) {
                Method method = pe1.a;
                scaledMinimumFlingVelocity = t3.f(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = pe1.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i4 >= 34) {
                scaledMaximumFlingVelocity = t3.e(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i5 = iArr[c];
        VelocityTracker velocityTracker = this.c;
        if (i5 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.c;
        Map map = sd1.a;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        int i6 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = sd1.a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new td1());
            }
            td1 td1Var = (td1) map2.get(velocityTracker2);
            long[] jArr = td1Var.b;
            long eventTime = motionEvent.getEventTime();
            if (td1Var.d != 0 && eventTime - jArr[td1Var.e] > 40) {
                td1Var.d = 0;
                td1Var.c = 0.0f;
            }
            int i7 = (td1Var.e + 1) % 20;
            td1Var.e = i7;
            int i8 = td1Var.d;
            if (i8 != 20) {
                td1Var.d = i8 + 1;
            }
            td1Var.a[i7] = motionEvent.getAxisValue(26);
            jArr[td1Var.e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        td1 td1Var2 = (td1) sd1.a.get(velocityTracker2);
        if (td1Var2 != null) {
            float[] fArr2 = td1Var2.a;
            long[] jArr2 = td1Var2.b;
            int i9 = td1Var2.d;
            if (i9 < 2) {
                f2 = Float.MAX_VALUE;
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i10 = td1Var2.e;
                int i11 = ((i10 + 20) - (i9 - 1)) % 20;
                long j2 = jArr2[i10];
                while (true) {
                    j = jArr2[i11];
                    long j3 = j2 - j;
                    i2 = td1Var2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    td1Var2.d = i2 - 1;
                    i11 = (i11 + 1) % 20;
                }
                if (i2 < 2) {
                    f2 = Float.MAX_VALUE;
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i2 == 2) {
                    int i12 = (i11 + 1) % 20;
                    long j4 = jArr2[i12];
                    if (j == j4) {
                        f2 = Float.MAX_VALUE;
                        fSqrt = 0.0f;
                    } else {
                        fSqrt = fArr2[i12] / (j4 - j);
                        f2 = Float.MAX_VALUE;
                    }
                    f = 0.0f;
                } else {
                    f2 = Float.MAX_VALUE;
                    int i13 = 0;
                    int i14 = 0;
                    float fAbs = 0.0f;
                    while (true) {
                        if (i13 >= td1Var2.d - 1) {
                            break;
                        }
                        int i15 = i13 + i11;
                        long j5 = jArr2[i15 % 20];
                        int i16 = (i15 + 1) % i6;
                        if (jArr2[i16] == j5) {
                            fArr = fArr2;
                        } else {
                            i14++;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i16] / (jArr2[i16] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i14 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                        i13++;
                        fArr2 = fArr;
                        f3 = 0.0f;
                        i6 = 20;
                    }
                    f = 0.0f;
                    fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            td1Var2.c = f5;
            if (f5 < (-Math.abs(f2))) {
                td1Var2.c = -Math.abs(f2);
            } else if (td1Var2.c > Math.abs(f2)) {
                td1Var2.c = Math.abs(f2);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = t3.b(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            td1 td1Var3 = (td1) sd1.a.get(velocityTracker2);
            yVelocity = (td1Var3 == null || i != 26) ? 0.0f : td1Var3.c;
        }
        ku kuVar = this.b;
        float f6 = kuVar.f() * yVelocity;
        float fSignum = Math.signum(f6);
        if (z || (fSignum != Math.signum(this.d) && fSignum != f)) {
            kuVar.g();
        }
        if (Math.abs(f6) < iArr[0]) {
            return;
        }
        int i17 = iArr[1];
        float fMax = Math.max(-i17, Math.min(f6, i17));
        this.d = kuVar.b(fMax) ? fMax : 0.0f;
    }
}
