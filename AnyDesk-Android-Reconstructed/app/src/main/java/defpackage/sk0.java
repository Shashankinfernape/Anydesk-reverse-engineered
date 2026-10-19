package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, hl0 {
    public q71 c;
    public w7 d;
    public dg0 e;

    @Override // defpackage.hl0
    public final void a(rk0 rk0Var, boolean z) {
        w7 w7Var;
        if ((z || rk0Var == this.c) && (w7Var = this.d) != null) {
            w7Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        q71 q71Var = this.c;
        dg0 dg0Var = this.e;
        if (dg0Var.h == null) {
            dg0Var.h = new cg0(dg0Var);
        }
        q71Var.q(dg0Var.h.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.e.a(this.c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        q71 q71Var = this.c;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                q71Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return q71Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.hl0
    public final boolean v(rk0 rk0Var) {
        return false;
    }
}
