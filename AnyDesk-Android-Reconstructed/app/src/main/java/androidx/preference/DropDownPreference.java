package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter l;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.l = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.j;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.l;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
