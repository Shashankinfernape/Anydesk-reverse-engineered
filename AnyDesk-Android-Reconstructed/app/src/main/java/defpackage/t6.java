package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class t6 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 2 || i == 0) {
                    return ((v6) obj).g();
                }
                return false;
            default:
                if (i != 2 && i != 6) {
                    return false;
                }
                ((ConnectionFragment) obj).k1();
                return true;
        }
    }
}
