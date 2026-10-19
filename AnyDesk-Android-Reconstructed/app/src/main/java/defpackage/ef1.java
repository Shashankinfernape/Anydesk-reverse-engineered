package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ef1 {
    public Interpolator c;
    public ff1 d;
    public boolean e;
    public long b = -1;
    public final ua1 f = new ua1(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((df1) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            df1 df1Var = (df1) obj;
            long j = this.b;
            if (j >= 0) {
                df1Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) df1Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                df1Var.d(this.f);
            }
            View view2 = (View) df1Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
