package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends FrameLayout implements rm {
    public final CollapsibleActionView c;

    /* JADX WARN: Multi-variable type inference failed */
    public xk0(View view) {
        super(view.getContext());
        this.c = (CollapsibleActionView) view;
        addView(view);
    }
}
