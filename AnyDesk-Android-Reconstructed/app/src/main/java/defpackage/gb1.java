package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends iw0 {
    public final ArrayList d;
    public String e;
    public TraceFragment f = null;
    public final int g;

    public gb1(Context context, ArrayList arrayList) {
        this.d = arrayList;
        Looper looper = t70.a;
        this.g = uj.l(context, R.color.colorTraceTextHighlight);
    }

    @Override // defpackage.iw0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        fb1 fb1Var = (fb1) hx0Var;
        String str = (String) this.d.get(i);
        TextView textView = fb1Var.v;
        textView.setText(BidiFormatter.getInstance().unicodeWrap(str));
        String str2 = this.e;
        if (textView != null) {
            String string = textView.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                SpannableString spannableString = new SpannableString(string);
                for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), BackgroundColorSpan.class)) {
                    spannableString.removeSpan(backgroundColorSpan);
                }
                if (!TextUtils.isEmpty(str2)) {
                    String lowerCase = string.toLowerCase();
                    for (String str3 : new HashSet(Arrays.asList(str2.toLowerCase().split(" +")))) {
                        if (!TextUtils.isEmpty(str3)) {
                            for (int iIndexOf = lowerCase.indexOf(str3); iIndexOf != -1; iIndexOf = lowerCase.indexOf(str3, str3.length() + iIndexOf)) {
                                spannableString.setSpan(new BackgroundColorSpan(this.g), iIndexOf, str3.length() + iIndexOf, 33);
                            }
                        }
                    }
                    textView.setText(spannableString);
                }
            }
        }
        fb1Var.u.setOnLongClickListener(new q(this, str, 10));
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new fb1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trace_line, viewGroup, false));
    }
}
