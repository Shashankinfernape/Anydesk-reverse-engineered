package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import com.anydesk.anydeskandroid.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class vg extends c40 {
    public final Handler Z = new Handler(Looper.getMainLooper());
    public gh a0;

    @Override // defpackage.c40
    public final void A0() {
        this.F = true;
        if (Build.VERSION.SDK_INT == 29 && y90.G(this.a0.e())) {
            gh ghVar = this.a0;
            ghVar.o = true;
            this.Z.postDelayed(new ug(ghVar, 2), 250L);
        }
    }

    @Override // defpackage.c40
    public final void B0() {
        this.F = true;
        if (Build.VERSION.SDK_INT >= 29 || this.a0.m) {
            return;
        }
        qa qaVarY = Y();
        if (qaVarY == null || !qaVarY.isChangingConfigurations()) {
            O0(0);
        }
    }

    public final void O0(int i) {
        if (i == 3 || !this.a0.o) {
            if (S0()) {
                this.a0.j = i;
                if (i == 1) {
                    V0(10, ec1.t(a0(), 10));
                }
            }
            gh ghVar = this.a0;
            if (ghVar.g == null) {
                ghVar.g = new bc(12, false);
            }
            bc bcVar = ghVar.g;
            CancellationSignal cancellationSignal = (CancellationSignal) bcVar.d;
            if (cancellationSignal != null) {
                try {
                    bj.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                bcVar.d = null;
            }
            aj ajVar = (aj) bcVar.e;
            if (ajVar != null) {
                try {
                    ajVar.a();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                bcVar.e = null;
            }
        }
    }

    public final void P0() {
        this.a0.k = false;
        Q0();
        if (!this.a0.m && k0()) {
            sf sfVar = new sf(e0());
            sfVar.g(this);
            sfVar.d(true);
        }
        Context contextA0 = a0();
        if (contextA0 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextA0.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        gh ghVar = this.a0;
                        ghVar.n = true;
                        this.Z.postDelayed(new ug(ghVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void Q0() {
        this.a0.k = false;
        if (k0()) {
            t40 t40VarE0 = e0();
            f10 f10Var = (f10) t40VarE0.B("androidx.biometric.FingerprintDialogFragment");
            if (f10Var != null) {
                if (f10Var.k0()) {
                    f10Var.O0(true, false);
                    return;
                }
                sf sfVar = new sf(t40VarE0);
                sfVar.g(f10Var);
                sfVar.d(true);
            }
        }
    }

    public final boolean R0() {
        return Build.VERSION.SDK_INT <= 28 && y90.G(this.a0.e());
    }

    public final boolean S0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            qa qaVarY = Y();
            if (qaVarY != null && this.a0.e != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    if (str != null) {
                        for (String str3 : qaVarY.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (!str.equalsIgnoreCase(str3)) {
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : qaVarY.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 != 28) {
                return false;
            }
            Context contextA0 = a0();
            return i2 < 23 || contextA0 == null || contextA0.getPackageManager() == null || !pr0.a(contextA0.getPackageManager());
        }
        return true;
    }

    public final void T0() {
        qa qaVarY = Y();
        if (qaVarY == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerS = th1.s(qaVarY);
        if (keyguardManagerS == null) {
            U0(12, g0(R.string.generic_error_no_keyguard));
            return;
        }
        gh ghVar = this.a0;
        bh bhVar = ghVar.d;
        CharSequence charSequence = bhVar != null ? bhVar.c : null;
        CharSequence charSequence2 = bhVar != null ? bhVar.d : null;
        ghVar.getClass();
        Intent intentA = qg.a(keyguardManagerS, charSequence, charSequence2 != null ? charSequence2 : null);
        if (intentA == null) {
            U0(14, g0(R.string.generic_error_no_device_credential));
            return;
        }
        this.a0.m = true;
        if (S0()) {
            Q0();
        }
        intentA.setFlags(134742016);
        if (this.v == null) {
            nh0.o(this, " not attached to Activity", "Fragment ");
            return;
        }
        t40 t40VarE0 = e0();
        if (t40VarE0.A == null) {
            t40VarE0.u.getClass();
            nh0.j("Starting activity with a requestCode requires a FragmentActivity host");
            return;
        }
        String str = this.g;
        p40 p40Var = new p40();
        p40Var.c = str;
        p40Var.d = 1;
        t40VarE0.D.addLast(p40Var);
        t40VarE0.A.a(intentA);
    }

    public final void U0(int i, CharSequence charSequence) {
        V0(i, charSequence);
        P0();
    }

    public final void V0(int i, CharSequence charSequence) {
        gh ghVar = this.a0;
        if (ghVar.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!ghVar.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        int i2 = 0;
        ghVar.l = false;
        Executor seVar = ghVar.b;
        if (seVar == null) {
            seVar = new se(2);
        }
        seVar.execute(new ng(this, i, charSequence, i2));
    }

    public final void W0(zg zgVar) {
        gh ghVar = this.a0;
        if (ghVar.l) {
            ghVar.l = false;
            Executor seVar = ghVar.b;
            if (seVar == null) {
                seVar = new se(2);
            }
            seVar.execute(new og(this, zgVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        P0();
    }

    public final void X0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = g0(R.string.default_error_msg);
        }
        this.a0.h(2);
        this.a0.g(charSequence);
    }

    public final void Y0() {
        int i;
        FingerprintManager fingerprintManagerB;
        FingerprintManager fingerprintManagerB2;
        if (this.a0.k) {
            return;
        }
        if (a0() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        gh ghVar = this.a0;
        int i2 = 1;
        ghVar.k = true;
        ghVar.l = true;
        int i3 = 12;
        boolean z = false;
        String str = null;
        y6Var = null;
        y6Var = null;
        y6Var = null;
        y6 y6Var = null;
        if (!S0()) {
            BiometricPrompt.Builder builderD = rg.d(I0().getApplicationContext());
            gh ghVar2 = this.a0;
            bh bhVar = ghVar2.d;
            CharSequence charSequence = bhVar != null ? bhVar.c : null;
            CharSequence charSequence2 = bhVar != null ? bhVar.d : null;
            ghVar2.getClass();
            if (charSequence != null) {
                rg.g(builderD, charSequence);
            }
            if (charSequence2 != null) {
                rg.f(builderD, charSequence2);
            }
            gh ghVar3 = this.a0;
            String str2 = ghVar3.i;
            if (str2 != null) {
                str = str2;
            } else if (ghVar3.d != null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                Executor seVar = this.a0.b;
                if (seVar == null) {
                    seVar = new se(2);
                }
                gh ghVar4 = this.a0;
                if (ghVar4.h == null) {
                    ghVar4.h = new a(ghVar4);
                }
                rg.e(builderD, str, seVar, ghVar4.h);
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                bh bhVar2 = this.a0.d;
                sg.a(builderD, true);
            }
            int iE = this.a0.e();
            if (i4 >= 30) {
                tg.a(builderD, iE);
            } else if (i4 >= 29) {
                sg.b(builderD, y90.G(iE));
            }
            BiometricPrompt biometricPromptC = rg.c(builderD);
            Context contextA0 = a0();
            BiometricPrompt.CryptoObject cryptoObjectI = ds.I(this.a0.e);
            gh ghVar5 = this.a0;
            if (ghVar5.g == null) {
                ghVar5.g = new bc(i3, z);
            }
            bc bcVar = ghVar5.g;
            if (((CancellationSignal) bcVar.d) == null) {
                bcVar.d = bj.b();
            }
            CancellationSignal cancellationSignal = (CancellationSignal) bcVar.d;
            se seVar2 = new se(1);
            gh ghVar6 = this.a0;
            if (ghVar6.f == null) {
                ghVar6.f = new y6(new fh(ghVar6));
            }
            y6 y6Var2 = ghVar6.f;
            if (((BiometricPrompt.AuthenticationCallback) y6Var2.d) == null) {
                y6Var2.d = lf.a((fh) y6Var2.f);
            }
            BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) y6Var2.d;
            try {
                if (cryptoObjectI == null) {
                    rg.b(biometricPromptC, cancellationSignal, seVar2, authenticationCallback);
                } else {
                    rg.a(biometricPromptC, cryptoObjectI, cancellationSignal, seVar2, authenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                U0(1, contextA0 != null ? contextA0.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = I0().getApplicationContext();
        yg ygVar = new yg(applicationContext, z);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 23 || (fingerprintManagerB = h10.b(applicationContext)) == null || !h10.d(fingerprintManagerB)) {
            i = 12;
        } else {
            i = (i5 < 23 || (fingerprintManagerB2 = h10.b(applicationContext)) == null || !h10.c(fingerprintManagerB2)) ? 11 : 0;
        }
        if (i != 0) {
            U0(i, ec1.t(applicationContext, i));
            return;
        }
        if (k0()) {
            this.a0.u = true;
            String str3 = Build.MODEL;
            if (i5 != 28 || str3 == null) {
                this.Z.postDelayed(new og(this, i2), 500L);
                new f10().Q0(e0(), "androidx.biometric.FingerprintDialogFragment");
                break;
            }
            String[] stringArray = applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
            int length = stringArray.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    this.Z.postDelayed(new og(this, i2), 500L);
                    new f10().Q0(e0(), "androidx.biometric.FingerprintDialogFragment");
                    break;
                } else if (str3.startsWith(stringArray[i6])) {
                    break;
                } else {
                    i6++;
                }
            }
            gh ghVar7 = this.a0;
            ghVar7.j = 0;
            ah ahVar = ghVar7.e;
            if (ahVar != null) {
                Cipher cipher = (Cipher) ahVar.b;
                if (cipher != null) {
                    y6Var = new y6(cipher);
                } else {
                    Signature signature = (Signature) ahVar.a;
                    if (signature != null) {
                        y6Var = new y6(signature);
                    } else {
                        Mac mac = (Mac) ahVar.c;
                        if (mac != null) {
                            y6Var = new y6(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && ((IdentityCredential) ahVar.d) != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            gh ghVar8 = this.a0;
            if (ghVar8.g == null) {
                ghVar8.g = new bc(i3, z);
            }
            bc bcVar2 = ghVar8.g;
            if (((aj) bcVar2.e) == null) {
                bcVar2.e = new aj();
            }
            aj ajVar = (aj) bcVar2.e;
            gh ghVar9 = this.a0;
            if (ghVar9.f == null) {
                ghVar9.f = new y6(new fh(ghVar9));
            }
            y6 y6Var3 = ghVar9.f;
            if (((fw) y6Var3.e) == null) {
                y6Var3.e = new fw(9);
            }
            try {
                ygVar.b(y6Var, ajVar);
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                U0(1, ec1.t(applicationContext, 1));
            }
        }
    }

    @Override // defpackage.c40
    public final void o0(int i, int i2, Intent intent) {
        super.o0(i, i2, intent);
        if (i == 1) {
            this.a0.m = false;
            if (i2 == -1) {
                W0(new zg());
            } else {
                U0(10, g0(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (Y() == null) {
            return;
        }
        qa qaVarY = Y();
        qaVarY.getClass();
        bf1 bf1VarK = qaVarY.K();
        ze1 ze1VarS = qaVarY.S();
        um0 um0VarT = qaVarY.t();
        ze1VarS.getClass();
        ah ahVar = new ah(bf1VarK, ze1VarS, um0VarT);
        fm fmVarA = nx0.a(gh.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        gh ghVar = (gh) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        this.a0 = ghVar;
        if (ghVar.p == null) {
            ghVar.p = new vm0();
        }
        ghVar.p.e(this, new pg(this, 0));
        gh ghVar2 = this.a0;
        if (ghVar2.q == null) {
            ghVar2.q = new vm0();
        }
        ghVar2.q.e(this, new pg(this, 1));
        gh ghVar3 = this.a0;
        if (ghVar3.r == null) {
            ghVar3.r = new vm0();
        }
        ghVar3.r.e(this, new pg(this, 2));
        gh ghVar4 = this.a0;
        if (ghVar4.s == null) {
            ghVar4.s = new vm0();
        }
        ghVar4.s.e(this, new pg(this, 3));
        gh ghVar5 = this.a0;
        if (ghVar5.t == null) {
            ghVar5.t = new vm0();
        }
        ghVar5.t.e(this, new pg(this, 4));
        gh ghVar6 = this.a0;
        if (ghVar6.v == null) {
            ghVar6.v = new vm0();
        }
        ghVar6.v.e(this, new pg(this, 5));
    }
}
