package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class tz extends hx0 {
    public final TextView A;
    public final CheckBox B;
    public final View C;
    public final View u;
    public final ImageView v;
    public final HorizontalScrollView w;
    public final TextView x;
    public final HorizontalScrollView y;
    public final TextView z;

    public tz(View view) {
        super(view);
        this.u = view.findViewById(R.id.filemanager_roster_item_container);
        this.v = (ImageView) view.findViewById(R.id.filemanager_roster_item_icon);
        this.w = (HorizontalScrollView) view.findViewById(R.id.filemanager_roster_item_details_name_container);
        this.x = (TextView) view.findViewById(R.id.filemanager_roster_item_details_name);
        this.y = (HorizontalScrollView) view.findViewById(R.id.filemanager_roster_item_details_datetime_container);
        this.z = (TextView) view.findViewById(R.id.filemanager_roster_item_details_datetime);
        this.A = (TextView) view.findViewById(R.id.filemanager_roster_item_details_size);
        this.B = (CheckBox) view.findViewById(R.id.filemanager_roster_item_checkbox);
        this.C = view.findViewById(R.id.filemanager_roster_item_content_padding_right);
    }
}
