package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ AccountRegistrationFragment d;

    public /* synthetic */ x4(AccountRegistrationFragment accountRegistrationFragment, int i) {
        this.c = i;
        this.d = accountRegistrationFragment;
    }

    private final void a(AdapterView adapterView, View view, int i, long j) {
        b5 b5Var;
        AccountRegistrationFragment accountRegistrationFragment = this.d;
        if (!accountRegistrationFragment.U0) {
            accountRegistrationFragment.U0 = true;
            return;
        }
        y4 y4Var = accountRegistrationFragment.X0;
        if (y4Var == null || (b5Var = (b5) y4Var.getItem(i)) == null) {
            return;
        }
        h5 h5Var = this.d.d0;
        if (h5Var != null) {
            f9 f9Var = b5Var.a;
            synchronized (h5Var) {
                h5Var.p = f9Var;
            }
            h5Var.f();
        }
        this.d.Y0();
        this.d.V0();
        boolean z = (b5Var.a.c & 60) != 0;
        AccountRegistrationFragment accountRegistrationFragment2 = this.d;
        if (z) {
            AccountRegistrationFragment.e1(accountRegistrationFragment2.o0);
        } else {
            AccountRegistrationFragment.e1(accountRegistrationFragment2.A0);
        }
    }

    private final void b(AdapterView adapterView, View view, int i, long j) {
        AdCountryCode adCountryCode;
        AccountRegistrationFragment accountRegistrationFragment = this.d;
        if (!accountRegistrationFragment.V0) {
            accountRegistrationFragment.V0 = true;
            return;
        }
        y4 y4Var = accountRegistrationFragment.Y0;
        if (y4Var == null || (adCountryCode = (AdCountryCode) y4Var.getItem(i)) == null) {
            return;
        }
        f5 f5Var = f5.f;
        h5 h5Var = this.d.d0;
        if (h5Var != null) {
            synchronized (h5Var) {
                h5Var.r = adCountryCode;
            }
            h5Var.E(f5Var);
        }
        this.d.U0(f5Var);
        AccountRegistrationFragment.e1(this.d.t0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        g5 g5Var;
        switch (this.c) {
            case 0:
                a(adapterView, view, i, j);
                return;
            case 1:
                b(adapterView, view, i, j);
                return;
            default:
                AccountRegistrationFragment accountRegistrationFragment = this.d;
                if (!accountRegistrationFragment.W0) {
                    accountRegistrationFragment.W0 = true;
                    return;
                }
                y4 y4Var = accountRegistrationFragment.Z0;
                if (y4Var == null || (g5Var = (g5) y4Var.getItem(i)) == null) {
                    return;
                }
                f5 f5Var = f5.i;
                h5 h5Var = this.d.d0;
                if (h5Var != null) {
                    synchronized (h5Var) {
                        h5Var.t = g5Var;
                    }
                    h5Var.E(f5Var);
                }
                this.d.U0(f5Var);
                AccountRegistrationFragment.e1(this.d.y0);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.c;
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }

    private final void e(AdapterView adapterView) {
    }
}
