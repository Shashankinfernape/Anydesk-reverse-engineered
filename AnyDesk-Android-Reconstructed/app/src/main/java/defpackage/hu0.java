package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class hu0 extends hx0 {
    public final View u;
    public final ImageView v;
    public final TextView w;

    public hu0(View view) {
        super(view);
        this.u = view.findViewById(R.id.permission_profile_item_container);
        this.v = (ImageView) view.findViewById(R.id.permission_profile_item_icon_has_passwd);
        this.w = (TextView) view.findViewById(R.id.permission_profile_item_text);
    }
}
