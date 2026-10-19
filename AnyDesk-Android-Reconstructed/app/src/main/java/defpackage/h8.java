package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.remotecontrol.RemoteInjection;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class h8 extends lk0 {
    public final Logging k = new Logging("AndroidEventInjectorSamsung");
    public final RemoteInjection l;
    public final yw0 m;

    public h8(RemoteInjection remoteInjection, yw0 yw0Var) {
        this.l = remoteInjection;
        this.m = yw0Var;
    }

    @Override // defpackage.z70
    public final boolean a(KeyEvent keyEvent) {
        yw0 yw0Var = this.m;
        try {
            KeyEvent keyEventB = vx.b(keyEvent);
            boolean zG = MainApplication.v().U.g();
            RemoteInjection remoteInjection = this.l;
            if (!zG) {
                return remoteInjection.injectKeyEvent(keyEventB, true);
            }
            int i = yw0Var.a;
            if (i < 30 || i > 38) {
                return false;
            }
            return remoteInjection.injectKeyEventDex(keyEventB, true);
        } catch (Throwable th) {
            if (yw0Var.a >= 38) {
                return false;
            }
            q51.o(th, new StringBuilder("injectKeyEvent failed: "), this.k);
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean c(MotionEvent motionEvent) {
        yw0 yw0Var = this.m;
        try {
            boolean zG = MainApplication.v().U.g();
            RemoteInjection remoteInjection = this.l;
            if (!zG) {
                return remoteInjection.injectPointerEvent(motionEvent, true);
            }
            int i = yw0Var.a;
            if (i < 30 || i > 38) {
                return false;
            }
            return remoteInjection.injectPointerEventDex(motionEvent, true);
        } catch (Throwable th) {
            if (yw0Var.a >= 38) {
                return false;
            }
            q51.o(th, new StringBuilder("injectMotionEvent failed: "), this.k);
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean e(String str) {
        KeyCharacterMap keyCharacterMapLoad;
        try {
            Method method = vx.g;
            KeyEvent[] events = null;
            try {
                keyCharacterMapLoad = KeyCharacterMap.load(-1);
            } catch (Throwable unused) {
                keyCharacterMapLoad = null;
            }
            if (keyCharacterMapLoad != null && str != null) {
                events = keyCharacterMapLoad.getEvents(str.toCharArray());
            }
            return events != null && z(events);
        } catch (Throwable th) {
            if (this.m.a >= 38) {
                return false;
            }
            q51.o(th, new StringBuilder("injectString failed: "), this.k);
            return false;
        }
    }
}
