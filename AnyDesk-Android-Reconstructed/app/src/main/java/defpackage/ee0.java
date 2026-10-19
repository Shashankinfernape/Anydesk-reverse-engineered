package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ee0 implements View.OnTouchListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ je0 d;

    public ee0(je0 je0Var, int i) {
        this.d = je0Var;
        this.c = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        je0 je0Var = this.d;
        ro roVar = je0Var.c;
        if (roVar == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.c;
        if (actionMasked == 0) {
            roVar.b(i, je0Var.d);
            return true;
        }
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        roVar.d(i, je0Var.d);
        return true;
    }
}
