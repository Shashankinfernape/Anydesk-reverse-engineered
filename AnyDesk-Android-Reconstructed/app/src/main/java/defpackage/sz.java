package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class sz implements View.OnTouchListener {
    public GestureDetector c;
    public final /* synthetic */ uz d;

    public sz(uz uzVar, GestureDetector gestureDetector) {
        this.d = uzVar;
        this.c = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FileManagerFileListFragment fileManagerFileListFragment = this.d.f;
        if (fileManagerFileListFragment == null) {
            return false;
        }
        g00 g00Var = fileManagerFileListFragment.m0;
        if (g00Var != null && g00Var.e) {
            g00Var.c(motionEvent);
            return false;
        }
        GestureDetector gestureDetector = this.c;
        if (gestureDetector == null) {
            return false;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }
}
