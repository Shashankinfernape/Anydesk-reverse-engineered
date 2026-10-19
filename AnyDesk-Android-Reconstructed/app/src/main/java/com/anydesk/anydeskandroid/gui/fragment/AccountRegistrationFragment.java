package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.AdCountryCode;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AccountAsteriskLabelledText;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.element.TightTextView;
import com.anydesk.anydeskandroid.gui.fragment.AccountRegistrationFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.b5;
import defpackage.bc;
import defpackage.c;
import defpackage.cb1;
import defpackage.e5;
import defpackage.f5;
import defpackage.f9;
import defpackage.g5;
import defpackage.g9;
import defpackage.h5;
import defpackage.hd0;
import defpackage.i7;
import defpackage.m80;
import defpackage.n80;
import defpackage.r3;
import defpackage.s0;
import defpackage.t01;
import defpackage.t4;
import defpackage.t51;
import defpackage.t70;
import defpackage.u51;
import defpackage.uj;
import defpackage.v4;
import defpackage.v6;
import defpackage.w4;
import defpackage.x4;
import defpackage.xc0;
import defpackage.y4;
import defpackage.y6;
import defpackage.z4;
import defpackage.z6;
import j$.util.StringJoiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AccountRegistrationFragment extends z6 implements n80, xc0, hd0 {
    public static final List h1 = Arrays.asList(new b5(f9.d, JniAdExt.n1("ad.account.register.select")), new b5(f9.e, JniAdExt.n1("ad.account.register.purpose.family")), new b5(f9.f, JniAdExt.n1("ad.account.register.purpose.personal")), new b5(f9.g, JniAdExt.n1("ad.account.register.purpose.home_office")), new b5(f9.h, JniAdExt.n1("ad.account.register.purpose.colleagues")), new b5(f9.i, JniAdExt.n1("ad.account.register.purpose.customers")), new b5(f9.j, JniAdExt.n1("ad.account.register.purpose.organization")));
    public AdEditText A0;
    public TextView B0;
    public AccountAsteriskLabelledText C0;
    public AdEditText D0;
    public TextView E0;
    public AccountAsteriskLabelledText F0;
    public AdEditTextSecure G0;
    public TextView H0;
    public ImageView I0;
    public AdEditTextSecure J0;
    public TextView K0;
    public AdEditTextSecure L0;
    public TextView M0;
    public CheckBox N0;
    public ViewGroup O0;
    public TextView P0;
    public CheckBox Q0;
    public TightTextView R0;
    public TextView S0;
    public Button T0;
    public y4 X0;
    public y4 Y0;
    public y4 Z0;
    public final y6 a1;
    public boolean b0;
    public final y6 b1;
    public m80 c0;
    public final y6 c1;
    public h5 d0;
    public final y6 d1;
    public bc e0;
    public ScrollView f0;
    public CircularProgressIndicator g0;
    public LinearLayout h0;
    public CardView i0;
    public TextView j0;
    public RelativeLayout k0;
    public Spinner l0;
    public TextView m0;
    public LinearLayout n0;
    public AdEditText o0;
    public TextView p0;
    public RelativeLayout q0;
    public Spinner r0;
    public TextView s0;
    public AdEditText t0;
    public TextView u0;
    public RelativeLayout v0;
    public Spinner w0;
    public TextView x0;
    public AdEditText y0;
    public AccountAsteriskLabelledText z0;
    public boolean U0 = false;
    public boolean V0 = false;
    public boolean W0 = false;
    public final x4 e1 = new x4(this, 0);
    public final x4 f1 = new x4(this, 1);
    public final x4 g1 = new x4(this, 2);

    public AccountRegistrationFragment() {
        final int i = 0;
        this.a1 = new y6(this, new Supplier(this) { // from class: u4
            public final /* synthetic */ AccountRegistrationFragment b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i2 = i;
                AccountRegistrationFragment accountRegistrationFragment = this.b;
                switch (i2) {
                    case 0:
                        return accountRegistrationFragment.o0;
                    case 1:
                        return accountRegistrationFragment.y0;
                    case 2:
                        return accountRegistrationFragment.A0;
                    default:
                        return accountRegistrationFragment.D0;
                }
            }
        });
        final int i2 = 1;
        this.b1 = new y6(this, new Supplier(this) { // from class: u4
            public final /* synthetic */ AccountRegistrationFragment b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i3 = i2;
                AccountRegistrationFragment accountRegistrationFragment = this.b;
                switch (i3) {
                    case 0:
                        return accountRegistrationFragment.o0;
                    case 1:
                        return accountRegistrationFragment.y0;
                    case 2:
                        return accountRegistrationFragment.A0;
                    default:
                        return accountRegistrationFragment.D0;
                }
            }
        });
        final int i3 = 2;
        this.c1 = new y6(this, new Supplier(this) { // from class: u4
            public final /* synthetic */ AccountRegistrationFragment b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i4 = i3;
                AccountRegistrationFragment accountRegistrationFragment = this.b;
                switch (i4) {
                    case 0:
                        return accountRegistrationFragment.o0;
                    case 1:
                        return accountRegistrationFragment.y0;
                    case 2:
                        return accountRegistrationFragment.A0;
                    default:
                        return accountRegistrationFragment.D0;
                }
            }
        });
        final int i4 = 3;
        this.d1 = new y6(this, new Supplier(this) { // from class: u4
            public final /* synthetic */ AccountRegistrationFragment b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                int i5 = i4;
                AccountRegistrationFragment accountRegistrationFragment = this.b;
                switch (i5) {
                    case 0:
                        return accountRegistrationFragment.o0;
                    case 1:
                        return accountRegistrationFragment.y0;
                    case 2:
                        return accountRegistrationFragment.A0;
                    default:
                        return accountRegistrationFragment.D0;
                }
            }
        });
    }

    public static boolean R0(AccountRegistrationFragment accountRegistrationFragment) {
        bc bcVar = accountRegistrationFragment.e0;
        if (bcVar == null) {
            return false;
        }
        bcVar.q0(0, JniAdExt.n1("ad.account.register.passwd"), JniAdExt.n1("ad.account.register.passwd_tooltip.android"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
        return true;
    }

    public static void S0(View view) {
        if (view == null) {
            return;
        }
        view.setBackgroundResource(R.drawable.account_registration_error_border);
        if (view instanceof AdEditText) {
            ((AdEditText) view).setSeparatorVisible(false);
        }
    }

    public static t01 a1(AdEditTextSecure adEditTextSecure, boolean z) {
        if (adEditTextSecure == null) {
            return t01.e;
        }
        t01 text = adEditTextSecure.getText();
        if (!z) {
            return text;
        }
        t01 t01VarC = text.c();
        text.b();
        return t01VarC;
    }

    public static String b1(AdEditText adEditText) {
        if (adEditText == null) {
            return null;
        }
        String text = adEditText.getText();
        return text == null ? "" : text.trim();
    }

    public static void d1(Spinner spinner) {
        t70.V(new c(7, spinner));
    }

    public static void e1(v6 v6Var) {
        if (v6Var == null) {
            return;
        }
        v6Var.i(false);
    }

    public static void i1(AdEditText adEditText, String str) {
        if (adEditText == null) {
            return;
        }
        adEditText.l(str, false);
    }

    public static void j1(AdEditTextSecure adEditTextSecure, t01 t01Var) {
        if (adEditTextSecure == null || t01Var == null) {
            return;
        }
        adEditTextSecure.l(t01Var, false);
    }

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        String str;
        g5 g5VarX;
        AdCountryCode adCountryCodeJ;
        super.A0();
        JniAdExt.z1(this);
        JniAdExt.a0 = this;
        JniAdExt.r1(this);
        if (!JniAdExt.q3() && !JniAdExt.Y1()) {
            Z0();
            return;
        }
        h5 h5Var = this.d0;
        if (h5Var != null && h5Var.C()) {
            Z0();
            return;
        }
        if (X0()) {
            return;
        }
        h5 h5Var2 = this.d0;
        if (h5Var2 != null) {
            AdEditText adEditText = this.o0;
            synchronized (h5Var2) {
                str = h5Var2.q;
            }
            i1(adEditText, str);
            i1(this.t0, h5Var2.p());
            i1(this.y0, h5Var2.l());
            i1(this.A0, h5Var2.k());
            i1(this.D0, h5Var2.w());
            j1(this.G0, h5Var2.r());
            j1(this.J0, h5Var2.s());
            j1(this.L0, h5Var2.t());
            Spinner spinner = this.l0;
            if (spinner != null) {
                f9 f9VarQ = h5Var2.q();
                if (!f9VarQ.equals(f9.k) && !f9VarQ.equals(f9.l)) {
                    int i = 0;
                    while (true) {
                        List list = h1;
                        if (i >= list.size()) {
                            i = -1;
                            break;
                        } else if (((b5) list.get(i)).a.equals(f9VarQ)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    spinner.setSelection(i, false);
                }
            }
            Spinner spinner2 = this.r0;
            if (spinner2 != null && (adCountryCodeJ = h5Var2.j()) != null) {
                spinner2.setSelection(adCountryCodeJ.mIdx, false);
            }
            Spinner spinner3 = this.w0;
            if (spinner3 != null && (g5VarX = h5Var2.x()) != null) {
                spinner3.setSelection(g5VarX.ordinal(), false);
            }
        }
        k1(this.o0, EnumSet.of(f5.e), new w4(this, 1));
        k1(this.t0, EnumSet.of(f5.g, f5.h), new w4(this, 2));
        AdEditTextSecure adEditTextSecure = this.L0;
        EnumSet enumSetOf = EnumSet.of(f5.r);
        w4 w4Var = new w4(this, 3);
        if (adEditTextSecure != null && enumSetOf != null) {
            adEditTextSecure.setTextListener(new z4(this, enumSetOf, w4Var));
        }
        k1(this.y0, EnumSet.noneOf(f5.class), new w4(this, 4));
        k1(this.A0, EnumSet.of(f5.j, f5.k), new w4(this, 5));
        k1(this.D0, EnumSet.of(f5.l, f5.m), new w4(this, 6));
        AdEditTextSecure adEditTextSecure2 = this.G0;
        EnumSet enumSetOf2 = EnumSet.of(f5.n, f5.o);
        w4 w4Var2 = new w4(this, 7);
        if (adEditTextSecure2 != null && enumSetOf2 != null) {
            adEditTextSecure2.setTextListener(new z4(this, enumSetOf2, w4Var2));
        }
        AdEditTextSecure adEditTextSecure3 = this.J0;
        EnumSet enumSetOf3 = EnumSet.of(f5.p, f5.q);
        w4 w4Var3 = new w4(this, 8);
        if (adEditTextSecure3 != null && enumSetOf3 != null) {
            adEditTextSecure3.setTextListener(new z4(this, enumSetOf3, w4Var3));
        }
        Y0();
        V0();
        T0();
        c1();
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.T3(this);
        JniAdExt.a0 = null;
        JniAdExt.X3(this);
        AdEditText adEditText = this.o0;
        if (adEditText != null) {
            adEditText.setTextListener(null);
        }
        AdEditText adEditText2 = this.t0;
        if (adEditText2 != null) {
            adEditText2.setTextListener(null);
        }
        AdEditText adEditText3 = this.y0;
        if (adEditText3 != null) {
            adEditText3.setTextListener(null);
        }
        AdEditText adEditText4 = this.A0;
        if (adEditText4 != null) {
            adEditText4.setTextListener(null);
        }
        AdEditText adEditText5 = this.D0;
        if (adEditText5 != null) {
            adEditText5.setTextListener(null);
        }
        AdEditTextSecure adEditTextSecure = this.G0;
        if (adEditTextSecure != null) {
            adEditTextSecure.setTextListener(null);
        }
        AdEditTextSecure adEditTextSecure2 = this.J0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.setTextListener(null);
        }
        AdEditTextSecure adEditTextSecure3 = this.L0;
        if (adEditTextSecure3 != null) {
            adEditTextSecure3.setTextListener(null);
        }
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        String strB1 = b1(this.o0);
        if (strB1 != null) {
            synchronized (h5Var) {
                h5Var.q = strB1;
            }
        }
        String strB2 = b1(this.t0);
        if (strB2 != null) {
            h5Var.S(strB2);
        }
        String strB3 = b1(this.y0);
        if (strB3 != null) {
            h5Var.H(strB3);
        }
        String strB4 = b1(this.A0);
        if (strB4 != null) {
            h5Var.G(strB4);
        }
        String strB5 = b1(this.D0);
        if (strB5 != null) {
            h5Var.a0(strB5);
        }
        h5Var.T(a1(this.G0, true));
        h5Var.U(a1(this.J0, false));
        h5Var.V(a1(this.L0, false));
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        this.e0 = new bc(Z(), 19);
        this.f0 = (ScrollView) view.findViewById(R.id.account_registration_scroll_view);
        this.g0 = (CircularProgressIndicator) view.findViewById(R.id.account_registration_progressindicator);
        this.h0 = (LinearLayout) view.findViewById(R.id.account_registration_layout);
        this.i0 = (CardView) view.findViewById(R.id.account_registration_error_card);
        this.j0 = (TextView) view.findViewById(R.id.account_registration_error_text);
        AccountAsteriskLabelledText accountAsteriskLabelledText = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_purpose_title);
        this.k0 = (RelativeLayout) view.findViewById(R.id.account_registration_purpose_spinner_layout);
        this.l0 = (Spinner) view.findViewById(R.id.account_registration_purpose_spinner);
        this.m0 = (TextView) view.findViewById(R.id.account_registration_purpose_spinner_state);
        this.n0 = (LinearLayout) view.findViewById(R.id.account_registration_professional_use_layout);
        AccountAsteriskLabelledText accountAsteriskLabelledText2 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_company_title);
        this.o0 = (AdEditText) view.findViewById(R.id.account_registration_company_input);
        this.p0 = (TextView) view.findViewById(R.id.account_registration_company_input_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText3 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_country_title);
        this.q0 = (RelativeLayout) view.findViewById(R.id.account_registration_country_spinner_layout);
        this.r0 = (Spinner) view.findViewById(R.id.account_registration_country_spinner);
        this.s0 = (TextView) view.findViewById(R.id.account_registration_country_spinner_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText4 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_phone_title);
        this.t0 = (AdEditText) view.findViewById(R.id.account_registration_phone_input);
        this.u0 = (TextView) view.findViewById(R.id.account_registration_phone_input_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText5 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_usercount_title);
        this.v0 = (RelativeLayout) view.findViewById(R.id.account_registration_usercount_spinner_layout);
        this.w0 = (Spinner) view.findViewById(R.id.account_registration_usercount_spinner);
        this.x0 = (TextView) view.findViewById(R.id.account_registration_usercount_spinner_state);
        TextView textView = (TextView) view.findViewById(R.id.account_registration_job_title);
        this.y0 = (AdEditText) view.findViewById(R.id.account_registration_job_input);
        this.z0 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_first_name_title);
        this.A0 = (AdEditText) view.findViewById(R.id.account_registration_first_name_input);
        this.B0 = (TextView) view.findViewById(R.id.account_registration_first_name_input_state);
        this.C0 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_surname_title);
        this.D0 = (AdEditText) view.findViewById(R.id.account_registration_surname_input);
        this.E0 = (TextView) view.findViewById(R.id.account_registration_surname_input_state);
        this.F0 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_email_title);
        this.G0 = (AdEditTextSecure) view.findViewById(R.id.account_registration_email_input);
        this.H0 = (TextView) view.findViewById(R.id.account_registration_email_input_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText6 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_password_title);
        this.I0 = (ImageView) view.findViewById(R.id.account_registration_password_info);
        this.J0 = (AdEditTextSecure) view.findViewById(R.id.account_registration_password_input);
        this.K0 = (TextView) view.findViewById(R.id.account_registration_password_input_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText7 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_password_repeat_title);
        this.L0 = (AdEditTextSecure) view.findViewById(R.id.account_registration_password_repeat_input);
        this.M0 = (TextView) view.findViewById(R.id.account_registration_password_repeat_input_state);
        AccountAsteriskLabelledText accountAsteriskLabelledText8 = (AccountAsteriskLabelledText) view.findViewById(R.id.account_registration_required_field_hint);
        TextView textView2 = (TextView) view.findViewById(R.id.account_registration_unsubscribe_hint);
        this.N0 = (CheckBox) view.findViewById(R.id.account_registration_newsletter_checkbox);
        TextView textView3 = (TextView) view.findViewById(R.id.account_registration_newsletter_checkbox_description);
        this.P0 = (TextView) view.findViewById(R.id.account_registration_privacy_hint);
        this.O0 = (ViewGroup) view.findViewById(R.id.account_registration_tos_checkbox_layout);
        this.Q0 = (CheckBox) view.findViewById(R.id.account_registration_tos_checkbox);
        this.R0 = (TightTextView) view.findViewById(R.id.account_registration_tos_checkbox_description);
        this.S0 = (TextView) view.findViewById(R.id.account_registration_tos_checkbox_state);
        this.T0 = (Button) view.findViewById(R.id.account_registration_register_btn);
        accountAsteriskLabelledText.setText(BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.register.purpose")));
        accountAsteriskLabelledText2.setText(JniAdExt.n1("ad.account.register.company"));
        accountAsteriskLabelledText3.setText(JniAdExt.n1("ad.account.register.country"));
        accountAsteriskLabelledText4.setText(JniAdExt.n1("ad.account.register.phone"));
        accountAsteriskLabelledText5.setText(JniAdExt.n1("ad.account.register.number_users"));
        textView.setText(JniAdExt.n1("ad.account.register.job"));
        this.z0.setText(JniAdExt.n1("ad.account.first_name"));
        this.C0.setText(JniAdExt.n1("ad.account.surname"));
        this.F0.setText(JniAdExt.n1("ad.account.email"));
        accountAsteriskLabelledText6.setText(JniAdExt.n1("ad.account.register.passwd"));
        accountAsteriskLabelledText7.setText(JniAdExt.n1("ad.account.register.passwd_repeat"));
        accountAsteriskLabelledText8.setText(JniAdExt.n1("ad.account.register.required_field"));
        textView2.setText(BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.register.unsubscribe")));
        textView3.setText(BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.register.newsletter")));
        h1();
        l1();
        this.T0.setText(JniAdExt.n1("ad.account.register.register"));
        this.I0.setOnClickListener(new v4(this, 1));
        int i = 2;
        this.I0.setOnLongClickListener(new s0(i, this));
        this.T0.setOnClickListener(new v4(this, i));
        accountAsteriskLabelledText8.setLayoutDirection(!f0().getBoolean(R.bool.is_rtl) ? 1 : 0);
        this.Q0.setOnClickListener(new v4(this, 0));
        this.l0.setAdapter((SpinnerAdapter) this.X0);
        this.l0.setOnItemSelectedListener(this.e1);
        this.r0.setAdapter((SpinnerAdapter) this.Y0);
        this.r0.setOnItemSelectedListener(this.f1);
        this.w0.setAdapter((SpinnerAdapter) this.Z0);
        this.w0.setOnItemSelectedListener(this.g1);
        this.o0.setFilter("[\r\n\t]");
        this.a1.g();
        this.t0.setFilter("[\r\n\t]");
        this.y0.setFilter("[\r\n\t]");
        this.b1.g();
        this.A0.setFilter("[\r\n\t]");
        this.c1.g();
        this.D0.setFilter("[\r\n\t]");
        this.d1.g();
        this.G0.setFilter("[\r\n\t]");
        this.J0.setFilter("[\r\n\t]");
        this.L0.setFilter("[\r\n\t]");
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        this.F = true;
        if (Build.VERSION.SDK_INT <= 23) {
            h1();
            l1();
        }
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new t4(this, 2));
    }

    @Override // defpackage.xc0
    public final void J() {
    }

    @Override // defpackage.xc0
    public final void L() {
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final boolean T0() {
        EnumSet<e5> enumSet;
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return false;
        }
        StringJoiner stringJoiner = new StringJoiner("\n");
        synchronized (h5Var) {
            enumSet = h5Var.o;
        }
        for (e5 e5Var : enumSet) {
            if (e5Var == e5.e) {
                S0(this.G0);
            } else if (e5Var == e5.g) {
                S0(this.J0);
            }
            String str = e5Var.c;
            if (!TextUtils.isEmpty(str)) {
                stringJoiner.add(BidiFormatter.getInstance().unicodeWrap(str));
            }
        }
        String string = stringJoiner.toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean z = !zIsEmpty;
        r3.F(this.j0, string);
        r3.I(this.i0, zIsEmpty ? 8 : 0);
        return z;
    }

    public final boolean U0(f5 f5Var) {
        TextView textView;
        View view;
        h5 h5Var = this.d0;
        if (h5Var != null) {
            boolean z = h5Var.z(f5Var);
            switch (f5Var.ordinal()) {
                case 0:
                    textView = this.m0;
                    view = this.k0;
                    break;
                case 1:
                    textView = this.p0;
                    view = this.o0;
                    break;
                case 2:
                    textView = this.s0;
                    view = this.q0;
                    break;
                case 3:
                case 4:
                    textView = this.u0;
                    view = this.t0;
                    break;
                case 5:
                    textView = this.x0;
                    view = this.v0;
                    break;
                case 6:
                case 7:
                    textView = this.B0;
                    view = this.A0;
                    break;
                case 8:
                case 9:
                    textView = this.E0;
                    view = this.D0;
                    break;
                case 10:
                case 11:
                    textView = this.H0;
                    view = this.G0;
                    break;
                case 12:
                case 13:
                    textView = this.K0;
                    view = this.J0;
                    break;
                case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    textView = this.M0;
                    view = this.L0;
                    break;
                case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    TightTextView tightTextView = this.R0;
                    Context contextA0 = a0();
                    int i = z ? R.color.colorPrimary : R.color.colorAccountTextPrimary;
                    Looper looper = t70.a;
                    r3.G(tightTextView, uj.l(contextA0, i));
                    TightTextView tightTextView2 = this.R0;
                    ColorStateList colorStateListM = uj.m(a0(), z ? R.color.account_registration_clickable_text_error_color : R.color.account_registration_clickable_text_color);
                    if (tightTextView2 != null) {
                        tightTextView2.setLinkTextColor(colorStateListM);
                    }
                    textView = this.S0;
                    view = this.O0;
                    break;
                default:
                    textView = null;
                    view = null;
                    break;
            }
            if (z) {
                r3.F(textView, BidiFormatter.getInstance().unicodeWrap(f5Var.c));
                r3.I(textView, 0);
                S0(view);
                return true;
            }
            r3.I(textView, 8);
            if (view != null) {
                view.setBackground(null);
                view.setPadding(0, 0, 0, 0);
                if (view instanceof AdEditText) {
                    ((AdEditText) view).setSeparatorVisible(true);
                }
            }
        }
        return false;
    }

    public final void V0() {
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        if (h5Var.A()) {
            r3.B(this.N0, false);
        }
        U0(f5.d);
        U0(f5.e);
        U0(f5.f);
        U0(f5.i);
        U0(f5.s);
        if (!U0(f5.g)) {
            U0(f5.h);
        }
        if (!U0(f5.j)) {
            U0(f5.k);
        }
        if (!U0(f5.l)) {
            U0(f5.m);
        }
        if (!U0(f5.n)) {
            U0(f5.o);
        }
        if (U0(f5.p) || U0(f5.q)) {
            return;
        }
        U0(f5.r);
    }

    public final boolean W0(f9 f9Var, String str, AdCountryCode adCountryCode, String str2, g5 g5Var, String str3, String str4, t01 t01Var, t01 t01Var2, t01 t01Var3, boolean z) {
        h5 h5Var = this.d0;
        boolean z2 = false;
        if (h5Var == null) {
            return false;
        }
        if (f9Var.equals(f9.d)) {
            h5Var.b(f5.d);
        } else if ((f9Var.c & 60) != 0) {
            if (TextUtils.isEmpty(str)) {
                h5Var.b(f5.e);
            }
            if (adCountryCode == null || adCountryCode.mIdx <= 0 || TextUtils.isEmpty(adCountryCode.mCode)) {
                h5Var.b(f5.f);
            }
            if (TextUtils.isEmpty(str2)) {
                h5Var.b(f5.g);
            } else {
                if (!((!TextUtils.isEmpty(str2) && str2.length() >= 8 && str2.length() <= 20) ? Patterns.PHONE.matcher(str2).matches() : false)) {
                    h5Var.b(f5.h);
                }
            }
            if (g5Var == null || g5Var == g5.NONE) {
                h5Var.b(f5.i);
            }
            if (TextUtils.isEmpty(str3)) {
                h5Var.b(f5.j);
            }
            if (TextUtils.isEmpty(str4)) {
                h5Var.b(f5.l);
            }
        }
        if ((str3 == null || str3.isEmpty()) ? false : str3.matches(".*\\d.*")) {
            h5Var.b(f5.k);
        }
        if ((str4 == null || str4.isEmpty()) ? false : str4.matches(".*\\d.*")) {
            h5Var.b(f5.m);
        }
        if (t01Var.isEmpty()) {
            h5Var.b(f5.n);
        } else if (!t70.J(t01Var.c, false)) {
            h5Var.b(f5.o);
        }
        if (!z) {
            h5Var.b(f5.s);
        }
        if (t01Var2.isEmpty()) {
            h5Var.b(f5.p);
        } else if (t01Var2.equals(t01Var)) {
            h5Var.b(f5.q);
        } else if (!t01Var2.equals(t01Var3)) {
            h5Var.b(f5.r);
        }
        EnumSet enumSetComplementOf = EnumSet.complementOf(EnumSet.of(f5.p, f5.q, f5.r));
        synchronized (h5Var) {
            EnumSet enumSet = h5Var.n;
            if (enumSet != null && enumSetComplementOf != null) {
                z2 = !Collections.disjoint(enumSet, enumSetComplementOf);
            }
        }
        if (z2) {
            h5Var.a(e5.d);
        }
        return !h5Var.A();
    }

    public final boolean X0() {
        boolean z;
        if (JniAdExt.D1().mStatus != g9.as_verification_pending) {
            return false;
        }
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return true;
        }
        synchronized (h5Var) {
            z = h5Var.A;
        }
        if (!z) {
            return true;
        }
        Z0();
        t70.V(new i7(9));
        return true;
    }

    public final void Y0() {
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        boolean z = (h5Var.q().c & 60) != 0;
        AccountAsteriskLabelledText accountAsteriskLabelledText = this.z0;
        AccountAsteriskLabelledText accountAsteriskLabelledText2 = this.C0;
        AccountAsteriskLabelledText accountAsteriskLabelledText3 = this.F0;
        if (z) {
            if (accountAsteriskLabelledText != null) {
                r3.I(accountAsteriskLabelledText.e, 0);
            }
            if (accountAsteriskLabelledText2 != null) {
                r3.I(accountAsteriskLabelledText2.e, 0);
            }
            if (accountAsteriskLabelledText3 != null) {
                accountAsteriskLabelledText3.setText(JniAdExt.n1("ad.account.register.business_email"));
            }
        } else {
            if (accountAsteriskLabelledText != null) {
                r3.I(accountAsteriskLabelledText.e, 8);
            }
            if (accountAsteriskLabelledText2 != null) {
                r3.I(accountAsteriskLabelledText2.e, 8);
            }
            if (accountAsteriskLabelledText3 != null) {
                accountAsteriskLabelledText3.setText(JniAdExt.n1("ad.account.email"));
            }
        }
        r3.I(this.n0, z ? 0 : 8);
    }

    public final synchronized void Z0() {
        if (!f1()) {
            uj.x(Y());
        }
    }

    public final void c1() {
        boolean z;
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        synchronized (h5Var) {
            z = h5Var.A;
        }
        boolean z2 = !z;
        r3.C(this.T0, z2);
        r3.C(this.l0, z2);
        r3.C(this.o0, z2);
        r3.C(this.r0, z2);
        r3.C(this.t0, z2);
        r3.C(this.w0, z2);
        r3.C(this.y0, z2);
        r3.C(this.A0, z2);
        r3.C(this.D0, z2);
        r3.C(this.G0, z2);
        r3.C(this.I0, z2);
        r3.C(this.J0, z2);
        r3.C(this.L0, z2);
        r3.C(this.N0, z2);
        r3.C(this.Q0, z2);
        r3.C(this.R0, z2);
        r3.I(this.g0, z ? 0 : 8);
        r3.A(this.h0, z ? 0.5f : 1.0f);
    }

    public final synchronized boolean f1() {
        boolean z;
        z = this.b0;
        this.b0 = true;
        return z;
    }

    public final void g1() {
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        if (h5Var.z(f5.d)) {
            d1(this.l0);
            return;
        }
        if (h5Var.z(f5.e)) {
            e1(this.o0);
            return;
        }
        if (h5Var.z(f5.f)) {
            d1(this.r0);
            return;
        }
        if (h5Var.z(f5.g) || h5Var.z(f5.h)) {
            e1(this.t0);
            return;
        }
        if (h5Var.z(f5.i)) {
            d1(this.w0);
            return;
        }
        if (h5Var.z(f5.j) || h5Var.z(f5.k)) {
            e1(this.A0);
            return;
        }
        if (h5Var.z(f5.l) || h5Var.z(f5.m)) {
            e1(this.D0);
            return;
        }
        if (h5Var.z(f5.n) || h5Var.z(f5.o)) {
            e1(this.G0);
            return;
        }
        if (h5Var.z(f5.p) || h5Var.z(f5.q)) {
            e1(this.J0);
            return;
        }
        if (h5Var.z(f5.r)) {
            e1(this.L0);
            return;
        }
        int i = 8;
        if (h5Var.z(f5.s)) {
            t70.V(new c(i, this.Q0));
            return;
        }
        h5 h5Var2 = this.d0;
        if (h5Var2 == null) {
            return;
        }
        f9 f9VarQ = h5Var2.q();
        if (f9VarQ.equals(f9.d)) {
            d1(this.l0);
            return;
        }
        if ((f9VarQ.c & 60) != 0) {
            String strB1 = b1(this.o0);
            if (strB1 != null && strB1.isEmpty()) {
                e1(this.o0);
                return;
            }
            AdCountryCode adCountryCodeJ = h5Var2.j();
            if (adCountryCodeJ == null || adCountryCodeJ.mIdx <= 0 || TextUtils.isEmpty(adCountryCodeJ.mCode)) {
                d1(this.r0);
                return;
            }
            String strB2 = b1(this.t0);
            if (strB2 != null && strB2.isEmpty()) {
                e1(this.t0);
                return;
            }
            g5 g5VarX = h5Var2.x();
            if (g5VarX == null || g5VarX == g5.NONE) {
                d1(this.w0);
                return;
            }
            String strB3 = b1(this.y0);
            if (strB3 != null && strB3.isEmpty()) {
                e1(this.y0);
                return;
            }
        }
        String strB4 = b1(this.A0);
        if (strB4 != null && strB4.isEmpty()) {
            e1(this.A0);
            return;
        }
        String strB5 = b1(this.D0);
        if (strB5 != null && strB5.isEmpty()) {
            e1(this.D0);
            return;
        }
        t01 t01VarA1 = a1(this.G0, true);
        boolean zIsEmpty = t01VarA1.isEmpty();
        t01VarA1.b();
        if (zIsEmpty) {
            e1(this.G0);
            return;
        }
        t01 t01VarA2 = a1(this.J0, true);
        boolean zIsEmpty2 = t01VarA2.isEmpty();
        t01VarA2.b();
        if (zIsEmpty2) {
            e1(this.J0);
            return;
        }
        t01 t01VarA3 = a1(this.L0, true);
        boolean zIsEmpty3 = t01VarA3.isEmpty();
        t01VarA3.b();
        if (zIsEmpty3) {
            e1(this.L0);
            return;
        }
        CheckBox checkBox = this.N0;
        if (checkBox == null || !checkBox.isChecked()) {
            t70.V(new c(i, this.N0));
        } else {
            t70.V(new c(i, this.Q0));
        }
    }

    public final void h1() {
        TextView textView = this.P0;
        String strN1 = JniAdExt.n1("ad.account.register.privacy_data_format");
        String strN2 = JniAdExt.n1("ad.account.register.privacy_policy");
        t4 t4Var = new t4(this, 3);
        Pattern pattern = u51.a;
        textView.setText(u51.a(strN1, new SpannableStringBuilder().append(strN2, new t51(t4Var), 33)));
        this.P0.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.P0;
        Context contextA0 = a0();
        Looper looper = t70.a;
        textView2.setHighlightColor(uj.l(contextA0, R.color.colorTransparent));
    }

    public final void k1(AdEditText adEditText, EnumSet enumSet, Runnable runnable) {
        if (adEditText == null || enumSet == null) {
            return;
        }
        adEditText.setTextListener(new z4(this, enumSet, runnable));
    }

    public final void l1() {
        TightTextView tightTextView = this.R0;
        String strN1 = JniAdExt.n1("ad.account.register.i_agree_with");
        String strN2 = JniAdExt.n1("ad.account.register.tos");
        t4 t4Var = new t4(this, 0);
        Pattern pattern = u51.a;
        tightTextView.setText(u51.a("%s %s", strN1, new SpannableStringBuilder().append(strN2, new t51(t4Var), 33)));
        this.R0.setMovementMethod(LinkMovementMethod.getInstance());
        TightTextView tightTextView2 = this.R0;
        Context contextA0 = a0();
        Looper looper = t70.a;
        tightTextView2.setHighlightColor(uj.l(contextA0, R.color.colorTransparent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z6, defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.c0 = (m80) context;
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.d0 = MainApplication.v().w;
        this.X0 = new y4(I0(), 0, h1, 0);
        ArrayList arrayList = new ArrayList(Arrays.asList(JniAdExt.e2()));
        AdCountryCode adCountryCode = new AdCountryCode(0, "", JniAdExt.n1("ad.account.register.select"));
        arrayList.add(adCountryCode.mIdx, adCountryCode);
        this.Y0 = new y4(I0(), 0, arrayList, 1);
        this.Z0 = new y4(I0(), 0, Arrays.asList(g5.values()), 2);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b0 = false;
        G0().setTitle(JniAdExt.n1("ad.account.register.register"));
        return layoutInflater.inflate(R.layout.fragment_account_registration, viewGroup, false);
    }

    @Override // defpackage.xc0
    public final void s() {
        t70.Y(new t4(this, 1));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = null;
        this.d0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        f1();
        bc bcVar = this.e0;
        if (bcVar != null) {
            bcVar.e = null;
            this.e0 = null;
        }
        AdEditText adEditText = this.o0;
        if (adEditText != null) {
            adEditText.b();
            this.o0 = null;
        }
        AdEditText adEditText2 = this.t0;
        if (adEditText2 != null) {
            adEditText2.b();
            this.t0 = null;
        }
        AdEditText adEditText3 = this.y0;
        if (adEditText3 != null) {
            adEditText3.b();
            this.y0 = null;
        }
        AccountAsteriskLabelledText accountAsteriskLabelledText = this.z0;
        if (accountAsteriskLabelledText != null) {
            accountAsteriskLabelledText.d = null;
            accountAsteriskLabelledText.e = null;
            this.z0 = null;
        }
        AdEditText adEditText4 = this.A0;
        if (adEditText4 != null) {
            adEditText4.b();
            this.A0 = null;
        }
        AccountAsteriskLabelledText accountAsteriskLabelledText2 = this.C0;
        if (accountAsteriskLabelledText2 != null) {
            accountAsteriskLabelledText2.d = null;
            accountAsteriskLabelledText2.e = null;
            this.C0 = null;
        }
        AdEditText adEditText5 = this.D0;
        if (adEditText5 != null) {
            adEditText5.b();
            this.D0 = null;
        }
        AccountAsteriskLabelledText accountAsteriskLabelledText3 = this.F0;
        if (accountAsteriskLabelledText3 != null) {
            accountAsteriskLabelledText3.d = null;
            accountAsteriskLabelledText3.e = null;
            this.F0 = null;
        }
        AdEditTextSecure adEditTextSecure = this.G0;
        if (adEditTextSecure != null) {
            adEditTextSecure.b();
            this.G0 = null;
        }
        AdEditTextSecure adEditTextSecure2 = this.J0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.b();
            this.J0 = null;
        }
        AdEditTextSecure adEditTextSecure3 = this.L0;
        if (adEditTextSecure3 != null) {
            adEditTextSecure3.b();
            this.L0 = null;
        }
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.H0 = null;
        this.I0 = null;
        this.B0 = null;
        this.E0 = null;
        this.K0 = null;
        this.M0 = null;
        this.N0 = null;
        this.P0 = null;
        this.O0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.T0 = null;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void u0() {
        super.u0();
        this.c0 = null;
    }

    @Override // defpackage.n80
    public final boolean x() {
        i1(this.o0, "");
        i1(this.t0, "");
        i1(this.y0, "");
        i1(this.A0, "");
        i1(this.D0, "");
        AdEditTextSecure adEditTextSecure = this.G0;
        t01 t01Var = t01.e;
        j1(adEditTextSecure, t01Var);
        j1(this.J0, t01Var);
        j1(this.L0, t01Var);
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return false;
        }
        h5Var.e();
        return false;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        super.y0();
        h5 h5Var = this.d0;
        if (h5Var == null) {
            return;
        }
        if (h5Var.y(e5.e)) {
            e1(this.G0);
        } else if (h5Var.y(e5.g)) {
            e1(this.J0);
        } else {
            g1();
        }
    }
}
