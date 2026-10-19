package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class jp implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ String e;

    public /* synthetic */ jp(TextView textView, String str, int i) {
        this.c = i;
        this.d = textView;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.e;
        TextView textView = this.d;
        switch (i) {
            case 0:
                if (textView != null) {
                    textView.setText(str);
                }
                break;
            case 1:
                if (textView != null) {
                    textView.setText(str);
                }
                break;
            default:
                if (textView != null) {
                    textView.setText(str);
                }
                break;
        }
    }
}
