package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import com.anydesk.anydeskandroid.gui.element.ConnectionRootView;

/* JADX INFO: loaded from: classes.dex */
public final class dp extends BaseInputConnection {
    public final /* synthetic */ ConnectionRootView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(ConnectionRootView connectionRootView, ConnectionRootView connectionRootView2) {
        super(connectionRootView2, false);
        this.a = connectionRootView;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        ConnectionRootView connectionRootView;
        int iMax = Math.max(0, Math.min(10, i));
        int iMax2 = Math.max(0, Math.min(10, i2));
        int i3 = 0;
        while (true) {
            connectionRootView = this.a;
            if (i3 >= iMax) {
                break;
            }
            connectionRootView.d.h(new KeyEvent(0, 67));
            connectionRootView.d.h(new KeyEvent(1, 67));
            i3++;
        }
        for (int i4 = 0; i4 < iMax2; i4++) {
            connectionRootView.d.h(new KeyEvent(0, 112));
            connectionRootView.d.h(new KeyEvent(1, 112));
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return " ";
    }
}
