package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class fb1 extends hx0 {
    public final ViewGroup u;
    public final TextView v;

    public fb1(View view) {
        super(view);
        this.u = (ViewGroup) view.findViewById(R.id.trace_line_layout);
        this.v = (TextView) view.findViewById(R.id.trace_line_text);
    }
}
