package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public abstract class n41 {
    public d41 c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        d41 d41Var;
        RectF rectF = this.d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (d41Var = this.c) == null) {
            return;
        }
        e41.a.a(d41Var, 1.0f, rectF, null, this.e);
    }
}
