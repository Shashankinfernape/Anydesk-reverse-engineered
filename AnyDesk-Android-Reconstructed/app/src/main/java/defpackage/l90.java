package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class l90 extends InputConnectionWrapper {
    public final /* synthetic */ tk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(InputConnection inputConnection, tk tkVar) {
        super(inputConnection, false);
        this.a = tkVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ev evVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            evVar = new ev(14, new n90(inputContentInfo));
        }
        if (this.a.b(evVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
