package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class lv extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public lv(DrawerLayout drawerLayout, NavigationView navigationView) {
        this.b = drawerLayout;
        this.c = navigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) obj2;
                drawerLayout.c((NavigationView) obj, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            default:
                ((xd) obj2).remove(animator);
                ((qb1) obj).p.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((qb1) this.c).p.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public lv(qb1 qb1Var, xd xdVar) {
        this.c = qb1Var;
        this.b = xdVar;
    }
}
