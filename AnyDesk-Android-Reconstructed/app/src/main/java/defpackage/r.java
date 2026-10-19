package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class r extends hx0 {
    public final View u;
    public final AppCompatRadioButton v;
    public final TextView w;

    public r(View view) {
        super(view);
        this.u = view.findViewById(R.id.abook_roster_container);
        this.v = (AppCompatRadioButton) view.findViewById(R.id.abook_roster_radio_button);
        this.w = (TextView) view.findViewById(R.id.abook_roster_name);
    }
}
