package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class f61 extends hx0 {
    public final CardView u;
    public final ImageView v;
    public final TextView w;
    public final TextView x;

    public f61(View view) {
        super(view);
        this.u = (CardView) view.findViewById(R.id.dial_card);
        view.findViewById(R.id.motd_background);
        this.v = (ImageView) view.findViewById(R.id.motd_image);
        this.w = (TextView) view.findViewById(R.id.motd_title);
        this.x = (TextView) view.findViewById(R.id.motd_text);
    }
}
