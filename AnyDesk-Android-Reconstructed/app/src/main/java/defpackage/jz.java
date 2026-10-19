package defpackage;

import android.view.View;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class jz extends hx0 {
    public final TextView u;
    public final TextView v;

    public jz(View view) {
        super(view);
        this.u = (TextView) view.findViewById(R.id.filemanager_dirpath_item_breadcrumb);
        this.v = (TextView) view.findViewById(R.id.filemanager_dirpath_item_text);
    }
}
