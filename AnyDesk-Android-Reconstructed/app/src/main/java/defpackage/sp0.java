package defpackage;

import android.view.View;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 extends hx0 {
    public final View u;
    public final TextView v;
    public final TextView w;

    public sp0(View view) {
        super(view);
        this.u = view.findViewById(R.id.network_info_busy_item_progress);
        this.v = (TextView) view.findViewById(R.id.network_info_busy_item_name);
        this.w = (TextView) view.findViewById(R.id.network_info_busy_item_result);
    }
}
