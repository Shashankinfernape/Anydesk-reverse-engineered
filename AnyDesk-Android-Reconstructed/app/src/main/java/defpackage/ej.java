package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jni.JniImeConnection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ej(Object obj, int i, int i2, int i3) {
        this.c = i3;
        this.f = obj;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.e;
        int i3 = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                mj mjVar = (mj) obj;
                mjVar.b = new Point(i3, i2);
                mjVar.d();
                mjVar.e(false);
                break;
            default:
                Bitmap bitmap = JniAdExt.a;
                JniImeConnection jniImeConnection = ((GlowActivity) obj).h;
                if (jniImeConnection != null) {
                    jniImeConnection.h(i3, i2);
                    f70 f70Var = jniImeConnection.b;
                    InputMethodManager inputMethodManager = (InputMethodManager) f70Var.getContext().getSystemService("input_method");
                    if (jniImeConnection.d == 0) {
                        jniImeConnection.g(inputMethodManager, false);
                    } else {
                        jniImeConnection.g = true;
                    }
                    if (jniImeConnection.e) {
                        Editable editable = jniImeConnection.getEditable();
                        inputMethodManager.updateCursorAnchorInfo(f70Var, new CursorAnchorInfo.Builder().setSelectionRange(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable)).build());
                    }
                }
                break;
        }
    }
}
