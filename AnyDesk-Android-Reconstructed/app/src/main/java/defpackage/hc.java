package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
