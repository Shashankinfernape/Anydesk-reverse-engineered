package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class e61 extends hx0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final CardView u;
    public final View v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public e61(View view) {
        super(view);
        this.u = (CardView) view.findViewById(R.id.dial_card);
        this.v = view.findViewById(R.id.discovery_background);
        this.w = (ImageView) view.findViewById(R.id.discovery_user_image);
        this.x = (TextView) view.findViewById(R.id.discovery_line1);
        this.y = (TextView) view.findViewById(R.id.discovery_line2);
        this.z = (TextView) view.findViewById(R.id.discovery_user_name);
        this.A = (TextView) view.findViewById(R.id.discovery_comp_name);
        this.B = (TextView) view.findViewById(R.id.discovery_os);
        this.C = (TextView) view.findViewById(R.id.discovery_addr);
        this.D = (ImageView) view.findViewById(R.id.discovery_online_state);
    }
}
