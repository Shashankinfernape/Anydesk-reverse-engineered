package defpackage;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class n4 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt b;

    public /* synthetic */ n4(yt ytVar, int i) {
        this.a = i;
        this.b = ytVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        String str;
        Object selectedItem;
        int i = this.a;
        boolean z = true;
        yt ytVar = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                o4 o4Var = (o4) ytVar;
                w7 w7Var = (w7) dialogInterface;
                Button buttonD = w7Var.d(-1);
                o4Var.v0 = buttonD;
                if (buttonD != null) {
                    buttonD.setOnClickListener(new m4(this, i2));
                }
                Button buttonD2 = w7Var.d(-2);
                o4Var.w0 = buttonD2;
                if (buttonD2 != null) {
                    buttonD2.setOnClickListener(new m4(this, z ? 1 : 0));
                }
                o4Var.T0();
                break;
            case 1:
                r4 r4Var = (r4) ytVar;
                w7 w7Var2 = (w7) dialogInterface;
                Button buttonD3 = w7Var2.d(-1);
                r4Var.z0 = buttonD3;
                if (buttonD3 != null) {
                    buttonD3.setOnClickListener(new p4(this, i2));
                }
                if (!r4Var.r0) {
                    Button buttonD4 = w7Var2.d(-2);
                    r4Var.A0 = buttonD4;
                    if (buttonD4 != null) {
                        buttonD4.setOnClickListener(new p4(this, z ? 1 : 0));
                    }
                }
                AdEditText adEditText = r4Var.w0;
                if (adEditText != null) {
                    String text = adEditText.getText();
                    r3.C(r4Var.z0, !TextUtils.isEmpty(text) && t70.J(text.trim().toCharArray(), true));
                }
                break;
            case 2:
                c5 c5Var = (c5) ytVar;
                Button buttonD5 = ((w7) dialogInterface).d(-1);
                c5Var.F0 = buttonD5;
                if (buttonD5 != null) {
                    buttonD5.setOnClickListener(new b(6, this));
                }
                AdEditText adEditText2 = c5Var.C0;
                if (adEditText2 != null) {
                    String text2 = adEditText2.getText();
                    r3.C(c5Var.F0, (c5Var.t0 || text2 == null || text2.trim().isEmpty()) ? false : true);
                }
                break;
            case 3:
                e9 e9Var = (e9) ytVar;
                ProgressBar progressBar = e9Var.y0;
                if (e9Var.t0 > 0 && progressBar != null) {
                    e9Var.u0 = false;
                    e9.S0(e9Var);
                    CountDownTimer countDownTimer = e9Var.z0;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    e9Var.z0 = new c9(this, e9Var.s0, i2).start();
                } else {
                    if (progressBar != null) {
                        progressBar.setProgress(100);
                    }
                    e9Var.u0 = true;
                    e9.S0(e9Var);
                }
                break;
            case 4:
                ((w7) dialogInterface).d(-3).setOnClickListener(new b(12, this));
                break;
            case 5:
                ez ezVar = (ez) ytVar;
                Button buttonD6 = ((w7) dialogInterface).d(-1);
                ezVar.w0 = buttonD6;
                if (buttonD6 != null) {
                    buttonD6.setEnabled(false);
                    ez.T0(ezVar, ezVar.u0.getText());
                }
                break;
            case 6:
                iz izVar = (iz) ytVar;
                w7 w7Var3 = (w7) dialogInterface;
                Button buttonD7 = w7Var3.d(-1);
                izVar.L0 = buttonD7;
                if (buttonD7 != null) {
                    buttonD7.setEnabled(false);
                    AdEditText adEditText3 = izVar.H0;
                    Spinner spinner = izVar.I0;
                    if (adEditText3 != null && spinner != null) {
                        if (adEditText3.getVisibility() == 0) {
                            iz.T0(izVar, adEditText3.getText());
                        } else if (spinner.getVisibility() == 0) {
                            Spinner spinner2 = izVar.I0;
                            iz.U0(izVar, (spinner2 == null || (selectedItem = spinner2.getSelectedItem()) == null) ? null : selectedItem.toString());
                        } else if (izVar.s0 && (str = izVar.v0) != null) {
                            iz.S0(izVar, str);
                        }
                    }
                }
                r3.E(w7Var3.d(-3), new b(15, this));
                break;
            case 7:
                xz xzVar = (xz) ytVar;
                Button buttonD8 = ((w7) dialogInterface).d(-1);
                xzVar.x0 = buttonD8;
                if (buttonD8 != null) {
                    buttonD8.setEnabled(false);
                    xz.T0(xzVar, xzVar.v0.getText());
                }
                break;
            case 8:
                ih0 ih0Var = (ih0) ytVar;
                ih0Var.T0(ih0Var.y0);
                Button buttonD9 = ((w7) dialogInterface).d(-1);
                ih0Var.z0 = buttonD9;
                if (buttonD9 != null) {
                    ih0Var.A0 = false;
                    ih0.S0(ih0Var);
                    CharSequence text3 = buttonD9.getText();
                    CountDownTimer countDownTimer2 = ih0Var.x0;
                    if (countDownTimer2 != null) {
                        countDownTimer2.cancel();
                    }
                    ih0Var.x0 = new fh0(this, ih0Var.s0, buttonD9, text3).start();
                }
                break;
            case 9:
                w7 w7Var4 = (w7) dialogInterface;
                w7Var4.d(-1).setOnClickListener(new uh0(this, i2));
                vh0 vh0Var = (vh0) ytVar;
                Button buttonD10 = w7Var4.d(-3);
                vh0Var.t0 = buttonD10;
                if (buttonD10 != null) {
                    vh0Var.r0 = buttonD10.getText();
                }
                if (vh0Var.q0 != 0) {
                    r3.C(vh0Var.t0, false);
                    CountDownTimer countDownTimer3 = vh0Var.s0;
                    if (countDownTimer3 != null) {
                        countDownTimer3.cancel();
                    }
                    vh0Var.s0 = new c9(vh0Var, vh0Var.q0, z ? 1 : 0).start();
                }
                Button button = vh0Var.t0;
                if (button != null) {
                    button.setOnClickListener(new uh0(this, z ? 1 : 0));
                }
                break;
            case 10:
                ju0 ju0Var = (ju0) ytVar;
                Button buttonD11 = ((w7) dialogInterface).d(-1);
                ju0Var.v0 = buttonD11;
                if (buttonD11 != null) {
                    buttonD11.setEnabled(false);
                    String text4 = ju0Var.t0.getText();
                    TextView textView = ju0Var.u0;
                    Button button2 = ju0Var.v0;
                    String strE3 = JniAdExt.E3(text4);
                    if (textView != null) {
                        textView.setText(strE3);
                    }
                    if (button2 != null) {
                        button2.setEnabled(strE3.isEmpty());
                    }
                }
                break;
            case 11:
                l01 l01Var = (l01) ytVar;
                Button buttonD12 = ((w7) dialogInterface).d(-1);
                if (buttonD12 != null) {
                    buttonD12.setEnabled(false);
                    qa qaVarY = l01Var.Y();
                    if (qaVarY != null) {
                        Looper looper = t70.a;
                        buttonD12.setTextColor(uj.l(qaVarY, R.color.colorScamWarningPositiveButtonDisabled));
                    }
                    CharSequence text5 = buttonD12.getText();
                    CountDownTimer countDownTimer4 = l01Var.u0;
                    if (countDownTimer4 != null) {
                        countDownTimer4.cancel();
                    }
                    l01Var.u0 = new j01(this, l01Var.s0, buttonD12, text5, qaVarY).start();
                }
                break;
            default:
                h21 h21Var = (h21) ytVar;
                h21Var.z0 = ((w7) dialogInterface).d(-1);
                h21.S0(h21Var);
                break;
        }
    }
}
