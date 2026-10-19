package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o00(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.f = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                FileManagerProgressListFragment fileManagerProgressListFragment = ((q00) this.f).f;
                if (fileManagerProgressListFragment != null) {
                    n00 n00Var = (n00) this.d;
                    int iB = ((p00) this.e).b();
                    x00 x00Var = fileManagerProgressListFragment.a0;
                    if (x00Var == null) {
                        return;
                    }
                    int i = n00Var.a;
                    synchronized (x00Var.L) {
                        x00Var.L.remove(Integer.valueOf(i));
                        x00Var.D();
                        break;
                    }
                    JniAdExt.I0.post(new cp(n00Var.a, 17));
                    ArrayList arrayList = fileManagerProgressListFragment.c0;
                    x00 x00Var2 = fileManagerProgressListFragment.a0;
                    if (x00Var2 == null) {
                        return;
                    }
                    ArrayList arrayListP = x00Var2.p();
                    q00 q00Var = fileManagerProgressListFragment.d0;
                    if (q00Var == null) {
                        return;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayListP);
                    try {
                        q00Var.a.f(iB, 1);
                        return;
                    } catch (Throwable unused) {
                        q00Var.d();
                        return;
                    }
                }
                return;
            default:
                Runnable runnable = (Runnable) this.d;
                if (runnable == null) {
                    ((SetupFragment) this.f).S0((a41) this.e);
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }
}
