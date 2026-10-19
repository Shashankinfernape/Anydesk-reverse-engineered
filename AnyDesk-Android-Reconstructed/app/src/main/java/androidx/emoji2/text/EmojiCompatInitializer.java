package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.gf0;
import defpackage.h90;
import defpackage.i30;
import defpackage.if0;
import defpackage.rw;
import defpackage.sw;
import defpackage.y6;
import defpackage.yg;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements h90 {
    @Override // defpackage.h90
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.h90
    public final Object b(Context context) {
        i30 i30Var = new i30(new yg(context));
        i30Var.a = 1;
        if (rw.k == null) {
            synchronized (rw.j) {
                try {
                    if (rw.k == null) {
                        rw.k = new rw(i30Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objN;
        y6 y6VarW = y6.w(context);
        y6VarW.getClass();
        synchronized (y6.i) {
            try {
                objN = ((HashMap) y6VarW.d).get(ProcessLifecycleInitializer.class);
                if (objN == null) {
                    objN = y6VarW.n(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if0 if0VarR = ((gf0) objN).R();
        if0VarR.a(new sw(this, if0VarR));
    }
}
