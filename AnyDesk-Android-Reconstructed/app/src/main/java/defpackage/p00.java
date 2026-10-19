package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class p00 extends hx0 {
    public final ImageView A;
    public final ImageView u;
    public final LinearProgressIndicator v;
    public final LinearProgressIndicator w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public p00(View view) {
        super(view);
        this.u = (ImageView) view.findViewById(R.id.filemanager_progress_item_details_icon);
        this.v = (LinearProgressIndicator) view.findViewById(R.id.filemanager_progress_item_indicator);
        this.w = (LinearProgressIndicator) view.findViewById(R.id.filemanager_progress_item_background_indicator);
        this.x = (TextView) view.findViewById(R.id.filemanager_progress_item_details_title);
        this.y = (TextView) view.findViewById(R.id.filemanager_progress_item_details_info);
        this.z = (TextView) view.findViewById(R.id.filemanager_progress_item_details_state);
        this.A = (ImageView) view.findViewById(R.id.filemanager_progress_item_icon_close);
    }
}
