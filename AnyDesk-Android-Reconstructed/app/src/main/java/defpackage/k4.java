package defpackage;

import android.content.DialogInterface;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class k4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;

    public /* synthetic */ k4(int i) {
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.c) {
            case 0:
                JniAdExt.I0.post(new sc0(2));
                break;
            case 2:
                t70.b0(MainApplication.v().T, "privacy_statement_shown", true);
                JniAdExt.Q3();
                break;
        }
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    private final void b(DialogInterface dialogInterface, int i) {
    }

    private final void c(DialogInterface dialogInterface, int i) {
    }

    private final void d(DialogInterface dialogInterface, int i) {
    }
}
