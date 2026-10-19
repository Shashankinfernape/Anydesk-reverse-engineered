package defpackage;

import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class ag1 extends ImageButton {
    public int c;

    public final int getUserSetVisibility() {
        return this.c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.c = i;
    }
}
