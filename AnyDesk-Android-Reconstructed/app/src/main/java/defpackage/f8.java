package defpackage;

import android.hardware.input.InputManager;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class f8 extends lk0 {
    public final Method k;
    public final InputManager l;

    public f8(InputManager inputManager, Method method) {
        this.l = inputManager;
        this.k = method;
    }

    @Override // defpackage.z70
    public final boolean a(KeyEvent keyEvent) {
        try {
            return ((Boolean) this.k.invoke(this.l, vx.b(keyEvent), 1)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean c(MotionEvent motionEvent) {
        try {
            return ((Boolean) this.k.invoke(this.l, motionEvent, 1)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean e(String str) {
        KeyCharacterMap keyCharacterMapLoad;
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
    }
}
