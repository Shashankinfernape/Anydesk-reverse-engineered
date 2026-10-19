package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i91 extends yt implements ng0 {
    public String A0;
    public int B0;
    public boolean C0;
    public ArrayList D0;
    public ArrayAdapter E0;
    public int F0;
    public int G0;
    public final xt0 H0 = new xt0(18, this);
    public final q4 I0 = new q4(this, 15);
    public ListenerScrollView q0;
    public View r0;
    public AdEditText s0;
    public RadioGroup t0;
    public RadioButton u0;
    public RadioButton v0;
    public Spinner w0;
    public View x0;
    public View y0;
    public boolean z0;

    public static void S0(i91 i91Var) {
        RadioButton radioButton;
        AdEditText adEditText = i91Var.s0;
        if (adEditText == null || (radioButton = i91Var.u0) == null) {
            return;
        }
        JniAdExt.I0.post(new ab0(!radioButton.isChecked() ? adEditText.getText() : "", i91Var.C0, 3));
    }

    public static i91 U0(String str, int i, ArrayList arrayList) {
        i91 i91Var = new i91();
        Bundle bundle = new Bundle();
        bundle.putBoolean("skey_term_connect_to_console", str.length() == 0);
        bundle.putInt("skey_term_error", i);
        bundle.putString("skey_term_user", str);
        boolean zIsEmpty = arrayList.isEmpty();
        bundle.putBoolean("skey_term_list_loggedin_users", !zIsEmpty);
        if (!zIsEmpty) {
            if (TextUtils.isEmpty(str)) {
                str = JniAdExt.n1("ad.dlg.terminal.other_user");
            }
            arrayList.add(0, str);
        }
        bundle.putStringArrayList("skey_term_loggedin_users_names", arrayList);
        bundle.putInt("skey_adapter_pos", 0);
        i91Var.N0(bundle);
        return i91Var;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        int i;
        String strN1;
        this.G0 = (int) q51.h(25.0f, 160.0f);
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN2 = JniAdExt.n1("ad.dlg.terminal.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN2;
        r7Var.c = R.drawable.ic_dialog_connecting;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_terminal, (ViewGroup) null);
        this.q0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_terminal_scroll_view);
        this.r0 = viewInflate.findViewById(R.id.dialog_terminal_layout);
        this.s0 = (AdEditText) viewInflate.findViewById(R.id.dialog_terminal_user);
        this.t0 = (RadioGroup) viewInflate.findViewById(R.id.dialog_terminal_radio_group);
        this.u0 = (RadioButton) viewInflate.findViewById(R.id.dialog_terminal_radio_button_console);
        this.v0 = (RadioButton) viewInflate.findViewById(R.id.dialog_terminal_radio_button_user);
        this.w0 = (Spinner) viewInflate.findViewById(R.id.dialog_terminal_spinner_known_users);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_terminal_user_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_terminal_error_text);
        this.x0 = viewInflate.findViewById(R.id.dialog_terminal_scroll_hint_top);
        this.y0 = viewInflate.findViewById(R.id.dialog_terminal_scroll_hint_bottom);
        this.q0.setListener(this);
        this.r0.addOnLayoutChangeListener(this.I0);
        this.s0.setTextListener(this.H0);
        AdEditText adEditText = this.s0;
        boolean z = this.C0;
        String strN3 = this.A0;
        if (z && TextUtils.isEmpty(strN3)) {
            strN3 = JniAdExt.n1("ad.dlg.terminal.other_user");
        }
        adEditText.l(strN3, false);
        this.s0.setVisibility((this.C0 || !this.z0) ? 0 : 8);
        this.s0.setEnabled(!this.C0 || this.F0 == 0);
        textView.setText(JniAdExt.n1("ad.dlg.terminal.users_logged_on"));
        int i2 = this.B0;
        int i3 = 4;
        if (i2 == 0) {
            textView2.setVisibility(8);
        } else {
            int[] iArrS = q51.s(4);
            int length = iArrS.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i = 0;
                    break;
                }
                i = iArrS[i4];
                if (q51.r(i) == i2) {
                    break;
                }
                i4++;
            }
            int iR = q51.r(i);
            if (iR == 1) {
                strN1 = JniAdExt.n1("ad.dlg.terminal.error.user_invalid");
            } else if (iR != 2) {
                strN1 = iR != 3 ? "" : JniAdExt.n1("ad.dlg.terminal.error.user_logged_off");
            } else {
                strN1 = JniAdExt.n1("ad.dlg.terminal.error.user_ambiguous");
            }
            textView2.setText(String.format(JniAdExt.n1("ad.dlg.terminal.error.text"), strN1));
            textView2.setVisibility(0);
        }
        if (this.C0) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(a0(), R.layout.dialog_simple_spinner_text, this.D0);
            this.E0 = arrayAdapter;
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            this.w0.setAdapter((SpinnerAdapter) this.E0);
            this.w0.setSelection(this.F0);
            this.w0.setOnItemSelectedListener(new f3(i3, this));
        } else {
            this.u0.setText(JniAdExt.n1("ad.dlg.terminal.console"));
            this.u0.setChecked(this.z0);
            this.v0.setText(JniAdExt.n1("ad.dlg.terminal.user"));
            this.v0.setChecked(!this.z0);
            this.u0.setOnClickListener(new g91(this, 0));
            this.v0.setOnClickListener(new g91(this, 1));
        }
        this.t0.setVisibility(this.C0 ? 8 : 0);
        this.w0.setVisibility(this.C0 ? 0 : 8);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new h91(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new h91(this, 1));
        w7 w7VarA = v7Var.a();
        R0(w7VarA);
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    public final void T0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.x0, scrollY < this.G0 ? 4 : 0);
        r3.I(this.y0, bottom < this.G0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.V1();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.z0 = bundle.getBoolean("skey_term_connect_to_console", true);
        String string = bundle.getString("skey_term_user");
        this.A0 = string;
        if (string == null) {
            this.A0 = "";
        }
        this.B0 = bundle.getInt("skey_term_error", 0);
        this.D0 = bundle.getStringArrayList("skey_term_loggedin_users_names");
        this.C0 = bundle.getBoolean("skey_term_list_loggedin_users");
        this.F0 = bundle.getInt("skey_adapter_pos");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.q0.setListener(null);
        this.r0.removeOnLayoutChangeListener(this.I0);
        this.s0.b();
        this.u0.setOnClickListener(null);
        this.v0.setOnClickListener(null);
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_term_connect_to_console", this.u0.isChecked());
        String text = this.s0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_term_user", text);
        bundle.putInt("skey_term_error", this.B0);
        bundle.putStringArrayList("skey_term_loggedin_users_names", this.D0);
        bundle.putBoolean("skey_term_list_loggedin_users", this.C0);
        bundle.putInt("skey_adapter_pos", this.F0);
    }
}
