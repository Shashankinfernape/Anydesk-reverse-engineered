package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends cd {
    @Override // defpackage.cd, defpackage.ed
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ed
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
