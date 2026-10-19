package defpackage;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e9 extends yt {
    public ImageView A0;
    public FrameLayout B0;
    public FrameLayout C0;
    public Rect D0;
    public String r0;
    public long s0;
    public long t0;
    public boolean u0;
    public long v0;
    public zl0 w0;
    public View x0;
    public ProgressBar y0;
    public CountDownTimer z0;
    public final Logging q0 = new Logging("AnyMessageDialogFragment");
    public final d9 E0 = new d9(this, 0);
    public final d9 F0 = new d9(this, 1);

    public static void S0(e9 e9Var) {
        ImageView imageView = e9Var.A0;
        FrameLayout frameLayout = e9Var.B0;
        if (imageView == null || frameLayout == null) {
            return;
        }
        if (e9Var.u0) {
            imageView.setVisibility(0);
            frameLayout.setEnabled(true);
        } else {
            imageView.setVisibility(8);
            frameLayout.setEnabled(false);
        }
    }

    public static e9 T0(zl0 zl0Var) {
        JniAdExt.d4(zl0Var.a, 1);
        e9 e9Var = new e9();
        Bundle bundle = new Bundle();
        bundle.putLong("skey_motd_channel_id", zl0Var.a);
        bundle.putLong("skey_motd_timer_remaining_millis", Math.min(40000L, Math.max(0L, ((long) zl0Var.h) * 1000)));
        e9Var.N0(bundle);
        return e9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        Bitmap bitmap;
        boolean z;
        zl0 zl0Var = this.w0;
        int i5 = zl0Var.mType;
        if (i5 == 1) {
            am0 am0Var = (am0) zl0Var;
            String str3 = am0Var.k;
            String str4 = am0Var.l;
            int i6 = am0Var.m;
            int i7 = am0Var.n;
            int i8 = am0Var.mColor1;
            i = am0Var.mColor2;
            i2 = i7;
            str = str4;
            str2 = str3;
            i3 = i8;
            i4 = i6;
            bitmap = null;
        } else if (i5 == 2) {
            str2 = null;
            bitmap = ((yl0) zl0Var).k;
            i2 = 0;
            i = 0;
            i4 = 0;
            i3 = 0;
            str = null;
        } else if (i5 != 3) {
            str2 = null;
            str = null;
            bitmap = null;
            i2 = 0;
            i = 0;
            i4 = 0;
            i3 = 0;
        } else {
            wl0 wl0Var = (wl0) zl0Var;
            String str5 = wl0Var.l;
            String str6 = wl0Var.m;
            Bitmap bitmap2 = wl0Var.k;
            int i9 = wl0Var.n;
            i2 = wl0Var.o;
            i4 = i9;
            i3 = 0;
            bitmap = bitmap2;
            str = str6;
            str2 = str5;
            i = 0;
        }
        String str7 = zl0Var.g;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_anymessage_dialog, (ViewGroup) null);
        this.x0 = viewInflate;
        if (viewInflate != null) {
            this.C0 = (FrameLayout) viewInflate.findViewById(R.id.motd_dialog_frame);
            this.A0 = (ImageView) viewInflate.findViewById(R.id.motd_dialog_close_top_right);
            this.B0 = (FrameLayout) viewInflate.findViewById(R.id.motd_dialog_close_clickable_area);
            this.y0 = (ProgressBar) viewInflate.findViewById(R.id.motd_dialog_progress_bar);
            TextView textView = (TextView) viewInflate.findViewById(R.id.motd_dialog_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.motd_dialog_text);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.motd_dialog_image);
            this.B0.setOnFocusChangeListener(new a9(0, this));
            this.B0.setOnClickListener(new b(10, this));
            if (!str7.isEmpty()) {
                this.C0.setOnClickListener(new p(this, 4, str7));
            }
            textView.setText(str2);
            textView2.setText(str);
            if (bitmap == null) {
                this.C0.setBackground(t70.M(i3, i));
            } else {
                imageView.setImageBitmap(bitmap);
            }
            textView.setTextColor(i4);
            textView2.setTextColor(i2);
            textView.setVisibility(str2.isEmpty() ? 8 : 0);
            textView2.setVisibility(str.isEmpty() ? 8 : 0);
            imageView.setVisibility(bitmap != null ? 0 : 8);
        }
        ((r7) v7Var.d).q = this.x0;
        w7 w7VarA = v7Var.a();
        if (bitmap != null) {
            z = false;
            this.x0.getViewTreeObserver().addOnGlobalLayoutListener(new b9(this, w7VarA, bitmap, 0 == true ? 1 : 0));
        } else {
            z = false;
        }
        w7VarA.setCanceledOnTouchOutside(z);
        w7VarA.setOnShowListener(new n4(this, 3));
        w7VarA.show();
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        ArrayList arrayList;
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getString("skey_motd_CONNECT_ADDR");
        this.v0 = bundle.getLong("skey_motd_channel_id");
        this.s0 = bundle.getLong("skey_motd_timer_remaining_millis");
        long j = this.v0;
        synchronized (JniAdExt.x0) {
            try {
                arrayList = new ArrayList();
                for (zl0 zl0Var : JniAdExt.y0.values()) {
                    if (zl0Var.a == j) {
                        arrayList.add(zl0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            this.q0.e("Failed to get anyMessage from channel " + this.v0);
            O0(false, false);
        }
        zl0 zl0Var2 = (zl0) arrayList.get(0);
        this.w0 = zl0Var2;
        this.t0 = Math.min(40000L, Math.max(0L, ((long) zl0Var2.h) * 1000));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        CountDownTimer countDownTimer = this.z0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.z0 = null;
        }
        this.x0 = null;
        this.y0 = null;
        this.A0 = null;
        FrameLayout frameLayout = this.B0;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(null);
            this.B0.setOnClickListener(null);
            this.B0 = null;
        }
        FrameLayout frameLayout2 = this.C0;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(null);
            this.C0 = null;
        }
        this.w0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putString("skey_motd_CONNECT_ADDR", this.r0);
        bundle.putLong("skey_motd_channel_id", this.v0);
        bundle.putLong("skey_motd_timer_remaining_millis", this.s0);
    }
}
