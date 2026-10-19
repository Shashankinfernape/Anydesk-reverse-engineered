package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends hx0 {
    public final RecyclerView A;
    public final m81 B;
    public final TextView u;
    public final View v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;
    public final View z;

    public l0(View view, int i, int i2) {
        super(view);
        this.u = (TextView) view.findViewById(R.id.abook_roster_item_sticky_row_index);
        this.v = view.findViewById(R.id.abook_roster_item_container);
        this.w = (ImageView) view.findViewById(R.id.abook_roster_item_remote_desk_image);
        this.x = (TextView) view.findViewById(R.id.abook_roster_item_primary_text);
        this.y = (TextView) view.findViewById(R.id.abook_roster_item_secondary_text);
        this.z = view.findViewById(R.id.abook_roster_item_online_status);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.abook_roster_item_tags);
        this.A = recyclerView;
        m81 m81Var = new m81();
        this.B = m81Var;
        recyclerView.setAdapter(m81Var);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.i(new x70(i, i2));
    }
}
