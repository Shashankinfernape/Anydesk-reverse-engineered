package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragmentWrapper;
import com.anydesk.anydeskandroid.gui.fragment.AccountLoggedInFragment;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewF;
        int width;
        NotificationManager notificationManager;
        switch (this.c) {
            case 0:
                ((d) this.d).S0();
                return;
            case 1:
                ((i) this.d).T0();
                return;
            case 2:
                AbookRosterItemDetailsFragmentWrapper abookRosterItemDetailsFragmentWrapper = (AbookRosterItemDetailsFragmentWrapper) this.d;
                RosterItem rosterItemQ2 = JniAdExt.Q2();
                if (rosterItemQ2 == null) {
                    qa qaVarY = abookRosterItemDetailsFragmentWrapper.Y();
                    if (qaVarY != null) {
                        qaVarY.setTitle("");
                        return;
                    }
                    return;
                }
                String displayName = rosterItemQ2.getDisplayName();
                qa qaVarY2 = abookRosterItemDetailsFragmentWrapper.Y();
                if (qaVarY2 != null) {
                    qaVarY2.setTitle(displayName);
                    return;
                }
                return;
            case 3:
                ((w1) this.d).S0();
                return;
            case 4:
                ((y1) this.d).c.R0();
                return;
            case 5:
                Dialog dialog = ((k3) this.d).k0;
                if (dialog != null) {
                    dialog.cancel();
                    return;
                }
                return;
            case 6:
                ((AccountLoggedInFragment) this.d).T0();
                return;
            case 7:
                Spinner spinner = (Spinner) this.d;
                if (spinner == null) {
                    return;
                }
                spinner.requestFocusFromTouch();
                return;
            case 8:
                CheckBox checkBox = (CheckBox) this.d;
                if (checkBox == null) {
                    return;
                }
                checkBox.requestFocusFromTouch();
                return;
            case 9:
                ((c5) this.d).U0();
                return;
            case 10:
                synchronized (((b7) this.d)) {
                    try {
                        b7 b7Var = (b7) this.d;
                        if (b7Var.y) {
                            int i = b7Var.c;
                            if (i == 0) {
                                b7Var.I = false;
                                b7Var.i(4);
                            } else if (i == 1) {
                                b7Var.I = true;
                                b7Var.i(2);
                            }
                        } else {
                            b7Var.i(3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 11:
                mg0 mg0Var = (mg0) this.d;
                uv uvVar = mg0Var.e;
                of ofVar = mg0Var.c;
                if (mg0Var.q) {
                    if (mg0Var.o) {
                        mg0Var.o = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        ofVar.e = jCurrentAnimationTimeMillis;
                        ofVar.g = -1L;
                        ofVar.f = jCurrentAnimationTimeMillis;
                        ofVar.h = 0.5f;
                    }
                    if ((ofVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > ofVar.g + ((long) ofVar.i)) || !mg0Var.e()) {
                        mg0Var.q = false;
                        return;
                    }
                    if (mg0Var.p) {
                        mg0Var.p = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        uvVar.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (ofVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = ofVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - ofVar.f;
                    ofVar.f = jCurrentAnimationTimeMillis2;
                    mg0Var.s.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * ofVar.d));
                    WeakHashMap weakHashMap = oe1.a;
                    uvVar.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((af1) this.d).d;
                int i2 = bottomSheetBehavior.n;
                if (i2 != 2 || i2 == 0) {
                    return;
                }
                bottomSheetBehavior.n = 0;
                return;
            case 13:
                so soVar = (so) this.d;
                zl0 zl0Var = ((lp) soVar.d).E;
                if (zl0Var != null) {
                    bc bcVar = ((ConnectionFragment) soVar.e).p0;
                    bcVar.getClass();
                    bcVar.p0(e9.T0(zl0Var), "AnyMessageDialog", false);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                ((lp) this.d).C.i(Boolean.TRUE);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                xt xtVar = (xt) this.d;
                xtVar.c0.onDismiss(xtVar.k0);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                q8 q8Var = (q8) this.d;
                q8Var.a(true);
                q8Var.invalidateSelf();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                xb xbVar = (xb) this.d;
                DrawerLayout drawerLayout = (DrawerLayout) xbVar.f;
                int i3 = ((qe1) xbVar.d).o;
                int i4 = xbVar.c;
                boolean z = i4 == 3;
                if (z) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i3;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i3;
                }
                if (viewF != null) {
                    if (((!z || viewF.getLeft() >= width) && (z || viewF.getLeft() <= width)) || drawerLayout.h(viewF) != 0) {
                        return;
                    }
                    iv ivVar = (iv) viewF.getLayoutParams();
                    ((qe1) xbVar.d).s(viewF, width, viewF.getTop());
                    ivVar.c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i4 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.s) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        drawerLayout.getChildAt(i5).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.s = true;
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                uv uvVar2 = (uv) this.d;
                uvVar2.n = null;
                uvVar2.drawableStateChanged();
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                ty tyVar = (ty) this.d;
                ValueAnimator valueAnimator = tyVar.A;
                int i6 = tyVar.B;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                tyVar.B = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                uy uyVar = (uy) this.d;
                ValueAnimator valueAnimator2 = uyVar.z;
                int i7 = uyVar.A;
                if (i7 == 1) {
                    valueAnimator2.cancel();
                } else if (i7 != 2) {
                    return;
                }
                uyVar.A = 3;
                valueAnimator2.setFloatValues(((Float) valueAnimator2.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator2.setDuration(500L);
                valueAnimator2.start();
                return;
            case 21:
                ((iz) this.d).X0();
                return;
            case 22:
                g00.a((g00) this.d);
                return;
            case 23:
                FileManagerProgressListFragment fileManagerProgressListFragment = (FileManagerProgressListFragment) this.d;
                ArrayList arrayList = fileManagerProgressListFragment.c0;
                x00 x00Var = fileManagerProgressListFragment.a0;
                if (x00Var == null) {
                    return;
                }
                ArrayList arrayListP = x00Var.p();
                q00 q00Var = fileManagerProgressListFragment.d0;
                if (q00Var == null) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(arrayListP);
                q00Var.d();
                return;
            case 24:
                f10 f10Var = (f10) this.d;
                Context contextA0 = f10Var.a0();
                if (contextA0 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    f10Var.r0.h(1);
                    f10Var.r0.g(contextA0.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 25:
                c40 c40Var = (c40) this.d;
                if (c40Var.K != null) {
                    c40Var.X().getClass();
                    return;
                }
                return;
            case 26:
                ((t40) this.d).x(true);
                return;
            case 27:
                gq0 gq0Var = (gq0) this.d;
                if (gq0Var == null || (notificationManager = gq0Var.c) == null) {
                    return;
                }
                notificationManager.cancel(102);
                return;
            case 28:
                JniAdExt.jniMonitorOnlineStates((long[]) this.d);
                return;
            default:
                t70.g0(JniAdExt.d, nd0.t((byte[]) this.d), 0);
                return;
        }
    }
}
