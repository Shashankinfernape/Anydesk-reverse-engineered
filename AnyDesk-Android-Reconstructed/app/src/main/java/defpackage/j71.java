package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j71 extends uj {
    public static String M(String str) {
        if (p71.P("|")) {
            id.q("marginPrefix must be non-blank string.");
            return null;
        }
        List listQ = p71.Q(str);
        int length = str.length();
        listQ.size();
        int size = listQ.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listQ) {
            int i2 = i + 1;
            if (i < 0) {
                um.b0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && p71.P(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char cCharAt = str2.charAt(i3);
                    if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        tm.l0(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
