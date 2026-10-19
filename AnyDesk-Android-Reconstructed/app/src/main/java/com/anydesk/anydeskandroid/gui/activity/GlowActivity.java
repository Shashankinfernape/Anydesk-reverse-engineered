package com.anydesk.anydeskandroid.gui.activity;

import android.R;
import android.app.NativeActivity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.ArrayMap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.anydesk.jni.JniImeConnection;
import defpackage.d70;
import defpackage.dh1;
import defpackage.e70;
import defpackage.f70;
import defpackage.ge1;
import defpackage.gh1;
import defpackage.gw;
import defpackage.hh1;
import defpackage.ib;
import defpackage.ih1;
import defpackage.jh1;
import defpackage.kh1;
import defpackage.lh1;
import defpackage.nq0;
import defpackage.o61;
import defpackage.oe1;
import defpackage.r3;
import defpackage.s90;
import defpackage.t70;
import defpackage.tk;
import defpackage.ui0;
import defpackage.xt0;
import defpackage.y90;
import j$.util.Collection$EL;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GlowActivity extends NativeActivity implements nq0 {
    public static final /* synthetic */ int i = 0;
    public f70 c;
    public FrameLayout d;
    public boolean e;
    public final ArrayMap f = new ArrayMap();
    public gw g;
    public JniImeConnection h;
    private long mNativeActivityPtr;

    public static boolean a(GlowActivity glowActivity) {
        return Collection$EL.stream(glowActivity.f.values()).allMatch(new d70());
    }

    public static void c(GlowActivity glowActivity) {
        jniOnBackInvoked(glowActivity.mNativeActivityPtr);
    }

    private static native void jniOnActivityConfigChanged(long j, int i2, int i3, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnActivityWindowRectChanged(long j, int i2, int i3, int i4, int i5);

    private static native void jniOnBackInvoked(long j);

    private static native void jniOnImeVisibilityChanged(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnMouseCaptureChanged(long j, int i2, boolean z);

    private static native void jniOnSurfaceCreated(long j, Surface surface, int i2);

    private static native void jniOnSurfaceDestroyed(long j, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnSurfaceMoved(long j, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void jniOnSurfaceRedrawNeeded(long j, int i2);

    private static native void jniOnSurfaceResized(long j, int i2, int i3, int i4);

    public final int h(Surface surface) {
        for (e70 e70Var : this.f.values()) {
            Surface surface2 = e70Var.getHolder().getSurface();
            Looper looper = t70.a;
            if (surface2 == surface) {
                return e70Var.c;
            }
        }
        return 0;
    }

    public final long i() {
        return this.mNativeActivityPtr;
    }

    public final void j(int i2, boolean z) {
        e70 e70Var;
        if (Build.VERSION.SDK_INT >= 26 && (e70Var = (e70) this.f.get(Integer.valueOf(i2))) != null) {
            e70Var.d = z;
            if (z) {
                e70Var.requestPointerCapture();
            } else {
                e70Var.releasePointerCapture();
            }
        }
    }

    public final void k(gw gwVar) {
        this.g = gwVar;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        f70 f70Var = this.c;
        if (gwVar == null) {
            inputMethodManager.hideSoftInputFromWindow(f70Var.getWindowToken(), 0);
            return;
        }
        f70Var.requestFocus();
        inputMethodManager.restartInput(this.c);
        inputMethodManager.showSoftInput(this.c, 0);
    }

    @Override // defpackage.nq0
    public final gh1 l(View view, gh1 gh1Var) {
        dh1 dh1Var = gh1Var.a;
        jniOnImeVisibilityChanged(this.mNativeActivityPtr, dh1Var.o(8));
        s90 s90VarF = dh1Var.f(143);
        this.d.setPadding(s90VarF.a, s90VarF.b, s90VarF.c, s90VarF.d);
        return gh1.b;
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Looper looper = t70.a;
        jniOnActivityConfigChanged(this.mNativeActivityPtr, configuration.orientation, configuration.densityDpi, (configuration.uiMode & 48) == 32);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        y90 ih1Var;
        super.onCreate(bundle);
        Window window = getWindow();
        window.takeSurface(null);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        this.c = new f70(this, this);
        FrameLayout frameLayout = new FrameLayout(this);
        this.d = frameLayout;
        frameLayout.addView(childAt);
        this.c.addView(this.d);
        setContentView(this.c);
        View decorView = window.getDecorView();
        decorView.setBackgroundColor(-16777216);
        xt0 xt0Var = new xt0(decorView);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            ih1Var = new lh1(window, xt0Var);
        } else if (i2 >= 30) {
            ih1Var = new kh1(window, xt0Var);
        } else if (i2 >= 26) {
            ih1Var = new jh1(window, xt0Var);
        } else {
            ih1Var = i2 >= 23 ? new ih1(window, xt0Var) : new hh1(window, xt0Var);
        }
        ih1Var.U();
        ih1Var.T();
        WeakHashMap weakHashMap = oe1.a;
        ge1.k(decorView, this);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new ib(1, this));
        }
        ui0 o61Var = i3 >= 31 ? new o61(this) : new ui0(this);
        o61Var.k();
        o61Var.z(new tk(this));
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNativeActivityPtr = 0L;
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.e) {
            this.e = true;
            if (getWindow() != null) {
                r3.g(getWindow(), true);
            }
        }
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        super.surfaceChanged(surfaceHolder, i2, i3, i4);
        jniOnSurfaceResized(this.mNativeActivityPtr, h(surfaceHolder.getSurface()), i3, i4);
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        Surface surface = surfaceHolder.getSurface();
        jniOnSurfaceCreated(this.mNativeActivityPtr, surface, h(surface));
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        jniOnSurfaceDestroyed(this.mNativeActivityPtr, h(surfaceHolder.getSurface()));
    }

    @Override // android.app.NativeActivity, android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        super.surfaceRedrawNeeded(surfaceHolder);
        jniOnSurfaceRedrawNeeded(this.mNativeActivityPtr, h(surfaceHolder.getSurface()));
    }
}
