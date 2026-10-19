package defpackage;

import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xj implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ xj(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((bs) obj).size();
            default:
                Bitmap bitmap = JniAdExt.a;
                return ((Long) obj).longValue();
        }
    }
}
