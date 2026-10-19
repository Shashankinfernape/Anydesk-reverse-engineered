package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class gh0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ih0 d;

    public /* synthetic */ gh0(ih0 ih0Var, int i) {
        this.c = i;
        this.d = ih0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        ImageView imageView2;
        int i = this.c;
        ih0 ih0Var = this.d;
        switch (i) {
            case 0:
                View view = ih0Var.w0;
                if (view != null && (imageView = (ImageView) view.findViewById(R.id.local_scam_warning_dialog_image)) != null) {
                    imageView.setImageResource(R.drawable.scam_warning);
                    view.postDelayed(ih0Var.C0, 1000L);
                    break;
                }
                break;
            default:
                View view2 = ih0Var.w0;
                if (view2 != null && (imageView2 = (ImageView) view2.findViewById(R.id.local_scam_warning_dialog_image)) != null) {
                    imageView2.setImageResource(R.drawable.scam_warning_alert);
                    view2.postDelayed(ih0Var.B0, 1000L);
                    break;
                }
                break;
        }
    }
}
