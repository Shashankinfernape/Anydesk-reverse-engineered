package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class o11 extends TableRow {
    public final TextView c;
    public final TextView d;

    public o11(Context context, s11 s11Var, Integer num) {
        super(context);
        View viewInflate = View.inflate(context, R.layout.session_info_block_item, this);
        TextView textView = (TextView) viewInflate.findViewById(R.id.session_info_block_item_key);
        this.c = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.session_info_block_item_value);
        this.d = textView2;
        setKey(s11Var.a);
        a(context, s11Var.b);
        String str = s11Var.c;
        if (str != null) {
            setTag(str);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            Looper looper = t70.a;
            int iL = uj.l(context, iIntValue);
            textView.setTextColor(iL);
            textView2.setTextColor(iL);
        }
    }

    public final void a(Context context, String str) {
        boolean zIsEmpty = str.isEmpty();
        TextView textView = this.d;
        if (zIsEmpty) {
            textView.setText(JniAdExt.n1("ad.sys_info.not_available"));
            Looper looper = t70.a;
            textView.setTextColor(uj.l(context, R.color.colorSettingsCategoryTextDisabled));
        } else {
            textView.setText(lg.c().e(str));
            Looper looper2 = t70.a;
            textView.setTextColor(uj.l(context, R.color.colorSessionInfoIcon));
        }
    }

    public CharSequence getKeyText() {
        return this.c.getText();
    }

    public CharSequence getValueText() {
        return this.d.getText();
    }

    public void setKey(String str) {
        boolean zIsEmpty = str.isEmpty();
        TextView textView = this.c;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public void setValueUnfiltered(String str) {
        this.d.setText(lg.c().e(str));
    }
}
