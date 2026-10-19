package defpackage;

import android.graphics.Bitmap;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ oa0(Object obj, int i, boolean z, int i2) {
        this.c = i2;
        this.d = obj;
        this.e = i;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.f;
        int i2 = this.e;
        Object obj = this.d;
        switch (i) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                ((GlowActivity) obj).j(i2, z);
                break;
            default:
                Bitmap bitmap2 = JniAdExt.a;
                e70 e70Var = (e70) ((GlowActivity) obj).f.get(Integer.valueOf(i2));
                if (e70Var != null) {
                    e70Var.setVisibility(z ? 0 : 8);
                }
                break;
        }
    }
}
