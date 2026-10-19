package defpackage;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class u51 {
    public static final Pattern a = Pattern.compile("%s");

    public static SpannableStringBuilder a(String str, CharSequence... charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (CharSequence charSequence : charSequenceArr) {
            Matcher matcher = a.matcher(spannableStringBuilder);
            if (!matcher.find()) {
                break;
            }
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (charSequence == null) {
                charSequence = "null";
            }
            spannableStringBuilder.replace(iStart, iEnd, charSequence);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(fj0 fj0Var, CharSequence... charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        while (i < charSequenceArr.length) {
            if (i != 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            CharSequence charSequence = charSequenceArr[i];
            lg lgVar = (lg) fj0Var.d;
            lgVar.getClass();
            dj djVar = m91.a;
            CharSequence charSequenceD = lgVar.d(charSequence);
            if (charSequenceD == null) {
                charSequenceD = "null";
            }
            i++;
            spannableStringBuilder.append(charSequenceD, new t91(fj0Var.a, String.format((String) fj0Var.c, Integer.valueOf(i)), fj0Var.b), 33);
        }
        return spannableStringBuilder;
    }
}
