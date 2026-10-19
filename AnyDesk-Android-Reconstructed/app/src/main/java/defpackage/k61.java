package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.SpeedDialItem;
import com.anydesk.jni.JniAdExt;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k61 extends iw0 {
    public final ArrayList d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final float l;
    public final int m;
    public dj n = null;
    public final String o = JniAdExt.n1("ad.motd.more_info");

    public k61(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, boolean z, int i6, float f, int i7) {
        this.d = arrayList;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = z;
        this.l = f;
        this.m = i7;
        h();
    }

    @Override // defpackage.iw0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.iw0
    public final long b(int i) {
        z60 z60Var = (z60) this.d.get(i);
        int i2 = z60Var.mType;
        if (i2 == 0) {
            return ((SpeedDialItem) z60Var).mCid;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return -((zl0) z60Var).a;
        }
        if (i2 == 4) {
            return ((nu) z60Var).a;
        }
        if (i2 != 5) {
            return 0L;
        }
        return ((RosterItem) z60Var).mId;
    }

    @Override // defpackage.iw0
    public final int c(int i) {
        return ((z60) this.d.get(i)).mType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.widget.TextView] */
    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        String str;
        ?? Concat;
        z60 z60Var = (z60) this.d.get(i);
        int i2 = hx0Var.f;
        if (i2 != z60Var.mType) {
            return;
        }
        int i3 = 8;
        int i4 = 5;
        int i5 = this.m;
        int i6 = 1;
        int i7 = 0;
        br0 br0Var = br0.os_unmonitored;
        int i8 = 4;
        switch (i2) {
            case 0:
                j61 j61Var = (j61) hx0Var;
                ImageView imageView = j61Var.v;
                SpeedDialItem speedDialItem = (SpeedDialItem) z60Var;
                File file = new File(speedDialItem.mThumbnailPath);
                ImageView imageView2 = j61Var.z;
                CardView cardView = j61Var.u;
                ImageView imageView3 = j61Var.y;
                imageView.setBackground(t70.M(speedDialItem.mColor1, speedDialItem.mColor2));
                imageView.setImageResource(i5);
                if (file.exists()) {
                    imageView.setImageURI(Uri.parse(speedDialItem.mThumbnailPath));
                }
                cardView.setOnClickListener(new d61(this, speedDialItem, i7));
                cardView.setOnLongClickListener(new q(this, speedDialItem, i4));
                j61Var.w.setText(speedDialItem.getDisplayName());
                TextView textView = j61Var.x;
                if (textView != null) {
                    textView.setText(speedDialItem.getAltDisplayName());
                }
                if (speedDialItem.mOnlineState == br0Var) {
                    imageView3.setVisibility(4);
                } else {
                    imageView3.setVisibility(0);
                    int iOrdinal = speedDialItem.mOnlineState.ordinal();
                    if (iOrdinal == 1) {
                        imageView3.setImageResource(R.drawable.ic_online_off);
                    } else if (iOrdinal != 2) {
                        imageView3.setImageResource(R.drawable.ic_online_na);
                    } else {
                        imageView3.setImageResource(R.drawable.ic_online_on);
                    }
                }
                if (speedDialItem.mIsFavorite) {
                    imageView2.setImageResource(R.drawable.ic_star_filled);
                } else {
                    imageView2.setImageResource(R.drawable.ic_star);
                }
                imageView2.setOnClickListener(new d61(this, speedDialItem, i6));
                break;
            case 1:
                h61 h61Var = (h61) hx0Var;
                am0 am0Var = (am0) z60Var;
                JniAdExt.d4(am0Var.a, 1);
                h61Var.v.setBackground(t70.M(am0Var.mColor1, am0Var.mColor2));
                TextView textView2 = h61Var.w;
                textView2.setText(am0Var.k);
                TextView textView3 = h61Var.x;
                textView3.setText(am0Var.l);
                textView2.setTextColor(am0Var.m);
                textView3.setTextColor(am0Var.n);
                r3.I(h61Var.y, 8);
                CardView cardView2 = h61Var.u;
                bu0.D(cardView2, am0Var.g);
                cardView2.setOnClickListener(new p(this, 15, am0Var));
                cardView2.setOnLongClickListener(new q(this, am0Var, 6));
                break;
            case 2:
                g61 g61Var = (g61) hx0Var;
                ImageView imageView4 = g61Var.v;
                yl0 yl0Var = (yl0) z60Var;
                JniAdExt.d4(yl0Var.a, 1);
                CardView cardView3 = g61Var.u;
                Bitmap bitmap = yl0Var.k;
                imageView4.setImageBitmap(bitmap);
                if (i(bitmap)) {
                    imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                bu0.D(cardView3, yl0Var.g);
                cardView3.setOnClickListener(new p(this, 16, yl0Var));
                cardView3.setOnLongClickListener(new q(this, yl0Var, 7));
                TextView textView4 = g61Var.w;
                if (textView4 != null) {
                    textView4.setText(this.o);
                }
                break;
            case 3:
                f61 f61Var = (f61) hx0Var;
                ImageView imageView5 = f61Var.v;
                wl0 wl0Var = (wl0) z60Var;
                JniAdExt.d4(wl0Var.a, 1);
                CardView cardView4 = f61Var.u;
                Bitmap bitmap2 = wl0Var.k;
                imageView5.setImageBitmap(bitmap2);
                TextView textView5 = f61Var.w;
                textView5.setText(wl0Var.l);
                TextView textView6 = f61Var.x;
                textView6.setText(wl0Var.m);
                if (this.k) {
                    textView5.setTextColor(wl0Var.n);
                    textView6.setTextColor(wl0Var.o);
                } else {
                    Context context = textView5.getContext();
                    Looper looper = t70.a;
                    int iL = uj.l(context, R.color.colorMotdCombinedTextLine);
                    textView5.setTextColor(iL);
                    textView6.setTextColor(iL);
                }
                if (i(bitmap2)) {
                    imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                bu0.D(cardView4, wl0Var.g);
                cardView4.setOnClickListener(new p(this, 17, wl0Var));
                cardView4.setOnLongClickListener(new q(this, wl0Var, i3));
                break;
            case 4:
                e61 e61Var = (e61) hx0Var;
                nu nuVar = (nu) z60Var;
                ?? r3 = nuVar.c;
                ?? r4 = nuVar.d;
                String str2 = nuVar.e;
                switch (q51.r(nuVar.b)) {
                    case 1:
                        str = "Windows";
                        break;
                    case 2:
                        str = "Linux";
                        break;
                    case 3:
                        str = "FreeBSD";
                        break;
                    case 4:
                        str = "macOS";
                        break;
                    case 5:
                        str = "iOS";
                        break;
                    case 6:
                        str = "Android";
                        break;
                    case 7:
                        str = "tvOS";
                        break;
                    default:
                        str = null;
                        break;
                }
                String strF = t70.f(nuVar.a);
                if (str2 == null || str2.isEmpty()) {
                    str2 = strF;
                }
                br0 br0Var2 = nuVar.g;
                ImageView imageView6 = e61Var.D;
                if (br0Var2 == br0Var) {
                    imageView6.setVisibility(4);
                } else {
                    imageView6.setVisibility(0);
                    int iOrdinal2 = nuVar.g.ordinal();
                    if (iOrdinal2 == 1) {
                        imageView6.setImageResource(R.drawable.ic_online_off);
                    } else if (iOrdinal2 != 2) {
                        imageView6.setImageResource(R.drawable.ic_online_na);
                    } else {
                        imageView6.setImageResource(R.drawable.ic_online_on);
                    }
                }
                View view = e61Var.v;
                CardView cardView5 = e61Var.u;
                ?? r9 = e61Var.z;
                TextView textView7 = e61Var.y;
                ?? r11 = e61Var.x;
                view.setBackground(t70.M(nuVar.mColor1, nuVar.mColor2));
                e61Var.w.setImageBitmap(nuVar.f);
                String str3 = "";
                ?? r7 = str3;
                if (r11 == 0 || textView7 == null) {
                    if (r4 == 0 || r4.equals(r3)) {
                        r9.setText("");
                    } else {
                        r9.setText(r4);
                    }
                    e61Var.A.setText(r3);
                    e61Var.B.setText(str);
                    e61Var.C.setText(str2);
                } else {
                    if (r4 != 0 && !r4.isEmpty()) {
                        r7 = str3;
                        r7 = r4;
                    }
                    r7 = str3;
                    ?? Concat2 = r7;
                    if (!r3.isEmpty() && !r3.equals(r4)) {
                        if (!r7.isEmpty()) {
                            Concat2 = r7;
                            Concat = r7;
                            Concat = r7.concat(", ");
                        }
                        Concat2 = r7;
                        Concat = r7;
                        Concat2 = Concat.concat(r3);
                    }
                    if (str != null) {
                        Concat2 = Concat2 + " (" + str + ")";
                    }
                    r11.setText(Concat2);
                    textView7.setText(str2);
                }
                cardView5.setOnClickListener(new p(this, 12, nuVar));
                cardView5.setOnLongClickListener(new q(this, nuVar, 3));
                break;
            case 5:
                i61 i61Var = (i61) hx0Var;
                ImageView imageView7 = i61Var.v;
                RosterItem rosterItem = (RosterItem) z60Var;
                File file2 = new File(rosterItem.mThumbnailPath);
                CardView cardView6 = i61Var.u;
                ImageView imageView8 = i61Var.y;
                imageView7.setBackground(t70.M(rosterItem.mColor1, rosterItem.mColor2));
                imageView7.setImageResource(i5);
                if (file2.exists()) {
                    imageView7.setImageURI(Uri.parse(rosterItem.mThumbnailPath));
                }
                cardView6.setOnClickListener(new p(this, 13, rosterItem));
                cardView6.setOnLongClickListener(new q(this, rosterItem, i8));
                i61Var.w.setText(rosterItem.getDisplayName());
                TextView textView8 = i61Var.x;
                if (textView8 != null) {
                    textView8.setText(rosterItem.getAltDisplayName());
                }
                if (rosterItem.mOnlineState == br0Var) {
                    imageView8.setVisibility(4);
                } else {
                    imageView8.setVisibility(0);
                    int iOrdinal3 = rosterItem.mOnlineState.ordinal();
                    if (iOrdinal3 == 1) {
                        imageView8.setImageResource(R.drawable.ic_online_off);
                    } else if (iOrdinal3 != 2) {
                        imageView8.setImageResource(R.drawable.ic_online_na);
                    } else {
                        imageView8.setImageResource(R.drawable.ic_online_on);
                    }
                }
                ImageView imageView9 = i61Var.z;
                if (imageView9 != null) {
                    imageView9.setVisibility(4);
                }
                break;
            case 6:
                h61 h61Var2 = (h61) hx0Var;
                we0 we0Var = (we0) z60Var;
                h61Var2.v.setBackground(t70.M(we0Var.mColor1, we0Var.mColor2));
                h61Var2.w.setText(we0Var.a);
                h61Var2.x.setText(we0Var.b);
                TextView textView9 = h61Var2.y;
                String str4 = we0Var.c;
                r3.F(textView9, str4);
                CardView cardView7 = h61Var2.u;
                bu0.D(cardView7, str4);
                cardView7.setOnClickListener(new p(this, 14, we0Var));
                cardView7.setOnLongClickListener(new c61());
                break;
            case 7:
                h61 h61Var3 = (h61) hx0Var;
                f91 f91Var = (f91) z60Var;
                h61Var3.v.setBackground(t70.M(f91Var.mColor1, f91Var.mColor2));
                TextView textView10 = h61Var3.w;
                textView10.setText(JniAdExt.n1("ad.telemetry.consent_title"));
                TextView textView11 = h61Var3.x;
                textView11.setText(JniAdExt.n1("ad.telemetry.consent_text"));
                TextView textView12 = h61Var3.y;
                r3.F(textView12, t70.F("<u>" + JniAdExt.n1("ad.connect.feature.telemetry.settings_link") + "</u>"));
                int iL2 = uj.l(textView10.getContext(), R.color.colorTelemetryText);
                textView10.setTextColor(iL2);
                textView11.setTextColor(iL2);
                r3.G(textView12, iL2);
                CardView cardView8 = h61Var3.u;
                bu0.D(cardView8, JniAdExt.n1("ad.connect.feature.telemetry.settings_link"));
                cardView8.setOnClickListener(new b(26, this));
                cardView8.setOnLongClickListener(new s0(i4, this));
                break;
        }
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int i2 = this.f;
        switch (i) {
            case 0:
                return new j61(LayoutInflater.from(context).inflate(this.e, viewGroup, false));
            case 1:
            case 6:
            case 7:
                return new h61(LayoutInflater.from(context).inflate(i2, viewGroup, false));
            case 2:
                return new g61(LayoutInflater.from(context).inflate(this.g, viewGroup, false));
            case 3:
                return new f61(LayoutInflater.from(context).inflate(this.h, viewGroup, false));
            case 4:
                return new e61(LayoutInflater.from(context).inflate(this.i, viewGroup, false));
            case 5:
                return new i61(LayoutInflater.from(context).inflate(this.j, viewGroup, false));
            default:
                return new h61(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
        }
    }

    public final boolean i(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        float f = this.l;
        if (f == 0.0f) {
            return true;
        }
        float width = (bitmap.getWidth() / bitmap.getHeight()) / f;
        return width > 1.1f || width < 0.9f;
    }
}
