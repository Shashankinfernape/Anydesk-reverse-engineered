package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class px0 implements Serializable {
    public final Pattern c;

    public px0(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.c = patternCompile;
    }

    public final y6 a(String str) {
        str.getClass();
        Matcher matcher = this.c.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new y6(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.c.toString();
        string.getClass();
        return string;
    }

    public px0(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.c = patternCompile;
    }
}
