package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class gl extends hx0 {
    public final ImageView A;
    public final View u;
    public final View v;
    public final View w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public gl(View view) {
        super(view);
        this.u = view.findViewById(R.id.chat_message_space_front);
        this.v = view.findViewById(R.id.chat_message_space_back);
        this.w = view.findViewById(R.id.chat_message_balloon);
        this.x = (TextView) view.findViewById(R.id.chat_message_text);
        this.y = (TextView) view.findViewById(R.id.chat_message_name);
        this.z = (TextView) view.findViewById(R.id.chat_message_time);
        this.A = (ImageView) view.findViewById(R.id.chat_message_icon);
    }
}
