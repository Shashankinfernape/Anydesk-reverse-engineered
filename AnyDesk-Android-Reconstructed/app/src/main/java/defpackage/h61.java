package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class h61 extends hx0 {
    public final CardView u;
    public final View v;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    public h61(View view) {
        super(view);
        this.u = (CardView) view.findViewById(R.id.dial_card);
        this.v = view.findViewById(R.id.motd_background);
        this.w = (TextView) view.findViewById(R.id.motd_title);
        TextView textView = (TextView) view.findViewById(R.id.motd_text);
        this.x = textView;
        this.y = (TextView) view.findViewById(R.id.motd_link);
        textView.addOnLayoutChangeListener(new z2(2, this));
    }
}
