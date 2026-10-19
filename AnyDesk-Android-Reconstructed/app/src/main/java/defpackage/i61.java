package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class i61 extends hx0 {
    public final CardView u;
    public final ImageView v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;
    public final ImageView z;

    public i61(View view) {
        super(view);
        this.u = (CardView) view.findViewById(R.id.dial_card);
        this.v = (ImageView) view.findViewById(R.id.dial_image);
        this.w = (TextView) view.findViewById(R.id.dial_name);
        this.x = (TextView) view.findViewById(R.id.dial_name_alt);
        this.y = (ImageView) view.findViewById(R.id.dial_online_state);
        this.z = (ImageView) view.findViewById(R.id.dial_favorite_state);
    }
}
