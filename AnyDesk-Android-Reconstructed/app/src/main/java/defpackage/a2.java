package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements ff1 {
    public boolean c;
    public int d;
    public final View e;

    public a2(FloatingActionButton floatingActionButton) {
        this.c = false;
        this.d = 0;
        this.e = floatingActionButton;
    }

    @Override // defpackage.ff1
    public void a() {
        if (this.c) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.e;
        actionBarContextView.h = null;
        super/*android.view.ViewGroup*/.setVisibility(this.d);
    }

    @Override // defpackage.ff1
    public void c() {
        this.c = true;
    }

    @Override // defpackage.ff1
    public void e() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    public a2(ActionBarContextView actionBarContextView) {
        this.e = actionBarContextView;
        this.c = false;
    }
}
