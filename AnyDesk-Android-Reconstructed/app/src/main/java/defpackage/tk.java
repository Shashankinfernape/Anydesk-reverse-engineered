package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements nq0, p61, zi, j6 {
    public final /* synthetic */ Object c;

    public /* synthetic */ tk(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.p61
    public boolean a() {
        return GlowActivity.a((GlowActivity) this.c);
    }

    public boolean b(ev evVar, int i, Bundle bundle) {
        kq jqVar;
        View view = (View) this.c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((o90) evVar.d).d();
                Parcelable parcelable = (Parcelable) ((o90) evVar.d).b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        o90 o90Var = (o90) evVar.d;
        ClipData clipData = new ClipData(o90Var.a(), new ClipData.Item(o90Var.c()));
        if (i2 >= 31) {
            jqVar = new jq(clipData, 2);
        } else {
            lq lqVar = new lq();
            lqVar.b = clipData;
            lqVar.c = 2;
            jqVar = lqVar;
        }
        jqVar.d(o90Var.e());
        jqVar.setExtras(bundle);
        return oe1.k(view, jqVar.build()) == null;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        ArrayList<String> stringArrayListExtra;
        x6 x6Var = (x6) this.c;
        i6 i6Var = (i6) obj;
        if (i6Var == null) {
            return;
        }
        Intent intent = i6Var.d;
        if (i6Var.c != -1 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        x6Var.o(stringArrayListExtra.get(0));
    }

    @Override // defpackage.nq0
    public gh1 l(View view, gh1 gh1Var) {
        Drawable drawable = (Drawable) this.c;
        s90 s90VarF = gh1Var.a.f(8);
        view.setBackground(new InsetDrawable(drawable, s90VarF.a, s90VarF.b, s90VarF.c, s90VarF.d));
        return gh1.b;
    }

    @Override // defpackage.zi
    public void onCancel() {
        ((a61) this.c).a();
    }
}
