package defpackage;

import android.graphics.Bitmap;
import com.anydesk.jni.JniAdExt;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dl implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new String[i];
            default:
                Bitmap bitmap = JniAdExt.a;
                return new wc0[i];
        }
    }
}
