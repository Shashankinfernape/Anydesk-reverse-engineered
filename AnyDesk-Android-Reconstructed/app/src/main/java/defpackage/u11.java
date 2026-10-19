package defpackage;

import android.R;
import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class u11 extends ArrayAdapter {
    public final LayoutInflater a;

    public u11(qa qaVar) {
        super(qaVar, R.layout.simple_list_item_2);
        this.a = (LayoutInflater) qaVar.getSystemService("layout_inflater");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(com.anydesk.anydeskandroid.R.layout.settings_category_item, viewGroup, false);
        }
        fg fgVar = (fg) getItem(i);
        if (fgVar == null) {
            return view;
        }
        view.findViewById(com.anydesk.anydeskandroid.R.id.settings_category_item_layout);
        ImageView imageView = (ImageView) view.findViewById(com.anydesk.anydeskandroid.R.id.settings_category_image);
        TextView textView = (TextView) view.findViewById(com.anydesk.anydeskandroid.R.id.settings_category_title);
        textView.setText(fgVar.b);
        boolean z = fgVar instanceof w11;
        if (z) {
            imageView.setImageResource(((w11) fgVar).c);
        }
        nd0.O(textView, z ? R.style.TextAppearance.Medium : R.style.TextAppearance.Small);
        textView.setTypeface(textView.getTypeface(), !z ? 1 : 0);
        Context context = getContext();
        int i2 = z ? com.anydesk.anydeskandroid.R.color.colorSettingsCategoryText : com.anydesk.anydeskandroid.R.color.colorSettingsText;
        Looper looper = t70.a;
        textView.setTextColor(uj.l(context, i2));
        imageView.setVisibility(z ? 0 : 8);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        fg fgVar = (fg) getItem(i);
        if (fgVar == null) {
            return false;
        }
        return fgVar instanceof w11;
    }
}
