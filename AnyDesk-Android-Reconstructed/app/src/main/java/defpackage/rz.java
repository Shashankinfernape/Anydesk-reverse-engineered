package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public class rz implements GestureDetector.OnGestureListener {
    public final /* synthetic */ uz a;

    public rz(uz uzVar) {
        this.a = uzVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        FileManagerFileListFragment fileManagerFileListFragment = this.a.f;
        if (fileManagerFileListFragment == null) {
            return false;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        g00 g00Var = fileManagerFileListFragment.m0;
        if (g00Var == null) {
            return false;
        }
        g00Var.l = pointerId;
        g00Var.m = x;
        g00Var.n = y;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
