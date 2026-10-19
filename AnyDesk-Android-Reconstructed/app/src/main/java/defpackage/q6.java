package defpackage;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements TextWatcher {
    public String c = "";
    public EditText d;
    public final /* synthetic */ int e;
    public final /* synthetic */ v6 f;

    public q6(v6 v6Var, int i) {
        this.e = i;
        this.f = v6Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        r6 r6Var;
        boolean z;
        char[] cArr;
        w6 w6Var;
        int i = this.e;
        boolean z2 = false;
        v6 v6Var = this.f;
        switch (i) {
            case 0:
                AdEditText adEditText = (AdEditText) v6Var;
                if (editable != null) {
                    String string = editable.toString();
                    int length = string.length();
                    if (length > 0) {
                        int i2 = length - 1;
                        if (string.charAt(i2) == '\n') {
                            string = string.substring(0, i2);
                            z2 = true;
                        }
                    }
                    String strReplaceAll = this.c.isEmpty() ? string : string.replaceAll(this.c, "");
                    EditText editText = this.d;
                    if (editText != null && (!strReplaceAll.equals(string) || z2)) {
                        editText.setText(strReplaceAll);
                        try {
                            editText.setSelection(editText.length());
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    int i3 = AdEditText.q;
                    if (strReplaceAll != null) {
                        adEditText.k(strReplaceAll.length());
                    }
                    r6 r6Var2 = adEditText.p;
                    if (r6Var2 != null) {
                        r6Var2.h(strReplaceAll);
                    }
                    if (z2 && (r6Var = adEditText.p) != null) {
                        r6Var.k();
                        break;
                    }
                }
                break;
            default:
                AdEditTextSecure adEditTextSecure = (AdEditTextSecure) v6Var;
                if (editable != null) {
                    int length2 = editable.length();
                    char[] cArr2 = new char[length2];
                    editable.getChars(0, length2, cArr2, 0);
                    if (length2 > 0) {
                        int i4 = length2 - 1;
                        if (cArr2[i4] == '\n') {
                            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr2, 0, i4);
                            Looper looper = t70.a;
                            Arrays.fill(cArr2, (char) 0);
                            cArr2 = cArrCopyOfRange;
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (this.c.isEmpty()) {
                        cArr = cArr2;
                    } else {
                        Matcher matcher = Pattern.compile(this.c).matcher(CharBuffer.wrap(cArr2));
                        matcher.reset();
                        if (matcher.find()) {
                            StringBuffer stringBuffer = new StringBuffer(cArr2.length);
                            do {
                                matcher.appendReplacement(stringBuffer, "");
                            } while (matcher.find());
                            matcher.appendTail(stringBuffer);
                            int length3 = stringBuffer.length();
                            cArr = new char[length3];
                            stringBuffer.toString().getChars(0, length3, cArr, 0);
                            for (int i5 = 0; i5 < length3; i5++) {
                                stringBuffer.setCharAt(i5, (char) 0);
                            }
                        } else {
                            cArr = cArr2;
                        }
                    }
                    EditText editText2 = this.d;
                    if (editText2 != null && (!Arrays.equals(cArr, cArr2) || z)) {
                        editText2.setText(cArr, 0, cArr.length);
                        try {
                            editText2.setSelection(editText2.length());
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    t01 t01VarD = t01.d(cArr);
                    int i6 = AdEditTextSecure.q;
                    adEditTextSecure.k(t01VarD.c.length);
                    w6 w6Var2 = adEditTextSecure.p;
                    if (w6Var2 != null) {
                        w6Var2.t(t01VarD);
                    }
                    if (z && (w6Var = adEditTextSecure.p) != null) {
                        w6Var.r();
                    }
                    Looper looper2 = t70.a;
                    if (cArr2 != null) {
                        Arrays.fill(cArr2, (char) 0);
                    }
                    t01VarD.b();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
