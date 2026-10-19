package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements uw0 {
    public GestureDetector a;
    public final /* synthetic */ MainFragment b;

    public aj0(MainFragment mainFragment, Context context) {
        this.b = mainFragment;
        this.a = new GestureDetector(context, new zi0(this));
    }

    @Override // defpackage.uw0
    public final boolean b(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @Override // defpackage.uw0
    public final void a(MotionEvent motionEvent) {
    }
}
