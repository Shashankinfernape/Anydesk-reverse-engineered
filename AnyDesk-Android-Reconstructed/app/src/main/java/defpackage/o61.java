package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;

/* JADX INFO: loaded from: classes.dex */
public final class o61 extends ui0 {
    public m61 f;
    public final n61 g;

    public o61(GlowActivity glowActivity) {
        super(glowActivity);
        this.g = new n61(this, glowActivity);
    }

    @Override // defpackage.ui0
    public final void k() {
        int i;
        GlowActivity glowActivity = (GlowActivity) this.e;
        Resources.Theme theme = glowActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            glowActivity.setTheme(i);
        }
        ((ViewGroup) glowActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.g);
    }

    @Override // defpackage.ui0
    public final void z(tk tkVar) {
        this.d = tkVar;
        View viewFindViewById = ((GlowActivity) this.e).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.f != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        }
        m61 m61Var = new m61(this, viewFindViewById, 1);
        this.f = m61Var;
        viewTreeObserver.addOnPreDrawListener(m61Var);
    }
}
