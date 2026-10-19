package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;

/* JADX INFO: loaded from: classes.dex */
public final class v31 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v31(Object obj, int i, Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a41 a41Var;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                bc bcVar = ((SetupFragment) obj2).d0;
                if (bcVar != null && (a41Var = (a41) obj) != null) {
                    bcVar.p0(z31.V0(a41Var, 0), "SetupInfoDialog", true);
                    break;
                }
                break;
            default:
                int[] iArr = new int[2];
                hf1 hf1Var = (hf1) obj2;
                View view = hf1Var.y;
                view.getLocationInWindow(iArr);
                int i2 = iArr[0];
                hf1Var.e = new Rect(i2, iArr[1], view.getWidth() + i2, view.getHeight() + iArr[1]);
                if (hf1Var.f == null && view.getWidth() > 0 && view.getHeight() > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    view.draw(new Canvas(bitmapCreateBitmap));
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getContext().getResources(), bitmapCreateBitmap);
                    hf1Var.f = bitmapDrawable;
                    bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), hf1Var.f.getIntrinsicHeight());
                }
                ((bc0) obj).run();
                break;
        }
    }
}
