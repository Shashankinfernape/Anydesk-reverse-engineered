package defpackage;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.TraceFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ap implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public ap(boolean z, byte[] bArr) {
        this.c = 1;
        this.d = z;
        this.e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Button buttonD;
        tt0 tt0Var;
        boolean z;
        TraceFragment traceFragment;
        gb1 gb1Var;
        RecyclerView recyclerView;
        boolean z2;
        switch (this.c) {
            case 0:
                ConnectionFragment connectionFragment = (ConnectionFragment) this.e;
                lp lpVar = connectionFragment.d0;
                if (lpVar == null) {
                    return;
                }
                if (!this.d) {
                    connectionFragment.a1();
                    lpVar.w(ke0.c);
                    return;
                } else {
                    if (lpVar.d() == ke0.c) {
                        int iOrdinal = lpVar.d().ordinal() + 1;
                        ke0[] ke0VarArr = ke0.g;
                        int length = iOrdinal % ke0VarArr.length;
                        if (length == 0) {
                            length++;
                        }
                        lpVar.w(ke0VarArr[length]);
                        connectionFragment.p1();
                        return;
                    }
                    return;
                }
            case 1:
                b21 b21Var = JniAdExt.L;
                if (b21Var != null) {
                    t70.Y(new c21(b21Var, nd0.t((byte[]) this.e), this.d));
                    return;
                }
                return;
            case 2:
                t01 t01Var = (t01) this.e;
                byte[] bArrC = nd0.c(t01Var.c);
                t01Var.b();
                JniAdExt.jniHandlePassword(bArrC, this.d);
                t70.a0(bArrC);
                return;
            case 3:
                MainActivity mainActivity = (MainActivity) this.e;
                dj djVar = mainActivity.U;
                if (djVar != null) {
                    djVar.n();
                }
                if (this.d) {
                    mainActivity.z0();
                    return;
                }
                return;
            case 4:
                MainFragment mainFragment = (MainFragment) this.e;
                boolean z3 = this.d;
                CardView cardView = mainFragment.c1;
                nr0 nr0Var = mainFragment.a1;
                if (cardView == null || nr0Var == null) {
                    return;
                }
                if (mainFragment.g1 != null && z3) {
                    nr0Var.s = true;
                    r3.I(nr0Var.a, 0);
                    r3.I(nr0Var.b, nr0Var.s ? 8 : 0);
                    return;
                }
                float width = cardView.getWidth();
                Resources resourcesF0 = mainFragment.f0();
                Looper looper = t70.a;
                boolean z4 = width < ((float) resourcesF0.getDimensionPixelSize(R.dimen.own_addr_card_max_width));
                nr0Var.s = z4;
                r3.I(nr0Var.a, z4 ? 0 : 8);
                r3.I(nr0Var.b, nr0Var.s ? 8 : 0);
                return;
            case 5:
                Dialog dialog = ((y21) this.e).k0;
                if (dialog == null || (buttonD = ((w7) dialog).d(-1)) == null) {
                    return;
                }
                buttonD.setEnabled(this.d);
                return;
            default:
                MainApplication mainApplicationV = MainApplication.v();
                if (!this.d) {
                    SharedPreferences sharedPreferences = mainApplicationV.T;
                    Looper looper2 = t70.a;
                    try {
                        z2 = sharedPreferences.getBoolean("trace_instant_updates", true);
                    } catch (Throwable unused) {
                        z2 = true;
                    }
                    if (!z2) {
                        return;
                    }
                    break;
                }
                TraceFragment traceFragment2 = (TraceFragment) this.e;
                jb1 jb1Var = traceFragment2.g0;
                int size = traceFragment2.d0.size();
                synchronized (jb1Var) {
                    ArrayList arrayList = new ArrayList();
                    if (jb1Var.e.size() == size) {
                        tt0Var = new tt0(arrayList, null);
                    } else if (jb1Var.e.size() > size) {
                        ArrayList arrayList2 = jb1Var.e;
                        arrayList.addAll(arrayList2.subList(size, arrayList2.size()));
                        tt0Var = new tt0(arrayList, Boolean.FALSE);
                    } else {
                        tt0Var = new tt0(jb1Var.e, Boolean.TRUE);
                    }
                }
                Object obj = tt0Var.b;
                if (obj == null) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ArrayList arrayList3 = ((TraceFragment) this.e).d0;
                if (zBooleanValue) {
                    arrayList3.clear();
                    ((TraceFragment) this.e).d0.addAll((Collection) tt0Var.a);
                    ((TraceFragment) this.e).o0.d();
                } else {
                    arrayList3.addAll((Collection) tt0Var.a);
                    ((TraceFragment) this.e).o0.c.clear();
                    TraceFragment traceFragment3 = (TraceFragment) this.e;
                    traceFragment3.o0.a(traceFragment3.d0);
                    TraceFragment traceFragment4 = (TraceFragment) this.e;
                    gb1 gb1Var2 = traceFragment4.e0;
                    if (gb1Var2 != null) {
                        gb1Var2.a.e(traceFragment4.d0.size(), ((ArrayList) tt0Var.a).size() - ((TraceFragment) this.e).d0.size());
                    }
                }
                SharedPreferences sharedPreferences2 = mainApplicationV.T;
                Looper looper3 = t70.a;
                try {
                    z = sharedPreferences2.getBoolean("trace_auto_scroll", true);
                    break;
                } catch (Throwable unused2) {
                    z = true;
                }
                if (z && (gb1Var = (traceFragment = (TraceFragment) this.e).e0) != null) {
                    ArrayList arrayList4 = gb1Var.d;
                    if (arrayList4.size() > 0 && (recyclerView = traceFragment.f0) != null) {
                        recyclerView.h0(arrayList4.size() - 1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ap(Object obj, int i, boolean z) {
        this.c = i;
        this.e = obj;
        this.d = z;
    }
}
