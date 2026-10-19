package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.r3;
import defpackage.t70;
import defpackage.y1;
import defpackage.z1;
import defpackage.z6;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AboutFragment extends z6 {
    public TextView b0;
    public Button c0;
    public Button d0;
    public final y1 e0 = new y1(this);

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.z1(this.e0);
        R0();
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.X3(this.e0);
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.about_version_title);
        TextView textView2 = (TextView) view.findViewById(R.id.about_version);
        TextView textView3 = (TextView) view.findViewById(R.id.about_version_commit);
        TextView textView4 = (TextView) view.findViewById(R.id.about_anydesk_id);
        Button button = (Button) view.findViewById(R.id.about_support);
        TextView textView5 = (TextView) view.findViewById(R.id.about_copyright);
        TextView textView6 = (TextView) view.findViewById(R.id.about_message);
        TextView textView7 = (TextView) view.findViewById(R.id.about_third_party_components);
        ((TextView) view.findViewById(R.id.about_names)).setText(JniAdExt.K2());
        this.b0 = (TextView) view.findViewById(R.id.about_license);
        this.c0 = (Button) view.findViewById(R.id.about_license_remove);
        this.d0 = (Button) view.findViewById(R.id.about_log_open);
        int i = 0;
        ((TextView) view.findViewById(R.id.about_icp_number)).setVisibility(JniAdExt.C3() ? 0 : 8);
        textView.setText(JniAdExt.n1("ad.about.ver.title"));
        Locale locale = Locale.US;
        textView2.setText(JniAdExt.n1("ad.about.ver.prog") + " " + JniAdExt.c3() + "." + JniAdExt.d3() + "." + JniAdExt.a3());
        String strN1 = JniAdExt.n1("ad.about.ver.commit");
        String strB3 = JniAdExt.b3();
        StringBuilder sb = new StringBuilder();
        sb.append(strN1);
        sb.append(" ");
        sb.append(strB3);
        textView3.setText(sb.toString());
        textView4.setText(JniAdExt.n1("ad.sys_info.anydesk_id") + ": " + t70.g(JniAdExt.D2()));
        this.d0.setText(JniAdExt.n1("ad.about.support.log_file"));
        button.setText(JniAdExt.n1("ad.about.support.send"));
        this.c0.setText(JniAdExt.n1("ad.dlg.key.remove.title"));
        textView5.setText(String.format(JniAdExt.n1("ad.about.ver.copyright"), new SimpleDateFormat("yyyy").format(JniAdExt.e3())));
        textView6.setText(JniAdExt.n1("ad.about.ver.message"));
        textView7.setText(t70.F("<u>" + JniAdExt.n1("ad.about.ver.components") + "</u>"));
        Button button2 = this.d0;
        final int i2 = R.id.traceFragment;
        button2.setOnClickListener(new View.OnClickListener() { // from class: mo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                view2.getClass();
                lk0.o(view2).c(i2, null);
            }
        });
        final int i3 = R.id.supportFragment;
        button.setOnClickListener(new View.OnClickListener() { // from class: mo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                view2.getClass();
                lk0.o(view2).c(i3, null);
            }
        });
        final int i4 = R.id.aboutFossFragment;
        textView7.setOnClickListener(new View.OnClickListener() { // from class: mo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                view2.getClass();
                lk0.o(view2).c(i4, null);
            }
        });
        this.c0.setOnClickListener(new z1(i));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final void R0() {
        TextView textView = this.b0;
        Locale locale = Locale.US;
        r3.F(textView, JniAdExt.n1("ad.about.ver.license") + " " + JniAdExt.u2());
        boolean z = !JniAdExt.q3() && JniAdExt.N1();
        r3.I(this.c0, z ? 0 : 8);
        TextView textView2 = this.b0;
        if (z) {
            if (textView2 != null) {
                textView2.setNextFocusDownId(R.id.about_license_remove);
            }
            TextView textView3 = this.b0;
            if (textView3 != null) {
                textView3.setNextFocusForwardId(R.id.about_license_remove);
            }
            Button button = this.d0;
            if (button != null) {
                button.setNextFocusUpId(R.id.about_license_remove);
                return;
            }
            return;
        }
        if (textView2 != null) {
            textView2.setNextFocusDownId(R.id.about_log_open);
        }
        TextView textView4 = this.b0;
        if (textView4 != null) {
            textView4.setNextFocusForwardId(R.id.about_log_open);
        }
        Button button2 = this.d0;
        if (button2 != null) {
            button2.setNextFocusUpId(R.id.about_license);
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        G0().setTitle(JniAdExt.n1("ad.about.title"));
        return layoutInflater.inflate(R.layout.fragment_about, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
    }
}
