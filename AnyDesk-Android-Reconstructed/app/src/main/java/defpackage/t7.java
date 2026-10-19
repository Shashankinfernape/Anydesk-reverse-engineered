package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends ArrayAdapter {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ t7(int i, Context context, List list) {
        super(context, i, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(getContext()).inflate(R.layout.filemanager_recents_spinner_dropdown_text, viewGroup, false);
                }
                r3.F((TextView) view.findViewById(R.id.filemanager_recents_spinner_dropdown_text), lg.c().e((String) getItem(i)));
                return view;
            default:
                return super.getDropDownView(i, view, viewGroup);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        switch (this.a) {
            case 0:
                return i;
            default:
                return super.getItemId(i);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_simple_spinner_text, viewGroup, false);
                }
                r3.F((TextView) view.findViewById(R.id.dialog_simple_spinner_text), lg.c().e((String) getItem(i)));
                return view;
            default:
                return super.getView(i, view, viewGroup);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.hasStableIds();
        }
    }

    public /* synthetic */ t7(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
    }
}
