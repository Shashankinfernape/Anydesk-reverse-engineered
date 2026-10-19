package com.anydesk.anydeskandroid.gui.fragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.ah;
import defpackage.bf1;
import defpackage.e40;
import defpackage.e81;
import defpackage.er0;
import defpackage.fm;
import defpackage.i4;
import defpackage.id;
import defpackage.jf;
import defpackage.nh0;
import defpackage.nx0;
import defpackage.q51;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;
import defpackage.um0;
import defpackage.w30;
import defpackage.xt0;
import defpackage.y90;
import defpackage.yw0;
import defpackage.z6;
import defpackage.ze1;
import java.io.File;
import java.util.Locale;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class SupportFragment extends z6 implements View.OnClickListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener, TextWatcher {
    public e81 c0;
    public EditText d0;
    public Button e0;
    public Button f0;
    public Button g0;
    public final Logging b0 = new Logging("SupportFragment");
    public final w30 h0 = (w30) F0(new xt0(17, this), new i4(1));

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        bf1 bf1VarK = K();
        ze1 ze1VarB0 = b0();
        um0 um0VarT = t();
        ze1VarB0.getClass();
        ah ahVar = new ah(bf1VarK, ze1VarB0, um0VarT);
        fm fmVarA = nx0.a(e81.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.c0 = (e81) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        this.d0 = (EditText) view.findViewById(R.id.support_message);
        this.e0 = (Button) view.findViewById(R.id.support_date);
        this.f0 = (Button) view.findViewById(R.id.support_time);
        this.g0 = (Button) view.findViewById(R.id.support_button_send);
        TextView textView = (TextView) view.findViewById(R.id.support_time_title);
        TextView textView2 = (TextView) view.findViewById(R.id.support_message_title);
        G0().setTitle(JniAdExt.c ? JniAdExt.n1("ad.about.support.title") : "Unexpected Error");
        textView.setText((JniAdExt.c ? JniAdExt.n1("ad.about.support.time.title") : "Please provide the date and exact time when the error occurred").concat(":"));
        textView2.setText((JniAdExt.c ? JniAdExt.n1("ad.about.support.message.title") : "Please describe the error").concat(":"));
        this.d0.setText(this.c0.j());
        Button button = this.e0;
        if (button != null) {
            button.setText(this.c0.f());
        }
        Button button2 = this.f0;
        if (button2 != null) {
            button2.setText(this.c0.l());
        }
        this.d0.addTextChangedListener(this);
        boolean z = JniAdExt.c;
        Button button3 = this.e0;
        if (z) {
            button3.setOnClickListener(this);
            this.f0.setOnClickListener(this);
        } else {
            button3.setEnabled(false);
            this.f0.setEnabled(false);
            this.d0.requestFocus();
        }
        this.g0.setText(JniAdExt.c ? JniAdExt.n1("ad.about.support.send_email") : "Send Email");
        this.g0.setOnClickListener(this);
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final Intent R0(Intent intent, String str) {
        Stack stack = new Stack();
        for (ResolveInfo resolveInfo : t70.W(I0().getPackageManager(), new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "info@domain.com", null)))) {
            Intent intent2 = new Intent(intent);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            stack.add(intent2);
        }
        if (stack.isEmpty()) {
            return Intent.createChooser(intent, str);
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) stack.remove(0), str);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) stack.toArray(new Parcelable[0]));
        return intentCreateChooser;
    }

    public final void S0() {
        int i;
        Context contextA0 = a0();
        e81 e81Var = this.c0;
        synchronized (e81Var) {
            i = e81Var.c.get(11);
        }
        new TimePickerDialog(contextA0, this, i, this.c0.h(), true).show();
    }

    public final void T0() {
        boolean z;
        String strJ = this.c0.j();
        if (strJ.length() < 5) {
            t70.g0(a0(), JniAdExt.c ? JniAdExt.n1("ad.about.support.send_email.provide_description.msg") : "Please describe the error", 1);
            return;
        }
        e81 e81Var = this.c0;
        synchronized (e81Var) {
            z = e81Var.e && e81Var.f;
        }
        if (!z) {
            t70.g0(a0(), JniAdExt.c ? JniAdExt.n1("ad.about.support.send_email.provide_datetime.msg") : "Please provide the date and exact time", 1);
            return;
        }
        Point pointA = er0.a();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        StringBuilder sb = new StringBuilder();
        sb.append(strJ);
        sb.append("\r\n\r\nError Timestamp: ");
        sb.append(this.c0.k());
        sb.append("\r\nEmail Timestamp: ");
        sb.append(this.c0.e());
        sb.append("\r\n\r\nAnyDesk\r\n=======\r\nVersion: ");
        Locale locale = Locale.US;
        sb.append(JniAdExt.c3() + "." + JniAdExt.d3() + "." + JniAdExt.a3());
        sb.append("\r\nCommit: ");
        sb.append(JniAdExt.b3());
        sb.append("\r\n");
        if (JniAdExt.c) {
            sb.append("ID: ");
            sb.append(t70.g(JniAdExt.D2()));
            sb.append("\r\nAlias: ");
            sb.append(JniAdExt.C2());
            sb.append("\r\n");
        }
        sb.append("\r\nAndroid\r\n=======\r\nRelease: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\r\nSDK: ");
        sb.append(Build.VERSION.SDK_INT);
        yw0 yw0Var = MainApplication.v().U;
        if (yw0Var != null) {
            sb.append("\r\nKNOX: ");
            sb.append(yw0Var.a);
        }
        sb.append("\r\nLanguage: ");
        sb.append(jf.h(f0()));
        sb.append("\r\nRTL: ");
        sb.append(f0().getBoolean(R.bool.is_rtl));
        sb.append("\r\n\r\nHardware\r\n========\r\nBoard: ");
        sb.append(Build.BOARD);
        sb.append("\r\nBrand: ");
        sb.append(Build.BRAND);
        sb.append("\r\nDevice: ");
        sb.append(Build.DEVICE);
        sb.append("\r\nDisplay: ");
        sb.append(Build.DISPLAY);
        sb.append("\r\nHardware: ");
        sb.append(Build.HARDWARE);
        sb.append("\r\nManufacturer: ");
        sb.append(Build.MANUFACTURER);
        sb.append("\r\nModel: ");
        sb.append(Build.MODEL);
        sb.append("\r\nProduct: ");
        sb.append(Build.PRODUCT);
        sb.append("\r\n32bit ABIs: ");
        sb.append(t70.B());
        sb.append("\r\n64bit ABIs: ");
        sb.append(t70.C());
        sb.append("\r\n\r\nVideo\r\n=====\r\nGLES version: ");
        Context contextI0 = I0();
        sb.append(t70.q(contextI0));
        sb.append("\r\nWidth: ");
        sb.append(pointA.x);
        sb.append("\r\nHeight: ");
        sb.append(pointA.y);
        sb.append("\r\nDPI: ");
        sb.append(er0.b());
        sb.append("\r\nxDPI: ");
        sb.append(er0.c());
        sb.append("\r\nyDPI: ");
        sb.append(er0.d());
        sb.append("\r\nAndroid DPI: ");
        sb.append(displayMetrics.densityDpi);
        sb.append("\r\nAndroid xDPI: ");
        sb.append(displayMetrics.xdpi);
        sb.append("\r\nAndroid yDPI: ");
        sb.append(displayMetrics.ydpi);
        sb.append("\r\n");
        String string = sb.toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"reports@anydesk.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "[AnyDesk Android] bug report");
        intent.putExtra("android.intent.extra.TEXT", string);
        try {
            MainApplication.q(contextI0);
            String strW2 = JniAdExt.w2();
            if (strW2 != null) {
                File file = new File(strW2);
                File file2 = new File(MainApplication.y(contextI0), file.getName());
                if (file2.exists()) {
                    file2.delete();
                }
                if (t70.i(file, file2, this.b0)) {
                    Uri uriD = t70.D(contextI0, file2);
                    intent.setClipData(ClipData.newRawUri("", uriD));
                    intent.putExtra("android.intent.extra.STREAM", uriD);
                    intent.setFlags(1);
                } else {
                    this.b0.a("failed to prepare trace file attachment");
                }
            }
            Intent intentR0 = R0(intent, JniAdExt.c ? JniAdExt.n1("ad.about.support.send_email") : "Send Email");
            e40 e40Var = this.v;
            if (e40Var != null) {
                e40Var.t.startActivity(intentR0, null);
            } else {
                nh0.j(q51.l("Fragment ", this, " not attached to Activity"));
            }
            uj.x(Y());
        } catch (ActivityNotFoundException unused) {
            t70.g0(contextI0, JniAdExt.c ? JniAdExt.n1("ad.about.support.send_email.no_email_app.msg.android") : "Please install an email app", 1);
        } catch (IllegalArgumentException e) {
            this.b0.e("cannot attach log file: " + e.getMessage());
            t70.g0(contextI0, "cannot attach logfile: " + e.getMessage(), 1);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            e81 e81Var = this.c0;
            String string = editable.toString();
            synchronized (e81Var) {
                e81Var.b = string;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.support_date) {
            Context contextA0 = a0();
            e81 e81Var = this.c0;
            synchronized (e81Var) {
                i = e81Var.c.get(1);
            }
            new DatePickerDialog(contextA0, this, i, this.c0.i(), this.c0.g()).show();
            return;
        }
        if (id == R.id.support_time) {
            S0();
        } else if (id == R.id.support_button_send) {
            if (er0.f() || r3.o(this, this.h0, this.b0)) {
                T0();
            }
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        e81 e81Var = this.c0;
        synchronized (e81Var) {
            e81Var.c.set(i, i2, i3);
            e81Var.e = true;
        }
        Button button = this.e0;
        if (button != null) {
            button.setText(this.c0.f());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        e81 e81Var = this.c0;
        synchronized (e81Var) {
            e81Var.c.set(11, i);
            e81Var.c.set(12, i2);
            e81Var.f = true;
        }
        Button button = this.f0;
        if (button != null) {
            button.setText(this.c0.l());
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_support, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.d0 = null;
        Button button = this.e0;
        if (button != null) {
            button.setOnClickListener(null);
            this.e0 = null;
        }
        Button button2 = this.f0;
        if (button2 != null) {
            button2.setOnClickListener(null);
            this.f0 = null;
        }
        Button button3 = this.g0;
        if (button3 != null) {
            button3.setOnClickListener(null);
            this.g0 = null;
        }
    }
}
