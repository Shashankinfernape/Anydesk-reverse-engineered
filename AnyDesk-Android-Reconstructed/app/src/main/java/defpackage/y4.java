package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.anydeskandroid.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends ArrayAdapter {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(Context context, int i, List list, int i2) {
        super(context, i, list);
        this.a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    public final View a(int i, View view, ViewGroup viewGroup, float f) {
        String str;
        boolean zEquals = false;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.account_registration_spinner_text, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.account_registration_spinner_text);
        Object item = getItem(i);
        if (item != null) {
            int i2 = this.a;
            switch (i2) {
                case 0:
                    str = ((b5) item).b;
                    break;
                case 1:
                    str = ((AdCountryCode) item).mName;
                    break;
                default:
                    str = ((g5) item).d;
                    break;
            }
            textView.setText(str);
            Context context = getContext();
            switch (i2) {
                case 0:
                    zEquals = ((b5) item).a.equals(f9.d);
                    break;
                case 1:
                    AdCountryCode adCountryCode = (AdCountryCode) item;
                    if (adCountryCode.mIdx == 0 && TextUtils.isEmpty(adCountryCode.mCode)) {
                        zEquals = true;
                    }
                    break;
                default:
                    if (((g5) item) == g5.NONE) {
                        zEquals = true;
                    }
                    break;
            }
            int i3 = zEquals ? R.color.colorAccountTextSecondary : R.color.colorAccountTextPrimary;
            Looper looper = t70.a;
            textView.setTextColor(uj.l(context, i3));
        }
        textView.setTextSize(2, Math.max(0.0f, f));
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, 14.0f);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, 18.0f);
    }
}
