package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class z31 extends yt implements ng0 {
    public final q4 A0 = new q4(this, 14);
    public y31 q0;
    public a41 r0;
    public int s0;
    public gq0 t0;
    public int u0;
    public TextView v0;
    public ListenerScrollView w0;
    public View x0;
    public View y0;
    public View z0;

    public static z31 V0(a41 a41Var, int i) {
        z31 z31Var = new z31();
        Bundle bundle = new Bundle();
        bundle.putSerializable("skey_type", a41Var);
        bundle.putInt("skey_id", i);
        z31Var.N0(bundle);
        return z31Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c0  */
    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.u0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarG0 = G0();
        String strN1 = null;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_setup_info, (ViewGroup) null);
        if (viewInflate != null) {
            this.v0 = (TextView) viewInflate.findViewById(R.id.setup_info_dialog_message);
            this.w0 = (ListenerScrollView) viewInflate.findViewById(R.id.setup_info_dialog_scroll_view);
            this.x0 = viewInflate.findViewById(R.id.setup_info_dialog_content);
            this.y0 = viewInflate.findViewById(R.id.setup_info_dialog_scroll_hint_top);
            this.z0 = viewInflate.findViewById(R.id.setup_info_dialog_scroll_hint_bottom);
            W0();
            this.v0.setMovementMethod(new LinkMovementMethod());
            this.w0.setListener(this);
            this.x0.addOnLayoutChangeListener(this.A0);
        }
        v7 v7Var = new v7(qaVarG0);
        String strT0 = T0();
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strT0;
        r7Var.q = viewInflate;
        int iOrdinal = this.r0.ordinal();
        String strN2 = (iOrdinal == 8 || iOrdinal == 9 || (iOrdinal != 15 && iOrdinal == 16)) ? JniAdExt.n1("ad.dlg.agree") : JniAdExt.n1("ad.dlg.ok");
        v7Var.d(strN2, new x31(this, 0));
        int iOrdinal2 = this.r0.ordinal();
        if (iOrdinal2 != 16) {
            if (iOrdinal2 != 17) {
                switch (iOrdinal2) {
                    case 8:
                    case 9:
                        strN1 = JniAdExt.n1("ad.dlg.skip");
                        break;
                    case 10:
                        break;
                    default:
                        strN1 = JniAdExt.n1("ad.dlg.cancel");
                        break;
                }
            }
        } else {
            strN1 = JniAdExt.n1("ad.dlg.skip");
        }
        if (!TextUtils.isEmpty(strN1)) {
            v7Var.b(strN1, new x31(this, 1));
        }
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void S0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.y0, scrollY < this.u0 ? 4 : 0);
        r3.I(this.z0, bottom < this.u0 ? 4 : 0);
    }

    public final String T0() {
        String strN1 = JniAdExt.n1("ad.setup.dlg.title.app");
        String strN2 = JniAdExt.n1("ad.setup.dlg.title.plugin");
        switch (this.r0.ordinal()) {
            case 0:
                return String.format(strN1, JniAdExt.n1("ad.setup.notifications.title"));
            case 1:
                return String.format(strN1, JniAdExt.n1("ad.setup.notifications.background.title"));
            case 2:
                return String.format(strN1, JniAdExt.n1("ad.setup.notifications.headsup.title"));
            case 3:
                return String.format(strN1, JniAdExt.n1("ad.setup.notifications.chat.title"));
            case 4:
                return String.format(strN1, JniAdExt.n1("ad.setup.file_access.title"));
            case 5:
                return String.format(strN1, JniAdExt.n1("ad.setup.local_network.title"));
            case 6:
                return String.format(strN1, JniAdExt.n1("ad.setup.battery_opt.title"));
            case 7:
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return JniAdExt.n1("ad.menu.install.android.title");
            case 8:
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return JniAdExt.n1("ad.menu.activate_plugin.consent.query_all_packages.android.title");
            case 9:
                return JniAdExt.n1("ad.menu.activate_plugin.android.title");
            case 10:
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                Boolean boolU0 = U0(this.r0);
                if (boolU0 == null) {
                    return null;
                }
                return boolU0.booleanValue() ? JniAdExt.n1("ad.menu.update.android.is_up_to_date") : JniAdExt.n1("ad.menu.update.android.title");
            case 11:
            case 12:
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
            default:
                return null;
            case 13:
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return String.format(strN2, JniAdExt.n1("ad.setup.battery_opt.title"));
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return JniAdExt.n1("ad.setup.plugin.generic.nonpersonalprofile.title");
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return String.format(strN1, JniAdExt.n1("ad.setup.overlay.title"));
            case 21:
                return String.format(strN1, JniAdExt.n1("ad.setup.microphone.title"));
        }
    }

    public final Boolean U0(a41 a41Var) {
        int iOrdinal = a41Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return nd0.r(G0(), this.t0, a41Var);
            }
            if (iOrdinal != 4 && iOrdinal != 5) {
                switch (iOrdinal) {
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                    case 21:
                        break;
                    default:
                        return nd0.q(a41Var);
                }
            }
        }
        return nd0.s(G0(), a41Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146 A[PHI: r18
  0x0146: PHI (r18v10 char) = (r18v6 char), (r18v11 char), (r18v11 char) binds: [B:66:0x01d1, B:39:0x0144, B:42:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void W0() {
        char c;
        CharSequence charSequenceN1;
        TextPaint paint;
        CharSequence charSequenceN2;
        Boolean boolU0 = U0(this.r0);
        TextView textView = this.v0;
        boolean z = boolU0 == null || boolU0.booleanValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k11 k11VarA = tq.a();
        j11 j11VarB = tq.b(G0().getApplicationContext().getPackageManager());
        MainApplication mainApplicationV = MainApplication.v();
        String strN1 = null;
        switch (this.r0.ordinal()) {
            case 0:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.notifications");
                break;
            case 1:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.notifications.background");
                break;
            case 2:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.notifications.headsup");
                break;
            case 3:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.notifications.chat");
                break;
            case 4:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.file_access");
                break;
            case 5:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.local_network");
                break;
            case 6:
            case 13:
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                c = 0;
                Boolean boolU1 = U0(this.r0);
                if (boolU1 != null) {
                    charSequenceN1 = !boolU1.booleanValue() ? JniAdExt.n1("ad.menu.battery_opt_settings.android.msg") : JniAdExt.n1("ad.menu.battery_opt_settings.android.msg.short");
                } else {
                    charSequenceN1 = null;
                }
                break;
            case 7:
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                c = 0;
                String strN2 = mainApplicationV.S.q() == null ? JniAdExt.n1("ad.menu.install.android.msg.second") : JniAdExt.n1("ad.menu.install.android.msg.main");
                charSequenceN1 = this.r0 != a41.j ? String.format(strN2, j11VarB != null ? j11VarB.a() : "") : String.format(strN2, k11VarA != null ? k11VarA.a() : "");
                break;
            case 8:
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.menu.activate_plugin.consent.query_all_packages.android.msg");
                break;
            case 9:
                c = 0;
                charSequenceN1 = JniAdExt.n1("ad.menu.activate_plugin.android.msg");
                break;
            case 10:
                c = 0;
                Boolean boolU2 = U0(this.r0);
                if (boolU2 == null || boolU2.booleanValue()) {
                    charSequenceN1 = null;
                } else {
                    charSequenceN1 = String.format(JniAdExt.n1("ad.menu.update.android.msg"), k11VarA != null ? k11VarA.a() : "");
                }
                break;
            case 11:
            case 12:
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
            default:
                charSequenceN1 = null;
                c = 0;
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                TextView textView2 = this.v0;
                if (textView2 == null || (paint = textView2.getPaint()) == null) {
                    charSequenceN1 = null;
                    c = 0;
                } else {
                    fj0 fj0Var = new fj0(paint, f0().getBoolean(R.bool.is_rtl));
                    c = 0;
                    charSequenceN1 = u51.a(JniAdExt.n1("ad.setup.dlg.msg.plugin.profile"), u51.b(fj0Var, JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.install"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.activate"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.open_nonpersonal"), u51.a(JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.menu"), "Choose Plugin"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.select_personal"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.accept")), u51.b(fj0Var, JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.open_personal"), u51.a(JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.menu"), "Choose Plugin"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.select_nonpersonal"), JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.accept")));
                }
                break;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                Boolean boolU3 = U0(this.r0);
                charSequenceN1 = (boolU3 == null || boolU3.booleanValue()) ? null : String.format(JniAdExt.n1("ad.menu.update.android.msg"), j11VarB != null ? j11VarB.a() : "");
                c = 0;
                break;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                Looper looper = t70.a;
                charSequenceN1 = (Build.VERSION.SDK_INT < 29 || !JniAdExt.g2(io.KEY_FEATURE_UNATTENDED)) ? JniAdExt.n1("ad.setup.dlg.msg.overlay") : JniAdExt.n1("ad.setup.dlg.msg.overlay.uaccess");
                c = 0;
                break;
            case 21:
                charSequenceN1 = JniAdExt.n1("ad.setup.dlg.msg.microphone");
                c = 0;
                break;
        }
        int iOrdinal = this.r0.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            charSequenceN2 = JniAdExt.n1("ad.setup.dlg.msg.suffix.settings");
        } else if (iOrdinal == 7) {
            charSequenceN2 = JniAdExt.n1("ad.menu.install.android.msg.suffix");
        } else if (iOrdinal == 14) {
            String strN3 = JniAdExt.n1("ad.setup.dlg.msg.plugin.profile.suffix");
            CharSequence[] charSequenceArr = new CharSequence[1];
            charSequenceArr[c] = JniAdExt.n1("ad.dlg.ok");
            charSequenceN2 = u51.a(strN3, charSequenceArr);
        } else if (iOrdinal == 15) {
            charSequenceN2 = JniAdExt.n1("ad.menu.install.android.msg.suffix");
        } else if (iOrdinal == 20 || iOrdinal == 21) {
            charSequenceN2 = JniAdExt.n1("ad.setup.dlg.msg.suffix.settings");
        } else {
            charSequenceN2 = null;
        }
        int iOrdinal2 = this.r0.ordinal();
        if (iOrdinal2 == 6 || iOrdinal2 == 19 || iOrdinal2 == 13) {
            strN1 = JniAdExt.n1("ad.menu.battery_opt_settings.android.information");
        } else if (iOrdinal2 == 14) {
            strN1 = JniAdExt.n1("ad.setup.dlg.msg.more_information");
        }
        String str = strN1;
        if (!TextUtils.isEmpty(charSequenceN1)) {
            if (charSequenceN1 instanceof String) {
                charSequenceN1 = lg.c().e((String) charSequenceN1);
            }
            spannableStringBuilder.append(charSequenceN1);
        }
        if (!z && !TextUtils.isEmpty(charSequenceN2)) {
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "\n\n");
            if (charSequenceN2 instanceof String) {
                charSequenceN2 = lg.c().e((String) charSequenceN2);
            }
            spannableStringBuilderAppend.append(charSequenceN2);
        }
        if (!TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilder.append((CharSequence) "\n\n");
            l lVar = new l(17, this);
            Pattern pattern = u51.a;
            spannableStringBuilderAppend2.append((CharSequence) new SpannableStringBuilder().append(str, new t51(lVar), 33));
        }
        r3.F(textView, spannableStringBuilder);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        S0(listenerScrollView);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (y31) J0();
        this.t0 = new gq0(a0());
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = (a41) t70.A(bundle, "skey_type", a41.class);
        this.s0 = bundle.getInt("skey_id");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        gq0 gq0Var = this.t0;
        if (gq0Var != null) {
            gq0Var.b();
            this.t0 = null;
        }
        this.w0.setListener(null);
        this.x0.removeOnLayoutChangeListener(this.A0);
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.q0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        boolean zBooleanValue = true;
        this.F = true;
        Dialog dialog = this.k0;
        if (dialog == null) {
            return;
        }
        Boolean boolU0 = U0(this.r0);
        if (boolU0 != null) {
            int iOrdinal = this.r0.ordinal();
            zBooleanValue = (iOrdinal == 7 || iOrdinal == 8 || iOrdinal == 9 || iOrdinal == 15 || iOrdinal == 16) ? boolU0.booleanValue() : false;
        }
        if (zBooleanValue) {
            dialog.dismiss();
        } else {
            dialog.setTitle(T0());
            W0();
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putSerializable("skey_type", this.r0);
        bundle.putInt("skey_type", this.s0);
    }
}
