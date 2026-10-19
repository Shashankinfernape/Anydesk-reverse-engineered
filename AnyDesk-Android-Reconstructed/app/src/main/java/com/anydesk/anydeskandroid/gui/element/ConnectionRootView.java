package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import com.anydesk.jnilib.Logging;
import defpackage.dp;
import defpackage.er0;
import defpackage.l80;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionRootView extends FrameLayout {
    public final Logging c;
    public l80 d;

    public ConnectionRootView(Context context) {
        super(context);
        this.c = new Logging("ConnectionRootView");
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        editorInfo.imeOptions |= 1375731714;
        Logging logging = er0.a;
        if (Build.MODEL.startsWith("P023")) {
            this.c.e("fixing keyboard flags");
            editorInfo.inputType |= 524288;
        }
        if (Settings.Secure.getString(getContext().getContentResolver(), "default_input_method").toLowerCase().contains("samsung")) {
            editorInfo.inputType |= 144;
        }
        return new dp(this, this);
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return (i == 4 && er0.e("amazon")) ? this.d.h(keyEvent) : super.onKeyPreIme(i, keyEvent);
    }

    public void setKeyEventListener(l80 l80Var) {
        this.d = l80Var;
    }

    public ConnectionRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("ConnectionRootView");
    }

    public ConnectionRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("ConnectionRootView");
    }
}
