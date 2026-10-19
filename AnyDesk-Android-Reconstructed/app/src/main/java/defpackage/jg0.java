package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements View.OnTouchListener {
    public final /* synthetic */ kg0 c;

    public jg0(kg0 kg0Var) {
        this.c = kg0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        kg0 kg0Var = this.c;
        gg0 gg0Var = kg0Var.t;
        Handler handler = kg0Var.x;
        ac acVar = kg0Var.B;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && acVar != null && acVar.isShowing() && x >= 0 && x < acVar.getWidth() && y >= 0 && y < acVar.getHeight()) {
            handler.postDelayed(gg0Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(gg0Var);
        return false;
    }
}
