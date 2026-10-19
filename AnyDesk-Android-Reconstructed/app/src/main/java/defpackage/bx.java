package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bx implements ax {
    public final /* synthetic */ int c;
    public final String d;

    public bx(Intent intent) {
        this.c = 1;
        String[] stringArrayExtra = intent.getStringArrayExtra("args");
        if (stringArrayExtra == null) {
            String stringExtra = intent.getStringExtra("nav");
            this.d = stringExtra != null ? "--hub --nav=/".concat(stringExtra) : "--hub";
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (stringArrayExtra.length > 0) {
            sb.append((CharSequence) stringArrayExtra[0]);
            for (int i = 1; i < stringArrayExtra.length; i++) {
                sb.append((CharSequence) " ");
                sb.append((CharSequence) stringArrayExtra[i]);
            }
        }
        this.d = sb.toString();
    }

    public String toString() {
        switch (this.c) {
            case 2:
                return "<" + this.d + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ax
    public boolean w(CharSequence charSequence, int i, int i2, mc1 mc1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.d)) {
            return true;
        }
        mc1Var.c = (mc1Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.ax
    public Object a() {
        return this;
    }

    public /* synthetic */ bx(String str, int i) {
        this.c = i;
        this.d = str;
    }
}
